import java.util.Scanner;

public class Main {
    public static void main(String[] recipe) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Student kitchen");

String[] recipes = {
                "Fried egg",
                "Fried rice",
                "Instant noodles",
                "Surprise me"
        };

        for (int i = 0; i < recipes.length; i++) {
            System.out.println(recipes[i]);
        }
        int choice = random.nextInt(recipes.length);

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

        if (answer.equalsIgnoreCase("Surprise me")) {
            answer = recipes[random.nextInt(recipes.length - 1)];
            System.out.println("Your surprise recipe is..." );
            System.out.println(answer);
        }
        if (answer.equalsIgnoreCase(recipes[0])){
            System.out.println("Ingredients: ");
            for (String ingredient: friedEgg) {
                System.out.println("- " + ingredient);
            }
        } else if (answer.equalsIgnoreCase(recipes[1])) {
            System.out.println("Ingredients: ");
            for (String ingredients : friedRice)
                System.out.println("- " + ingredients);
        } else if (answer.equalsIgnoreCase(recipes[2])){
            System.out.println("Ingredients: ");
            for (String ingredients : instantNoodles) {
                System.out.println("- " + ingredients);
            }
        } else {
            System.out.println("Oops! That's unavailable!");
        }
    }
}
