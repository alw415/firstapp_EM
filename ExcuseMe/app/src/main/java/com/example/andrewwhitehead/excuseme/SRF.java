package com.example.andrewwhitehead.excuseme;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Andrew Whitehead on 2/20/2017.
 */

public class SRF extends Activity {
    Button Add;
    Button DiffCl;
    Button SL;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_retrieve_feeds);
        addListenerOnButton();
    }
    public void addListenerOnButton() {
        final Context context = this;
        DiffCl = (Button) findViewById(R.id.DiffCl);
        SL = (Button) findViewById(R.id.SL);
        DiffCl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View act) {
                Intent intent = new Intent(context, teacher_list_of_classes.class);
                startActivity(intent);
            }
        });

        SL.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                Intent intent = new Intent(context, teacher_feed.class);
                startActivity(intent);
            }
        });
    }
}
