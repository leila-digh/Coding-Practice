class Solution {
    public boolean isPalindrome(String s) {
        cleanString(s);
        String notS = reverseString(s);
        
        if(notS.equals(s)){
            return true;
        }
        return false;
    }

    public void cleanString(String s){
        s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }

    public String reverseString(String s){
        String result = "";
         for(int i = s.length()-1; i >= 0; i--){
            result = result + s.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String tests[] = {" ", "civic", "radar", "kayak", "madam", "refer", "tattarrattat", "A man, a plan, a canal: Panama", "race a car", "0"};
        for(int i = 0; i < tests.length; i++){
        
            System.out.println("\n \"" + tests[i] + "\" -> " + sol.isPalindrome(tests[i]));
        }

  }
}


  
