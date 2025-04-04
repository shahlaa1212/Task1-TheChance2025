package sudoku

import kotlin.math.sqrt

fun main(){
    println("test")
}

fun isValidateSudokuPuzzle(board: List<List<Char>>): Boolean {
    // Check rows
    for (row in board) {
        if (!isValidUnit(row)) return false
    }

    // Check columns
    for (colIndex in board.indices) {
        val column = board.map { it[colIndex] }
        if (!isValidUnit(column)) return false
    }

    // Check subgrids (3x3 or 2x2)
    val subgridSize = sqrt(board.size.toDouble()).toInt()
    for (rowIndex in board.indices step subgridSize) {
        for (colIndex in board[0].indices step subgridSize) {
            val subgrid = mutableListOf<Char>()
            for (i in rowIndex..<rowIndex + subgridSize) {
                for (j in colIndex..<colIndex + subgridSize) {
                    subgrid.add(board[i][j])
                }
            }
            if (!isValidUnit(subgrid)) return false
        }
    }

    return true
}

// Function to check if there are duplicates in a unit (row, column, or subgrid)
fun isValidUnit(unit: List<Char>): Boolean {
    val seen = mutableSetOf<Char>()
    for (char in unit) {
        if (char != '-' && char in seen) return false
        seen.add(char)
    }
    return true
}

// Helper function to run the checks
