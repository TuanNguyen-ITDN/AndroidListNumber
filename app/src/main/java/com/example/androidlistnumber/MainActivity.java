package com.example.androidlistnumber;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerViewNumber;
    int[] numbers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewNumber = findViewById(R.id.recyclerview_id);
        recyclerViewNumber.setLayoutManager(new LinearLayoutManager((this)));

        final NumberAdapter numberAdapter = new NumberAdapter();
        recyclerViewNumber.setAdapter(numberAdapter);

        numbers = new int[100];

        int i = 0;
        do {
            numbers[i] = i + 1;
            i += 1;
        } while (i < 100);
        numberAdapter.numbers = numbers;


    }
}
