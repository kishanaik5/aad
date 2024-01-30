package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
    getMenuInflater().inflate(R.menu.main, menu);
    return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
    if (item.getItemId() == R.id.search){
        Toast.makeText(this,"You clicked Search Icon",Toast.LENGTH_SHORT).show();
    }
    else if (item.getItemId() == R.id.favourites){
            Toast.makeText(this,"You clicked Favourites Icon",Toast.LENGTH_SHORT).show();
        }
    else if (item.getItemId() == R.id.settings){
        Toast.makeText(this,"You clicked Settings Icon",Toast.LENGTH_SHORT).show();
    }
    else if (item.getItemId() == R.id.close){
        finish();
    }
     return true;
        }
}


