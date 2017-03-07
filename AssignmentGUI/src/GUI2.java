import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

public class GUI2 extends JFrame {

	private JPanel contentPane;
	private JLabel lblFilm;	
	private JButton btnTotal;
	int seats;
	int theatre;
	int tickets;
	int ticketPrice;
	int totalTickets;
	private JTextField txtTickets;
	private JTextField txtCost;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI2 frame = new GUI2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
		
	public GUI2() {
		setBackground(Color.CYAN);
		setForeground(Color.BLACK);
		setFont(new Font("Arial", Font.BOLD, 13));
		setTitle("Cinema");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 352, 377);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);		 
		
JComboBox cmboFilm = new JComboBox();
		
		cmboFilm = new JComboBox();
		cmboFilm.addItem("Hacksaw Ridge (R)"); 
		cmboFilm.addItem("John Wick 2 (15)");
		cmboFilm.addItem("Mississippi Grind (R)");
		cmboFilm.addItem("The Nice Guys (R)");
		cmboFilm.addItem("Goodfellas (R)");
		cmboFilm.addItem("Fury (R)");
		cmboFilm.addItem("The Great Wall (12A)"); 
		cmboFilm.addItem("Patriots Day (R)");
		cmboFilm.addItem("Passengers (PG-13)");
		cmboFilm.addItem("Jack Reacher Never go back (12A)");		
		
		cmboFilm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {   
            	
                JComboBox comboBox = (JComboBox) event.getSource();
                
                Object selected = comboBox.getSelectedItem();    
                
                if(selected.toString().equals("Hacksaw Ridge (R)")){                	
                seats=40;
                theatre=3;
                ticketPrice=9;
                }
                else if(selected.toString().equals("John Wick 2 (15)")){
                theatre=2;
                seats=110;
                ticketPrice=7;
                }
                else if(selected.toString().equals("Mississippi Grind (R)")){
                theatre=4;
                seats=45;
                ticketPrice=5;
                }
                else if(selected.toString().equals("The Nice Guys (R)")){
                theatre=1;
                seats=60;
                ticketPrice=6;
                }
                else if(selected.toString().equals("Goodfellas (R)")){
                theatre=6;
                seats=30;
                ticketPrice=4;
                }
                else if(selected.toString().equals("Fury (R)")){
                theatre=5;
                seats=80;
                ticketPrice=4;
                }
                else if(selected.toString().equals("The Great Wall (12A)")){
                theatre=8;
                seats=90;
                ticketPrice=7;
                }
                else if(selected.toString().equals("Patriots Day (R)")){
                theatre=9;
                seats=85;
                }
                else if(selected.toString().equals("Passengers (PG-13)")){
                theatre=10;
                seats=65;
                ticketPrice=7;
                }
                else if(selected.toString().equals("Logan (R)")){
                theatre=7;
                seats=50;
                ticketPrice=8;
                }                
                //txtTheatre.setText(" " + seats);
                //txtSeatsAvb.setText(" " + theatre);
                
             }
        });		
		
		cmboFilm.setBounds(89, 66, 221, 20);
		contentPane.add(cmboFilm);             
		
		lblFilm = new JLabel("Film");
		lblFilm.setBounds(10, 69, 46, 14);
		contentPane.add(lblFilm);
		
		txtTickets = new JTextField();
		txtTickets.setBounds(154, 127, 46, 20);
		contentPane.add(txtTickets);
		txtTickets.setColumns(10);
		txtTickets.getText();
		
		btnTotal = new JButton("Total");		
		btnTotal.setBounds(111, 292, 89, 23);
		contentPane.add(btnTotal);	
						
		txtCost = new JTextField();
		txtCost.setEditable(false);
		txtCost.setBounds(114, 264, 86, 20);
		contentPane.add(txtCost);
		txtCost.setColumns(10);
		
		
		
		
	}
}
		
        

                
            
		
	



		
	
	

