package model


data class BaseResponseSingleData<out T>(val errorCode: Int,
                                         val errorMsg: String,
                                         val data: T)

data class BaseResponseListData<out T>(val errorCode: Int,
                                       val errorMsg: String,
                                       val data: List<T>)

data class Banner(val desc: String,
                  val id: Int,
                  val imagePath: String,
                  val isVisible: Int,
                  val order: Int,
                  val title: String,
                  val type: Int,
                  val url: String)

data class Article<out T>(val curPage: Int,
                          val offset: Int,
                          val over: Boolean,
                          val pageCount: Int,
                          val size: Int,
                          val total: Int,
                          val datas: List<T>) {
    data class ArticleBody(val apkLink: String,
                           val author: String,
                           val chapterId: Int,
                           val chapterName: String,
                           val collect: Boolean,
                           val courseId: Int,
                           val desc: String,
                           val envelopePic: String,
                           val fresh: Boolean,
                           val id: Int,
                           val link: String,
                           val niceDate: String,
                           val origin: String,
                           val projectLink: String,
                           val superChapterId: Int,
                           val superChapterName: String,
                           val tags: List<Tag>,
                           val title: String,
                           val type: Int,
                           val userId: Int,
                           val visible: Int,
                           val zan: Int) {
        data class Tag(val name: String,
                       val url: String)
    }
}

data class Friend(val icon: String,
                  val id: Int,
                  val link: String,
                  val name: String,
                  val order: Int,
                  val visible: Int)

data class Hotkey(val id: Int,
                  val link: String,
                  val name: String,
                  val order: Int,
                  val visible: Int)

data class TreeChildren(val courseId: Int,
                        val id: Int,
                        val name: String,
                        val order: Int,
                        val parentChapterId: Int,
                        val visible: Int,
                        val children: List<TreeChildren>)

data class Navi(val articles: List<Article.ArticleBody>,
                val cid: Int,
                val name: String)

data class ProjectType(val courseId: Int,
                       val id: Int,
                       val name: String,
                       val order: Int,
                       val parentChapterId: Int,
                       val visible: Int)

data class TodoData(val doneList: List<Todo>,
                    val todoList: List<Todo>,
                    val type: Int) {

    data class Todo(val date: Long,
                    val todoList: List<TodoChild>) {

        data class TodoChild(val completeDate: Long,
                             val completeDateStr: String,
                             val content: String,
                             val date: Long,
                             val dateStr: String,
                             val id: Int,
                             val status: Int,
                             val title: String,
                             val type: Int,
                             val userId: Int)
    }
}