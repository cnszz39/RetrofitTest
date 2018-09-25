package services

import io.reactivex.Observable
import model.*

class WanAndroidLoader {

    private val mService = RetrofitServiceManager().getInstance().create(IWanAndroidBiz::class.java)

    fun getArticle(pageCount: Int): Observable<Article<Article.ArticleBody>> {
        return mService.getArticle(pageCount).map(PayLoadSingle())
    }

    fun getArticle(pageCount: Int, cid: Int): Observable<Article<Article.ArticleBody>> {
        return mService.getArticle(pageCount, cid).map(PayLoadSingle())
    }

    fun getBanner(): Observable<List<Banner>> {
        return mService.getBanner().map(PayLoadList())
    }

    fun getFriend(): Observable<List<Friend>> {
        return mService.getFriend().map(PayLoadList())
    }

    fun getHotkey(): Observable<List<Hotkey>> {
        return mService.getHotkey().map(PayLoadList())
    }

    fun getTree(): Observable<List<TreeChildren>> {
        return mService.getTreeChildren().map(PayLoadList())
    }

    fun getNavi(): Observable<List<Navi>> {
        return mService.getNavi().map(PayLoadList())
    }

    fun getProjectType(): Observable<List<ProjectType>> {
        return mService.getProjectType().map(PayLoadList())
    }

    fun getProject(pageCount: Int, cid: Int):Observable<Article<Article.ArticleBody>> {
        return mService.getProject(pageCount, cid).map(PayLoadSingle())
    }

    fun postSearch(pageCount: Int, keyWord:String):Observable<Article<Article.ArticleBody>> {
        return mService.postSearch(pageCount, keyWord).map(PayLoadSingle())
    }

    fun getCollect(pageCount: Int):Observable<Article<Article.ArticleBody>> {
        return mService.getCollection(pageCount).map(PayLoadSingle())
    }

}