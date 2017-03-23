package com.example.andrewwhitehead.excuseme;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Andrew Whitehead on 2/15/2017.
 */

public class admin_log extends Activity {
    Button AdminBack;
    Button AdminNext;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adminlogin);
        addListenerOnButton();
    }
    public void addListenerOnButton() {
        final Context context = this;
        AdminBack = (Button) findViewById(R.id.AdminBack);
        AdminNext = (Button) findViewById(R.id.AdminNext);

        AdminBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View act) {
                Intent intent = new Intent(context, opening_screen.class);
                startActivity(intent);

            }
        });
        AdminNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View act) {
                Intent intent = new Intent(context, admin_HP.class);
                startActivity(intent);

            }
        });
    }
}
