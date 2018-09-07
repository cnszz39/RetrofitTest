package model

data class BaseResponse<T>(val errorCode: Int,
                           val errorMsg: String,
                           val data: model.BaseResponseData<T>)

data class BaseResponseData<T>(val curPage: Int,
                               val offset: Int,
                               val over: Boolean,
                               val pageCount: Int,
                               val size: Int,
                               val total: Int,
                               val datas: List<T>)

data class Article(val apkLink: String,
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