package Unit

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

2.Unit2.Server;

public class SimpleClient {
    private ServerSocket serverSocket;
    private Socket socket;
    private printWriter out;
    private Scanner in;

    public SimpleClient(String ip, int port) throws Exception{
        socket = new socket(ip, port);
        out=new PrintWriter()(socket.getOutputStream(), autoflush: true;)
        in=new Scanner(socket.getInputStream());
    }

    public String recieveMessage(Stringmsg){
        out.println(msg);
        out.print();
    }
    
    public void close() throws Exception{
        socket.close();
        in.close();
        out.close;
    }

    public status void main(String[] args) throws Exception{
        
    }
}
