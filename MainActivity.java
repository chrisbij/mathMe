package com.example.mathme;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class MainActivity extends Activity {

	
	GridView gridView;
	
	static final String[] numbers = new String[]{
		"1","2","3","4","5","6","7","8","9"
		};
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		
		setContentView(R.layout.activity_main);
		
		gridView = (GridView) findViewById(R.id.gridView1);
		
		gridView.setAdapter(new ImageAdapter(this, numbers));
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
