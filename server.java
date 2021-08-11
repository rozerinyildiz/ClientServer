import java.net.*;
import java.io.*;
public class server {
public static void main(String[] args) throws IOException {
		
		ServerSocket serverSocket = new ServerSocket(4999);
		Socket clientSocket = serverSocket.accept();
		System.out.println("Client successfully connected!");
	}
}
