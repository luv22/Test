package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    String langg="null";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView firstName = findViewById(R.id.fistname);
        TextView  lastName = findViewById(R.id.lastName);
        Spinner spinner = findViewById(R.id.dropdown);
        Button button = findViewById(R.id.capture);
        HashMap<String,String>map = new HashMap<>();
        ArrayList<String> adapter = new ArrayList<>();
        
        adapter.add(new Data("1","java").getValue());
        map.put("java","1");
        adapter.add(new Data("2","kotlin").getValue());
        map.put("kotlin","2");

        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,adapter);
        spinner.setAdapter(spinnerAdapter);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("name",firstName.getText().toString());
                intent.putExtra("lastname",lastName.getText().toString());
                intent.putExtra("lang",map.get(spinner.getSelectedItem()));
                startActivity(intent);

            }
        });

    }

}

class Data{
    String key;
    String value;

    public Data(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
