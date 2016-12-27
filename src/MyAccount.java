import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by root on 25.12.16.
 */
public class MyAccount {
    PrintWriter writer = null;

    public void addingFollowingAccountsToFile(ArrayList list,String nameOfFile) throws IOException {
        File file = new File(nameOfFile);
        if (!file.exists()) {
            writer = new PrintWriter(nameOfFile);
        } else {
            writer = new PrintWriter(new FileOutputStream(new File(nameOfFile), true));
        }
        addinglist(list,nameOfFile);
        writer.close();

    }

    private void addinglist(ArrayList list,String nameOfFile) throws IOException {
        BufferedReader reader = new BufferedReader
                (new FileReader(nameOfFile));
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
