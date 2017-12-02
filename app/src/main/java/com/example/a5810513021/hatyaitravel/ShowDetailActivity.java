package com.example.a5810513021.hatyaitravel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowDetailActivity extends AppCompatActivity {

    private ImageView image;
    private TextView tvName;
    private TextView tvDetail;
    private TextView tvLocation;
    private TextView tvFacebook;
    private TextView tvTelnum;
    private TextView tvTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_detail);

        image = (ImageView) findViewById(R.id.image);
        tvName = (TextView) findViewById(R.id.tvName);
        tvDetail = (TextView) findViewById(R.id.tvDetail);
        tvLocation = (TextView) findViewById(R.id.tvLocation);
        tvFacebook = (TextView) findViewById(R.id.tvFacebook) ;
        tvTelnum = (TextView) findViewById(R.id.tvTelnum);
        tvTime = (TextView) findViewById(R.id.tvTime);

        int resId =  getIntent().getIntExtra("image",0);
        String name = getIntent().getStringExtra("name");
        String detail = getIntent().getStringExtra("detail");
        String location = getIntent().getStringExtra("location");
        String facebook = getIntent().getStringExtra("facebook");
        String telnum = getIntent().getStringExtra("telnum");
        String time = getIntent().getStringExtra("time");

        image.setImageResource(resId);
        tvName.setText(name);
        tvDetail.setText(detail);
        tvLocation.setText(location);
        tvFacebook.setText(facebook);
        tvTelnum.setText(telnum);
        tvTime.setText(time);


    }
}
