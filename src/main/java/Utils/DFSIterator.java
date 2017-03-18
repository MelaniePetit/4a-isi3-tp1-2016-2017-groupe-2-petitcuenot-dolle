package Utils;

import graph.IGraph;
import graph.Node;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

/**
 *
 * Created by jeremy on 18/03/2017.
 */
public class DFSIterator extends GraphIterator {

    public DFSIterator(IGraph graph, Node node) {
        this.graph = graph;
        this.node = node;
        file.add(node);
        marked.add(node);
    }

    @Override
    public Node getNextNode() {
        return file.isEmpty() ? null : file.get(file.size()-1);
    }


}
