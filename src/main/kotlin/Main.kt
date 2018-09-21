import services.Fault
import services.WanAndroidLoader

fun main(args: Array<String>) {

    val loader = WanAndroidLoader()

    loader.getCollect(20000).subscribe(
            {
                for (article in it.datas) {
                    println(article)
                }
            },
            {
                val fault = it as Fault
                println(fault.errorMessage)
            }
    )

}
