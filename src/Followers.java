import java.awt.*;
import java.awt.event.InputEvent;
import java.util.Map;

import static java.awt.event.KeyEvent.*;

/**
 * Created by root on 24.12.16.
 */
public class Followers {
    String nameOfFile = "followers";
    HashTab hashTab = new HashTab();
    private Map<String, Integer> hashMap = hashTab.getHashMap();
    public void openFollowers(){

        try {
            Robot robot = new Robot();
            robot.delay(1500);
            robot.mouseMove(705,300);
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            robot.delay(500);
            robot.mouseMove(1000,730);
            //вывелся полностью список
                for (int i = 0; i < 150; i++) {
                robot.delay(1000);
                robot.mousePress(InputEvent.BUTTON1_MASK);
                robot.mouseRelease(InputEvent.BUTTON1_MASK);
            }
            //теперь сохраним страницу
            robot.keyPress(VK_CONTROL);
            robot.keyPress(VK_S);
            robot.keyRelease(VK_S);
            robot.keyRelease(VK_CONTROL);
            robot.delay(15000);
            for (int i = 0; i < nameOfFile.length(); i++) {
                for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
                    if (String.valueOf(nameOfFile.charAt(i)).equals(entry.getKey())){
                        robot.keyPress(entry.getValue());
                        robot.keyRelease(entry.getValue());
                    }
                }
            }
            robot.keyPress(VK_ENTER);
            robot.keyRelease(VK_ENTER);
            robot.delay(1000);
            robot.keyPress(VK_ENTER);
            robot.keyRelease(VK_ENTER);
            robot.delay(5000);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}
