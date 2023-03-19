import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JProgressBar;
import java.awt.Window.Type;

public class splash {

	private JFrame splash;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					splash window = new splash();
					window.splash.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public splash() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		splash = new JFrame();
		splash.setResizable(false);
		splash.getContentPane().setBackground(Color.BLACK);
		splash.setIconImage(Toolkit.getDefaultToolkit().getImage("/back.jpeg"));
		splash.setBounds(100, 100, 610, 491);
		splash.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		splash.getContentPane().setLayout(null);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(76, 451, 438, 5);
		splash.getContentPane().add(progressBar);
		
	}
}
