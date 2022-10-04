package com.programacionandroid.praticaclase2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_users_view extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_view);
    }

    public void moverDeActivityUserMedioPago(View view){

        Intent objMover = new Intent(this,activity_cart_view.class);
        startActivity(objMover);

    }


}
