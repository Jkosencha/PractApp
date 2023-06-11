package com.example.app2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class ListViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)


        var names= arrayOf("Jennifer", "Sean", "Christopher", "June")
        var myadaptor=ArrayAdapter(this, R.layout.list_item, names)

        var mylist:ListView=findViewById(R.id.list)
        mylist.setAdapter(myadaptor)
    }
}