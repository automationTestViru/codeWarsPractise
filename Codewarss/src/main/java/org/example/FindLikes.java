package org.example;
import static org.testng.AssertJUnit.assertEquals;
public class FindLikes {
    public static void main(String[] args) {
        assertEquals("no one likes this", whoLikesIt());
        assertEquals("Peter likes this", whoLikesIt("Peter"));
        assertEquals("Jacob and Alex like this", whoLikesIt("Jacob", "Alex"));
        assertEquals("Max, John and Mark like this", whoLikesIt("Max", "John", "Mark"));
        assertEquals("Alex, Jacob and 2 others like this", whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }

    public static String whoLikesIt(String... names) {
        //Do your magic here
        //TODO Find a usage of .length and .size() in java. When its used for whom its used and at what point we should use any one of these.
        int likesSize = names.length;
        switch (likesSize) {
            case 0:
                return "no one likes this";
            case 1:
                return names[0] + " likes this";
            case 2:
                return names[0] + " and " + names[1] + " like this";
            case 3:
                return names[0] + ", " + names[1] + " and " + names[2] + " like this";
            default:
                return names[0] + ", " + names[1] + " and " + String.valueOf(likesSize - 2) + " others like this";

        }
    }
}
