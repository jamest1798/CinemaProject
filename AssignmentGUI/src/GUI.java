import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

public class GUI extends JFrame {

	private JPanel contentPane;
	int ticketPrice;
	private JButton btnFilms;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnFilms = new JButton("Films");
		btnFilms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FilmsWindow nw = new FilmsWindow();
				nw.newScreen();
			}
		});
		btnFilms.setBounds(177, 40, 89, 23);
		contentPane.add(btnFilms);
		
	}
}
