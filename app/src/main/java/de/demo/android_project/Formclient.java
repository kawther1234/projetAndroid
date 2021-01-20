package de.demo.android_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import de.demo.android_project.model.Client;

public class Formclient extends AppCompatActivity {
    private EditText cName , cEmail , cTelephone , cAdress;
    private String nomclient , emailclient , telclient, adressclient;
    private FirebaseAuth myAuth;
    private FirebaseDatabase myDatabase;
    private DatabaseReference myRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formclient);
        myAuth = FirebaseAuth.getInstance();
        myDatabase = FirebaseDatabase.getInstance();
        myRef = myDatabase.getReference();
        cName= findViewById(R.id.clientname);
        cEmail= findViewById(R.id.clientEmailAddress);
        cTelephone=findViewById(R.id.clientPhone);
        cAdress=findViewById(R.id.clientadress);

       nomclient = cName.getText().toString();
       emailclient = cEmail.getText().toString();
       telclient = cTelephone.getText().toString();
       adressclient = cAdress.getText().toString();

        final Button Buttonc= findViewById(R.id.btnClient);
        Buttonc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                myRef = myRef.child("Client").push();
                Client client = new Client(myRef.getKey(),nomclient,adressclient,telclient,emailclient);
                myRef.setValue(client).addOnCompleteListener(new OnCompleteListener<Void>() {

                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        startActivity(new Intent (Formclient.this,MainActivity.class));

                    }
                });
            }
        });






    }






}