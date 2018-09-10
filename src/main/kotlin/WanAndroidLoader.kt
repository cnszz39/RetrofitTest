import io.reactivex.Observable
import model.Article
import model.Banner
import services.IWanAndroidBiz

class WanAndroidLoader {

    private val mService = RetrofitServiceManager().getInstance().create(IWanAndroidBiz::class.java)

    fun getArticle(pageCount: Int): Observable<List<Article<Article.ArticleBody>>> {
        return mService.getArticle(pageCount).map{
            it.data
        }
    }

    fun getBanner(): Observable<List<Banner>> {
        return mService.getBanner().map{
            it.data
        }
    }
}