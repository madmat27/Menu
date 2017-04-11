/**
 * Created by Madmat27
 */

package com.example.android.menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        // Find first menu item TextView and print the text to the logs
        TextView viewMenu1 = (TextView) findViewById(R.id.menu_item_1);
        String txtMenu1 = viewMenu1.getText().toString();
        Log.v("MainActivity", txtMenu1);

        // Find second menu item TextView and print the text to the logs
        TextView viewMenu2 = (TextView) findViewById(R.id.menu_item_2);
        String txtMenu2 = viewMenu2.getText().toString();
        Log.v("MainActivity", txtMenu2);

        // Find third menu item TextView and print the text to the logs
        TextView viewMenu3 = (TextView) findViewById(R.id.menu_item_3);
        String txtMenu3 = viewMenu3.getText().toString();
        Log.v("MainActivity", txtMenu3);
    }
}