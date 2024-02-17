package Collection1;

import java.util.Arrays;

public class Lexicography_1 {
public static void main(String[] args) {
    String[] names = {"prathm", "suraj", "atul", "sheela", "munni", "chameli"};

    // Sorting words within each name
    for (int i = 0; i < names.length; i++) {
        char[] chars = names[i].toCharArray();
        Arrays.sort(chars);
        names[i] = new String(chars);
    }

    // Sorting the array of names:- Arrays.sort(names);
    // Displaying the sorted array
    System.out.println("Sorted Names with Words in Sequential Order:");
    for (String name : names) {
        System.out.println(name);
    }
}
}
