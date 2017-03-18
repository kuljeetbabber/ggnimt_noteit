package com.quincedigital.ggnimt_noteit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username = (EditText)findViewById(R.id.editText1);
    EditText password = (EditText)findViewById(R.id.editText2);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void login(View view){
        if(username.getText().toString().equals("1234") && password.getText().toString().equals("admin")){
            Toast.makeText(getApplicationContext(), "success", Toast.LENGTH_LONG).show();
            //correcct password
        }else{
            Toast.makeText(getApplicationContext(),"Failed",Toast.LENGTH_LONG).show();
        }
            //wrong password
        }
    }
