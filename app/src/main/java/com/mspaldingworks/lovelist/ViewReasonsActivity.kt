package com.mspaldingworks.lovelist.com.mspaldingworks.lovelist

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button

import com.example.myapplication.room.ReasonApplication

import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mspaldingworks.lovelist.ReasonRoomDatabase

class ViewReasonsActivity : AppCompatActivity() {

    private var database: ReasonRoomDatabase? = null
    private var adapter: ReasonlistAdapter? = null
    private var linearLayoutManager: LinearLayoutManager? = null
    private var recyclerView: RecyclerView? = null
    private var goBackButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_names)

        recyclerView = findViewById<View>(R.id.recyclerview_content)
        goBackButton = findViewById(R.id.go_back_button)

        setListeners()
        database = (applicationContext as ReasonApplication).getDatabase()

        setupRecyclerView()

    }

    private fun setListeners() {

        goBackButton!!.setOnClickListener { finish() }
    }

    private fun setupRecyclerView() {

        linearLayoutManager = LinearLayoutManager(this)
        adapter = ReasonsListAdapter(database!!.ReasonDao().getAllNames())
        recyclerView!!.setLayoutManager(linearLayoutManager)
        recyclerView!!.setAdapter(adapter)
        adapter!!.notifyDataSetChanged()
    }


}