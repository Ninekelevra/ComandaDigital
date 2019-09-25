package com.example.comandadigital.ui.atendimento

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.comandadigital.R

class AtendimentoFragment : Fragment(){

    private lateinit var atendimentoViewModel: AtendimentoViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        atendimentoViewModel =
            ViewModelProviders.of(this) .get(AtendimentoViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_atendimento, container, false)
        return root
    }
}