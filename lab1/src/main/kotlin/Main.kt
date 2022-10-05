fun main() {
    val elements = readln()
        .split(" ")
        .filter { it != "" }
        .map { it.toInt() }
    val tree = BTree<Int>()
    for (el in elements)
        tree.add(el)
    tree.print()
}