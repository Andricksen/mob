package com.example.andrick.mob;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activation extends AppCompatActivity {
    TextView min;
    TextView mega;
    TextView sms;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activation);

        min=(TextView)findViewById(R.id.minute_min);
        mega=(TextView)findViewById(R.id.mega_mega);
        sms=(TextView)findViewById(R.id.sms_sms);

        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Activation.this,activation_tabs.class);
                intent.putExtra("action",2);
                startActivity(intent);


            }
        });

    }
}
