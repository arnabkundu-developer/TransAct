package com.onnetsolution.transactsample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.onnetsolution.transact.TransAct;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCLick(View view) {
        startActivity(new Intent(this, Main2Activity.class));
        TransAct.windmill(this);
    }
}
