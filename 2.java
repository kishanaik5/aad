package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
String tag = "Life Cycle";
EditText txt;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
Log.d(tag, "In onCreate() function");
}
public void display(View view)
{
String name;
txt = (EditText)findViewById(R.id.editText);
name = txt.getText().toString();
String str="Good Afternoon : " + name;
Toast.makeText(getApplicationContext(), str,
Toast.LENGTH_LONG).show();
}
public void onStart()
{
super.onStart();
Log.d(tag, "In onStart() function");
}
public void onResume()
{
super.onResume();
Log.d(tag, "In onResume() function");
}
public void onPause(){
super.onPause();
Log.d(tag, "In onPause() function");
}
public void onRestart()
{
super.onRestart();
Log.d(tag, "In onRestart() function");
}
public void onDestroy() {
super.onDestroy();
Log.d(tag, "In onDestroy() function");
}
public void onSubmit(View view) {
}
}
