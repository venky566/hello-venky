import javax.swing.JFrame;

public class Main {
    public static void  main(String[] args) {
       JFrame window = new JFrame();
       window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       window.setSize(200, 400);
       window.setLocation(300, 300);

       window.pack();
       window.setVisible(true);
    }
}