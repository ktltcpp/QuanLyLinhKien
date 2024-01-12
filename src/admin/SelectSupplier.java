package admin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SelectSupplier extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	///////////////////////////////////
	private static SelectSupplier frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new SelectSupplier();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SelectSupplier() {
		setBackground(new Color(0, 153, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 829, 581);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLUE);
		panel_1.setBounds(0, 0, 815, 544);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(27, 196, 765, 337);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Purchase ID", "User ID", "User name", "User phone", "Product ID", "Product name", "Quantity", "Price", "Total", "Purchase date", "Address", "Receive date", "Supplier name", "Status"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(3).setPreferredWidth(74);
		table.setFont(new Font("Tahoma", Font.PLAIN, 15));
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("Search");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(352, 159, 66, 25);
		panel_1.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setBounds(428, 159, 364, 26);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("X");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//System.exit(0);
				setVisible(false);
				AdminDashboard.panel_4_2_3.setBackground(Color.LIGHT_GRAY);
				AdminDashboard.lblNewLabel_4_2_3.setForeground(Color.BLACK);
				AdminDashboard.lblNewLabel_5_3_3.setVisible(true);
				AdminDashboard.lblNewLabel_5_1_2_3.setVisible(false);
			}
		});
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(756, 11, 49, 25);
		panel_1.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 17));
		comboBox.setBounds(27, 93, 200, 29);
		panel_1.add(comboBox);
		
		JLabel lblSupplier = new JLabel("Supplier");
		lblSupplier.setForeground(Color.WHITE);
		lblSupplier.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblSupplier.setBounds(27, 57, 98, 25);
		panel_1.add(lblSupplier);
		
		JLabel lblUserAccount = new JLabel("Select Suppliers");
		lblUserAccount.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserAccount.setForeground(Color.WHITE);
		lblUserAccount.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblUserAccount.setBounds(0, 0, 778, 46);
		panel_1.add(lblUserAccount);
		
		JButton btnSelect = new JButton("SELECT");
		btnSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSelect.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSelect.setBounds(260, 80, 125, 52);
		panel_1.add(btnSelect);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnClear.setBounds(406, 80, 125, 52);
		panel_1.add(btnClear);
	}
}
