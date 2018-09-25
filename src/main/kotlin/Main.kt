import services.Fault
import services.WanAndroidLoader

fun main(args: Array<String>) {

    val loader = WanAndroidLoader()

//    loader.getArticle(1).subscribe(
//            {
//                for (article in it.datas) {
//                    println(article)
//                }
//            },
//            {
//                val fault = it as Fault
//                println(fault.errorCode.toString() + fault.errorMessage)
//            }
//    )

//    loader.getCollect(0).subscribe(
//            {
//                for (article in it.datas) {
//                    println(article)
//                }
//            },
//            {
//                val fault = it as Fault
//                println(fault.errorCode.toString() + fault.errorMessage)
//            }
//    )

    loader.getTodoList(0).subscribe(
            {
                println(it.doneList)
                println(it.todoList)
            },
            {
                val fault = it as Fault
                println(fault.errorCode.toString() + fault.errorMessage)
            }
    )
}
