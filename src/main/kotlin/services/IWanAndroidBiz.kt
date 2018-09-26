package services

import io.reactivex.Observable
import model.*
import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface IWanAndroidBiz {

    @GET("article/list/{page}/json")
    fun getArticle(@Path("page") page: Int): Observable<BaseResponseSingleData<Article<Article.ArticleBody>>>

    @GET("article/list/{page}/json")
    fun getArticle(@Path("page") page: Int,
                   @Query("cid") cid: Int): Observable<BaseResponseSingleData<Article<Article.ArticleBody>>>

    @GET("banner/json")
    fun getBanner(): Observable<BaseResponseListData<Banner>>

    @GET("friend/json")
    fun getFriend(): Observable<BaseResponseListData<Friend>>

    @GET("hotkey/json")
    fun getHotkey(): Observable<BaseResponseListData<Hotkey>>

    @GET("tree/json")
    fun getTreeChildren(): Observable<BaseResponseListData<TreeChildren>>

    @GET("navi/json")
    fun getNavi(): Observable<BaseResponseListData<Navi>>

    @GET("project/tree/json")
    fun getProjectType(): Observable<BaseResponseListData<ProjectType>>

    @GET("project/list/{page}/json")
    fun getProject(@Path("page") page: Int,
                   @Query("cid") cid: Int): Observable<BaseResponseSingleData<Article<Article.ArticleBody>>>

    @POST("article/query/{page}/json")
    fun postSearch(@Path("page") page: Int,
                   @Query("k") keyWord: String): Observable<BaseResponseSingleData<Article<Article.ArticleBody>>>

    @GET("lg/collect/list/{page}/json")
    fun getCollection(@Path("page") page: Int): Observable<BaseResponseSingleData<Article<Article.ArticleBody>>>

    @POST("lg/collect/{articleId}/json")
    fun addCollect(@Path("articleId") articleId: Int): Observable<BaseResponseSingleData<String>>

    /**
     * TODOリスト内容を取得する
     *
     * @param type タイプ(0:「只用这一个」；1:「工作」；2:「学习」；3:「生活」)
     * @return 指定したのタイプのTODOリスト内容
     */
    @GET("lg/todo/list/{type}/json")
    fun getTodoList(@Path("type") type:Int):Observable<BaseResponseSingleData<TodoData>>

    /**
     * 新規TODOをコミットする
     *
     * @param title タイトル
     * @param content 内容
     * @param date 日付
     * @param type タイプ(0:「只用这一个」；1:「工作」；2:「学习」；3:「生活」)
     * @return レスポンス
     */
    @POST("lg/todo/add/json")
    fun addTodo(@Query("title") title:String,
                @Query("content") content:String,
                @Query("date") date:String,
                @Query("type") type:Int):Observable<BaseResponseSingleData<Banner>>


    /**
     * IDによって、特定のTODOを更新する
     *
     * @param id TODOのID
     * @param title 該当TODOの更新タイトル
     * @param content 該当TODOの更新内容
     * @param date 該当TODOの更新日付
     * @param status 該当TODOの更新ステータス(0:「未完成」→「完成」；1:「完成」→「未完成」)
     * @param type 該当TODOの更新タイプ(0:「只用这一个」；1:「工作」；2:「学习」；3:「生活」)
     * @return レスポンス
     */
    @POST("lg/todo/update/{id}/json")
    fun updateTodo(@Path("id") id:Int,
                   @Query("title") title:String,
                   @Query("content") content: String,
                   @Query("date") date:String,
                   @Query("status") status:Int,
                   @Query("type") type:Int):Observable<BaseResponseSingleData<Banner>>

    /**
     * IDで指定したのTODOを削除する
     *
     * @param id ID
     * @return レスポンス
     */
    @POST("lg/todo/delete/{id}/json")
    fun deleteTodo(@Path("id") id:Int):Observable<BaseResponseSingleData<Banner>>
}