import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class EventHandlingDemo extends JFrame
        implements ActionListener, MouseListener {

    JButton button;
    JLabel label;

    EventHandlingDemo() {

        setTitle("Event Handling Demo");
        setSize(400, 250);
        setLayout(new FlowLayout());

        button = new JButton("Click Me");
        label = new JLabel("Perform an event");

        button.addActionListener(this);
        button.addMouseListener(this);

        add(button);
        add(label);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // ActionListener method
    public void actionPerformed(ActionEvent e) {
        label.setText("Button Clicked!");
    }

    // MouseListener methods
    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked!");
    }

    public void mousePressed(MouseEvent e) {
        label.setText("Mouse Pressed!");
    }

    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse Released!");
    }

    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse Entered!");
    }

    public void mouseExited(MouseEvent e) {
        label.setText("Mouse Exited!");
    }

    public static void main(String[] args) {
        new EventHandlingDemo();
    }
}
