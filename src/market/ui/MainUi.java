package market.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;

public class MainUi extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;

	

	/**
	 * Create the frame.
	 */
	public MainUi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(5, 5, 1450, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCounter = new JLabel("Counter 1");
		lblCounter.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblCounter.setBounds(24, 92, 63, 14);
		contentPane.add(lblCounter);
		
		JLabel lblCounter_1 = new JLabel("Counter 2");
		lblCounter_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblCounter_1.setBounds(24, 132, 63, 14);
		contentPane.add(lblCounter_1);
		
		textField = new JTextField();
		textField.setBounds(85, 89, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(85, 129, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCounter_2 = new JLabel("Counter 3");
		lblCounter_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblCounter_2.setBounds(24, 173, 63, 14);
		contentPane.add(lblCounter_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(85, 170, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setBounds(24, 222, 46, 14);
		contentPane.add(label);
		
		JLabel lblCounter_3 = new JLabel("Counter 4");
		lblCounter_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblCounter_3.setBounds(24, 210, 56, 14);
		contentPane.add(lblCounter_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(85, 207, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblCounter_4 = new JLabel("Counter 5");
		lblCounter_4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblCounter_4.setBounds(24, 247, 63, 14);
		contentPane.add(lblCounter_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(85, 244, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblCounter_5 = new JLabel("Counter 6");
		lblCounter_5.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblCounter_5.setBounds(24, 281, 63, 14);
		contentPane.add(lblCounter_5);
		
		textField_5 = new JTextField();
		textField_5.setBounds(85, 278, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblCounter_6 = new JLabel("Counter 7");
		lblCounter_6.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblCounter_6.setBounds(24, 316, 63, 14);
		contentPane.add(lblCounter_6);
		
		textField_6 = new JTextField();
		textField_6.setBounds(85, 313, 86, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblCounter_7 = new JLabel("Counter 8");
		lblCounter_7.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblCounter_7.setBounds(24, 352, 63, 14);
		contentPane.add(lblCounter_7);
		
		textField_7 = new JTextField();
		textField_7.setBounds(85, 349, 86, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JButton btnStart = new JButton("Start");
		btnStart.setBounds(50, 390, 89, 23);
		contentPane.add(btnStart);
		
		JLabel lblCustomersInThe = new JLabel("Customers in the store");
		lblCustomersInThe.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblCustomersInThe.setBounds(10, 11, 138, 14);
		contentPane.add(lblCustomersInThe);
		
		textField_8 = new JTextField();
		textField_8.setBounds(24, 36, 86, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblStatistics = new JLabel("Statistics");
		lblStatistics.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblStatistics.setBounds(449, 48, 77, 14);
		contentPane.add(lblStatistics);
		
		JLabel lblWaitingTimeFor = new JLabel("Waiting time for the customer");
		lblWaitingTimeFor.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblWaitingTimeFor.setBounds(324, 89, 171, 14);
		contentPane.add(lblWaitingTimeFor);
		
		textField_9 = new JTextField();
		textField_9.setBounds(532, 89, 86, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblUtilisationTimeOf = new JLabel("Utilisation time of the customer");
		lblUtilisationTimeOf.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblUtilisationTimeOf.setBounds(324, 132, 180, 14);
		contentPane.add(lblUtilisationTimeOf);
		
		textField_10 = new JTextField();
		textField_10.setBounds(532, 129, 86, 20);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblProductsProcessed = new JLabel("Products Processed");
		lblProductsProcessed.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblProductsProcessed.setBounds(324, 173, 163, 14);
		contentPane.add(lblProductsProcessed);
		
		textField_11 = new JTextField();
		textField_11.setBounds(532, 170, 86, 20);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblAverageWaitingTime = new JLabel("Average waiting time for the customer");
		lblAverageWaitingTime.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblAverageWaitingTime.setBounds(324, 210, 202, 14);
		contentPane.add(lblAverageWaitingTime);
		
		textField_12 = new JTextField();
		textField_12.setBounds(532, 207, 86, 20);
		contentPane.add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblAverageUtilisationIn = new JLabel("Average Utilisation in Counters");
		lblAverageUtilisationIn.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblAverageUtilisationIn.setBounds(324, 247, 191, 14);
		contentPane.add(lblAverageUtilisationIn);
		
		textField_13 = new JTextField();
		textField_13.setBounds(532, 244, 86, 20);
		contentPane.add(textField_13);
		textField_13.setColumns(10);
		
		JLabel lblAverageProductsIn = new JLabel("Average Products in the trolley");
		lblAverageProductsIn.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblAverageProductsIn.setBounds(324, 281, 180, 14);
		contentPane.add(lblAverageProductsIn);
		
		textField_14 = new JTextField();
		textField_14.setBounds(532, 278, 86, 20);
		contentPane.add(textField_14);
		textField_14.setColumns(10);
		
		JLabel lblNumberOfCustomers = new JLabel("Number of Customers Who left ");
		lblNumberOfCustomers.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNumberOfCustomers.setBounds(324, 316, 191, 14);
		contentPane.add(lblNumberOfCustomers);
		
		textField_15 = new JTextField();
		textField_15.setBounds(532, 313, 86, 20);
		contentPane.add(textField_15);
		textField_15.setColumns(10);
	}



	public JTextField getTextField() {
		return textField;
	}



	public JTextField getTextField_1() {
		return textField_1;
	}



	public JTextField getTextField_2() {
		return textField_2;
	}



	public JTextField getTextField_3() {
		return textField_3;
	}



	public JTextField getTextField_4() {
		return textField_4;
	}



	public JTextField getTextField_5() {
		return textField_5;
	}



	public JTextField getTextField_6() {
		return textField_6;
	}



	public JTextField getTextField_7() {
		return textField_7;
	}



	public JTextField getTextField_8() {
		return textField_8;
	}



	public JTextField getTextField_9() {
		return textField_9;
	}



	public JTextField getTextField_10() {
		return textField_10;
	}



	public JTextField getTextField_11() {
		return textField_11;
	}



	public JTextField getTextField_12() {
		return textField_12;
	}



	public JTextField getTextField_13() {
		return textField_13;
	}



	public JTextField getTextField_14() {
		return textField_14;
	}



	public JTextField getTextField_15() {
		return textField_15;
	}
}
