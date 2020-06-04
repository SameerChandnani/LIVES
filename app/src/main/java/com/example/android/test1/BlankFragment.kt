package com.example.android.test1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.android.test1.databinding.FragmentBlankBinding

/**
 * A simple [Fragment] subclass.
 */
class BlankFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentBlankBinding>(inflater,
            R.layout.fragment_blank,container,false)
        binding.button.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_blankFragment_to_entry0)
        }
        (activity as AppCompatActivity).supportActionBar?.title=
            getString(R.string.app_name)
        return binding.root
    }

}
