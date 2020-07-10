package com.example.diksha.mya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.jar.Attributes;

public class Home extends AppCompatActivity {

    public TextView name1,roll1;
    public String Name,Roll;

    public void toscan(View view)
    {
        roll1=findViewById(R.id.t2roll_no);
        name1=findViewById(R.id.t1user_name);
        Name=name1.getText().toString();
        Roll=roll1.getText().toString();
        Intent intent2=new Intent(getApplicationContext(),Qr_scanning.class);
        intent2.putExtra("NAME",Name);
        intent2.putExtra("ROLL",Roll);
        startActivity(intent2);
    }
    public void tohelp(View view)
    {
        Intent intent=new Intent(getApplicationContext(),Help.class);
        startActivity(intent);
    }

    public void toqrgenerate(View view)
    {
        Intent intent=new Intent(getApplicationContext(),Qr_generate.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        name1= findViewById(R.id.t1user_name);
        roll1= findViewById(R.id.t2roll_no);
        name1.setText(""+getIntent().getStringExtra("NAME"));
        roll1.setText(""+getIntent().getStringExtra("ROLL"));


    }
}
