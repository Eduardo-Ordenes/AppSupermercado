package com.programacionandroid.praticaclase2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class activity_intent_eduardosalinas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_eduardosalinas);
    }


    public void mover (View view){
        Intent objMover = new Intent(this, activity_login_view.class);
        startActivity(objMover);
    }


    public void whatsapp (View view){

        Intent i;
        PackageManager manager = getPackageManager();
        try {
            i = manager.getLaunchIntentForPackage("com.android.whatsapp");
            if (i == null)
                throw new PackageManager.NameNotFoundException();
            i.addCategory(Intent.CATEGORY_LAUNCHER);
            startActivity(i);
        } catch (PackageManager.NameNotFoundException e) {

            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://www.whatsapp.com/download/"));
            startActivity(intent);
        }


    }


    public void google (View view){

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://developer.android.com/codelabs/basic-android-kotlin-training-activities-intents?hl=es-419#0/"));
        startActivity(intent);


    }


    public void contactos (View view){

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(""));
        startActivity(intent);




    }



}