import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by root on 27.12.16.
 */
public class CompareFile {
    public void Compare(String nameOfFileMyFollowers, String nameOfFileIFollows) throws IOException, AWTException {
        BufferedReader readerMyFollowers = new BufferedReader
                (new FileReader(nameOfFileMyFollowers));
        BufferedReader readerIFollows = new BufferedReader
                (new FileReader(nameOfFileIFollows));
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader
                (new FileReader(nameOfFileIFollows));
        ArrayList<String> list1 = new ArrayList<String>();
        Follow follow = new Follow();
        MyAccount myAccount = new MyAccount();
        String line,line1,line2;
        String nameOfFileOfBastards = "bast.txt";
        int flag;
        /*while ((line = readerIFollows.readLine()) != null) {
            flag = 0;
            while ((line1 = readerMyFollowers.readLine()) != null){
                if (line.equals(line1)) {
                    flag++;
                }
            }
            if (flag==0){
                list.add(line);
            }
            readerMyFollowers = new BufferedReader
                    (new FileReader(nameOfFileMyFollowers));
        }*/
        while ((line2 = reader.readLine()) != null) {
            list1.add(line2);
        }
        follow.startFollowPeople(list1);
    }
}
