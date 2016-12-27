import java.awt.*;

import static java.awt.event.KeyEvent.*;

/**
 * Created by root on 24.12.16.
 */
//запускает страницу с юзером и закрывает терминал
public class Account {
    TerminalString terminalString = new TerminalString();

    public void roboting(String link) {
        String startBrowser = "firefox --new-window " + link.substring(link.indexOf("www.instagram"), link.length());
        try {
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
            terminalString.typeSymbolInTerminal(startBrowser);
            robot.keyPress(VK_ENTER);
            robot.keyRelease(VK_ENTER);
            //закрытие терминала
            robot.delay(4000);
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
