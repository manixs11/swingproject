package com.swingDemo.Client;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import com.swingDemo.Model.Student;
import com.swingDemo.Service.StudentService;
import com.swingDemo.ServiceImpl.StudentServiceImpl;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.awt.event.ActionEvent;

public class editForm extends JFrame {
	
	//edit form

	private JPanel contentPane;
	private JLabel lblName;
	private JTextField nameTxt;
	private JTextField addressTxt;
	private JLabel lblAddress;
	private JTextField gendetTxt;
	private JLabel genderTxt1;
	private JLabel lblDob;
	private JTextField collegeTxt;
	private JLabel lblCollege;
	private JTextField semesterTxt;
	private JLabel lblSemester;
	private JTextField facultyTxt;
	private JLabel lblFaculty;
	private JTextField phoneTxt;
	private JLabel lblPhone;
	private JTextField rollnoTxt;
	private JLabel lblRollno;
	private JButton btnUpdate;
	private JDateChooser dateChooser;
	
	private int uid=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					editForm frame = new editForm();
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
	public editForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 433, 467);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblName());
		contentPane.add(getNameTxt());
		contentPane.add(getAddressTxt());
		contentPane.add(getLblAddress());
		contentPane.add(getGendetTxt());
		contentPane.add(getGenderTxt1());
		contentPane.add(getLblDob());
		contentPane.add(getCollegeTxt());
		contentPane.add(getLblCollege());
		contentPane.add(getSemesterTxt());
		contentPane.add(getLblSemester());
		contentPane.add(getFacultyTxt());
		contentPane.add(getLblFaculty());
		contentPane.add(getPhoneTxt());
		contentPane.add(getLblPhone());
		contentPane.add(getRollnoTxt());
		contentPane.add(getLblRollno());
		contentPane.add(getBtnUpdate());
		contentPane.add(getDateChooser());
	}
	private JLabel getLblName() {
		if (lblName == null) {
			lblName = new JLabel("Name");
			lblName.setBounds(90, 52, 46, 14);
		}
		return lblName;
	}
	private JTextField getNameTxt() {
		if (nameTxt == null) {
			nameTxt = new JTextField();
			nameTxt.setBounds(186, 49, 127, 20);
			nameTxt.setColumns(10);
		}
		return nameTxt;
	}
	private JTextField getAddressTxt() {
		if (addressTxt == null) {
			addressTxt = new JTextField();
			addressTxt.setColumns(10);
			addressTxt.setBounds(186, 80, 127, 20);
		}
		return addressTxt;
	}
	private JLabel getLblAddress() {
		if (lblAddress == null) {
			lblAddress = new JLabel("Address");
			lblAddress.setBounds(90, 83, 46, 14);
		}
		return lblAddress;
	}
	private JTextField getGendetTxt() {
		if (gendetTxt == null) {
			gendetTxt = new JTextField();
			gendetTxt.setColumns(10);
			gendetTxt.setBounds(186, 111, 127, 20);
		}
		return gendetTxt;
	}
	private JLabel getGenderTxt1() {
		if (genderTxt1 == null) {
			genderTxt1 = new JLabel("Gender");
			genderTxt1.setBounds(90, 114, 46, 14);
		}
		return genderTxt1;
	}
	private JLabel getLblDob() {
		if (lblDob == null) {
			lblDob = new JLabel("DOB");
			lblDob.setBounds(90, 145, 46, 14);
		}
		return lblDob;
	}
	private JTextField getCollegeTxt() {
		if (collegeTxt == null) {
			collegeTxt = new JTextField();
			collegeTxt.setColumns(10);
			collegeTxt.setBounds(186, 173, 127, 20);
		}
		return collegeTxt;
	}
	private JLabel getLblCollege() {
		if (lblCollege == null) {
			lblCollege = new JLabel("College");
			lblCollege.setBounds(90, 176, 46, 14);
		}
		return lblCollege;
	}
	private JTextField getSemesterTxt() {
		if (semesterTxt == null) {
			semesterTxt = new JTextField();
			semesterTxt.setColumns(10);
			semesterTxt.setBounds(186, 204, 127, 20);
		}
		return semesterTxt;
	}
	private JLabel getLblSemester() {
		if (lblSemester == null) {
			lblSemester = new JLabel("Semester");
			lblSemester.setBounds(90, 207, 46, 14);
		}
		return lblSemester;
	}
	private JTextField getFacultyTxt() {
		if (facultyTxt == null) {
			facultyTxt = new JTextField();
			facultyTxt.setColumns(10);
			facultyTxt.setBounds(186, 238, 127, 20);
		}
		return facultyTxt;
	}
	private JLabel getLblFaculty() {
		if (lblFaculty == null) {
			lblFaculty = new JLabel("Faculty");
			lblFaculty.setBounds(90, 241, 46, 14);
		}
		return lblFaculty;
	}
	private JTextField getPhoneTxt() {
		if (phoneTxt == null) {
			phoneTxt = new JTextField();
			phoneTxt.setColumns(10);
			phoneTxt.setBounds(186, 274, 127, 20);
		}
		return phoneTxt;
	}
	private JLabel getLblPhone() {
		if (lblPhone == null) {
			lblPhone = new JLabel("Phone");
			lblPhone.setBounds(90, 277, 46, 14);
		}
		return lblPhone;
	}
	private JTextField getRollnoTxt() {
		if (rollnoTxt == null) {
			rollnoTxt = new JTextField();
			rollnoTxt.setColumns(10);
			rollnoTxt.setBounds(186, 309, 127, 20);
		}
		return rollnoTxt;
	}
	private JLabel getLblRollno() {
		if (lblRollno == null) {
			lblRollno = new JLabel("Rollno");
			lblRollno.setBounds(90, 312, 46, 14);
		}
		return lblRollno;
	}
	private JButton getBtnUpdate() {
		if (btnUpdate == null) {
			btnUpdate = new JButton("Update");
			btnUpdate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Student s=new Student();
					
					s.setId(uid);
					s.setName(nameTxt.getText());
					s.setAddress(addressTxt.getText());
					s.setGender(gendetTxt.getText());
					s.setDob(new Date(dateChooser.getDate().getTime()));
					s.setCollege(collegeTxt.getText());
					s.setFaculty(facultyTxt.getText());
					s.setSemester(semesterTxt.getText());
					s.setPhone(phoneTxt.getText());
					s.setRollno(Integer.parseInt(rollnoTxt.getText()));
					
					StudentService ss=new StudentServiceImpl();
					if(ss.updatestudent(s)){
						JOptionPane.showMessageDialog(null, "updatesuccessfull");
						new studentForm().setVisible(true);
						dispose();
						
					}
				}
			});
			btnUpdate.setBounds(144, 367, 89, 23);
		}
		return btnUpdate;
	}
	private JDateChooser getDateChooser() {
		if (dateChooser == null) {
			dateChooser = 	new JDateChooser();
			dateChooser.setBounds(186, 139, 127, 20);
		}
		return dateChooser;
	}
	
	
	public void displayAllData(int id){
		
		uid=id;
		
		StudentService ss=new StudentServiceImpl();
		Student s=ss.getById(id);
		
		nameTxt.setText(s.getName());
		addressTxt.setText(s.getAddress());
		gendetTxt.setText(s.getGender());
		dateChooser.setDate(s.getDob());
		collegeTxt.setText(s.getCollege());
		semesterTxt.setText(s.getSemester());
		facultyTxt.setText(s.getFaculty());
		phoneTxt.setText(s.getPhone());
		rollnoTxt.setText(new Integer(s.getRollno()).toString());
		
	}
}
