package com.example.applicationform;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
EditText uname, pwd, cpwd, phno, email;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
}
public static boolean isValidEmailAddress(String mail) {
String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.[a-
z]+";
return mail.matches(emailPattern);
}
public void verify_reg(View view) {
uname = (EditText)findViewById(R.id.editText);
pwd = (EditText)findViewById(R.id.editText2);
cpwd = (EditText)findViewById(R.id.editText3);
phno = (EditText)findViewById(R.id.editText4);
email = (EditText)findViewById(R.id.editText5);
if(uname.getText().toString().isEmpty() ||
pwd.getText().toString().isEmpty() ||
cpwd.getText().toString().isEmpty() ||
phno.getText().toString().isEmpty() ||
email.getText().toString().isEmpty()) {
Toast.makeText(this,"Please Enter all the
details...", Toast.LENGTH_LONG).show();
}
else if(pwd.getText().toString().length()<=8) {
Toast.makeText(this,"Password should be more than
8 characters...",Toast.LENGTH_LONG).show();
}
else
if(!pwd.getText().toString().equals(cpwd.getText().toString())
) { Toast.makeText(this,"Passwords do not
match..!!",Toast.LENGTH_LONG).show();
}
else if(phno.getText().toString().length() < 10) {
Toast.makeText(this,"Invalid Mobile
Number..!!",Toast.LENGTH_LONG).show();
}
else if(!isValidEmailAddress(email.getText().toString())) {
Toast.makeText(this,"Invalid Email
ID",Toast.LENGTH_LONG).show();
}
else {
Intent obj = new Intent(this,secondactivity.class);
obj.putExtra("Uname",uname.getText().toString());
obj.putExtra("Pwd", pwd.getText().toString());
obj.putExtra("Mobile", phno.getText().toString());
obj.putExtra("Email", email.getText().toString());
startActivity(obj);
}
}
}
