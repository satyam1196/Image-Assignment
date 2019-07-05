package com.example.ass2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView iv;
    ImageButton ib;
    Switch sw;
    CheckBox cb;
    RadioButton rb1,rb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv=findViewById(R.id.imageView);
        ib=findViewById(R.id.imageButton);
        sw=findViewById(R.id.switch1);
        cb=findViewById(R.id.checkBox);
        rb1=findViewById(R.id.radioButton);
        rb2=findViewById(R.id.radioButton1);

    }

    public void refresh(View v) {
        if(sw.isChecked()) iv.setVisibility(View.VISIBLE);
        else iv.setVisibility(View.INVISIBLE);

        if(cb.isChecked()) ib.setVisibility(View.VISIBLE);
        else ib.setVisibility(View.INVISIBLE);

        if(rb2.isChecked()) {
            ib.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(iv.getVisibility()==View.VISIBLE) {
                        Bitmap bm = ((BitmapDrawable) ib.getDrawable()).getBitmap();
                        ib.setImageBitmap(getBitmap(iv));
                        iv.setImageBitmap(bm);
                    }
                }
            });
        }
        if(rb1.isChecked()) {
            ib.setOnClickListener(null);
        }
    }

    public Bitmap getBitmap(ImageView i) {

        Bitmap bm=((BitmapDrawable)i.getDrawable()).getBitmap();

        return bm;

    }

}
