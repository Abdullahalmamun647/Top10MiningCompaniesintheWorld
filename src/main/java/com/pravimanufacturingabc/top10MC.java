package com.pravimanufacturingabc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class top10MC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("Top 10 Mining Companies");
        setContentView(R.layout.activity_top10_mc);
    }

    public void bt1(View view) {
        startActivity(new Intent(top10MC.this,mc1.class));
    }

    public void bt2(View view) {
        startActivity(new Intent(top10MC.this,mc2.class));
    }

    public void bt3(View view) {
        startActivity(new Intent(top10MC.this,mc3.class));
    }

    public void bt4(View view) {
        startActivity(new Intent(top10MC.this,mc4.class));
    }

    public void bt5(View view) {
        startActivity(new Intent(top10MC.this,mc5.class));
    }

    public void bt6(View view) {
        startActivity(new Intent(top10MC.this,mc6.class));
    }

    public void bt7(View view) {
        startActivity(new Intent(top10MC.this,mc7.class));
    }

    public void bt8(View view) {
        startActivity(new Intent(top10MC.this,mc8.class));
    }

    public void bt9(View view) {
        startActivity(new Intent(top10MC.this,mc9.class));
    }

    public void bt10(View view) {
        startActivity(new Intent(top10MC.this,mc10.class));
    }
}
