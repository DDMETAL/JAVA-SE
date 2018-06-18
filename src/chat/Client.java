package chat;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * �����ҿͻ���
 * @author NiCo
 *
 */
public class Client {
	/*
	 * java.net.Socket
	 * �׽���
	 * Socket��װ��TCPͨ��Э�飬ʹ�������Ի���
	 * TCPЭ����Զ�˼����ͨѶ
	 */
	private Socket socket;
	/**
	 * �ͻ��˵Ĺ��췽��������ʼ���ͻ���
	 */
	public Client() throws Exception{
		try {
			/*
			 * ʵ����Socketʱ�����췽��Ҫ������������
			 * 1.String,ָ������˵�IP��ַ
			 * 2.int,ָ������˴򿪵ķ���˿ں�
			 * ͨ��IP��ַ�����ҵ���������ڼ������
			 * ͨ���˿ںſ����ҵ������������еķ����Ӧ�ó���
			 */
			System.out.println("�������ӷ����...");
			socket = new Socket("localhost",8088);
			System.out.println("�����˽������ӣ�");
		} catch (Exception e) {
			//��¼��־
			
			throw e;
		}
		
	}
	/**
	 * �����ͻ��˵ķ���
	 */
	public void start() {
		try {
			Scanner scanner=new Scanner(System.in);
		 	/*
			 * Socket�ṩ�˷�����
			 * OutputStream getOutputStream()
			 * �÷������Ի�ȡһ���������ͨ���������
			 * д�������ݻᷢ�͸�Զ�ˣ�����Զ�˾��Ƿ�����
			 */
			OutputStream out
			=socket.getOutputStream();
			OutputStreamWriter osw
				=new OutputStreamWriter(out,"utf-8");
			PrintWriter pw
				=new PrintWriter(osw,true);
			/*
			 * �������ڽ��շ���˷��͹�����Ϣ
			 * ���߳�
			 */
			ServerHandler handler
				=new ServerHandler();
			Thread t=new Thread(handler);
			t.start();
			String message=null;
			
			long lastSend=System.currentTimeMillis()-1000;
			while(true) {
				message=scanner.nextLine();
				if(System.currentTimeMillis()-lastSend<1000) {
					System.out.println("˵��̫�죬�Ե�һ�£�");
				}else {
					pw.println(message);
					lastSend=System.currentTimeMillis();
				}
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		try {
			//ʵ�����ͻ���
			Client client=new Client();
			//�����ͻ���
			client.start();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("�ͻ�������ʧ�ܣ�");
		}
	}
	private class ServerHandler implements Runnable{
		public void run() {
			try {
				InputStream in=socket.getInputStream();
				InputStreamReader isr
					=new InputStreamReader(in,"utf-8");
				BufferedReader br
					=new BufferedReader(isr);
				String message=null;
				while((message=br.readLine())!=null) {
					System.out.println(message);
				}
			} catch (Exception e) {
				
			}
		}
	}
}
