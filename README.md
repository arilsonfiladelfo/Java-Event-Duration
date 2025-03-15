# Calcul de la durée de l'événement (uri1061)

## Description du problème

Pedrinho organise un événement à l'Université qui aura lieu au mois d'avril, en commençant et en terminant dans le même mois. Le problème consiste à calculer la durée totale de l'événement, sachant l'heure et la date de début et de fin.

## Entrée

- La première ligne indique le jour de début au format : `Jour <numéro>`
- La deuxième ligne indique l'heure de début au format : `hh : mm : ss`
- La troisième ligne indique le jour de fin au format : `Jour <numéro>`
- La quatrième ligne indique l'heure de fin au format : `hh : mm : ss`

## Sortie

La sortie doit afficher la durée totale de l'événement au format :

```
W jour(s)
X heure(s)
Y minute(s)
Z seconde(s)
```

## Exemple d'entrée
```
Jour 5
08 : 12 : 23
Jour 9
06 : 13 : 23
```

## Exemple de sortie
```
3 jour(s)
22 heure(s)
1 minute(s)
0 seconde(s)
```

## Explication

Le programme convertit les dates et les heures en secondes, calcule la différence et reconvertit le total en jours, heures, minutes et secondes.

## Comment exécuter le code

1. Compiler le code :
```
javac Main.java
```

2. Exécuter le code :
```
java Main
```

3. Entrer les données conformément au format spécifié.

## Auteur
Projet réalisé pour la plateforme URI Online Judge.

