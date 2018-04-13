package com.swingDemo.Client;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.swingDemo.Model.Student;
import com.swingDemo.Service.StudentService;
import com.swingDemo.ServiceImpl.StudentServiceImpl;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Date;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JSeparator;
import javax.swing.ButtonGroup;

public class studentForm extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblName;
	private JTextField nameTxt;
	private JLabel lblBirthdate;
	private JDateChooser dateChooser;
	private JLabel lblRollNo;
	private JTextField rollnotxt;
	private JLabel lblFaculty;
	private JTextField facultytxt;
	private JLabel lblSemester;
	private JTextField semestertxt;
	private JLabel lblCollegeName;
	private JTextField collegetxt;
	private JPanel panel_1;
	private JRadioButton maleRbt;
	private JRadioButton femaleRbt;
	private JLabel lblAddress;
	private JTextField addresstxt;
	private JLabel lblPhoneno;
	private JTextField phonetxt;
	private JButton btnSave;
	private JScrollPane scrollPane;
	private JTable table;
	private JSeparator separator;
	private JButton btnBack;
	private JButton btnViewDetails;
	private JButton btnEdit;
	private JButton btnDelete;
	private JButton btnExit;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JButton btnPrint;
	private JButton btnGoogle;
	private JButton btnGoogle_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentForm frame = new studentForm();
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
	public studentForm() {
		setTitle("StudentForm");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 767, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
		contentPane.add(getScrollPane());
		contentPane.add(getSeparator());
		contentPane.add(getBtnBack());
		contentPane.add(getBtnViewDetails());
		contentPane.add(getBtnEdit());
		contentPane.add(getBtnDelete());
		contentPane.add(getBtnExit());
		contentPane.add(getBtnPrint());
		
		populateData();
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "StudentForm", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(10, 11, 725, 177);
			panel.setLayout(null);
			panel.add(getLblName());
			panel.add(getNameTxt());
			panel.add(getLblBirthdate());
			panel.add(getDateChooser());
			panel.add(getLblRollNo());
			panel.add(getRollnotxt());
			panel.add(getLblFaculty());
			panel.add(getFacultytxt());
			panel.add(getLblSemester());
			panel.add(getSemestertxt());
			panel.add(getLblCollegeName());
			panel.add(getCollegetxt());
			panel.add(getPanel_1());
			panel.add(getLblAddress());
			panel.add(getAddresstxt());
			panel.add(getLblPhoneno());
			panel.add(getPhonetxt());
			panel.add(getBtnSave());
			panel.add(getBtnGoogle());
			panel.add(getBtnGoogle_1());
		}
		return panel;
	}
	private JLabel getLblName() {
		if (lblName == null) {
			lblName = new JLabel("Name");
			lblName.setBounds(10, 24, 46, 14);
		}
		return lblName;
	}
	private JTextField getNameTxt() {
		if (nameTxt == null) {
			nameTxt = new JTextField();
			nameTxt.setBounds(68, 21, 104, 20);
			nameTxt.setColumns(10);
		}
		return nameTxt;
	}
	private JLabel getLblBirthdate() {
		if (lblBirthdate == null) {
			lblBirthdate = new JLabel("BirthDate");
			lblBirthdate.setBounds(206, 24, 61, 14);
		}
		return lblBirthdate;
	}
	private JDateChooser getDateChooser() {
		if (dateChooser == null) {
			dateChooser = new JDateChooser();
			dateChooser.getCalendarButton().addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			dateChooser.setBounds(287, 18, 120, 20);
		}
		return dateChooser;
	}
	private JLabel getLblRollNo() {
		if (lblRollNo == null) {
			lblRollNo = new JLabel("Roll No.");
			lblRollNo.setBounds(434, 24, 46, 14);
		}
		return lblRollNo;
	}
	private JTextField getRollnotxt() {
		if (rollnotxt == null) {
			rollnotxt = new JTextField();
			rollnotxt.setBounds(540, 21, 86, 20);
			rollnotxt.setColumns(10);
		}
		return rollnotxt;
	}
	private JLabel getLblFaculty() {
		if (lblFaculty == null) {
			lblFaculty = new JLabel("Faculty");
			lblFaculty.setBounds(10, 65, 46, 14);
		}
		return lblFaculty;
	}
	private JTextField getFacultytxt() {
		if (facultytxt == null) {
			facultytxt = new JTextField();
			facultytxt.setBounds(68, 62, 104, 20);
			facultytxt.setColumns(10);
		}
		return facultytxt;
	}
	private JLabel getLblSemester() {
		if (lblSemester == null) {
			lblSemester = new JLabel("Semester");
			lblSemester.setBounds(216, 65, 61, 14);
		}
		return lblSemester;
	}
	private JTextField getSemestertxt() {
		if (semestertxt == null) {
			semestertxt = new JTextField();
			semestertxt.setBounds(287, 62, 86, 20);
			semestertxt.setColumns(10);
		}
		return semestertxt;
	}
	private JLabel getLblCollegeName() {
		if (lblCollegeName == null) {
			lblCollegeName = new JLabel("College Name");
			lblCollegeName.setBounds(434, 65, 96, 14);
		}
		return lblCollegeName;
	}
	private JTextField getCollegetxt() {
		if (collegetxt == null) {
			collegetxt = new JTextField();
			collegetxt.setBounds(540, 62, 86, 20);
			collegetxt.setColumns(10);
		}
		return collegetxt;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBorder(new TitledBorder(null, "Gender", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_1.setBounds(10, 109, 168, 44);
			panel_1.setLayout(null);
			panel_1.add(getMaleRbt());
			panel_1.add(getFemaleRbt());
		}
		return panel_1;
	}
	private JRadioButton getMaleRbt() {
		if (maleRbt == null) {
			maleRbt = new JRadioButton("Male");
			buttonGroup.add(maleRbt);
			maleRbt.setBounds(6, 14, 56, 23);
		}
		return maleRbt;
	}
	private JRadioButton getFemaleRbt() {
		if (femaleRbt == null) {
			femaleRbt = new JRadioButton("Female");
			buttonGroup.add(femaleRbt);
			femaleRbt.setBounds(88, 14, 74, 23);
		}
		return femaleRbt;
	}
	private JLabel getLblAddress() {
		if (lblAddress == null) {
			lblAddress = new JLabel("Address");
			lblAddress.setBounds(206, 121, 61, 14);
		}
		return lblAddress;
	}
	private JTextField getAddresstxt() {
		if (addresstxt == null) {
			addresstxt = new JTextField();
			addresstxt.setBounds(287, 118, 86, 20);
			addresstxt.setColumns(10);
		}
		return addresstxt;
	}
	private JLabel getLblPhoneno() {
		if (lblPhoneno == null) {
			lblPhoneno = new JLabel("PhoneNo.");
			lblPhoneno.setBounds(434, 121, 68, 14);
		}
		return lblPhoneno;
	}
	private JTextField getPhonetxt() {
		if (phonetxt == null) {
			phonetxt = new JTextField();
			phonetxt.setBounds(497, 118, 86, 20);
			phonetxt.setColumns(10);
		}
		return phonetxt;
	}
	private JButton getBtnSave() {
		if (btnSave == null) {
			btnSave = new JButton("Save");
			btnSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Student s=new Student();
					
					s.setName(nameTxt.getText());
					s.setAddress(addresstxt.getText());
					s.setDob(new Date(dateChooser.getDate().getTime()));
					if(maleRbt.isSelected()){
						s.setGender("Male");
					}else{
						s.setGender("Female");
					}
					s.setCollege(collegetxt.getText());
					s.setSemester(semestertxt.getText());
					s.setFaculty(facultytxt.getText());
					s.setPhone(phonetxt.getText());
					s.setRollno(Integer.parseInt(rollnotxt.getText()));

					
					StudentServiceImpl ss=new StudentServiceImpl();
					if(ss.addstudent(s)){
						JOptionPane.showMessageDialog(null, "added succesfull");
						populateData();
					}else{
						JOptionPane.showMessageDialog(null, "error");
					}
				}
			});
			btnSave.setBounds(626, 117, 77, 23);
		}
		return btnSave;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 221, 725, 177);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Id", "Name", "Faculty", "College Name"
				}
			));
		}
		return table;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(10, 199, 725, 2);
		}
		return separator;
	}
	private JButton getBtnBack() {
		if (btnBack == null) {
			btnBack = new JButton("Back");
			btnBack.setBounds(78, 408, 89, 23);
		}
		return btnBack;
	}
	private JButton getBtnViewDetails() {
		if (btnViewDetails == null) {
			btnViewDetails = new JButton("View Details");
			btnViewDetails.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(table.getSelectedRow()<0){
						JOptionPane.showMessageDialog(null, "select any row");
						return;
					}
					
					int row=table.getSelectedRow();
					int id=(int) table.getModel().getValueAt(row, 0);
					
					viewform vf=new viewform();
					vf.displayAllData(id);
					vf.setVisible(true);
					
					dispose();
					
					
					
				}
			});
			btnViewDetails.setBounds(195, 408, 89, 23);
		}
		return btnViewDetails;
	}
	private JButton getBtnEdit() {
		if (btnEdit == null) {
			btnEdit = new JButton("Edit");
			btnEdit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(table.getSelectedRow()<0){
						JOptionPane.showMessageDialog(null, "select any row");
						return;
					}
					
					int row=table.getSelectedRow();
					int id=(int) table.getModel().getValueAt(row, 0);
					
					editForm ef=new editForm();
					ef.displayAllData(id);
					ef.setVisible(true);
					
					dispose();
					
				}
			});
			btnEdit.setBounds(305, 409, 89, 23);
		}
		return btnEdit;
	}
	private JButton getBtnDelete() {
		if (btnDelete == null) {
			btnDelete = new JButton("Delete");
			btnDelete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(table.getSelectedRow()<0){
						JOptionPane.showMessageDialog(null, "select any row");
						return;
					}
					
					int row=table.getSelectedRow();
					int id=(int) table.getModel().getValueAt(row, 0);
					
					StudentService ss=new StudentServiceImpl();
					if(ss.deletestudent(id)){
						JOptionPane.showMessageDialog(null, "delete successfull");
						populateData();
					}
				}
			});
			btnDelete.setBounds(424, 409, 89, 23);
		}
		return btnDelete;
	}
	private JButton getBtnExit() {
		if (btnExit == null) {
			btnExit = new JButton("Exit");
			btnExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
				}
			});
			btnExit.setBounds(533, 409, 89, 23);
		}
		return btnExit;
	}
	
	private void populateData(){
		StudentService ss=new StudentServiceImpl();
		List<Student> slist= ss.getAllStudent();
		
		DefaultTableModel model=(DefaultTableModel) table.getModel();
		
		model.setRowCount(0);
		for(Student s:slist){
			model.addRow(new Object[]{s.getId(),s.getName(),s.getFaculty(),s.getCollege()});
		}
	}
	private JButton getBtnPrint() {
		if (btnPrint == null) {
			btnPrint =  new JButton("Print");
			btnPrint.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					try {
						table.print();
					} catch (PrinterException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
			btnPrint.setBounds(646, 409, 89, 23);
		}
		return btnPrint;
	}
	private JButton getBtnGoogle() {
		if (btnGoogle == null) {
			btnGoogle = new JButton("google");
			btnGoogle.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				
				}
			});
			btnGoogle.setBounds(614, 83, 89, 23);
		}
		return btnGoogle;
	}
	private JButton getBtnGoogle_1() {
		if (btnGoogle_1 == null) {
			btnGoogle_1 = new JButton("google");
			btnGoogle_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					URI uri;
					try {
						uri = new URI("http://www.google.com");
						Desktop.getDesktop().browse(uri);
					} catch (Exception ee) {
						// TODO Auto-generated catch block
						ee.printStackTrace();
					}
					
				}
			});
			btnGoogle_1.setBounds(434, 143, 89, 23);
		}
		return btnGoogle_1;
	}
}
