package com.example.mathme;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;



public class ImageAdapter extends BaseAdapter{

	
	private Context context;
	private final String[] mobileValues;
	
	
	
	public ImageAdapter(Context context, String[] mobileValues){
		this.context = context;
		this.mobileValues = mobileValues;
	}
	

	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mobileValues.length;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(context.LAYOUT_INFLATER_SERVICE);
		
		View gridView;
		
		if(convertView == null){
			
			gridView = new View(context);
			
			gridView = inflater.inflate(R.layout.number, null);
			
			
			ImageView imageView = (ImageView) gridView.findViewById(R.id.grid_item_image);
			
			
			String mobile = mobileValues[position];
			
			if(mobile.equals("1")){
				imageView.setImageResource(R.drawable.un_icon);
			} else if (mobile.equals("2")) {
				imageView.setImageResource(R.drawable.deux_icon);
			} else if (mobile.equals("3")){
				imageView.setImageResource(R.drawable.trois_icon);
			}else if (mobile.equals("4")) {
				imageView.setImageResource(R.drawable.trois_icon);
			} else if (mobile.equals("5")) {
				imageView.setImageResource(R.drawable.trois_icon);
			} else if (mobile.equals("6")) {
				imageView.setImageResource(R.drawable.trois_icon);
			} else if (mobile.equals("7")) {
				imageView.setImageResource(R.drawable.trois_icon);
			} else if (mobile.equals("8")) {
				imageView.setImageResource(R.drawable.trois_icon);
			} else if (mobile.equals("9")) {
				imageView.setImageResource(R.drawable.trois_icon);
			} else if (mobile.equals("+")){
				imageView.setImageResource(R.drawable.un_icon);
			} else if (mobile.equals("*")){
				imageView.setImageResource(R.drawable.un_icon);
			} else if (mobile.equals("-")){
				imageView.setImageResource(R.drawable.un_icon);
			}
			
		} else {
			gridView = (View) convertView;
		}
		
		
		return gridView;
		
	}
	
	
	
}