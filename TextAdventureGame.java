import java.util.Scanner;

public class TextAdventureGame {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Text Adventure Game!");
        System.out.println("You wake up in a mysterious forest.");
        System.out.println("You see two paths ahead of you: A and B.");
        System.out.println("Choose your path: A or B?");
        
        String choice = scanner.nextLine();
        
        switch (choice.toUpperCase()) {
            case "A":
                pathA(scanner);
                break;
            case "B":
                pathB(scanner);
                break;
            default:
                System.out.println("Invalid choice. Game over!");
        }
        
        scanner.close();
    }
    
    public static void pathA(Scanner scanner) {
        System.out.println("You chose path A.");
        System.out.println("You encounter a wild animal.");
        System.out.println("Do you want to fight or run? (F/R)");
        
        String action = scanner.nextLine();
        
        if (action.equalsIgnoreCase("F")) {
            System.out.println("You fight the animal and emerge victorious!");
            System.out.println("You find a treasure chest.");
            System.out.println("Congratulations! You won the game!");
        } else if (action.equalsIgnoreCase("R")) {
            System.out.println("You run away but get lost in the forest.");
            System.out.println("You stumble upon a cave and enter it.");
            System.out.println("Unfortunately, the cave collapses, and you perish.");
            System.out.println("Game over!");
        } else {
            System.out.println("Invalid choice. Game over!");
        }
    }
    
    public static void pathB(Scanner scanner) {
        System.out.println("You chose path B.");
        System.out.println("You find a deserted house.");
        System.out.println("Do you want to enter the house? (Y/N)");
        
        String action = scanner.nextLine();
        
        if (action.equalsIgnoreCase("Y")) {
            System.out.println("You enter the house and find a hidden room.");
            System.out.println("Inside the room, you discover a magical artifact.");
            System.out.println("Congratulations! You won the game!");
        } else if (action.equalsIgnoreCase("N")) {
            System.out.println("You decide not to enter the house and continue your journey.");
            System.out.println("Suddenly, a thunderstorm begins, and you get struck by lightning.");
            System.out.println("Game over!");
        } else {
            System.out.println("Invalid choice. Game over!");
        }
    }
}
