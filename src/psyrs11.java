/**
 * Created by Rahul Soni on 09/02/2016.
 */

import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class psyrs11 {


    public static void main(String[] args) {
        JFrame guiFrame = new JFrame();
        guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //
        guiFrame.setLocationRelativeTo(null);
        guiFrame.setLayout( new FlowLayout() );
        guiFrame.setTitle("Hello World from Rahul Soni!");

        JLabel label = new JLabel(); //
        label.setText("Hello ");
        label.setFont(new Font("Comic sans", Font.BOLD, 30));
        JLabel label2 = new JLabel(); //
        label2.setText("World");
        label2.setFont(new Font("Ariel", Font.BOLD, 30));
        JLabel label3 = new JLabel(); //
        label3.setText("(again)");
        label3.setFont(new Font("Ariel", Font.BOLD, 30));
        JLabel label4 = new JLabel(); //
        label4.setText("from ");
        label4.setFont(new Font("Ariel", Font.BOLD, 30));
        JLabel label5 = new JLabel(); //
        label5.setText("Rahul");
        label5.setFont(new Font("Ariel", Font.BOLD, 30));
        JLabel label6 = new JLabel(); //
        label6.setText("Soni!");
        label6.setFont(new Font("Ariel", Font.BOLD, 30));

        guiFrame.add(label);
        guiFrame.add(label2);
        guiFrame.add(label3);
        guiFrame.add(label4);
        guiFrame.add(label5);
        guiFrame.add(label6);

        guiFrame.pack();
        guiFrame.setVisible(true);

    }
}
