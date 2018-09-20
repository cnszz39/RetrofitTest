package services

import io.reactivex.Observable
import model.*
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface IWanAndroidBiz {

    @GET("article/list/{page}/json")
    fun getArticle(@Path("page") page: Int): Observable<BaseResponseSingleData<Article<Article.ArticleBody>>>

    @GET("article/list/{page}/json")
    fun getArticle(@Path("page") page: Int, @Query("cid") cid: Int): Observable<BaseResponseSingleData<Article<Article.ArticleBody>>>

    @GET("banner/json")
    fun getBanner(): Observable<BaseResponseListData<Banner>>

    @GET("friend/json")
    fun getFriend(): Observable<BaseResponseListData<Friend>>

    @GET("hotkey/json")
    fun getHotkey(): Observable<BaseResponseListData<Hotkey>>

    @GET("tree/json")
    fun getTreeChildren(): Observable<BaseResponseListData<TreeChildren>>

    @GET("navi/json")
    fun getNavi():Observable<BaseResponseListData<Navi>>
}