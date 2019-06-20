package com.dev.sharingsession.juni20.presenter

import android.app.AlertDialog
import android.content.Context
import com.dev.sharingsession.juni20.model.UserData
import com.dev.sharingsession.juni20.retrofit.ApiClient
import com.dev.sharingsession.juni20.view.MainContract
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class MainPresenter(private val context: Context): MainContract {

    private val compositeDisposable = CompositeDisposable()

    override fun hitApiOneUSer() {
        val disposable = ApiClient.getMainService()
            .getUser("2")
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                dialogShow(it)
            },{
                println("Error ${it.localizedMessage}")
            })
        compositeDisposable.add(disposable)
    }

    override fun dialogShow(user: UserData) {
        AlertDialog
            .Builder(context)
            .setTitle("User Detail")
            .setMessage("Name : ${user.data.first_name} ${user.data.last_name} \n Id : ${user.data.id}")
            .setPositiveButton("Done"){dialog, _ -> dialog.dismiss()}
            .show()
    }
}