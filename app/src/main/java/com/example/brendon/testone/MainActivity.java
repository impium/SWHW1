package com.example.brendon.testone;

import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import yuku.ambilwarna.AmbilWarnaDialog;

public class MainActivity extends AppCompatActivity {
    int myColor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Color();
    }

    public void Color() {
        Button button = (Button) findViewById(R.id.button);
        Button nextLayout = (Button) findViewById(R.id.Nextlayout);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                TextView textView = (TextView) findViewById(R.id.textView);
                int r = (int) (Math.random() * 255 + 1);
                int b = (int) (Math.random() * 255 + 1);
                int g = (int) (Math.random() * 255 + 1);
                textView.setTextColor(Color.rgb(r, g, b));
                textView.setText("Color: " + r + "red " + g + "green " + b + "blue ");
                EditText editText = (EditText) findViewById(R.id.editText);
                int r2 = (int) (Math.random() * 255 + 1);
                int b2 = (int) (Math.random() * 255 + 1);
                int g2 = (int) (Math.random() * 255 + 1);
                editText.setTextColor(Color.rgb(r, g, b));

            }
        });
        nextLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.drawinglayout);
            }


        });
    }

    public void drawOnMe() {
         Button colorwheel = (Button) findViewById(R.id.button3);
        myColor = ContextCompat.getColor(MainActivity.this, R.color.colorPrimary);

            colorwheel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View V){
                    openColorPicker();
                }
        });

    }
    public void openColorPicker(){
        AmbilWarnaDialog colorPicker = new AmbilWarnaDialog(this,myColor, new AmbilWarnaDialog.OnAmbilWarnaListener(){

           @Override
            public void onCancel(AmbilWarnaDialog dialog) {

            }

            @Override
            public void onOk(AmbilWarnaDialog dialog, int color) {
            myColor = color;
            }
        });
    }
}



