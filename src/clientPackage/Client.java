package clientPackage;
import java.io.*;
import java.net.Socket;
import java.util.Scanner;
public class Client   {
    static void main(String[] args) throws IOException {
        System.out.println("Je ne suis pas encore connecté");
        Socket socket = new Socket("localhost", 1234);
        System.out.println("Je suis un client connecté");
        Scanner scanner = new Scanner(System.in);
        OutputStream os = socket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        InputStream is = socket.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        while (true) {
            System.out.print("Entrer un entier x (0 pour quitter) : ");
            int x = scanner.nextInt();
            dos.writeInt(x);
            dos.flush();
            System.out.println("Nombre envoyé au serveur : " + x);
            if (x == 0) {
                System.out.println("Arrêt de la communication demandé.");
                break;
            }
            int xx = dis.readInt();
            System.out.println("Résultat reçu du serveur : " + xx);
        }
        scanner.close();
        dis.close();
        dos.close();
        socket.close();
        System.out.println("Client déconnecté proprement.");}}
