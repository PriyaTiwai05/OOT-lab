import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class LoginForm {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Login Form");

        JLabel userLabel = new JLabel("Username:");
        JLabel passLabel = new JLabel("Password:");

        JTextField userText = new JTextField();
        JPasswordField passText = new JPasswordField();

        JButton loginButton = new JButton("Login");

        userLabel.setBounds(50, 50, 100, 30);
        userText.setBounds(150, 50, 150, 30);

        passLabel.setBounds(50, 100, 100, 30);
        passText.setBounds(150, 100, 150, 30);

        loginButton.setBounds(120, 160, 100, 30);

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String username = userText.getText();
                String password = new String(passText.getPassword());

                if (username.equals("admin") &&
                    password.equals("1234")) {

                    JOptionPane.showMessageDialog(
                        frame, "Login Successful!"
                    );

                } else {
                    JOptionPane.showMessageDialog(
                        frame, "Invalid Username or Password!"
                    );
                }
            }
        });

        frame.add(userLabel);
        frame.add(userText);
        frame.add(passLabel);
        frame.add(passText);
        frame.add(loginButton);

        frame.setSize(400, 280);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}