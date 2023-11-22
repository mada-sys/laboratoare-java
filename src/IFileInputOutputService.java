import java.util.List;

public interface IFileInputOutputService {
    List<Users> getUsersFromFile(String filePath);
    void writeUsersToFile(String filePath, List<Users> usersList);
}
