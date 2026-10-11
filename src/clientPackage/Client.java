package clientPackage;

import java.io.*;
import java.net.Socket;


public class Client   {
    static void main(String[] args) throws IOException {
        System.out.println("Je ne suis pas encore connecté");

        Socket socket = new Socket("localhost", 1234);
        System.out.println("Je suis un client connecté");


        socket.close();
    }
}
