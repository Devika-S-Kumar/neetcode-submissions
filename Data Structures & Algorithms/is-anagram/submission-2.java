class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> s1 = new HashMap<>();
        HashMap<Character, Integer> s2 = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            if(s1.get(s.charAt(i)) != null)
            {
                s1.put(s.charAt(i),s1.get(s.charAt(i)) + 1);
            }
            else{
                s1.put(s.charAt(i),1);
            }
            if(s2.get(t.charAt(i)) != null)
            {
                s2.put(t.charAt(i),s2.get(t.charAt(i)) + 1);
            }
            else{
                s2.put(t.charAt(i),1);
            }
        }

        System.out.println(s1);
        System.out.println(s2);

        if(s1.equals(s2))
        {
            return true;
        }
        return false;


    }
}
