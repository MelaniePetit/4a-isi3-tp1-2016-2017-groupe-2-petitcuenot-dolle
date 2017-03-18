package graph;

import Utils.BFSIterator;
import Utils.DFSIterator;

import java.util.*;


public class Graph implements IDirectedGraph {

	/**
	 * A chaque cle=noeud est associe la liste des arcs sortants de ce noeud
	 */
	private Map<Node,List<Arc>> adjacence; 
	
	public Graph(){
		
		adjacence = new HashMap<Node,List<Arc>>();
		
		
	
	}
	/**
	 * 
	 * @param _n1
	 * @param _n2
	 * @return vrai si graph possede arc de src _n1 et destination _n2
	 */
	public boolean hasArc(Node _n1, Node _n2){
		List<Arc> arretesAdj = adjacence.get(_n1);
		for (Arc _a : arretesAdj){
			if (_n1.equals(_a.getSource()) && _n2.equals(_a.getDestination()))
				return true;
		}
		return false;
	}
	
	public void addNode(Node _node){
		adjacence.put(_node, new ArrayList<Arc>());

	}
	
	public void addArc(Arc _edge){
	
		if (!hasArc(_edge.getSource(),_edge.getDestination()))
			adjacence.get(_edge.getSource()).add(_edge);
	
	}
	
	public Set<Node> getAllNodes(){
		return adjacence.keySet();
	}
	
	public int getNbNodes(){
		return getAllNodes().size();
	}
	
	/**
	 * 
	 * @param _n
	 * @return tous les arcs de source _n
	 */
	public List<Arc> getArc(Node _n){
		
		return adjacence.get(_n);
	}
	/**
	 * renvoie tous les noeuds qui sont destination d'un arc dont la source est _n
	 */
	public List<Node> getAdjNodes(Node _n){
		List<Arc> adjArcs = adjacence.get(_n);
		List<Node> adjNodes = new ArrayList<Node>();
		for (Arc arc : adjArcs)
		{
			if (_n == arc.getSource())
				adjNodes.add(arc.getDestination());
		}
		return adjNodes;
	}

	@Override
	public Iterator<Node> creerBFSIterator(Node n) {
		return new BFSIterator(this,n);
	}

	@Override
	public Iterator<Node> creerDFSIterator(Node n) {
		return new DFSIterator(this,n);
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append("Graph\n");
		for (Node node : getAllNodes())
		{
			stringBuilder.append("[noeud=" + node + " : [");
			if (!getAdjNodes(node).isEmpty())
					stringBuilder.append(node.getLabel() + "=>");
			for(Node adjNode : getAdjNodes(node))
			{
				stringBuilder.append(adjNode.getLabel() +"(" + hasArc(node,adjNode) + ")]");
			}
			stringBuilder.append("\n");
		}
		return stringBuilder.toString();
	}


	
}
