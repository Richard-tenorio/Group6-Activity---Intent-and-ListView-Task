package com.example.androidversionapp;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class DetailActivity extends AppCompatActivity {
   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_detail);


       TextView textViewTitle = findViewById(R.id.textViewTitle);
       ImageView imageView = findViewById(R.id.imageView);
       TextView textViewDescription = findViewById(R.id.textViewDescription);


       String versionName = getIntent().getStringExtra("version_name");
       String versionDescription = getIntent().getStringExtra("version_description");
       int imageResId = getIntent().getIntExtra("image_res", R.drawable.ic_launcher_background);


       textViewTitle.setText(versionName);
       textViewDescription.setText(versionDescription);
       imageView.setImageResource(imageResId);
   }
}
