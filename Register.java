package com.example.sourabh.logreg;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Register extends Activity {

    EditText ET_NAME,ET_USER_NAME,ET_USER_PASS,ET_USER_EMAIL,ET_USER_NUMBER;
    String name,user_name,user_pass,user_email,user_number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        ET_NAME=(EditText)findViewById(R.id.name);
        ET_USER_NAME=(EditText)findViewById(R.id.new_user_name);
        ET_USER_PASS=(EditText)findViewById(R.id.new_user_pass);
        ET_USER_EMAIL=(EditText)findViewById(R.id.new_user_email);
        ET_USER_NUMBER=(EditText)findViewById(R.id.new_user_number);

    }

    public void userReg(View view){

        name = ET_NAME.getText().toString();
        user_name=ET_USER_NAME.getText().toString();
        user_pass=ET_USER_PASS.getText().toString();
        user_email=ET_USER_EMAIL.getText().toString();
        user_number=ET_USER_NUMBER.getText().toString();
        String method ="register";
        BackgroundTask backgroundTask = new BackgroundTask(this);
        backgroundTask.execute(method,name,user_name,user_pass,user_email,user_number);
        finish();
    }
}
