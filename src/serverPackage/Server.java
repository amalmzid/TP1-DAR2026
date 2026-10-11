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

        InputStream is = socket.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        int nb = dis.readInt();
        System.out.println("Le serveur a reçu le nombre: "+nb);

        int x = nb * 5;
        System.out.println("Calcul du serveur: "+nb+"*5 = "+x);
        OutputStream os = socket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeInt(x);
        System.out.println("La résultat a été envoyé au client. "+x);
        dis.close();
        dos.close();
        socket.close();
        socketServeur.close();

    }
}
