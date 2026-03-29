package za.ac.iie.socialsparkapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val input = findViewById<EditText>(R.id.etTime)
        val button = findViewById<Button>(R.id.btnSuggest)
        val reset = findViewById<Button>(R.id.btnReset)
        val result = findViewById<TextView>(R.id.txtResult)

        button.setOnClickListener {

            val time = input.text.toString().lowercase()

            if (time.isEmpty()) {
                result.text = "Please enter a time of day"

            } else if (time == "morning") {
                result.text = "Send a Good Morning text to a family member"

            } else if (time == "afternoon") {
                result.text = "Share a funny meme with a friend"

            } else if (time == "dinner") {
                result.text = "Call a friend for a 5 minute catch-up"

            } else {
                result.text = "Invalid input. Try: morning, afternoon, dinner"
            }
        }

        reset.setOnClickListener {
            input.text.clear()
            result.text = "Suggestion will appear here"
        }
    }
}