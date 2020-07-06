package HR_SYS;

import loadandsaveData.DataOperate;
import model.Resume;
import service.ResumeService;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author liudeqing4191
 * @date 2020/07/06
 * @project HR_SYS_1.0
 **/
public class HRS {
    public static void main(String[] args) {
        LinkedList<Resume> resumeList = new LinkedList<Resume>();
        Scanner input = new Scanner(System.in);
        DataOperate.loadData(resumeList);//�������м���

        boolean c = true;
        while (c) {

            System.out.println("-----��ӭ����idcard��hrϵͳ-----");
            System.out.println("���ѧ����Ϣ�밴----1");
            System.out.println("ɾ��ѧ����Ϣ�밴----2");
            System.out.println("�޸�ѧ����Ϣ�밴----3");
            System.out.println("��ѯѧ����Ϣ�밴----4");
            System.out.println("�˳��밴--------5");


            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    ResumeService.addResume(resumeList);
                    break;
                case 2:
                    ResumeService.deleteResume(resumeList);
                    break;
                case 3:
                    ResumeService.updateResume(resumeList);
                    break;
                case 4:
                    ResumeService.searchResume(resumeList);
                    break;
                case 5:
                    DataOperate.saveData(resumeList);
                    c = false;
                    break;
                default:
                    System.out.println("�����������������");
            }

        }
        input.close();
        System.out.println("���Ѿ��˳�hrϵͳ");
    }
}
