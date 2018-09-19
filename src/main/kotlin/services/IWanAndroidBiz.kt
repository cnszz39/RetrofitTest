package services

import io.reactivex.Observable
import model.Article
import model.Banner
import model.BaseResponseListData
import model.BaseResponseSingleData
import retrofit2.http.GET
import retrofit2.http.Path

interface IWanAndroidBiz {

    @GET("article/list/{page}/json")
    fun getArticle(@Path("page") page:Int):Observable<BaseResponseSingleData<Article<Article.ArticleBody>>>

    @GET("banner/json")
    fun getBanner():Observable<BaseResponseListData<Banner>>
}