package com.example.android.test1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.android.test1.databinding.FragmentEntry0Binding


/**
 * A simple [Fragment] subclass.
 */
class entry0 : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentEntry0Binding>(inflater,
            R.layout.fragment_entry0,container,false)
        binding.buttonn.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_entry0_to_entry2Fragment)
        }
        binding.button12.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_entry0_to_entry3Fragment)
        }
        binding.button13.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_entry0_to_entry4Fragment)
        }
        binding.button14.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_entry0_to_entry5Fragment)
        }
        binding.button15.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_entry0_to_entry6Fragment)
        }
        binding.button16.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_entry0_to_entry7Fragment)
        }
        binding.button2.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_entry0_to_entry8Fragment)
        }
        binding.button3.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_entry0_to_entry9Fragment)
        }
        binding.button4.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_entry0_to_entry10Fragment)
        }
        binding.button5.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_entry0_to_entry11Fragment)
        }
        (activity as AppCompatActivity).supportActionBar?.title=
            getString(R.string.menu)
        return binding.root
    }

}




