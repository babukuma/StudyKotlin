package com.babukuma.kotlinandroid

import android.app.Activity
import android.os.Bundle


/**
 * Created by babukuma on 6/23/15.
 */
public class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Layout
        setContentView(R.layout.activity_main)
    }
}