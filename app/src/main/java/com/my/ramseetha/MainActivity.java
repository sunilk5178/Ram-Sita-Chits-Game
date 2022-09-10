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


public class MainActivity extends Activity {

	private LinearLayout linear1;
	private LinearLayout linear7;
	private LinearLayout linear5;
	private LinearLayout linear3;
	private LinearLayout linear6;
	private TextView textview2;
	private TextView textview4;
	private LinearLayout linear4;
	private Button button1;
	private Button button2;

	private double sound = 0;
	private double sid = 0;


	private Timer _timer = new Timer();
	private ObjectAnimator anim = new ObjectAnimator();
	private ObjectAnimator oa = new ObjectAnimator();
	private Intent screen = new Intent();
	private AlertDialog.Builder dia;
	private TimerTask t;
	private SoundPool click;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		initialize();
		initializeLogic();
	}

	private void  initialize() {
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		textview2 = (TextView) findViewById(R.id.textview2);
		textview4 = (TextView) findViewById(R.id.textview4);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		button1 = (Button) findViewById(R.id.button1);
		button2 = (Button) findViewById(R.id.button2);




		dia = new AlertDialog.Builder(this);



		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) { 
				screen.setAction(Intent.ACTION_VIEW);
				screen.setClass(getApplicationContext(), PlayersActivity.class);
				startActivity(screen);
				sound = click.play((int)(sid), 1.0f, 1.0f, 1, (int)(0), 1.0f);
				finish();
			}
		});
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) { 
				screen.setAction(Intent.ACTION_VIEW);
				screen.setClass(getApplicationContext(), HowtoActivity.class);
				startActivity(screen);
				sound = click.play((int)(sid), 1.0f, 1.0f, 1, (int)(0), 1.0f);
				finish();
			}
		});

	}

	private void  initializeLogic() {
		showMessage("Hi friend");
		textview2.setAlpha((float)(0));
		textview4.setAlpha((float)(0));
		button1.setAlpha((float)(0));
		button2.setAlpha((float)(0));
		setTitle("                       RAM-SITA");
		click = new SoundPool((int)(1), AudioManager.STREAM_MUSIC, 0);
		sid = click.load(getApplicationContext(), R.raw.click, 1);
	}

	@Override
	public void onBackPressed() {
				dia.setTitle("DO YOU WANT TO EXIT");
				dia.setMessage(" ");
				dia.setPositiveButton("YES", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
											finish();
					}
				});
				dia.setNegativeButton("NO", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
				
					}
				});
				dia.create().show();
	}
	@Override
	public void onDestroy() {
		super.onDestroy();

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
