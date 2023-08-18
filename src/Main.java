import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        ArrayList<String> listB = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the data.");
        for (int i = 0; i < 5; i++) {
            listA.add(i, scanner.next());
        }
        System.out.println(listA);

        System.out.println("Enter the data again.");
        for (int i = 0; i < 5; i++) {
            listB.add(i, scanner.next());
        }
        System.out.println(listB);
        Collections.reverse(listB);

        ArrayList<String> listC = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(i));
        }
        System.out.println("Merged list: " + listC);

        Collections.sort(listC, Comparator.comparingInt(String::length));
        System.out.println("Sorted list: " + listC);
    }
}