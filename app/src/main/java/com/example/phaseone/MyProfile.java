package com.example.phaseone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class MyProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);

        //ImageView imageView = findViewById(R.drawable);


        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mToolbar.setTitle(getString(R.string.my_profile));
         mToolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);

        mToolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        TextView name = findViewById(R.id.name);
        TextView track = findViewById(R.id.track);
        TextView phone = findViewById(R.id.phone);
        TextView email = findViewById(R.id.email);
        TextView country = findViewById(R.id.country);
        TextView slackid = findViewById(R.id.slack_id);

        name.setText(getString(R.string.name));
        track.setText(getString(R.string.android));
        phone.setText(getString(R.string.phone_number));
        email.setText(getString(R.string.email_text));
        country.setText(getString(R.string.nigeria));
        slackid.setText(getString(R.string.slack_id));



        String imageUri = "https://res.cloudinary.com/semiu/image/upload/v1554309699/mypix.png";

        ImageView imageView = (ImageView) findViewById(R.id.image);
        Picasso.with(this).load(imageUri).fit().centerCrop()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)
                .into(imageView);
    }
}
