This repository demonstrates a common error in Kotlin related to list modification. The `map` function in Kotlin does not modify the original list; it returns a new list.  If you intend to modify the original list, you must use a mutable list and the `replaceAll` function, or a similar approach. The `bug.kt` file shows incorrect attempts to modify a list using `map`, and `bugSolution.kt` demonstrates the correct approach. 