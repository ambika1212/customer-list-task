package com.example.myapplicationdemo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NumbersViewModel : ViewModel() {

    private val _numbersList = MutableLiveData<List<NumbersView>>()
    val numbersList: LiveData<List<NumbersView>> get() = _numbersList

    init {
        loadNumbers()
    }

    private fun loadNumbers() {
        val list = ArrayList<NumbersView>()

        list.add(NumbersView(R.drawable.buffalo, "Amit Patil", "1234567891", R.drawable.baseline_call_24))
        list.add(NumbersView(R.drawable.cow, "Rajesh Patil", "1234567891", R.drawable.baseline_call_24))
        list.add(NumbersView(R.drawable.buffalo, "Samrudhi Jadav", "1234567891", R.drawable.baseline_call_24))
        list.add(NumbersView(R.drawable.buffalo, "Amit Patil", "1234567891", R.drawable.baseline_call_24))
        list.add(NumbersView(R.drawable.cow, "Nilam Yadav", "1234567891", R.drawable.baseline_call_24))
        list.add(NumbersView(R.drawable.cow, "Ambika Biradar", "1234567891", R.drawable.baseline_call_24))
        list.add(NumbersView(R.drawable.buffalo, "Shashi Biradar", "1234567891", R.drawable.baseline_call_24))
        list.add(NumbersView(R.drawable.cow, "Shivu Biradar", "1234567891", R.drawable.baseline_call_24))
        list.add(NumbersView(R.drawable.buffalo, "Anu Core", "1234567891", R.drawable.baseline_call_24))
        list.add(NumbersView(R.drawable.cow, "Shree Patil", "1234567891", R.drawable.baseline_call_24))
        list.add(NumbersView(R.drawable.cow, "Siri Patil", "1234567891", R.drawable.baseline_call_24))

        _numbersList.value = list
    }
}
