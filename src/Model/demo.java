package Model;

import java.awt.EventQueue;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton; 
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class demo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtID;
	private JTextField txtName;
	private JTextField txtQuantity;
	private JTextField txtCost;
	private JButton btnAdd;
	private JButton btnEdit;
	private JButton btnDelete;
	private JButton btnSave;
	private JButton btnCancel;
	
	ArrayList<ElectronicDevice> list = new ArrayList<ElectronicDevice>();
	ElectronicDevice x;
	private static int pos = 0;    // for table only
	private static int check = 0;  // for edit
	private JTable table;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					demo frame = new demo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void view(){
		x = list.get(pos);
		this.txtID.setText(""+x.getId());
		this.txtName.setText(x.getName());
		this.txtQuantity.setText(""+x.getQuantity());
		this.txtCost.setText(""+x.getCost());
	}
	
	public void viewTable(){
		DefaultTableModel dtm = (DefaultTableModel)table.getModel();
		dtm.setNumRows(0);
		for (ElectronicDevice x : list)
			dtm.addRow(new Object[]{x.getId(), x.getName(), x.getType(), x.getQuantity(), x.getCost()});
	}
	
	public void OnOff (boolean a, boolean b) {
		btnSave.show(b);
		btnCancel.show(b);
		btnAdd.show(a);
		btnEdit.show(a);
		btnDelete.show(a);
	}

	/**
	 * Create the frame.
	 */
	public demo() {

		setTitle("QuanLyLinhKienDienTu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1008, 538);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("THT Company");
		lblNewLabel.setBounds(21, 23, 302, 37);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Products");
		lblNewLabel_1.setBounds(21, 101, 102, 25);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(21, 137, 122, 37);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Resistor", "Capacitor", "Sensor", "Microcontroller"}));
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_1_1 = new JLabel("ID");
		lblNewLabel_1_1.setBounds(162, 101, 102, 25);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Name");
		lblNewLabel_1_1_1.setBounds(162, 149, 102, 25);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Quantity");
		lblNewLabel_1_1_2.setBounds(162, 200, 102, 25);
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Cost");
		lblNewLabel_1_1_3.setBounds(162, 253, 102, 25);
		lblNewLabel_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lblNewLabel_1_1_3);
		
		txtID = new JTextField();
		txtID.setBounds(263, 101, 96, 26);
		contentPane.add(txtID);
		txtID.setColumns(10);
		
		txtName = new JTextField();
		txtName.setBounds(263, 149, 96, 26);
		txtName.setColumns(10);
		contentPane.add(txtName);
		
		txtQuantity = new JTextField();
		txtQuantity.setBounds(263, 203, 96, 26);
		txtQuantity.setColumns(10);
		contentPane.add(txtQuantity);
		
		txtCost = new JTextField();
		txtCost.setBounds(263, 252, 96, 26);
		txtCost.setColumns(10);
		contentPane.add(txtCost);
		
		btnAdd = new JButton("Add");
		btnAdd.setBounds(34, 321, 89, 37);
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtID.setText("");
				txtName.setText("");
				txtQuantity.setText("");
				txtCost.setText("");
				OnOff(false,true);
				check = 1;
			}
		});
		contentPane.add(btnAdd);
		
		btnEdit = new JButton("Edit");
		btnEdit.setBounds(154, 321, 89, 37);
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OnOff(false,true);
				check = -1;
			}
		});
		btnEdit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(btnEdit);
		
		btnDelete = new JButton("Delete");
		btnDelete.setBounds(273, 321, 102, 37);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(btnDelete);
		
		btnCancel = new JButton("Cancel");
		btnCancel.setBounds(143, 385, 109, 37);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OnOff(true,false);
				viewTable();
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(btnCancel);
		
		btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Check if there is nothing in the textField
				int id = Integer.parseInt(txtID.getText());
				String name = txtName.getText();
				int quantity = Integer.parseInt(txtQuantity.getText());
				double cost = Double.parseDouble(txtCost.getText());
				if (check == 1) {
					if (comboBox.getSelectedIndex()==0)
						list.add(new Resistor(name,"TDK",id,quantity,"","",cost,5,0.2,10000));
					else if (comboBox.getSelectedIndex()==1)
						list.add(new Capacitor(name,"TDK",id,quantity,"","",cost,25,0.2,10));
					else if (comboBox.getSelectedIndex()==2)
						list.add(new Sensor(name,"Adafruit",id,quantity,"","",cost,5,3,"Temperature"));
					else
						list.add(new Microcontroller(name,"STMElectronics",id,quantity,"","",cost,5,3,8,32,"ARM"));
				}
				else if (check == -1) {
					
				}
				viewTable();
				OnOff(true,false);
			}
		});
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSave.setBounds(34, 385, 89, 37);
		contentPane.add(btnSave);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(388, 23, 585, 444);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				pos = table.getSelectedRow();
				view();
			}
		});
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pos = table.getSelectedRow();
				view();
			}
		});
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"ID", "Name", "Type", "Quantity", "Cost"
			}
		));
		scrollPane.setViewportView(table);
		
		//////////
		list.add(new Resistor("Res10kOhm","TDK",80424,10,"","",0.15,5,0.2,10000));
		list.add(new Capacitor("Cap10uF","TDK",81235,20,"","",0.2,25,0.2,10));
		list.add(new Sensor("DHT11","Adafruit",84512,5,"","",10,5,3,"Temperature"));
		list.add(new Microcontroller("STM32F1","STMElectronics",56134,5,"","",12,5,3,8,32,"ARM"));
		viewTable();
		OnOff(true, false);
		//////////
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnExit.setBounds(273, 385, 89, 37);
		contentPane.add(btnExit);
	}
}
