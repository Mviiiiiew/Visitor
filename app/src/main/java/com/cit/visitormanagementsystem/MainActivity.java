package com.cit.visitormanagementsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.gc.materialdesign.views.ButtonRectangle;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView txt_date;
    Button btn_Logout;
    ButtonRectangle btn_in;
    ButtonRectangle btn_out;

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
        btn_in = (ButtonRectangle)findViewById(R.id.btn_in);
        btn_out = (ButtonRectangle)findViewById(R.id.btn_out);

        btn_in.setRippleSpeed(25);
        btn_out.setRippleSpeed(25);
        txt_date.setText(date);

        btn_in.setOnClickListener(this);




    }

    @Override
    public void onClick(View view) {
        if(btn_Logout == view){
            Intent intent  = new Intent(getApplicationContext(),LoginActivity.class);
            startActivity(intent);
        }else if(btn_in == view){
            Intent intent  = new Intent(getApplicationContext(),CarLicenseActivity.class);
            startActivity(intent);

        }
    }
}
