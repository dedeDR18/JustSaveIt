package com.example.justsaveit.ui.createlink

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.justsaveit.R

class CreateLinkFragment : Fragment() {

    companion object {
        fun newInstance() = CreateLinkFragment()
    }

    private lateinit var viewModel: CreateLinkViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.create_link_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(CreateLinkViewModel::class.java)
        // TODO: Use the ViewModel
    }

}