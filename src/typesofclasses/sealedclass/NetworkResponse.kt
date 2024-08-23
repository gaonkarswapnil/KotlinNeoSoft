package typesofclasses.sealedclass

sealed class NetworkResponse {
    data class Success(val data: String) : NetworkResponse()
    data class Error(val errmsg: String) : NetworkResponse()
    object Loading : NetworkResponse()
}

fun handlingNetwork(response: NetworkResponse){
    when (response){
        is NetworkResponse.Success -> println("${NetworkResponse.Success(response.data)}")
        is NetworkResponse.Error -> println("${NetworkResponse.Error(response.errmsg)}")
        NetworkResponse.Loading -> println("Loading... Fetching data...")
    }
}

fun main() {
    val success = NetworkResponse.Success("Success")
    val error = NetworkResponse.Error("Error")

    handlingNetwork(success)
}