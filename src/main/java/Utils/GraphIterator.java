package Utils;

import graph.Graph;
import graph.Node;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public abstract class GraphIterator implements Iterator {

    Graph graph;
    Node node;
    List<Node> file;
    List<Node> marked = new ArrayList<Node>();

    public GraphIterator(Graph graph, Node node, List<Node> file) {
        this.graph = graph;
        this.node = node;
        this.file = new LinkedList<Node>();
    }

    public boolean hasNext() {
        return false;
    }

    public Node next() {
        return file.iterator().next();
    }

    public void remove(Node node) {
        file.remove(node);
    }

    private void parcoursLargeur(Node node)
    {
        file.add(node); //add and mark
        marked.add(node);
        do {
            node = next();
            System.out.println(node);
            for(graph.Node neighbours : graph.getAdjNodes(node))
            {
                if (!marked.contains(neighbours))
                {
                    file.add(neighbours);
                    marked.add(neighbours);
                }
            }
            remove(node);
        }while (!file.isEmpty());
    }
}
