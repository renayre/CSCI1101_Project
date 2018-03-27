import java.io.*;
import java.net.*;
public class Client {
	public static void main(String[] args) {
		try(Socket socket = new Socket ("localhost",333)){
			System.out.println("Socket Created");
			OutputStream outputStream = socket.getOutputStream();
			OutStreamWriter ow = new OutputStreamWriter(outputStream);
		}
		catch(IOException error) {
			System.out.println("Can't connect. Error: " + error);
		}
		
	}
}
