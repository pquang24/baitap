fun countVietnameseWords(input: String): Int {
    val vietnameseLetters = setOf("ă", "â", "đ", "ê", "ô", "ơ", "ư")
    var count = 0
    var i = 0
    while (i < input.length - 1) {
        val current = input.substring(i, i + 2)
        if (vietnameseLetters.contains(current)) {
            count++
            i += 2
        } else {
            i++
        }
    }
    return count
}
