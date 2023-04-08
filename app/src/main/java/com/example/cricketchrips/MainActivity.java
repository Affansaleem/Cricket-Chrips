package com.example.cricketchrips;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    TextView textView1,res;
    EditText etn;
    Button btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.toolbar_title_layout);
        setContentView(R.layout.activity_main);
        init();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String id = etn.getText().toString().trim();
                if(id.length() < 2)
                {
                    res.setText("");
                    Toast.makeText(MainActivity.this, "Enter number of chrips", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    int temp=Integer.parseInt(id.substring(0));

                    int result=(temp/3)+4;
//                    String dob = id.substring(0,6);
//                    String year = "20"+dob.substring(0,2);
//                    String month = dob.substring(2,4);
//                    int m  = Integer.parseInt(month);
//                    String months[] = {"", "January", "Feb", "March",
//                            "April", "May", "June", "July", "Aug", "Sept", "Oct"
//                            ,"Nov", "Dec"};

//                    String day = dob.substring(4,6);
//
//                    String dateOfBirth = day+"/"+months[m]+"/"+year;
//                    String gender;
//                    int gen = Integer.parseInt(id.substring(6,10));
//                    if(gen<5000)
//                    {
//                        gender = "Female";
//                    }
//                    else
//                    {
//                        gender = "Male";
//                    }

//                    String citizenShip;
//                    if(id.charAt(10)=='0')
//                    {
//                        citizenShip = "SA Citizen";
//                    }
//                    else if(id.charAt(10)=='1')
//                    {
//                        citizenShip = "Permanent Resident";
//                    }
//                    else
//                    {
//                        citizenShip = "Invalid Digit";
//                    }

//                    String validity;
//
//                    if(id.charAt(12) == '0')
//                    {
//                        validity = "Invalid";
//                    }
//                    else
//                    {
//                        validity = "Valid";
//                    }

                    String text = "The appropriate temperature outside is: "+ result +" degree celcius"+"\n";

                        res.setText(text);



                }

            }
        });




    }
    public void init()
    {
        etn= findViewById(R.id.etn);
        btn = findViewById(R.id.btn);
        textView1=findViewById(R.id.textView1);
        res=findViewById(R.id.res);

    }

}