package com.example.matbook.ca1;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options, menu);
        return(super.onCreateOptionsMenu(menu)); }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) { case R.id.about:
            Intent aboutIntent = new Intent(MainActivity.this, About.class);
            startActivity(aboutIntent);
            return(true);

            case R.id.help:
            Intent helpIntent = new Intent(MainActivity.this, Help.class);
            startActivity(helpIntent);
            return(true);


        }
        return(super.onOptionsItemSelected(item)); }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void gameLaunchActivity(View v){
        Intent game = new Intent(MainActivity.this, GameLaunchActivity.class);
        startActivity(game);
    }
}

