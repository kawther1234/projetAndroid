package de.demo.android_project;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class InterventionsActivity extends AppCompatActivity {
    ArrayList<String>SelectedItems= new ArrayList<>();
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.interventions);
        ListView ch1 = (ListView) findViewById(R.id.checkable_list);
        ch1.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        String[] items = {"Intervention mobile 2, Intervention mobile"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.rowlayout, R.id.txt_lan, items);
        ch1.setAdapter(adapter);
        ch1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String SelectedItem=((TextView)view).getText().toString();
                if (SelectedItems.contains(SelectedItem)){
                    SelectedItems.remove(SelectedItem);
                }
                else
                    SelectedItems.add(SelectedItem);

            }
        });
    }

    public void showSelectedItems(View view) {
        String items="";
        for(String item:SelectedItems){
            items+="-"+item+"\n";
        }
        Toast.makeText(this,"you have selected \n" +items,Toast.LENGTH_LONG).show();


    }
}

