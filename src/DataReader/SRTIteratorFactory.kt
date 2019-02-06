package DataReader

interface IteratorFactory {
    fun getIterator(type: String): SRTIterator;
}

class StandardIteratorFactory : IteratorFactory {
    override fun getIterator(type: String, tree: SRTree) =
            when (type) {
                "bfs" -> return BFSIterator(tree);
                "dfs" -> return DFSIterator(tree);
                else -> return StandardIterator(tree);
            }
    }
}