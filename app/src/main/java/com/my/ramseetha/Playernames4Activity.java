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


public class Playernames4Activity extends Activity {

	private LinearLayout linear1;
	private TextView textview1;
	private LinearLayout linear2;
	private EditText edittext1;
	private EditText edittext2;
	private EditText edittext4;
	private EditText edittext3;
	private LinearLayout linear3;
	private Button button1;
	private Button button2;

	private double sound = 0;
	private double sid = 0;


	private Intent x = new Intent();
	private SharedPreferences b;
	private SoundPool sp1;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.playernames4);
		initialize();
		initializeLogic();
	}

	private void  initialize() {
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		textview1 = (TextView) findViewById(R.id.textview1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		edittext1 = (EditText) findViewById(R.id.edittext1);
		edittext2 = (EditText) findViewById(R.id.edittext2);
		edittext4 = (EditText) findViewById(R.id.edittext4);
		edittext3 = (EditText) findViewById(R.id.edittext3);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		button1 = (Button) findViewById(R.id.button1);
		button2 = (Button) findViewById(R.id.button2);


		b = getSharedPreferences("b", Activity.MODE_PRIVATE);


		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) { 
				sound = sp1.play((int)(sid), 1.0f, 1.0f, 1, (int)(0), 1.0f);
				if ((edittext1.getText().toString().length() > 0) && ((edittext2.getText().toString().length() > 0) && ((edittext3.getText().toString().length() > 0) && (edittext4.getText().toString().length() > 0)))) {
					b.edit().putString("x1", edittext1.getText().toString()).commit();
					b.edit().putString("x2", edittext2.getText().toString()).commit();
					b.edit().putString("x3", edittext3.getText().toString()).commit();
					b.edit().putString("x4", edittext4.getText().toString()).commit();
					x.setAction(Intent.ACTION_VIEW);
					x.setClass(getApplicationContext(), Game4Activity.class);
					startActivity(x);
				}
				else {
					showMessage("plese enter all the names");
				}
			}
		});
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) { 
				b.edit().putString("x1", "player1").commit();
				b.edit().putString("x2", "player2").commit();
				b.edit().putString("x3", "player4").commit();
				b.edit().putString("x4", "player3").commit();
				x.setAction(Intent.ACTION_VIEW);
				x.setClass(getApplicationContext(), Game4Activity.class);
				startActivity(x);
				sound = sp1.play((int)(sid), 1.0f, 1.0f, 1, (int)(0), 1.0f);
				finish();
			}
		});

	}

	private void  initializeLogic() {
		sp1 = new SoundPool((int)(1), AudioManager.STREAM_MUSIC, 0);
		sid = sp1.load(getApplicationContext(), R.raw.click, 1);
	}

	@Override
	public void onBackPressed() {
				x.setAction(Intent.ACTION_VIEW);
				x.setClass(getApplicationContext(), PlayersActivity.class);
				startActivity(x);
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
