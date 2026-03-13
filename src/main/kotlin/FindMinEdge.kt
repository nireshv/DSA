package org.uncledroid

import java.util.LinkedList
import java.util.Queue

fun main() {
    val vertices: List<MutableList<Int>> = MutableList(6) { mutableListOf() }
    vertices.addEdge(0, 1)
    vertices.addEdge(1, 2)
    vertices.addEdge(2, 3)
    vertices.addEdge(3, 4)
    vertices.addEdge(4, 5)
    vertices.addEdge(3, 5)

    println(findMinEdge(vertices, 3, 5))
}

fun List<MutableList<Int>>.addEdge(v1: Int, v2: Int) {
    get(v1).add(v2)
}

fun findMinEdge(vertices: List<MutableList<Int>>, start: Int, end: Int): Int {
    val visited = MutableList(vertices.size) { false }
    val queue: Queue<Pair<Int, Int>> = LinkedList()
    queue.add(Pair(start, 0))

    while (queue.isNotEmpty()) {
        val (curr, count) = queue.remove()
        if (visited[curr]) continue

        if (curr == end) return count
        visited[curr] = true
        vertices[curr].forEach {
            queue.add(it to count+1)
        }
    }
    return -1
}