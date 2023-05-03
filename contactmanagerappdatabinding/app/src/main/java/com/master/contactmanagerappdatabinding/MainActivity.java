package com.master.contactmanagerappdatabinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.master.contactmanagerappdatabinding.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private ContactAppDatabase contactAppDatabase;
    private ArrayList<Contact> contacts;
    private ContactDataAdapter contactDataAdapter;


    private ActivityMainBinding activityMainBinding;
    private MainActivityClickHandlers clickHandlers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        clickHandlers = new MainActivityClickHandlers(this);
        activityMainBinding.setClickHandler(clickHandlers);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);














    }

    public class MainActivityClickHandlers
    {

        Context context;

        public MainActivityClickHandlers(Context context) {
            this.context = context;
        }

        public void onFABClicked(View view){

            Intent i = new Intent(MainActivity.this,AddNewContactActivity.class);
            startActivityForResult(i,1);
        }
    }
}