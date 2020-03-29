package com.esratemu.bachelortoolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Build;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Toolbar MainToolbarDefault;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainToolbarDefault= (Toolbar) findViewById(R.id.main_toolbar_default);
        MainToolbarDefault.setTitle("Bachelor");
        setSupportActionBar(MainToolbarDefault);

        MainToolbarDefault.setSubtitle("Emu's toolbar");

        //checking
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
            MainToolbarDefault.setElevation(10.f);
        }
    }
}


