package com.tandeminnovation.fitsystemwindowsshowcase.ui.colapsingtoolbar

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tandeminnovation.fitsystemwindowsshowcase.R

class CollapsingToolbarFragment : Fragment() {

    companion object {
        fun newInstance() = CollapsingToolbarFragment()
    }

    private lateinit var viewModel: CollapsingToolbarViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        viewModel = ViewModelProvider(this).get(CollapsingToolbarViewModel::class.java)
        return inflater.inflate(R.layout.fragment_collapsing_toolbar, container, false)
    }


}