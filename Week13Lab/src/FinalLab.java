import java.awt.EventQueue;

import javax.swing.JFrame;

/**
 * 
 */

/**
 * @author jgsha
 *
 */
public class FinalLab {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				ButtonFrame frame = new ButtonFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
				frame.setTitle("Color Generator");
			}
		});

	}

}
