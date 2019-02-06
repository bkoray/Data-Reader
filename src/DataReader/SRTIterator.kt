package DataReader

abstract class SRTIterator(val tree: SRTree){
    abstract fun hasNext() : Boolean;
    abstract fun next() : Node;
    abstract fun remove();
}