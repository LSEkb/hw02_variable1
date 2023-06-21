public class ExamTicket2addTask {
    public static void main(String[] args) {
        // task
        String str1 = "fhjpfegfkfyfkfgefpjhf";
        String str2 = "fehpbr";
        System.out.println(isPalindrome(str1));
        System.out.println(isPalindrome(str2));
    }

    public static boolean isPalindrome(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
