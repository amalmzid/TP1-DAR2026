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

---

# TP1 - Activité 2 - Applications Réparties

## Description
Cette activité étend l'application client-serveur en ajoutant un traitement des nombres envoyés par le client : le serveur multiplie la valeur envoyée par 5.

## Execution

### Code du serveur
![Code serveur](screenshots/tp1-activite2-server-code-part.png)

**Interprétation** : Le serveur reçoit un nombre du client, le multiplie par 5 et renvoie le résultat.

### Lancement du serveur
![Lancement serveur](screenshots/tp1-activite2-launch-server-wait-for-client-part.png)

**Interprétation** : Le serveur se lance et attend la connexion d'un client sur le port 1234.

### Code du client
![Code client](screenshots/tp1-activite2-client-code-part.png)

**Interprétation** : Le client se connecte au serveur et permet à l'utilisateur d'entrer un nombre.

### Lancement du client
![Lancement client](screenshots/tp1-activite2-launch-client-connected-part.png)

**Interprétation** : Le client se connecte avec succès au serveur et attend l'entrée d'un nombre.


### Client envoie 0
![Client envoie 0](screenshots/tp1-activite2-client-gives-nb-0-and-sever-replies-part.png)

**Interprétation** : Le client envoie 0, le serveur le multiplie par 5 (0 × 5 = 0) et renvoie le résultat.

### Client envoie un nombre négatif
![Client envoie négatif](screenshots/tp1-activite2-client-gives-negative-nb-and-sever-replies-part.png)

**Interprétation** : Le client envoie un nombre négatif, le serveur le multiplie par 5 et renvoie le résultat (exemple : -3 × 5 = -15).

### Client envoie un nombre (ex: 5)
![Client envoie nombre](screenshots/tp1-activite2-client-gives-nb-and-sever-replies-part.png)

**Interprétation** : Le client envoie le nombre 5 au serveur, qui le multiplie par 5 (5 × 5 = 25) et renvoie le résultat.

### Serveur après réponse
![Serveur après réponse](screenshots/tp1-activite2-server-after-replies-to-client.png)

**Interprétation** : Le serveur affiche le nombre reçu et le résultat de la multiplication.

---

## multiplication avec plusieurs entiers

### Code du serveur modifié
![Code serveur modifié](screenshots/tp1-acticite2-server-code-multiplication-multiple.png)

**Interprétation** : Le serveur utilise une boucle pour traiter plusieurs nombres consécutifs envoyés par le client. Il continue à multiplier chaque nombre par 5 tant que le client envoie des données.

### Lancement du serveur
![Lancement serveur](screenshots/tp1-acticite2-launch-server-code-multiplication-multiple.png)

**Interprétation** : Le serveur se lance et attend la connexion d'un client. Il est prêt à traiter plusieurs nombres consécutifs.

### Code du client modifié
![Code client modifié](screenshots/tp1-acticite2-client-code-multiplication-multiple.png)

**Interprétation** : Le client utilise une boucle pour permettre à l'utilisateur de saisir plusieurs entiers successivement. La boucle se termine lorsque l'utilisateur saisit 0.

### Lancement du client avec multiplications multiples
![Lancement client](screenshots/tp1-acticite2-launch-client-code-multiplication-multiple.png)

**Interprétation** : Le client se connecte au serveur et permet à l'utilisateur de saisir plusieurs nombres. Chaque nombre est envoyé au serveur, multiplié par 5, et le résultat est affiché. Le processus se termine automatiquement lorsque l'utilisateur saisit 0, fermant proprement la connexion.


