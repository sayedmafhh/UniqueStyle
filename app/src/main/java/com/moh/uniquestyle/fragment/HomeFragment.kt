package com.moh.uniquestyle.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.moh.uniquestyle.R
import com.moh.uniquestyle.adapter.HomeHighlightAdapter

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView: View = inflater.inflate(R.layout.fragment_home, container, false)
        val rvHomeHighlight: RecyclerView = activity!!.findViewById(R.id.rv_home_highlight)
        rvHomeHighlight.apply {
            layoutManager = LinearLayoutManager(context)
            //adapter = HomeHighlightAdapter
        }
        return rootView
    }

    companion object {
        fun newInstance(): HomeFragment = HomeFragment()
    }
}