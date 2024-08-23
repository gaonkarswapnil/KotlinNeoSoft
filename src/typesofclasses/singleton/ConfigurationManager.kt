package typesofclasses.singleton

object ConfigurationManager {
    var apiUrl: String = "http://example.com";

    fun printUrl(): String{
        return apiUrl
    }

    fun updateUrl(url: String) {
        this.apiUrl = url;
    }
}

fun main() {
    println("API URL is ${ConfigurationManager.printUrl()}")
    ConfigurationManager.updateUrl("http://new-url.com")
    println("API URL is ${ConfigurationManager.printUrl()}")
}