fun main() {
    val elements = readln()
        .split(" ")
        .filter { it != "" && it.toIntOrNull() != null }
        .map { it.toInt() }
    val tree = BTree<Int>()
    for (el in elements)
        tree.add(el)
    tree.lnr {
        print("$it ")
    }
}