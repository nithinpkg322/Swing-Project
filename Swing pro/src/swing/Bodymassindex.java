package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bodymassindex {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	Double num1;
	Double num2;
	Double res1;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bodymassindex window = new Bodymassindex();
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
	public Bodymassindex() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 522, 431);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(177, 115, 115, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(177, 177, 115, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblHieght = new JLabel(" Hieght(mtr)");
		lblHieght.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblHieght.setBounds(10, 118, 106, 20);
		frame.getContentPane().add(lblHieght);
		
		JLabel lblWieght = new JLabel(" Wieght (kg)");
		lblWieght.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblWieght.setBounds(10, 180, 106, 20);
		frame.getContentPane().add(lblWieght);
		
		JLabel lblBmi = new JLabel(" BMI");
		lblBmi.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblBmi.setBounds(10, 257, 91, 14);
		frame.getContentPane().add(lblBmi);
		
		textField_2 = new JTextField();
		textField_2.setBounds(177, 250, 115, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel l1 = new JLabel(" ");
		l1.setBounds(363, 250, 106, 23);
		frame.getContentPane().add(l1);
		
		JButton btnNewButton = new JButton(" calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				num2=Double.parseDouble(textField_1.getText());
				double res =(num1/num2/num2)*1000;
			String ans =String.format("%.2f",res);
			textField_2.setText(ans);
				l1.setText( ans);
				if(res<18.5)
				{
					l1.setText("Under wieght");
				}
			 if(res>18.5&&res<24.9)
			 {
				 l1.setText("Normal weight");
			 }
			 if(res<25&&res<29.9)
			 {
				 l1.setText("overweight"); 
			 }
			 if(res>30)
			 {
				 l1.setText("obese"); 
			 }
			 }
			 
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(40, 324, 106, 29);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton(" clear");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(203, 321, 89, 29);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton(" exit");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.setBounds(356, 321, 89, 29);
		frame.getContentPane().add(btnNewButton_2);
	}

}
