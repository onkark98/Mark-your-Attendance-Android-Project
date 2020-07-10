package com.example.diksha.mya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.annotation.Nullable;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        Thread thread= new Thread(){
            @Override
            public void run() {
                try{
                    sleep(3000);
                }
                catch(Exception e){
                }

                finally {
                    startActivity(new Intent(getApplicationContext(),Login.class));
                }
            }
        };
        thread.start();
    }
}
