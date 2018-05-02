package com.cit.visitormanagementsystem;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

public class ConcludeActivity extends AppCompatActivity implements View.OnClickListener {
    int[] IMAGES = {R.drawable.ic_account_circle_black_24dp,R.drawable.ic_logout_48,R.drawable.ic_account_circle_black_24dp,
            R.drawable.ic_account_circle_black_24dp};
    String[] NAME = {"ติดต่อบุคคล","ส่งของ","ผู้รับเหมา","ฝ่ายขาย"};

    Button btn_Back;
    Button btn_camera1;
    ImageView img_camera1;

     ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conclude);


        initInstances();

    }



    private void initInstances() {

        btn_Back = (Button)findViewById(R.id.btn_Back);
        btn_camera1 = (Button)findViewById(R.id.btn_camera1);
        listView = (ListView)findViewById(R.id.listView);
        img_camera1= (ImageView)findViewById(R.id.img_camera1);

        final CustomAdapter customAdapter  = new CustomAdapter() ;
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), NAME[i], Toast.LENGTH_LONG).show();
            }
        });


        btn_Back.setOnClickListener(this);
        btn_camera1.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view == btn_Back){

            Intent intent = new Intent(this,CarLicenseActivity.class);
            startActivity(intent);

        }else if(view == btn_camera1){
            Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivityForResult(intent,0);

        }




    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bitmap bitmap = (Bitmap) data.getExtras().get("data");
        img_camera1.setImageBitmap(bitmap);

    }

    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return IMAGES.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.list_view_item,null);
            ImageView imageView = (ImageView)view.findViewById(R.id.imageView);
            TextView textView = (TextView)view.findViewById(R.id.textView);

            imageView.setImageResource(IMAGES[i]);
            textView.setText(NAME[i]);
            return view;
        }
    }
}
