package ipv4

fun main() =
    println(isValidIPv4("192.168.1.1"))

fun isValidIPv4(ip: String): Boolean {
    val ipv4Pattern = """^(25[0-5]|2[0-4][0-9]|1?[0-9]?[0-9])\.(25[0-5]|2[0-4][0-9]|1?[0-9]?[0-9])\.(25[0-5]|2[0-4][0-9]|1?[0-9]?[0-9])\.(25[0-5]|2[0-4][0-9]|1?[0-9]?[0-9])$""".toRegex()
    return ip.matches(ipv4Pattern)
}
