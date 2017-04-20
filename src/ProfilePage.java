import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ProfilePage extends signUP{

	public JFrame frame1;
	public static JLabel lblFirstname,lblEnteredemail ;
	private JLabel lblRelationbook;
	public static JLabel genderS;	
	public JLabel dOfBirth;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProfilePage window = new ProfilePage();
					window.frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	/**
	 * Create the application.
	 */
	public ProfilePage() {
		
		frame1 = new JFrame();
		frame1.getContentPane().setBackground(Color.WHITE);
		frame1.setBounds(100, 100, 339, 508);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.getContentPane().setLayout(null);
		
		lblFirstname = new JLabel();
		lblFirstname.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblFirstname.setHorizontalAlignment(SwingConstants.CENTER);
		lblFirstname.setBounds(30, 104, 252, 52);
		frame1.getContentPane().add(lblFirstname);
		signUP su = new signUP();
		lblFirstname.setText(su.uName);
	   
		JLabel lblRelationbook = new JLabel("RelationBook ");
		lblRelationbook.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRelationbook.setHorizontalAlignment(SwingConstants.CENTER);
		lblRelationbook.setForeground(SystemColor.textHighlight);
		lblRelationbook.setBackground(SystemColor.textHighlight);
		lblRelationbook.setBounds(10, 0, 303, 30);
		frame1.getContentPane().add(lblRelationbook);
		
		JLabel lblWelcome = new JLabel("WELCOME");
		lblWelcome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setBounds(20, 41, 262, 67);
		frame1.getContentPane().add(lblWelcome);
		
		JLabel lblEmailAddress = new JLabel("Email Address");
		lblEmailAddress.setBounds(20, 179, 92, 19);
		frame1.getContentPane().add(lblEmailAddress);
		
		lblEnteredemail = new JLabel();
		lblEnteredemail.setHorizontalAlignment(SwingConstants.LEFT);
		lblEnteredemail.setBounds(158, 179, 155, 19);
		frame1.getContentPane().add(lblEnteredemail);
		lblEnteredemail.setText(su.Email);
		
		JLabel lblNewLabel = new JLabel("Gender");
		lblNewLabel.setBounds(20, 209, 72, 19);
		frame1.getContentPane().add(lblNewLabel);
		
		genderS = new JLabel();
		genderS.setHorizontalAlignment(SwingConstants.LEFT);
		genderS.setBounds(158, 209, 155, 19);
		frame1.getContentPane().add(genderS);
		genderS.setText(su.Gender);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnLogout.setForeground(SystemColor.window);
		btnLogout.setBackground(SystemColor.textHighlight);
		btnLogout.setBounds(255, 4, 68, 23);
		frame1.getContentPane().add(btnLogout);
		
		JLabel lblDateOfBirth = new JLabel("Date of Birth");
		lblDateOfBirth.setBounds(20, 239, 72, 14);
		frame1.getContentPane().add(lblDateOfBirth);
		
		dOfBirth = new JLabel();
		dOfBirth.setBounds(158, 239, 155, 14);
		frame1.getContentPane().add(dOfBirth);
		dOfBirth.setText(su.dob);
		
		JLabel lblThisIsJust = new JLabel("This is just the begining...!");
		lblThisIsJust.setFont(lblThisIsJust.getFont().deriveFont(lblThisIsJust.getFont().getStyle() | Font.BOLD | Font.ITALIC));
		lblThisIsJust.setBackground(SystemColor.textHighlight);
		lblThisIsJust.setForeground(SystemColor.textHighlight);
		lblThisIsJust.setHorizontalAlignment(SwingConstants.CENTER);
		lblThisIsJust.setBounds(68, 389, 173, 14);
		frame1.getContentPane().add(lblThisIsJust);
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				F1 f = new F1();
				frame1.setVisible(false);
				JOptionPane.showMessageDialog(frame, "Thanks for using RelatinBook.\nKeep visit");
				f.frame.setVisible(true);
			}
			});
			}
	}
	

	    

