import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main {
    public static void  main(String[] args) {

       JFrame window = new JFrame();
       window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       window.setSize(200, 400);
       window.setLocation(300, 300);

       Container cp = window.getContentPane();
       JPanel panel = new JPanel();

       panel.add(new JButton("click here"));
       panel.add(new JTextField("Hello UCO"));
       panel.add(new JButton("Sign in here"));
       panel.add(new JTextField("UCO World"));

       cp.add(panel);
      

       

       window.pack();
       window.setVisible(true);
    }
}