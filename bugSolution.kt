fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList) // Output: [2, 4, 6, 8, 10]

    // Correct way to modify the list
    val mutableList = list.toMutableList()
    mutableList.replaceAll { it * 2 }
    println(mutableList) // Output: [2, 4, 6, 8, 10] 

    //Alternative approach using map and toMutableList
    val anotherMutableList = list.map { it * 2 }.toMutableList()
    println(anotherMutableList) // Output: [2, 4, 6, 8, 10]
} 