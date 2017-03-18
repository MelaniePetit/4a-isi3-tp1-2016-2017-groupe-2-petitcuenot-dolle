package Utils;

import graph.IGraph;
import graph.Node;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

/**
 *
 * Created by jeremy on 15/03/2017.
 */
public class BFSIterator extends GraphIterator {

    public BFSIterator(IGraph graph, Node node) {
        this.graph = graph;
        this.node = node;
        file.add(node);
        marked.add(node);
    }

    @Override
    public Node getNextNode() {
        return file.isEmpty() ? null : file.get(0);
    }

//    @Override
//    public Node next(){
//        if(hasNext()) {
//            remove();
//            if (!marked.contains(node))
//                marked.add(node);
//            List<Node> adjs = graph.getAdjNodes(node).stream().filter(node -> !marked.contains(node)).collect(Collectors.toList());
//
//            for (Node node : adjs)
//            {
//                if (!file.contains(node))
//                    file.add(node);
//            }
//
//            Node previousNode = node;
//            node = getNextNode();
//
//            return previousNode;
//        }
//        else {
//            throw new NoSuchElementException();
//        }
//    }
}
