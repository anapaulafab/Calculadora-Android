package com.example.aluno.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Segunda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
    }

    public void voltarMain(View view) {
        //Intent itt = new Intent(this, MainActivity.class);
        //startActivity(itt);
        this.finish();
    }
}
