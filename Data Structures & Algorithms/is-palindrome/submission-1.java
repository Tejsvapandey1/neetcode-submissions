class Solution {
    public boolean isPalindrome(String s) {
        ArrayList<Character> str = new ArrayList<>();

        for(int i = 0; i<s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i) )){
                str.add(Character.toLowerCase(s.charAt(i)));
            }
        }
        int left = 0;
        int right = str.size()-1;
        while(left<right){
            if(str.get(left) != str.get(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
