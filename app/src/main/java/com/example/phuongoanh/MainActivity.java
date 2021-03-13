package com.example.phuongoanh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.phuongoanh.myutils.MyMatch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int plus = MyMatch.Plus(1, 2);
        int minus = MyMatch.Minus(2, 1);

        Log.d("T11:", plus+"");
        Log.d("T11:", minus+"");
    }
}
