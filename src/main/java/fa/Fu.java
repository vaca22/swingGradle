package fa;

import javax.swing.*;

public class Fu {
    private JPanel pannelMain;
    private JButton button1;

    public static void main(String[] args) {
        JFrame jFrame=new JFrame("sdf");
        jFrame.setContentPane(new Fu().pannelMain);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
    }
}
