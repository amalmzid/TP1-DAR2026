package clientPackage;
import java.io.*;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;
public class Client_1_3_partie2   {
    public static void main(String[] args) throws IOException {
        System.out.println("Je ne suis pas encore connecté");
        InetAddress adresseIP = InetAddress.getByName("192.168.0.19");
        InetSocketAddress socketAddress = new InetSocketAddress(adresseIP, 1234);
        Socket socket = new Socket();
        socket.connect(socketAddress);
        System.out.println("Je suis un client connecté à l'adresse IP: " + adresseIP.getHostAddress());
        Scanner scanner = new Scanner(System.in);
        OutputStream os = socket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        InputStream is = socket.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        while (true) {
            System.out.println("\n=== Menu Calculatrice ===");
            System.out.println("1. Addition");
            System.out.println("2. Soustraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("0. Quitter");
            System.out.print("Choisissez une opération : ");
            int operation = scanner.nextInt();
            if (operation == 0) {
                System.out.println("Arrêt de la communication demandé.");
                dos.writeInt(operation);
                dos.flush();
                break;
            }
            if (operation < 1 || operation > 4) {
                System.out.println("Opération invalide. Veuillez choisir entre 1 et 4.");
                continue;
            }
            System.out.print("Entrez un nombre x : ");
            int x = scanner.nextInt();
            dos.writeInt(operation);
            dos.writeInt(x);
            dos.flush();
            System.out.println("Opération et nombre envoyés au serveur.");
            double resultat = dis.readDouble();
            System.out.println("Résultat reçu du serveur : " + resultat);
        }
        scanner.close();
        dis.close();
        dos.close();
        socket.close();}}
