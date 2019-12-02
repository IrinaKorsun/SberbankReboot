package kurkin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WebForm extends JFrame {

    private int pswdHash;
    private String login;

    JTextField f1 = new JTextField("сюда вводим");
    JTextField f2 = new JTextField(10);

    public WebForm() throws HeadlessException {
        Panel panel = new Panel();


        setSize(600, 00);
        JButton button = new JButton();
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                f2.setText(f1.getText());

            }
        });

        panel.add(f1);
        panel.add(button);
        panel.add(f2);

        add(panel);
        setVisible(true);
    }

}
