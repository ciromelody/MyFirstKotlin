package org.altervista.ciromelody.myfirstkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
var string:Array<String> = arrayOf("ciao","ciao2")
val valoreimmutabile:String="valorechenonmuta"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        main(string)
    }
    fun main(args:Array<String> ){
       println(args[1])

    }
}
