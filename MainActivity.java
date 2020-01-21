package com.hudri.tugasjavaii;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;
import android.app.AlertDialog;
import android.content.DialogInterface;


public class MainActivity extends Activity {
Button pindah1,exit;

public void onBackPressed() {		
	   exit();
	 }
private void exit() {
	  AlertDialog.Builder builder = new AlertDialog.Builder(this);
	  builder.setMessage("Anda Yakin Akan Keluar?")
	  .setCancelable(false)
	  .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
	   public void onClick(DialogInterface dialog, int id) {
	    finish();
	   }
	  })

	  .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
	   public void onClick(DialogInterface dialog, int id) {
	    dialog.cancel();
	   }
	  }).show();
	 
	 }
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		 pindah1 = (Button) findViewById(R.id.button1);
		 pindah1.setOnClickListener(new View.OnClickListener() {
			 @Override
             public void onClick(View arg0) {
				 Intent intentpindah = new Intent(MainActivity.this, next.class);
                 startActivity(intentpindah);
             }
     });
}
}
