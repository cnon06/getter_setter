package com.cnon.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class deneme {

    var id: Int
        get() = field
        set(value) {
            if (value < 0) field = 1
            else field = value
        }

    constructor(id: Int) {
        this.id = id


    }
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var dnm1 = deneme(5);

        println("getter ${dnm1.id}")

        dnm1.id=45
        println("getter ${dnm1.id}")



    }
}