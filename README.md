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
