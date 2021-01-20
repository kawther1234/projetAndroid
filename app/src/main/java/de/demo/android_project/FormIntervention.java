package de.demo.android_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import de.demo.android_project.model.Interventions;

public class FormIntervention extends AppCompatActivity {
    private EditText titre , commentaire,datedebut,datefin,dateplan,dateval,dateterminaison,heuredebplan,heurefinplan,heuredebeffect,heurefineffect;
    private String titreintervention,commentaireinter,datedebutinter,datefininter, dateplaninter,datevalinter,dateterminter,heuredebplaninter,heurefinplaninter,heuredebeffectinter,heurefineffectinter;
    private FirebaseAuth myAuth;
    private FirebaseDatabase myDatabase;
    private DatabaseReference myRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_intervention);
        myAuth = FirebaseAuth.getInstance();
        myDatabase = FirebaseDatabase.getInstance();
        myRef = myDatabase.getReference();
        titre= findViewById(R.id.ititre);
        commentaire= findViewById(R.id.icomm);
        datedebut=findViewById(R.id.idatedeb);
        datefin=findViewById(R.id.idatefin);
        dateplan=findViewById(R.id.idateplanification);
        dateval=findViewById(R.id.idatevalidation);
        dateterminaison=findViewById(R.id.idateterminaison);
        heuredebplan=findViewById(R.id.iheuredebplan);
        heurefinplan=findViewById(R.id.iheurefinplan);
        heuredebeffect=findViewById(R.id.iheuredebeffect);
        heurefineffect=findViewById(R.id.iheurefineffect);

         titreintervention =titre.getText().toString();
        commentaireinter = commentaire.getText().toString();
       datedebutinter = datedebut.getText().toString();
       datefininter = datefin.getText().toString();
       dateplaninter = dateplan.getText().toString();
         datevalinter = dateval.getText().toString();
        dateterminter = dateterminaison.getText().toString();
       heuredebplaninter = heuredebplan.getText().toString();
        heurefinplaninter = heurefinplan.getText().toString();
          heuredebeffectinter = heuredebeffect.getText().toString();

        final Button ButtonI= findViewById(R.id.btnInter);
        ButtonI.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                myRef = myRef.child("interventions").push();
                Interventions intervention = new Interventions(myRef.getKey(),titreintervention,commentaireinter,datedebutinter,datefininter,dateplaninter,datevalinter,dateterminter,heuredebplaninter,heurefinplaninter,heuredebeffectinter,heurefineffectinter);
                myRef.setValue(intervention).addOnCompleteListener(new OnCompleteListener<Void>() {

                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        startActivity(new Intent(FormIntervention.this,MainActivity.class));


                    }
                });
            }
        });






    }

}






