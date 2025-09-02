import java.util.Random;
import java.util.Scanner;

public class JokeBot {

    private static String[] jokes = {
        "Why don't skeletons fight each other? They don't have the guts!",
        "What do you call fake spaghetti? An impasta!",
        "Why did the scarecrow win an award? Because he was outstanding in his field!",
        "What do you call cheese that isn't yours? Nacho cheese!",
        "Why don’t eggs tell jokes? They’d crack each other up!"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Hello! I'm your JokeBot. Type 'quit' to exit.");
        
        while (true) {
            System.out.print("You: ");
            String input = scanner.nextLine().toLowerCase();

            if (input.equals("quit")) {
                System.out.println("Goodbye! Hope you had a laugh.");
                break;
            }

            // Respond with a random joke
            int jokeIndex = random.nextInt(jokes.length);
            System.out.println("JokeBot: " + jokes[jokeIndex]);
        }

        scanner.close();
    }
}
