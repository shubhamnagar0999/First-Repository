package First_Git_Repository;
import javax.swing.*;
import java.awt.*;

public class Git {
    public static void main(String[] args) {
	JFrame Jf = new JFrame();
		Jf.setTitle("Git");
	Jf.setVisible(true);
	Jf.setSize(343,100);
	Jf.setLocation(500,200);
	Jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	JLabel Jl = new JLabel();
	Jf.add(Jl);
	Jl.setText("Welcome To Mr.Stark's First Git Repository.");
	Jf.setLayout(new FlowLayout());
    }
}
