package ipv4

fun main() = runTestIpv4()

fun runTestIpv4() {
    testIpv4(
        description = "Valid IP: 192.168.1.1",
        result = isValidIPv4("192.168.1.1"),
        expected = true
    )
    testIpv4(
        description = "Valid IP: 0.0.0.0",
        result = isValidIPv4("0.0.0.0"),
        expected = true
    )
    testIpv4(
        description = "Valid IP: 255.255.255.255",
        result = isValidIPv4("255.255.255.255"),
        expected = true
    )
    testIpv4(
        description = "Invalid IP: Missing segment",
        result = isValidIPv4("192.168.1"),
        expected = false
    )
    testIpv4(
        description = "Invalid IP: Extra segment",
        result = isValidIPv4("192.168.1.1.1"),
        expected = false
    )
    testIpv4(
        description = "Invalid IP: Letter in segment",
        result = isValidIPv4("192.168.a.1"),
        expected = false
    )
    testIpv4(
        description = "Invalid IP: Space in segment",
        result = isValidIPv4("192. 168.1.1"),
        expected = false
    )
    testIpv4(
        description = "Invalid IP: Special character",
        result = isValidIPv4("192.168.#.1"),
        expected = false
    )
    testIpv4(
        description = "Invalid IP: Leading zero",
        result = isValidIPv4("192.168.01.1"),
        expected = false
    )
    testIpv4(
        description = "Invalid IP: Segment > 255",
        result = isValidIPv4("192.168.256.1"),
        expected = false
    )
    testIpv4(
        description = "Invalid IP: Negative number",
        result = isValidIPv4("192.168.-1.1"),
        expected = false
    )
    testIpv4(
        description = "Invalid IP: Empty string",
        result = isValidIPv4(""),
        expected = false
    )
}

// Simple testIpv4 function
fun testIpv4(description: String, result: Boolean, expected: Boolean) {
    if (result == expected)
        println("✅ Passed: $description")
    else
        println("❌ Failed: $description")
}