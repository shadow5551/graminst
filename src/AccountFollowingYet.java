import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by root on 25.12.16.
 */
public class AccountFollowingYet {
    PrintWriter writer = null;

    public void addingFollowingAccountsToFile(ArrayList list) throws IOException {
        File file = new File("myfollowing.txt");
        if (!file.exists()) {
            writer = new PrintWriter("myfollowing.txt");
        } else {
            writer = new PrintWriter(new FileOutputStream(new File("myfollowing.txt"), true));
        }
        addinglist(list);
        writer.close();

    }

    private void addinglist(ArrayList list) throws IOException {
        BufferedReader reader = new BufferedReader
                (new FileReader("myfollowing.txt"));
        Iterator<String> iterator;
        String line;
        String tempString;
        while ((line = reader.readLine()) != null) {
            for (iterator = list.iterator(); iterator.hasNext(); ) {
                tempString = iterator.next();
                if (tempString.equals(line)) {
                    iterator.remove();
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            writer.println(list.get(i));
        }
    }
}
