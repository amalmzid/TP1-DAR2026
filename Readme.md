# TP1 - Activité 1 - Applications Réparties

## Description
Ce projet implémente une application client-serveur en utilisant des sockets en mode connecté.
## Structure du Projet
- **Server.java** : Serveur qui écoute les connexions clients
- **Client.java** : Client qui se connecte au serveur

## Execution


### Code du serveur 
![Code serveur localhost](screenshots/tp1-activite1-server-code-localhost-part.png)



### Lancement du serveur
![Lancement serveur](screenshots/tp1-activite1-launch-server-localhost-part.png)

**Interprétation** : Le serveur se met en écoute sur le port 1234 et attend les connexions des clients.

### Code du client 
![Code client localhost](screenshots/tp1-activite1-client-code-localhost-part.png)



### Lancement du client 
![Lancement client](screenshots/tp1-activite1-launch-client-localhost-part.png)

**Interprétation** : Le client se connecte à l'adresse localhost sur le port 1234.

### Connexion établie
![Connexion serveur-client](screenshots/tp1-activite1-server-connected-to-client-localhost-part.png)

**Interprétation** : La connexion est établie avec succès, le serveur et le client peuvent communiquer.


### Changement d'adresse IP au lieu de localhost 
![Configuration IP](screenshots/tp1-activite1-ipconfig-cmd-ip-address-part.png)

**Interprétation** : Commande ipconfig pour récupérer l'adresse IP de la machine.


### Code et exécution avec adresse IP
![Code serveur IP](screenshots/tp1-activite1-server-code-and-result-ip-address-part.png)

**Interprétation** : Le serveur utilise l'adresse IP locale pour accepter les connexions.

![Code client IP](screenshots/tp1-activite1-client-code-and-result-ip-address-part.png)

**Interprétation** : Le client se connecte en utilisant l'adresse IP du serveur au lieu de localhost.


