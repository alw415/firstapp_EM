package com.example.andrewwhitehead.excuseme;

/**
 * Created by Andrew Whitehead on 2/20/2017.
 */
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class teacher_home extends Activity {
    Button CNC;
    Button SDC;
    Button TLO;
    TextView tUser;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teacher_home);
        addListenerOnButton();
    }

    public void addListenerOnButton() {
        final Context context = this;
        CNC = (Button) findViewById(R.id.CNC);
        SDC = (Button) findViewById(R.id.SDC);
        TLO = (Button) findViewById(R.id.TLO);

        CNC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View act) {
                Intent intent = new Intent(context, RNC.class);
                startActivity(intent);

            }
        });


        SDC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View act) {
                Intent intent = new Intent(context, teacher_list_of_classes.class);
                startActivity(intent);

            }
        });
        TLO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View act) {
                Intent intent = new Intent(context, teacher_log.class);
                startActivity(intent);

            }
        });

    }
}

