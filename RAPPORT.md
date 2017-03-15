**Nom/Prénom Etudiant 1 : DOLLE Jérémy**

**Nom/Prénom Etudiant 2 : PETITCUENOT Mélanie**

# Rapport TP1

## Question 1

getAllNodes() :  la méthode récupère les clés grâce à la méthode _keySet()_ depuis le tableau _adjacence_ puis  les stock 
dans une liste.

getNbNodes() : la méthode retourne la taille de la liste générée par getAllNodes().
 
getAdjNodes(Node _n) : la méthode récupère tous les arcs du noeud renseigné en paramètre, puis pour chaque arc, elle véréfie 
que  _n est bien la source et stocke la destination dans une liste _adjNodes_ qui est retournée à la fin. 

toString() : la méthodfe récupère les différentes données grâce aux différentes méthodes codées si dessus, puis les affiche. 

## Question 2

La classe _UndirectedGraph_ a pour interface la classe _IUndirectedGraph_. Elle a pour attribut un graphe dont on se sert 
pour implementer la plus part des méthodes. Seule la méthode _addEdge(Node n1, Node n2)_ est implémentée sans utiliser le graph.

_addEdge(Node n1, Node n2)_ crée un arc non-orienté entre les deux noeuds, pour cela un arc n1 -> n2 est ajouté à la liste d'arc
puis son inverse (n2 => n1).

## Question 3
*Expliquer le code ajouté et insérer un schéma du patron de conception mis en place*

## Question 4
*Expliquer le code ajouté et insérer un schéma du patron de conception mis en place*
