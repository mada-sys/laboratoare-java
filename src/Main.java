import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        IFileInputOutputService ioService= new FileInputOutputService();
        List<Users> usersFromFile = ioService.getUsersFromFile("src/hpv_2020s_results.csv");
        for (var user: usersFromFile) {
            System.out.println(user);
        }

        ioService.writeUsersToFile("src/hpv_2020s_results.csv",usersFromFile);
    }
}