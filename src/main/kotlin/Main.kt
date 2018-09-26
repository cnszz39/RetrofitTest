import services.Fault
import services.WanAndroidLoader

fun main(args: Array<String>) {

    val loader = WanAndroidLoader()



    loader.deleteTodo(2634).subscribe(
            {
                println(it)
            },
            {
                val fault = it as Fault
                println(fault.errorCode.toString() + fault.errorMessage)
            }
    )
}
