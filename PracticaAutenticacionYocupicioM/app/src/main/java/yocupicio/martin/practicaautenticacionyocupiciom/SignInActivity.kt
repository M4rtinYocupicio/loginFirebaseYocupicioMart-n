package yocupicio.martin.practicaautenticacionyocupiciom

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth
import com.google.firebase.Firebase

class SignInActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_in)
        auth = Firebase.auth
        val email: EditText = findViewById(R.id.etrEmail)
        val password: EditText = findViewById(R.id.etrPassword)
        val confirmPassword: EditText = findViewById(R.id.etrConfirmPassword)
        val errorTv: TextView = findViewById(R.id.tvrError)

        val button: Button = findViewById(R.id.btnRegister)

        errorTv.visibility = View.INVISIBLE
    }
}