package services

import io.reactivex.Observable
import model.Article
import model.BaseResponse
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface IWanAndroidBiz {

    @GET("article/list/{page}/json")
    fun getArticle(@Path("page") page:Int):Observable<BaseResponse<Article>>
}