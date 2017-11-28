import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class ButtonFrame extends JFrame {
	private JPanel buttonPanel;
	private static final int DEFAULT_WIDTH = 300;

	private static final int DEFAULT_HEIGHT = 200;

	static int clicks = 0;

	public ButtonFrame() {
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

		// create buttons
		JButton changeButton = new JButton("Change");
		JButton resetButton = new JButton("reset");
		JButton closeButton = new JButton("Close");

		buttonPanel = new JPanel();

		// add buttons to panel
		buttonPanel.add(changeButton);
		buttonPanel.add(resetButton);
		buttonPanel.add(closeButton);

		// add panel to frame
		add(buttonPanel);

		// create button actions
		ColorAction blackAction = new ColorAction(Color.BLACK);

		// associate actions with buttons

		//ColorAction changeAction = new ColorAction();
		close closeAction = new close();
		reset resetAction = new reset();

		changeButton.addActionListener(blackAction);
		resetButton.addActionListener(resetAction);
		closeButton.addActionListener(closeAction);
	}

	/* An action listener that sets the panel's background color */
	private class ColorAction implements ActionListener {
		private Color backgroundColor;

		public ColorAction(Color c) {
			backgroundColor = c;
		}

		public void actionPerformed(ActionEvent event) {

			clicks++;

			while (clicks > 4) {
				clicks = clicks - 4;
			}

			if (clicks == 1)
				backgroundColor = Color.BLACK;
			else if (clicks == 2)
				backgroundColor = Color.GREEN;
			else if (clicks == 3)
				backgroundColor = Color.ORANGE;
			else if (clicks == 4)
				backgroundColor = Color.PINK;

			buttonPanel.setBackground(backgroundColor);
			
		}
	}
}

class close implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}

class reset implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		ButtonFrame.clicks = 0;
	}
}