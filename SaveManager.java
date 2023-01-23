import java.io.FileWriter;
import java.io.IOException;

public class SaveManager implements SaveJson, SaveTxt{

    public SaveManager() {
        System.out.println("Saving data...");
    }

    @Override
    public void saveJson(User user) {
        String fileName = "usersInfo.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"User name\":\""+user.getName()+ "\",\n");
            writer.write("\"User age\":"+user.getAge()+"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void saveTxt(User user) {
        try(FileWriter writer = new FileWriter("usersInfo.txt", false))
        {
            writer.append(String.format("User name: %s\nUser age: %d\n", user.getName(), user.getAge()));
            writer.append('\n');
            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
