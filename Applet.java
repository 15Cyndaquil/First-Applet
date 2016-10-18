import java.awt.Graphics;
import java.awt.Font;
import javax.swing.JApplet;

public class Applet extends JApplet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paint(Graphics canvas) {
		Font a;
		a = new Font("Times New Roman",Font.BOLD,100);
		canvas.setFont(a);
		canvas.drawString("X O O",1,100);
		canvas.drawString("O X O",1,185);
		canvas.drawString("X O X",1,270);
		canvas.drawLine(1, 105, 290, 105);
		canvas.drawLine(1, 190, 290, 190);
		canvas.drawLine(85, 20, 85, 270);
		canvas.drawLine(190, 20, 190, 270);
		canvas.drawLine(1, 35, 290, 270);
	}
}
