package com.example.diksha.mya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Profile extends AppCompatActivity {

    public EditText name,roll;
    public String Name,Roll;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        name= findViewById(R.id.editText);
        roll= findViewById(R.id.editText2);
        b1= findViewById(R.id.button6);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Name=name.getText().toString();
                Roll=roll.getText().toString();
                Intent intent=new Intent(getApplicationContext(),Home.class);
                intent.putExtra("NAME",Name);
                intent.putExtra("ROLL",Roll);
                startActivity(intent);

            }
        });
    }
}
