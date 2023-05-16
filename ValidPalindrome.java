class ValidPalindrome {
    public boolean isPalindrome(String s) {
        
        String reverse = "";
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();

        char [] characters = s.toCharArray();

        for (char c: characters){
            reverse = c + "" + reverse;
        }

        System.out.println(reverse);

        if (!reverse.equals(s)) return false;
        return true;
        
    }
}
