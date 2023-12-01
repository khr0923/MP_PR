package com.example.mp_pr.SignUp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mp_pr.R;
import com.example.mp_pr.login.Log_In_Activity;

public class Sign_up_Activity extends AppCompatActivity {
    private Button SignUpNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        SignUpNext = findViewById(R.id.SignUpNext);
        SignUpNext.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Sign_up_Activity.this, InputNumberActivity.class);
                    startActivity(intent);
                }
        });
    }

}
