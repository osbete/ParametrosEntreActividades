package com.osbete.agenda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Schedule extends AppCompatActivity {
    EditText name, correo, twtt, phone, nac;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda_osbete);
        name =(EditText)findViewById(R.id.txtNombre);
        correo =(EditText)findViewById(R.id.txtCorreo);
        twtt =(EditText)findViewById(R.id.txtTwitter);
        phone =(EditText)findViewById(R.id.txtTel);
        nac =(EditText)findViewById(R.id.txtFechaNac);
        btn =(Button)findViewById(R.id.btn);
        
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                Contact user=new Contact(name.getText().toString(), correo.getText().toString(), twtt.getText().toString(), phone.getText().toString(), nac.getText().toString());
                intent.putExtra("Osvaldo",user);
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }
}
