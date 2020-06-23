package com.example.dataBinding;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import com.example.dataBinding.databinding.ActivityMainBinding;

public class ClickHandler{
    private Context context;

    public ClickHandler(Context context) {
        this.context = context;
    }

    public void simpleButtonClick(View view){
        Toast.makeText(context, "Simple Button Click", Toast.LENGTH_SHORT).show();
    }

    public boolean simpleButtonLongClick(View view){
        Toast.makeText(context, "Simple Button Long Click", Toast.LENGTH_SHORT).show();
        return false;
    }

    public void simpleButtonClickWithParam(View view,Contract contract){

        Toast.makeText(context, "Simple Button Click with parameters \n " +
                "FirstName : " + contract.firstName + "\n" +
                "SecondName : " + contract.lastName, Toast.LENGTH_SHORT).show();
    }
}