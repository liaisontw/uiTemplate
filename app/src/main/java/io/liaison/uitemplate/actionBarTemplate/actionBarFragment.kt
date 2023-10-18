package io.liaison.uitemplate.actionBarTemplate

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.appbar.MaterialToolbar
import io.liaison.uitemplate.R

class actionBarFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_action_bar, container, false)
        val toolbar = view.findViewById<MaterialToolbar>(R.id.toolar)
        (activity as AppCompatActivity).setSupportActionBar(toolbar)
        return view
    }
}