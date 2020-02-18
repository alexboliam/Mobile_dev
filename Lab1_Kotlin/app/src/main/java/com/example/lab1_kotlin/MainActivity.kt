package com.example.lab1_kotlin

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        SetAdapter()

        buttonOkSetup()

        buttonCancelSetup()

    }

    fun SetAdapter()
    {

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, /*TODO: get all films entries in resources*/)
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)
        spinner!!.adapter = adapter
    }

    fun buttonOkSetup()
    {
        buttonOk.setOnClickListener{
            if(spinner.selectedItem.toString().equals(/* TODO: take first item from array*/)
            {
                resultTextView.text = R.string.films0_nothing_selected.toString()
            }
            else
            {
                resultTextView.text = "Your choice: ${spinner?.selectedItem.toString()}"
            }
        }
    }

    fun buttonCancelSetup()
    {
        buttonCancel.setOnClickListener {
            spinner?.setSelection(0)
            resultTextView.text = R.string.films0_nothing_selected.toString()
        }
    }

    /*fun spinnerNoButtonsSetup()
    {
        spinner.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onItemSelected( parent: AdapterView<*>?, view: View?, position: Int, id: Long ) {
                if( parent?.getItemAtPosition(position).toString().equals("Nothing selected")){
                    resultTextView.text = "Nothing is selected at the moment :("
                }
                else {
                    resultTextView.text = "Your choice: ${parent?.getItemAtPosition(position).toString()}"
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>){
                resultTextView.text = "Nothing is selected at the moment :("
            }
        }
    }*/

}
