package serverPackage;
import java.io.*;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
public class Server_1_3 {
    public static void main(String[] args) throws IOException {
        InetAddress adresseIP = InetAddress.getByName("192.168.0.122");
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
            int nb = dis.readInt();
            if (nb == 0) {
                System.out.println("Le client a envoyé 0. Arrêt de la communication demandé.");
                break;
            }
            System.out.println("Le serveur a reçu le nombre: " + nb);
            int x = nb * 5;
            System.out.println("Calcul du serveur: " + nb + " * 5 = " + x);
            dos.writeInt(x);
            dos.flush();
            System.out.println("Le résultat a été envoyé au client.");
        }
        dis.close();
        dos.close();
        socket.close();
        socketServeur.close();
        System.out.println("Serveur arrêté proprement.");}}
