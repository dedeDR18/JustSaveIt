package com.example.justsaveit.ui.link

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.justsaveit.R

class LinkFragment : Fragment() {

    companion object {
        fun newInstance() = LinkFragment()
    }

    private lateinit var viewModel: LinkViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.link_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(LinkViewModel::class.java)
        // TODO: Use the ViewModel
    }

}