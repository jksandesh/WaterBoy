package com.example.sourabh.logreg;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText ET_NAME,ET_PASS;
    String login_name,login_pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ET_NAME=(EditText)findViewById(R.id.user_name);
        ET_PASS=(EditText)findViewById(R.id.user_pass);

    }

    public void userReg(View view){
        startActivity(new Intent(this,Register.class));

    }

    public void userLogin(View view){

        login_name= ET_NAME.getText().toString();
        login_pass=ET_PASS.getText().toString();
        String method="login";
        BackgroundTask backgroundTask = new BackgroundTask(this);
        backgroundTask.execute(method,login_name,login_pass);
         Intent i = new Intent(this,MapActivity.class);
        startActivity(i);

    }

}
