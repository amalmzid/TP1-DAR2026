package serverPackage;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    static void main(String[] args) throws IOException {
        ServerSocket socketServeur=new ServerSocket(1234);
        System.out.println("Le serveur attend un client");

        Socket socket = socketServeur.accept();
        System.out.println("Un client est connecté");


        socket.close();

    }
}
