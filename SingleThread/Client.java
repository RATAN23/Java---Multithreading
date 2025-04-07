
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

    public void run() throws UnknownHostException , IOException{
        int port  = 8081;
        InetAddress adrress = InetAddress.getByName("localhost");
        Socket socket = new Socket(adrress , port);
        PrintWriter toSocket = new PrintWriter(socket.getOutputStream());
        BufferedReader fromSocket = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        toSocket.println("Hello from the client");
        String line = fromSocket.readLine();
        System.out.println("Response from the server = " + line);
        toSocket.close();
        fromSocket.close();
        socket.close();
    }
    
    public static void main(String [] args){
        Client client = new Client();
        try{
            client.run();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
