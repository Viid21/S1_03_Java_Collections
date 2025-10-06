package Level3.Model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ResourceInteractor {
    public static List<String> resourceReader(String resourceDir) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(resourceDir))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return lines;
    }

    public static void resourceWriter(String resourceDir, String message) {
        File resourceFile = new File(resourceDir);
        if (!resourceFile.exists()) {
            try {
                resourceFile.createNewFile();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(resourceDir, true))) {
            writer.write(message);
            writer.newLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
