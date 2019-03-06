package io.google.catchme;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Login_activity extends AppCompatActivity {
    private EditText userid;
    private EditText password;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        userid=(EditText)findViewById(R.id.userid);
        password=(EditText)findViewById(R.id.password);
        login=(Button)findViewById(R.id.login);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login_activity);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent enabler_intent=new Intent(Login_activity.this,Login_activity.class);
                startActivity(enabler_intent);
            }
        });
    }
}
