package service;

import model.Resume;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author liudeqing4191
 * @date 2020/07/06
 * @project HR_SYS_1.0
 **/
public class ResumeService {

    public static void addResume(LinkedList<Resume> resumeList) {
        System.out.println("��ӭ�������ѧ����Ϣ����");
        Scanner input = new Scanner(System.in);
        System.out.println("������������Ҫ��ӵ�������id");
        String resumeName = input.nextLine();
        String resumeId = input.nextLine();

        //get/SET
        Resume resume = new Resume(resumeName, resumeId);

        resumeList.add(resume);
        System.out.println("���Ѿ��ɹ����ѧ����Ϣ");
        showResume(resumeList);
//        input.close();
    }

    public static void deleteResume(LinkedList<Resume> resumeList){
        Scanner input=new Scanner(System.in);
        System.out.println("��ӭ����ɾ��ѧ����Ϣ����");
        System.out.println("��������Ҫɾ����ѧ��id");
        String resumeId=input.nextLine();
        int resumeCount=resumeList.size();
        for(int i=0;i<resumeCount;i++)
        {
            if(resumeList.get(i).getId().equals(resumeId))
            {
                resumeList.remove(i);
                System.out.println("���Ѿ��ɹ�ɾ��ѧ����Ϣ");
                break;
            }
            else if(i==resumeCount-1) {
                System.out.println("û���ҵ���ѧ��");
            }
        }
        showResume(resumeList);
//        input.close();
    }

    public static void updateResume(LinkedList<Resume> resumeList)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("��ӭ�����޸�ѧ����Ϣ����");
        System.out.println("��������Ҫ�޸ĵ�ѧ��Id");
        String resumeId=input.nextLine();
        int resumeCount=resumeList.size();
        if(resumeCount!=0)//hrϵͳ��Ϊ��
        {
            for(int i=0;i<resumeCount;i++)
            {
                if(resumeList.get(i).getId().equals(resumeId))
                {
                    System.out.println("�����������µ�������id��ѧУ������");
                    String newresumeName=input.nextLine();
                    String newresumeId=input.nextLine();
                    String newresumeSchool=input.nextLine();
                    int newresumeProcess=input.nextInt();

                    Resume resume=new Resume(newresumeName,newresumeId);
                    resume.setSchool(newresumeSchool);
                    resume.setProcess(newresumeProcess);
                    resumeList.set(i,resume);

                    System.out.println("���Ѿ��޸ĳɹ�");
                    showResume(resumeList);

                    break;
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

    public static void searchResume(LinkedList<Resume> resumeList) {
        Scanner input=new Scanner(System.in);
        System.out.println("��ӭ�����ѯѧ����Ϣ����");
        System.out.println("��������Ҫ��ѯ��ѧ��id");
        String resumeId=input.nextLine();

        int resumeCount=resumeList.size();
        for(int i=0;i<resumeCount;i++)
        {
            if(resumeList.get(i).getId().equals(resumeId))
            {
                Resume resume=resumeList.get(i);
                System.out.println("������"+resume.getName()+"\n"+
                        "ID"+":"+resume.getId()+"\n"
                        +"ѧУ"+":"+resume.getSchool()+"\n"
                        +"���ȣ�"+resume.getProcess());
                break;
            }
            else if(i==resumeCount-1) {
                System.out.println("û�в��ҵ���ѧ��������������");
            }
        }
//		input.close();
    }



    private static void showResume(LinkedList<Resume> resumeList) {
        Scanner input = new Scanner(System.in);
        System.out.println("�Ƿ���Ҫ��ӡ����ѧ����Ϣ����������Y�����ô�ӡ����������");
        String XUANZE = input.nextLine();
        String Y = "Y";
        if (XUANZE.equals(Y)) {
            System.out.println("��hrϵͳ����" + resumeList.size() + "��ͬѧ");
            int resumeCount = resumeList.size();
            for (int i = 0; i < resumeCount; i++) {
                System.out.println("��" + (i + 1) + "��ͬѧ" + "----" + resumeList.get(i).getName());
            }
        }
//        input.close();
    }


}


