import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class istener implements ActionListener {
    private JFrame f = new JFrame("Se");

    @Override
    public void actionPerformed(ActionEvent arg0) {
        JLabel l1 = new JLabel("Enter the");
        l1.setBounds(50, 70, 200, 30);
        f.add(l1);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(1000, 1000);
        f.setVisible(true);
        l1.setBounds(50, 70, 200, 30);

    }

}
