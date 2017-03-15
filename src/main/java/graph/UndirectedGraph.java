package graph;

import java.util.List;
import java.util.Set;

/**
 * Created by jeremy on 15/03/2017.
 */
public class UndirectedGraph implements IUndirectedGraph{

    private Graph graph = new Graph();

    public UndirectedGraph(Graph graph) {
        this.graph = graph;
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

    public void addEdge(Node _node1, Node _node2) {
        Arc arcA = new Arc(_node1,_node2,null);
        Arc arcR = new Arc(_node2,_node1,null);
        graph.addArc(arcA);
        graph.addArc(arcR);
    }

    public boolean hasEdge(Node _node1, Node _node2) {
        return graph.hasArc(_node1,_node2);
    }
}
