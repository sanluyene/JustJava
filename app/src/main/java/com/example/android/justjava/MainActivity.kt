package com.example.android.justjava

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {
    private var quantity = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

//    This method is called when the order button is clicked
    fun submitOrder(view : View) {
        var priceMessage = ""
        if (quantity > 0) {
            val df = DecimalFormat("0.00")
            var amount = (quantity * 5)
            priceMessage = "Amount owed: $" + df.format(amount) + "\nThanks!"
        }
        else priceMessage = "Zilch!"
        displayMessage(priceMessage)
    }

//    This method displays the given quantity value on the screen
    private fun display() {
        var quantityTextView = findViewById<TextView>(R.id.quantity_text_view)
        var message = "" + quantity
        quantityTextView.text = message
    }

//    This method displays the given text on the screen
    private fun displayMessage(message : String) {
        var priceTextView = findViewById<TextView>(R.id.price_text_view)
        priceTextView.text = message
    }

//    This method increases quantity of coffees by one
    fun increment(view : View) {
        quantity++
        display()
    }

//    This method decreases quantity of coffees by one
    fun decrement(view : View) {
        quantity--
        display()
    }
}
