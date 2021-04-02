package com.tandeminnovation.fitsystemwindowsshowcase.ui.appBarWithError

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.tandeminnovation.fitsystemwindowsshowcase.R

class AppBarWithErrorFragment : Fragment() {

    private lateinit var galleryViewModel: AppBarWithErrorViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        galleryViewModel =
            ViewModelProvider(this).get(AppBarWithErrorViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_app_bar_with_error, container, false)
        val textView: TextView = root.findViewById(R.id.text_gallery)
        galleryViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}