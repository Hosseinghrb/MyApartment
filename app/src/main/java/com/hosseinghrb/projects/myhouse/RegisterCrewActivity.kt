package com.hosseinghrb.projects.myhouse

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.fragment.app.Fragment
import com.hosseinghrb.projects.myhouse.databinding.ActivityRegisterCrewBinding

class RegisterCrewActivity : AppCompatActivity() {
    lateinit var binding: ActivityRegisterCrewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterCrewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val cfr = findViewById<AutoCompleteTextView>(R.id.Cfr)

        val feild = resources.getStringArray(R.array.Feild)

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, feild)
            cfr.setAdapter(adapter)

    }

}


//class RegisterCrewActivity : Fragment(){
//    private var binding: FragmentFirstBinding? = null


//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//
//    }
//
//}

//
//        val Feild = resources.getStringArray(R.array.Feild)
//        val arrayAdapter = ArrayAdapter(requirContext(),R.layout.dropdown_item,Feild)
//        binding.Cfr.setAdapter(arrayAdapter)
