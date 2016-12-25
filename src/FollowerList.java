import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Created by root on 24.12.16.
 */
public class FollowerList {
    private ArrayList<String> list = new ArrayList<String>();

    public void addFollowersToList() throws Exception {
        BufferedReader reader = new BufferedReader
                (new FileReader("/home/dima/followers.html"));
        String line;
        int flag = 0;
        while ((line = reader.readLine()) != null) {
            if (flag != 0) {
                if (line.contains("title")) {
                    System.out.println(line.substring(300, line.length()));
                    workingWithLine(line.substring(300, line.length()));
                }

            }
            if (line.contains("<script type=\"text/javascript\">window._timings.domInteractive = Date.now()</script>")) {
                flag++;
            }
            list.remove("peacefulands");
        }
    }

    public int workingWithLine(String line) {
        String tempString = line.substring(line.indexOf("title="), line.indexOf("title=") + 350);
        if (!line.contains("title=\"Facebook Cross Domain")) {
            addingToArrayList(tempString);
        }
        line = line.substring(line.indexOf("title=") + 90, line.length());
        if (line.contains("title=")) {
            workingWithLine(line);
        }
        return 1;
    }

    public void addingToArrayList(String line) {
        if (line.contains("\">Follow</button>"))
            list.add(line.substring(line.indexOf("title=") + 7, line.indexOf("\" href")));
    }

    public ArrayList<String> getList() {
        return list;
    }
}