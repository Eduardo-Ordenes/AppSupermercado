package com.programacionandroid.praticaclase2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_shipping_rating_view extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shipping_rating_view);
    }

    public void moverDeActivityRating(View view){

        Intent objMover = new Intent(this,MainActivity.class);
        startActivity(objMover);

    }


}
