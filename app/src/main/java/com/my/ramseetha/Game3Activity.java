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


public class Game3Activity extends Activity {

	private LinearLayout linear1;
	private LinearLayout linear9;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout linear8;
	private LinearLayout linear4;
	private Button button13;
	private TextView textview1;
	private TextView textview2;
	private Button button14;
	private TextView textview3;
	private Button button11;
	private Button play;
	private TextView textview24;
	private LinearLayout linear5;
	private LinearLayout linear6;
	private LinearLayout linear7;
	private TextView textview4;
	private TextView textview19;
	private TextView textview6;
	private TextView textview21;
	private TextView textview8;
	private TextView textview23;

	private double sound = 0;
	private double sid = 0;
	private double sid1 = 0;
	private double sid2 = 0;
	private double p1 = 0;
	private double p2 = 0;
	private double p3 = 0;
	private double select = 0;
	private double select1 = 0;
	private double s1 = 0;
	private double s2 = 0;
	private double s3 = 0;


	private Timer _timer = new Timer();
	private Intent yes = new Intent();
	private Intent no = new Intent();
	private TimerTask t;
	private Vibrator Viber;
	private SharedPreferences p13;
	private AlertDialog.Builder dia;
	private ObjectAnimator oa1 = new ObjectAnimator();
	private ObjectAnimator oa2 = new ObjectAnimator();
	private SoundPool sp;
	private ObjectAnimator oa = new ObjectAnimator();
	private TimerTask tsb;
	private ObjectAnimator oasc = new ObjectAnimator();


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.game3);
		initialize();
		initializeLogic();
	}

	private void  initialize() {
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		button13 = (Button) findViewById(R.id.button13);
		textview1 = (TextView) findViewById(R.id.textview1);
		textview2 = (TextView) findViewById(R.id.textview2);
		button14 = (Button) findViewById(R.id.button14);
		textview3 = (TextView) findViewById(R.id.textview3);
		button11 = (Button) findViewById(R.id.button11);
		play = (Button) findViewById(R.id.play);
		textview24 = (TextView) findViewById(R.id.textview24);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		textview4 = (TextView) findViewById(R.id.textview4);
		textview19 = (TextView) findViewById(R.id.textview19);
		textview6 = (TextView) findViewById(R.id.textview6);
		textview21 = (TextView) findViewById(R.id.textview21);
		textview8 = (TextView) findViewById(R.id.textview8);
		textview23 = (TextView) findViewById(R.id.textview23);




		Viber = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
		p13 = getSharedPreferences("a", Activity.MODE_PRIVATE);
		dia = new AlertDialog.Builder(this);







		button13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) { 
				play.setEnabled(true);
				button11.setEnabled(false);
				button13.setEnabled(false);
				button14.setEnabled(false);
				if (button13.getText().toString().equals("Sita")) {
					showMessage("TRUE");
					sound = sp.play((int)(sid1), 1.0f, 1.0f, 1, (int)(0), 1.0f);
					s1 = 0;
					if (button14.getText().toString().equals("Ravan")) {
						s2 = -500;
						s3 = 1000;
					}
					else {
						s2 = 1000;
						s3 = -500;
					}
				}
				else {
					sound = sp.play((int)(sid2), 1.0f, 1.0f, 1, (int)(0), 1.0f);
					showMessage("FALSE");
					Viber.vibrate((long)(50));
					s1 = -500;
					if (button14.getText().toString().equals("Rama")) {
						s2 = 0;
						s3 = 1000;
					}
					else {
						s2 = 1000;
						s3 = 0;
					}
				}
				button13.setBackgroundColor(0xFF81D4FA);
				button14.setBackgroundColor(0xFF8C9EFF);
				button11.setBackgroundColor(0xFFFFE57F);
				p1 = p1 + s3;
				textview23.setText(String.valueOf((long)(p1)));
				p2 = p2 + s1;
				textview19.setText(String.valueOf((long)(p2)));
				p3 = p3 + s2;
				textview21.setText(String.valueOf((long)(p3)));
				if ((Double.parseDouble(textview19.getText().toString()) == 10000) || (Double.parseDouble(textview19.getText().toString()) > 10000)) {
					dia.setTitle(textview4.getText().toString().concat(" is the winner"));
					dia.setMessage("PLAY AGAIN?");
					dia.setPositiveButton("yes", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													yes.setAction(Intent.ACTION_VIEW);
								yes.setClass(getApplicationContext(), PlayersActivity.class);
								startActivity(yes);
								finish();
						}
					});
					dia.setNegativeButton("no", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													no.setAction(Intent.ACTION_VIEW);
								no.setClass(getApplicationContext(), MainActivity.class);
								startActivity(no);
								finish();
						}
					});
					dia.create().show();
				}
				if ((Double.parseDouble(textview21.getText().toString()) == 10000) || (Double.parseDouble(textview21.getText().toString()) > 10000)) {
					dia.setTitle(textview6.getText().toString().concat(" is the winner"));
					dia.setMessage("PLAY AGAIN?");
					dia.setPositiveButton("yes", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													yes.setAction(Intent.ACTION_VIEW);
								yes.setClass(getApplicationContext(), PlayersActivity.class);
								startActivity(yes);
								finish();
						}
					});
					dia.setNegativeButton("no", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													no.setAction(Intent.ACTION_VIEW);
								no.setClass(getApplicationContext(), MainActivity.class);
								startActivity(no);
								finish();
						}
					});
					dia.create().show();
				}
				if ((Double.parseDouble(textview23.getText().toString()) > 10000) || (Double.parseDouble(textview23.getText().toString()) == 10000)) {
					dia.setTitle(textview8.getText().toString().concat(" is the winner"));
					dia.setMessage("PLAY AGAIN?");
					dia.setPositiveButton("yes", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													yes.setAction(Intent.ACTION_VIEW);
								yes.setClass(getApplicationContext(), PlayersActivity.class);
								startActivity(yes);
								finish();
						}
					});
					dia.setNegativeButton("no", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													no.setAction(Intent.ACTION_VIEW);
								no.setClass(getApplicationContext(), MainActivity.class);
								startActivity(no);
								finish();
						}
					});
					dia.create().show();
				}
			}
		});
		button14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) { 
				play.setEnabled(true);
				button11.setEnabled(false);
				button13.setEnabled(false);
				button14.setEnabled(false);
				if (button14.getText().toString().equals("Sita")) {
					sound = sp.play((int)(sid1), 1.0f, 1.0f, 1, (int)(0), 1.0f);
					showMessage("TRUE");
					s2 = 0;
					if (button13.getText().toString().equals("Ravan")) {
						s1 = -500;
						s3 = 1000;
					}
					else {
						s1 = 1000;
						s3 = -500;
					}
				}
				else {
					sound = sp.play((int)(sid2), 1.0f, 1.0f, 1, (int)(0), 1.0f);
					showMessage("FALSE");
					Viber.vibrate((long)(50));
					s2 = -500;
					if (button13.getText().toString().equals("Rama")) {
						s1 = 0;
						s3 = 1000;
					}
					else {
						s1 = 1000;
						s3 = 0;
					}
				}
				button13.setBackgroundColor(0xFF81D4FA);
				button14.setBackgroundColor(0xFF8C9EFF);
				button11.setBackgroundColor(0xFFFFE57F);
				p1 = p1 + s3;
				textview23.setText(String.valueOf((long)(p1)));
				p2 = p2 + s1;
				textview19.setText(String.valueOf((long)(p2)));
				p3 = p3 + s2;
				textview21.setText(String.valueOf((long)(p3)));
				if ((Double.parseDouble(textview19.getText().toString()) == 10000) || (Double.parseDouble(textview19.getText().toString()) > 10000)) {
					dia.setTitle(textview4.getText().toString().concat(" is the winner"));
					dia.setMessage("PLAY AGAIN?");
					dia.setPositiveButton("yes", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													yes.setAction(Intent.ACTION_VIEW);
								yes.setClass(getApplicationContext(), PlayersActivity.class);
								startActivity(yes);
								finish();
						}
					});
					dia.setNegativeButton("no", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													no.setAction(Intent.ACTION_VIEW);
								no.setClass(getApplicationContext(), MainActivity.class);
								startActivity(no);
								finish();
						}
					});
					dia.create().show();
				}
				if ((Double.parseDouble(textview21.getText().toString()) == 10000) || (Double.parseDouble(textview21.getText().toString()) > 10000)) {
					dia.setTitle(textview6.getText().toString().concat(" is the winner"));
					dia.setMessage("PLAY AGAIN?");
					dia.setPositiveButton("yes", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													yes.setAction(Intent.ACTION_VIEW);
								yes.setClass(getApplicationContext(), PlayersActivity.class);
								startActivity(yes);
								finish();
						}
					});
					dia.setNegativeButton("no", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													no.setAction(Intent.ACTION_VIEW);
								no.setClass(getApplicationContext(), MainActivity.class);
								startActivity(no);
								finish();
						}
					});
					dia.create().show();
				}
				if ((Double.parseDouble(textview23.getText().toString()) > 10000) || (Double.parseDouble(textview23.getText().toString()) == 10000)) {
					dia.setTitle(textview8.getText().toString().concat(" is the winner"));
					dia.setMessage("PLAY AGAIN?");
					dia.setPositiveButton("yes", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													yes.setAction(Intent.ACTION_VIEW);
								yes.setClass(getApplicationContext(), PlayersActivity.class);
								startActivity(yes);
								finish();
						}
					});
					dia.setNegativeButton("no", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													no.setAction(Intent.ACTION_VIEW);
								no.setClass(getApplicationContext(), MainActivity.class);
								startActivity(no);
								finish();
						}
					});
					dia.create().show();
				}
			}
		});
		button11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) { 
				play.setEnabled(true);
				button11.setEnabled(false);
				button13.setEnabled(false);
				button14.setEnabled(false);
				if (button11.getText().toString().equals("Sita")) {
					sound = sp.play((int)(sid1), 1.0f, 1.0f, 1, (int)(0), 1.0f);
					showMessage("TRUE");
					s3 = 0;
					if (button13.getText().toString().equals("Ravan")) {
						s1 = -500;
						s2 = 1000;
					}
					else {
						s1 = 1000;
						s2 = -500;
					}
				}
				else {
					sound = sp.play((int)(sid2), 1.0f, 1.0f, 1, (int)(0), 1.0f);
					showMessage("FALSE");
					Viber.vibrate((long)(50));
					s3 = -500;
					if (button13.getText().toString().equals("Rama")) {
						s1 = 0;
						s2 = 1000;
					}
					else {
						s1 = 1000;
						s2 = 0;
					}
				}
				button13.setBackgroundColor(0xFF81D4FA);
				button14.setBackgroundColor(0xFF8C9EFF);
				button11.setBackgroundColor(0xFFFFE57F);
				p1 = p1 + s3;
				textview23.setText(String.valueOf((long)(p1)));
				p2 = p2 + s1;
				textview19.setText(String.valueOf((long)(p2)));
				p3 = p3 + s2;
				textview21.setText(String.valueOf((long)(p3)));
				if ((Double.parseDouble(textview19.getText().toString()) == 10000) || (Double.parseDouble(textview19.getText().toString()) > 10000)) {
					dia.setTitle(textview4.getText().toString().concat(" is the winner"));
					dia.setMessage("PLAY AGAIN?");
					dia.setPositiveButton("yes", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													yes.setAction(Intent.ACTION_VIEW);
								yes.setClass(getApplicationContext(), PlayersActivity.class);
								startActivity(yes);
								finish();
						}
					});
					dia.setNegativeButton("no", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													no.setAction(Intent.ACTION_VIEW);
								no.setClass(getApplicationContext(), MainActivity.class);
								startActivity(no);
								finish();
						}
					});
					dia.create().show();
				}
				if ((Double.parseDouble(textview21.getText().toString()) == 10000) || (Double.parseDouble(textview21.getText().toString()) > 10000)) {
					dia.setTitle(textview6.getText().toString().concat(" is the winner"));
					dia.setMessage("PLAY AGAIN?");
					dia.setPositiveButton("yes", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													yes.setAction(Intent.ACTION_VIEW);
								yes.setClass(getApplicationContext(), PlayersActivity.class);
								startActivity(yes);
								finish();
						}
					});
					dia.setNegativeButton("no", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													no.setAction(Intent.ACTION_VIEW);
								no.setClass(getApplicationContext(), MainActivity.class);
								startActivity(no);
								finish();
						}
					});
					dia.create().show();
				}
				if ((Double.parseDouble(textview23.getText().toString()) > 10000) || (Double.parseDouble(textview23.getText().toString()) == 10000)) {
					dia.setTitle(textview8.getText().toString().concat(" is the winner"));
					dia.setMessage("PLAY AGAIN?");
					dia.setPositiveButton("yes", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													yes.setAction(Intent.ACTION_VIEW);
								yes.setClass(getApplicationContext(), PlayersActivity.class);
								startActivity(yes);
								finish();
						}
					});
					dia.setNegativeButton("no", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													no.setAction(Intent.ACTION_VIEW);
								no.setClass(getApplicationContext(), MainActivity.class);
								startActivity(no);
								finish();
						}
					});
					dia.create().show();
				}
			}
		});
		play.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) { 
				sound = sp.play((int)(sid), 1.0f, 1.0f, 1, (int)(0), 1.0f);
				play.setEnabled(false);
				button11.setEnabled(false);
				button13.setEnabled(false);
				button14.setEnabled(false);
				button13.setBackgroundColor(0xFF000000);
				button14.setBackgroundColor(0xFF000000);
				button11.setBackgroundColor(0xFF000000);
				oa.setTarget(button13);
				oa.setPropertyName("rotation");
				oa.setFloatValues((float)(0), (float)(3690));
				oa.setDuration((int)(1000));
				oa.start();
				oa1.setTarget(button14);
				oa1.setPropertyName("rotation");
				oa1.setFloatValues((float)(0), (float)(3870));
				oa1.setDuration((int)(1000));
				oa1.start();
				oa2.setTarget(button11);
				oa2.setPropertyName("rotation");
				oa2.setFloatValues((float)(0), (float)(3600));
				oa2.setDuration((int)(1000));
				oa2.start();
				t = new TimerTask() {
							@Override
								public void run() {
									runOnUiThread(new Runnable() {
									@Override
										public void run() {
														select = getRandom((int)(1), (int)(6));
										if (select == 1) {
											button13.setText("Rama");
											button14.setText("Sita");
											button11.setText("Ravan");
											button13.setEnabled(false);
											button14.setEnabled(true);
											button11.setEnabled(true);
											button13.setBackgroundColor(0xFF81D4FA);
											button11.setBackgroundColor(0xFF000000);
											button14.setBackgroundColor(0xFF000000);
										}
										if (select == 2) {
											button14.setText("Rama");
											button13.setText("Sita");
											button11.setText("Ravan");
											button14.setEnabled(false);
											button11.setEnabled(true);
											button13.setEnabled(true);
											button14.setBackgroundColor(0xFF8C9EFF);
											button11.setBackgroundColor(0xFF000000);
											button13.setBackgroundColor(0xFF000000);
										}
										if (select == 3) {
											button11.setText("Rama");
											button14.setText("Sita");
											button13.setText("Ravan");
											button13.setEnabled(true);
											button14.setEnabled(true);
											button11.setEnabled(false);
											button11.setBackgroundColor(0xFFFFE57F);
											button14.setBackgroundColor(0xFF000000);
											button13.setBackgroundColor(0xFF000000);
										}
										if (select == 4) {
											button13.setText("Rama");
											button11.setText("Sita");
											button14.setText("Ravan");
											button13.setEnabled(false);
											button14.setEnabled(true);
											button11.setEnabled(true);
											button13.setBackgroundColor(0xFF81D4FA);
											button11.setBackgroundColor(0xFF000000);
											button14.setBackgroundColor(0xFF000000);
										}
										if (select == 5) {
											button14.setText("Rama");
											button11.setText("Sita");
											button13.setText("Ravan");
											button14.setEnabled(false);
											button11.setEnabled(true);
											button13.setEnabled(true);
											button14.setBackgroundColor(0xFF8C9EFF);
											button11.setBackgroundColor(0xFF000000);
											button13.setBackgroundColor(0xFF000000);
										}
										if (select == 6) {
											button11.setText("Rama");
											button13.setText("Sita");
											button14.setText("Ravan");
											button13.setEnabled(true);
											button14.setEnabled(true);
											button11.setEnabled(false);
											button11.setBackgroundColor(0xFFFFE57F);
											button14.setBackgroundColor(0xFF000000);
											button13.setBackgroundColor(0xFF000000);
										}
										}
									});
								}
							};
							_timer.schedule(t, (int)(1000));
			}
		});

	}

	private void  initializeLogic() {
		textview1.setText(p13.getString("x1", ""));
		textview4.setText(p13.getString("x1", ""));
		textview2.setText(p13.getString("x2", ""));
		textview6.setText(p13.getString("x2", ""));
		textview3.setText(p13.getString("x3", ""));
		textview8.setText(p13.getString("x3", ""));
		button11.setEnabled(false);
		button13.setEnabled(false);
		button14.setEnabled(false);
		p1 = 0;
		p2 = 0;
		p3 = 0;
		setTitle("                      RAM-SEETA");
		sp = new SoundPool((int)(3), AudioManager.STREAM_MUSIC, 0);
		sid = sp.load(getApplicationContext(), R.raw.click, 1);
		sid1 = sp.load(getApplicationContext(), R.raw.yes, 1);
		sid2 = sp.load(getApplicationContext(), R.raw.noo, 1);
		tsb = new TimerTask() {
					@Override
						public void run() {
							runOnUiThread(new Runnable() {
							@Override
								public void run() {
										oasc.setTarget(textview24);
								oasc.setPropertyName("alpha");
								oasc.setFloatValues((float)(0), (float)(1));
								oasc.setDuration((int)(800));
								oasc.start();
								}
							});
						}
					};
					_timer.scheduleAtFixedRate(tsb, (int)(0), (int)(800));
	}

	@Override
	public void onBackPressed() {
				dia.setTitle("Do you want to exit");
				dia.setMessage(" ");
				dia.setNegativeButton("No", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
				
					}
				});
				dia.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
											finish();
					}
				});
				dia.create().show();
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
