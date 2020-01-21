package com.hudri.tugasjavaii;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;


public class next extends Activity {
	 EditText one,two,hasil;
	    Button tambah,kurang,kali,bagi;
	    double satu,dua,hsl;
	    
@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_next);
    one=(EditText)findViewById(R.id.EditText01);
    two=(EditText)findViewById(R.id.EditText02);
    hasil=(EditText)findViewById(R.id.EditText03);
    tambah=(Button)findViewById(R.id.Button01);
    kurang=(Button)findViewById(R.id.Button02);
    kali=(Button)findViewById(R.id.Button03);
    bagi=(Button)findViewById(R.id.Button04);
}
public void Tambah(View view){
   satu=Double.parseDouble(one.getText().toString());
   dua=Double.parseDouble(two.getText().toString());
   hsl=satu+dua;
   hasil.setText(Double.toString(hsl));
}
public void Kurang(View view){
   satu=Double.parseDouble(one.getText().toString());
   dua=Double.parseDouble(two.getText().toString());
   hsl=satu-dua;
   hasil.setText(Double.toString(hsl));
}
public void Kali(View view){
   satu=Double.parseDouble(one.getText().toString());
   dua=Double.parseDouble(two.getText().toString());
   hsl=satu*dua;
   hasil.setText(Double.toString(hsl));
}
public void Bagi(View view){
   satu=Double.parseDouble(one.getText().toString());
   dua=Double.parseDouble(two.getText().toString());
   hsl=satu/dua;
   hasil.setText(Double.toString(hsl));
}
  
}
