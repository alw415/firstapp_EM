package com.example.andrewwhitehead.excuseme;

/**
 * Created by Andrew Whitehead on 2/15/2017.
 */
import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.widget.Button;
import android.view.View;
import android.content.Context;
import android.content.Intent;
import android.widget.EditText;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class student_log extends Activity {
    Button StudentBack;
    Button StudentNext;
    EditText StudentUser;
    EditText StudentPassword;

    /**
     * @param savedInstanceState Initializes the login page for the student
     * setContentView displays the features of the screen(studentlogin.xml)
     * sets edit text variables to the ids of the variables on the xml file
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.studentlogin);
        addListenerOnButton();
        StudentUser = (EditText) findViewById(R.id.StudUser);
        StudentPassword = (EditText) findViewById(R.id.StudPassword);

    }
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9#_~!$&'()*+,;=:.\"(),:;<>@\\[\\]\\\\]+@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*$";
    private Pattern pattern = Pattern.compile(EMAIL_PATTERN);
    private Matcher matcher;

    public boolean validateEmail(String email) {
        matcher = pattern.matcher(email);
        return matcher.matches();
    }
    public boolean validatePassword(String password) {
        return password.length() > 5;
    }


    public void addListenerOnButton() {
        final Context context = this;
        StudentBack = (Button) findViewById(R.id.StudentBack);
        StudentNext = (Button) findViewById(R.id.StudentNext);

        StudentBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View act) {
                Intent intent = new Intent(context, opening_screen.class);
                startActivity(intent);

            }
        });

        StudentNext.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                Intent intent = new Intent(student_log.this, student_avail_classes.class);
                final TextInputLayout uW = (TextInputLayout) findViewById(R.id.usernameWrapper);
                final TextInputLayout pW = (TextInputLayout) findViewById(R.id.passwordWrapper);
                String username = uW.getEditText().getText().toString();
                String password = pW.getEditText().getText().toString();
                if (!validateEmail(username)) {
                    uW.setError("Not a valid email address!");
                } else if (!validatePassword(password)) {
                    pW.setError("Not a valid password!");
                } else {
                    uW.setErrorEnabled(false);
                    pW.setErrorEnabled(false);
                    intent.putExtra("name", StudentUser.getText().toString());
                    startActivity(intent);
                }
            }

        });
    }
}
