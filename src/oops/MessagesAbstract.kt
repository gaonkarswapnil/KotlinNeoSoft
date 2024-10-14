package oops

abstract class SocialMediaMessages(val mess: String) {
    fun validate(): Boolean {
        if (mess.trim() == "") {
            throw Exception("No null message is allowed from Abstract class")
        }
        return true
    }

    abstract fun printMessage()
}

class WhatsApp(val message: String) : SocialMediaMessages(message) {
    fun isValidate(): Boolean {
        if (validate()) {
            if (message.length < 1) {
                throw Exception("Message should be greater than 1 in whatsapp")
            }
        }
        return true
    }

    override fun printMessage() {
        if (isValidate()) {
            println("${message} from WhatsApp")
        }
    }
}

class Facebook(val message: String) : SocialMediaMessages(message) {
    fun isValidate(): Boolean {
        if (validate()) {
            if (message.length <= 5) {
                throw Exception("Message should be greater than 1 in facebook")
            }
        }
        return true
    }

    override fun printMessage() {
        if (isValidate()) {
            println("${message} from Facebook")
        }
    }
}

class Instagram(val message: String) : SocialMediaMessages(message) {
    fun isValidate(): Boolean {
        if (validate()) {
            if (message.length >= 10) {
                throw Exception("Message should not be greater than 10 in Instagram")
            }
        }
        return true
    }

    override fun printMessage() {
        if (isValidate()) {
            println("${message} from Instagram")
        }
    }
}

class SharedClass {
    fun sendVia(via: SocialMediaMessages) {
        when (via) {
            is WhatsApp -> via.printMessage()
            is Facebook -> via.printMessage()
            is Instagram -> via.printMessage()
        }
    }
}

fun main() {
    val sharedClass = SharedClass()
    sharedClass.sendVia(Facebook("ef"))
}