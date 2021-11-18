import java.io.*;
import java.net.*;

public class J {
    public static void main(String[] args) throws IOException {
        Socket soket = new Socket("localhost", 7777);
		String fname = null;
		DataOutputStream sortie = new DataOutputStream(soket.getOutputStream());
		DataInputStream entree = new DataInputStream(soket.getInputStream());
		
        String str = entree.readLine();
        int i = Integer.parseInt(str);
        str = entree.readLine();
    }
}