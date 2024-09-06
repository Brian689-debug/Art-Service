package com.example.artservice.ui.theme.data


import android.annotation.SuppressLint
import android.app.ProgressDialog
import android.content.Context
import android.widget.Toast
import androidx.navigation.NavController
import com.example.artservice.Navigation.ROUTE_ABOUT
import com.example.artservice.Navigation.ROUTE_BOOK
import com.example.artservice.Navigation.ROUTE_LOGIN
import com.example.artservice.Navigation.ROUTE_REGISTER
import com.example.artservice.ui.theme.models.user
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase


class AuthViewModel(var navController: NavController, var context: Context){
    val mAuth: FirebaseAuth
    val progress: ProgressDialog

    init {
        mAuth = FirebaseAuth.getInstance()
        progress = ProgressDialog(context)
        progress.setTitle("Loading")
        progress.setMessage("Please wait...")
    }
    @SuppressLint("RestrictedApi")
    fun signup(email:String, password:String){


        if (email.isBlank() || password.isBlank()){

            Toast.makeText(context,"Password and Email cannot be left blank",Toast.LENGTH_LONG).show()
        }else if (password != password){
            Toast.makeText(context,"Password does not match",Toast.LENGTH_LONG).show()
        }else{
            mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener {
                if (it.isSuccessful){
                    val userdata= user(email,password,mAuth.currentUser!!.uid)
                    val regRef= FirebaseDatabase.getInstance().getReference()
                        .child("Users/"+mAuth.currentUser!!.uid)
                    regRef.setValue(userdata).addOnCompleteListener {

                        if (it.isSuccessful){
                            Toast.makeText(context,"Registered Successfully",Toast.LENGTH_LONG).show()
                            navController.navigate( ROUTE_LOGIN)

                        }else{
                            Toast.makeText(context,"${it.exception!!.message}",Toast.LENGTH_LONG).show()
                            navController.navigate(ROUTE_ABOUT)
                        }
                    }
                }else{
                    navController.navigate(ROUTE_REGISTER)
                }

            } }

    }

    fun login(email: String, password: String){


        if (email.isBlank() || password.isBlank()){

            Toast.makeText(context,"Email and Password cannot be left blank",Toast.LENGTH_LONG).show()
        }else {
            mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener {
                progress.dismiss()
                if (it.isSuccessful){
                    Toast.makeText(this.context, "Successfully logged in", Toast.LENGTH_SHORT).show()
                    navController.navigate(ROUTE_ABOUT)
                }else{
                    Toast.makeText(this.context, "An Error occurred while logging in please check your network connection`  A", Toast.LENGTH_SHORT).show()
                }
            }

        }
    }

    fun book(email: String, fullname:String, time:String){


        if (email.isBlank() || fullname.isBlank() || time.isBlank()){

            Toast.makeText(context,"Please fill in all the details",Toast.LENGTH_LONG).show()
        }else {
            mAuth.signInWithEmailAndPassword(email, fullname).addOnCompleteListener {
                progress.dismiss()
                if (it.isSuccessful){
                    Toast.makeText(this.context, "Information submitted", Toast.LENGTH_SHORT).show()
                    navController.navigate(ROUTE_BOOK)
                }else{
                    Toast.makeText(this.context, "An Error occurred while submitting information,please check your network connection", Toast.LENGTH_SHORT).show()
                }
            }

        }
    }
























}