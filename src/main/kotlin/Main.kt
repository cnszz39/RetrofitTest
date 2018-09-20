import services.WanAndroidLoader

fun main(args: Array<String>) {

    val loader = WanAndroidLoader()

//    loader.getArticle(1,60).subscribe {
//        for(article in it.datas) {
//            println(article)
//        }
//    }
//
//    loader.getBanner().subscribe {
//        for (banner in it) {
//            println(banner)
//        }
//    }
//
//    loader.getFriend().subscribe {
//        for(friend in it) {
//            println(friend)
//        }
//    }
//
//    loader.getHotkey().subscribe {
//        for (hotkey in it) {
//            println(hotkey)
//        }
//    }

//    loader.getTree().subscribe(){
//        for(treeChildren in it) {
//            println(treeChildren)
//        }
//    }

//    loader.getNavi().subscribe(){
//        for(navi in it) {
//            println(navi)
//        }
//    }

//    loader.getProjectType().subscribe(){
//        for(projectType in it) {
//            println(projectType)
//        }
//    }

    loader.getProject(1,294).subscribe(){
        for(project in it.datas) {
            println(project)
        }
    }

}
