fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList) // Output: [2, 4, 6, 8, 10]

    // Incorrect way to modify the list
    // list.map { it * 2 } // This doesn't modify the original list

    val modifiedList = list.toMutableList()
    modifiedList.map { it * 2 }
    println(modifiedList) // Output: [1, 2, 3, 4, 5] 

    //correct way to modify the list
    modifiedList.replaceAll { it * 2 }
    println(modifiedList) // Output: [2, 4, 6, 8, 10]
}