package com.example.comandadigital.ui.Cadastro

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CadastroViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Cadastro Fragment"
    }
    val text: LiveData<String> = _text
}