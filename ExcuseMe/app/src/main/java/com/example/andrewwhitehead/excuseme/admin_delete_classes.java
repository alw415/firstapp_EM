package com.example.andrewwhitehead.excuseme;

/**
 * Created by Andrew Whitehead on 3/19/2017.
 */

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class admin_delete_classes extends Activity{
    Button Done2;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.delete_classes);
        addListenerOnButton();
    }
    public void addListenerOnButton() {
        final Context context = this;
        Done2 = (Button) findViewById(R.id.donebutton);

        Done2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View act) {
                Intent intent = new Intent(context, admin_HP.class);
                startActivity(intent);
            }
        });
    }
}
