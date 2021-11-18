import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	private static int port = 7777;

	public static void main(String[] args) throws IOException {
		Socket clientSocket = new Socket("localhost", port);

		System.out.println("Your name : ");
		Scanner scanner = new Scanner(System.in);  // lecture du message a envoyer
		String name = scanner.next();

		DataOutputStream dOut = new DataOutputStream(clientSocket.getOutputStream());
		dOut.writeUTF(name);
		
		DataInputStream dIn = new DataInputStream(clientSocket.getInputStream());
		String msgFromSrv = dIn.readUTF();
		System.out.println(msgFromSrv);


		while (true) {
			String msgToSend = scanner.nextLine();
			dOut.writeUTF(msgToSend); 
			dOut.flush();
		}
	}
}
