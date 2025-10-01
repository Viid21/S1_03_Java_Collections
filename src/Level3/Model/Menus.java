package Level3.Model;

public class Menus {

    public static int mainMenu(){
        return Input.askInteger("""
                What dou you want to do?
                1.- Enter person.
                2.- Show people sorted by first name (A-Z).
                3.- Show people sorted by first name (Z-A).
                4.- Show people sorted by last name (A-Z).
                5.- Show people sorted by last name (Z-A).
                6.- Show people sorted by ID number (1-9).
                7.- Show people sorted by ID number (9-1).
                0.- Exit.
                """, "Choose a valid option.");
    }
}
