package com.osbete.agenda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView objList;
    Button btn;
    ArrayList<Contact> array;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.btn);
        objList =(ListView)findViewById(R.id.listaContactos);
        array=new ArrayList<>();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getApplication(), Schedule.class);
                startActivityForResult(myIntent,1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==1&&resultCode==RESULT_OK)
        {
            Contact cont=(Contact) data.getSerializableExtra(
                    "Osvaldo"
            );
            array.add(cont);
            String [] x=new String[array.size()];
            for (int i=0;i<array.size();i++){
                x[i]=array.get(i).toString();
            }
            ArrayAdapter <String> nombre=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,x);
            objList.setAdapter(nombre);
        }
    }
}
