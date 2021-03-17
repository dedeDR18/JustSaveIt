package com.example.justsaveit.ui.voice

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.justsaveit.R

class VoiceFragment : Fragment() {

    companion object {
        fun newInstance() = VoiceFragment()
    }

    private lateinit var viewModel: VoiceViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.voice_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(VoiceViewModel::class.java)
        // TODO: Use the ViewModel
    }

}