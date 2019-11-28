package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class scientificcalculator {

	private JFrame frame;
	private JTextField textField;
	double result;
	double num1;
	double num2;
	double ansq;
	String op;
	String ans;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					scientificcalculator window = new scientificcalculator();
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
	public scientificcalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 578, 467);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(33, 11, 445, 59);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblScientific = new JLabel(" scientific");
		lblScientific.setForeground(Color.RED);
		lblScientific.setBackground(Color.RED);
		lblScientific.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblScientific.setBounds(33, 133, 110, 19);
		frame.getContentPane().add(lblScientific);
		
		JLabel lblNewLabel = new JLabel("standard");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(376, 127, 80, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setBounds(10, 171, 247, 247);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("sqrt");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				result=Math.sqrt(num1);
				ans=String.format("%.2f",result);

			textField.setText(ans);
				
				
			}
		});
		btnNewButton.setBounds(10, 11, 51, 44);
		panel.add(btnNewButton);
		
		JButton btnx = new JButton(" 1/x");
		btnx.setBounds(81, 11, 51, 44);
		panel.add(btnx);
		
		JButton btnSin = new JButton("sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				result=Math.sin(num1);
				ans=String.format("%.2f",result);

			textField.setText(ans);
			}
		});
		btnSin.setBounds(163, 11, 51, 44);
		panel.add(btnSin);
		
		JButton btnCos = new JButton(" cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				result=Math.cos(num1);
				ans=String.format("%.2f",result);

			textField.setText(ans);
			}
		});
		btnCos.setBounds(163, 77, 51, 44);
		panel.add(btnCos);
		
		JButton btnExp = new JButton(" Exp");
		btnExp.setBounds(81, 77, 58, 44);
		panel.add(btnExp);
		
		JButton button_4 = new JButton("%");
		button_4.setBounds(10, 77, 51, 44);
		panel.add(button_4);
		
		JButton btnXy = new JButton(" x^y");
		btnXy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnXy.setBounds(10, 142, 58, 44);
		panel.add(btnXy);
		
		JButton btnIn = new JButton("in");
		btnIn.setBounds(91, 142, 51, 44);
		panel.add(btnIn);
		
		JButton btnX = new JButton("x^2");
		btnX.setBounds(10, 203, 58, 44);
		panel.add(btnX);
		
		JButton btnN = new JButton("n!");
		btnN.setBounds(88, 203, 51, 44);
		panel.add(btnN);
		
		JButton btnSec = new JButton("sec");
		btnSec.setBounds(163, 198, 51, 44);
		panel.add(btnSec);
		
		JButton btnTan = new JButton("tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				result=Math.tan(num1);
				ans=String.format("%.2f",result);

			textField.setText(ans);
			}
		});
		btnTan.setBounds(163, 142, 51, 44);
		panel.add(btnTan);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.PINK);
		panel_1.setBounds(267, 171, 285, 247);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton_1 = new JButton(" 7");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btnNewButton_1.getText();
				textField.setText(Number);
			}
		});
		btnNewButton_1.setBounds(10, 11, 49, 35);
		panel_1.add(btnNewButton_1);
		
		JButton button = new JButton(" 8");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button.getText();
				textField.setText(Number);
			}
		});
		button.setBounds(92, 11, 49, 35);
		panel_1.add(button);
		
		JButton button_1 = new JButton(" 9");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_1.getText();
				textField.setText(Number);
			}
		});
		button_1.setBounds(165, 11, 49, 35);
		panel_1.add(button_1);
		
		JButton button_2 = new JButton("%");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				 op="%";
			}
		});
		button_2.setBounds(236, 11, 49, 35);
		panel_1.add(button_2);
		
		JButton button_3 = new JButton("/");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				 op="/";
			}
			
		});
		button_3.setBounds(236, 73, 49, 35);
		panel_1.add(button_3);
		
		JButton button_5 = new JButton(" 6");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_5.getText();
				textField.setText(Number);
			}
		});
		button_5.setBounds(165, 73, 49, 35);
		panel_1.add(button_5);
		
		JButton button_6 = new JButton(" 5");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_6.getText();
				textField.setText(Number);
			}
		});
		button_6.setBounds(92, 73, 49, 35);
		panel_1.add(button_6);
		
		JButton button_8 = new JButton(" 3");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_8.getText();
				textField.setText(Number);
			}
		});
		button_8.setBounds(10, 136, 49, 35);
		panel_1.add(button_8);
		
		JButton button_9 = new JButton(" 2");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_9.getText();
				textField.setText(Number);
			}
		});
		button_9.setBounds(92, 136, 49, 35);
		panel_1.add(button_9);
		
		JButton button_10 = new JButton(" 1");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_10.getText();
				textField.setText(Number);
			}
			
			
		});
		button_10.setBounds(165, 136, 49, 35);
		panel_1.add(button_10);
		
		JButton button_11 = new JButton(" -");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				 op="-";
			}
		});
		button_11.setBounds(236, 136, 49, 35);
		panel_1.add(button_11);
		
		JButton button_12 = new JButton(" +");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				 op="+";
			}
		});
		button_12.setBounds(236, 193, 49, 29);
		panel_1.add(button_12);
		
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
			}
		);
		button_13.setBounds(165, 196, 49, 29);
		panel_1.add(button_13);
		
		JButton button_14 = new JButton(" .");
		button_14.setBounds(92, 193, 49, 32);
		panel_1.add(button_14);
		
		JButton button_15 = new JButton(" 0");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_15.getText();
				textField.setText(Number);
			}
		});
		button_15.setBounds(10, 196, 49, 29);
		panel_1.add(button_15);
		
		JButton button_7 = new JButton(" 4");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_7.getText();
				textField.setText(Number);
			}
		});
		button_7.setBounds(10, 74, 56, 35);
		panel_1.add(button_7);
	}
}
