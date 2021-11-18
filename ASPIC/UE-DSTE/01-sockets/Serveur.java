import java.io.IOException;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.net.Socket;
import java.net.ServerSocket;

public class Serveur {
	private String[] name;
	private String[] fname;
	private static int port = 7777;
	
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(port);
		Socket socket = ss.accept();
		System.out.println("client connected");
		
		DataInputStream dIn = new DataInputStream(socket.getInputStream());
		String clientName = dIn.readUTF();
		System.out.println("Client name : " + clientName);

		String welcome = "Welcome "+clientName+", your are connected";
		DataOutputStream dOut = new DataOutputStream(socket.getOutputStream());
		dOut.writeUTF(welcome);


		while (true) {
			String msgFromClient = dIn.readUTF();
			System.out.println(clientName + " : " + msgFromClient);
		}
	}
}
