package Level3.Model;

public class Application {
    String projectDir = System.getProperty("user.dir");

    public String getProjectDir() {
        return projectDir;
    }

    String countriesDir = projectDir + "/src/Level1/Ex3/Resources/countries.txt";
    public void play() {
        int option = -1;
        while (option != 0) {
            option = Menus.mainMenu();
            String message = switch (option) {
                case 1 -> addPerson();
                case 2 -> "";
                case 3 -> "";
                case 4 -> "";
                case 5 -> "";
                case 6 -> "";
                case 7 -> "";
                case 0 -> exit();
                default -> "Choose a valid option.";
            };
        }
    }

    public String addPerson(){
        RecoursesInteractor.resourceWriter(getProjectDir() + "/src/Level3/Resources/names.csv",
                Input.askName("Put the name:") + "," + Input.askName("Put the surname:") + ","
                        + Input.askId("Put the ID:"));

        return "Person added.";
    }

    //TODO: LA RESTA DEL MENU ( POTSER FER UNA CLASSE separada per fer el Sort

    public String exit(){
        return "Bye bye.";
    }
}
