package com.my.ramseetha;

import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.content.ClipboardManager;
import android.graphics.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.text.*;


public class PlayersActivity extends Activity {

	private LinearLayout linear4;
	private LinearLayout linear15;
	private TextView textview1;
	private LinearLayout linear14;
	private LinearLayout linear16;
	private Button button3;
	private Button button4;
	private Button button5;

	private double sound = 0;
	private double sid = 0;


	private Intent screen = new Intent();
	private SoundPool sp;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.players);
		initialize();
		initializeLogic();
	}

	private void  initialize() {
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear15 = (LinearLayout) findViewById(R.id.linear15);
		textview1 = (TextView) findViewById(R.id.textview1);
		linear14 = (LinearLayout) findViewById(R.id.linear14);
		linear16 = (LinearLayout) findViewById(R.id.linear16);
		button3 = (Button) findViewById(R.id.button3);
		button4 = (Button) findViewById(R.id.button4);
		button5 = (Button) findViewById(R.id.button5);




		button3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) { 
				screen.setAction(Intent.ACTION_VIEW);
				screen.setClass(getApplicationContext(), Playernames3Activity.class);
				startActivity(screen);
				sound = sp.play((int)(sid), 1.0f, 1.0f, 1, (int)(0), 1.0f);
				finish();
			}
		});
		button4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) { 
				screen.setAction(Intent.ACTION_VIEW);
				screen.setClass(getApplicationContext(), Playernames4Activity.class);
				startActivity(screen);
				sound = sp.play((int)(sid), 1.0f, 1.0f, 1, (int)(0), 1.0f);
				finish();
			}
		});
		button5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) { 
				screen.setAction(Intent.ACTION_VIEW);
				screen.setClass(getApplicationContext(), Playernames5Activity.class);
				startActivity(screen);
				sound = sp.play((int)(sid), 1.0f, 1.0f, 1, (int)(0), 1.0f);
				finish();
			}
		});

	}

	private void  initializeLogic() {
		sp = new SoundPool((int)(1), AudioManager.STREAM_MUSIC, 0);
		sid = sp.load(getApplicationContext(), R.raw.click, 1);
	}

	@Override
	public void onBackPressed() {
				screen.setAction(Intent.ACTION_VIEW);
				screen.setClass(getApplicationContext(), MainActivity.class);
				startActivity(screen);
				finish();
	}





	// created automatically
	private void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}

	private int getLocationX(View _v) {
		 int _location[] = new int[2];
		 _v.getLocationInWindow(_location);
		 return _location[0];
	}

	private int getLocationY(View _v) {
		 int _location[] = new int[2];
		 _v.getLocationInWindow(_location);
		 return _location[1];
	}

	private int getRandom(int _minValue ,int _maxValue){
		Random random = new Random();
		return random.nextInt(_maxValue - _minValue + 1) + _minValue;
	}

	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
				_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}

	private float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}

	private int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}

	private int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}


}
