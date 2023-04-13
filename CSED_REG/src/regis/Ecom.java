package regis;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ecom {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ecom window = new Ecom();
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
	public Ecom() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 675, 421);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\i1.jpg"));
		lblNewLabel.setBounds(10, 76, 196, 157);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\i2.jpg"));
		lblNewLabel_1.setBounds(243, 88, 223, 170);
		frame.getContentPane().add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"22carat", "24carat"}));
		comboBox.setBounds(327, 279, 92, 22);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"22 carat", "24 carat"}));
		comboBox_1.setBounds(36, 279, 132, 22);
		frame.getContentPane().add(comboBox_1);
		
		JLabel c = new JLabel("cart  :");
		c.setFont(new Font("Arial", Font.BOLD, 18));
		c.setBounds(456, 34, 68, 14);
		frame.getContentPane().add(c);
		
		JLabel lblNewLabel_2 = new JLabel("69000-/-");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 17));
		lblNewLabel_2.setForeground(Color.MAGENTA);
		lblNewLabel_2.setBounds(46, 312, 92, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("70000-/-");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 17));
		lblNewLabel_3.setBounds(337, 313, 89, 12);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Add to CART");
		btnNewButton.addActionListener(new ActionListener() {
			int i=0;
			public void actionPerformed(ActionEvent e) {
				i++;
				c.setText("cart :"+i);
			}
		});
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 17));
		btnNewButton.setBounds(36, 337, 160, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add to CART");
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 17));
		btnNewButton_1.setBounds(322, 337, 160, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
}
