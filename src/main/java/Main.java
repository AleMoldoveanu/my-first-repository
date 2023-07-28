import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        //Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
        //helloName("Bob") -> Hello Bob!
        System.out.println(JavaStringExercises.helloName("Bob"));
        //Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string,
        // e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.
        System.out.println(JavaStringExercises.makeOutWord("<<>>", "WooHoo"));
        //Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
        System.out.println(JavaStringExercises.firstHalf("HelloThere"));
        //Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.
        System.out.println(JavaStringExercises.nonStart("Hello", "There"));
        //Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty.
        System.out.println(JavaStringExercises.theEnd("hello", true));
        //Given a string, return true if it ends in "ly".
        System.out.println(JavaStringExercises.endsLy("strongly"));
        //Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.
        System.out.println(JavaStringExercises.middleThree("hello"));
        //Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya".
        // If either string is length 0, use '@' for its missing char.
        System.out.println(JavaStringExercises.lastChars("hello", "there"));
        //Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.
        System.out.println(JavaStringExercises.seeColor("red"));
        //Given a string and a second "word" string, we'll say that the word matches the string if it appears at the front of the string, except its first char does not need to match exactly.
        // On a match, return the front of the string, or otherwise return the empty string.
        // So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.
        System.out.println(JavaStringExercises.startWord("hippo", "hi"));
        //Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
        System.out.println(JavaStringExercises.makeAbba("Hello", "There"));
        //Given a string, return a new string made of 3 copies of the first 2 chars of the original string.
        // The string may be any length. If there are fewer than 2 chars, use whatever is there.
        System.out.println(JavaStringExercises.extraFront("blable"));
        //Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.
        System.out.println(JavaStringExercises.extraEnd("Wheels"));
        //Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.
        System.out.println(JavaStringExercises.withoutEnd("MonteCarlo"));
        //Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2.
        System.out.println(JavaStringExercises.left2("banana"));
        //Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.
        System.out.println(JavaStringExercises.nTwice("hello", 2));
        //Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx".
        // The string may be any length, including 0. Note: use .equals() to compare 2 strings.
        System.out.println(JavaStringExercises.hasBad("xxbadxx"));
        //Given two strings, append them together (known as "concatenation") and return the result.
        // However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".
        System.out.println(JavaStringExercises.conCat("abc", "cat"));
        //Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.
        System.out.println(JavaStringExercises.withouEnd2("abc"));
        //Given a string, return the string made of its first two chars, so the String "Hello" yields "He".
        // If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "".
        // Note that str.length() returns the length of a string.
        System.out.println(JavaStringExercises.firstTwo("George"));
        //The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text.
        // In this example, the "i" tag makes <i> and </i> which surround the word "Yay".
        // Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".
        System.out.println(JavaStringExercises.makeTags("b","Bold"));
        //Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".
        System.out.println(JavaStringExercises.frontAgain("e"));
        //Given a string, if a length 2 substring appears at both its beginning and end, return a string without the substring at the beginning, so "HelloHe" yields "lloHe".
        // The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.
        System.out.println(JavaStringExercises.without2("HelloHe"));
        //Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.
        System.out.println(JavaStringExercises.withoutX("xHix"));
        //Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside.
        // The strings will not be the same length, but they may be empty (length 0).
        System.out.println(JavaStringExercises.comboString("Salut","prietene"));
        //Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2.
        System.out.println(JavaStringExercises.right2("Bliaka"));
        //Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2.
        System.out.println(JavaStringExercises.middleTwo("Adidas"));
        //Given a string and an index, return a string length 2 starting at the given index.
        // If the index is too big or too small to define a string length 2, use the first 2 chars. The string length will be at least 2.
        System.out.println(JavaStringExercises.twoChar("change", 4));
        //Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars.
        System.out.println(JavaStringExercises.atFirst("hello"));
        //Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".
        System.out.println(JavaStringExercises.lastTwo("Keyboard"));
        //Given two strings, append them together (known as "concatenation") and return the result.
        // However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string.
        // So "Hello" and "Hi" yield "loHi". The strings may be any length.
        System.out.println(JavaStringExercises.minCat("hello", "java"));
        //Given a string, return a version without the first 2 chars.
        // Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.
        System.out.println(JavaStringExercises.deFront("away"));

    }
}
