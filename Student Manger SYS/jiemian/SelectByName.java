package jiemian;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import ywcl.LoginManager;

public class SelectByName extends JFrame implements ActionListener {
	private JTextField textName;
	private JButton ok;

	public SelectByName() {
		super("���Ʋ�ѯ����");
		this.setLayout(new FlowLayout());
		JLabel labelName = new JLabel("�û�����", JLabel.CENTER);
		textName = new JTextField(15);
		add(labelName);
		add(textName);
		ok = new JButton("��ѯ");
		add(ok);
		ok.addActionListener(this);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(250, 140);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ok) {
			// ��ʾ��ѯ�������
			String name = textName.getText();
			if (LoginManager.login2(name)){
			new Student(textName.getText());
			}else {
				JOptionPane.showMessageDialog(null, "�������ҵ�ѧ�������ڣ�");
			}
		}
	}

	public static void mian(String args[]) {
		SelectByName frame = new SelectByName();
	}
}
