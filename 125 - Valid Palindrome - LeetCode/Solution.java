class Solution {
    public boolean isPalindrome(String s) {
        String sCleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String sBack = "";
        for(int i = sCleaned.length()-1; i >= 0; i--){
            sBack = sBack + sCleaned.charAt(i);
        }
        // System.out.println(sBack);
        // System.out.println(sCleaned);

        if(sBack.equals(sCleaned)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String tests[] = {" ", "civic", "radar", "kayak", "madam", "refer", "tattarrattat", "A man, a plan, a canal: Panama", "race a car", "0"};
        for(int i = 0; i < tests.length; i++){
        
            System.out.println("\n \"" + tests[i] + "\" -> " + sol.isPalindrome(tests[i]));
        }

  }
}


  
