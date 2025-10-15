package Level1.Ex3.Model;

import Level1.Ex3.Exceptions.ExceptionNameNotValid;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {
    static Scanner sc = new Scanner(System.in);

    public static String askName(String message){
        String name;
        while(true){
            System.out.println(message);
            name = sc.nextLine();
            try{
                if(findNameInList(name, readNotAllowedNames())){
                    throw new ExceptionNameNotValid("This name is not allowed.");
                }else if(name.length() < 3){
                    throw new ExceptionNameNotValid("Name to short.");
                }else if(name.matches("^[A-Za-zÀ-ÿ\\u00f1\\u00d1\\s]+$")){
                    throw new ExceptionNameNotValid("Name is not valid.");
                }
                return name;
            }catch (ExceptionNameNotValid e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static String askCapital(String message){
        System.out.println(message);
        return sc.nextLine();
    }

    public static List<String> readNotAllowedNames(){
        String notAllowedNamesDir = System.getProperty("user.dir") + "/src/Level1/Ex3/Resources/notAllowedNames.txt";
        List<String> notAllowedList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(notAllowedNamesDir))) {
            String name;
            while ((name = reader.readLine()) != null) {
                notAllowedList.add(name);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return notAllowedList;
    }

    public static boolean findNameInList(String name, List<String> list){
        for(String actualName : list){
            if(name.equalsIgnoreCase(actualName)){
                return true;
            }
        }
        return false;
    }
}
