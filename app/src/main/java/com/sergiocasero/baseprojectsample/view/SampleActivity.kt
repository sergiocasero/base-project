package com.sergiocasero.baseprojectsample.view

import com.sergiocasero.baseproject.presenter.Presenter
import com.sergiocasero.baseproject.view.RootActivity
import com.sergiocasero.baseprojectsample.R
import com.sergiocasero.baseprojectsample.presenter.SamplePresenter

/**
 * Created by Sergio on 19/04/2017.
 */
class SampleActivity : RootActivity(), SamplePresenter.View {

    var samplePresenter: SamplePresenter? = null

    override val presenter: Presenter<Presenter.View>
        get() = samplePresenter as Presenter<Presenter.View>

    override val layoutId: Int
        get() = R.layout.activity_sample

    override fun initializeInjection() {
        samplePresenter = SamplePresenter()
        samplePresenter!!.setView(this)
    }

    override fun initializeUI() {

    }

    override fun registerListeners() {

    }
}