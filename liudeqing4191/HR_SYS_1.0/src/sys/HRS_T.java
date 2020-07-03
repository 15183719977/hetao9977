package sys;

import java.util.Scanner;

import bean.Resume;

public class HRS_T {

	private int MAXSIZE=100;
	//�������ʼ����ʱ������������Ĵ�С����û�б�ķ�ʽ�����أ�--��linkedlist
	private Resume[] resumeList=new Resume[MAXSIZE];


	private int resumeCount=0;//������������ķ��գ����÷�ֹԽ�磻
	//��ȡ��׼������
	private Scanner input=new Scanner(System.in);



	HRS_T(){
		boolean c=true;
		while(c)
		{

			System.out.println("-----��ӭ����idcard��hrϵͳ-----");
			System.out.println("���ѧ����Ϣ�밴----1");
			System.out.println("ɾ��ѧ����Ϣ�밴----2");
			System.out.println("�޸�ѧ����Ϣ�밴----3");
			System.out.println("��ѯѧ����Ϣ�밴----4");
			System.out.println("�˳��밴--------5");


			int choice=input.nextInt();
			//������if ������ʲô��ʽ����ʵ���߼��жϣ�

			switch(choice){
				case 1 :
					addResume();
					break;
				case 2 :
					deleteResume();
					break;
				case 3 :
					updateResume();
					break;
				case 4 :
					searchResume();
					break;
				case 5 :
					c=false;
					break;
				default :
					System.out.println("�����������������");
			}
		}
		input.close();//���� ���Ӱ� ��Щ���� ����ǵùأ�Ҫô�ǵû�����ôʲô�ط�����Ҫ���ģ�ʲô�ط��ǹصģ���
		System.out.println("���Ѿ��˳�hrϵͳ");
	}

	//���ѧ����Ϣ
	void addResume()
	{
		System.out.println("��ӭ�������ѧ����Ϣ����");
		if(resumeCount<MAXSIZE)//�ж�ͼ�����ϵͳ�Ƿ�δ��
		{
			Scanner input=new Scanner(System.in);
			System.out.println("������������Ҫ��ӵ�������id");
			String resumeName=input.nextLine();
			String resumeId=input.nextLine();

			//get/SET
			Resume resume=new Resume(resumeName,resumeId);

			resumeList[resumeCount]=resume;
			resumeCount++;
			System.out.println("���Ѿ��ɹ����ѧ����Ϣ");
			showResume();
		}
		else{
			System.out.println("hrϵͳ�������޷����ѧ����Ϣ");
		}
	}

	//ɾ��ѧ����Ϣ
	void deleteResume()
	{
		@SuppressWarnings("resource")//javaע�⣬���ᣬ����ѧϰ�б�
		Scanner input=new Scanner(System.in);
		System.out.println("��ӭ����ɾ��ѧ����Ϣ����");
		System.out.println("��������Ҫɾ����ѧ��id");
		String resumeId=input.nextLine();

		if(resumeCount!=0)//hrϵͳ��Ϊ��
		{
			for(int i=0;i<resumeCount;i++)
			{
				if(resumeList[i].getId().equals(resumeId))
				{
					for(int j=i;j<resumeCount-1;j++)
					{
						resumeList[j]=resumeList[j+1];
					}
					System.out.println("���Ѿ��ɹ�ɾ��ѧ����Ϣ");
					resumeCount--;
					break;
				}
				else if(i==resumeCount-1) {
					System.out.println("û���ҵ���ѧ��");
				}
			}
			showResume();
		}
		else{
			System.out.println("ѧ����ϢϵͳΪ�գ�û���ҵ���ѧ��");
		}
//		input.close();
	}

	//�޸�ѧ����Ϣ
	void updateResume()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("��ӭ�����޸�ѧ����Ϣ����");
		System.out.println("��������Ҫ�޸ĵ�ѧ��Id");
		String resumeId=input.nextLine();
		if(resumeCount!=0)//hrϵͳ��Ϊ��
		{
			for(int i=0;i<resumeCount;i++)
			{
				if(resumeList[i].getId().equals(resumeId))
				{
					System.out.println("�����������µ�������id��ѧУ������");
					String newresumeName=input.nextLine();
					String newresumeId=input.nextLine();
					String newresumeSchool=input.nextLine();
					int newresumeProcess=input.nextInt();
					{
						resumeList[i].setName(newresumeName);
						resumeList[i].setId(newresumeId);
						resumeList[i].setSchool(newresumeSchool);
						resumeList[i].setProcess(newresumeProcess);
					}
					System.out.println("���Ѿ��޸ĳɹ�");
					showResume();
				}
				else if(i==resumeCount-1||resumeCount==0) {
					System.out.println("û�в��ҵ���ѧ��");
				}
			}
		}
		else{
			System.out.println("ϵͳΪ�գ�û�в��ҵ���ѧ��");
		}
//		input.close();
	}

	//��ѯѧ����Ϣ
	void searchResume()
	{
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.println("��ӭ�����ѯѧ����Ϣ����");
		System.out.println("��������Ҫ��ѯ��ѧ��id");
		String resumeId=input.nextLine();
		for(int i=0;i<resumeCount;i++)
		{
			if(resumeList[i].getId().equals(resumeId))
			{
				System.out.println("������"+resumeList[i].getName()+"\n"+
									"ID"+":"+resumeList[i].getId()+"\n"
									+"ѧУ"+":"+resumeList[i].getSchool()+"\n"
									+"���ȣ�"+resumeList[i].getProcess());
				break;
			}
			else if(i==resumeCount-1) {
				System.out.println("û�в��ҵ���ѧ��������������");
			}
		}
//		input.close();
	}

	//ѧ����Ϣ����
	void showResume()
	{
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.println("�Ƿ���Ҫ��ӡ����ѧ����Ϣ����������Y�����ô�ӡ����������");
		String XUANZE=input.nextLine();
		String Y="Y";
		if(XUANZE.equals(Y))
		{
			System.out.println("��hrϵͳ����"+resumeCount+"��ͬѧ");
			for(int i=0;i<resumeCount;i++) {
				System.out.println("��"+(i+1)+"��ͬѧ"+"----"+resumeList[i].getName());
			}
		}
//		input.close();
	}
	
	public static void main(String[] args)
	{
		new HRS_T();
	}
}