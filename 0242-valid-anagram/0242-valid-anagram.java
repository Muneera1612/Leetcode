class Solution {
    public boolean isAnagram(String s, String t) {
        boolean is_agrm=true;
        if(s.length()!=t.length()){
            return false;
        }
        else { 
            char[] a1 = s.toCharArray();
            char[] a2 = t.toCharArray();
            Arrays.sort(a1);
            Arrays.sort(a2);
            for (int i = 0; i < a1.length; i++) {
                if (a1[i] != a2[i]) {
                    is_agrm = false;
                    break;
                }
            }
            if(is_agrm){
                return true;
            }
            else{
                return false;
            }
        }
    }
}