fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    val toRemove = list.filter { it > 2 }
    list.removeAll(toRemove)
    println(list) // Output: [1, 2]

    val map = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    val keysToRemove = mutableListOf<String>()
    for (key in map.keys) {
        if (key == "b") {
            keysToRemove.add(key)
        }
    }
    keysToRemove.forEach{map.remove(it)}
    println(map) // Output: {a=1, c=3}
    
    //Alternative solution for map
    map.entries.removeIf { it.key == "a" }
    println(map) // Output: {c=3}
} 