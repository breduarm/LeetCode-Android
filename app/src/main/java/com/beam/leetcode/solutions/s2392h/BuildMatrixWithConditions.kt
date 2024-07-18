package com.beam.leetcode.solutions.s2392h

class BuildMatrixWithConditions {

    fun solve(
        k: Int,
        rowConditions: Array<IntArray>,
        colConditions: Array<IntArray>,
    ): Array<IntArray> {
        val rowOrder = topologicalSort(rowConditions, k)
        val colOrder = topologicalSort(colConditions, k)

        if (rowOrder.isEmpty() || colOrder.isEmpty()) return emptyArray()

        val result = Array(k) { IntArray(k) }
        val colMap = colOrder.mapIndexed { index, num -> num to index }.toMap()

        for ((row, num) in rowOrder.withIndex()) {
            result[row][colMap[num]!!] = num
        }

        return result
    }

    private fun topologicalSort(edges: Array<IntArray>, n: Int): List<Int> {
        val graph = mutableMapOf<Int, MutableList<Int>>()
        val inDegree = IntArray(n + 1)
        val order = mutableListOf<Int>()

        for ((before, after) in edges) {
            graph[before] = graph.getOrDefault(before, mutableListOf())
            graph[before]!!.add(after)
            inDegree[after] += 1
        }

        val toVisit = ArrayDeque((1..n).filter { inDegree[it] == 0 })

        while (toVisit.isNotEmpty()) {
            val node = toVisit.removeFirst()
            order.add(node)
            for (nextNode in graph.getOrDefault(node, emptyList())) {
                inDegree[nextNode] -= 1
                if (inDegree[nextNode] == 0) {
                    toVisit.add(nextNode)
                }
            }
        }

        if (order.size != n) {
            return emptyList()
        }

        return order
    }
}