package DataReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

import net.sourceforge.olduvai.treejuxtaposer.*;
import net.sourceforge.olduvai.treejuxtaposer.drawer.Tree;
import net.sourceforge.olduvai.treejuxtaposer.drawer.TreeNode;



public class SRTree {
	Tree tree;
	int current_depth = 0;
	int tree_height;
	
	SRTree(String fileName) throws FileNotFoundException {
		BufferedReader r = new BufferedReader(new FileReader(fileName));
		TreeParser tp = new TreeParser(r);
		this.tree = tp.tokenize(1, fileName, null);
		this.tree_height = tree.getHeight();
	}
	
	private void ReadNodes(Stack<TreeNode> nodes, ScreenReader sr) {
		while (nodes.empty() == false) {
			TreeNode curr = nodes.pop();
			String nodeStatement = curr.toString();
			System.out.println(nodeStatement);
			sr.out(nodeStatement);
		}
	}
	
	public void TraverseBFS(ScreenReader sr) {
		ReadNodes(this.bfs(), sr);
	}

	private Stack<TreeNode> bfs() {
		Stack<TreeNode> acc = new Stack<TreeNode>();
		Queue<TreeNode> nodeQueue = new LinkedList<TreeNode>();
		nodeQueue.add(this.tree.getNodeByKey(0));
		this.bfsHelper(this.tree, nodeQueue, acc);
		return acc;
	}
	
	private Stack<TreeNode> bfsHelper(Tree tree, Queue<TreeNode> nodeQueue, Stack<TreeNode> acc) {
		TreeNode curr = nodeQueue.poll();
		if (curr == null) return acc;
		acc.push(curr);
		for(int i = 0; i < curr.numberChildren(); i++) {
			nodeQueue.add(curr.getChild(i));
		}
		return bfsHelper(tree, nodeQueue, acc);
	}
}

