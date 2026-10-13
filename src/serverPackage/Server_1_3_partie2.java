package serverPackage;
import java.io.*;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
public class Server_1_3_partie2 {
    public static void main(String[] args) throws IOException {
        InetAddress adresseIP = InetAddress.getByName("192.168.0.19");
        InetSocketAddress socketAddress = new InetSocketAddress(adresseIP, 1234);
        ServerSocket socketServeur = new ServerSocket();
        socketServeur.bind(socketAddress);
        System.out.println("Le serveur écoute sur l'adresse IP: " + adresseIP.getHostAddress() + " et le port: 1234");
        System.out.println("Le serveur attend un client");
        Socket socket = socketServeur.accept();
        System.out.println("Un client est connecté");
        InputStream is = socket.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        OutputStream os = socket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        while (true) {
            int operation = dis.readInt();
            if (operation == 0) {
                System.out.println("Le client a demandé l'arrêt de la communication.");
                break;
            }
            int x = dis.readInt();
            System.out.println("Le serveur a reçu l'opération: " + operation + " et le nombre: " + x);
            double resultat;
            String nomOperation;
            switch (operation) {
                case 1:
                    resultat = x + 5;
                    nomOperation = "Addition";
                    break;
                case 2:
                    resultat = x - 5;
                    nomOperation = "Soustraction";
                    break;
                case 3:
                    resultat = x * 5;
                    nomOperation = "Multiplication";
                    break;
                case 4:
                    resultat = (double) x / 5;
                    nomOperation = "Division";
                    break;
                default:
                    System.out.println("Opération invalide reçue.");
                    continue;
            }
            System.out.println("Calcul du serveur: " + nomOperation + " (" + x + " op 5) = " + resultat);
            dos.writeDouble(resultat);
            dos.flush();
            System.out.println("Le résultat a été envoyé au client.");
        }
        dis.close();
        dos.close();
        socket.close();
        socketServeur.close();}}
