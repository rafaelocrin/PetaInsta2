package com.zocrosfera.petagraminsta.menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.zocrosfera.miscontactos.R;

public class FormularioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
    }


    public void sendEmail(View v) {

        EditText nombre =  (EditText)findViewById(R.id.etNombre);
        EditText email =  (EditText)findViewById(R.id.etEmail);
        EditText mensaje =  (EditText)findViewById(R.id.etMensaje);


        //SendMessage.sendMsg(email.getText().toString(), mensaje.getText().toString());

        Toast.makeText(this, "Email Enviado", Toast.LENGTH_SHORT).show();
    }

//    public void sendEmail(View v) {
//
//        EditText nombre =  (EditText)findViewById(R.id.etNombre);
//        EditText email =  (EditText)findViewById(R.id.etEmail);
//        EditText mensaje =  (EditText)findViewById(R.id.etMensaje);
//
//        //Creating SendMail object
//        SendMail sm = new SendMail(this, email.getText().toString(),
//                "Test Enviar Email App Android Coursera",
//                mensaje.getText().toString());
//
//        //Executing sendmail to send email
//        sm.execute();
//
//        Toast.makeText(this, "Email Enviado", Toast.LENGTH_SHORT).show();
//    }

}
