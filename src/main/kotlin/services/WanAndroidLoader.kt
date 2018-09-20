package services

import io.reactivex.Observable
import model.*

class WanAndroidLoader {

    private val mService = RetrofitServiceManager().getInstance().create(IWanAndroidBiz::class.java)

    fun getArticle(pageCount: Int): Observable<Article<Article.ArticleBody>> {
        return mService.getArticle(pageCount).map {
            it.data
        }
    }

    fun getArticle(pageCount: Int, cid: Int): Observable<Article<Article.ArticleBody>> {
        return mService.getArticle(pageCount, cid).map {
            it.data
        }
    }

    fun getBanner(): Observable<List<Banner>> {
        return mService.getBanner().map {
            it.data
        }
    }

    fun getFriend(): Observable<List<Friend>> {
        return mService.getFriend().map {
            it.data
        }
    }

    fun getHotkey(): Observable<List<Hotkey>> {
        return mService.getHotkey().map {
            it.data
        }
    }

    fun getTree(): Observable<List<TreeChildren>> {
        return mService.getTreeChildren().map {
            it.data
        }
    }

    fun getNavi(): Observable<List<Navi>> {
        return mService.getNavi().map {
            it.data
        }
    }

    fun getProjectType(): Observable<List<ProjectType>> {
        return mService.getProjectType().map {
            it.data
        }
    }

    fun getProject(pageCount: Int, cid: Int):Observable<Article<Article.ArticleBody>> {
        return mService.getProject(pageCount, cid).map {
            it.data
        }
    }

}