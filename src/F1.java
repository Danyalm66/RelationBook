import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class F1 {

	public JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	public static String Em;
	public static String pWord;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					F1 window = new F1();
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
	public F1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(UIManager.getColor("Button.highlight"));
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 463, 469);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblRbMessenger = new JLabel("RelationBook");
		lblRbMessenger.setForeground(SystemColor.textHighlight);
		lblRbMessenger.setHorizontalAlignment(SwingConstants.CENTER);
		lblRbMessenger.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRbMessenger.setBounds(129, 143, 174, 28);
		frame.getContentPane().add(lblRbMessenger);
		
		JLabel lblWelcomeTo_1 = new JLabel("Login To");
		lblWelcomeTo_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeTo_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblWelcomeTo_1.setBounds(119, 75, 186, 71);
		frame.getContentPane().add(lblWelcomeTo_1);
		
		JButton btnContinue = new JButton("CREATE AN ACCOUNT");
		btnContinue.setBackground(SystemColor.window);
		btnContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				signUP su = new signUP();
				frame.setVisible(false);
				su.frame.setVisible(true);
			}
		});
		btnContinue.setForeground(SystemColor.textHighlight);
		btnContinue.setBounds(129, 334, 214, 28);
		frame.getContentPane().add(btnContinue);
		
		textField = new JTextField();
		textField.setBounds(225, 195, 137, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblByContinuingYour = new JLabel("By continuing your are indicating that you agree to the ");
		lblByContinuingYour.setForeground(Color.LIGHT_GRAY);
		lblByContinuingYour.setBounds(63, 373, 318, 28);
		frame.getContentPane().add(lblByContinuingYour);
		
		JLabel lblPrivacyPolicyAnd = new JLabel("Privacy policy and Terms.");
		lblPrivacyPolicyAnd.setForeground(Color.LIGHT_GRAY);
		lblPrivacyPolicyAnd.setBounds(62, 395, 158, 25);
		frame.getContentPane().add(lblPrivacyPolicyAnd);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(225, 237, 137, 20);
		frame.getContentPane().add(passwordField);
		
		JLabel lblEmailAddress = new JLabel("Email Address");
		lblEmailAddress.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEmailAddress.setBounds(63, 193, 105, 20);
		frame.getContentPane().add(lblEmailAddress);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPassword.setBounds(63, 237, 92, 20);
		frame.getContentPane().add(lblPassword);
		
		JButton button = new JButton("CONTINUE");
		button.setBackground(SystemColor.textHighlight);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProfilePage pg= new ProfilePage();
				signUP su= new signUP();
				Em = textField.getText();
				pWord = passwordField.getText();
				if(Em.equals(su.Email)){
					{if(pWord.equals(su.pass)){
						frame.setVisible(false);
						pg.frame1.setVisible(true);
					}else{
						JOptionPane.showMessageDialog(frame, "Invalid Password.");
					}}
			}else{
					JOptionPane.showMessageDialog(frame, "Invalid Email.");
			}
			}
		});
		button.setForeground(SystemColor.window);
		button.setBounds(129, 305, 214, 28);
		frame.getContentPane().add(button);
		
		
	}
}
