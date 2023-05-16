class ValidPalindrome {
    public boolean isPalindrome(String s) {

        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        boolean ispalindrome = true;

        for (int i = 0; i < s.length()/2; i++){
            if (s.charAt(i) != s.charAt((s.length() - 1) - i)){
                ispalindrome = false;
            }
        }

        if (ispalindrome == false) return ispalindrome;
        return ispalindrome;
        
    }
}
