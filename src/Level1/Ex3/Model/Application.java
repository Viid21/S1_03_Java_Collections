package Level1.Ex3.Model;

import java.io.*;
import java.util.*;

public class Application {
    public void play(){
        String projectDir = System.getProperty("user.dir");
        String countriesDir = projectDir + "/src/Level1/Ex3/Resources/countries.txt";
        String scoreDir = projectDir + "/src/Level1/Ex3/Resources/score.txt";

        Map<String, String> countriesMap = convertResourceToMap(countriesDir);
        List<String> countriesList = new ArrayList<>(countriesMap.keySet());
        String player = Input.askName("What's your name?");
        int points = 0;

        Collections.shuffle(countriesList);

        System.out.println("What's the capital of this countries?");

        for(int i = 0; i < 10; i++){
            String answer = Input.askCapital(countriesList.get(i));
            points += verifyAnswer(i, answer, countriesMap, countriesList);
        }

        System.out.println("Your results are in the score.txt");
        convertScoreToResource(player, points, scoreDir);
    }

    public Map<String, String> convertResourceToMap(String resourceName){
        Map<String, String> map = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(resourceName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.trim().split("\\s+");
                if (parts.length == 2){
                    map.put(parts[0], parts[1]);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return map;
    }

    public int verifyAnswer(int index, String answer, Map<String, String> countriesMap, List<String> countriesList){
        String value = countriesMap.get(countriesList.get(index)).replace("_", " ");

        if (answer.equalsIgnoreCase(value)) {
            System.out.println("¡Correct!");
            return 1;
        } else {
            System.out.println("Incorrect.");
            return 0;
        }
    }

    public void convertScoreToResource(String playerName, int points, String scoreDir){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(scoreDir, true))) {
            writer.write(playerName + ": " + points + " points");
            writer.newLine();
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
