package com.example.comandadigital.ui.Cadastro

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.comandadigital.R

class CadastroFragment : Fragment() {

    private lateinit var cadastroViewModel: CadastroViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        cadastroViewModel =
            ViewModelProviders.of(this).get(CadastroViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_cadastro, container, false)
        val textView: TextView = root.findViewById(R.id.text_gallery)
        cadastroViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}