package com.ankit.grocery_app.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.ankit.grocery_app.R;

public class LoginAcitivity extends AppCompatActivity {

    Button login_Btn;
    EditText edit_Email, edit_Password;
    TextView txt_Signup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_acitivity);

        login_Btn = (Button)findViewById(R.id.login_Btn);
        txt_Signup = (TextView)findViewById(R.id.txt_Signup);
        edit_Email = (EditText)findViewById(R.id.edit_Email);
        edit_Password = (EditText)findViewById(R.id.edit_Password);








    }
}