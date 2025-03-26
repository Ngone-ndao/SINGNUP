# SINGNUP - Project Web Development

## Description

SINGNUP est une application de gestion des utilisateurs qui permet à un utilisateur de s'inscrire, se connecter et se déconnecter. Ce projet utilise les technologies suivantes : 

- **HTMX** : pour une gestion dynamique des interactions utilisateur.
- **JSP** (JavaServer Pages) : pour la génération dynamique des pages HTML.
- **Servlets** : pour traiter les requêtes et la logique côté serveur.
- **JDBC** (Java Database Connectivity) : pour la communication avec la base de données.
- **MySQL** : pour stocker les informations des utilisateurs.

## Technologies Utilisées

- **HTMX** : pour des mises à jour dynamiques du DOM sans recharger la page.
- **JSP / Servlets** : pour la gestion des pages et de la logique métier côté serveur.
- **JDBC** : pour la connexion et la manipulation de la base de données MySQL.
- **MySQL** : pour gérer les utilisateurs et leurs informations.
- **Bootstrap 5** : pour le design responsive de l'application.
- **FontAwesome** : pour l'intégration d'icônes.

## Fonctionnalités

- **Inscription utilisateur** : Formulaire permettant de créer un compte avec un nom, un email, un mot de passe et un numéro de téléphone.
- **Connexion utilisateur** : Permet à un utilisateur de se connecter avec son email et son mot de passe.
- **Déconnexion** : Permet à un utilisateur de se déconnecter de l'application.
- **Validation en temps réel** : Utilisation d'HTMX pour valider les formulaires d'inscription et de connexion sans recharger la page.

## Architecture

- L'application suit l'architecture **MVC** (Modèle-Vue-Contrôleur) pour séparer les responsabilités.
- **Model** : Interaction avec la base de données via JDBC.
- **View** : Utilisation de JSP pour générer le HTML.
- **Controller** : Utilisation des Servlets pour traiter les requêtes et manipuler la logique métier.

## Diagramme UML

Diagramme de classes](assets/img/DiagrammeClasses.png)

## Installation

### Prérequis

- **Java 23**
- **MySQL** (une base de données compatible avec JDBC)
- **Apache Tomcat** pour exécuter l'application.

### Étapes d'installation

1. Clonez le projet :  
git clone https://github.com/Ngone-ndao/SINGNUP.git

Importez le projet dans votre IDE (comme Eclipse ou IntelliJ IDEA).
Configurez votre base de données MySQL et assurez-vous que les informations de connexion sont correctes dans le fichier de configuration de l'application.
Déployez l'application sur Apache Tomcat.
Accédez à l'application via votre navigateur : http://localhost:8080/SINGNUP.
Tests
Le projet contient des tests pour vérifier le bon fonctionnement des fonctionnalités suivantes :

Vérification de la connexion utilisateur.
Validation des données d'inscription.

Fonction	        Résultat attendu
Inscription réussie	Message de succès dynamique
Email déjà utilisé	Message d’erreur HTMX
Connexion réussie	Redirection vers index.jsp
Mauvais mot de passe	Message d’erreur
Déconnexion	        Redirection vers la page login.jsp


Auteur
Développé par Ngone Ndao, Ababacar Mbengue, Daouda Amsata Gueye, Mouhammad Sonko, Ibrahima Dieng.

Capture d'écran
Voir une capture d'écran de l'application dans
(assets/img)

 
Licence
Ce projet est sous licence MIT - voir le fichier LICENSE pour plus de détails.


