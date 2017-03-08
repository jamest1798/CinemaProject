import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.*;

public class CinemaGUI extends JFrame{

	private JPanel contentPane;
	private JTextField txtTheatre;
	public JTextField txtNumOfTickets;
	private JTextField txtNoTicketsLeft;
	private JTextField txtTotalTicketPrice;
	private JTextField txtTotal;
	int seats;
	int theatre;
	int noTickets;
	String numberTickets;
	private JTextField txtSeatsAvailable;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CinemaGUI frame = new CinemaGUI();
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
	public CinemaGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 403, 385);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox cmboFilms = new JComboBox();
		
		cmboFilms = new JComboBox();
		cmboFilms.addItem("Hacksaw Ridge (R)"); 
		cmboFilms.addItem("John Wick 2 (15)");
		cmboFilms.addItem("Mississippi Grind (R)");
		cmboFilms.addItem("The Nice Guys (R)");
		cmboFilms.addItem("Goodfellas (R)");
		cmboFilms.addItem("Fury (R)");
		cmboFilms.addItem("The Great Wall (12A)"); 
		cmboFilms.addItem("Patriots Day (R)");
		cmboFilms.addItem("Passengers (PG-13)");
		cmboFilms.addItem("Jack Reacher Never go back (12A)");		
		
		cmboFilms.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                //
                // Get the source of the component, which is our combo
                // box.
                //
                JComboBox comboBox = (JComboBox) event.getSource();

                Object selected = comboBox.getSelectedItem();
                
                if(selected.toString().equals("Hacksaw Ridge (R)")){
                
                seats=40;
                theatre=3;
                }
                else if(selected.toString().equals("John Wick 2 (15)")){
                theatre=2;
                seats=110;
                }
                else if(selected.toString().equals("Mississippi Grind (R)")){
                theatre=4;
                seats=45;
                }
                else if(selected.toString().equals("The Nice Guys (R)")){
                theatre=1;
                seats=60;
                }
                else if(selected.toString().equals("Goodfellas (R)")){
                	theatre=6;
                seats=30;
                }
                else if(selected.toString().equals("Fury (R)")){
                	theatre=5;
                seats=80;
                }
                else if(selected.toString().equals("The Great Wall (12A)")){
                	theatre=8;
                seats=90;
                }
                else if(selected.toString().equals("Patriots Day (R)")){
                	theatre=9;
                seats=85;
            }
                else if(selected.toString().equals("Passengers (PG-13)")){
                	theatre=10;
                seats=65;
                }
                else if(selected.toString().equals("Jack Reacher Never go back (12A)")){
                	theatre=7;
                seats=50;
            }
                txtSeatsAvailable.setText(" " + seats);
                txtTheatre.setText(" " + theatre);

            }            
        });
               		
		cmboFilms.setFont(new Font("Arial", Font.PLAIN, 11));
		cmboFilms.setMaximumRowCount(11);
		cmboFilms.setBounds(58, 16, 195, 20);
		contentPane.add(cmboFilms);		
				
		JLabel lblFilms = new JLabel("Films");
		lblFilms.setFont(new Font("Arial", Font.BOLD, 14));
		lblFilms.setBounds(10, 11, 38, 28);
		contentPane.add(lblFilms);
		
		JLabel lblTheatre = new JLabel("Theatre");
		lblTheatre.setFont(new Font("Arial", Font.BOLD, 14));
		lblTheatre.setBounds(10, 47, 62, 20);
		contentPane.add(lblTheatre);
		
		txtTheatre = new JTextField();
		txtTheatre.setFont(new Font("Arial", Font.BOLD, 14));
		txtTheatre.setEditable(false);
		txtTheatre.setBounds(68, 47, 38, 19);
		contentPane.add(txtTheatre);
		txtTheatre.setColumns(3);
		
		
		JLabel lblSeatsAvailable = new JLabel("Seats Available");
		lblSeatsAvailable.setFont(new Font("Arial", Font.BOLD, 14));
		lblSeatsAvailable.setBounds(120, 47, 108, 20);
		contentPane.add(lblSeatsAvailable);
		
		JLabel lblNumberOfTickets = new JLabel("Number of tickets");
		lblNumberOfTickets.setFont(new Font("Arial", Font.BOLD, 14));
		lblNumberOfTickets.setBounds(10, 78, 130, 20);
		contentPane.add(lblNumberOfTickets);
		
		txtNumOfTickets = new JTextField();		
		txtNumOfTickets.setFont(new Font("Arial", Font.BOLD, 14));
		txtNumOfTickets.setBounds(150, 78, 54, 20);
		contentPane.add(txtNumOfTickets);
		txtNumOfTickets.setColumns(4);
		txtNumOfTickets.getText();
		     
		
				
		JLabel lblTotalTicketPrice = new JLabel("Total ticket price");
		lblTotalTicketPrice.setFont(new Font("Arial", Font.BOLD, 14));
		lblTotalTicketPrice.setBounds(10, 144, 130, 20);
		contentPane.add(lblTotalTicketPrice);
		
		JLabel lblNumberOfTickets_1 = new JLabel("Number of tickets left");
		lblNumberOfTickets_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNumberOfTickets_1.setBounds(10, 109, 164, 24);
		contentPane.add(lblNumberOfTickets_1);
		
		txtNoTicketsLeft = new JTextField();
		txtNoTicketsLeft.setFont(new Font("Arial", Font.BOLD, 14));
		txtNoTicketsLeft.setEditable(false);
		txtNoTicketsLeft.setBounds(184, 111, 44, 20);
		contentPane.add(txtNoTicketsLeft);
		txtNoTicketsLeft.setColumns(4); 
		
			
				
		txtTotalTicketPrice = new JTextField();
		txtTotalTicketPrice.setText("\u00A3");
		txtTotalTicketPrice.setHorizontalAlignment(SwingConstants.LEFT);
		txtTotalTicketPrice.setEditable(false);
		txtTotalTicketPrice.setFont(new Font("Arial", Font.BOLD, 14));
		txtTotalTicketPrice.setBounds(142, 144, 86, 20);
		contentPane.add(txtTotalTicketPrice);
		txtTotalTicketPrice.setColumns(10);
		
		JLabel lblDrinks = new JLabel("Drinks");
		lblDrinks.setFont(new Font("Arial", Font.BOLD, 14));
		lblDrinks.setBounds(10, 196, 46, 14);
		contentPane.add(lblDrinks);
		
		JComboBox cmboDrinks = new JComboBox();
		cmboDrinks.setModel(new DefaultComboBoxModel(new String[] {"None", "Coke - \u00A32", "Fanta \u00A32", "Dr Pepper \u00A32", "7up \u00A32"}));
		cmboDrinks.setMaximumRowCount(5);
		cmboDrinks.setFont(new Font("Arial", Font.BOLD, 14));
		cmboDrinks.setBounds(10, 221, 130, 20);
		contentPane.add(cmboDrinks);
		
		JLabel lblSize = new JLabel("Snacks");
		lblSize.setFont(new Font("Arial", Font.BOLD, 14));
		lblSize.setBounds(190, 197, 54, 13);
		contentPane.add(lblSize);
		
		JComboBox cmboSnack = new JComboBox();
		cmboSnack.setFont(new Font("Arial", Font.BOLD, 14));
		cmboSnack.setModel(new DefaultComboBoxModel(new String[] {"None", "Popcorn - Large \u00A36", "Popcorn - Regular \u00A33.70", "Popcorn - Small \u00A32.50", "Nachos \u00A32.20", "Ice cream \u00A33.80"}));
		cmboSnack.setMaximumRowCount(6);
		cmboSnack.setBounds(191, 221, 182, 20);
		contentPane.add(cmboSnack);
		
		JButton btnFinish = new JButton("Finish");
		btnFinish.setFont(new Font("Arial", Font.BOLD, 14));
		btnFinish.setBounds(147, 309, 89, 23);
		contentPane.add(btnFinish);
		
		txtTotal = new JTextField();
		txtTotal.setEditable(false);
		txtTotal.setText("\u00A3");
		txtTotal.setFont(new Font("Arial", Font.BOLD, 14));
		txtTotal.setBounds(148, 283, 86, 20);
		contentPane.add(txtTotal);
		txtTotal.setColumns(10);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Arial", Font.BOLD, 14));
		lblTotal.setBounds(170, 266, 46, 14);
		contentPane.add(lblTotal);
		
		txtSeatsAvailable = new JTextField();
		txtSeatsAvailable.setFont(new Font("Arial", Font.BOLD, 14));
		txtSeatsAvailable.setEditable(false);
		txtSeatsAvailable.setColumns(3);
		txtSeatsAvailable.setBounds(240, 47, 38, 19);
		contentPane.add(txtSeatsAvailable);
		
	}
}
