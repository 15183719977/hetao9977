package demo04.BSTCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
����BS�汾�ķ�����
* */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        //����һ��������ServerSocket��ϵͳָ���Ķ˿ں�
        ServerSocket server=new ServerSocket(8080);
        while(true){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        //ʹ��accept������ȡ������Ŀͻ��˶���
                        Socket socket=server.accept();
                        //ʹ��Socket�����еķ���getInputStream,��ȡ����������InputStream����
                        InputStream is=socket.getInputStream();
                        //ʹ�������ֽ�������InputStream�����еķ���read��ȥ�ͻ��˵�������Ϣ
/*        byte[] bytes=new byte[1024];
        int len=0;
        while((len=is.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }*/
                        //�������ֽ�������ת��Ϊ�ַ�����������
                        BufferedReader br= new BufferedReader(new InputStreamReader(is));
                        String line=br.readLine();
                        //�Ѷ�ȡ����Ϣ�����и�
                        String []arr=line.split(" ");
                        //day05-code/taobaoweb/index.html
                        String htmlpath=arr[1].substring(1);
                        //���������ֽ��������췽���а�Ҫ��ȡ��·��
                        System.out.println(htmlpath);
                        FileInputStream fis=new FileInputStream(htmlpath);
                        //ʹ��Socket�еķ���getOutputStream��ȡ�����ֽ������OutputStream
                        OutputStream os=socket.getOutputStream();

                        /*�̶�д��*/
                        //д��HTTPЭ����Ӧͷ
                        os.write("HTTP/1.1 200 OK\r\n".getBytes());
                        os.write("Content-Type:text/html\r\n".getBytes());
                        //����д����У����������������
                        os.write("\r\n".getBytes());

                        //һ��һд �����ļ�
                        int len=0;
                        byte[] bytes=new byte[1024];
                        while ((len=fis.read(bytes))!=-1){
                            os.write(bytes,0,len);
                        }
                        //�ͷ���Դ
                        fis.close();
                        socket.close();
                    }catch (IOException e){
                        System.out.println(e);
                    }
                }
            }).start();
        }


    }
}
