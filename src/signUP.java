import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.text.JTextComponent;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class signUP {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;
	public static String fN,lN,uName,Email,pass,Gender,spinner1,spinner2,spinner3,dob;
	private JButton btnContinue;
	public ButtonGroup bg = new ButtonGroup();
	
	public static boolean validateEmail(String email) 
	 { 
		 boolean status=false; 
		 String EMAIL_PATTERN = "[a-zA-Z0-9]+[._a-zA-Z0-9!#$%&'*+-/=?^_`{|}~]*[a-zA-Z]*@[a-zA-Z0-9]{2,8}.[a-zA-Z.]{2,6}"; 
		 Pattern patternE = Pattern.compile(EMAIL_PATTERN); 
		 Matcher matcherE=patternE.matcher(email); 
		 if(matcherE.matches()) {
			 status=true; 
			 } else{
				 status=false; 
				 } 
		 return status; }

	/**
	 * Launch the application.   
	 * 
	 */
	public static void main(String[] args) { 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signUP window = new signUP();
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
	public signUP() {

		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.text);
		frame.getContentPane().setForeground(SystemColor.textHighlightText);
		frame.setBounds(100, 100, 339, 511);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sign Up for RelationBook ");
		lblNewLabel.setForeground(SystemColor.textHighlight);
		lblNewLabel.setBackground(SystemColor.textHighlight);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 0, 303, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setBounds(20, 41, 86, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(20, 62, 138, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		
		
		JLabel lblNewLabel_2 = new JLabel("Last Name");
		lblNewLabel_2.setBounds(19, 82, 75, 20);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(20, 101, 138, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		
		JLabel lblNewLabel_3 = new JLabel("Email or Phone");
		lblNewLabel_3.setBounds(20, 123, 86, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(20, 140, 138, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		
		JLabel lblNewLabel_4 = new JLabel("Gender");
		lblNewLabel_4.setBounds(20, 160, 46, 20);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Date of Birth");
		lblNewLabel_5.setBounds(20, 258, 86, 20);
		frame.getContentPane().add(lblNewLabel_5);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(1, 1, 12, 1));
		spinner_1.setBounds(20, 283, 39, 20);
		frame.getContentPane().add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		spinner_2.setBounds(55, 283, 39, 20);
		frame.getContentPane().add(spinner_2);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setModel(new SpinnerNumberModel(1900, 1900, 2018, 1));
		spinner_3.setBounds(92, 283, 54, 20);
		frame.getContentPane().add(spinner_3);
		
		
		
		JLabel lblNewLabel_6 = new JLabel("Choose a Password");
		lblNewLabel_6.setBounds(20, 308, 125, 20);
		frame.getContentPane().add(lblNewLabel_6);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(20, 326, 138, 20);
		frame.getContentPane().add(passwordField);
		
		
		btnContinue = new JButton("Continue");
		btnContinue.setForeground(SystemColor.text);
		btnContinue.setBackground(SystemColor.textHighlight);
		btnContinue.setBounds(23, 427, 89, 23);
		frame.getContentPane().add(btnContinue);
		
		

	
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBackground(new Color(230, 230, 250));
		btnCancel.setForeground(SystemColor.desktop);
		btnCancel.setBounds(112, 427, 89, 23);
		frame.getContentPane().add(btnCancel);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				F1 lg = new F1();
				lg.frame.setVisible(true);
			}
		});
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBackground(Color.WHITE);
		rdbtnMale.setBounds(20, 182, 109, 23);
		frame.getContentPane().add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBackground(Color.WHITE);
		rdbtnFemale.setBounds(20, 205, 109, 23);
		frame.getContentPane().add(rdbtnFemale);
		
		JRadioButton rdbtnOther = new JRadioButton("Other");
		rdbtnOther.setBackground(Color.WHITE);
		rdbtnOther.setBounds(20, 228, 109, 23);
		frame.getContentPane().add(rdbtnOther);
		bg.add(rdbtnMale);
		bg.add(rdbtnFemale);
		bg.add(rdbtnOther);
		
//--------------------------------------------------------------------------
		
		btnContinue.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				ProfilePage f = new ProfilePage();
				F1 login = new F1();
				fN = textField.getText();
				lN = textField_1.getText();		
				uName = fN+" "+lN;
				Email = textField_2.getText();
				Integer MM = (Integer) spinner_1.getValue();
				Integer DD = (Integer) spinner_2.getValue();
				Integer YY = (Integer) spinner_3.getValue();
				spinner1 = MM.toString();;
				spinner2 = DD.toString();
				spinner3= YY.toString();
				dob=spinner1+"/"+spinner2+"/"+spinner3;
				pass = passwordField.getText();
				 boolean status=signUP.validateEmail(Email);  
					 if(fN.length() >= 3){
						 	if(lN.length() > 4){
						 		if(status){
						 			if(rdbtnMale.isSelected()|| rdbtnFemale.isSelected()|| rdbtnOther.isSelected()){
						 						if( pass.length() >= 8){
						 							JOptionPane.showMessageDialog(frame, "Welcome\n"+fN+" "+lN+"\n Please login again.");
						 							frame.setVisible(false);
						 							login.frame.setVisible(true);
						 							if(rdbtnMale.isSelected()){
						 								Gender = "Male";
						 							}else if(rdbtnFemale.isSelected()){
						 								Gender = "Female";
						 							}else if(rdbtnOther.isSelected()){
						 								Gender = "Not Mentioned";
						 							}
						 						}else{
						 							JOptionPane.showMessageDialog(frame, "Invalid Password Length");
						 			}}else{
						 				JOptionPane.showMessageDialog(frame, "Invalid Gender");}
						 		}else{
									JOptionPane.showMessageDialog(frame, "Invalid Email Address");
						 	}
						 }else{
								JOptionPane.showMessageDialog(frame, "Invalid Last Name");}
					 }else{
							JOptionPane.showMessageDialog(frame, "Invalid First Name");
					}
			}

			});
		
	}

	
		}
	

		

