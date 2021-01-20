package de.demo.android_project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {
    // Firebase
    private FirebaseAuth myAuth;
    // Layouts
    private EditText cEmail, cPass;
    private Button loginBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        // get Firebase auth instance
        myAuth = FirebaseAuth.getInstance();
        if (myAuth.getCurrentUser() != null) {
            startActivity(new Intent(LoginActivity.this, MainActivity.class));
            finish();
        }
        // init layouts
        cEmail = findViewById(R.id.emailEdit);
        cPass = findViewById(R.id.pwdEdit);
        loginBtn = findViewById(R.id.loginButton);
        // On Sign-in click
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = cEmail.getText().toString();
                String password = cPass.getText().toString();
                if (TextUtils.isEmpty(email)) {
                    Toast.makeText(LoginActivity.this, "Enter your e-mail address", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (TextUtils.isEmpty(password)) {
                    Toast.makeText(LoginActivity.this, "Enter your password", Toast.LENGTH_SHORT).show();
                    return;
                }
                loginBtn.setClickable(false);
                //authenticate user
                myAuth.signInWithEmailAndPassword(email, password)
                        .addOnCompleteListener(LoginActivity.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    startActivity(new Intent(LoginActivity.this, MainActivity.class));
                                    finish();
                                } else {
                                    loginBtn.setClickable(true);
                                    Toast.makeText(LoginActivity.this,"auth_failed", Toast.LENGTH_LONG).show();
                                }
                            }
                        });
            }
        });
    }
}
