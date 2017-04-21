package com.sergiocasero.baseproject.usecase

import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.functions.Action
import io.reactivex.functions.Consumer
import io.reactivex.schedulers.Schedulers

/**
 * Created by Sergio on 21/04/2017.
 */
abstract class UseCase {

    private var disposable: Disposable? = null

    fun execute(onNext: Consumer<*>, onError: Consumer<Throwable>, onComplete: Action) {
        disposable = getObservable()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(onNext as Consumer<in Any>, onError, onComplete)
    }

    fun unsubscribe() {
        disposable!!.dispose()
    }

    abstract fun getObservable(): Observable<*>
}