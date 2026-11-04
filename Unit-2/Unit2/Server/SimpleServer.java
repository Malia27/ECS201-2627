package Unit-2.Unit2.SimpleServer;

import java.util.*;
import java.io.*;
import java.net.*;

public class SimpleServer {
    private ServerSocket serverSocket;
    private Socket socket;
    private printWriter out;
    private Scanner in;

    public SimpleServer(int port) throws Exception{
        serverSocket=new ServerSocket(port);
    }

    public void acceptClient()throws Exception{
        socket=serverSocket.accept();
        in=new Scanner(socket.getInputStream();)
        out=new PrintWriter(socket.getOutputStream());
    }

    public String recieveMessage(){
        in.nextLine();
    }

    public void sendMessage(String msg){
        out.println(msg);
    }

    public void close(){
        serverSocket.close();
        socket.close();
        in.close();
        out.close();
    }

    public static void main(string[] args) throws Exception{
        SimpleClient2 simpleClient = new SimpleClient2("127.0.0.1",9090 );
            Scanner input = new Scanner(System.in);
            while(true){
                String message=input.nextLine();
                simpleClient.sendMessage(message);
                String serverR= simpleClient.receiveMessage();
                System.out.println("Server : "+serverR);
                if(serverR.equals("stop")){
                    break;
                }
            }
            simpleClient.close();  
}
