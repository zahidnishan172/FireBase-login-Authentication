package com.example.myloginapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class UserActivity extends AppCompatActivity {
    Button btnLogOut;
    FirebaseAuth firebaseAuth;
    private FirebaseAuth.AuthStateListener authStateListener;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        btnLogOut =(Button) findViewById(R.id.btnLogOut);
        btnLogOut.setOnClickListener((view)->{
            FirebaseAuth.getInstance().signOut();
            Intent I=new Intent(UserActivity.this,ActivityLogin.class);
            startActivity(I);
        });
    }
}
