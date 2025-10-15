package Level3.Model;

import Level3.Exceptions.IdNotValidException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    static Scanner sc = new Scanner(System.in);

    public static int askInteger(String message, String mismatchMessage) {
        while (true) {
            System.out.println(message);
            try {
                int i = sc.nextInt();
                sc.nextLine();
                return i;
            } catch (InputMismatchException e) {
                System.out.println(mismatchMessage);
            }
        }
    }

    public static String askName(String message) {
        System.out.println(message);
        return sc.nextLine();
    }

    public static String askId(String message) {
        while (true) {
            System.out.println(message);
            String id = sc.next();
            try {
                if (id.length() != 9) {
                    String eString = (id.length() < 9) ? "Id is to short." : "Id is to long.";
                    throw new IdNotValidException(eString);
                }
                return id;
            } catch (IdNotValidException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
