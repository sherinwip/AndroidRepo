package com.android.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.myList);
        final ArrayList<String> myList = new ArrayList<>();
        myList.add("Sherin");
        myList.add("Bincy");
        myList.add("Ethan");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, myList);

        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(

                new AdapterView.OnItemClickListener() {

                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Log.i("Clicked",myList.get(position));
                        Toast.makeText(getApplicationContext(),myList.get(position),Toast.LENGTH_LONG).show();

                    }
                }
        );
    }
}
