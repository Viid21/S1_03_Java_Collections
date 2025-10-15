package Level3.Model;

import java.util.List;

public class Application {
    String projectDir = System.getProperty("user.dir");

    public String getProjectDir() {
        return projectDir;
    }

    public void play() {


        int option;
        String message = "";

        do {
            String namesDir = getProjectDir() + "/src/Level3/Resources/names.csv";
            List<Client> clientsList = ListManager.clientsListBuilder(ResourceInteractor.resourceReader(namesDir));

            option = Menus.mainMenu();
            StringBuilder clientsListString = new StringBuilder("___Name___ ____Surnames__ __ID__\n");
            switch (option) {
                case 1:
                    ResourceInteractor.resourceWriter(namesDir, Input.askName("Put the name:") + "," +
                            Input.askName("Put the surnames:") + "," + Input.askId("Put the ID:"));
                    message = "Person added.";
                    break;
                case 2:
                    clientsList.sort(ListManager.getDescendantName());
                    break;
                case 3:
                    clientsList.sort(ListManager.getAscendantName());
                    break;
                case 4:
                    clientsList.sort(ListManager.getDescendantSurnames());
                    break;
                case 5:
                    clientsList.sort(ListManager.getAscendantSurnames());
                    break;
                case 6:
                    clientsList.sort(ListManager.getDescendantId());
                    break;
                case 7:
                    clientsList.sort(ListManager.getAscendantId());
                    break;
                case 0:
                    message = "Bye bye.";
                    break;
                default:
                    message = "Choose a valid option.";
            }

            if (option > 1) {
                for (Client client : clientsList) {
                    clientsListString.append(client.toString()).append("\n");
                }
                message = clientsListString.toString();
            }
            System.out.println(message);
        } while (option != 0);
    }
}
