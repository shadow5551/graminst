import java.awt.*;
import java.util.ArrayList;
import java.util.Map;

import static java.awt.event.KeyEvent.*;

/**
 * Created by root on 24.12.16.
 */
class Follow {
    private ArrayList<String> list = new ArrayList<String>();
    private String startBrowser = "firefox ";
    private HashTab hashTab = new HashTab();
    private Map<String, Integer> hashMap = hashTab.getHashMap();
    private Robot robot = new Robot();
    Button button = new Button();
    Follow() throws AWTException {
    }

    void startFollowPeople(ArrayList<String> list) throws AWTException {
        openTerminaL(1);
        int flag = 0;
        for (int i = 0; i < list.size(); i++) {
            startBrowser+=("--new-tab www.instagram.com/"+list.get(i)+"/ ");
                goFollowNewPeople(startBrowser);
            startBrowser = "";
            flag++;
            if (flag%10==0){
                button.clickingFollowingButton(flag);
                flag=0;
                openTerminaL(2);
                startBrowser = "firefox ";
            }
        }
        System.out.println(startBrowser);
        button.clickingFollowingButton(flag);

    }

    private void openTerminaL(int i) {
        if (i==1){robot.keyPress(VK_CONTROL);
        robot.keyPress(VK_ALT);
        robot.keyPress(VK_T);
        robot.keyRelease(VK_T);
        robot.keyRelease(VK_ALT);
        robot.keyRelease(VK_CONTROL);}
        else{
            robot.keyPress(VK_ALT);
            robot.keyPress(VK_TAB);
            robot.keyRelease(VK_TAB);
            robot.keyRelease(VK_ALT);
        }
    }

    private void goFollowNewPeople(String startBrowser) {
        robot.delay(1000);
        for (int j = 0; j < startBrowser.length(); j++) {
            for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
                if (String.valueOf(startBrowser.charAt(j)).equals(entry.getKey())){
                    robot.keyPress(entry.getValue());
                    robot.keyRelease(entry.getValue());
                }
            }
        }
    }
}
