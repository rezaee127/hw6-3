package com.example.hw6_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var textView=findViewById<TextView>(R.id.textView3)
        textView.text="Aladdin is a 2019 American musical fantasy drama film produced by Walt Disney Pictures. Directed by Guy Ritchie, from a script he co-wrote with John August, it is a live-action/CGI adaptation of Disney's 1992 animated film of the same name, which itself is based on the eponymous tale from One Thousand and One Nights.[1][a] The film stars Will Smith, Mena Massoud, Naomi Scott, Marwan Kenzari, Navid Negahban, Nasim Pedrad, Billy Magnussen, and Numan Acar, as well as"
    }
}