import java.io.*;
import java.net.*;
public class Server {
	public static void main(String[] args) {
		try(ServerSocket serverSocket = new ServerSocket(333)){
			Socket socket = serverSocket.accept();
			System.out.println("Server socket created.");
		}
		catch (IOException error) {
			System.out.println("Error: " + error);
		}
	}
}
