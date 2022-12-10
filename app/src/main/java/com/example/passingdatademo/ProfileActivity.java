package com.example.passingdatademo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {
    TextView textView;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        textView = findViewById(R.id.textViewId);
        imageView = findViewById(R.id.imageId);
        Bundle bundle = getIntent().getExtras();

        if(bundle !=null){

            String value = bundle.getString("data");
            int res_image = bundle.getInt("image");
            textView.setText(value);
            imageView.setImageResource(res_image);
        }

    }
}