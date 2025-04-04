package sudoku

fun main() {
    check(
        description = "when sudoku has no duplicates in row, column, or subgrid should return true",
        result = isValidateSudokuPuzzle(
            listOf(
                listOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
                listOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
                listOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
                listOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
                listOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
                listOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
                listOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
                listOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
                listOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
            )
        ), correctResult = true
    )
    check(
        description = "Invalid sudoku puzzle with duplicate '3' in first row",
        result = isValidateSudokuPuzzle(
            listOf(
                listOf('5', '3', '3', '-', '7', '-', '-', '-', '-'),
                listOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
                listOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
                listOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
                listOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
                listOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
                listOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
                listOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
                listOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
            )
        ), correctResult = false
    )

    check(
        description = "Invalid sudoku puzzle with duplicate '5' in first column",
        result = isValidateSudokuPuzzle(
            listOf(
                listOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
                listOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
                listOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
                listOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
                listOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
                listOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
                listOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
                listOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
                listOf('5', '-', '-', '-', '8', '-', '-', '7', '9')
            )
        ), correctResult = false
    )

    check(
        description = "Invalid sudoku puzzle with duplicate '3' in 3x3 subgrid",
        result = isValidateSudokuPuzzle(
            listOf(
                listOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
                listOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
                listOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
                listOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
                listOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
                listOf('7', '-', '-', '-', '5', '2', '-', '-', '6'),
                listOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
                listOf('-', '-', '-', '4', '1', '9', '-', '5', '-'),
                listOf('-', '-', '-', '-', '8', '-', '-', '7', '5')
            )
        ), correctResult = false
    )

    check(
        description = "Valid 4x4 sudoku puzzle with no duplicates in 2x2 subgrid",
        result = isValidateSudokuPuzzle(
            listOf(
                listOf('1', '2', '-', '3'),
                listOf('3', '4', '1', '2'),
                listOf('2', '1', '4', '-'),
                listOf('4', '3', '2', '1')
            )
        ), correctResult = true
    )

    check(
        description = "Invalid 4x4 sudoku puzzle with duplicate '2' in first row",
        result = isValidateSudokuPuzzle(
            listOf(
                listOf('1', '2', '2', '3'),
                listOf('3', '4', '1', '2'),
                listOf('2', '1', '4', '-'),
                listOf('4', '3', '2', '1')
            )
        ), correctResult = false
    )

    check(
        description = "Invalid sudoku puzzle with '-' character in rows, columns, and subgrids",
        result = isValidateSudokuPuzzle(
            listOf(
                listOf('5', '-', '-', '-', '7', '-', '-', '-', '-'),
                listOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
                listOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
                listOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
                listOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
                listOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
                listOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
                listOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
                listOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
            )
        ), correctResult = false
    )
    // Add more check cases as before...
}

private fun check(description: String, result: Boolean, correctResult: Boolean) {
    if (result == correctResult) {
        println("✅ Passed: $description")
    } else {
        println("❌ Failed: $description")
    }
}
