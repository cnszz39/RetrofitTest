fun main(args: Array<String>) {

    val loader = WanAndroidLoader()
    loader.getArticle(1).subscribe {
        for (article in it) {
            println(article)
        }
    }
//    loader.getBanner().subscribe {
//        for (banner in it) {
//            println(banner)
//        }
//    }
}
