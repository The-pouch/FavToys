package com.inonidakii.favtoys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

//    TO-DO (1) Declare a TextView variable  called eToysListTextView
    TextView eToysTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        TO-DO (3) Use findViewById to get a reference to the TextView from the layout
        eToysTextView = findViewById(R.id.tv_toy_names);

//        TO-DO (4) Use the static ToyBox.getToyNames method and store the names in a String array
        String [] toyNames = ToyBox.getToyNames();

//        TO-DO (5) Loop through each toy and append the name to the TextView (add \n for spacing)
        for (String toyName:toyNames) {
            eToysTextView.append(toyName + "\n");
        }
    }
}