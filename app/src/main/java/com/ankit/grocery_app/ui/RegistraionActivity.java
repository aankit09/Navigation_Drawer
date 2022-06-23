 package com.ankit.grocery_app.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.ankit.grocery_app.R;

public class RegistraionActivity extends AppCompatActivity {
    Button signup_Btn;
    EditText edit_Name, edit_Email, edit_Password;
    TextView txt_login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registraion);

        signup_Btn = (Button)findViewById(R.id.signup_Btn);
        txt_login = (TextView)findViewById(R.id.txt_login);
        edit_Name = (EditText)findViewById(R.id.edit_Name);
        edit_Email = (EditText)findViewById(R.id.edit_Email);
        edit_Password = (EditText)findViewById(R.id.edit_Password);

    }
}