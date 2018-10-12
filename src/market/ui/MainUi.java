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

public class MainUi extends JFrame {

	private JPanel contentPane;
	private JTextField txNumOfCheckouts;
	private JTextField txAvgWt;

	

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
		
		JLabel lblNewLabel = new JLabel("Number of Checkouts");
		lblNewLabel.setBounds(10, 11, 138, 14);
		contentPane.add(lblNewLabel);
		
		txNumOfCheckouts = new JTextField();
		txNumOfCheckouts.setBounds(158, 8, 86, 20);
		contentPane.add(txNumOfCheckouts);
		txNumOfCheckouts.setColumns(10);
		
		JButton btnNewButton = new JButton("Start");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Need to start the whole process
				System.out.println(txNumOfCheckouts.getText());
				txAvgWt.setText(txNumOfCheckouts.getText()+"rr");
				System.out.println(Thread.currentThread());
				
			}
		});
		btnNewButton.setBounds(10, 47, 89, 23);
		contentPane.add(btnNewButton);
		
		JPanel stats = new JPanel();
		stats.setBorder(new TitledBorder(null, "Stats", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		stats.setBounds(10, 96, 269, 187);
		contentPane.add(stats);
		
		JLabel lblNewLabel_1 = new JLabel("Avg Waiting Time");
		
		txAvgWt = new JTextField();
		txAvgWt.setColumns(10);
		GroupLayout gl_stats = new GroupLayout(stats);
		gl_stats.setHorizontalGroup(
			gl_stats.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_stats.createSequentialGroup()
					.addComponent(lblNewLabel_1)
					.addPreferredGap(ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
					.addComponent(txAvgWt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_stats.setVerticalGroup(
			gl_stats.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_stats.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_stats.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(txAvgWt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(140, Short.MAX_VALUE))
		);
		stats.setLayout(gl_stats);
	}
}
