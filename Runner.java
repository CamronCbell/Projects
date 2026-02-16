import java.util.Scanner;

public class Runner {

    public static void main(String[] args) 
    {
        Pet myPet1 = new Pet();
        System.out.println(myPet1);

        Pet myPet2 = new Pet("Cat", "Sakura", 4);
        System.out.println(myPet2);

        Scanner input = new Scanner(System.in);

        System.out.println("Enter animal type:");
        String type = input.nextLine();

        System.out.println("Enter animal name:");
        String name = input.nextLine();

        System.out.println("Enter animal age:");
        int age = input.nextInt();

        Pet myPet3 = new Pet(type, name, age);

        System.out.println();
        System.out.println(myPet3);

        input.close();
    }
}

