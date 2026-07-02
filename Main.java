import java.util.Scanner;

public class Main {
    public static void main(String[] recipe) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Student kitchen");

        System.out.println("===Available recipes===");
        String[] food = {"Fried egg", "Fried rice", "Instant noodles"};
        System.out.println(food[0]);
        System.out.println(food[1]);
        System.out.println(food[2]);

        System.out.print("Choose what you want to eat: ");
        String answer= scanner.nextLine();

        if (answer.equalsIgnoreCase(food[0])) {
            System.out.println("Ingredients: ");
            System.out.println("1 egg");
            System.out.println("1 tbsp oil");
            System.out.println("Salt");
            System.out.println("Pepper (optional)");
        } else if (answer.equalsIgnoreCase(food[1])) {
            System.out.println("Ingredients: ");
            System.out.println("1 day old leftover rice");
            System.out.println("1 egg");
            System.out.println("1 tbsp oil");
            System.out.println("Soy sauce");
            System.out.println("Garlic");
            System.out.println("Salt");
            System.out.println("Pepper");
        } else if (answer.equalsIgnoreCase(food[2])){
            System.out.println("Ingredients: ");
            System.out.println("1 pack instant noodles");
            System.out.println("400 ml water");
            System.out.println("Seasoning packet");
            System.out.println("Egg (optional)");
        }
    }
}