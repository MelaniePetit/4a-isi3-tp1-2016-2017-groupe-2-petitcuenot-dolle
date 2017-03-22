package Utils;

import graph.IGraph;
import graph.Node;

import java.util.NoSuchElementException;

/**
 *
 * Created by jeremy on 18/03/2017.
 */
public class DFSIterator extends GraphIterator {


    public DFSIterator(IGraph graph, Node node) {
        super(graph, node);
    }

    @Override
    public Node getNextNode() {
        if(list.isEmpty())
            throw new NoSuchElementException();
        else
            return list.get(list.size()-1);
    }


}
