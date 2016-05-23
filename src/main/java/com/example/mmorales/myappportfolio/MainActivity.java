package com.example.mmorales.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
import android.content.Context;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
        First Toast Button - Popular Movies App
     */

    public void toastButton1(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Popular Movies App!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }

    /*
        Second Toast Button - Stock Hawk App
     */
    public void toastButton2(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Stock Hawk App!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }

    /*
        Third Toast Button - Build it Bigger App
     */

    public void toastButton3(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Build It Bigger App!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }

    /*
        Fourth Toast Button - Make Your App Material App
     */

    public void toastButton4(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Make Your App Material App!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }

    /*
        Fifth Toast Button - Go Ubiquitous App
     */

    public void toastButton5(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Go Ubiquitous App!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }

    /*
        Sixth Toast Button - Capstone App
     */

    public void toastButton6(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Capstone App!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }
}
