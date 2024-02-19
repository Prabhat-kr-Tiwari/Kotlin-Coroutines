import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread
import kotlin.system.measureTimeMillis

fun main(){

//    create100KThreads()
//    create100KCoroutine()
    createOneMillionCoroutine()
}
 fun create100KCoroutine()= runBlocking{
    val duration= measureTimeMillis {
        repeat(100_000){
            launch {
                delay(1000)
                print(".")
            }
        }

    }
    println("Time = ${duration/1000}  seconds")
}
fun create100KThreads(){
    val duration= measureTimeMillis {
        repeat(100_000){
            thread {
                Thread.sleep(1000)
                print(".")
            }
        }

    }
    println("Time = ${duration/1000}  seconds")
}
fun createOneMillionCoroutine(){
    repeat(1_000_000){
        thread {
            Thread.sleep(3000)
            print(".")
        }
    }

}