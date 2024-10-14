package generics

class Stack<T>{
    private var element = mutableListOf<T>()

    fun push(data:T){
        element.add(data);
    }

    fun peek(): T?{
        if(element.isEmpty()){
            return null;
        }else{
            return element.last();
        }
    }

    fun pop(): T?{
        if(element.isEmpty()){
            return null;
        }else{
            return element.removeLast()
        }
    }
}
fun main(){
    val stackInt = Stack<Int>();
    stackInt.push(23);
    println(stackInt.peek())
    println(stackInt.pop())
    println(stackInt.peek())
}