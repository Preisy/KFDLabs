

class BTree<T : Comparable<T>> {
    private var root: Node<T>? = null;

    fun add(el: T): Boolean {
        if (root == null) root = Node(el);

        var it = root
        while(it != null) {
            if (it.data == el) {
                return false
            } else if (it.data < el) {
                if (it.right == null) {
                    it.right = Node(el)
                    return true
                }
                it = it.right
            } else if (it.data > el) {
                if (it.left == null) {
                    it.left = Node(el)
                    return true
                }
                it = it.left
            }
        }
        return false
    }

    fun print() {
        lnr(root) {
            print("$it ")
        }
        println()
    }

    private fun lnr(node: Node<T>?, callback: (T) -> Unit) {
        if (node == null) return

        lnr(node.left, callback)
        callback(node.data)
        lnr(node.right, callback)
    }

}


internal class Node<T>(_data: T) {
    var left: Node<T>? = null;
    var right: Node<T>? = null;
    var data: T = _data;
}