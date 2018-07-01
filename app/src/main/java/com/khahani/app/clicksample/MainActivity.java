package com.khahani.app.clicksample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.use_findviewbyid_sample);

        EditText nameEditText = (EditText)findViewById(R.id.name);
        nameEditText.setText("lotfan name ra vared konid");

    }

    public void salamKon(View view){

        //1 - Karbar name ra vared mikonid
        //2 - Karbar roye button click mikonad
        //3 - Farakhani view az layout
        EditText nameEditText  = (EditText)findViewById(R.id.name);
        //4 - daryaft maghadire morede niyaz
        String name = nameEditText.getText().toString();

        // 1-1 - Farakhani view az layout
        CheckBox isFemaleChekBox = (CheckBox) findViewById(R.id.isFemale);
        // 1-2 - daryaft maghadir morede niyaz
        boolean isFemale = isFemaleChekBox.isChecked();
        // 1-3
        String mrOrMrs;
        if (isFemale){
            mrOrMrs = "Mrs";
        }else{
            mrOrMrs = "Mr";
        }
        //5 - Farakhani view az layout
        TextView message = (TextView) findViewById(R.id.message);
        //6 - Meghdardehi be layout
        message.setText("Hello " + mrOrMrs + " " + name);

    }


}
