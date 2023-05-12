import java.util.Scanner;

public class MainDriver {
    static Boolean is_game_running = true;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        applicationPreparation();
        gameLoop();
    }

    private static void applicationPreparation() {

    }

    private static void gameLoop() {
        while(is_game_running){
            System.out.println("Please enter a command");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
            ProcessInput.parseCommand(scanner.nextLine());
        }
    }
}

