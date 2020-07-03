package jiemian;

import java.awt.event.*;
import javax.swing.*;

import jiemian.SelectByName;
import ywcl.CJManager;

public class TeacherMain extends JFrame implements ActionListener {
	JMenuBar menubar;
	JMenu stuMenu, searchMenu;
	JMenuItem addStu, searchStu1, searchStu2;
	JMenuItem cjAvg, cjJGL;// ƽ���ɼ���������
	JLabel result;

	public TeacherMain() {
		setTitle("��ʦ����������");
		setSize(260, 150);
		setLocation(120, 120);
		setVisible(true);
		menubar = new JMenuBar();
		stuMenu = new JMenu("ѧ��");
		JMenu cjMenu = new JMenu("�ɼ�");
		addStu = new JMenuItem("���ѧ��");
		searchMenu = new JMenu("��ѯѧ��");
		searchStu1 = new JMenuItem("���Ʋ�ѯ");
		searchStu2 = new JMenuItem("ȫ����ѯ");
		searchMenu.add(searchStu1);
		searchMenu.add(searchStu2);
		stuMenu.add(addStu);
		stuMenu.add(searchMenu);
		cjAvg = new JMenuItem("ƽ���ɼ�");
		cjJGL = new JMenuItem("������");
		cjMenu.add(cjAvg);
		cjMenu.add(cjJGL);
		menubar.add(stuMenu);
		menubar.add(cjMenu);
		setJMenuBar(menubar);
		result = new JLabel();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		add(result);
		validate();
		addStu.addActionListener(this);
		searchStu1.addActionListener(this);
		searchStu2.addActionListener(this);
		cjAvg.addActionListener(this);
		cjJGL.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == addStu) {
			new AddStudent();
		} else if (e.getSource() == searchStu1) {
			new SelectByName();
		} else if (e.getSource() == searchStu2) {
			new SelectAll();
		} else if (e.getSource() == cjAvg) {
			double avg = 0;
			avg = CJManager.average();
			result.setText("����ѧ����ƽ���ɼ�Ϊ��" + avg);
		} else if (e.getSource() == cjJGL) {
			double jgl = 0;
			jgl = CJManager.pass();
			result.setText("����ѧ���ļ�����Ϊ��" + jgl);
		}
	}

	public static void main(String[] args) {
		TeacherMain win = new TeacherMain();
	}

}
