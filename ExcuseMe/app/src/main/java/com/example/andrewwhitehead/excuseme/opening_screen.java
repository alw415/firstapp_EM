package com.example.andrewwhitehead.excuseme;

/**
 * Created by Andrew Whitehead on 2/15/2017.
 */

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class opening_screen extends Activity{
    Button StudentB;
    Button TeacherB;
    Button AdminB;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        addListenerOnButton();
    }
    public void addListenerOnButton(){
        final Context context = this;
        StudentB = (Button) findViewById(R.id.StudentB);
        TeacherB = (Button) findViewById(R.id.TeacherB);
        AdminB = (Button) findViewById(R.id.AdminB);

        StudentB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                Intent intent = new Intent(context, student_log.class);
                startActivity(intent);

            }
        });

        TeacherB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                Intent intent = new Intent(context, teacher_log.class);
                startActivity(intent);

            }
        });

        AdminB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                Intent intent = new Intent(context, admin_log.class);
                startActivity(intent);

            }
        });
    }
}
