package service;

import model.Resume;
import model.ResumeList;

import java.util.Scanner;

/**
 * @author liudeqing4191
 * @date 2020/07/06
 * @project HR_SYS_1.0
 **/
public class ResumeService {

    public static void addResume() {
        //UI
        System.out.println("��ӭ�������ѧ����Ϣ����");
        Scanner input = new Scanner(System.in);
        System.out.println("������������Ҫ��ӵ�������id");
        String resumeName = input.nextLine();
        String resumeId = input.nextLine();

        Resume resume = new Resume(resumeName, resumeId);

        Action a =new Action();
        if(a.addResume(resume)>0){
            System.out.println("���Ѿ��ɹ����ѧ����Ϣ");
        }
        else
        {
            System.out.println("���ѧ����Ϣʧ��");
        }
    }

    public static void deleteResume(){
        while (true){
            //UI
            Scanner input=new Scanner(System.in);
            System.out.println("��ӭ����ɾ��ѧ����Ϣ����");
            System.out.println("��������Ҫɾ����ѧ��id");
            System.out.println("�˳��밴-1");
            String resumeId=input.nextLine();
            int q=Integer.parseInt(resumeId);
            if(q==-1){
                break;
            }

            //
            Action d=new Action();
            if(d.deleteResume(resumeId)>0){
                System.out.println("���Ѿ��ɹ�ɾ��ѧ����Ϣ");
            }
            else
            {
                System.out.println("û���ҵ���ѧ����Ϣ���޷�ɾ��");
            }
        }
    }

    public static void updateResume(){
        while (true){
            //UI
            Scanner input=new Scanner(System.in);
            System.out.println("��ӭ����ɾ��ѧ����Ϣ����");
            System.out.println("��������Ҫ���µ�ѧ��id������������������ѧУ���½��ȡ���deleteStatus");
            System.out.println("�˳��밴-1");
            String resumeId=input.nextLine();
            int q=Integer.parseInt(resumeId);
            if(q==-1){
                break;
            }

            String newName=input.nextLine();
            String newSchool=input.nextLine();
            int newProcess=input.nextInt();
            int newDeleteStatus=input.nextInt();

            Action u=new Action();
            if(u.updataResume(resumeId,newName,newSchool,newProcess,newDeleteStatus)>0){
                System.out.println("���Ѿ��ɹ�����ѧ����Ϣ");
            }
            else
            {
                System.out.println("û���ҵ���ѧ����Ϣ���޷�����");
            }
        }
    }

    public static void searchResume() {
        boolean c=true;
        while (c){
            Scanner input=new Scanner(System.in);
            System.out.println("��ӭ�����ѯѧ����Ϣ����");
            System.out.println("�������������밴----------1");
            System.out.println("��ID�����밴----------2");
            System.out.println("��ѧУ�����밴----------3");
            System.out.println("�����Ȳ����밴----------4");
            System.out.println("ģ�������밴------------5");
            System.out.println("�˳��밴----------------6");
            int choice =input.nextInt();
            input.nextLine();
            ResumeList resumes = null;
            Action s=new Action();
            switch (choice){
                case 1:
                    System.out.println("������ѧ��������");
                    String resumeName =input.nextLine();
                    System.out.println(resumeName);
                    resumes=s.searchResume("name =",resumeName);
                    break;
                case 2:
                    System.out.println("������ѧ�����֤�ţ�");
                    String resumeId =input.next();
                    resumes=s.searchResume("id =",resumeId);
                    break;
                case 3:
                    System.out.println("������ѧ��ѧУ��");
                    String resumeSchool =input.nextLine();
                    resumes=s.searchResume("school =",resumeSchool);
                    break;
                case 4:
                    System.out.println("������ѧ�����ȣ�");
                    String resumeProcess =input.nextLine();
                    resumes=s.searchResume("process =",resumeProcess);
                    break;
                case 5:
                    System.out.println("������ؼ��֣�");
                    String point =input.nextLine();
                    resumes=s.searchResume("name like","%"+point+"%");
                    break;
                case 6:
                    c=false;
                    break;
                default:System.out.println("�����������������");
            }
            //���
            if(choice<6){
                int resumeCount = resumes.size();
                if(resumeCount>0)
                {
                    System.out.println("���ҵ�" + resumeCount + "��ͬѧ");
                    for (int i = 0; i < resumeCount; i++) {
                        System.out.println("��" + (i + 1) + "��ͬѧ:");
                        System.out.println("����Ϊ"+ "----" + resumes.get(i).getName());
                        System.out.println("���֤��Ϊ"+ "----" + resumes.get(i).getId());
                        System.out.println("����Ϊ"+ "----" + resumes.get(i).getProcess());
                        System.out.println("ѧУΪ"+ "----" + resumes.get(i).getSchool());
                    }
                }
                else {
                    System.out.println("û���ҵ�����ͬѧ");
                }
            }
        }
    }
}


