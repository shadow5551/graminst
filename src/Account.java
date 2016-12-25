import java.awt.*;
import java.util.ArrayList;
import java.util.Map;

import static java.awt.event.KeyEvent.*;

/**
 * Created by root on 24.12.16.
 */
public class Account {
    private ArrayList<Integer> list = new ArrayList<Integer>();
    HashTab hashTab = new HashTab();
    private Map<String, Integer> hashMap = hashTab.getHashMap();
    public void roboting(String link) {
        String startBrowser = "firefox --new-window " + link.substring(8,link.length());
        try {
            list.add(VK_F);
            System.out.println(list.get(0));
            Robot robot = new Robot();
            //запуск термнала
            robot.keyPress(VK_CONTROL);
            robot.keyPress(VK_ALT);
            robot.keyPress(VK_T);
            robot.keyRelease(VK_T);
            robot.keyRelease(VK_ALT);
            robot.keyRelease(VK_CONTROL);
            //запуск браузера firefox --new-window сайт(аккаунт)
            robot.delay(2000);
            for (int i = 0; i < startBrowser.length(); i++) {
                for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
                    if (String.valueOf(startBrowser.charAt(i)).equals(entry.getKey())){
                        robot.keyPress(entry.getValue());
                        robot.keyRelease(entry.getValue());
                    }
                }
            }
            robot.keyPress(VK_ENTER);
            robot.keyRelease(VK_ENTER);
            //закрытие терминала
            robot.delay(1500);
            robot.keyPress(VK_ALT);
            robot.keyPress(VK_F4);
            robot.keyRelease(VK_F4);
            robot.keyRelease(VK_ALT);
            robot.delay(1500);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}
