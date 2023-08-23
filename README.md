# Mise à jour : 3

## Résumé 
- Mise à jour des méthodes de recherches d'éléments dans l'arbre.
- Syntaxe et nom des différntes variables, du code modifié.
- Ecriture de commentaire Javadoc.
- Ajout de nouveau tests.

## Nouvelles Enumération

### AcceptedData 

Cette énumération premet de vérifier si le filtre choisit par l'utilisateur est un filtre exploitable, autorisé. 

Utilisation :

``` Java
Category.java -> isCorrectValue();
```

## Nouvelles méthodes

### Category.search()

Désormais, il n'y a plus qu'une seule fonction qui permet de rechercher différents éléments.
Cependant, maintenant la fonction demande un filtre. Ce filtre est un String qui peut être : 
- Name
- Id
- DataType

Cette fonctionnalité permet d'éviter toute confusion si nous êtions amener a modifier le Json pour ajouter de nouvelle mesures / informations.

A présent, les méthodes searchByName, searchById et searchByDataType sont toutes les trois remplacé par search. 

Exemple syntaxe :
``` Java
Category.search("Temperature", "filtre");
```

Emplacement : 

``` Java
Category.java
```
### Measure.measureFilter()

Cette fonction crucial pour le nouveau système de filtrage d'éléments permets de trouver les mesures a renvoyé grace au filtre. (Voir les filtres plus haut)

Exemple syntaxe :

``` Java
measures.measuresFilter(filter);
```
Emplacement :
``` java
Measure.java 
```

## Syntaxe et noms de variables

Après avoir passé le code au peigne fin, le nom de chaque variables, class, méthodes ont été changés pour que ceux-ci correspondent au mieux à l'écriture courante de code Java. Egalement pour que le code soit plus compréhensible pour tout le monde. 

Quelques exemples de syntaxe :
- la Class Results : results --> Results
- la méthode loadPlcTree : loadplctree() --> loadPlcTree() 

Quelques exemples de noms :
- la variable file : treefilefluxfile --> file 
- la variable d'élément : varObject --> eltSearch

## Ajout des tests

Suite à la modifications des différentes méthodes, de nouveaux tests unitaire plus précis et aboutis. En effet, maintenant qu'il y a deux facteurs a prendre en compte

- élément recherché
- filtre

Beaucoup plus de problèmes peuvent apparaitre :

- Mauvais filtre entre l'élément et l'arbre.
- Filtre / élément non existant.

#### Exemples :

les deux assertions sont bonne, l'une vérifie un bon résultats positif, l'autre vérifie que le résultats est bien négatif.

``` Java
Assertions.assertTrue(CategoryX.search("Temperature", "Name")); 
Assertions.assertFalse(CategoryX.search("Temperature", "Id"));
```

# Partie sélectionnée :

Suite au choix concernant la réalisation de ce test, j'ai décidé de m'orienter sur la partie Java du projet.

### Liberté prise 

Afin de mener à bien ce projet, j'ai prit la liberté de modifier les fonctions demandés (notamment au niveau des paramètres) et d'en rajouter quelques-unes.
Par exemple, Nous appellons toujours la fonction SearchByName avec un chemin String en paramètre, cependant, la recherche d'effectueras dans searchingByName.
Cela a pour but de faire d'obtenir le même résultat sans modifier le main, mais en même temps de pouvoir faire un algorithme réccursif en algorithme de recherche.


# scorpio-recruitment-test

## Gérer l'arbre de données d'un automate

Description du context
L'arbre de données est organisé par catégories et sous-catégories.

Example :
Catégorie : 'robot-1'

Sous-catégorie : 'analogic-value'

Measure : 'Pression'

Définition des entités :
Une catégorie est définie par :

- un id
- un nom
- une liste de sous-categories
- une liste de mesures

Une mesure est définie par :

- un id
- un nom
- un dataType

## structure du projet de test :

Le projet comporte deux modules : 

- java-recruitment-test : contient la structure du test pour les candidats désirant réaliser le test en java
- typescript-recruitment-test : contient la structure du test pour les candidats désirant réaliser le test en typescript

## Questions :

### Gérer l'arbre de l'automate
L'arbre de l'automate est décrit dans un fichier json (plcTree.json). Vous trouverez ce fichier dans le projet github (répertoire resources).

Ecrivez-le code pour :

- Charger l'arbre de l'automate dans une catégorie racine
- Chercher les mesures dont le nom contient un mot donné (le chemin de chaque mesure trouvée est requis)
- Chercher les mesures dont le type est donné (le chemin de chaque mesure trouvée est requis)
- tester unitairement le code éccrit

#### Instructions pour le test en java
 - le main est placé dans la classe Plc.java, il contient déjà la structure finale du programme.
 - les fonctions loadPlcTree (Plc.java), searchMeasureByName (Category.java) et searchMeasureByType (Category.java) sont à implémenter.
 - un REAMDE.md est placé dans le module java-recruitment-test pour vous aider à démarrer le projet.
 - il est autoriser de rajouter des librairies au projet.

#### Instructions pour le test en typescript
- le main est placé dans le fichier main.ts, il contient déjà la structure finale du programme.
- les fonctions loadPlcTree (plc.ts), searchMeasureByName (plc.ts) et searchMeasureByType (plc.ts) sont à implémenter.
- un REAMDE.md est placé dans le module typescript-recruitment-test pour vous aider à démarrer le projet.
- il est autoriser de rajouter des librairies au projet.
