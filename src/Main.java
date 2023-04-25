import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        func();
    }
    public static void func() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Write stop to stop");
        String str = scan.nextLine();  // Read user input
        if (str.equalsIgnoreCase("stop")){
            System.exit(0);
        }
        Random random = new Random();
        Random r2 = new Random();
        int i = random.nextInt(10);
        int j = r2.nextInt(10);
        System.out.println(i + "X" + j);

        Scanner response = new Scanner(System.in);

        try {
            int toto = Integer.parseInt(response.nextLine());
        } catch(NumberFormatException e) {
            System.out.println("Cette valeur n'est pas un chiffre, essaie encore !");
        }

        int res = i * j;
        String stt = response.nextLine();
        if (stt.equalsIgnoreCase("stop")){
            System.exit(0);
        } else if (res == Integer.parseInt(stt)) {
            System.out.println("Correct");
        }
        else {
            System.out.println("Incorrect");
        }
        func();
    }
}