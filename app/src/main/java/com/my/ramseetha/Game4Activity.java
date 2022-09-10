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


public class Game4Activity extends Activity {

	private LinearLayout linear1;
	private LinearLayout linear12;
	private LinearLayout linear3;
	private LinearLayout linear4;
	private LinearLayout linear5;
	private LinearLayout linear11;
	private LinearLayout linear6;
	private Button button1;
	private TextView textview1;
	private Button button4;
	private TextView textview4;
	private Button play;
	private TextView textview2;
	private Button button2;
	private TextView textview3;
	private Button button3;
	private TextView textview13;
	private LinearLayout linear7;
	private LinearLayout linear8;
	private LinearLayout linear9;
	private LinearLayout linear10;
	private TextView textview5;
	private TextView textview6;
	private TextView textview7;
	private TextView textview8;
	private TextView textview10;
	private TextView textview11;
	private TextView textview9;
	private TextView textview12;

	private double p1 = 0;
	private double p2 = 0;
	private double p3 = 0;
	private double p4 = 0;
	private double rotate = 0;
	private double select = 0;
	private double select1 = 0;
	private double select2 = 0;
	private double sound = 0;
	private double sid1 = 0;
	private double sid2 = 0;
	private double sid3 = 0;


	private Timer _timer = new Timer();
	private SharedPreferences b;
	private TimerTask timer;
	private ObjectAnimator oa1 = new ObjectAnimator();
	private ObjectAnimator oa2 = new ObjectAnimator();
	private ObjectAnimator oa3 = new ObjectAnimator();
	private ObjectAnimator oa4 = new ObjectAnimator();
	private Vibrator vibe;
	private AlertDialog.Builder dia;
	private Intent screen = new Intent();
	private SoundPool sp;
	private AlertDialog.Builder exit;
	private TimerTask tsb;
	private ObjectAnimator oasb = new ObjectAnimator();


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.game4);
		initialize();
		initializeLogic();
	}

	private void  initialize() {
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		button1 = (Button) findViewById(R.id.button1);
		textview1 = (TextView) findViewById(R.id.textview1);
		button4 = (Button) findViewById(R.id.button4);
		textview4 = (TextView) findViewById(R.id.textview4);
		play = (Button) findViewById(R.id.play);
		textview2 = (TextView) findViewById(R.id.textview2);
		button2 = (Button) findViewById(R.id.button2);
		textview3 = (TextView) findViewById(R.id.textview3);
		button3 = (Button) findViewById(R.id.button3);
		textview13 = (TextView) findViewById(R.id.textview13);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		textview5 = (TextView) findViewById(R.id.textview5);
		textview6 = (TextView) findViewById(R.id.textview6);
		textview7 = (TextView) findViewById(R.id.textview7);
		textview8 = (TextView) findViewById(R.id.textview8);
		textview10 = (TextView) findViewById(R.id.textview10);
		textview11 = (TextView) findViewById(R.id.textview11);
		textview9 = (TextView) findViewById(R.id.textview9);
		textview12 = (TextView) findViewById(R.id.textview12);

		b = getSharedPreferences("b", Activity.MODE_PRIVATE);





		vibe = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
		dia = new AlertDialog.Builder(this);


		exit = new AlertDialog.Builder(this);



		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) { 
				play.setEnabled(true);
				button1.setEnabled(false);
				button2.setEnabled(false);
				button3.setEnabled(false);
				button4.setEnabled(false);
				if (button1.getText().toString().equals("Sita")) {
					sound = sp.play((int)(sid2), 1.0f, 1.0f, 1, (int)(0), 1.0f);
					showMessage("TRUE");
					p1 = 0;
					if (button2.getText().toString().equals("Rama")) {
						if (button3.getText().toString().equals("Ravan")) {
							p2 = 1000;
							p3 = -500;
							p4 = 900;
						}
						else {
							p2 = 1000;
							p3 = 900;
							p4 = -500;
						}
					}
					if (button2.getText().toString().equals("Ravan")) {
						if (button3.getText().toString().equals("Rama")) {
							p2 = -500;
							p3 = 1000;
							p4 = 900;
						}
						else {
							p2 = -500;
							p3 = 900;
							p4 = 1000;
						}
					}
					if (button2.getText().toString().equals("Hanuman")) {
						if (button3.getText().toString().equals("Rama")) {
							p2 = 900;
							p3 = 1000;
							p4 = -500;
						}
						else {
							p2 = 900;
							p3 = -500;
							p4 = 1000;
						}
					}
				}
				else {
					sound = sp.play((int)(sid3), 1.0f, 1.0f, 1, (int)(0), 1.0f);
					showMessage("FALSE");
					vibe.vibrate((long)(50));
					if (button1.getText().toString().equals("Hanuman")) {
						if (button2.getText().toString().equals("Rama")) {
							if (button3.getText().toString().equals("Ravan")) {
								p1 = 900;
								p2 = 0;
								p3 = -500;
								p4 = 1000;
							}
							else {
								p1 = 900;
								p2 = 0;
								p3 = 1000;
								p4 = -500;
							}
						}
						else {
							if (button2.getText().toString().equals("Ravan")) {
								if (button3.getText().toString().equals("Rama")) {
									p1 = 900;
									p2 = -500;
									p3 = 0;
									p4 = 1000;
								}
								else {
									p1 = 900;
									p2 = -500;
									p3 = 1000;
									p4 = 0;
								}
							}
							else {
								if (button3.getText().toString().equals("Rama")) {
									p1 = 900;
									p2 = 1000;
									p3 = 0;
									p4 = -500;
								}
								else {
									p1 = 900;
									p2 = 1000;
									p3 = -500;
									p4 = 0;
								}
							}
						}
					}
					else {
						if (button2.getText().toString().equals("Rama")) {
							if (button3.getText().toString().equals("Hanuman")) {
								p1 = -500;
								p2 = 0;
								p3 = 900;
								p4 = 1000;
							}
							else {
								p1 = -500;
								p2 = 0;
								p3 = 1000;
								p4 = 900;
							}
						}
						else {
							if (button2.getText().toString().equals("Hanuman")) {
								if (button3.getText().toString().equals("Rama")) {
									p1 = -500;
									p2 = 900;
									p3 = 0;
									p4 = 1000;
								}
								else {
									p1 = -500;
									p2 = 900;
									p3 = 1000;
									p4 = 0;
								}
							}
							else {
								if (button3.getText().toString().equals("Rama")) {
									p1 = -500;
									p2 = 1000;
									p3 = 0;
									p4 = 900;
								}
								else {
									p1 = -500;
									p2 = 1000;
									p3 = 900;
									p4 = 0;
								}
							}
						}
					}
				}
				button1.setBackgroundColor(0xFF81D4FA);
				button2.setBackgroundColor(0xFF8C9EFF);
				button3.setBackgroundColor(0xFFFFE57F);
				button4.setBackgroundColor(0xFFA7FFEB);
				textview6.setText(String.valueOf((long)(Double.parseDouble(textview6.getText().toString()) + p1)));
				textview8.setText(String.valueOf((long)(Double.parseDouble(textview8.getText().toString()) + p2)));
				textview11.setText(String.valueOf((long)(Double.parseDouble(textview11.getText().toString()) + p3)));
				textview12.setText(String.valueOf((long)(Double.parseDouble(textview12.getText().toString()) + p4)));
				if (((Double.parseDouble(textview6.getText().toString()) == 10000) || (Double.parseDouble(textview6.getText().toString()) > 10000)) && ((Double.parseDouble(textview8.getText().toString()) < 10000) && ((Double.parseDouble(textview11.getText().toString()) < 10000) && (Double.parseDouble(textview12.getText().toString()) < 10000)))) {
					play.setEnabled(false);
					dia.setTitle(textview5.getText().toString().concat(" is the winner"));
					dia.setMessage("PLAY AGAIN?");
					dia.setPositiveButton("yes", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), PlayersActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.setNegativeButton("no", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), MainActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.create().show();
				}
				if (((Double.parseDouble(textview8.getText().toString()) == 10000) || (Double.parseDouble(textview8.getText().toString()) > 10000)) && ((Double.parseDouble(textview6.getText().toString()) < 10000) && ((Double.parseDouble(textview11.getText().toString()) < 10000) && (Double.parseDouble(textview12.getText().toString()) < 10000)))) {
					play.setEnabled(false);
					dia.setTitle(textview7.getText().toString().concat(" is the winner"));
					dia.setMessage("PLAY AGAIN?");
					dia.setPositiveButton("yes", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), PlayersActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.setNegativeButton("no", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), MainActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.create().show();
				}
				if (((Double.parseDouble(textview11.getText().toString()) == 10000) || (Double.parseDouble(textview11.getText().toString()) > 10000)) && ((Double.parseDouble(textview8.getText().toString()) < 10000) && ((Double.parseDouble(textview6.getText().toString()) < 10000) && (Double.parseDouble(textview12.getText().toString()) < 10000)))) {
					play.setEnabled(false);
					dia.setTitle(textview10.getText().toString().concat(" is the winner"));
					dia.setMessage("PLAY AGAIN?");
					dia.setPositiveButton("yes", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), PlayersActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.setNegativeButton("no", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), MainActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.create().show();
				}
				if (((Double.parseDouble(textview12.getText().toString()) == 10000) || (Double.parseDouble(textview12.getText().toString()) > 10000)) && ((Double.parseDouble(textview8.getText().toString()) < 10000) && ((Double.parseDouble(textview11.getText().toString()) < 10000) && (Double.parseDouble(textview6.getText().toString()) < 10000)))) {
					play.setEnabled(false);
					dia.setTitle(textview9.getText().toString().concat(" is the winner"));
					dia.setMessage("PLAY AGAIN?");
					dia.setPositiveButton("yes", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), PlayersActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.setNegativeButton("no", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), MainActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.create().show();
				}
				if (((Double.parseDouble(textview6.getText().toString()) > 10000) || (Double.parseDouble(textview6.getText().toString()) == 10000)) && ((Double.parseDouble(textview8.getText().toString()) > 10000) || (Double.parseDouble(textview8.getText().toString()) == 10000))) {
					play.setEnabled(false);
					if (Double.parseDouble(textview6.getText().toString()) == Double.parseDouble(textview8.getText().toString())) {
						dia.setTitle(textview5.getText().toString().concat(" and ".concat(textview7.getText().toString()).concat(" are the winners")));
					}
					else {
						if (Double.parseDouble(textview6.getText().toString()) > Double.parseDouble(textview8.getText().toString())) {
							dia.setTitle(textview5.getText().toString().concat(" is the winner"));
						}
						else {
							dia.setTitle(textview7.getText().toString().concat(" is the winner"));
						}
					}
					dia.setMessage("PLAY AGAIN?");
					dia.setPositiveButton("yes", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), PlayersActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.setNegativeButton("no", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), MainActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.create().show();
				}
				if (((Double.parseDouble(textview6.getText().toString()) > 10000) || (Double.parseDouble(textview6.getText().toString()) == 10000)) && ((Double.parseDouble(textview11.getText().toString()) > 10000) || (Double.parseDouble(textview11.getText().toString()) == 10000))) {
					play.setEnabled(false);
					if (Double.parseDouble(textview6.getText().toString()) == Double.parseDouble(textview11.getText().toString())) {
						dia.setTitle(textview5.getText().toString().concat(" and ".concat(textview10.getText().toString()).concat(" are the winners")));
					}
					else {
						if (Double.parseDouble(textview6.getText().toString()) > Double.parseDouble(textview11.getText().toString())) {
							dia.setTitle(textview5.getText().toString().concat(" is the winner"));
						}
						else {
							dia.setTitle(textview10.getText().toString().concat(" is the winner"));
						}
					}
					dia.setMessage("PLAY AGAIN?");
					dia.setPositiveButton("yes", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), PlayersActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.setNegativeButton("no", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), MainActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.create().show();
				}
				if (((Double.parseDouble(textview6.getText().toString()) > 10000) || (Double.parseDouble(textview6.getText().toString()) == 10000)) && ((Double.parseDouble(textview12.getText().toString()) > 10000) || (Double.parseDouble(textview12.getText().toString()) == 10000))) {
					play.setEnabled(false);
					if (Double.parseDouble(textview6.getText().toString()) == Double.parseDouble(textview12.getText().toString())) {
						dia.setTitle(textview5.getText().toString().concat(" and ".concat(textview9.getText().toString()).concat(" are the winners")));
					}
					else {
						if (Double.parseDouble(textview6.getText().toString()) > Double.parseDouble(textview12.getText().toString())) {
							dia.setTitle(textview5.getText().toString().concat(" is the winner"));
						}
						else {
							dia.setTitle(textview9.getText().toString().concat(" is the winner"));
						}
					}
					dia.setMessage("PLAY AGAIN?");
					dia.setPositiveButton("yes", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), PlayersActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.setNegativeButton("no", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), MainActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.create().show();
				}
				if (((Double.parseDouble(textview8.getText().toString()) > 10000) || (Double.parseDouble(textview8.getText().toString()) == 10000)) && ((Double.parseDouble(textview11.getText().toString()) > 10000) || (Double.parseDouble(textview11.getText().toString()) == 10000))) {
					play.setEnabled(false);
					if (Double.parseDouble(textview8.getText().toString()) == Double.parseDouble(textview11.getText().toString())) {
						dia.setTitle(textview7.getText().toString().concat(" and ".concat(textview10.getText().toString()).concat(" are the winners")));
					}
					else {
						if (Double.parseDouble(textview8.getText().toString()) > Double.parseDouble(textview11.getText().toString())) {
							dia.setTitle(textview7.getText().toString().concat(" is the winner"));
						}
						else {
							dia.setTitle(textview10.getText().toString().concat(" is the winner"));
						}
					}
					dia.setMessage("PLAY AGAIN?");
					dia.setPositiveButton("yes", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), PlayersActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.setNegativeButton("no", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), MainActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.create().show();
				}
				if (((Double.parseDouble(textview8.getText().toString()) > 10000) || (Double.parseDouble(textview8.getText().toString()) == 10000)) && ((Double.parseDouble(textview12.getText().toString()) > 10000) || (Double.parseDouble(textview12.getText().toString()) == 10000))) {
					play.setEnabled(false);
					if (Double.parseDouble(textview8.getText().toString()) == Double.parseDouble(textview12.getText().toString())) {
						dia.setTitle(textview7.getText().toString().concat(" and ".concat(textview9.getText().toString()).concat(" are the winners")));
					}
					else {
						if (Double.parseDouble(textview8.getText().toString()) > Double.parseDouble(textview12.getText().toString())) {
							dia.setTitle(textview7.getText().toString().concat(" is the winner"));
						}
						else {
							dia.setTitle(textview9.getText().toString().concat(" is the winner"));
						}
					}
					dia.setMessage("PLAY AGAIN?");
					dia.setPositiveButton("yes", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), PlayersActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.setNegativeButton("no", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), MainActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.create().show();
				}
				if (((Double.parseDouble(textview11.getText().toString()) > 10000) || (Double.parseDouble(textview11.getText().toString()) == 10000)) && ((Double.parseDouble(textview12.getText().toString()) > 10000) || (Double.parseDouble(textview12.getText().toString()) == 10000))) {
					play.setEnabled(false);
					if (Double.parseDouble(textview11.getText().toString()) == Double.parseDouble(textview12.getText().toString())) {
						dia.setTitle(textview10.getText().toString().concat(" and ".concat(textview9.getText().toString()).concat(" are the winners")));
					}
					else {
						if (Double.parseDouble(textview11.getText().toString()) > Double.parseDouble(textview12.getText().toString())) {
							dia.setTitle(textview10.getText().toString().concat(" is the winner"));
						}
						else {
							dia.setTitle(textview9.getText().toString().concat(" is the winner"));
						}
					}
					dia.setMessage("PLAY AGAIN?");
					dia.setPositiveButton("yes", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), PlayersActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.setNegativeButton("no", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), MainActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.create().show();
				}
			}
		});
		button4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) { 
				play.setEnabled(true);
				button1.setEnabled(false);
				button2.setEnabled(false);
				button3.setEnabled(false);
				button4.setEnabled(false);
				if (button4.getText().toString().equals("Sita")) {
					sound = sp.play((int)(sid2), 1.0f, 1.0f, 1, (int)(0), 1.0f);
					showMessage("TRUE");
					p4 = 0;
					if (button2.getText().toString().equals("Rama")) {
						if (button3.getText().toString().equals("Ravan")) {
							p2 = 1000;
							p3 = -500;
							p1 = 900;
						}
						else {
							p2 = 1000;
							p3 = 900;
							p1 = -500;
						}
					}
					if (button2.getText().toString().equals("Ravan")) {
						if (button3.getText().toString().equals("Rama")) {
							p2 = -500;
							p3 = 1000;
							p1 = 900;
						}
						else {
							p2 = -500;
							p3 = 900;
							p1 = 1000;
						}
					}
					if (button2.getText().toString().equals("Hanuman")) {
						if (button3.getText().toString().equals("Rama")) {
							p2 = 900;
							p3 = 1000;
							p1 = -500;
						}
						else {
							p2 = 900;
							p3 = -500;
							p1 = 1000;
						}
					}
				}
				else {
					sound = sp.play((int)(sid3), 1.0f, 1.0f, 1, (int)(0), 1.0f);
					showMessage("FALSE");
					vibe.vibrate((long)(50));
					if (button4.getText().toString().equals("Hanuman")) {
						if (button2.getText().toString().equals("Rama")) {
							if (button3.getText().toString().equals("Ravan")) {
								p4 = 900;
								p2 = 0;
								p3 = -500;
								p1 = 1000;
							}
							else {
								p4 = 900;
								p2 = 0;
								p3 = 1000;
								p1 = -500;
							}
						}
						else {
							if (button2.getText().toString().equals("Ravan")) {
								if (button3.getText().toString().equals("Rama")) {
									p4 = 900;
									p2 = -500;
									p3 = 0;
									p1 = 1000;
								}
								else {
									p4 = 900;
									p2 = -500;
									p3 = 1000;
									p1 = 0;
								}
							}
							else {
								if (button3.getText().toString().equals("Rama")) {
									p4 = 900;
									p2 = 1000;
									p3 = 0;
									p1 = -500;
								}
								else {
									p4 = 900;
									p2 = 1000;
									p3 = -500;
									p1 = 0;
								}
							}
						}
					}
					else {
						if (button2.getText().toString().equals("Rama")) {
							if (button3.getText().toString().equals("Hanuman")) {
								p4 = -500;
								p2 = 0;
								p3 = 900;
								p1 = 1000;
							}
							else {
								p4 = -500;
								p2 = 0;
								p3 = 1000;
								p1 = 900;
							}
						}
						else {
							if (button2.getText().toString().equals("Hanuman")) {
								if (button3.getText().toString().equals("Rama")) {
									p4 = -500;
									p2 = 900;
									p3 = 0;
									p1 = 1000;
								}
								else {
									p4 = -500;
									p2 = 900;
									p3 = 1000;
									p1 = 0;
								}
							}
							else {
								if (button3.getText().toString().equals("Rama")) {
									p4 = -500;
									p2 = 1000;
									p3 = 0;
									p1 = 900;
								}
								else {
									p4 = -500;
									p2 = 1000;
									p3 = 900;
									p1 = 0;
								}
							}
						}
					}
				}
				button1.setBackgroundColor(0xFF81D4FA);
				button2.setBackgroundColor(0xFF8C9EFF);
				button3.setBackgroundColor(0xFFFFE57F);
				button4.setBackgroundColor(0xFFA7FFEB);
				textview6.setText(String.valueOf((long)(Double.parseDouble(textview6.getText().toString()) + p1)));
				textview8.setText(String.valueOf((long)(Double.parseDouble(textview8.getText().toString()) + p2)));
				textview11.setText(String.valueOf((long)(Double.parseDouble(textview11.getText().toString()) + p3)));
				textview12.setText(String.valueOf((long)(Double.parseDouble(textview12.getText().toString()) + p4)));
				if (((Double.parseDouble(textview6.getText().toString()) == 10000) || (Double.parseDouble(textview6.getText().toString()) > 10000)) && ((Double.parseDouble(textview8.getText().toString()) < 10000) && ((Double.parseDouble(textview11.getText().toString()) < 10000) && (Double.parseDouble(textview12.getText().toString()) < 10000)))) {
					play.setEnabled(false);
					dia.setTitle(textview5.getText().toString().concat(" is the winner"));
					dia.setMessage("PLAY AGAIN?");
					dia.setPositiveButton("yes", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), PlayersActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.setNegativeButton("no", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), MainActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.create().show();
				}
				if (((Double.parseDouble(textview8.getText().toString()) == 10000) || (Double.parseDouble(textview8.getText().toString()) > 10000)) && ((Double.parseDouble(textview6.getText().toString()) < 10000) && ((Double.parseDouble(textview11.getText().toString()) < 10000) && (Double.parseDouble(textview12.getText().toString()) < 10000)))) {
					play.setEnabled(false);
					dia.setTitle(textview7.getText().toString().concat(" is the winner"));
					dia.setMessage("PLAY AGAIN?");
					dia.setPositiveButton("yes", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), PlayersActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.setNegativeButton("no", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), MainActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.create().show();
				}
				if (((Double.parseDouble(textview11.getText().toString()) == 10000) || (Double.parseDouble(textview11.getText().toString()) > 10000)) && ((Double.parseDouble(textview8.getText().toString()) < 10000) && ((Double.parseDouble(textview6.getText().toString()) < 10000) && (Double.parseDouble(textview12.getText().toString()) < 10000)))) {
					play.setEnabled(false);
					dia.setTitle(textview10.getText().toString().concat(" is the winner"));
					dia.setMessage("PLAY AGAIN?");
					dia.setPositiveButton("yes", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), PlayersActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.setNegativeButton("no", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), MainActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.create().show();
				}
				if (((Double.parseDouble(textview12.getText().toString()) == 10000) || (Double.parseDouble(textview12.getText().toString()) > 10000)) && ((Double.parseDouble(textview8.getText().toString()) < 10000) && ((Double.parseDouble(textview11.getText().toString()) < 10000) && (Double.parseDouble(textview6.getText().toString()) < 10000)))) {
					play.setEnabled(false);
					dia.setTitle(textview9.getText().toString().concat(" is the winner"));
					dia.setMessage("PLAY AGAIN?");
					dia.setPositiveButton("yes", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), PlayersActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.setNegativeButton("no", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), MainActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.create().show();
				}
				if (((Double.parseDouble(textview6.getText().toString()) > 10000) || (Double.parseDouble(textview6.getText().toString()) == 10000)) && ((Double.parseDouble(textview8.getText().toString()) > 10000) || (Double.parseDouble(textview8.getText().toString()) == 10000))) {
					play.setEnabled(false);
					if (Double.parseDouble(textview6.getText().toString()) == Double.parseDouble(textview8.getText().toString())) {
						dia.setTitle(textview5.getText().toString().concat(" and ".concat(textview7.getText().toString()).concat(" are the winners")));
					}
					else {
						if (Double.parseDouble(textview6.getText().toString()) > Double.parseDouble(textview8.getText().toString())) {
							dia.setTitle(textview5.getText().toString().concat(" is the winner"));
						}
						else {
							dia.setTitle(textview7.getText().toString().concat(" is the winner"));
						}
					}
					dia.setMessage("PLAY AGAIN?");
					dia.setPositiveButton("yes", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), PlayersActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.setNegativeButton("no", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), MainActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.create().show();
				}
				if (((Double.parseDouble(textview6.getText().toString()) > 10000) || (Double.parseDouble(textview6.getText().toString()) == 10000)) && ((Double.parseDouble(textview11.getText().toString()) > 10000) || (Double.parseDouble(textview11.getText().toString()) == 10000))) {
					play.setEnabled(false);
					if (Double.parseDouble(textview6.getText().toString()) == Double.parseDouble(textview11.getText().toString())) {
						dia.setTitle(textview5.getText().toString().concat(" and ".concat(textview10.getText().toString()).concat(" are the winners")));
					}
					else {
						if (Double.parseDouble(textview6.getText().toString()) > Double.parseDouble(textview11.getText().toString())) {
							dia.setTitle(textview5.getText().toString().concat(" is the winner"));
						}
						else {
							dia.setTitle(textview10.getText().toString().concat(" is the winner"));
						}
					}
					dia.setMessage("PLAY AGAIN?");
					dia.setPositiveButton("yes", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), PlayersActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.setNegativeButton("no", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), MainActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.create().show();
				}
				if (((Double.parseDouble(textview6.getText().toString()) > 10000) || (Double.parseDouble(textview6.getText().toString()) == 10000)) && ((Double.parseDouble(textview12.getText().toString()) > 10000) || (Double.parseDouble(textview12.getText().toString()) == 10000))) {
					play.setEnabled(false);
					if (Double.parseDouble(textview6.getText().toString()) == Double.parseDouble(textview12.getText().toString())) {
						dia.setTitle(textview5.getText().toString().concat(" and ".concat(textview9.getText().toString()).concat(" are the winners")));
					}
					else {
						if (Double.parseDouble(textview6.getText().toString()) > Double.parseDouble(textview12.getText().toString())) {
							dia.setTitle(textview5.getText().toString().concat(" is the winner"));
						}
						else {
							dia.setTitle(textview9.getText().toString().concat(" is the winner"));
						}
					}
					dia.setMessage("PLAY AGAIN?");
					dia.setPositiveButton("yes", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), PlayersActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.setNegativeButton("no", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), MainActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.create().show();
				}
				if (((Double.parseDouble(textview8.getText().toString()) > 10000) || (Double.parseDouble(textview8.getText().toString()) == 10000)) && ((Double.parseDouble(textview11.getText().toString()) > 10000) || (Double.parseDouble(textview11.getText().toString()) == 10000))) {
					play.setEnabled(false);
					if (Double.parseDouble(textview8.getText().toString()) == Double.parseDouble(textview11.getText().toString())) {
						dia.setTitle(textview7.getText().toString().concat(" and ".concat(textview10.getText().toString()).concat(" are the winners")));
					}
					else {
						if (Double.parseDouble(textview8.getText().toString()) > Double.parseDouble(textview11.getText().toString())) {
							dia.setTitle(textview7.getText().toString().concat(" is the winner"));
						}
						else {
							dia.setTitle(textview10.getText().toString().concat(" is the winner"));
						}
					}
					dia.setMessage("PLAY AGAIN?");
					dia.setPositiveButton("yes", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), PlayersActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.setNegativeButton("no", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), MainActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.create().show();
				}
				if (((Double.parseDouble(textview8.getText().toString()) > 10000) || (Double.parseDouble(textview8.getText().toString()) == 10000)) && ((Double.parseDouble(textview12.getText().toString()) > 10000) || (Double.parseDouble(textview12.getText().toString()) == 10000))) {
					play.setEnabled(false);
					if (Double.parseDouble(textview8.getText().toString()) == Double.parseDouble(textview12.getText().toString())) {
						dia.setTitle(textview7.getText().toString().concat(" and ".concat(textview9.getText().toString()).concat(" are the winners")));
					}
					else {
						if (Double.parseDouble(textview8.getText().toString()) > Double.parseDouble(textview12.getText().toString())) {
							dia.setTitle(textview7.getText().toString().concat(" is the winner"));
						}
						else {
							dia.setTitle(textview9.getText().toString().concat(" is the winner"));
						}
					}
					dia.setMessage("PLAY AGAIN?");
					dia.setPositiveButton("yes", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), PlayersActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.setNegativeButton("no", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), MainActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.create().show();
				}
				if (((Double.parseDouble(textview11.getText().toString()) > 10000) || (Double.parseDouble(textview11.getText().toString()) == 10000)) && ((Double.parseDouble(textview12.getText().toString()) > 10000) || (Double.parseDouble(textview12.getText().toString()) == 10000))) {
					play.setEnabled(false);
					if (Double.parseDouble(textview11.getText().toString()) == Double.parseDouble(textview12.getText().toString())) {
						dia.setTitle(textview10.getText().toString().concat(" and ".concat(textview9.getText().toString()).concat(" are the winners")));
					}
					else {
						if (Double.parseDouble(textview11.getText().toString()) > Double.parseDouble(textview12.getText().toString())) {
							dia.setTitle(textview10.getText().toString().concat(" is the winner"));
						}
						else {
							dia.setTitle(textview9.getText().toString().concat(" is the winner"));
						}
					}
					dia.setMessage("PLAY AGAIN?");
					dia.setPositiveButton("yes", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), PlayersActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.setNegativeButton("no", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), MainActivity.class);
								startActivity(screen);
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
				sound = sp.play((int)(sid1), 1.0f, 1.0f, 1, (int)(0), 1.0f);
				rotate = rotate + 90;
				play.setRotation((float)(rotate));
				play.setEnabled(false);
				button1.setEnabled(false);
				button2.setEnabled(false);
				button3.setEnabled(false);
				button4.setEnabled(false);
				button1.setBackgroundColor(0xFF000000);
				button2.setBackgroundColor(0xFF000000);
				button3.setBackgroundColor(0xFF000000);
				button4.setBackgroundColor(0xFF000000);
				oa1.setTarget(button1);
				oa1.setPropertyName("rotation");
				oa1.setFloatValues((float)(0), (float)(3780));
				oa1.setDuration((int)(1000));
				oa1.start();
				oa2.setTarget(button2);
				oa2.setPropertyName("rotation");
				oa2.setFloatValues((float)(0), (float)(3870));
				oa2.setDuration((int)(1000));
				oa2.start();
				oa3.setTarget(button3);
				oa3.setPropertyName("rotation");
				oa3.setFloatValues((float)(0), (float)(3600));
				oa3.setDuration((int)(1000));
				oa3.start();
				oa4.setTarget(button4);
				oa4.setPropertyName("rotation");
				oa4.setFloatValues((float)(0), (float)(3690));
				oa4.setDuration((int)(1000));
				oa4.start();
				timer = new TimerTask() {
							@Override
								public void run() {
									runOnUiThread(new Runnable() {
									@Override
										public void run() {
														select = getRandom((int)(1), (int)(24));
										if (select == 1) {
											button1.setText("Rama");
											button2.setText("Sita");
											button3.setText("Ravan");
											button4.setText("Hanuman");
											button1.setEnabled(false);
											button2.setEnabled(true);
											button3.setEnabled(true);
											button4.setEnabled(true);
											button1.setBackgroundColor(0xFF81D4FA);
											button2.setBackgroundColor(0xFF000000);
											button3.setBackgroundColor(0xFF000000);
											button4.setBackgroundColor(0xFF000000);
										}
										if (select == 2) {
											button4.setText("Rama");
											button2.setText("Sita");
											button3.setText("Ravan");
											button1.setText("Hanuman");
											button4.setEnabled(false);
											button2.setEnabled(true);
											button3.setEnabled(true);
											button1.setEnabled(true);
											button4.setBackgroundColor(0xFF81D4FA);
											button2.setBackgroundColor(0xFF000000);
											button3.setBackgroundColor(0xFF000000);
											button1.setBackgroundColor(0xFF000000);
										}
										if (select == 3) {
											button3.setText("Rama");
											button2.setText("Sita");
											button4.setText("Ravan");
											button1.setText("Hanuman");
											button3.setEnabled(false);
											button2.setEnabled(true);
											button4.setEnabled(true);
											button1.setEnabled(true);
											button3.setBackgroundColor(0xFF81D4FA);
											button2.setBackgroundColor(0xFF000000);
											button4.setBackgroundColor(0xFF000000);
											button1.setBackgroundColor(0xFF000000);
										}
										if (select == 4) {
											button1.setText("Rama");
											button4.setText("Sita");
											button2.setText("Ravan");
											button3.setText("Hanuman");
											button1.setEnabled(false);
											button4.setEnabled(true);
											button2.setEnabled(true);
											button3.setEnabled(true);
											button1.setBackgroundColor(0xFF81D4FA);
											button4.setBackgroundColor(0xFF000000);
											button3.setBackgroundColor(0xFF000000);
											button2.setBackgroundColor(0xFF000000);
										}
										if (select == 5) {
											button4.setText("Rama");
											button1.setText("Sita");
											button2.setText("Ravan");
											button3.setText("Hanuman");
											button4.setEnabled(false);
											button2.setEnabled(true);
											button3.setEnabled(true);
											button1.setEnabled(true);
											button4.setBackgroundColor(0xFF81D4FA);
											button2.setBackgroundColor(0xFF000000);
											button3.setBackgroundColor(0xFF000000);
											button1.setBackgroundColor(0xFF000000);
										}
										if (select == 6) {
											button3.setText("Rama");
											button4.setText("Sita");
											button1.setText("Ravan");
											button2.setText("Hanuman");
											button3.setEnabled(false);
											button2.setEnabled(true);
											button1.setEnabled(true);
											button4.setEnabled(true);
											button3.setBackgroundColor(0xFF81D4FA);
											button2.setBackgroundColor(0xFF000000);
											button1.setBackgroundColor(0xFF000000);
											button4.setBackgroundColor(0xFF000000);
										}
										if (select == 7) {
											button2.setText("Rama");
											button3.setText("Sita");
											button1.setText("Ravan");
											button4.setText("Hanuman");
											button2.setEnabled(false);
											button1.setEnabled(true);
											button3.setEnabled(true);
											button4.setEnabled(true);
											button2.setBackgroundColor(0xFF81D4FA);
											button1.setBackgroundColor(0xFF000000);
											button3.setBackgroundColor(0xFF000000);
											button4.setBackgroundColor(0xFF000000);
										}
										if (select == 8) {
											button1.setText("Rama");
											button2.setText("Sita");
											button4.setText("Ravan");
											button3.setText("Hanuman");
											button1.setEnabled(false);
											button2.setEnabled(true);
											button3.setEnabled(true);
											button4.setEnabled(true);
											button1.setBackgroundColor(0xFF81D4FA);
											button2.setBackgroundColor(0xFF000000);
											button3.setBackgroundColor(0xFF000000);
											button4.setBackgroundColor(0xFF000000);
										}
										if (select == 9) {
											button4.setText("Rama");
											button3.setText("Sita");
											button2.setText("Ravan");
											button1.setText("Hanuman");
											button4.setEnabled(false);
											button2.setEnabled(true);
											button3.setEnabled(true);
											button1.setEnabled(true);
											button4.setBackgroundColor(0xFF81D4FA);
											button2.setBackgroundColor(0xFF000000);
											button3.setBackgroundColor(0xFF000000);
											button1.setBackgroundColor(0xFF000000);
										}
										if (select == 10) {
											button3.setText("Rama");
											button2.setText("Sita");
											button1.setText("Ravan");
											button4.setText("Hanuman");
											button3.setEnabled(false);
											button2.setEnabled(true);
											button1.setEnabled(true);
											button4.setEnabled(true);
											button3.setBackgroundColor(0xFF81D4FA);
											button2.setBackgroundColor(0xFF000000);
											button1.setBackgroundColor(0xFF000000);
											button4.setBackgroundColor(0xFF000000);
										}
										if (select == 11) {
											button2.setText("Rama");
											button1.setText("Sita");
											button3.setText("Ravan");
											button4.setText("Hanuman");
											button2.setEnabled(false);
											button1.setEnabled(true);
											button3.setEnabled(true);
											button4.setEnabled(true);
											button2.setBackgroundColor(0xFF81D4FA);
											button1.setBackgroundColor(0xFF000000);
											button3.setBackgroundColor(0xFF000000);
											button4.setBackgroundColor(0xFF000000);
										}
										if (select == 12) {
											button1.setText("Rama");
											button3.setText("Sita");
											button2.setText("Ravan");
											button4.setText("Hanuman");
											button1.setEnabled(false);
											button2.setEnabled(true);
											button3.setEnabled(true);
											button4.setEnabled(true);
											button1.setBackgroundColor(0xFF81D4FA);
											button2.setBackgroundColor(0xFF000000);
											button3.setBackgroundColor(0xFF000000);
											button4.setBackgroundColor(0xFF000000);
										}
										if (select == 13) {
											button1.setText("Rama");
											button4.setText("Sita");
											button3.setText("Ravan");
											button2.setText("Hanuman");
											button1.setEnabled(false);
											button2.setEnabled(true);
											button3.setEnabled(true);
											button4.setEnabled(true);
											button1.setBackgroundColor(0xFF81D4FA);
											button2.setBackgroundColor(0xFF000000);
											button3.setBackgroundColor(0xFF000000);
											button4.setBackgroundColor(0xFF000000);
										}
										if (select == 14) {
											button2.setText("Rama");
											button3.setText("Sita");
											button4.setText("Ravan");
											button1.setText("Hanuman");
											button2.setEnabled(false);
											button1.setEnabled(true);
											button3.setEnabled(true);
											button4.setEnabled(true);
											button2.setBackgroundColor(0xFF81D4FA);
											button1.setBackgroundColor(0xFF000000);
											button3.setBackgroundColor(0xFF000000);
											button4.setBackgroundColor(0xFF000000);
										}
										if (select == 15) {
											button2.setText("Rama");
											button4.setText("Sita");
											button3.setText("Ravan");
											button1.setText("Hanuman");
											button2.setEnabled(false);
											button1.setEnabled(true);
											button3.setEnabled(true);
											button4.setEnabled(true);
											button2.setBackgroundColor(0xFF81D4FA);
											button1.setBackgroundColor(0xFF000000);
											button3.setBackgroundColor(0xFF000000);
											button4.setBackgroundColor(0xFF000000);
										}
										if (select == 16) {
											button3.setText("Rama");
											button1.setText("Sita");
											button2.setText("Ravan");
											button4.setText("Hanuman");
											button3.setEnabled(false);
											button2.setEnabled(true);
											button1.setEnabled(true);
											button4.setEnabled(true);
											button3.setBackgroundColor(0xFF81D4FA);
											button2.setBackgroundColor(0xFF000000);
											button1.setBackgroundColor(0xFF000000);
											button4.setBackgroundColor(0xFF000000);
										}
										if (select == 17) {
											button1.setText("Rama");
											button3.setText("Sita");
											button4.setText("Ravan");
											button2.setText("Hanuman");
											button1.setEnabled(false);
											button2.setEnabled(true);
											button3.setEnabled(true);
											button4.setEnabled(true);
											button1.setBackgroundColor(0xFF81D4FA);
											button2.setBackgroundColor(0xFF000000);
											button3.setBackgroundColor(0xFF000000);
											button4.setBackgroundColor(0xFF000000);
										}
										if (select == 18) {
											button4.setText("Rama");
											button2.setText("Sita");
											button1.setText("Ravan");
											button3.setText("Hanuman");
											button4.setEnabled(false);
											button2.setEnabled(true);
											button3.setEnabled(true);
											button1.setEnabled(true);
											button4.setBackgroundColor(0xFF81D4FA);
											button2.setBackgroundColor(0xFF000000);
											button3.setBackgroundColor(0xFF000000);
											button1.setBackgroundColor(0xFF000000);
										}
										if (select == 19) {
											button2.setText("Rama");
											button4.setText("Sita");
											button1.setText("Ravan");
											button3.setText("Hanuman");
											button2.setEnabled(false);
											button1.setEnabled(true);
											button3.setEnabled(true);
											button4.setEnabled(true);
											button2.setBackgroundColor(0xFF81D4FA);
											button1.setBackgroundColor(0xFF000000);
											button3.setBackgroundColor(0xFF000000);
											button4.setBackgroundColor(0xFF000000);
										}
										if (select == 20) {
											button2.setText("Rama");
											button1.setText("Sita");
											button4.setText("Ravan");
											button3.setText("Hanuman");
											button2.setEnabled(false);
											button1.setEnabled(true);
											button3.setEnabled(true);
											button4.setEnabled(true);
											button2.setBackgroundColor(0xFF81D4FA);
											button1.setBackgroundColor(0xFF000000);
											button3.setBackgroundColor(0xFF000000);
											button4.setBackgroundColor(0xFF000000);
										}
										if (select == 21) {
											button4.setText("Rama");
											button1.setText("Sita");
											button3.setText("Ravan");
											button2.setText("Hanuman");
											button4.setEnabled(false);
											button1.setEnabled(true);
											button3.setEnabled(true);
											button2.setEnabled(true);
											button4.setBackgroundColor(0xFF81D4FA);
											button1.setBackgroundColor(0xFF000000);
											button3.setBackgroundColor(0xFF000000);
											button2.setBackgroundColor(0xFF000000);
										}
										if (select == 22) {
											button3.setText("Rama");
											button4.setText("Sita");
											button2.setText("Ravan");
											button1.setText("Hanuman");
											button3.setEnabled(false);
											button1.setEnabled(true);
											button2.setEnabled(true);
											button4.setEnabled(true);
											button3.setBackgroundColor(0xFF81D4FA);
											button1.setBackgroundColor(0xFF000000);
											button2.setBackgroundColor(0xFF000000);
											button4.setBackgroundColor(0xFF000000);
										}
										if (select == 23) {
											button4.setText("Rama");
											button3.setText("Sita");
											button1.setText("Ravan");
											button2.setText("Hanuman");
											button4.setEnabled(false);
											button1.setEnabled(true);
											button3.setEnabled(true);
											button2.setEnabled(true);
											button4.setBackgroundColor(0xFF81D4FA);
											button1.setBackgroundColor(0xFF000000);
											button3.setBackgroundColor(0xFF000000);
											button2.setBackgroundColor(0xFF000000);
										}
										if (select == 24) {
											button3.setText("Rama");
											button1.setText("Sita");
											button4.setText("Ravan");
											button2.setText("Hanuman");
											button3.setEnabled(false);
											button1.setEnabled(true);
											button2.setEnabled(true);
											button4.setEnabled(true);
											button3.setBackgroundColor(0xFF81D4FA);
											button1.setBackgroundColor(0xFF000000);
											button2.setBackgroundColor(0xFF000000);
											button4.setBackgroundColor(0xFF000000);
										}
										}
									});
								}
							};
							_timer.schedule(timer, (int)(1000));
			}
		});
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) { 
				play.setEnabled(true);
				button1.setEnabled(false);
				button2.setEnabled(false);
				button3.setEnabled(false);
				button4.setEnabled(false);
				if (button2.getText().toString().equals("Sita")) {
					sound = sp.play((int)(sid2), 1.0f, 1.0f, 1, (int)(0), 1.0f);
					showMessage("TRUE");
					p2 = 0;
					if (button1.getText().toString().equals("Rama")) {
						if (button3.getText().toString().equals("Ravan")) {
							p1 = 1000;
							p3 = -500;
							p4 = 900;
						}
						else {
							p1 = 1000;
							p3 = 900;
							p4 = -500;
						}
					}
					if (button1.getText().toString().equals("Ravan")) {
						if (button3.getText().toString().equals("Rama")) {
							p1 = -500;
							p3 = 1000;
							p4 = 900;
						}
						else {
							p1 = -500;
							p3 = 900;
							p4 = 1000;
						}
					}
					if (button1.getText().toString().equals("Hanuman")) {
						if (button3.getText().toString().equals("Rama")) {
							p1 = 900;
							p3 = 1000;
							p4 = -500;
						}
						else {
							p1 = 900;
							p3 = -500;
							p4 = 1000;
						}
					}
				}
				else {
					sound = sp.play((int)(sid3), 1.0f, 1.0f, 1, (int)(0), 1.0f);
					showMessage("FALSE");
					vibe.vibrate((long)(50));
					if (button2.getText().toString().equals("Hanuman")) {
						if (button1.getText().toString().equals("Rama")) {
							if (button3.getText().toString().equals("Ravan")) {
								p2 = 900;
								p1 = 0;
								p3 = -500;
								p4 = 1000;
							}
							else {
								p2 = 900;
								p1 = 0;
								p3 = 1000;
								p4 = -500;
							}
						}
						else {
							if (button1.getText().toString().equals("Ravan")) {
								if (button3.getText().toString().equals("Rama")) {
									p2 = 900;
									p1 = -500;
									p3 = 0;
									p4 = 1000;
								}
								else {
									p2 = 900;
									p1 = -500;
									p3 = 1000;
									p4 = 0;
								}
							}
							else {
								if (button3.getText().toString().equals("Rama")) {
									p2 = 900;
									p1 = 1000;
									p3 = 0;
									p4 = -500;
								}
								else {
									p2 = 900;
									p1 = 1000;
									p3 = -500;
									p4 = 0;
								}
							}
						}
					}
					else {
						if (button1.getText().toString().equals("Rama")) {
							if (button3.getText().toString().equals("Hanuman")) {
								p2 = -500;
								p1 = 0;
								p3 = 900;
								p4 = 1000;
							}
							else {
								p2 = -500;
								p1 = 0;
								p3 = 1000;
								p4 = 900;
							}
						}
						else {
							if (button1.getText().toString().equals("Hanuman")) {
								if (button3.getText().toString().equals("Rama")) {
									p2 = -500;
									p1 = 900;
									p3 = 0;
									p4 = 1000;
								}
								else {
									p2 = -500;
									p1 = 900;
									p3 = 1000;
									p4 = 0;
								}
							}
							else {
								if (button3.getText().toString().equals("Rama")) {
									p2 = -500;
									p1 = 1000;
									p3 = 0;
									p4 = 900;
								}
								else {
									p2 = -500;
									p1 = 1000;
									p3 = 900;
									p4 = 0;
								}
							}
						}
					}
				}
				button1.setBackgroundColor(0xFF81D4FA);
				button2.setBackgroundColor(0xFF8C9EFF);
				button3.setBackgroundColor(0xFFFFE57F);
				button4.setBackgroundColor(0xFFA7FFEB);
				textview6.setText(String.valueOf((long)(Double.parseDouble(textview6.getText().toString()) + p1)));
				textview8.setText(String.valueOf((long)(Double.parseDouble(textview8.getText().toString()) + p2)));
				textview11.setText(String.valueOf((long)(Double.parseDouble(textview11.getText().toString()) + p3)));
				textview12.setText(String.valueOf((long)(Double.parseDouble(textview12.getText().toString()) + p4)));
				if (((Double.parseDouble(textview6.getText().toString()) == 10000) || (Double.parseDouble(textview6.getText().toString()) > 10000)) && ((Double.parseDouble(textview8.getText().toString()) < 10000) && ((Double.parseDouble(textview11.getText().toString()) < 10000) && (Double.parseDouble(textview12.getText().toString()) < 10000)))) {
					play.setEnabled(false);
					dia.setTitle(textview5.getText().toString().concat(" is the winner"));
					dia.setMessage("PLAY AGAIN?");
					dia.setPositiveButton("yes", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), PlayersActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.setNegativeButton("no", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), MainActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.create().show();
				}
				if (((Double.parseDouble(textview8.getText().toString()) == 10000) || (Double.parseDouble(textview8.getText().toString()) > 10000)) && ((Double.parseDouble(textview6.getText().toString()) < 10000) && ((Double.parseDouble(textview11.getText().toString()) < 10000) && (Double.parseDouble(textview12.getText().toString()) < 10000)))) {
					play.setEnabled(false);
					dia.setTitle(textview7.getText().toString().concat(" is the winner"));
					dia.setMessage("PLAY AGAIN?");
					dia.setPositiveButton("yes", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), PlayersActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.setNegativeButton("no", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), MainActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.create().show();
				}
				if (((Double.parseDouble(textview11.getText().toString()) == 10000) || (Double.parseDouble(textview11.getText().toString()) > 10000)) && ((Double.parseDouble(textview8.getText().toString()) < 10000) && ((Double.parseDouble(textview6.getText().toString()) < 10000) && (Double.parseDouble(textview12.getText().toString()) < 10000)))) {
					play.setEnabled(false);
					dia.setTitle(textview10.getText().toString().concat(" is the winner"));
					dia.setMessage("PLAY AGAIN?");
					dia.setPositiveButton("yes", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), PlayersActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.setNegativeButton("no", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), MainActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.create().show();
				}
				if (((Double.parseDouble(textview12.getText().toString()) == 10000) || (Double.parseDouble(textview12.getText().toString()) > 10000)) && ((Double.parseDouble(textview8.getText().toString()) < 10000) && ((Double.parseDouble(textview11.getText().toString()) < 10000) && (Double.parseDouble(textview6.getText().toString()) < 10000)))) {
					play.setEnabled(false);
					dia.setTitle(textview9.getText().toString().concat(" is the winner"));
					dia.setMessage("PLAY AGAIN?");
					dia.setPositiveButton("yes", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), PlayersActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.setNegativeButton("no", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), MainActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.create().show();
				}
				if (((Double.parseDouble(textview6.getText().toString()) > 10000) || (Double.parseDouble(textview6.getText().toString()) == 10000)) && ((Double.parseDouble(textview8.getText().toString()) > 10000) || (Double.parseDouble(textview8.getText().toString()) == 10000))) {
					play.setEnabled(false);
					if (Double.parseDouble(textview6.getText().toString()) == Double.parseDouble(textview8.getText().toString())) {
						dia.setTitle(textview5.getText().toString().concat(" and ".concat(textview7.getText().toString()).concat(" are the winners")));
					}
					else {
						if (Double.parseDouble(textview6.getText().toString()) > Double.parseDouble(textview8.getText().toString())) {
							dia.setTitle(textview5.getText().toString().concat(" is the winner"));
						}
						else {
							dia.setTitle(textview7.getText().toString().concat(" is the winner"));
						}
					}
					dia.setMessage("PLAY AGAIN?");
					dia.setPositiveButton("yes", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), PlayersActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.setNegativeButton("no", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), MainActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.create().show();
				}
				if (((Double.parseDouble(textview6.getText().toString()) > 10000) || (Double.parseDouble(textview6.getText().toString()) == 10000)) && ((Double.parseDouble(textview11.getText().toString()) > 10000) || (Double.parseDouble(textview11.getText().toString()) == 10000))) {
					play.setEnabled(false);
					if (Double.parseDouble(textview6.getText().toString()) == Double.parseDouble(textview11.getText().toString())) {
						dia.setTitle(textview5.getText().toString().concat(" and ".concat(textview10.getText().toString()).concat(" are the winners")));
					}
					else {
						if (Double.parseDouble(textview6.getText().toString()) > Double.parseDouble(textview11.getText().toString())) {
							dia.setTitle(textview5.getText().toString().concat(" is the winner"));
						}
						else {
							dia.setTitle(textview10.getText().toString().concat(" is the winner"));
						}
					}
					dia.setMessage("PLAY AGAIN?");
					dia.setPositiveButton("yes", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), PlayersActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.setNegativeButton("no", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), MainActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.create().show();
				}
				if (((Double.parseDouble(textview6.getText().toString()) > 10000) || (Double.parseDouble(textview6.getText().toString()) == 10000)) && ((Double.parseDouble(textview12.getText().toString()) > 10000) || (Double.parseDouble(textview12.getText().toString()) == 10000))) {
					play.setEnabled(false);
					if (Double.parseDouble(textview6.getText().toString()) == Double.parseDouble(textview12.getText().toString())) {
						dia.setTitle(textview5.getText().toString().concat(" and ".concat(textview9.getText().toString()).concat(" are the winners")));
					}
					else {
						if (Double.parseDouble(textview6.getText().toString()) > Double.parseDouble(textview12.getText().toString())) {
							dia.setTitle(textview5.getText().toString().concat(" is the winner"));
						}
						else {
							dia.setTitle(textview9.getText().toString().concat(" is the winner"));
						}
					}
					dia.setMessage("PLAY AGAIN?");
					dia.setPositiveButton("yes", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), PlayersActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.setNegativeButton("no", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), MainActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.create().show();
				}
				if (((Double.parseDouble(textview8.getText().toString()) > 10000) || (Double.parseDouble(textview8.getText().toString()) == 10000)) && ((Double.parseDouble(textview11.getText().toString()) > 10000) || (Double.parseDouble(textview11.getText().toString()) == 10000))) {
					play.setEnabled(false);
					if (Double.parseDouble(textview8.getText().toString()) == Double.parseDouble(textview11.getText().toString())) {
						dia.setTitle(textview7.getText().toString().concat(" and ".concat(textview10.getText().toString()).concat(" are the winners")));
					}
					else {
						if (Double.parseDouble(textview8.getText().toString()) > Double.parseDouble(textview11.getText().toString())) {
							dia.setTitle(textview7.getText().toString().concat(" is the winner"));
						}
						else {
							dia.setTitle(textview10.getText().toString().concat(" is the winner"));
						}
					}
					dia.setMessage("PLAY AGAIN?");
					dia.setPositiveButton("yes", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), PlayersActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.setNegativeButton("no", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), MainActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.create().show();
				}
				if (((Double.parseDouble(textview8.getText().toString()) > 10000) || (Double.parseDouble(textview8.getText().toString()) == 10000)) && ((Double.parseDouble(textview12.getText().toString()) > 10000) || (Double.parseDouble(textview12.getText().toString()) == 10000))) {
					play.setEnabled(false);
					if (Double.parseDouble(textview8.getText().toString()) == Double.parseDouble(textview12.getText().toString())) {
						dia.setTitle(textview7.getText().toString().concat(" and ".concat(textview9.getText().toString()).concat(" are the winners")));
					}
					else {
						if (Double.parseDouble(textview8.getText().toString()) > Double.parseDouble(textview12.getText().toString())) {
							dia.setTitle(textview7.getText().toString().concat(" is the winner"));
						}
						else {
							dia.setTitle(textview9.getText().toString().concat(" is the winner"));
						}
					}
					dia.setMessage("PLAY AGAIN?");
					dia.setPositiveButton("yes", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), PlayersActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.setNegativeButton("no", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), MainActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.create().show();
				}
				if (((Double.parseDouble(textview11.getText().toString()) > 10000) || (Double.parseDouble(textview11.getText().toString()) == 10000)) && ((Double.parseDouble(textview12.getText().toString()) > 10000) || (Double.parseDouble(textview12.getText().toString()) == 10000))) {
					play.setEnabled(false);
					if (Double.parseDouble(textview11.getText().toString()) == Double.parseDouble(textview12.getText().toString())) {
						dia.setTitle(textview10.getText().toString().concat(" and ".concat(textview9.getText().toString()).concat(" are the winners")));
					}
					else {
						if (Double.parseDouble(textview11.getText().toString()) > Double.parseDouble(textview12.getText().toString())) {
							dia.setTitle(textview10.getText().toString().concat(" is the winner"));
						}
						else {
							dia.setTitle(textview9.getText().toString().concat(" is the winner"));
						}
					}
					dia.setMessage("PLAY AGAIN?");
					dia.setPositiveButton("yes", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), PlayersActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.setNegativeButton("no", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), MainActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.create().show();
				}
			}
		});
		button3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) { 
				play.setEnabled(true);
				button1.setEnabled(false);
				button2.setEnabled(false);
				button3.setEnabled(false);
				button4.setEnabled(false);
				if (button3.getText().toString().equals("Sita")) {
					sound = sp.play((int)(sid2), 1.0f, 1.0f, 1, (int)(0), 1.0f);
					showMessage("TRUE");
					p3 = 0;
					if (button2.getText().toString().equals("Rama")) {
						if (button1.getText().toString().equals("Ravan")) {
							p2 = 1000;
							p1 = -500;
							p4 = 900;
						}
						else {
							p2 = 1000;
							p1 = 900;
							p4 = -500;
						}
					}
					if (button2.getText().toString().equals("Ravan")) {
						if (button1.getText().toString().equals("Rama")) {
							p2 = -500;
							p1 = 1000;
							p4 = 900;
						}
						else {
							p2 = -500;
							p1 = 900;
							p4 = 1000;
						}
					}
					if (button2.getText().toString().equals("Hanuman")) {
						if (button1.getText().toString().equals("Rama")) {
							p2 = 900;
							p1 = 1000;
							p4 = -500;
						}
						else {
							p2 = 900;
							p1 = -500;
							p4 = 1000;
						}
					}
				}
				else {
					sound = sp.play((int)(sid3), 1.0f, 1.0f, 1, (int)(0), 1.0f);
					showMessage("FALSE");
					vibe.vibrate((long)(50));
					if (button3.getText().toString().equals("Hanuman")) {
						if (button2.getText().toString().equals("Rama")) {
							if (button1.getText().toString().equals("Ravan")) {
								p3 = 900;
								p2 = 0;
								p1 = -500;
								p4 = 1000;
							}
							else {
								p3 = 900;
								p2 = 0;
								p1 = 1000;
								p4 = -500;
							}
						}
						else {
							if (button2.getText().toString().equals("Ravan")) {
								if (button1.getText().toString().equals("Rama")) {
									p3 = 900;
									p2 = -500;
									p1 = 0;
									p4 = 1000;
								}
								else {
									p3 = 900;
									p2 = -500;
									p1 = 1000;
									p4 = 0;
								}
							}
							else {
								if (button1.getText().toString().equals("Rama")) {
									p3 = 900;
									p2 = 1000;
									p1 = 0;
									p4 = -500;
								}
								else {
									p3 = 900;
									p2 = 1000;
									p1 = -500;
									p4 = 0;
								}
							}
						}
					}
					else {
						if (button2.getText().toString().equals("Rama")) {
							if (button1.getText().toString().equals("Hanuman")) {
								p3 = -500;
								p2 = 0;
								p1 = 900;
								p4 = 1000;
							}
							else {
								p3 = -500;
								p2 = 0;
								p1 = 1000;
								p4 = 900;
							}
						}
						else {
							if (button2.getText().toString().equals("Hanuman")) {
								if (button1.getText().toString().equals("Rama")) {
									p3 = -500;
									p2 = 900;
									p1 = 0;
									p4 = 1000;
								}
								else {
									p3 = -500;
									p2 = 900;
									p1 = 1000;
									p4 = 0;
								}
							}
							else {
								if (button2.getText().toString().equals("Rama")) {
									p3 = -500;
									p2 = 1000;
									p1 = 0;
									p4 = 900;
								}
								else {
									p3 = -500;
									p2 = 1000;
									p1 = 900;
									p4 = 0;
								}
							}
						}
					}
				}
				button1.setBackgroundColor(0xFF81D4FA);
				button2.setBackgroundColor(0xFF8C9EFF);
				button3.setBackgroundColor(0xFFFFE57F);
				button4.setBackgroundColor(0xFFA7FFEB);
				textview6.setText(String.valueOf((long)(Double.parseDouble(textview6.getText().toString()) + p1)));
				textview8.setText(String.valueOf((long)(Double.parseDouble(textview8.getText().toString()) + p2)));
				textview11.setText(String.valueOf((long)(Double.parseDouble(textview11.getText().toString()) + p3)));
				textview12.setText(String.valueOf((long)(Double.parseDouble(textview12.getText().toString()) + p4)));
				if (((Double.parseDouble(textview6.getText().toString()) == 10000) || (Double.parseDouble(textview6.getText().toString()) > 10000)) && ((Double.parseDouble(textview8.getText().toString()) < 10000) && ((Double.parseDouble(textview11.getText().toString()) < 10000) && (Double.parseDouble(textview12.getText().toString()) < 10000)))) {
					play.setEnabled(false);
					dia.setTitle(textview5.getText().toString().concat(" is the winner"));
					dia.setMessage("PLAY AGAIN?");
					dia.setPositiveButton("yes", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), PlayersActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.setNegativeButton("no", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), MainActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.create().show();
				}
				if (((Double.parseDouble(textview8.getText().toString()) == 10000) || (Double.parseDouble(textview8.getText().toString()) > 10000)) && ((Double.parseDouble(textview6.getText().toString()) < 10000) && ((Double.parseDouble(textview11.getText().toString()) < 10000) && (Double.parseDouble(textview12.getText().toString()) < 10000)))) {
					play.setEnabled(false);
					dia.setTitle(textview7.getText().toString().concat(" is the winner"));
					dia.setMessage("PLAY AGAIN?");
					dia.setPositiveButton("yes", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), PlayersActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.setNegativeButton("no", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), MainActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.create().show();
				}
				if (((Double.parseDouble(textview11.getText().toString()) == 10000) || (Double.parseDouble(textview11.getText().toString()) > 10000)) && ((Double.parseDouble(textview8.getText().toString()) < 10000) && ((Double.parseDouble(textview6.getText().toString()) < 10000) && (Double.parseDouble(textview12.getText().toString()) < 10000)))) {
					play.setEnabled(false);
					dia.setTitle(textview10.getText().toString().concat(" is the winner"));
					dia.setMessage("PLAY AGAIN?");
					dia.setPositiveButton("yes", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), PlayersActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.setNegativeButton("no", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), MainActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.create().show();
				}
				if (((Double.parseDouble(textview12.getText().toString()) == 10000) || (Double.parseDouble(textview12.getText().toString()) > 10000)) && ((Double.parseDouble(textview8.getText().toString()) < 10000) && ((Double.parseDouble(textview11.getText().toString()) < 10000) && (Double.parseDouble(textview6.getText().toString()) < 10000)))) {
					play.setEnabled(false);
					dia.setTitle(textview9.getText().toString().concat(" is the winner"));
					dia.setMessage("PLAY AGAIN?");
					dia.setPositiveButton("yes", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), PlayersActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.setNegativeButton("no", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), MainActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.create().show();
				}
				if (((Double.parseDouble(textview6.getText().toString()) > 10000) || (Double.parseDouble(textview6.getText().toString()) == 10000)) && ((Double.parseDouble(textview8.getText().toString()) > 10000) || (Double.parseDouble(textview8.getText().toString()) == 10000))) {
					play.setEnabled(false);
					if (Double.parseDouble(textview6.getText().toString()) == Double.parseDouble(textview8.getText().toString())) {
						dia.setTitle(textview5.getText().toString().concat(" and ".concat(textview7.getText().toString()).concat(" are the winners")));
					}
					else {
						if (Double.parseDouble(textview6.getText().toString()) > Double.parseDouble(textview8.getText().toString())) {
							dia.setTitle(textview5.getText().toString().concat(" is the winner"));
						}
						else {
							dia.setTitle(textview7.getText().toString().concat(" is the winner"));
						}
					}
					dia.setMessage("PLAY AGAIN?");
					dia.setPositiveButton("yes", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), PlayersActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.setNegativeButton("no", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), MainActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.create().show();
				}
				if (((Double.parseDouble(textview6.getText().toString()) > 10000) || (Double.parseDouble(textview6.getText().toString()) == 10000)) && ((Double.parseDouble(textview11.getText().toString()) > 10000) || (Double.parseDouble(textview11.getText().toString()) == 10000))) {
					play.setEnabled(false);
					if (Double.parseDouble(textview6.getText().toString()) == Double.parseDouble(textview11.getText().toString())) {
						dia.setTitle(textview5.getText().toString().concat(" and ".concat(textview10.getText().toString()).concat(" are the winners")));
					}
					else {
						if (Double.parseDouble(textview6.getText().toString()) > Double.parseDouble(textview11.getText().toString())) {
							dia.setTitle(textview5.getText().toString().concat(" is the winner"));
						}
						else {
							dia.setTitle(textview10.getText().toString().concat(" is the winner"));
						}
					}
					dia.setMessage("PLAY AGAIN?");
					dia.setPositiveButton("yes", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), PlayersActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.setNegativeButton("no", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), MainActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.create().show();
				}
				if (((Double.parseDouble(textview6.getText().toString()) > 10000) || (Double.parseDouble(textview6.getText().toString()) == 10000)) && ((Double.parseDouble(textview12.getText().toString()) > 10000) || (Double.parseDouble(textview12.getText().toString()) == 10000))) {
					play.setEnabled(false);
					if (Double.parseDouble(textview6.getText().toString()) == Double.parseDouble(textview12.getText().toString())) {
						dia.setTitle(textview5.getText().toString().concat(" and ".concat(textview9.getText().toString()).concat(" are the winners")));
					}
					else {
						if (Double.parseDouble(textview6.getText().toString()) > Double.parseDouble(textview12.getText().toString())) {
							dia.setTitle(textview5.getText().toString().concat(" is the winner"));
						}
						else {
							dia.setTitle(textview9.getText().toString().concat(" is the winner"));
						}
					}
					dia.setMessage("PLAY AGAIN?");
					dia.setPositiveButton("yes", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), PlayersActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.setNegativeButton("no", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), MainActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.create().show();
				}
				if (((Double.parseDouble(textview8.getText().toString()) > 10000) || (Double.parseDouble(textview8.getText().toString()) == 10000)) && ((Double.parseDouble(textview11.getText().toString()) > 10000) || (Double.parseDouble(textview11.getText().toString()) == 10000))) {
					play.setEnabled(false);
					if (Double.parseDouble(textview8.getText().toString()) == Double.parseDouble(textview11.getText().toString())) {
						dia.setTitle(textview7.getText().toString().concat(" and ".concat(textview10.getText().toString()).concat(" are the winners")));
					}
					else {
						if (Double.parseDouble(textview8.getText().toString()) > Double.parseDouble(textview11.getText().toString())) {
							dia.setTitle(textview7.getText().toString().concat(" is the winner"));
						}
						else {
							dia.setTitle(textview10.getText().toString().concat(" is the winner"));
						}
					}
					dia.setMessage("PLAY AGAIN?");
					dia.setPositiveButton("yes", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), PlayersActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.setNegativeButton("no", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), MainActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.create().show();
				}
				if (((Double.parseDouble(textview8.getText().toString()) > 10000) || (Double.parseDouble(textview8.getText().toString()) == 10000)) && ((Double.parseDouble(textview12.getText().toString()) > 10000) || (Double.parseDouble(textview12.getText().toString()) == 10000))) {
					play.setEnabled(false);
					if (Double.parseDouble(textview8.getText().toString()) == Double.parseDouble(textview12.getText().toString())) {
						dia.setTitle(textview7.getText().toString().concat(" and ".concat(textview9.getText().toString()).concat(" are the winners")));
					}
					else {
						if (Double.parseDouble(textview8.getText().toString()) > Double.parseDouble(textview12.getText().toString())) {
							dia.setTitle(textview7.getText().toString().concat(" is the winner"));
						}
						else {
							dia.setTitle(textview9.getText().toString().concat(" is the winner"));
						}
					}
					dia.setMessage("PLAY AGAIN?");
					dia.setPositiveButton("yes", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), PlayersActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.setNegativeButton("no", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), MainActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.create().show();
				}
				if (((Double.parseDouble(textview11.getText().toString()) > 10000) || (Double.parseDouble(textview11.getText().toString()) == 10000)) && ((Double.parseDouble(textview12.getText().toString()) > 10000) || (Double.parseDouble(textview12.getText().toString()) == 10000))) {
					play.setEnabled(false);
					if (Double.parseDouble(textview11.getText().toString()) == Double.parseDouble(textview12.getText().toString())) {
						dia.setTitle(textview10.getText().toString().concat(" and ".concat(textview9.getText().toString()).concat(" are the winners")));
					}
					else {
						if (Double.parseDouble(textview11.getText().toString()) > Double.parseDouble(textview12.getText().toString())) {
							dia.setTitle(textview10.getText().toString().concat(" is the winner"));
						}
						else {
							dia.setTitle(textview9.getText().toString().concat(" is the winner"));
						}
					}
					dia.setMessage("PLAY AGAIN?");
					dia.setPositiveButton("yes", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), PlayersActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.setNegativeButton("no", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
													screen.setAction(Intent.ACTION_VIEW);
								screen.setClass(getApplicationContext(), MainActivity.class);
								startActivity(screen);
								finish();
						}
					});
					dia.create().show();
				}
			}
		});

	}

	private void  initializeLogic() {
		textview1.setText(b.getString("x1", ""));
		textview5.setText(b.getString("x1", ""));
		textview2.setText(b.getString("x2", ""));
		textview7.setText(b.getString("x2", ""));
		textview4.setText(b.getString("x3", ""));
		textview9.setText(b.getString("x3", ""));
		textview3.setText(b.getString("x4", ""));
		textview10.setText(b.getString("x4", ""));
		button1.setEnabled(false);
		button2.setEnabled(false);
		button3.setEnabled(false);
		button4.setEnabled(false);
		p1 = 0;
		p2 = 0;
		p3 = 0;
		p4 = 0;
		rotate = 0;
		textview6.setText("0");
		textview8.setText("0");
		textview11.setText("0");
		textview12.setText("0");
		sp = new SoundPool((int)(3), AudioManager.STREAM_MUSIC, 0);
		sid1 = sp.load(getApplicationContext(), R.raw.click, 1);
		sid2 = sp.load(getApplicationContext(), R.raw.yes, 1);
		sid3 = sp.load(getApplicationContext(), R.raw.noo, 1);
		tsb = new TimerTask() {
					@Override
						public void run() {
							runOnUiThread(new Runnable() {
							@Override
								public void run() {
										oasb.setTarget(textview13);
								oasb.setPropertyName("alpha");
								oasb.setFloatValues((float)(0), (float)(1));
								oasb.setDuration((int)(500));
								oasb.start();
								}
							});
						}
					};
					_timer.scheduleAtFixedRate(tsb, (int)(0), (int)(500));
	}

	@Override
	public void onBackPressed() {
				exit.setTitle("Do you want to exit");
				exit.setMessage(" ");
				exit.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
											finish();
					}
				});
				exit.setNegativeButton("No", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
				
					}
				});
				exit.create().show();
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
