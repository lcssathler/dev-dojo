package maratonajava.javacore.Qstrings.test;

public class StringTest02 {
    public static void main(String[] args) {
        String name = "      Lucas Sathler     ";
        int[] nums = {1, 2, 3};

        System.out.println(name.charAt(2));
        System.out.println(name.length());
        System.out.println(nums.length);
        System.out.println(name.replace("a", "o"));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.substring(1, 4));
        System.out.println(name.trim());

    }
}
