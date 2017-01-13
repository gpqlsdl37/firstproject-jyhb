package com.example.usr.grim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mypage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypage);

        Button b = (Button)findViewById(R.id.buttonmy);
        b.setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View view) {
                                     Intent intent = new Intent(
                                             getApplicationContext(),
                                             mydraw.class);
                                     startActivity(intent);
                                 }
                             });

        Button u = (Button)findViewById(R.id.buttonsave);
        u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        sharedraw.class);
                startActivity(intent);
            }
        });
    }
}
