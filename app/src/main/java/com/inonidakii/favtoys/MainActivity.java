package com.inonidakii.favtoys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView eToysTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eToysTextView = findViewById(R.id.tv_toy_names);

        String [] toyNames = ToyBox.getToyNames();

        for (String toyName:toyNames) {
            eToysTextView.append(toyName + "\n");
        }
    }
}