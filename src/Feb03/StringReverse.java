package Feb03;

public class StringReverse {
    public static void main(String[] args) {
        String name = "Pragra";
        String reversedName = reverseString(name);
        System.out.println("Original String: " + name);
        System.out.println("Reversed String: " + reversedName);

    }
    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
                        char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }
        return new String(charArray);
    }
}

