package com.example.contentprovider;
import android.Manifest;
import android.app.ListActivity;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.CursorAdapter;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.loader.content.CursorLoader;
public class MainActivity extends ListActivity {
final private int REQUEST_READ_CONTACTS = 123;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
if (ContextCompat.checkSelfPermission(this,
Manifest.permission.READ_CONTACTS) !=
PackageManager.PERMISSION_GRANTED) {
ActivityCompat.requestPermissions(this, new
String[]{Manifest.permission.READ_CONTACTS},
REQUEST_READ_CONTACTS);
} else {
ListContacts();
}
}
@Override
public void onRequestPermissionsResult(int requestCode
, String[] permissions, int[] grantResults) {
if (requestCode == REQUEST_READ_CONTACTS) {
if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
ListContacts();
} else {
Toast.makeText(MainActivity.this
, "Permission Denied", Toast.LENGTH_SHORT).show();
}
} else {
super.onRequestPermissionsResult(requestCode
, permissions, grantResults);
}
}
protected void ListContacts(){
Uri allContacts = Uri.parse("content://contacts/people");
Cursor c;
CursorLoader cursorLoader = new CursorLoader(
this,
allContacts,
null,
null,
null,
null);
c = cursorLoader.loadInBackground();
String[] columns = new String[]{
ContactsContract.Contacts.DISPLAY_NAME,
ContactsContract.Contacts._ID};
int[] views = new int[]{R.id.contactName, R.id.contactID};
SimpleCursorAdapter adapter;
adapter = new SimpleCursorAdapter(
this, R.layout.activity_main, c, columns, views,
CursorAdapter.FLAG_REGISTER_CONTENT_OBSERVER);
this.setListAdapter(adapter);
}
}
