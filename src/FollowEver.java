import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Created by root on 27.12.16.
 */
public class FollowEver {
    public void addToListFollowedEver(ArrayList list) throws FileNotFoundException {
        String nameOfFile = "ifollowever.txt";
        PrintWriter writer = null;
        File file = new File(nameOfFile);
        if (!file.exists()) {
            writer = new PrintWriter(nameOfFile);
        } else {
            writer = new PrintWriter(new FileOutputStream(new File(nameOfFile), true));
        }
        for (int i = 0; i < list.size(); i++) {
            writer.println(list.get(i));
        }
        writer.close();
    }
}
