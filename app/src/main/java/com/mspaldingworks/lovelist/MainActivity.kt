package com.mspaldingworks.lovelist.com.mspaldingworks.lovelist

import android.os.Bundle
import android.content.Intent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity

class MainActivity extends AppCompatActivity {


    private Button addReasonButton
    private Button showReasonButton


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addReasonButton = findViewById(R.id.add_reason_button)
        showReasonButton = findViewById(R.id.view_reasons_button)

        setListeners();

    }

    private void setListeners() {

        addReasonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addReason();
            }
        });

        showReasonsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showReasons();
            }
        });

    }


    protected void addReason(){
        Intent addReason = new Intent(this, AddReasonActivity.class);
        MainActivity(addReason);
    }

    protected void showReason(){
        Intent showReasons = new Intent(this, ViewReasonActivity.class);
        MainActivity(showReasons);
    }

}