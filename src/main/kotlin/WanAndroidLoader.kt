import io.reactivex.Observable
import model.Article
import model.Banner
import model.Friend
import services.IWanAndroidBiz

class WanAndroidLoader {

    private val mService = RetrofitServiceManager().getInstance().create(IWanAndroidBiz::class.java)

    fun getArticle(pageCount: Int): Observable<Article<Article.ArticleBody>> {
        return mService.getArticle(pageCount).map{
            it.data
        }
    }

    fun getBanner(): Observable<List<Banner>> {
        return mService.getBanner().map{
            it.data
        }
    }

    fun getFriend() : Observable<List<Friend>> {
        return mService.getFriend().map{
            it.data
        }
    }
}