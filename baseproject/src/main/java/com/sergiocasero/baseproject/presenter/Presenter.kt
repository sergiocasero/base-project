package com.sergiocasero.baseproject.presenter

/**
 * Created by Sergio on 19/04/2017.
 */

abstract class Presenter<V : Presenter.View> {

    var view: V? = null

    abstract fun initialize()

    abstract fun resume()

    abstract fun pause()

    abstract fun destroy()

    interface View
}
