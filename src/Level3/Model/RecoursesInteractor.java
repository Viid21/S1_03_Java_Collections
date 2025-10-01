package Level3.Model;

import java.io.*;

public class RecoursesInteractor {
    public static String resourceReader(String resourceDir) {
        StringBuilder completeLine = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(resourceDir))) {
            String line;
            while ((line = reader.readLine()) != null) {
                completeLine.append(line).append("\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return completeLine.toString();
    }

    public static void resourceWriter(String resourceDir, String message) {
        File resourceFile = new File(resourceDir);
        if (!resourceFile.exists()) {
            try {
                resourceFile.createNewFile();
            } catch (IOException e) {
                System.out.println("Error creating: " + e.getMessage());
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(resourceDir, true))) {
                writer.write(message);
                writer.newLine();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
