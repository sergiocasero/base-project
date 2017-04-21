package com.sergiocasero.baseproject.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.sergiocasero.baseproject.presenter.Presenter

/**
 * Created by Sergio on 19/04/2017.
 */

abstract class RootActivity : AppCompatActivity(), Presenter.View {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(layoutId)

        initializeInjection()
        initializePresenter()
        initializeUI()
        registerListeners()
    }

    override fun onResume() {
        super.onResume()
        presenter.resume()
    }

    override fun onPause() {
        super.onPause()
        presenter.pause()
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.destroy()
    }

    internal abstract val presenter: Presenter<Presenter.View>

    internal abstract val layoutId: Int

    internal abstract fun initializeInjection()

    private fun initializePresenter() {
        presenter.setView(this)
        presenter.initialize()
    }

    internal abstract fun initializeUI()

    internal abstract fun registerListeners()
}
