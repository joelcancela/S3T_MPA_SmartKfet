# Smart K'Fet

Ce projet à été réalisé à l'IUT dans le cadre de la matière "Méthodologie de la production d'applications".

Le sujet portait sur la création d'une application tablette pour une cafétéria, notre axe de développement était sur la prise de commandes.
L'application est développée en Java Swing.

## Fonctionalités

### Connexion

![Connexion](/doc/SmartKfet_Login.jpg)

### Panel Admin

![Panel Admin](/doc/SmartKfet_Panel_Admin.jpg)

- Gestion des membres

![Gestion des membres](/doc/SmartKfet_Panel_Member.jpg)

- Gestion des produits

![Gestion des produits](/doc/SmartKfet_Panel_Products.jpg)

- Gestion des stocks

![Gestion des stocks](/doc/SmartKfet_Panel_Stocks.jpg)

### Prise de commandes

![Prise de commandes](/doc/SmartKfet_Order_Taking.jpg)

- Paiement d'une commande

![Paiement d'une commande](/doc/SmartKfet_Order_Validation.jpg)

## Notes

- Le compte admin par défaut est: ``id: 00``, ``mot de passe: 0000``
- Tout est sérialisé dans un fichier ```Save.txt``` à la racine du projet.

## Compilation et Exécution

### Nécessite

- Apache Ant
- Java 8

### Lancement

```bash
ant clean # Pour nettoyer le projet
ant jar # Pour créer le jar
java -jar dist/SmartKfet.jar # Lancer l'application
```