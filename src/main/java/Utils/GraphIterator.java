package Utils;

import graph.IGraph;
import graph.Node;

import java.util.*;
import java.util.stream.Collectors;

public abstract class GraphIterator implements Iterator<Node> {

    IGraph graph;
    Node node;
    List<Node> list = new LinkedList<>();
    List<Node> marked = new ArrayList<>();

    public GraphIterator(IGraph graph, Node node) {
        this.graph = graph;
        this.node = node;
        list.add(node);
        marked.add(node);
    }

    @Override
    public boolean hasNext() {
        return !list.isEmpty();
    }

    @Override
    public Node next(){
        if(hasNext()) {
            remove();
            if (!marked.contains(node))
                marked.add(node);

            list.addAll(graph.getAdjNodes(node)
                    .stream()
                    .filter(node -> !marked.contains(node))
                    .map(node -> {marked.add(node); return node;})
                    .collect(Collectors.toList()));

            Node previousNode = node;

            if (!list.isEmpty())
                node = getNextNode();

            return previousNode;
        }
        else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public void remove() {
        list.remove(node);
    }

    public abstract Node getNextNode();

}
