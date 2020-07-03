package jiemian;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import ywcl.AddStudentManager;

import java.io.*;
import javax.swing.*;

public class AddStudent extends JFrame {
	JTextField nameText, psText, cjText;
	JLabel zpLabel;
	JButton addPhoto, addStu;
	JLabel tsLabel;
	File filePhoto = null;

	public AddStudent() {
		super("���ѧ����Ϣ����");
		this.setLayout(new FlowLayout());
		this.add(new JLabel("������"));
		nameText = new JTextField("", 15);
		this.add(nameText);
		this.add(new JLabel("���룺"));
		psText = new JPasswordField("", 15);
		this.add(psText);
		this.add(addPhoto = new JButton("�����Ƭ"));
		zpLabel = new JLabel(" ");
		this.add(zpLabel);
		this.add(new JLabel("�ɼ���"));
		cjText = new JTextField("", 15);
		this.add(cjText);
		this.add(addStu = new JButton("���ѧ��"));
		this.add(tsLabel = new JLabel(""));
		addPhoto.addActionListener(new MyListener());
		addStu.addActionListener(new MyListener());
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(250, 400);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new AddStudent();
	}

	public class MyListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == addPhoto) {
				String dir = System.getProperty("user.dir");
				JFileChooser jfc = new JFileChooser(dir);
				jfc.showOpenDialog(null);
				filePhoto = jfc.getSelectedFile();
				if (filePhoto != null) {
					zpLabel.setText("");
					zpLabel.setIcon(new ImageIcon(filePhoto.getAbsolutePath()));
				}
			} else if (e.getSource() == addStu) {
				String name = nameText.getText();
				String ps = psText.getText();
				double cj = Double.parseDouble(cjText.getText());
				if (AddStudentManager.isAdd(name)) {
					//tsLabel.setText("����Ϊ" + name + "�Ѿ����ڣ�");
					JOptionPane.showMessageDialog(null, "����Ϊ" + name + "�Ѿ����ڣ�");
				} else {
					if (AddStudentManager.add(name, ps, filePhoto, cj) > 0) {
						//tsLabel.setText("��ӳɹ���");
						JOptionPane.showMessageDialog(null, "��ӳɹ���");
					} else {
						//tsLabel.setText("���ʧ�ܣ�");
						JOptionPane.showMessageDialog(null, "���ʧ�ܣ�");
					}
				}
			}
		}
	}
}
