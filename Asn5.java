import java.util.ArrayList;

public class Asn5 {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<String>();

        words.add("Apple");
        words.add("Banana");
        words.add("Cherry");
        words.add("Date");

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("String ArrayList:");
        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i));
        }

        System.out.println();

        System.out.println("Integer ArrayList:");
        for (Integer num : numbers) {
            System.out.println(num);
        }

        System.out.println();

    }
}