import javax.swing.*;
import java.awt.*;

public class GuiTest extends JFrame {

    public GuiTest(){
	setTitle("My First Gui");
	setSize(600,400);
	setLocation(100,100);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
	GuiTest f = new GuiTest();
	f.setVisible(true);
    }
}
