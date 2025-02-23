# Kotlin Collection Modification Pitfalls

This repository demonstrates a potential issue when removing elements from collections in Kotlin, specifically focusing on the difference between modifying a list directly with `removeIf` and modifying the keys of a map using `removeIf` on the keys set. 

The `Bug.kt` file shows the unexpected behavior that can occur. The `BugSolution.kt` file demonstrates safe methods for modifying collections.