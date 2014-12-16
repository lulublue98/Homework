import javax.swing.*;
import java.awt.*;

public class GuiTwo extends JFrame {

    private Container pane;
    private JButton button, exit;
    private JLabel label;
    private JTextArea text;
    private JPanel canvas;

    public GuiTwo() {
	setTitle("Second Gui Test");
	setSize(1100,700);
	setLocation(100,100);
	setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = getContentPane();
	pane.setLayout(new FlowLayout());
	label = new JLabel("buttons: ");
	pane.add(label);
	button = new JButton("button");
	pane.add(button);
	exit = new JButton("EXIT");
	pane.add(exit);
	text = new JTextArea("text goes here");
	text.setBorder(BorderFactory.createLineBorder(Color.blue,2));
	text.setColumns(80);
	text.setRows(10);
	pane.add(text);

	canvas = new JPanel();
	canvas.setPreferredSize(new Dimension(300, 300));
	canvas.setBorder(BorderFactory.createLineBorder(Color.red,2));
	pane.add(canvas);

    }

    public static void main(String[] args) {
	GuiTest T = new GuiTest();
	T.setVisible(true);
    }

}
