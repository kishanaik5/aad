package com.example.intents;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
public class MainActivity extends AppCompatActivity {
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
}
public void displayContacts(View view) {
Intent i= new Intent(Intent.ACTION_VIEW);
i.setData(Uri.parse("content://contacts/people"));
startActivity(i);
}
}
