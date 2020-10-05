package com.app.gohigh;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FlightAdmin extends AppCompatActivity implements View.OnClickListener{

    Button b;
    private Button add;
    //private Button delete;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flight_admin);

        b=findViewById(R.id.ad);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FlightAdmin.this,Admin.class);
                startActivity(intent);
            }
        });

        add = findViewById(R.id.add_flight);
        //delete = findViewById(R.id.delete_ticket);

        add.setOnClickListener(this);
        //delete.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.add_flight)
        {
            Intent intent = new Intent(FlightAdmin.this,Addflight.class);
            startActivity(intent);
        }
        /*else if(v.getId() == R.id.delete_ticket)
        {
            Intent intent = new Intent(Flight_Management_Admin.this,Delete_Flight.class);
            startActivity(intent);
        }*/

    }
}
