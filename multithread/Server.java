import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    
    public static void main ( String[] args){
        int port = 8081;
        ServerSocket serverSocket = new ServerSocket(port);
        try{
            serverSocket.setSoTimeout(10000);
            System.out.println("Server is listening on the port " + port);
            while(true){
                Socket acceptedSocket = serverSocket.accept();
                Thread thread = new Thread();
            }
        }catch(Exception ex){   

        }
        
    }
}
