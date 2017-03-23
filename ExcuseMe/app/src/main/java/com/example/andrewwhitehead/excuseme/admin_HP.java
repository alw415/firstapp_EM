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

public class admin_HP extends Activity{
    Button ALO;
    Button View_NC; //view new request button
    Button ADC; //delete class button

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_home);
        addListenerOnButton();
    }
    public void addListenerOnButton() {
        final Context context = this;
        ALO = (Button) findViewById(R.id.ALO);
        View_NC = (Button) findViewById(R.id.view_nr);
        ADC = (Button) findViewById(R.id.dc);

        ALO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View act) {
                Intent intent = new Intent(context, admin_log.class);
                startActivity(intent);

            }
        });
        View_NC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View act) {
                Intent intent = new Intent(context, admin_VNR.class);
                startActivity(intent);

            }
        });
        ADC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View act) {
                Intent intent = new Intent(context, admin_delete_classes.class);
                startActivity(intent);

            }
        });

    }
}
