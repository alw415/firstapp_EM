package com.example.andrewwhitehead.excuseme;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Andrew Whitehead on 2/15/2017.
 */


public class teacher_log extends Activity {
    Button TeacherBack;
    Button TeacherNext;
    EditText TeacherUser;
    EditText TeacherPassword;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teacherlogin);
        addListenerOnButton();
    }
    public void addListenerOnButton() {
        final Context context = this;
        TeacherBack = (Button) findViewById(R.id.TeacherBack);
        TeacherNext = (Button) findViewById(R.id.TeacherNext);

        TeacherBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View act) {
                Intent intent = new Intent(context, opening_screen.class);
                startActivity(intent);

            }
        });


        TeacherNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View act) {
                Intent intent = new Intent(teacher_log.this, teacher_home.class);
                startActivity(intent);

            }
        });

    }
}
