package com.cit.visitormanagementsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView txt_date;
    Button btn_Logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initInstances();

    }

    @Override
    public void onBackPressed() {

    }

    private void initInstances() {
        DateFormat df = new SimpleDateFormat(" d MMM yyyy, HH:mm");
        String date = df.format(Calendar.getInstance().getTime());

        txt_date = (TextView)findViewById(R.id.txt_date);
        btn_Logout = (Button)findViewById(R.id.btn_Logout);
        btn_Logout.setOnClickListener(this);

        txt_date.setText(date);




    }

    @Override
    public void onClick(View view) {
        if(btn_Logout == view){
            Intent intent  = new Intent(getApplicationContext(),LoginActivity.class);
            startActivity(intent);
        }
    }
}
