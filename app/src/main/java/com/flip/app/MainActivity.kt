package com.flip.app

import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val root = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(32, 48, 32, 32)
            setBackgroundColor(Color.WHITE)
        }

        val title = TextView(this).apply {
            text = "Flip"
            textSize = 36f
            gravity = Gravity.CENTER
            setTextColor(Color.BLACK)
        }

        root.addView(
            title,
            LinearLayout.LayoutParams(-1, 100)
        )

        val subtitle = TextView(this).apply {
            text = "Chat • Photos • Videos • Voice • Video Calls"
            textSize = 16f
            gravity = Gravity.CENTER
        }

        root.addView(
            subtitle,
            LinearLayout.LayoutParams(-1, 70)
        )

        val name = EditText(this).apply {
            hint = "Your name"
        }

        root.addView(name)

        val start = Button(this).apply {
            text = "Start Flip"

            setOnClickListener {
                Toast.makeText(
                    this@MainActivity,
                    "Welcome to Flip!",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

        root.addView(start)

        val info = TextView(this).apply {
            text = """
                
                Flip features:
                
                ✓ Private & group chat
                ✓ Photos and videos
                ✓ Voice messages
                ✓ Voice calls
                ✓ Video calls
                ✓ User profiles
                ✓ Notifications
                ✓ Cloud messaging
            """.trimIndent()

            textSize = 17f
        }

        root.addView(info)

        setContentView(root)
    }
}
