package com.tandeminnovation.fitsystemwindowsshowcase.ui.appBar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.tandeminnovation.fitsystemwindowsshowcase.R

class AppBarFragment : Fragment() {

    private lateinit var homeViewModel: AppBarViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(this).get(AppBarViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_app_bar, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)
        homeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}