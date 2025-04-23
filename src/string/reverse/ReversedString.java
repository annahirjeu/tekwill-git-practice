package string.reverse;

public class ReversedString {


    //123ello world

    // ""+1+ 2+ "dsds"
    String reverseAString(String stringToReverse) {
        String reversedString = "";
        char[] chars = new char[11];
        char[] reversedChars = new char[chars.length];
        stringToReverse.getChars(0, 10, chars, 0);
        for (int i = chars.length - 1, j = 0; i >= 0; i--, j++) {
            reversedChars[j] = chars[i];
        }
        reversedString = new String(reversedChars);

/*        for (int i = stringToReverse.length() - 1; i >= 0; i--) {
            reversedString += stringToReverse.charAt(i);
        }*/

        return reversedString;
    }

    public static void main(String[] args) {
//        ReversedString reversedString = new ReversedString();
//        String result = reversedString.reverseAString("Hello world");
//        System.out.println(result);

        StringBuilder initialString = new StringBuilder("Hello world");
        StringBuilder reversedString1 = initialString.reverse();
        reversedString1.append("231321111111111111111133100");
        System.out.println(initialString);

        System.out.println(initialString.hashCode());
        System.out.println(reversedString1.hashCode());

    }
}
