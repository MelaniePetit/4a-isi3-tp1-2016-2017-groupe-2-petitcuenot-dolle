package graph;

import Utils.BFSIterator;
import Utils.DFSIterator;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Created by jeremy on 15/03/2017.
 */
public class UndirectedGraph implements IUndirectedGraph{

    private Graph graph = new Graph();

    public UndirectedGraph() {
    }

    public void addNode(Node _node) {
        graph.addNode(_node);
    }

    public Set<Node> getAllNodes() {
        return graph.getAllNodes();
    }

    public int getNbNodes() {
        return graph.getNbNodes();
    }

    public List<Node> getAdjNodes(Node _n) {
        return graph.getAdjNodes(_n);
    }

    @Override
    public Iterator<Node> creerBFSIterator(Node n) {
        return new BFSIterator(this, n);
    }

    @Override
    public Iterator<Node> creerDFSIterator(Node n) {
        return new DFSIterator(this,n);
    }

    public void addEdge(Node _node1, Node _node2) {
        graph.addArc(new Arc(_node1,_node2,null));
        graph.addArc(new Arc(_node2,_node1,null));
    }

    public boolean hasEdge(Node _node1, Node _node2) {
        return graph.hasArc(_node1,_node2);
    }

}
