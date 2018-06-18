package chat;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * �����ҷ����
 * @author NiCo
 *
 */
public class Server {
	/*
	 * java.net.ServerSocket
	 * �����ڷ���˵�Socket
	 * ServerSocket��������Ҫ���ã�
	 * 1.�����ϵͳ����˿ڣ��ͻ��˾���ͨ��
	 *   ����˿�������Ӧ�ó��������ӵ�
	 * 2.��������˿ڣ�һ���ͻ���Socketͨ��
	 * 	 �˿����ӣ�����ͻ��֪�����Զ�����һ��
	 *   Socket��ͻ��˽�������
	 */
	private ServerSocket server;
	/*
	 * ������пͻ��˵������
	 */
	private List<PrintWriter> allOut;
	public Server(){
		try {
			/*
			 * ʵ����ServerSocket��ͬʱ����
			 * ϵͳ�������˿ڣ����˿��ѱ�����
			 * Ӧ�ó���ռ�ã����׳��쳣
			 */
			server=new ServerSocket(8088);
			allOut=new ArrayList<PrintWriter>();
		} catch (Exception e) {
			
		}
	}
	public void start() {
		try {
			/*
			 * ServerSocket�ṩ�˷�����
			 * Socket accept()
			 * �÷�����һ���������������ú��һֱ�����˿�
			 * ֱ��һ���ͻ���ͨ���ö˿ڽ������ӣ���ʱaccept
			 * �᷵��һ��Socketͨ�����Socket�Ϳ�����ͻ���ͨѶ
			 */
			while(true) {//ѭ�����ղ�ͬ�ͻ��˵�����
			System.out.println("�ȴ�һ���ͻ�������...");
			Socket socket=server.accept();
			System.out.println("��һ���ͻ��˽���������!");
			
			/*
			 * �����̣߳������ÿͻ��˵Ľ���
			 */
			ClientHandler handler
				=new ClientHandler(socket);
			Thread t=new Thread(handler);
			t.start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		try {
			Server server=new Server();
			server.start();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("���������ʧ��");
		}
	}
	private class ClientHandler implements Runnable{
		/*
		 * ���߳�ͨ�����Socket��ָ���ͻ��˽���
		 */
		private Socket socket;
		
		//�ͻ��˵ĵ�ַ��Ϣ
		private String host;
		
		
		public ClientHandler(Socket socket) {
			this.socket=socket;
			/*
			 * ͨ��Socket��ȡԶ�˼������ַ��Ϣ
			 * ���ڷ������߶��ԣ�Զ��ָ�ľ��ǿͻ���
			 */
			InetAddress address
				=socket.getInetAddress();
			//��ȡip��ַ�ַ�����ʽ
			host=address.getHostAddress();
		}
		/**
		 * �㲥��Ϣ�����пͻ���
		 * @param message
		 */
		private void sendMessage(String message) {
			synchronized(allOut){
				for(PrintWriter o:allOut) {
					o.println(message);
				}
			}
		}
		public void run() {
			PrintWriter pw=null;
			try {
				/*
				 * Socket�ṩ�ķ�����
				 * InputStream getInputStream();
				 * ͨ���÷�����ȡ�����������Զ�ȡ������
				 * Զ�˷��͹���������
				 */
				InputStream in
					=socket.getInputStream();
				InputStreamReader isr
					=new InputStreamReader(in,"utf-8");
				BufferedReader br
					=new BufferedReader(isr);
				
				/*
				 * ͨ��Socket��������������ڽ���Ϣ���͸��ͻ���
				 */
				OutputStream out =socket.getOutputStream();
				OutputStreamWriter osw
					=new OutputStreamWriter(out,"utf-8");
				 pw
					=new PrintWriter(osw,true);
				
				/*
				 * ����������뵽��������
				 */
				synchronized (allOut) {
					allOut.add(pw);
				}
				
				//�㲥��Ϣ���ÿͻ�������
				sendMessage(host+"������,��ǰ����������"+allOut.size());
				
				
				String message=null;
				/*
				 * ʹ��br.readnLine()��ȡ�ͻ��˷��͹�����
				 * һ���ַ���ʱ�����ڿͻ�������ϵͳ��ͬ����ô
				 * ���ͻ��˶Ͽ�����ʱ����ִ�еĽ��Ҳ��ͬ
				 * linux�ͻ��˶Ͽ�ʱ��br.readLine��������null
				 * windows�ͻ��˶Ͽ�ʱ��br.readLine����ֱ���׳��쳣
				 * 
				 */
				while((message=br.readLine())!=null) {
//					System.out.println("�ͻ���:"+message);
//					pw.println("�ͻ���˵��"+message);
					/*
					 * ����allOut���ϣ�����Ϣ���͸����пͻ���
					 */

					sendMessage(host+"˵:"+message);
				}
			} catch (Exception e) {
			}
			finally {
				//����ͻ��˶Ͽ����Ӻ�Ĳ���
				
				//���ÿͻ��˵�������ӹ�������ɾ��
				synchronized (allOut) {
					allOut.remove(pw);
				}
				
				//�㲥�ÿͻ���������
				sendMessage(host+"������,��ǰ����������"+allOut.size());
				/*
				 * ����Ըÿͻ��˵�Socket�ر����ͷ���Դ
				 */
				try {
					socket.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
