package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class converter {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	Double num1;
	Double num2;
	Double res1;
	Double res2;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					converter window = new converter();
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
	public converter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 584, 468);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setText(" ");
		textField.setBounds(166, 133, 152, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText(" ");
		textField_1.setColumns(10);
		textField_1.setBounds(166, 216, 152, 26);
		frame.getContentPane().add(textField_1);
		
		JLabel lblNewLabel = new JLabel(" Height");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(27, 131, 71, 26);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblWeight = new JLabel(" Weight");
		lblWeight.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblWeight.setBounds(27, 214, 71, 26);
		frame.getContentPane().add(lblWeight);
		
		JLabel lblUsMesurement = new JLabel("Us Measurement");
		lblUsMesurement.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblUsMesurement.setBounds(166, 73, 152, 26);
		frame.getContentPane().add(lblUsMesurement);
		
		JLabel label = new JLabel("New label");
		label.setBounds(428, 97, 63, -30);
		frame.getContentPane().add(label);
		
		JLabel lblNewLabel_1 = new JLabel("Metric");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(416, 73, 86, 26);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel l2 = new JLabel("");
		l2.setBounds(410, 128, 71, 29);
		frame.getContentPane().add(l2);
		
		JLabel l3 = new JLabel("");
		l3.setBounds(410, 206, 77, 19);
		frame.getContentPane().add(l3);
		
		JLabel label_1 = new JLabel(" ");
		label_1.setBounds(410, 132, 71, 29);
		frame.getContentPane().add(label_1);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			String ans;
			String ans1;
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				num2=Double.parseDouble(textField_1.getText());
				res1=num1/3.28;
				ans =String.format("%.2f m ",res1);
				l2.setText( ans);
				res2=num2/2.205;
				ans1 =String.format("%.2f kg",res2);
				l3.setText( ans1);
				
			}
		});
		btnOk.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnOk.setBounds(90, 341, 89, 34);
		frame.getContentPane().add(btnOk);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCancel.setBounds(303, 341, 117, 34);
		frame.getContentPane().add(btnCancel);
		
		
		
		
		
		
	}
}
