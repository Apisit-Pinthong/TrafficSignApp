package sdu.cs.apisit.trafficsignapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Aboutme extends AppCompatActivity {
    //Explicit//
    TextView fbTextView,telTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutme);

        fbTextView = findViewById(R.id.tv_fb);
        fbTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fbIntent = new Intent(Intent.ACTION_VIEW);
                fbIntent.setData(Uri.parse("https://www.facebook.com/apisit.pinthong.5"));
                startActivity(fbIntent);
            }
        });
        telTextView = findViewById(R.id.tv_tel);
        telTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telIntent = new Intent(Intent.ACTION_DIAL);
                telIntent.setData(Uri.parse("tel:0843374210"));
                startActivity(telIntent);
            }
        });
    } // end on create() method //
}//end//
