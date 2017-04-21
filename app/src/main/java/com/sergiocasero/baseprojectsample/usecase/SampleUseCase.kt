package com.sergiocasero.baseprojectsample.usecase

import com.sergiocasero.baseproject.usecase.UseCase
import io.reactivex.Observable
import io.reactivex.functions.Action
import io.reactivex.functions.Consumer

/**
 * Created by Sergio on 21/04/2017.
 */
class SampleUseCase : UseCase() {

    private var name: String? = null

    fun execute(name: String, onNext: Consumer<String>, onError: Consumer<Throwable>, onComplete: Action) {
        this.name = name

        super.execute(onNext, onError, onComplete)
    }

    override fun getObservable(): Observable<*> {
        return Observable.just("Hello " + this.name + " from Rx2 with Kotlin!! ;)")
    }
}