package com.example.dataBinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.dataBinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        ClickHandler handler = new ClickHandler(this);
        activityMainBinding.IncludeId.setClickHandler(handler);

        Contract contract = new Contract("Chhayank", "Harjai");
        activityMainBinding.setContract(contract);

        setSupportActionBar(activityMainBinding.ToolBarId);
    }
}
