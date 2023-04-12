fun describeString(maybeString: String?): String {              // 1
    if (maybeString != null && maybeString.length > 0) {        // 2
        return "String of length ${maybeString.length}"
    } else {
        return "Empty or null string"                           // 3
    }
}


fun main() {
    println(describeString(null))
    println(describeString(""))
    println(describeString("dio.me"))
}