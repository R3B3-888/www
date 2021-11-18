import java.io.*;
import java.net.*;
import java.util.Arrays;

public class Client {
	public static void main(String[] args) throws IOException {
		Socket clientSocket = new Socket("localhost", 7777);
		String fileName = null;
		DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());
		DataInputStream in = new DataInputStream(clientSocket.getInputStream());
		out.writeChars(fname);
	}
}
