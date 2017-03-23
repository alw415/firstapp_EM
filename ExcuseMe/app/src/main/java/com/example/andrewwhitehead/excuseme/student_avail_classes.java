package com.example.andrewwhitehead.excuseme;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;

/**
 * Created by Andrew Whitehead on 2/16/2017.
 */

public class student_avail_classes extends Activity {
    Button B2SL;
    Button GTC;
    TextView sUser;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_available_classes);
        sUser = (TextView) findViewById(R.id.sUser);
        sUser.setText(getIntent().getExtras().getString("name"));
        addListenerOnButton();
    }

    public void addListenerOnButton() {
        final Context context = this;
        B2SL = (Button) findViewById(R.id.B2SL);
        GTC = (Button) findViewById(R.id.GTC);

        B2SL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View act) {
                Intent intent = new Intent(context, student_log.class);
                startActivity(intent);

            }
        });

        GTC.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                Intent intent = new Intent(context, student_feed.class);
                startActivity(intent);
            }
        });

    }
}
