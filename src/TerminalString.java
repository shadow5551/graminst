import java.awt.*;
import java.util.Map;

import static java.awt.event.KeyEvent.VK_SHIFT;

/**
 * Created by root on 25.12.16.
 */
public class TerminalString {
    HashTab hashTab = new HashTab();
    private Map<String, Integer> hashMap = hashTab.getHashMap();

    public String typeSymbolInTerminal(String tempString) throws AWTException {
        Robot robot = new Robot();
        for (int i = 0; i < tempString.length(); i++) {
            for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
                if (String.valueOf(tempString.charAt(i)).equals(entry.getKey())) {
                    if (String.valueOf(tempString.charAt(i)).equals("_")) {
                        robot.keyPress(VK_SHIFT);
                        robot.keyPress(entry.getValue());
                        robot.keyRelease(entry.getValue());
                        robot.keyRelease(VK_SHIFT);
                    } else {
                        robot.keyPress(entry.getValue());
                        robot.keyRelease(entry.getValue());
                    }
                }
            }
        }
        return "123";
    }
}
