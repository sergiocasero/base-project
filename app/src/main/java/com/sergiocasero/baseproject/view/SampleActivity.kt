package com.sergiocasero.baseproject.view

import com.sergiocasero.baseproject.R
import com.sergiocasero.baseproject.presenter.Presenter
import com.sergiocasero.baseproject.presenter.SamplePresenter

/**
 * Created by Sergio on 19/04/2017.
 */
class SampleActivity : RootActivity(), SamplePresenter.View {

    val samplePresenter = SamplePresenter()

    override val presenter: Presenter<Presenter.View>
        get() = samplePresenter as Presenter<Presenter.View>

    override val layoutId: Int
        get() = R.layout.activity_sample

    override fun initializeInjection() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun initializeUI() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun registerListeners() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}