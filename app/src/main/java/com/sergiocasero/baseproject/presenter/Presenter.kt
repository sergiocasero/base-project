package com.sergiocasero.baseproject.presenter

/**
 * Created by Sergio on 19/04/2017.
 */

public abstract class Presenter<V : Presenter.View> {

    private var view: V? = null

    public abstract fun initialize()

    public abstract fun resume()

    public abstract fun pause()

    public abstract fun destroy()

    public fun getView(): V? {
        return view
    }

    public fun setView(view: V) {
        this.view = view
    }

    public interface View
}
