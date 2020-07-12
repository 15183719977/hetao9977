package demo02.FileUpload;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
* �ļ��ϴ������ķ������ˣ���ȡ�ͻ����ϴ����ļ������浽������Ӳ�̣����ͻ��˻�д���ϴ��ɹ���
* ��ȷ��
* ����Դ���ͻ����ϴ����ļ�
* Ŀ�ĵأ���������Ӳ��
*
* ʵ�ֲ���
1.����һ������������ServerSocket���󣬺�ϵͳҪָ���Ķ˿ں�
2.ʹ��ServerSocket�����еķ���accept��ȡ������Ŀͻ���Socket����
3.ʹ��Socket�����еķ���getInputStream����ȡ�������ֽ�������InputStream����
4.�ж��ļ����Ƿ���ڣ��������򴴽�
5.����һ�������ֽ������FileOutputStream���󣬹��췽���а�Ҫ�����Ŀ�ĵ�
6.ʹ�������ֽ�������InputStream�����еķ���read����ȡ�ͻ����ϴ����ļ�
7.ʹ�ñ����ֽ������FileOutputStream�����е�write���Ѷ�ȡ�����ļ����浽��������Ӳ����
8.ʹ��Socket�����еķ���getOutputStream����ȡ�������ֽ������OutputStream
9.ʹ�������ֽ������OutputStream�ķ���write�����ͻ��˻�д�ϴ��ɹ�
10.�ͷ���Դ��FileOutputStream��ServerSocket��
*
* */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        //1.����һ������������ServerSocket���󣬺�ϵͳҪָ���Ķ˿ں�
        ServerSocket server=new ServerSocket(8888);
        //2.ʹ��ServerSocket�����еķ���accept��ȡ������Ŀͻ���Socket����
        Socket socket=server.accept();
        //3.ʹ��Socket�����еķ���getInputStream����ȡ�������ֽ�������InputStream����
        InputStream is=socket.getInputStream();
        //4.�ж��ļ����Ƿ���ڣ��������򴴽�
        File file=new File("E:\\HH_STUDY-xianyuhong59017\\xyh-study\\base-code\\day05-code\\src\\demo02\\FileUpload\\output");
        if(!file.exists()){
            file.mkdir();
                    }
        //5.����һ�������ֽ������FileOutputStream���󣬹��췽���а�Ҫ�����Ŀ�ĵ�
        FileOutputStream fos=new FileOutputStream(file+"\\hello.txt");
        //6.ʹ�������ֽ�������InputStream�����еķ���read����ȡ�ͻ����ϴ����ļ�
        int len=0;
        byte[] bytes=new byte[1024];
        while ((len=is.read(bytes))!=-1){
            //7.ʹ�ñ����ֽ������FileOutputStream�����е�write���Ѷ�ȡ�����ļ����浽��������Ӳ����
            fos.write(bytes,0,len);
        }


        //8.ʹ��Socket�����еķ���getOutputStream����ȡ�������ֽ������OutputStream
        //9.ʹ�������ֽ������OutputStream�ķ���write�����ͻ��˻�д�ϴ��ɹ�
        socket.getOutputStream().write("�ϴ��ɹ�".getBytes());
        //10.�ͷ���Դ��FileOutputStream��ServerSocket��
        fos.close();
        socket.close();
        server.close();
    }

}
