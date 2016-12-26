import java.awt.*;
import java.util.ArrayList;
import java.util.Map;

import static java.awt.event.KeyEvent.*;

/**
 * Created by root on 24.12.16.
 */
class Follow {
    Button button = new Button();
    private ArrayList<String> list = new ArrayList<String>();
    private String startBrowser = "firefox ";
    private HashTab hashTab = new HashTab();
    private Map<String, Integer> hashMap = hashTab.getHashMap();
    private Robot robot = new Robot();
    TerminalString terminalString = new TerminalString();

    Follow() throws AWTException {
    }

    void startFollowPeople(ArrayList<String> list) throws AWTException {
        openTerminaL(1);
        int flag = 0;
        for (int i = 0; i < list.size(); i++) {
            startBrowser += ("--new-tab www.instagram.com/" + list.get(i) + "/ ");
            terminalString.typeSymbolInTerminal(startBrowser);
            startBrowser = "";
            flag++;
            if (flag % 10 == 0) {
                button.clickingFollowingButton(flag);
                flag = 0;
                openTerminaL(2);
                startBrowser = "firefox ";
            }
        }
        System.out.println(startBrowser);
        button.clickingFollowingButton(flag);

    }

    private void openTerminaL(int i) {
        if (i == 1) {
            robot.keyPress(VK_CONTROL);
            robot.keyPress(VK_ALT);
            robot.keyPress(VK_T);
            robot.keyRelease(VK_T);
            robot.keyRelease(VK_ALT);
            robot.keyRelease(VK_CONTROL);
        } else {
            robot.keyPress(VK_ALT);
            robot.keyPress(VK_TAB);
            robot.keyRelease(VK_TAB);
            robot.keyRelease(VK_ALT);
        }
    }
}
