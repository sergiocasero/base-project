package com.sergiocasero.baseprojectsample.presenter

import android.util.Log
import com.sergiocasero.baseproject.presenter.Presenter

/**
 * Created by Sergio on 19/04/2017.
 */
class SamplePresenter : Presenter<SamplePresenter.View>() {
    private val TAG = "SamplePresenter"

    override fun initialize() {
        Log.i(TAG, "initialize")
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