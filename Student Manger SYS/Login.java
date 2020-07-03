
import java.awt.event.*;

import javax.swing.*;

import jiemian.Student;
import jiemian.TeacherMain;
import ywcl.LoginManager;

public class Login extends JFrame implements ActionListener {
	private JTextField textName;
	private JPasswordField textPassword;
	JComboBox cbSF;
	private JTextField textCheck;
	private JButton ok;

	public Login() {
		super("��¼");
		JPanel panel = new JPanel();
		
		JLabel lableName = new JLabel("�û�����", JLabel.CENTER);
		textName = new JTextField(15);
		panel.add(lableName);
		panel.add(textName);
		JLabel labelPassword = new JLabel("���룺");
		textPassword = new JPasswordField(15);
		panel.add(labelPassword);
		panel.add(textPassword);
		String[] strSF = { "ѧ��", "��ʦ" };
		cbSF = new JComboBox(strSF);
		panel.add(new JLabel("��ݣ�"));
		panel.add(cbSF);
		ok = new JButton("��¼");
		panel.add(ok);
		textCheck = new JTextField(20);
		textCheck.setVisible(false);
		panel.add(textCheck);
		getContentPane().add(panel);
		textName.addActionListener(this);
		ok.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ok) {
			String name = textName.getText();
			String ps = new String(textPassword.getPassword());
			String sf = (String) cbSF.getSelectedItem();
			if ("��ʦ".equals(sf)) {
				if (name.equals("admin") && ps.equals("123456")) {
					new TeacherMain ();
				} else {
					textCheck.setText("�û��������벻��ȷ����ʦ��¼ʧ�ܣ�");
					textCheck.setVisible(true);
					this.setSize(250, 160);
					textName.grabFocus();
				}
			} else if ("ѧ��".equals(sf)) {
				 if (LoginManager.login(name,ps)){
				 new Student (name);
			} else {
				//textCheck.setText("�û��������벻��ȷ��ѧ����¼ʧ�ܣ�");
				JOptionPane.showMessageDialog(null, "�û��������벻��ȷ��ѧ����¼ʧ�ܣ�");
				//textCheck.setVisible(true);
				//this.setSize(250, 160);
				textName.grabFocus();

			}
		}
	  }
	}
	

	public static void main(String[] args) {
		Login frame = new Login();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(250, 140);
		frame.setVisible(true);

	}

}
