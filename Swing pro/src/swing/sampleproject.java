package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class sampleproject {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sampleproject window = new sampleproject();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public sampleproject() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 25));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(191, 79, 139, 20);
		frame.getContentPane().add(passwordField);
		
		textField_3 = new JTextField();
		textField_3.setBounds(191, 36, 139, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblUserName.setBounds(21, 39, 101, 17);
		frame.getContentPane().add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPassword.setBounds(24, 82, 98, 14);
		frame.getContentPane().add(lblPassword);
		
		JButton btnSignIn = new JButton("Sign in");
		btnSignIn.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSignIn.setBounds(19, 202, 89, 23);
		frame.getContentPane().add(btnSignIn);
		
		JButton btnSignOut = new JButton("Sign out");
		btnSignOut.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSignOut.setBounds(212, 202, 118, 23);
		frame.getContentPane().add(btnSignOut);
		
		JCheckBox chckbxReminder = new JCheckBox(" Reminder ");
		chckbxReminder.setBounds(204, 127, 97, 23);
		frame.getContentPane().add(chckbxReminder);
		textField_2.setColumns(10);
		textField_1.setColumns(10);
		textField.setColumns(10);
	}
}
