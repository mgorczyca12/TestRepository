import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame {

	public static void main(String[] args)
	{
		JFrame frame = new JFrame("frame demo");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
		frame.setSize(new Dimension(500,500));
		frame.setLocationRelativeTo(null);

		frame.pack();
		frame.setVisible(true);
	}



}