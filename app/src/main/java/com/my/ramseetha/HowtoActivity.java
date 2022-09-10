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


public class HowtoActivity extends Activity {

	private ScrollView vscroll1;
	private LinearLayout linear1;
	private LinearLayout linear2;
	private LinearLayout linear4;
	private LinearLayout linear6;
	private LinearLayout linear8;
	private LinearLayout linear10;
	private LinearLayout linear12;
	private LinearLayout linear14;
	private LinearLayout linear15;
	private LinearLayout linear3;
	private TextView textview1;
	private TextView textview2;
	private LinearLayout linear5;
	private TextView textview3;
	private TextView textview4;
	private LinearLayout linear7;
	private TextView textview5;
	private TextView textview6;
	private LinearLayout linear9;
	private TextView textview7;
	private TextView textview8;
	private LinearLayout linear11;
	private TextView textview9;
	private LinearLayout linear18;
	private TextView textview17;
	private TextView textview18;
	private TextView textview20;
	private TextView textview19;
	private LinearLayout linear13;
	private TextView textview11;
	private TextView textview12;
	private LinearLayout linear16;
	private TextView textview13;
	private TextView textview14;
	private LinearLayout linear17;
	private TextView textview15;
	private TextView textview16;



	private Timer _timer = new Timer();
	private Intent screen = new Intent();
	private ObjectAnimator oa = new ObjectAnimator();
	private TimerTask t;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.howto);
		initialize();
		initializeLogic();
	}

	private void  initialize() {
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		linear14 = (LinearLayout) findViewById(R.id.linear14);
		linear15 = (LinearLayout) findViewById(R.id.linear15);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		textview1 = (TextView) findViewById(R.id.textview1);
		textview2 = (TextView) findViewById(R.id.textview2);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		textview3 = (TextView) findViewById(R.id.textview3);
		textview4 = (TextView) findViewById(R.id.textview4);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		textview5 = (TextView) findViewById(R.id.textview5);
		textview6 = (TextView) findViewById(R.id.textview6);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		textview7 = (TextView) findViewById(R.id.textview7);
		textview8 = (TextView) findViewById(R.id.textview8);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		textview9 = (TextView) findViewById(R.id.textview9);
		linear18 = (LinearLayout) findViewById(R.id.linear18);
		textview17 = (TextView) findViewById(R.id.textview17);
		textview18 = (TextView) findViewById(R.id.textview18);
		textview20 = (TextView) findViewById(R.id.textview20);
		textview19 = (TextView) findViewById(R.id.textview19);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		textview11 = (TextView) findViewById(R.id.textview11);
		textview12 = (TextView) findViewById(R.id.textview12);
		linear16 = (LinearLayout) findViewById(R.id.linear16);
		textview13 = (TextView) findViewById(R.id.textview13);
		textview14 = (TextView) findViewById(R.id.textview14);
		linear17 = (LinearLayout) findViewById(R.id.linear17);
		textview15 = (TextView) findViewById(R.id.textview15);
		textview16 = (TextView) findViewById(R.id.textview16);






	}

	private void  initializeLogic() {
		linear2.setAlpha((float)(0));
		linear4.setAlpha((float)(0));
		linear6.setAlpha((float)(0));
		linear8.setAlpha((float)(0));
		linear10.setAlpha((float)(0));
		linear12.setAlpha((float)(0));
		linear14.setAlpha((float)(0));
		linear15.setAlpha((float)(0));
		setTitle("                       RAAM-SITA");
		t = new TimerTask() {
					@Override
						public void run() {
							runOnUiThread(new Runnable() {
							@Override
								public void run() {
										oa.setTarget(linear2);
								oa.setPropertyName("alpha");
								oa.setFloatValues((float)(0), (float)(1));
								oa.setDuration((int)(500));
								oa.start();
								}
							});
						}
					};
					_timer.schedule(t, (int)(0));
		t = new TimerTask() {
					@Override
						public void run() {
							runOnUiThread(new Runnable() {
							@Override
								public void run() {
										oa.setTarget(linear4);
								oa.setPropertyName("alpha");
								oa.setFloatValues((float)(0), (float)(1));
								oa.setDuration((int)(500));
								oa.start();
								}
							});
						}
					};
					_timer.schedule(t, (int)(500));
		t = new TimerTask() {
					@Override
						public void run() {
							runOnUiThread(new Runnable() {
							@Override
								public void run() {
										oa.setTarget(linear6);
								oa.setPropertyName("alpha");
								oa.setFloatValues((float)(0), (float)(1));
								oa.setDuration((int)(500));
								oa.start();
								}
							});
						}
					};
					_timer.schedule(t, (int)(1000));
		t = new TimerTask() {
					@Override
						public void run() {
							runOnUiThread(new Runnable() {
							@Override
								public void run() {
										oa.setTarget(linear8);
								oa.setPropertyName("alpha");
								oa.setFloatValues((float)(0), (float)(1));
								oa.setDuration((int)(500));
								oa.start();
								}
							});
						}
					};
					_timer.schedule(t, (int)(1500));
		t = new TimerTask() {
					@Override
						public void run() {
							runOnUiThread(new Runnable() {
							@Override
								public void run() {
										oa.setTarget(linear10);
								oa.setPropertyName("alpha");
								oa.setFloatValues((float)(0), (float)(1));
								oa.setDuration((int)(500));
								oa.start();
								}
							});
						}
					};
					_timer.schedule(t, (int)(2000));
		t = new TimerTask() {
					@Override
						public void run() {
							runOnUiThread(new Runnable() {
							@Override
								public void run() {
										oa.setTarget(linear12);
								oa.setPropertyName("alpha");
								oa.setFloatValues((float)(0), (float)(1));
								oa.setDuration((int)(500));
								oa.start();
								}
							});
						}
					};
					_timer.schedule(t, (int)(2500));
		t = new TimerTask() {
					@Override
						public void run() {
							runOnUiThread(new Runnable() {
							@Override
								public void run() {
										oa.setTarget(linear14);
								oa.setPropertyName("alpha");
								oa.setFloatValues((float)(0), (float)(1));
								oa.setDuration((int)(500));
								oa.start();
								}
							});
						}
					};
					_timer.schedule(t, (int)(3000));
		t = new TimerTask() {
					@Override
						public void run() {
							runOnUiThread(new Runnable() {
							@Override
								public void run() {
										oa.setTarget(linear15);
								oa.setPropertyName("alpha");
								oa.setFloatValues((float)(0), (float)(1));
								oa.setDuration((int)(500));
								oa.start();
								}
							});
						}
					};
					_timer.schedule(t, (int)(3500));
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
