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

public class admin_VNR extends Activity{
    Button Done;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.views_new_request);
        addListenerOnButton();
    }
    public void addListenerOnButton() {
        final Context context = this;
        Done = (Button) findViewById(R.id.button2);

        Done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View act) {
                Intent intent = new Intent(context, admin_HP.class);
                startActivity(intent);
            }
        });
    }
}
