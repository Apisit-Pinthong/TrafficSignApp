package sdu.cs.apisit.trafficsignapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //Explicit
    Button moreinfoButton, aboutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        moreinfoButton = findViewById(R.id.btn_moreinfo);
        moreinfoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moreinfoIntent = new Intent(Intent.ACTION_VIEW);
                moreinfoIntent.setData(Uri.parse("https://www.dlt.go.th/th/"));
                startActivity(moreinfoIntent);
            }
        });
     aboutButton = findViewById(R.id.btn_about);
     aboutButton.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent aboutIntent = new Intent(MainActivity.this,Aboutme.class);
             startActivity(aboutIntent);
         }
     });
    }//end// onCreate() method
}// end//
