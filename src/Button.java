import java.awt.*;

import static java.awt.event.KeyEvent.*;

/**
 * Created by root on 25.12.16.
 */
public class Button {
    public void clickingFollowingButton(int flag) throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(VK_ENTER);
        robot.keyRelease(VK_ENTER);
        robot.delay(5000);
        robot.delay(5000);
        for (int j = 0; j < flag; j++) {
                for (int i = 0; i < 6; i++) {
                robot.keyPress(VK_TAB);
                robot.keyRelease(VK_TAB);
            }
            robot.keyPress(VK_ENTER);
            robot.keyRelease(VK_ENTER);
            robot.delay(35000);
            robot.keyPress(VK_CONTROL);
            robot.keyPress(VK_W);
            robot.keyRelease(VK_W);
            robot.keyRelease(VK_CONTROL);

        }
    }
}
