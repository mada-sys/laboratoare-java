import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileInputOutputService implements IFileInputOutputService {
    @Override
    public List<Users> getUsersFromFile(String filePath) {
        List<Users> userList = new ArrayList<>();
        try {
            FileReader reader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            bufferedReader.readLine(); // this will read the first line

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                String[] lineParts = line.split(",");
                Users user;
                user = new Users(lineParts[0], lineParts[1], lineParts[2],Integer.parseInt(lineParts[3]),Integer.parseInt(lineParts[4]),Integer.parseInt(lineParts[5]),Integer.parseInt(lineParts[6]),Integer.parseInt(lineParts[7]),lineParts[8],Integer.parseInt(lineParts[9]),Integer.parseInt(lineParts[10]));
                userList.add(user);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return userList;
    }

    @Override
    public void writeUsersToFile(String filePath, List<Users> usersList) {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath))) {
            String line;

            for (var user : usersList) {
                line = user.country_name + "," + user.region + "," + user.income + "," + user.year + ","
                        + user.cohort_size + "," + user.coverage + " " + user.cancer_prevented + ","
                        + user.deaths_prevented + "," + user.assumption_type + "," + user.possible_cancer_cases + ","
                        + user.possible_cancer_deaths;
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}