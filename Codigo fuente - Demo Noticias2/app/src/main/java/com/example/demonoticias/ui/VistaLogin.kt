package com.example.demonoticias.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.demonoticias.R
//import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
//import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.GoogleAuthProvider

class VistaLogin : AppCompatActivity() {
    /*
    private lateinit var botonLogin : Button
    private lateinit var googleSignInCliente : GoogleSignInClient
    private lateinit var firebaseAuth : FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.vista_login)

        val googleSignInOptions = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestIdToken(getString(R.string.default_web_client_id)).requestEmail().build()

        googleSignInCliente = GoogleSignIn.getClient(this,googleSignInOptions)
        firebaseAuth = FirebaseAuth.getInstance()
        botonLogin = findViewById(R.id.boton_login)


        botonLogin.setOnClickListener {
            val  intent = googleSignInCliente.signInIntent
            startActivityForResult(intent,100)
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?){
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == 100){
            val accountTask = GoogleSignIn.getSignedInAccountFromIntent(data)
            try{
                val account = accountTask.getResult(ApiException::class.java)
                firebaseAuthWithGoogleAccount(account)

            }catch (e: Exception){
                Log.d("DEMO","onActivityResult: ${e.message}")
            }
        }
    }

    private fun firebaseAuthWithGoogleAccount(account: GoogleSignInAccount?){
        val credential = GoogleAuthProvider.getCredential(account!!.idToken,null)
                                    // logeate con esas credenciales
        firebaseAuth.signInWithCredential(credential)
            .addOnSuccessListener { authResult ->
                //si logiea exitosamente lo guarda
                val firebaseUser = firebaseAuth.currentUser
                val vid = firebaseUser!!.uid
                val aaalla = firebaseUser.email

                if (authResult.additionalUserInfo!!.isNewUser){
                    Toast.makeText(this@VistaLogin, "Cuenta creada...", Toast.LENGTH_LONG).show()
                }else{
                    Toast.makeText(this@VistaLogin, "Cuenta existente...", Toast.LENGTH_LONG).show()
                }
                startActivity(Intent(this@VistaLogin, MainActivity::class.java))
                finish()
            }
            .addOnFailureListener {g ->
                Toast.makeText(this@VistaLogin, "Login fallido...", Toast.LENGTH_LONG).show()
            }
    }*/

}