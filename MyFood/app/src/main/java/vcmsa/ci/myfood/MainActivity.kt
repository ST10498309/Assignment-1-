package vcmsa.ci.myfood

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val txtAns = findViewById<TextView>(R.id.txtAns)
        val time = findViewById<EditText>(R.id.edtTime)
        val results = findViewById<TextView>(R.id.txtResults)
        val clear = findViewById<Button>(R.id.btnNum1)
        val btnSuggestions = findViewById<Button>(R.id.btnSuggestion)

        btnSuggestions.setOnClickListener {

            var suggestion = "Empty"
            val food = time.text.toString()

            if(food == "Breakfast") {
                txtAns.text ="1)Breakfast Oats,2)Eggs,3)Avocado Smoothie,4)Banana Bread,5)Blueberry Pancakes"
            }
            else if (food == "Mid-morning Snack") {
                txtAns.text ="1)Chia Pudding,2)Energy Bar,3)Dark Chocolate,4) Fruit Salad,5)Apple Nachos"

            }
            else if (food == "Lunch") {
                txtAns.text = "1)Chicken wrap,2)Salmon and sweet potato salad,3)Chicken chickpea stirfry,4)fish and salad"
            }
            else if (food == "Afternoon Snack") {
                txtAns.text= "1)Smoothie,2)Popcorn,3)Kale Chips,4)Chia Pudding,5)Avacado toast"
            }
            else if (food == "Dinner") {
                txtAns.text = "1)Stew,2)Italian Chicken,3)Pasta and steak,4)Fish and Salad,5)Rice and Grilled Steak  "
            }

            else if (food=="After Dinner Snack") {
                txtAns.text= "1)Popcorn,2)Yogurt,3)Chia seed pudding,4)Avacado Toast,5)Snack Bar"
            }
            else {
                txtAns.text = "Invalid statement, Please try again"
            }

            results.text = suggestion

        }

        clear.setOnClickListener{
            time.text.clear()
            results.text=""
        }







        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}