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
import de.demo.android_project.model.Site;

public class Formsite extends AppCompatActivity {
    private EditText codepostale , longitude , latitude, adress , ville , contact , telcontact;
    private String codepostalsite , longitudesite , latitudesite, adresssite , villesite ,contactsite,telcontactsite;
    private FirebaseAuth myAuth;
    private FirebaseDatabase myDatabase;
    private DatabaseReference myRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formsite);
        myAuth = FirebaseAuth.getInstance();
        myDatabase = FirebaseDatabase.getInstance();
        myRef = myDatabase.getReference();

        codepostale= findViewById(R.id.scodepostale);
        longitude= findViewById(R.id.slongitude);
        latitude=findViewById(R.id.slatitude);
        adress=findViewById(R.id.sadress);
        ville=findViewById(R.id.sville);
        contact=findViewById(R.id.scontact);
        telcontact=findViewById(R.id.stelcontact);

        codepostalsite= codepostale.getText().toString();
        longitudesite = longitude.getText().toString();
        latitudesite= latitude.getText().toString();
        adresssite = adress.getText().toString();
        villesite = ville.getText().toString();
        contactsite = contact.getText().toString();
        telcontactsite= telcontact.getText().toString();

        final Button ButtonSite= findViewById(R.id.btnSite);
        ButtonSite.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                myRef = myRef.child("Site").push();
                Site site = new Site(myRef.getKey(),codepostalsite,longitudesite,latitudesite,adresssite,villesite,contactsite,telcontactsite);
                myRef.setValue(site).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        startActivity(new Intent(Formsite.this,MainActivity.class));

                    }
                });
            }
        });
    }




}