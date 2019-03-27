package com.example.hello;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

public class Alertdialog extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_main);
        View v;
        v = LayoutInflater.from(this).inflate(R.layout.alertlayout,null);
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setIcon(R.drawable.header_logo);
        builder.setTitle("对话框");
        builder.setView(v);
        builder.setPositiveButton("Sign in",null);
        builder.setNegativeButton( "Cancel",null);
        builder.create();
        builder.show();
}

}
