package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

public class UserDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_detail);
        EditText nameEt = findViewById(R.id.nameEt);
        EditText unameEt = findViewById(R.id.unameEt);
        EditText emailEt = findViewById(R.id.emailEt);
        ImageView imageViewDetail = findViewById(R.id.imageViewDetail);
        nameEt.setText(getIntent().getStringExtra("name"));
        unameEt.setText(getIntent().getStringExtra("username"));
        emailEt.setText(getIntent().getStringExtra("email"));
        imageViewDetail.setImageBitmap(ImageUtil.convert(getIntent().getStringExtra("image")));
    }
}
