import java.util.Scanner;

public class Main {
    public static void main(String[] recipe) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Student kitchen");

        System.out.println("===Available recipes===");
        String[] food = {"1. Fried egg", "2. Fried rice", "3. Instant noodles"};
        System.out.println(food[0]);
        System.out.println(food[1]);
        System.out.println(food[2]);

        String[] friedEgg = {
                "1 egg",
                "1 tbsp oil",
                "Salt",
                "Pepper (optional)"
        };
        String[] friedRice = {
                "1 day old leftover rice",
                "1 egg",
                "1 tbsp oil",
                "Soy sauce",
                "Garlic",
                "Salt",
                "Pepper",
        };
        String[] instantNoodles = {
                "1 pack instant noodles",
                "400 ml water",
                "Seasoning packet",
                "Egg (optional)",
        };

        System.out.print("Choose what you want to eat: ");
        String answer= scanner.nextLine();

        if (answer.equalsIgnoreCase(food[0])){
            System.out.println("Ingredients: ");
            for (String ingredient: friedEgg) {
                System.out.println("- " + ingredient);
            }
        } else if (answer.equalsIgnoreCase(food[1])) {     
            System.out.println("Ingredients: ");
            for (String ingredients : friedRice)
                System.out.println("- " + ingredients);
        } else if (answer.equalsIgnoreCase(food[2])){
            System.out.println("Ingredients: ");
            for (String ingredients : instantNoodles) {
                System.out.println("- " + ingredients);
            }
        }    
    }
}
