package com.tandeminnovation.fitsystemwindowsshowcase.ui.appBarWithContentError

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.tandeminnovation.fitsystemwindowsshowcase.R

class AppBarWithContentErrorFragment : Fragment() {

    private lateinit var slideshowViewModel: AppBarWithContentErrorViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        slideshowViewModel = ViewModelProvider(this).get(AppBarWithContentErrorViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_app_bar_with_content_error, container, false)
        val textView: TextView = root.findViewById(R.id.text_slideshow)
        slideshowViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}