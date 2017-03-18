package Utils;

import graph.IGraph;
import graph.Node;

import java.util.*;
import java.util.stream.Collectors;

public abstract class GraphIterator implements Iterator<Node> {

    IGraph graph;
    Node node;
    List<Node> file = new LinkedList<>();
    Stack<Node> stack = new Stack<>();
    List<Node> marked = new ArrayList<>();

    @Override
    public boolean hasNext() {
        return !file.isEmpty();
    }

    @Override
    public Node next(){
        if(hasNext()) {
            remove();
            if (!marked.contains(node))
                marked.add(node);
            List<Node> adjs = graph.getAdjNodes(node).stream().filter(node -> !marked.contains(node)).collect(Collectors.toList());

            for (Node node : adjs)
            {
                if (!file.contains(node))
                    file.add(node);
            }

            Node previousNode = node;
            node = getNextNode();

            return previousNode;
        }
        else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public void remove() {
        file.remove(node);
    }

    public abstract Node getNextNode();

}
