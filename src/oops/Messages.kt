package oops

interface Messages{
    fun printMessages()
}

class Mail: Messages{
    override fun printMessages() {
        println("Print from Mail")
    }
}

class Call: Messages{
    override fun printMessages() {
        println("Print from Call")
    }
}

class Text: Messages{
    override fun printMessages() {
        println("Print from Text")
    }
}

class SendMessage(){
    fun sendVia(via: Messages){
        when(via){
            is Mail -> {
//                val mail: Messages = Mail();
                via.printMessages()
            }

            is Call ->{
                via.printMessages()
            }

            is Text -> {
                via.printMessages()
            }
        }
    }
}


fun main(){
    val sendMessage = SendMessage();
    sendMessage.sendVia(Call())
    sendMessage.sendVia(Text())
    sendMessage.sendVia(Mail())

}