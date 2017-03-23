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

public class teacher_list_of_classes extends Activity {
    Button S4C;
    Button B2TH;
    Button F2F;
    Button delete_class;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teacher_loc);
        addListenerOnButton();
    }
    public void addListenerOnButton() {
        final Context context = this;
        B2TH = (Button) findViewById(R.id.B2TH);
        F2F = (Button) findViewById(R.id.F2F);

        B2TH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View act) {
                Intent intent = new Intent(context, teacher_home.class);
                startActivity(intent);

            }
        });
        F2F.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View act) {
                Intent intent = new Intent(context, SRF.class);
                startActivity(intent);

            }
        });
    }
}
