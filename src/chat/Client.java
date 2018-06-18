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
 * 聊天室客户端
 * @author NiCo
 *
 */
public class Client {
	/*
	 * java.net.Socket
	 * 套接字
	 * Socket封装了TCP通信协议，使用它可以基于
	 * TCP协议与远端计算机通讯
	 */
	private Socket socket;
	/**
	 * 客户端的构造方法用来初始化客户端
	 */
	public Client() throws Exception{
		try {
			/*
			 * 实例化Socket时，构造方法要求传入两个参数
			 * 1.String,指定服务端的IP地址
			 * 2.int,指定服务端打开的服务端口号
			 * 通过IP地址可以找到服务端所在计算机，
			 * 通过端口号可以找到服务器上运行的服务端应用程序
			 */
			System.out.println("正在连接服务端...");
			socket = new Socket("localhost",8088);
			System.out.println("与服务端建立连接！");
		} catch (Exception e) {
			//记录日志
			
			throw e;
		}
		
	}
	/**
	 * 启动客户端的方法
	 */
	public void start() {
		try {
			Scanner scanner=new Scanner(System.in);
		 	/*
			 * Socket提供了方法：
			 * OutputStream getOutputStream()
			 * 该方法可以获取一个输出流，通过该输出流
			 * 写出的数据会发送给远端，这里远端就是服务器
			 */
			OutputStream out
			=socket.getOutputStream();
			OutputStreamWriter osw
				=new OutputStreamWriter(out,"utf-8");
			PrintWriter pw
				=new PrintWriter(osw,true);
			/*
			 * 启动用于接收服务端发送过来消息
			 * 的线程
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
					System.out.println("说话太快，稍等一下！");
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
			//实例化客户端
			Client client=new Client();
			//启动客户端
			client.start();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("客户端启动失败！");
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
