package me.greatscott42.labapis

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView

class ApiActivity : AppCompatActivity(), ApiCallback {

    private lateinit var listDataFromJson : ListView
    private lateinit var getRequestButton : Button
    private lateinit var adapter : ArrayAdapter<String>
    private lateinit var listData : MutableList<String>
    private  var URL : String = "https://reqres.in/api/users"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_api)

        listDataFromJson = findViewById(R.id.listViewDataFromJson)
        getRequestButton = findViewById(R.id.getRequest)

        listData = mutableListOf(
            getString(R.string.api_instruction)
        )

        adapter = ArrayAdapter<String>(
            this,
            android.R.layout.simple_list_item_1, // Built-in layout for simple items
            listData
        )

        listDataFromJson.adapter = adapter

        getRequestButton.setOnClickListener{
            val apiRequestTask = ApiTask(this)
            apiRequestTask.execute(URL)
        }

    }

    override fun onRequestComplete(result: String) {
        TODO("Not yet implemented")
    }
}