package jiemian;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import ywcl.SelectAllManager;
public class SelectAll extends JFrame implements ActionListener{
	JButton firstB,previousB,nextB,finalB;
	JPanel jp;
	CardLayout cl;
	public SelectAll(){
		super("��ѯ����ѧ����Ϣ����");
		jp=new JPanel();
		cl=new CardLayout();
		jp.setLayout(cl);
		this.add(jp,BorderLayout.CENTER);
		java.util.List list=SelectAllManager.getAll();
		for(int i=0;i<list.size();i++){
			Object[]stu=(Object[])list.get(i);
			JPanel jpl=new JPanel();
			jpl.add(new JLabel("����:"));
			if(stu[1]!=null){
				JTextField nameText=new JTextField((String)stu[0],25);
				nameText.setEditable(false);
				jpl.add(nameText);
			}
			jpl.add(new JLabel("����:"));
			JTextField psText=new JTextField("",25);
			psText.setEditable(false);
			if(stu[1]!=null) psText.setText((String)stu[1]);
			jpl.add(psText);
			jpl.add(new JLabel("��Ƭ:"));
			JLabel zpLabel=new JLabel("  ");
			if(stu[2]!=null){
				zpLabel.setText("  ");
				zpLabel.setIcon(new ImageIcon((byte[])stu[2]));
			}
			jpl.add(zpLabel);
			jpl.add(new JLabel("�ɼ�:"));
			JTextField cjText=new JTextField("",25);
			if(stu[3]!=null) cjText.setText(stu[3].toString());
			cjText.setEditable(false);
			jpl.add(cjText);
			jp.add(jpl,""+i);
		}
		JPanel jp2=new JPanel();
		jp2.add(firstB=new JButton("��һ��"));
		jp2.add(previousB=new JButton("��һ��"));
		jp2.add(nextB=new JButton("��һ��"));
		jp2.add(finalB=new JButton("���һ��"));
		this.add(jp2,BorderLayout.SOUTH);
		firstB.addActionListener(this);
		previousB.addActionListener(this);
		nextB.addActionListener(this);
		finalB.addActionListener(this);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(360,400);
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==firstB){
			cl.first(jp);
		}else if(e.getSource()==previousB){
			cl.previous(jp);
		}else if(e.getSource()==nextB){
			cl.next(jp);
		}else if(e.getSource()==finalB){
			cl.last(jp);
		}
	}
	public static void main(String args[]){
		new SelectAll();
	}
}
