package demo02.FileUpload;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
 * �ļ��ϴ������Ŀͻ��ˣ���ȡ�����ļ����ϴ�������������ȡ��������д����
 * ��ȷ��
 * ����Դ��·��
 * Ŀ�ĵأ�������
 * ʵ�ֲ��裺
 * 1.����һ�������ֽ�������FileInputStream���󣬹��췽���а�Ҫ��ȡ����
 * 2.����һ���ͻ���Soket���󣬹��췽���а󶨷�������IP��ַ�Ͷ˿ں�
 * 3.ʹ��Soket�еķ���getOutputStream����ȡ�����ֽ������OutputStream����
 * 4.ʹ�ñ����ֽ�������FileInputStream�����еķ���read����ȡ�ļ�
 * 5.ʹ�������ֽ������OutputStream�����еķ���write���Ѷ�ȡ�����ļ��ϴ���������
 * 6.ʹ��Soket�е�getInputStream,��ȡ�����ֽ�������InputStream����
 * 7.ʹ�������ֽ�������InputStream����ķ���read��ȡ������д�ص�����
 * 8.�ͷ���Դ��FileInputStream��Socket��
 * */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        //1.����һ�������ֽ�������FileInputStream���󣬹��췽���а�Ҫ��ȡ����
        FileInputStream fis = new FileInputStream("E:/HH_STUDY-xianyuhong59017/xyh-study/base-code/day05-code/src/demo02/FileUpload/input/hello.txt");
        //2.����һ���ͻ���Soket���󣬹��췽���а󶨷�������IP��ַ�Ͷ˿ں�
        Socket socket = new Socket("127.0.0.1", 8888);
        //3.ʹ��Soket�еķ���getOutputStream����ȡ�����ֽ������OutputStream����
        OutputStream os = socket.getOutputStream();
        //4.ʹ�ñ����ֽ�������FileInputStream�����еķ���read����ȡ�ļ�
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1) {
            //5.ʹ�������ֽ������OutputStream�����еķ���write���Ѷ�ȡ�����ļ��ϴ���������
            os.write(bytes, 0, len);
        }
        /*�ϴ����ļ���Ҫ���ļ�дһ��������ǣ�����while��������ѭ��*/
        socket.shutdownOutput();
        //6.ʹ��Soket�е�getInputStream,��ȡ�����ֽ�������InputStream����
        InputStream is = socket.getInputStream();
        //7.ʹ�������ֽ�������InputStream����ķ���read��ȡ������д�ص�����
        while ((len = is.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }

        //8.�ͷ���Դ��FileInputStream��Socket��
        fis.close();
        socket.close();


    }
}
