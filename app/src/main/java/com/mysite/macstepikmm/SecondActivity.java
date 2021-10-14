package com.mysite.macstepikmm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
	
	Button button;
	
	@Override
	protected void onCreate( Bundle savedInstanceState ) {
		super.onCreate( savedInstanceState );
		setContentView( R.layout.activity_second );
		
		button = (Button ) findViewById( R.id.buttonBack );
		
		button.setOnClickListener( view -> {
			
			Intent intent = new Intent( SecondActivity.this, MainActivity.class );
			startActivity( intent );
			finish();
			
		} );
		
	}
}