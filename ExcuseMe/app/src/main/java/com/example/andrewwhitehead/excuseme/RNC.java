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

public class RNC extends Activity {
    Button B2THP;
    Button StA;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.request_new_class);
        addListenerOnButton();
    }
    public void addListenerOnButton() {
        final Context context = this;
        B2THP = (Button) findViewById(R.id.B2THP);
        StA = (Button) findViewById(R.id.StA);

        B2THP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View act) {
                Intent intent = new Intent(context, teacher_home.class);
                startActivity(intent);

            }
        });
        StA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View act) {
                Intent intent = new Intent(context, teacher_home.class);
                startActivity(intent);

            }
        });
    }
}
