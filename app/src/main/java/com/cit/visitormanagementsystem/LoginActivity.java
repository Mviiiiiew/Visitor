package com.cit.visitormanagementsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    EditText edit_Username;
    EditText edit_password;
    Button btn_Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initInstances();


    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    private void initInstances() {

        edit_Username = (EditText)findViewById(R.id.edit_Username);
        edit_password = (EditText)findViewById(R.id.edit_password);
        btn_Login = (Button) findViewById(R.id.btn_Login);

        btn_Login.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        if(view == btn_Login){

            String mUser = edit_Username.getText().toString().replace(" ", "");
            String mPass = edit_password.getText().toString().replace(" ", "");
            if (mUser.equals("") || mPass.equals("")) {
                Toast.makeText(getApplicationContext(), "Enter Username or Password", Toast.LENGTH_LONG).show();
            } else if(mUser.matches("11") && mPass.matches("11")) {

                Intent intent   = new Intent(this,MainActivity.class);
                startActivity(intent);



            } else {

                Toast.makeText(getApplicationContext(), "LoginFail", Toast.LENGTH_LONG).show();
            }


        }
    }
}
