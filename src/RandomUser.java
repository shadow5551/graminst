import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by root on 27.12.16.
 */
public class RandomUser {
    public String getRandomUser(String nameOfFile) throws IOException {
        BufferedReader reader = new BufferedReader
                (new FileReader(nameOfFile));
        ArrayList<String> list = new ArrayList<String>();
        while (reader.readLine() != null)
        {
            list.add(reader.readLine());
        }
        reader.close();
        int randomNum = ThreadLocalRandom.current().nextInt(0, list.size());
        return list.get(randomNum);
    }
}
