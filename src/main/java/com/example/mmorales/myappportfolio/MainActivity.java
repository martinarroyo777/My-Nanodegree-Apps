package com.example.mmorales.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
        -- Click handler that displays Toasts describing each project------
        (Will eventually be replaced with Intents to open the project itself, once built)
     */

    public void onClickHandler(View view) {
        int buttonId = view.getId(); // Get the id of the button clicked in the view
        // Determine which Toast to present based on the button clicked
        switch(buttonId){
            case R.id.popMovies:
                new Toast(getApplicationContext()).makeText(getApplicationContext(),
                            "This button will launch my Popular Movies App!",
                             Toast.LENGTH_SHORT ).show();
                break;
            case R.id.stockHawk:
                new Toast(getApplicationContext()).makeText(getApplicationContext(),
                        "This button will launch my Stock Hawk App!",
                        Toast.LENGTH_SHORT ).show();
                break;
            case R.id.buildBigger:
                new Toast(getApplicationContext()).makeText(getApplicationContext(),
                        "This button will launch my Build It Bigger App!",
                        Toast.LENGTH_SHORT ).show();
                break;
            case R.id.makeAppMaterial:
                new Toast(getApplicationContext()).makeText(getApplicationContext(),
                        "This button will launch my Make Your App Material App!",
                        Toast.LENGTH_SHORT ).show();
                break;
            case R.id.goUbiquitous:
                new Toast(getApplicationContext()).makeText(getApplicationContext(),
                        "This button will launch my Go Ubiquitous App!",
                        Toast.LENGTH_SHORT ).show();
                break;
            case R.id.capstone:
                new Toast(getApplicationContext()).makeText(getApplicationContext(),
                        "This button will launch my Capstone App!",
                        Toast.LENGTH_SHORT ).show();
                break;
        }


    }

}
