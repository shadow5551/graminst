import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by root on 24.12.16.
 */
public class FollowerList {
    private ArrayList<String> list = new ArrayList<String>();
    private int counter = 0;

    public void addFollowersToList() throws Exception {
        BufferedReader reader = new BufferedReader
                (new FileReader("/home/dima/followers.html"));
        String line;
        int flag = 0;
        while ((line = reader.readLine()) != null) {
            if (flag != 0) {
                if (line.contains("title")) {
                    //здесь может вывалться если слишком много подписчиков
                    System.out.println(line.length());
                    System.out.println(line.substring(300, line.length()));
                   // workingWithLine(line.substring(300, line.length()));
                    workingWithLine(line);
                }

            }
            if (line.contains("<script type=\"text/javascript\">window._timings.domInteractive = Date.now()</script>")) {
                flag++;
            }
          //  list.remove("peacefulands");
        }
    }

    public int workingWithLine(String line) {
        int beginSubstring = findNthIndexOf(line,"title=",counter + 1);
        int lastsubstring;
        if (beginSubstring==line.lastIndexOf("title=")){
            lastsubstring = line.length();
        }
        else {
            lastsubstring = findNthIndexOf(line, "title=", counter + 2);
        }
        String tempString = line.substring(beginSubstring,lastsubstring); //line.indexOf("title=") + 1);
        System.out.println(tempString);
        if ((!tempString.contains("title=\"Facebook Cross Domain") || !tempString.contains("title=\"peacefulands\""))
                && (tempString.contains("button class=\"_aj7mu _2hpcs _95tat _o0442\""))) {
            list.add(tempString.substring(tempString.indexOf("title=") + 7, tempString.indexOf("\" href")));
        }
        counter++;
        if (lastsubstring!=line.length()) {
            workingWithLine(line);
        }
        return 1;
    }

 /*   public void addingToArrayList(String line) {
        if (line.contains("\">Follow</button>"))
            list.add(line.substring(line.indexOf("title=") + 7, line.indexOf("\" href")));
    }*/

    public ArrayList<String> getList() {
        return list;
    }

    //магия с подстроками
    public int findNthIndexOf (String str, String needle, int occurence)
            throws IndexOutOfBoundsException {
        int index = -1;
        Pattern p = Pattern.compile(needle, Pattern.MULTILINE);
        Matcher m = p.matcher(str);
        while(m.find()) {
            if (--occurence == 0) {
                index = m.start();
                break;
            }
        }
        if (index < 0) throw new IndexOutOfBoundsException();
        return index;
    }
}