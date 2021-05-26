package com.example.sign_up;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText Firstnametxt,Lastnametxt,numbertxt,Addresstxt;

    String message,Firstname, Lastname, number, Address;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Firstnametxt = (EditText) findViewById(R.id.Firstnametxt);
        Lastnametxt = (EditText) findViewById(R.id.Lastnametxt);
        numbertxt = (EditText) findViewById(R.id.numbertxt);
        Addresstxt = (EditText) findViewById(R.id.Addrestxt);

        Firstname = Firstnametxt.getText().toString();
        Lastname = Lastnametxt.getText().toString();
        number = numbertxt.getText().toString();
        Address = Addresstxt.getText().toString();



        Button clickButton = (Button) findViewById(R.id.button);

        clickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=0;
                message = "Enter ";

                String[] array = {Firstname,Lastname,number,Address};
                for ( i=0 ;i < array.length ; i++) {
                    if (array[i].isEmpty()) {

                        message = message + array[i].toString() +", ";


                    }

                    if (i > 1) {
                        Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();

                    }
                }

            }
        });




    }
}