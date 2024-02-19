import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.joinAll
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) = runBlocking{
/*
    routineOne()
    routineTwo()*/
    println("Main started")
    joinAll(
        async {   CoroutineOne() },
        async {      CoroutineTwo() }
    )

    println("Main Ends")
}

fun routineOne() {
    println("Routine One Started")
    Thread.sleep(3000)
    println("Routine One End")
}

fun routineTwo() {
    println("Routine Two Started")
    Thread.sleep(2000)
    println("Routine Two End")
}
suspend fun CoroutineOne() {
    println("CoRoutine One Started")
    delay(3000)
    println("CoRoutine One End")
}

suspend fun CoroutineTwo() {
    println("CoRoutine Two Started")
    delay(2000)
    println("CoRoutine Two End")
}