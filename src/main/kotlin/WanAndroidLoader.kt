import io.reactivex.Observable
import model.Article
import services.IWanAndroidBiz

class WanAndroidLoader {

    private val mService = RetrofitServiceManager().getInstance().create(IWanAndroidBiz::class.java)

    fun getArticle(pageCount: Int): Observable<List<Article.ArticleBody>> {
        return mService.getArticle(pageCount).map{
            it.data.datas
        }
    }

}