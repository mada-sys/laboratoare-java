import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileInputOutputService implements IFileInputOutputService, Runnable {

    @Override
    public List<Users> getUsersFromFile(String filePath) {
        List<Users> userList = new ArrayList<>();
        try {
            FileReader reader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            bufferedReader.readLine(); // this will read the first line

            while ((line = bufferedReader.readLine()) != null) {
                String[] lineParts = line.split(",");
                Users user = new Users(lineParts[0], lineParts[1], lineParts[2],Integer.parseInt(lineParts[3]),Integer.parseInt(lineParts[4]),Integer.parseInt(lineParts[5]),Integer.parseInt(lineParts[6]),Integer.parseInt(lineParts[7]),lineParts[8],Integer.parseInt(lineParts[9]),Integer.parseInt(lineParts[10]));
                userList.add(user);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return userList;
    }


    @Override
    public void run() {

        String path = "src/hpv_2020s_results.csv";

        List<Users> usersFromFile = getUsersFromFile("src/hpv_2020s_results.csv");

        Collections.sort(usersFromFile);

        for (var user:usersFromFile) {
            System.out.println(user);
        }

    }
}
