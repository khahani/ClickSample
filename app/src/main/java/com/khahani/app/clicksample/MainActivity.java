package com.khahani.app.clicksample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
    implements View.OnClickListener{

    private View.OnClickListener ClickHandler = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Log.e("TAg", "Ravesh 4om");
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.use_findviewbyid_sample);

        EditText nameEditText = (EditText) findViewById(R.id.name);
        nameEditText.setText("lotfan name ra vared konid");

        Button clickMe = (Button) findViewById(R.id.clickme);
        Button sayHello = (Button) findViewById(R.id.sayHello);

        clickMe.setOnClickListener(this);
        sayHello.setOnClickListener(this);

        sayHello.setOnClickListener(ClickHandler);

       /* //1 Farakhani view az layout
        Button clickMe = (Button) findViewById(R.id.clickme);
        clickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        Button sayHello = (Button)findViewById(R.id.sayHello);
        sayHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //1 - Karbar name ra vared mikonid
                //2 - Karbar roye button click mikonad
                //3 - Farakhani view az layout
                EditText nameEditText = (EditText) findViewById(R.id.name);
                //4 - daryaft maghadire morede niyaz
                String name = nameEditText.getText().toString();

                // 1-1 - Farakhani view az layout
                CheckBox isFemaleChekBox = (CheckBox) findViewById(R.id.isFemale);
                // 1-2 - daryaft maghadir morede niyaz
                boolean isFemale = isFemaleChekBox.isChecked();
                // 1-3
                String mrOrMrs;
                if (isFemale) {
                    mrOrMrs = "Mrs";
                } else {
                    mrOrMrs = "Mr";
                }
                //5 - Farakhani view az layout
                TextView message = (TextView) findViewById(R.id.message);
                //6 - Meghdardehi be layout
                message.setText("Hello " + mrOrMrs + " " + name);
            }
        });*/
    }

    public void salamKon(View view) {

        //1 - Karbar name ra vared mikonid
        //2 - Karbar roye button click mikonad
        //3 - Farakhani view az layout
        EditText nameEditText = (EditText) findViewById(R.id.name);
        //4 - daryaft maghadire morede niyaz
        String name = nameEditText.getText().toString();

        // 1-1 - Farakhani view az layout
        CheckBox isFemaleChekBox = (CheckBox) findViewById(R.id.isFemale);
        // 1-2 - daryaft maghadir morede niyaz
        boolean isFemale = isFemaleChekBox.isChecked();
        // 1-3
        String mrOrMrs;
        if (isFemale) {
            mrOrMrs = "Mrs";
        } else {
            mrOrMrs = "Mr";
        }
        //5 - Farakhani view az layout
        TextView message = (TextView) findViewById(R.id.message);
        //6 - Meghdardehi be layout
        message.setText("Hello " + mrOrMrs + " " + name);

    }


    @Override
    public void onClick(View view) {

        int id = view.getId();

        switch (id){
            case R.id.sayHello:{
                //1 - Karbar name ra vared mikonid
                //2 - Karbar roye button click mikonad
                //3 - Farakhani view az layout
                EditText nameEditText = (EditText) findViewById(R.id.name);
                //4 - daryaft maghadire morede niyaz
                String name = nameEditText.getText().toString();

                // 1-1 - Farakhani view az layout
                CheckBox isFemaleChekBox = (CheckBox) findViewById(R.id.isFemale);
                // 1-2 - daryaft maghadir morede niyaz
                boolean isFemale = isFemaleChekBox.isChecked();
                // 1-3
                String mrOrMrs;
                if (isFemale) {
                    mrOrMrs = "Mrs";
                } else {
                    mrOrMrs = "Mr";
                }
                //5 - Farakhani view az layout
                TextView message = (TextView) findViewById(R.id.message);
                //6 - Meghdardehi be layout
                message.setText("Hello " + mrOrMrs + " " + name);
                break;
            }
            case R.id.clickme: {
                Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show();

                break;
            }
        }

    }
}
