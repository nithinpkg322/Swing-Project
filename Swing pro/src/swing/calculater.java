package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class calculater {

	private JFrame frame;
	private JTextField textField;
	double num1;
	double num2;
	double result;
	String op;
	String ans;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculater window = new calculater();
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
	public calculater() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLUE);
		frame.setBounds(100, 100, 503, 466);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(12, 11, 376, 48);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btnNewButton.getText();
				textField.setText(Number);
				
			}
		});
		btnNewButton.setBounds(10, 146, 68, 30);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton(" 4");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button.getText();
				textField.setText(Number);	
				
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		button.setBounds(12, 207, 66, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton(" 5");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_1.getText();
				textField.setText(Number);	
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_1.setBounds(120, 207, 68, 23);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton(" +");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				 op="+";
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_2.setBounds(350, 148, 68, 27);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton(" 3");
		button_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_3 .getText();
				textField.setText(Number);
			}
		});
		button_3.setBounds(229, 146, 74, 30);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton(" 2");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_4.getText();
				textField.setText(Number);
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_4.setBounds(120, 146, 68, 30);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton(" 6");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_5.getText();
				textField.setText(Number);
			}
		});
		button_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_5.setBounds(229, 207, 74, 23);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton(" 7");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_6.getText();
				textField.setText(Number);
			}
		});
		button_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_6.setBounds(10, 272, 68, 23);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton(" -");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				 op="-";
			}
		});
		button_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_7.setBounds(350, 203, 68, 30);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton(" 8");
		button_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_8.getText();
				textField.setText(Number);
			}
		});
		button_8.setBounds(120, 272, 68, 23);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("0");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_9.getText();
				textField.setText(Number);
			}
		});
		button_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_9.setBounds(10, 336, 68, 23);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton(" 9");
		button_10.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_10.getText();
				textField.setText(Number);
			}
		});
		button_10.setBounds(229, 272, 74, 23);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton(" *");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				 op="*";
			}
		});
		button_11.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_11.setBounds(356, 272, 70, 23);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton(" /");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				 op="/";
			}
		});
		button_12.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_12.setBounds(356, 336, 68, 23);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton(" =");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ans;
				num2=Double.parseDouble(textField.getText());
				if(op=="+")
				{
					result=num1+num2;
				ans=String.format("%.2f",result);
				textField.setText(ans);
				}
			if(op=="-")
			{
				result=num1-num2;
			ans=String.format("%.2f",result);
			textField.setText(ans);
		}
			if(op=="*")
			{
			result=num1*num2;
			ans=String.format("%.2f",result);
			textField.setText(ans);
			}
			if(op=="/")
			{
			result=num1/num2;
			ans=String.format("%.2f",result);
			textField.setText(ans);
			}
			}
		});
		button_13.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_13.setBounds(229, 336, 74, 23);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton(" .");
		button_14.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		button_14.setBounds(120, 336, 73, 23);
		frame.getContentPane().add(button_14);
		
		JButton btnC = new JButton(" c");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnC.setBounds(107, 394, 68, 23);
		frame.getContentPane().add(btnC);
		
		JButton btnB = new JButton(" B");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String b=null;
				if(textField.getText().length()>0)
				{
					StringBuilder strB=new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length()-1);
					b=strB.toString();
					textField.setText(b);
				}
			}
		});
		btnB.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnB.setBounds(235, 394, 68, 23);
		frame.getContentPane().add(btnB);
		
		JButton button_17 = new JButton(" %");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				 op="%";
			}
		});
		button_17.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_17.setBounds(356, 394, 68, 23);
		frame.getContentPane().add(button_17);
		
		JButton btnNewButton_1 = new JButton(" Power");
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(379, 94, 98, 23);
		frame.getContentPane().add(btnNewButton_1);
	}

}
