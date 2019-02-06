package DataReader

import net.sourceforge.olduvai.treejuxtaposer.*;
import net.sourceforge.olduvai.treejuxtaposer.drawer.Tree;
import net.sourceforge.olduvai.treejuxtaposer.drawer.TreeNode;

class Node(treeNode: TreeNode) {
    var treeNode = treeNode;

    public fun close() {
        treeNode.close();
    }

    public fun getName(name: String) : String{
        return treeNode.name;
    }

    public fun setName(name: String) {
        treeNode.setName(name);
    }

    public fun numberChildren() : Int {
        return treeNode.numberChildren();
    }

    public fun getChild(i : Int) : Node {
       return Node(treeNode.getChild(i));
    }


    public fun isRoot() : Boolean {
        return treeNode.isRoot();
    }


    public fun equals(node: Node): Boolean {
        return treeNode.name.equals(node.getName());
    }

    public fun addChild(node: Node) {
        treeNode.addChild(node.treeNode);
    }

    public fun setWeight(w : Double) {
        treeNode.setWeight(w);
    }

    public fun getWeight() : Float{
        return treeNode.getWeight();
    }

    public fun lastChild() : Node{
        return Node(treeNode.lastChild());
    }

    public fun print() {
        treeNode.print();
    }

    public fun setExtremeLeaves() {
        treeNode.setExtremeLeaves();
    }

    public fun linkNodesInPreorder() {
        treeNode.linkNodesInPreorder();
    }

    public fun linkNodesInPostorder() {
        treeNode.linkNodesInPostorder();
    }

    public fun setNumberleaves() : Int {
       return treeNode.setNumberLeaves()
    }

    override fun toString() : String {
        return treeNode.toString();
    }


}