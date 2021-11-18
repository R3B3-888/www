import java.io.*;
import java.net.*;

public class Serveur {
	private String[] name;
	private String[] fname;
	
	public static void Reverse(String line) {
		String mline = ""; // reverse
		int len = line.length();
		for (int i = 0; i < line.length(); i++) {
			mline += line.charAt(len - i - 1);
		}
		System.out.println(line);
	}
	
	public void Research(String w) {
		int i = 0;
		while(w != name[i]) {
			i++;
		}
		System.out.println(fname[i]);
	}
	
	public static void main(String[] args) throws IOException {
		ServerSocket srvSocket = new ServerSocket(7777);
		Socket socket = srvSocket.accept();
		System.out.println("client connected");
		while (true) {
//			InputStream in = socket.getInputStream();
//			OutputStream out = socket.getOutputStream();

			DataOutputStream out = new DataOutputStream(socket.getOutputStream());
			DataInputStream in = new DataInputStream(socket.getInputStream());
			String line = in.readLine();
			if(line.length()>20) {
				//redemander
			}
			out.writeBytes(line + "\n");
//			Research();
			

		}
	}

	public String[] getName() {
		return name;
	}

	public void setName(String[] name) {
		this.name = name;
	}

	public String[] getFname() {
		return fname;
	}

	public void setFname(String[] fname) {
		this.fname = fname;
	}
}
