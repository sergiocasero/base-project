package com.sergiocasero.baseprojectsample.presenter

import android.util.Log
import com.sergiocasero.baseproject.presenter.Presenter
import com.sergiocasero.baseprojectsample.usecase.SampleUseCase
import io.reactivex.functions.Action
import io.reactivex.functions.Consumer

/**
 * Created by Sergio on 19/04/2017.
 */
class SamplePresenter : Presenter<SamplePresenter.View>() {
    private val TAG = "SamplePresenter"

    override fun initialize() {
        val sampleUseCase = SampleUseCase()
        sampleUseCase.execute("Sergio",
                onNext = Consumer { Log.i(TAG, it) },
                onError = Consumer { Log.i(TAG, "Error received! ;)") },
                onComplete = Action { Log.i(TAG, "Complete received! ;)") })

    }

    override fun resume() {
        Log.i(TAG, "resume")
    }

    override fun pause() {
        Log.i(TAG, "pause")
    }

    override fun destroy() {
        Log.i(TAG, "destroy")
    }

    public interface View : Presenter.View
}