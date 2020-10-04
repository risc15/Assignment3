import java.awt.event.*;
import acm.program.*;
import acm.graphics.*;

public class DrawLines extends GraphicsProgram{
	
	/*
	 * Instance variables:
	 */

	private static final long serialVersionUID = 1L;
	private static GLine line;

	public void init () {
		addMouseListeners();
	}
	
	public void mousePressed(MouseEvent e) {
		line = new GLine(e.getX(), e.getY(), e.getX(), e.getY());
		add(line);
		}
	
	public void mouseReleased(MouseEvent e) {
		line.setEndPoint(e.getX(), e.getY());
		}

}