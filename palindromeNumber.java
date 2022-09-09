public class palindromeNumber {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        for (int a = 0, b = s.length()-1; a < b; a++, b--){
            if (s.charAt(a) != s.charAt(b)) return false;
        }
        return true;
    }
}
