package com.example.mp_pr

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageButton
import androidx.databinding.DataBindingUtil.setContentView


class CommentFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView: View = inflater.inflate(R.layout.fragment_comment, container, false)

        var btnBack = rootView.findViewById<ImageButton>(R.id.btnBack)
        btnBack.setOnClickListener {

        }
        return rootView

    }
}


