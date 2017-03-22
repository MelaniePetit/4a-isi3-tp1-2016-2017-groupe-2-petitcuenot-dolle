package Utils;

import graph.IGraph;
import graph.Node;

import java.util.NoSuchElementException;

/**
 *
 * Created by jeremy on 15/03/2017.
 */
public class BFSIterator extends GraphIterator {


    public BFSIterator(IGraph graph, Node node) {
        super(graph, node);
    }

    @Override
    public Node getNextNode() {
        if (list.isEmpty())
            throw new NoSuchElementException();
        else
            return list.get(0);
    }
}
