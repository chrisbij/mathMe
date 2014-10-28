package com.example.mathme;

import com.example.controler.*;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	Button button1;
	Button button2;
	Button button3;
	Button button4;
	Button button5;
	Button button6;
	Button button7;
	Button button8;
	Button button9;
	
	Button valider;
	
	TextView number1;
	
	Control control;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		
		setContentView(R.layout.activity_main);
		
		number1 = (TextView)findViewById(R.id.textView1);
		button1 = (Button)findViewById(R.id.button1);
		button2 = (Button)findViewById(R.id.button2);
		button3 = (Button)findViewById(R.id.button3);
		button4 = (Button)findViewById(R.id.button4);
		button5 = (Button)findViewById(R.id.button5);
		button6 = (Button)findViewById(R.id.button6);
		button7 = (Button)findViewById(R.id.button7);
		button8 = (Button)findViewById(R.id.button8);
		button9 = (Button)findViewById(R.id.button9);
		
		button1.setOnClickListener(click);
		button2.setOnClickListener(click);
		button3.setOnClickListener(click);
		button4.setOnClickListener(click);
		button5.setOnClickListener(click);
		button6.setOnClickListener(click);
		button7.setOnClickListener(click);
		button8.setOnClickListener(click);
		button9.setOnClickListener(click);
		
	}
	
	
	public android.view.View.OnClickListener click = new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
			/*control.textViewVide(number1);*/
			
			number1.setText("");
			Button b = (Button)v;
			number1.setText(b.getText().toString());
		}
	};
	
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
