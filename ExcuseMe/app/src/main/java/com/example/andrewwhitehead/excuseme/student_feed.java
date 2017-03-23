package com.example.andrewwhitehead.excuseme;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Context;
import android.content.Intent;


/**
 * Created by Andrew Whitehead on 2/24/2017.
 */

public class student_feed extends Activity {
    Button submitQ;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_feed);
        addListenerOnButton();
    }
    public void addListenerOnButton() {
        final Context context = this;
        submitQ = (Button) findViewById(R.id.submitQ);

        submitQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View act) {
                Intent intent = new Intent(context, student_avail_classes.class);
                startActivity(intent);

            }
        });
    }
}
