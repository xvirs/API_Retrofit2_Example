package com.example.retrpfit2a

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.retrpfit2a.Network.MainActivityViewModel

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        viewModel.getPost()
        viewModel.myResponse.observe(this, Observer {
            Log.d(TAG, it.body)
            Log.d(TAG, it.title)
            Log.d(TAG, it.id.toString())
            Log.d(TAG, it.userId.toString())
        })

        viewModel.getPosts()
        viewModel.myResponseList.observe(this, Observer {
            for(user in it){
                Log.d(TAG, user.body)
                Log.d(TAG, user.title)
                Log.d(TAG, user.id.toString())
                Log.d(TAG, user.userId.toString())
            }
        })

    }


}