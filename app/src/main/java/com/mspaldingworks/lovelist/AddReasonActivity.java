package com.mspaldingworks.lovelist.com.mspaldingworks.lovelist

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.mspaldingworks.lovelist.com.mspaldingworks.lovelist.Models.Reason;
import com.mspaldingworks.lovelist.com.mspaldingworks.lovelist.room.ReasonApplication;
import com.mspaldingworks.lovelist.com.mspaldingworks.lovelist.room.ReasonRoomDatabase;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class AddReasonActivity extends AppCompatActivity {

    private ReasonRoomDatabase reasonDatabase;

    protected TextView nameTextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_reason);

        nameTextview = findViewById(R.id.reason_edit_text);

        nameTextview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addReason();
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        reasonDatabase = ((ReasonApplication)getApplicationContext()).getDatabase();
    }


    protected void addReason(){

        if (reasonTextview.getText().toString().isEmpty()) {
            Toast.makeText(this, "Reason can not be empty, try again!", Toast.LENGTH_LONG).show();
        } else {
            Reason reason = new Reason(reasonTextview.getText().toString());

            reasonDatabase.reasonDao().insert(reason);

            Toast.makeText(this, "Reason added to database!", Toast.LENGTH_LONG).show();

            addAnotherPrompt();
        }
    }

    protected void addAnotherPrompt(){
        final AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Add Another Reason?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        reasonTextview.setText("");
                        dialog.dismiss();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                })
                .create()
                .show();
    }
}