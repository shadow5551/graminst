import java.awt.*;
import java.awt.event.InputEvent;

import static java.awt.event.KeyEvent.*;

/**
 * Created by root on 24.12.16.
 */
//открывает подписчиков или подписки
//в зависимости от координаты берет
// всех подписонов и сохраняет в файле
public class Followers {
    private TerminalString terminalString = new TerminalString();

    public void openFollowers() {
        try {
            Robot robot = new Robot();
            robot.delay(1500);
            robot.mouseMove(705, 300);//855 , 705
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            robot.delay(500);
            robot.mouseMove(1000, 732);
            //вывелся полностью список
            for (int i = 0; i < 7; i++) {
                robot.delay(1000);
                robot.mousePress(InputEvent.BUTTON1_MASK);
                robot.mouseRelease(InputEvent.BUTTON1_MASK);
            }
            //теперь сохраним страницу
            robot.keyPress(VK_CONTROL);
            robot.keyPress(VK_S);
            robot.keyRelease(VK_S);
            robot.keyRelease(VK_CONTROL);
            robot.delay(1000);
            terminalString.typeSymbolInTerminal("followers");
            robot.keyPress(VK_ENTER);
            robot.keyRelease(VK_ENTER);
            robot.delay(3000);
            robot.keyPress(VK_ENTER);
            robot.keyRelease(VK_ENTER);
            robot.delay(16000);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}
