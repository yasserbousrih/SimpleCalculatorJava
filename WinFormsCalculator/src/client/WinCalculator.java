package client;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Window.Type;

public class WinCalculator {

	private JFrame frmGuiCalculator;
	private JTextField textFieldNumber1;
	private JTextField textFieldNumber2;
	private JTextField textFieldResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WinCalculator window = new WinCalculator();
					window.frmGuiCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WinCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGuiCalculator = new JFrame();
		frmGuiCalculator.setForeground(new Color(192, 192, 192));
		frmGuiCalculator.setFont(new Font("Agency FB", Font.BOLD | Font.ITALIC, 16));
		frmGuiCalculator.setTitle("GUI Calculator");
		frmGuiCalculator.setBounds(100, 100, 450, 300);
		frmGuiCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGuiCalculator.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(172, 51, 46, -10);
		frmGuiCalculator.getContentPane().add(lblNewLabel);
		
		JLabel lblN1 = new JLabel("First number ?");
		lblN1.setBounds(29, 37, 94, 28);
		frmGuiCalculator.getContentPane().add(lblN1);
		
		JLabel lblNewLabel_1 = new JLabel("Second number ? ");
		lblNewLabel_1.setBounds(29, 76, 85, 28);
		frmGuiCalculator.getContentPane().add(lblNewLabel_1);
		
		textFieldNumber1 = new JTextField();
		textFieldNumber1.setToolTipText("input integer number");
		textFieldNumber1.setBounds(119, 37, 76, 20);
		frmGuiCalculator.getContentPane().add(textFieldNumber1);
		textFieldNumber1.setColumns(10);
		
		textFieldNumber2 = new JTextField();
		textFieldNumber2.setBounds(124, 80, 71, 20);
		frmGuiCalculator.getContentPane().add(textFieldNumber2);
		textFieldNumber2.setColumns(10);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
                int n1, n2 , result;				
				try {
					
					n1 = Integer.parseInt(textFieldNumber1.getText());
					n2 = Integer.parseInt(textFieldNumber2.getText());
					result = n1 + n2 ;
					
					textFieldResult.setText(Integer.toString(result) ) ;
				} catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "Please enter a valid number");
					textFieldNumber1.setText("");
					textFieldNumber2.setText("");
					textFieldNumber1.requestFocus();
				}
				
				
				
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAdd.setBounds(10, 125, 66, 23);
		frmGuiCalculator.getContentPane().add(btnAdd);
		
		JLabel lblResult = new JLabel("Result");
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblResult.setBounds(47, 181, 71, 28);
		frmGuiCalculator.getContentPane().add(lblResult);
		
		textFieldResult = new JTextField();
		textFieldResult.setColumns(10);
		textFieldResult.setBounds(128, 185, 53, 20);
		frmGuiCalculator.getContentPane().add(textFieldResult);
		
		JButton btnAddMult = new JButton("MULT");
		btnAddMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 int n1, n2 , result;				
					try {
						
						n1 = Integer.parseInt(textFieldNumber1.getText());
						n2 = Integer.parseInt(textFieldNumber2.getText());
						result = n1 * n2 ;
						
						textFieldResult.setText(Integer.toString(result) ) ;
					} catch(Exception ex) {
						JOptionPane.showMessageDialog(null, "Please enter a valid number");
						textFieldNumber1.setText("");
						textFieldNumber2.setText("");
						textFieldNumber1.requestFocus();
					}
					
			}
		});
		btnAddMult.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAddMult.setBounds(85, 125, 66, 23);
		frmGuiCalculator.getContentPane().add(btnAddMult);
	}
}
