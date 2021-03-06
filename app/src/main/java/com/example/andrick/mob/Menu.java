package com.example.andrick.mob;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.sqlite.SQLiteException;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.andrick.mob.R.id.activation;

public class Menu extends AppCompatActivity {

    private BddInterne bdd;


    public void boit_de_dialogue()
    {

        AlertDialog.Builder builder = new AlertDialog.Builder(Menu.this);
        builder.setTitle(R.string.info_titre);
        builder.setMessage(R.string.info_description);
        builder.setPositiveButton(R.string.envoyer, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

//                en_parler_a();
            }
        });
        builder.setNegativeButton(R.string.annuler, null);
        builder.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        bdd= new BddInterne(Menu.this,"",null,1);


        TextView recharg=(TextView)findViewById(R.id.recharge_m);
        TextView activ=(TextView)findViewById(activation);
        TextView verifi=(TextView)findViewById(R.id.verification);
        TextView urgen=(TextView)findViewById(R.id.urgence);
        TextView envoy=(TextView)findViewById(R.id.envoyer_men);
        TextView abou=(TextView)findViewById(R.id.abouts);
        TextView arge=(TextView)findViewById(R.id.money);

        assert recharg != null;
        recharg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent intent=new Intent(Menu.this,Recharge.class);
                    intent.putExtra("action",1);
                    startActivity(intent);


            }
        });
        assert activ != null;
        activ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent intent=new Intent(Menu.this,Activation.class);
                    intent.putExtra("action",2);
                    startActivity(intent);


            }
        });
        assert verifi != null;
        verifi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Menu.this,Verification.class);
                intent.putExtra("action",3);
                startActivity(intent);
            }
        });
        assert urgen !=null;
        urgen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Menu.this,Urgence.class);
                //intent.putExtra("action",4);
                startActivity(intent);
            }
        });
        assert envoy !=null;
        envoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent intent=new Intent(Menu.this,Envoyer.class);
                    intent.putExtra("action",4);
                    startActivity(intent);

            }
        });

        assert abou !=null;

        abou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //int i=bdd.compte_insertion();
                //Toast.makeText(Menu.this,String.valueOf(i),Toast.LENGTH_LONG).show();
            }
        });

        arge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //int i=bdd.compte_insertion();
                //Toast.makeText(Menu.this,String.valueOf(i),Toast.LENGTH_LONG).show();
                Intent intent=new Intent(Menu.this,money_actions.class);
                //intent.putExtra("action",4);
                startActivity(intent);
            }
        });




    }
}
