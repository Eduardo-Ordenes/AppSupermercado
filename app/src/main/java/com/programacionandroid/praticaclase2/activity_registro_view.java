package com.programacionandroid.praticaclase2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_registro_view extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_view);
    }

    public void moverDeActivityRegistro(View view){

        Intent objMover = new Intent(this,activity_login_view.class);
        startActivity(objMover);

    }


    public void moverAPrincipal(View view){

        Intent objMover = new Intent(this,MainActivity.class);
        startActivity(objMover);

    }


}