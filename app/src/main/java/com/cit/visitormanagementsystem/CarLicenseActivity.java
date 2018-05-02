package com.cit.visitormanagementsystem;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.gc.materialdesign.views.ButtonRectangle;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CarLicenseActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_Back;
    ButtonRectangle btn_0;
    ButtonRectangle btn_1;
    ButtonRectangle btn_2;
    ButtonRectangle btn_3;
    ButtonRectangle btn_4;
    ButtonRectangle btn_5;
    ButtonRectangle btn_6;
    ButtonRectangle btn_7;
    ButtonRectangle btn_8;
    ButtonRectangle btn_9;
    ButtonRectangle btn_delete;
    ButtonRectangle btn_backslash;
    ButtonRectangle btn_Cross;
    ButtonRectangle btn_Spacebar;
    ButtonRectangle btn_Alphabet;
    EditText edit_Carlicense;
    String Carlicense;
    Button btn_ok;
    TextView txt_date;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_license);

        initInstances();
    }

    private void initInstances() {

        DateFormat df = new SimpleDateFormat(" d MMM yyyy, HH:mm");
        String date = df.format(Calendar.getInstance().getTime());

        btn_Back = (Button) findViewById(R.id.btn_Back);
        btn_0 = (ButtonRectangle) findViewById(R.id.btn_0);
        btn_1 = (ButtonRectangle) findViewById(R.id.btn_1);
        btn_2 = (ButtonRectangle) findViewById(R.id.btn_2);
        btn_3 = (ButtonRectangle) findViewById(R.id.btn_3);
        btn_4 = (ButtonRectangle) findViewById(R.id.btn_4);
        btn_5 = (ButtonRectangle) findViewById(R.id.btn_5);
        btn_6 = (ButtonRectangle) findViewById(R.id.btn_6);
        btn_7 = (ButtonRectangle) findViewById(R.id.btn_7);
        btn_8 = (ButtonRectangle) findViewById(R.id.btn_8);
        btn_9 = (ButtonRectangle) findViewById(R.id.btn_9);
        btn_delete = (ButtonRectangle) findViewById(R.id.btn_delete);
        btn_backslash = (ButtonRectangle) findViewById(R.id.btn_backslash);
        btn_Cross = (ButtonRectangle) findViewById(R.id.btn_Cross);
        btn_Spacebar = (ButtonRectangle) findViewById(R.id.btn_Spacebar);
        btn_Alphabet = (ButtonRectangle) findViewById(R.id.btn_Alphabet);
        edit_Carlicense = (EditText) findViewById(R.id.edit_Carlicense);
        btn_ok= (Button) findViewById(R.id.btn_ok);
        txt_date= (TextView) findViewById(R.id.txt_date);
        txt_date.setText(date);





        btn_0.setRippleSpeed(35);
        btn_1.setRippleSpeed(35);
        btn_2.setRippleSpeed(35);
        btn_3.setRippleSpeed(35);
        btn_4.setRippleSpeed(35);
        btn_5.setRippleSpeed(35);
        btn_6.setRippleSpeed(35);
        btn_7.setRippleSpeed(35);
        btn_8.setRippleSpeed(35);
        btn_9.setRippleSpeed(35);
        btn_delete.setRippleSpeed(35);
        btn_backslash.setRippleSpeed(35);
        btn_Cross.setRippleSpeed(35);
        btn_Spacebar.setRippleSpeed(35);
        btn_Alphabet.setRippleSpeed(35);

        btn_Back.setOnClickListener(this);
        edit_Carlicense.setText(Carlicense);
        btn_0.setOnClickListener(this);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_delete.setOnClickListener(this);
        btn_backslash.setOnClickListener(this);
        btn_Cross.setOnClickListener(this);
        btn_Spacebar.setOnClickListener(this);
        btn_Alphabet.setOnClickListener(this);
        edit_Carlicense.setOnClickListener(this);
        btn_Alphabet.setOnClickListener(this);
        btn_ok.setOnClickListener(this);




    }

    @Override
    public void onClick(View view) {
        if (btn_Back == view) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);

        }else if(btn_0 == view){
        edit_Carlicense.append("0");
        }
        else if(btn_1 == view){
            edit_Carlicense.append("1");
        }
        else if(btn_2 == view){
            edit_Carlicense.append("2");
        }
        else if(btn_3 == view){
            edit_Carlicense.append("3");
        }
        else if(btn_4 == view){
            edit_Carlicense.append("4");
        }
        else if(btn_5 == view){
            edit_Carlicense.append("5");
        }
        else if(btn_6 == view){
            edit_Carlicense.append("6");
        }
        else if(btn_7 == view){
            edit_Carlicense.append("7");
        }
        else if(btn_8 == view){
            edit_Carlicense.append("8");
        }
        else if(btn_9 == view){
            edit_Carlicense.append("9");
        }
        else if(btn_delete == view){
            int length = edit_Carlicense.getText().length();
            if (length > 0) {
                edit_Carlicense.getText().delete(length - 1, length);
            }
        }
        else if(btn_backslash == view){
            int length = edit_Carlicense.getText().length();
            if(length >= 1 ){
                edit_Carlicense.append("/");
            }
            else {
                edit_Carlicense.append("");
            }

        }
        else if(btn_Cross == view){
            int length = edit_Carlicense.getText().length();
            if(length >= 1 ){
                edit_Carlicense.append("-");
            }
            else {
                edit_Carlicense.append("");
            }


        }
        else if(btn_Spacebar == view){
            int length = edit_Carlicense.getText().length();
            if(length >= 1 ){
                edit_Carlicense.append(" ");
            }
            else {
                edit_Carlicense.append("");
            }

        }
        else if(btn_Alphabet == view){

            openDialog(edit_Carlicense.getText().toString());

        }else if(edit_Carlicense == view){
            openDialog(edit_Carlicense.getText().toString());


        }else if(btn_ok == view){
            String mCarlicense = edit_Carlicense.getText().toString().replace(" ", "");
          if( mCarlicense.equals("") ) {
              Toast.makeText(getApplicationContext(), "กรุณาใส่ทะเบียนรถ", Toast.LENGTH_LONG).show();
          }else{

              Intent intent  = new Intent(this,ConcludeActivity.class);
              startActivity(intent);

          }



        }

    }
    private void openDialog(String carlicense){
        LayoutInflater inflater = LayoutInflater.from(CarLicenseActivity.this);
        View subView = inflater.inflate(R.layout.dialog_carlicense_layout, null);
        final EditText dialogEditText = (EditText)subView.findViewById(R.id.dialogEditText);
        dialogEditText.setText(carlicense);

        dialogEditText.setSelection(dialogEditText.getText().length());


        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(subView);
        AlertDialog alertDialog = builder.create();

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                edit_Carlicense.setText(dialogEditText.getText().toString());
                edit_Carlicense.setSelection(edit_Carlicense.getText().length());

            }
        });

        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                dialog.dismiss();

            }
        });

        builder.show();
    }




}
