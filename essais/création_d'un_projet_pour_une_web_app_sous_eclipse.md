Date: 2015-02-25
Author: PLOUZEAU, Noël



# Création d'un projet pour une Web App sous Eclipse

1. Sous Eclipse créer un projet Maven (`New //Project..//Maven/Maven Project`)
2. Dans le panneau de sélection d'archétype, rechercher avec le mot-clé Jersey  dans le dépôt Maven central (si il n'y est pas il faut le rajouter dans les propriétés de projet, catégorie Maven, URL ` http://repo1.maven.org/maven2/`)
3. Choisir com.sun.jersey.archetype:jersey-quickstart-webapp
4. Choisir un group id (p. ex. fr.istic.caos) et un artefact id (p. ex. essai), et un package (p. ex. fr.istic.caos)
5. Cliquer sur Finish, la machinerie Maven s'ébranle et génère un application Web du style Hello World.
6. Cliquer sur le bouton Run//Run as J2EE Preview
7. Et voilà le serveur essai est lancé
8. Ouvrir un navigateur Web et aller à l'adresse http://localhost:8080/essai/myresource/

Si J2EE Preview ne parvient pas à se lancer car le port 8080 est déjà en écoute par un autre processus, employer
> lsof -i tcp:8080
> 
> kill leprocessusentrop


## Exemples de RESTful
Développé sous Eclipse en initialisant le projet selon la manière indiquée à la section précédente.

**Voir le dépôt Git nplouzeau/RESTclient et RESTserver**


