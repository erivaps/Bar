package com.kotlin.bar.bar

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        miWebView.setBackgroundColor(Color.TRANSPARENT)
        miWebView.settings.javaScriptEnabled = true
        miWebView.settings.loadsImagesAutomatically = true
        miWebView.scrollBarStyle = View.SCROLLBARS_INSIDE_OVERLAY

        miWebView.loadUrl("https://elcomercio.pe/")

    }

    fun mostrar(view: View) {
        var snack: Snackbar = Snackbar.make(findViewById(R.id.constraintLayout),
                "No internet",
                Snackbar.LENGTH_LONG)
                .setAction("Retry") {}
        snack.setActionTextColor(Color.RED)
        snack.show()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            R.id.item1 -> {
                Toast.makeText(this, "Le ganamos 3-0", Toast.LENGTH_LONG)
                        .show()
                return super.onOptionsItemSelected(item)
            }
            R.id.item2 -> {
                Toast.makeText(this, "Empatamos 0-0", Toast.LENGTH_LONG)
                        .show()
                return super.onOptionsItemSelected(item)
            }
            R.id.item3 -> {
                Toast.makeText(this, "Le ganaremos 3-0", Toast.LENGTH_LONG)
                        .show()
                return super.onOptionsItemSelected(item)
            }
            R.id.item4 -> {
                Toast.makeText(this, "Le ganaremos 3-0", Toast.LENGTH_LONG)
                        .show()
                return super.onOptionsItemSelected(item)
            }

            else -> return super.onOptionsItemSelected(item)

        }

    }
}