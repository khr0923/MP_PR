package com.example.mp_pr

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.databinding.DataBindingUtil.setContentView

class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)

        var comment1 = view?.findViewById<ImageView>(R.id.comment1)
        comment1?.setOnClickListener {
            val intent: Intent = Intent(getActivity(), CommentFragment::class.java)
            startActivity(intent)
        }
    }
}
