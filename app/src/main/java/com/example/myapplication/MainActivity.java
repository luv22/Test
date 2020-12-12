package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

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
        ArrayList<String> adapter = new ArrayList<>();
        adapter.add("Java");
        adapter.add("Kotline");
        adapter.add("C#");
        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,adapter);
        spinner.setAdapter(spinnerAdapter);
        Intent intent = new Intent(this,MainActivity2.class);
        intent.putExtra("name",firstName.getText().toString());
        intent.putExtra("lastname",lastName.getText().toString());
        intent.putExtra("lang",spinner.getSelectedItem().toString());
        startActivity(intent);

    }
}