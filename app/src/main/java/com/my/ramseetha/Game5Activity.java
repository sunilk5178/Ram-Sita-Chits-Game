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


public class Game5Activity extends Activity {

	private LinearLayout linear1;
	private LinearLayout linear24;
	private LinearLayout linear7;
	private LinearLayout linear16;
	private LinearLayout linear2;
	private LinearLayout linear23;
	private LinearLayout linear13;
	private LinearLayout linear15;
	private TextView textview4;
	private Button button4;
	private TextView textview3;
	private Button button3;
	private LinearLayout linear6;
	private Button play;
	private LinearLayout linear5;
	private Button button5;
	private TextView textview5;
	private LinearLayout linear22;
	private TextView textview2;
	private Button button2;
	private LinearLayout linear4;
	private Button button1;
	private TextView textview1;
	private TextView textview22;
	private LinearLayout linear17;
	private LinearLayout linear19;
	private LinearLayout linear20;
	private LinearLayout linear21;
	private TextView textview12;
	private TextView textview14;
	private TextView textview15;
	private TextView textview16;
	private TextView textview17;
	private TextView textview13;
	private TextView textview18;
	private TextView textview19;
	private TextView textview20;
	private TextView textview21;

	private double sound = 0;
	private double sid1 = 0;
	private double sid2 = 0;
	private double sid3 = 0;
	private double p1 = 0;
	private double p2 = 0;
	private double p3 = 0;
	private double p4 = 0;
	private double p5 = 0;
	private double rotate = 0;
	private double select = 0;
	private double select2 = 0;
	private double select1 = 0;
	private double select3 = 0;
	private double select4 = 0;


	private Timer _timer = new Timer();
	private Intent screen = new Intent();
	private SharedPreferences b;
	private AlertDialog.Builder dia;
	private AlertDialog.Builder exit;
	private SoundPool sp;
	private Vibrator vibe;
	private TimerTask timer;
	private ObjectAnimator oa1 = new ObjectAnimator();
	private ObjectAnimator oa2 = new ObjectAnimator();
	private ObjectAnimator oa3 = new ObjectAnimator();
	private ObjectAnimator oa4 = new ObjectAnimator();
	private ObjectAnimator oa5 = new ObjectAnimator();
	private TimerTask tsb;
	private ObjectAnimator wish2 = new ObjectAnimator();


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.game5);
		initialize();
		initializeLogic();
	}

	private void  initialize() {
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear24 = (LinearLayout) findViewById(R.id.linear24);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		linear16 = (LinearLayout) findViewById(R.id.linear16);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear23 = (LinearLayout) findViewById(R.id.linear23);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		linear15 = (LinearLayout) findViewById(R.id.linear15);
		textview4 = (TextView) findViewById(R.id.textview4);
		button4 = (Button) findViewById(R.id.button4);
		textview3 = (TextView) findViewById(R.id.textview3);
		button3 = (Button) findViewById(R.id.button3);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		play = (Button) findViewById(R.id.play);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		button5 = (Button) findViewById(R.id.button5);
		textview5 = (TextView) findViewById(R.id.textview5);
		linear22 = (LinearLayout) findViewById(R.id.linear22);
		textview2 = (TextView) findViewById(R.id.textview2);
		button2 = (Button) findViewById(R.id.button2);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		button1 = (Button) findViewById(R.id.button1);
		textview1 = (TextView) findViewById(R.id.textview1);
		textview22 = (TextView) findViewById(R.id.textview22);
		linear17 = (LinearLayout) findViewById(R.id.linear17);
		linear19 = (LinearLayout) findViewById(R.id.linear19);
		linear20 = (LinearLayout) findViewById(R.id.linear20);
		linear21 = (LinearLayout) findViewById(R.id.linear21);
		textview12 = (TextView) findViewById(R.id.textview12);
		textview14 = (TextView) findViewById(R.id.textview14);
		textview15 = (TextView) findViewById(R.id.textview15);
		textview16 = (TextView) findViewById(R.id.textview16);
		textview17 = (TextView) findViewById(R.id.textview17);
		textview13 = (TextView) findViewById(R.id.textview13);
		textview18 = (TextView) findViewById(R.id.textview18);
		textview19 = (TextView) findViewById(R.id.textview19);
		textview20 = (TextView) findViewById(R.id.textview20);
		textview21 = (TextView) findViewById(R.id.textview21);


		b = getSharedPreferences("b", Activity.MODE_PRIVATE);
		dia = new AlertDialog.Builder(this);
		exit = new AlertDialog.Builder(this);

		vibe = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);









		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) { 
				play.setEnabled(true);
				button1.setEnabled(false);
				button2.setEnabled(false);
				button3.setEnabled(false);
				button4.setEnabled(false);
				button5.setEnabled(false);
				if (button1.getText().toString().equals("Sita")) {
					sound = sp.play((int)(sid2), 1.0f, 1.0f, 1, (int)(0), 1.0f);
					showMessage("TRUE");
					p1 = 0;
					if (button2.getText().toString().equals("Rama")) {
						p2 = 1000;
						if (button3.getText().toString().equals("Ravan")) {
							p3 = -500;
							if (button4.getText().toString().equals("Laxmana")) {
								p4 = 800;
								p5 = 900;
							}
							else {
								p4 = 900;
								p5 = 800;
							}
						}
						if (button3.getText().toString().equals("Laxmana")) {
							p3 = 800;
							if (button4.getText().toString().equals("Ravan")) {
								p4 = -500;
								p5 = 900;
							}
							else {
								p4 = 900;
								p5 = -500;
							}
						}
						if (button3.getText().toString().equals("Hanuman")) {
							p3 = 900;
							if (button4.getText().toString().equals("Laxmana")) {
								p4 = 800;
								p5 = -500;
							}
							else {
								p4 = -500;
								p5 = 800;
							}
						}
					}
					if (button2.getText().toString().equals("Ravan")) {
						p2 = -500;
						if (button3.getText().toString().equals("Rama")) {
							p3 = 1000;
							if (button4.getText().toString().equals("Laxmana")) {
								p4 = 800;
								p5 = 900;
							}
							else {
								p4 = 900;
								p5 = 800;
							}
						}
						if (button3.getText().toString().equals("Laxmana")) {
							p3 = 800;
							if (button4.getText().toString().equals("Rama")) {
								p4 = 1000;
								p5 = 900;
							}
							else {
								p4 = 900;
								p5 = 1000;
							}
						}
						if (button3.getText().toString().equals("Hanuman")) {
							p3 = 900;
							if (button4.getText().toString().equals("Laxmana")) {
								p4 = 800;
								p5 = 1000;
							}
							else {
								p4 = 1000;
								p5 = 800;
							}
						}
					}
					if (button2.getText().toString().equals("Laxmana")) {
						p2 = 800;
						if (button3.getText().toString().equals("Ravan")) {
							p3 = -500;
							if (button4.getText().toString().equals("Rama")) {
								p4 = 1000;
								p5 = 900;
							}
							else {
								p4 = 900;
								p5 = 1000;
							}
						}
						if (button3.getText().toString().equals("Rama")) {
							p3 = 1000;
							if (button4.getText().toString().equals("Ravan")) {
								p4 = -500;
								p5 = 900;
							}
							else {
								p4 = 900;
								p5 = -500;
							}
						}
						if (button3.getText().toString().equals("Hanuman")) {
							p3 = 900;
							if (button4.getText().toString().equals("Ravan")) {
								p4 = -500;
								p5 = 1000;
							}
							else {
								p4 = 1000;
								p5 = -500;
							}
						}
					}
					if (button2.getText().toString().equals("Hanuman")) {
						p2 = 900;
						if (button3.getText().toString().equals("Ravan")) {
							p3 = -500;
							if (button4.getText().toString().equals("Laxmana")) {
								p4 = 800;
								p5 = 1000;
							}
							else {
								p4 = 1000;
								p5 = 800;
							}
						}
						if (button3.getText().toString().equals("Laxmana")) {
							p3 = 800;
							if (button4.getText().toString().equals("Ravan")) {
								p4 = -500;
								p5 = 1000;
							}
							else {
								p4 = 1000;
								p5 = -500;
							}
						}
						if (button3.getText().toString().equals("Rama")) {
							p3 = 1000;
							if (button4.getText().toString().equals("Laxmana")) {
								p4 = 800;
								p5 = -500;
							}
							else {
								p4 = -500;
								p5 = 800;
							}
						}
					}
				}
				else {
					sound = sp.play((int)(sid3), 1.0f, 1.0f, 1, (int)(0), 1.0f);
					showMessage("FALSE");
					vibe.vibrate((long)(50));
					if (button1.getText().toString().equals("Laxmana")) {
						p1 = 800;
						if (button2.getText().toString().equals("Rama")) {
							p2 = 0;
							if (button3.getText().toString().equals("Ravan")) {
								p3 = -500;
								if (button4.getText().toString().equals("Sita")) {
									p4 = 1000;
									p5 = 900;
								}
								else {
									p4 = 900;
									p5 = 1000;
								}
							}
							if (button3.getText().toString().equals("Sita")) {
								p3 = 1000;
								if (button4.getText().toString().equals("Ravan")) {
									p4 = -500;
									p5 = 900;
								}
								else {
									p4 = 900;
									p5 = -500;
								}
							}
							if (button3.getText().toString().equals("Hanuman")) {
								p3 = 900;
								if (button4.getText().toString().equals("Ravan")) {
									p5 = 1000;
									p4 = -500;
								}
								else {
									p5 = -500;
									p4 = 1000;
								}
							}
						}
						if (button2.getText().toString().equals("Ravan")) {
							p2 = -500;
							if (button3.getText().toString().equals("Rama")) {
								p3 = 0;
								if (button4.getText().toString().equals("Hanuman")) {
									p5 = 1000;
									p4 = 900;
								}
								else {
									p5 = 900;
									p4 = 1000;
								}
							}
							if (button3.getText().toString().equals("Sita")) {
								p3 = 1000;
								if (button4.getText().toString().equals("Rama")) {
									p4 = 0;
									p5 = 900;
								}
								else {
									p4 = 900;
									p5 = 0;
								}
							}
							if (button3.getText().toString().equals("Hanuman")) {
								p3 = 900;
								if (button4.getText().toString().equals("Sita")) {
									p5 = 0;
									p4 = 1000;
								}
								else {
									p5 = 1000;
									p4 = 0;
								}
							}
						}
						if (button2.getText().toString().equals("Sita")) {
							p2 = 1000;
							if (button3.getText().toString().equals("Ravan")) {
								p3 = -500;
								if (button4.getText().toString().equals("Rama")) {
									p4 = 0;
									p5 = 900;
								}
								else {
									p4 = 900;
									p5 = 0;
								}
							}
							if (button3.getText().toString().equals("Rama")) {
								p3 = 0;
								if (button4.getText().toString().equals("Ravan")) {
									p4 = -500;
									p5 = 900;
								}
								else {
									p4 = 900;
									p5 = -500;
								}
							}
							if (button3.getText().toString().equals("Hanuman")) {
								p3 = 900;
								if (button4.getText().toString().equals("Ravan")) {
									p4 = -500;
									p5 = 0;
								}
								else {
									p4 = 0;
									p5 = -500;
								}
							}
						}
						if (button2.getText().toString().equals("Hanuman")) {
							p2 = 900;
							if (button3.getText().toString().equals("Ravan")) {
								p3 = -500;
								if (button4.getText().toString().equals("Sita")) {
									p5 = 0;
									p4 = 1000;
								}
								else {
									p5 = 1000;
									p4 = 0;
								}
							}
							if (button3.getText().toString().equals("Sita")) {
								p3 = 1000;
								if (button4.getText().toString().equals("Ravan")) {
									p4 = -500;
									p5 = 0;
								}
								else {
									p4 = 0;
									p5 = -500;
								}
							}
							if (button3.getText().toString().equals("Rama")) {
								p3 = 0;
								if (button4.getText().toString().equals("Ravan")) {
									p5 = 1000;
									p4 = -500;
								}
								else {
									p5 = -500;
									p4 = 1000;
								}
							}
						}
					}
					if (button1.getText().toString().equals("Ravan")) {
						p1 = -500;
						if (button2.getText().toString().equals("Rama")) {
							p2 = 0;
							if (button3.getText().toString().equals("Laxmana")) {
								p3 = 800;
								if (button4.getText().toString().equals("Sita")) {
									p4 = 1000;
									p5 = 900;
								}
								else {
									p4 = 900;
									p5 = 1000;
								}
							}
							if (button3.getText().toString().equals("Sita")) {
								p3 = 1000;
								if (button4.getText().toString().equals("Laxmana")) {
									p4 = 800;
									p5 = 900;
								}
								else {
									p4 = 900;
									p5 = 800;
								}
							}
							if (button3.getText().toString().equals("Hanuman")) {
								p3 = 900;
								if (button4.getText().toString().equals("Laxmana")) {
									p5 = 1000;
									p4 = 800;
								}
								else {
									p5 = 800;
									p4 = 1000;
								}
							}
						}
						if (button2.getText().toString().equals("Laxmana")) {
							p2 = 800;
							if (button3.getText().toString().equals("Rama")) {
								p3 = 0;
								if (button4.getText().toString().equals("Hanuman")) {
									p5 = 1000;
									p4 = 900;
								}
								else {
									p5 = 900;
									p4 = 1000;
								}
							}
							if (button3.getText().toString().equals("Sita")) {
								p3 = 1000;
								if (button4.getText().toString().equals("Rama")) {
									p4 = 0;
									p5 = 900;
								}
								else {
									p4 = 900;
									p5 = 0;
								}
							}
							if (button3.getText().toString().equals("Hanuman")) {
								p3 = 900;
								if (button4.getText().toString().equals("Sita")) {
									p5 = 0;
									p4 = 1000;
								}
								else {
									p5 = 1000;
									p4 = 0;
								}
							}
						}
						if (button2.getText().toString().equals("Sita")) {
							p2 = 1000;
							if (button3.getText().toString().equals("Laxmana")) {
								p3 = 800;
								if (button4.getText().toString().equals("Rama")) {
									p4 = 0;
									p5 = 900;
								}
								else {
									p4 = 900;
									p5 = 0;
								}
							}
							if (button3.getText().toString().equals("Rama")) {
								p3 = 0;
								if (button4.getText().toString().equals("Laxmana")) {
									p4 = 800;
									p5 = 900;
								}
								else {
									p4 = 900;
									p5 = 800;
								}
							}
							if (button3.getText().toString().equals("Hanuman")) {
								p3 = 900;
								if (button4.getText().toString().equals("Laxmana")) {
									p4 = 800;
									p5 = 0;
								}
								else {
									p4 = 0;
									p5 = 800;
								}
							}
						}
						if (button2.getText().toString().equals("Hanuman")) {
							p2 = 900;
							if (button3.getText().toString().equals("Laxmana")) {
								p3 = 800;
								if (button4.getText().toString().equals("Sita")) {
									p5 = 0;
									p4 = 1000;
								}
								else {
									p5 = 1000;
									p4 = 0;
								}
							}
							if (button3.getText().toString().equals("Sita")) {
								p3 = 1000;
								if (button4.getText().toString().equals("Laxmana")) {
									p4 = 800;
									p5 = 0;
								}
								else {
									p4 = 0;
									p5 = 800;
								}
							}
							if (button3.getText().toString().equals("Rama")) {
								p3 = 0;
								if (button4.getText().toString().equals("Sita")) {
									p4 = 1000;
									p5 = 800;
								}
								else {
									p5 = 1000;
									p4 = 800;
								}
							}
						}
					}
					if (button1.getText().toString().equals("Hanuman")) {
						p1 = 900;
						if (button2.getText().toString().equals("Rama")) {
							p2 = 0;
							if (button3.getText().toString().equals("Laxmana")) {
								p3 = 800;
								if (button4.getText().toString().equals("Sita")) {
									p4 = 1000;
									p5 = -500;
								}
								else {
									p4 = -500;
									p5 = 1000;
								}
							}
							if (button3.getText().toString().equals("Sita")) {
								p3 = 1000;
								if (button4.getText().toString().equals("Laxmana")) {
									p4 = 800;
									p5 = -500;
								}
								else {
									p4 = -500;
									p5 = 800;
								}
							}
							if (button3.getText().toString().equals("Ravan")) {
								p3 = -500;
								if (button4.getText().toString().equals("Laxmana")) {
									p5 = 1000;
									p4 = 800;
								}
								else {
									p5 = 800;
									p4 = 1000;
								}
							}
						}
						if (button2.getText().toString().equals("Laxmana")) {
							p2 = 800;
							if (button3.getText().toString().equals("Rama")) {
								p3 = 0;
								if (button4.getText().toString().equals("Ravan")) {
									p5 = 1000;
									p4 = -500;
								}
								else {
									p5 = -500;
									p4 = 1000;
								}
							}
							if (button3.getText().toString().equals("Sita")) {
								p3 = 1000;
								if (button4.getText().toString().equals("Rama")) {
									p4 = 0;
									p5 = -500;
								}
								else {
									p4 = -500;
									p5 = 0;
								}
							}
							if (button3.getText().toString().equals("Ravan")) {
								p3 = -500;
								if (button4.getText().toString().equals("Sita")) {
									p5 = 0;
									p4 = 1000;
								}
								else {
									p5 = 1000;
									p4 = 0;
								}
							}
						}
						if (button2.getText().toString().equals("Sita")) {
							p2 = 1000;
							if (button3.getText().toString().equals("Laxmana")) {
								p3 = 800;
								if (button4.getText().toString().equals("Rama")) {
									p4 = 0;
									p5 = -500;
								}
								else {
									p4 = -500;
									p5 = 0;
								}
							}
							if (button3.getText().toString().equals("Rama")) {
								p3 = 0;
								if (button4.getText().toString().equals("Laxmana")) {
									p4 = 800;
									p5 = -500;
								}
								else {
									p4 = -500;
									p5 = 800;
								}
							}
							if (button3.getText().toString().equals("Ravan")) {
								p3 = -500;
								if (button4.getText().toString().equals("Laxmana")) {
									p4 = 800;
									p5 = 0;
								}
								else {
									p4 = 0;
									p5 = 800;
								}
							}
						}
						if (button2.getText().toString().equals("Ravan")) {
							p2 = -500;
							if (button3.getText().toString().equals("Laxmana")) {
								p3 = 800;
								if (button4.getText().toString().equals("Sita")) {
									p5 = 0;
									p4 = 1000;
								}
								else {
									p5 = 1000;
									p4 = 0;
								}
							}
							if (button3.getText().toString().equals("Sita")) {
								p3 = 1000;
								if (button4.getText().toString().equals("Laxmana")) {
									p4 = 800;
									p5 = 0;
								}
								else {
									p4 = 0;
									p5 = 800;
								}
							}
							if (button3.getText().toString().equals("Rama")) {
								p3 = 0;
								if (button4.getText().toString().equals("Sita")) {
									p4 = 1000;
									p5 = 800;
								}
								else {
									p5 = 1000;
									p4 = 800;
								}
							}
						}
					}
				}
				button1.setBackgroundColor(0xFF81D4FA);
				button2.setBackgroundColor(0xFFEA80FC);
				button3.setBackgroundColor(0xFFFFE57F);
				button4.setBackgroundColor(0xFFA7FFEB);
				button5.setBackgroundColor(0xFF8C9EFF);
				textview13.setText(String.valueOf((long)(Double.parseDouble(textview13.getText().toString()) + p1)));
				textview18.setText(String.valueOf((long)(Double.parseDouble(textview18.getText().toString()) + p2)));
				textview19.setText(String.valueOf((long)(Double.parseDouble(textview19.getText().toString()) + p3)));
				textview20.setText(String.valueOf((long)(Double.parseDouble(textview20.getText().toString()) + p4)));
				textview21.setText(String.valueOf((long)(Double.parseDouble(textview21.getText().toString()) + p5)));
				if (Math.max(Double.parseDouble(textview13.getText().toString()), Math.max(Math.max(Double.parseDouble(textview18.getText().toString()), Double.parseDouble(textview19.getText().toString())), Math.max(Double.parseDouble(textview20.getText().toString()), Double.parseDouble(textview21.getText().toString())))) > 9999) {
					play.setEnabled(false);
					if (Double.parseDouble(textview13.getText().toString()) > Math.max(Double.parseDouble(textview18.getText().toString()), Math.max(Math.max(Double.parseDouble(textview19.getText().toString()), Double.parseDouble(textview20.getText().toString())), Double.parseDouble(textview21.getText().toString())))) {
						dia.setTitle(textview1.getText().toString().concat(" is the winner"));
					}
					if (Double.parseDouble(textview18.getText().toString()) > Math.max(Double.parseDouble(textview13.getText().toString()), Math.max(Math.max(Double.parseDouble(textview19.getText().toString()), Double.parseDouble(textview20.getText().toString())), Double.parseDouble(textview21.getText().toString())))) {
						dia.setTitle(textview2.getText().toString().concat(" is the winner"));
					}
					if (Double.parseDouble(textview19.getText().toString()) > Math.max(Double.parseDouble(textview13.getText().toString()), Math.max(Math.max(Double.parseDouble(textview18.getText().toString()), Double.parseDouble(textview20.getText().toString())), Double.parseDouble(textview21.getText().toString())))) {
						dia.setTitle(textview3.getText().toString().concat(" is the winner"));
					}
					if (Double.parseDouble(textview20.getText().toString()) > Math.max(Double.parseDouble(textview13.getText().toString()), Math.max(Math.max(Double.parseDouble(textview19.getText().toString()), Double.parseDouble(textview18.getText().toString())), Double.parseDouble(textview21.getText().toString())))) {
						dia.setTitle(textview4.getText().toString().concat(" is the winner"));
					}
					if (Double.parseDouble(textview21.getText().toString()) > Math.max(Double.parseDouble(textview18.getText().toString()), Math.max(Math.max(Double.parseDouble(textview19.getText().toString()), Double.parseDouble(textview20.getText().toString())), Double.parseDouble(textview13.getText().toString())))) {
						dia.setTitle(textview5.getText().toString().concat(" is the winner"));
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
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) { 
				play.setEnabled(true);
				button1.setEnabled(false);
				button2.setEnabled(false);
				button3.setEnabled(false);
				button4.setEnabled(false);
				button5.setEnabled(false);
				if (button2.getText().toString().equals("Sita")) {
					sound = sp.play((int)(sid2), 1.0f, 1.0f, 1, (int)(0), 1.0f);
					showMessage("TRUE");
					p2 = 0;
					if (button1.getText().toString().equals("Rama")) {
						p1 = 1000;
						if (button3.getText().toString().equals("Ravan")) {
							p3 = -500;
							if (button4.getText().toString().equals("Laxmana")) {
								p4 = 800;
								p5 = 900;
							}
							else {
								p4 = 900;
								p5 = 800;
							}
						}
						if (button3.getText().toString().equals("Laxmana")) {
							p3 = 800;
							if (button4.getText().toString().equals("Ravan")) {
								p4 = -500;
								p5 = 900;
							}
							else {
								p4 = 900;
								p5 = -500;
							}
						}
						if (button3.getText().toString().equals("Hanuman")) {
							p3 = 900;
							if (button4.getText().toString().equals("Laxmana")) {
								p4 = 800;
								p5 = -500;
							}
							else {
								p4 = -500;
								p5 = 800;
							}
						}
					}
					if (button1.getText().toString().equals("Ravan")) {
						p1 = -500;
						if (button3.getText().toString().equals("Rama")) {
							p3 = 1000;
							if (button4.getText().toString().equals("Laxmana")) {
								p4 = 800;
								p5 = 900;
							}
							else {
								p4 = 900;
								p5 = 800;
							}
						}
						if (button3.getText().toString().equals("Laxmana")) {
							p3 = 800;
							if (button4.getText().toString().equals("Rama")) {
								p4 = 1000;
								p5 = 900;
							}
							else {
								p4 = 900;
								p5 = 1000;
							}
						}
						if (button3.getText().toString().equals("Hanuman")) {
							p3 = 900;
							if (button4.getText().toString().equals("Laxmana")) {
								p4 = 800;
								p5 = 1000;
							}
							else {
								p4 = 1000;
								p5 = 800;
							}
						}
					}
					if (button1.getText().toString().equals("Laxmana")) {
						p1 = 800;
						if (button3.getText().toString().equals("Ravan")) {
							p3 = -500;
							if (button4.getText().toString().equals("Rama")) {
								p4 = 1000;
								p5 = 900;
							}
							else {
								p4 = 900;
								p5 = 1000;
							}
						}
						if (button3.getText().toString().equals("Rama")) {
							p3 = 1000;
							if (button4.getText().toString().equals("Ravan")) {
								p4 = -500;
								p5 = 900;
							}
							else {
								p4 = 900;
								p5 = -500;
							}
						}
						if (button3.getText().toString().equals("Hanuman")) {
							p3 = 900;
							if (button4.getText().toString().equals("Ravan")) {
								p4 = -500;
								p5 = 1000;
							}
							else {
								p4 = 1000;
								p5 = -500;
							}
						}
					}
					if (button1.getText().toString().equals("Hanuman")) {
						p1 = 900;
						if (button3.getText().toString().equals("Ravan")) {
							p3 = -500;
							if (button4.getText().toString().equals("Laxmana")) {
								p4 = 800;
								p5 = 1000;
							}
							else {
								p4 = 1000;
								p5 = 800;
							}
						}
						if (button3.getText().toString().equals("Laxmana")) {
							p3 = 800;
							if (button4.getText().toString().equals("Ravan")) {
								p4 = -500;
								p5 = 1000;
							}
							else {
								p4 = 1000;
								p5 = -500;
							}
						}
						if (button3.getText().toString().equals("Rama")) {
							p3 = 1000;
							if (button4.getText().toString().equals("Laxmana")) {
								p4 = 800;
								p5 = -500;
							}
							else {
								p4 = -500;
								p5 = 800;
							}
						}
					}
				}
				else {
					sound = sp.play((int)(sid3), 1.0f, 1.0f, 1, (int)(0), 1.0f);
					showMessage("FALSE");
					vibe.vibrate((long)(50));
					if (button2.getText().toString().equals("Laxmana")) {
						p2 = 800;
						if (button1.getText().toString().equals("Rama")) {
							p1 = 0;
							if (button3.getText().toString().equals("Ravan")) {
								p3 = -500;
								if (button4.getText().toString().equals("Sita")) {
									p4 = 1000;
									p5 = 900;
								}
								else {
									p4 = 900;
									p5 = 1000;
								}
							}
							if (button3.getText().toString().equals("Sita")) {
								p3 = 1000;
								if (button4.getText().toString().equals("Ravan")) {
									p4 = -500;
									p5 = 900;
								}
								else {
									p4 = 900;
									p5 = -500;
								}
							}
							if (button3.getText().toString().equals("Hanuman")) {
								p3 = 900;
								if (button4.getText().toString().equals("Ravan")) {
									p5 = 1000;
									p4 = -500;
								}
								else {
									p5 = -500;
									p4 = 1000;
								}
							}
						}
						if (button1.getText().toString().equals("Ravan")) {
							p1 = -500;
							if (button3.getText().toString().equals("Rama")) {
								p3 = 0;
								if (button4.getText().toString().equals("Hanuman")) {
									p5 = 1000;
									p4 = 900;
								}
								else {
									p5 = 900;
									p4 = 1000;
								}
							}
							if (button3.getText().toString().equals("Sita")) {
								p3 = 1000;
								if (button4.getText().toString().equals("Rama")) {
									p4 = 0;
									p5 = 900;
								}
								else {
									p4 = 900;
									p5 = 0;
								}
							}
							if (button3.getText().toString().equals("Hanuman")) {
								p3 = 900;
								if (button4.getText().toString().equals("Sita")) {
									p5 = 0;
									p4 = 1000;
								}
								else {
									p5 = 1000;
									p4 = 0;
								}
							}
						}
						if (button1.getText().toString().equals("Sita")) {
							p1 = 1000;
							if (button3.getText().toString().equals("Ravan")) {
								p3 = -500;
								if (button4.getText().toString().equals("Rama")) {
									p4 = 0;
									p5 = 900;
								}
								else {
									p4 = 900;
									p5 = 0;
								}
							}
							if (button3.getText().toString().equals("Rama")) {
								p3 = 0;
								if (button4.getText().toString().equals("Ravan")) {
									p4 = -500;
									p5 = 900;
								}
								else {
									p4 = 900;
									p5 = -500;
								}
							}
							if (button3.getText().toString().equals("Hanuman")) {
								p3 = 900;
								if (button4.getText().toString().equals("Ravan")) {
									p4 = -500;
									p5 = 0;
								}
								else {
									p4 = 0;
									p5 = -500;
								}
							}
						}
						if (button1.getText().toString().equals("Hanuman")) {
							p1 = 900;
							if (button3.getText().toString().equals("Ravan")) {
								p3 = -500;
								if (button4.getText().toString().equals("Sita")) {
									p5 = 0;
									p4 = 1000;
								}
								else {
									p5 = 1000;
									p4 = 0;
								}
							}
							if (button3.getText().toString().equals("Sita")) {
								p3 = 1000;
								if (button4.getText().toString().equals("Ravan")) {
									p4 = -500;
									p5 = 0;
								}
								else {
									p4 = 0;
									p5 = -500;
								}
							}
							if (button3.getText().toString().equals("Rama")) {
								p3 = 0;
								if (button4.getText().toString().equals("Ravan")) {
									p5 = 1000;
									p4 = -500;
								}
								else {
									p5 = -500;
									p4 = 1000;
								}
							}
						}
					}
					if (button2.getText().toString().equals("Ravan")) {
						p2 = -500;
						if (button1.getText().toString().equals("Rama")) {
							p1 = 0;
							if (button3.getText().toString().equals("Laxmana")) {
								p3 = 800;
								if (button4.getText().toString().equals("Sita")) {
									p4 = 1000;
									p5 = 900;
								}
								else {
									p4 = 900;
									p5 = 1000;
								}
							}
							if (button3.getText().toString().equals("Sita")) {
								p3 = 1000;
								if (button4.getText().toString().equals("Laxmana")) {
									p4 = 800;
									p5 = 900;
								}
								else {
									p4 = 900;
									p5 = 800;
								}
							}
							if (button3.getText().toString().equals("Hanuman")) {
								p3 = 900;
								if (button4.getText().toString().equals("Laxmana")) {
									p5 = 1000;
									p4 = 800;
								}
								else {
									p5 = 800;
									p4 = 1000;
								}
							}
						}
						if (button1.getText().toString().equals("Laxmana")) {
							p1 = 800;
							if (button3.getText().toString().equals("Rama")) {
								p3 = 0;
								if (button4.getText().toString().equals("Hanuman")) {
									p5 = 1000;
									p4 = 900;
								}
								else {
									p5 = 900;
									p4 = 1000;
								}
							}
							if (button3.getText().toString().equals("Sita")) {
								p3 = 1000;
								if (button4.getText().toString().equals("Rama")) {
									p4 = 0;
									p5 = 900;
								}
								else {
									p4 = 900;
									p5 = 0;
								}
							}
							if (button3.getText().toString().equals("Hanuman")) {
								p3 = 900;
								if (button4.getText().toString().equals("Sita")) {
									p5 = 0;
									p4 = 1000;
								}
								else {
									p5 = 1000;
									p4 = 0;
								}
							}
						}
						if (button1.getText().toString().equals("Sita")) {
							p1 = 1000;
							if (button3.getText().toString().equals("Laxmana")) {
								p3 = 800;
								if (button4.getText().toString().equals("Rama")) {
									p4 = 0;
									p5 = 900;
								}
								else {
									p4 = 900;
									p5 = 0;
								}
							}
							if (button3.getText().toString().equals("Rama")) {
								p3 = 0;
								if (button4.getText().toString().equals("Laxmana")) {
									p4 = 800;
									p5 = 900;
								}
								else {
									p4 = 900;
									p5 = 800;
								}
							}
							if (button3.getText().toString().equals("Hanuman")) {
								p3 = 900;
								if (button4.getText().toString().equals("Laxmana")) {
									p4 = 800;
									p5 = 0;
								}
								else {
									p4 = 0;
									p5 = 800;
								}
							}
						}
						if (button1.getText().toString().equals("Hanuman")) {
							p1 = 900;
							if (button3.getText().toString().equals("Laxmana")) {
								p3 = 800;
								if (button4.getText().toString().equals("Sita")) {
									p5 = 0;
									p4 = 1000;
								}
								else {
									p5 = 1000;
									p4 = 0;
								}
							}
							if (button3.getText().toString().equals("Sita")) {
								p3 = 1000;
								if (button4.getText().toString().equals("Laxmana")) {
									p4 = 800;
									p5 = 0;
								}
								else {
									p4 = 0;
									p5 = 800;
								}
							}
							if (button3.getText().toString().equals("Rama")) {
								p3 = 0;
								if (button4.getText().toString().equals("Sita")) {
									p4 = 1000;
									p5 = 800;
								}
								else {
									p5 = 1000;
									p4 = 800;
								}
							}
						}
					}
					if (button2.getText().toString().equals("Hanuman")) {
						p2 = 900;
						if (button1.getText().toString().equals("Rama")) {
							p1 = 0;
							if (button3.getText().toString().equals("Laxmana")) {
								p3 = 800;
								if (button4.getText().toString().equals("Sita")) {
									p4 = 1000;
									p5 = -500;
								}
								else {
									p4 = -500;
									p5 = 1000;
								}
							}
							if (button3.getText().toString().equals("Sita")) {
								p3 = 1000;
								if (button4.getText().toString().equals("Laxmana")) {
									p4 = 800;
									p5 = -500;
								}
								else {
									p4 = -500;
									p5 = 800;
								}
							}
							if (button3.getText().toString().equals("Ravan")) {
								p3 = -500;
								if (button4.getText().toString().equals("Laxmana")) {
									p5 = 1000;
									p4 = 800;
								}
								else {
									p5 = 800;
									p4 = 1000;
								}
							}
						}
						if (button1.getText().toString().equals("Laxmana")) {
							p1 = 800;
							if (button3.getText().toString().equals("Rama")) {
								p3 = 0;
								if (button4.getText().toString().equals("Ravan")) {
									p5 = 1000;
									p4 = -500;
								}
								else {
									p5 = -500;
									p4 = 1000;
								}
							}
							if (button3.getText().toString().equals("Sita")) {
								p3 = 1000;
								if (button4.getText().toString().equals("Rama")) {
									p4 = 0;
									p5 = -500;
								}
								else {
									p4 = -500;
									p5 = 0;
								}
							}
							if (button3.getText().toString().equals("Ravan")) {
								p3 = -500;
								if (button4.getText().toString().equals("Sita")) {
									p5 = 0;
									p4 = 1000;
								}
								else {
									p5 = 1000;
									p4 = 0;
								}
							}
						}
						if (button1.getText().toString().equals("Sita")) {
							p1 = 1000;
							if (button3.getText().toString().equals("Laxmana")) {
								p3 = 800;
								if (button4.getText().toString().equals("Rama")) {
									p4 = 0;
									p5 = -500;
								}
								else {
									p4 = -500;
									p5 = 0;
								}
							}
							if (button3.getText().toString().equals("Rama")) {
								p3 = 0;
								if (button4.getText().toString().equals("Laxmana")) {
									p4 = 800;
									p5 = -500;
								}
								else {
									p4 = -500;
									p5 = 800;
								}
							}
							if (button3.getText().toString().equals("Ravan")) {
								p3 = -500;
								if (button4.getText().toString().equals("Laxmana")) {
									p4 = 800;
									p5 = 0;
								}
								else {
									p4 = 0;
									p5 = 800;
								}
							}
						}
						if (button1.getText().toString().equals("Ravan")) {
							p1 = -500;
							if (button3.getText().toString().equals("Laxmana")) {
								p3 = 800;
								if (button4.getText().toString().equals("Sita")) {
									p5 = 0;
									p4 = 1000;
								}
								else {
									p5 = 1000;
									p4 = 0;
								}
							}
							if (button3.getText().toString().equals("Sita")) {
								p3 = 1000;
								if (button4.getText().toString().equals("Laxmana")) {
									p4 = 800;
									p5 = 0;
								}
								else {
									p4 = 0;
									p5 = 800;
								}
							}
							if (button3.getText().toString().equals("Rama")) {
								p3 = 0;
								if (button4.getText().toString().equals("Sita")) {
									p4 = 1000;
									p5 = 800;
								}
								else {
									p5 = 1000;
									p4 = 800;
								}
							}
						}
					}
				}
				button1.setBackgroundColor(0xFF81D4FA);
				button2.setBackgroundColor(0xFFEA80FC);
				button3.setBackgroundColor(0xFFFFE57F);
				button4.setBackgroundColor(0xFFA7FFEB);
				button5.setBackgroundColor(0xFF8C9EFF);
				textview13.setText(String.valueOf((long)(Double.parseDouble(textview13.getText().toString()) + p1)));
				textview18.setText(String.valueOf((long)(Double.parseDouble(textview18.getText().toString()) + p2)));
				textview19.setText(String.valueOf((long)(Double.parseDouble(textview19.getText().toString()) + p3)));
				textview20.setText(String.valueOf((long)(Double.parseDouble(textview20.getText().toString()) + p4)));
				textview21.setText(String.valueOf((long)(Double.parseDouble(textview21.getText().toString()) + p5)));
				if (Math.max(Double.parseDouble(textview13.getText().toString()), Math.max(Math.max(Double.parseDouble(textview18.getText().toString()), Double.parseDouble(textview19.getText().toString())), Math.max(Double.parseDouble(textview20.getText().toString()), Double.parseDouble(textview21.getText().toString())))) > 9999) {
					play.setEnabled(false);
					if (Double.parseDouble(textview13.getText().toString()) > Math.max(Double.parseDouble(textview18.getText().toString()), Math.max(Math.max(Double.parseDouble(textview19.getText().toString()), Double.parseDouble(textview20.getText().toString())), Double.parseDouble(textview21.getText().toString())))) {
						dia.setTitle(textview1.getText().toString().concat(" is the winner"));
					}
					if (Double.parseDouble(textview18.getText().toString()) > Math.max(Double.parseDouble(textview13.getText().toString()), Math.max(Math.max(Double.parseDouble(textview19.getText().toString()), Double.parseDouble(textview20.getText().toString())), Double.parseDouble(textview21.getText().toString())))) {
						dia.setTitle(textview2.getText().toString().concat(" is the winner"));
					}
					if (Double.parseDouble(textview19.getText().toString()) > Math.max(Double.parseDouble(textview13.getText().toString()), Math.max(Math.max(Double.parseDouble(textview18.getText().toString()), Double.parseDouble(textview20.getText().toString())), Double.parseDouble(textview21.getText().toString())))) {
						dia.setTitle(textview3.getText().toString().concat(" is the winner"));
					}
					if (Double.parseDouble(textview20.getText().toString()) > Math.max(Double.parseDouble(textview13.getText().toString()), Math.max(Math.max(Double.parseDouble(textview19.getText().toString()), Double.parseDouble(textview18.getText().toString())), Double.parseDouble(textview21.getText().toString())))) {
						dia.setTitle(textview4.getText().toString().concat(" is the winner"));
					}
					if (Double.parseDouble(textview21.getText().toString()) > Math.max(Double.parseDouble(textview18.getText().toString()), Math.max(Math.max(Double.parseDouble(textview19.getText().toString()), Double.parseDouble(textview20.getText().toString())), Double.parseDouble(textview13.getText().toString())))) {
						dia.setTitle(textview5.getText().toString().concat(" is the winner"));
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
		button5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) { 
				play.setEnabled(true);
				button1.setEnabled(false);
				button2.setEnabled(false);
				button3.setEnabled(false);
				button4.setEnabled(false);
				button5.setEnabled(false);
				if (button5.getText().toString().equals("Sita")) {
					sound = sp.play((int)(sid2), 1.0f, 1.0f, 1, (int)(0), 1.0f);
					showMessage("TRUE");
					p5 = 0;
					if (button1.getText().toString().equals("Rama")) {
						p1 = 1000;
						if (button3.getText().toString().equals("Ravan")) {
							p3 = -500;
							if (button4.getText().toString().equals("Laxmana")) {
								p4 = 800;
								p2 = 900;
							}
							else {
								p4 = 900;
								p2 = 800;
							}
						}
						if (button3.getText().toString().equals("Laxmana")) {
							p3 = 800;
							if (button4.getText().toString().equals("Ravan")) {
								p4 = -500;
								p2 = 900;
							}
							else {
								p4 = 900;
								p2 = -500;
							}
						}
						if (button3.getText().toString().equals("Hanuman")) {
							p3 = 900;
							if (button4.getText().toString().equals("Laxmana")) {
								p4 = 800;
								p2 = -500;
							}
							else {
								p4 = -500;
								p2 = 800;
							}
						}
					}
					if (button1.getText().toString().equals("Ravan")) {
						p1 = -500;
						if (button3.getText().toString().equals("Rama")) {
							p3 = 1000;
							if (button4.getText().toString().equals("Laxmana")) {
								p4 = 800;
								p2 = 900;
							}
							else {
								p4 = 900;
								p2 = 800;
							}
						}
						if (button3.getText().toString().equals("Laxmana")) {
							p3 = 800;
							if (button4.getText().toString().equals("Rama")) {
								p4 = 1000;
								p2 = 900;
							}
							else {
								p4 = 900;
								p2 = 1000;
							}
						}
						if (button3.getText().toString().equals("Hanuman")) {
							p3 = 900;
							if (button4.getText().toString().equals("Laxmana")) {
								p4 = 800;
								p2 = 1000;
							}
							else {
								p4 = 1000;
								p2 = 800;
							}
						}
					}
					if (button1.getText().toString().equals("Laxmana")) {
						p1 = 800;
						if (button3.getText().toString().equals("Ravan")) {
							p3 = -500;
							if (button4.getText().toString().equals("Rama")) {
								p4 = 1000;
								p2 = 900;
							}
							else {
								p4 = 900;
								p2 = 1000;
							}
						}
						if (button3.getText().toString().equals("Rama")) {
							p3 = 1000;
							if (button4.getText().toString().equals("Ravan")) {
								p4 = -500;
								p2 = 900;
							}
							else {
								p4 = 900;
								p2 = -500;
							}
						}
						if (button3.getText().toString().equals("Hanuman")) {
							p3 = 900;
							if (button4.getText().toString().equals("Ravan")) {
								p4 = -500;
								p2 = 1000;
							}
							else {
								p4 = 1000;
								p2 = -500;
							}
						}
					}
					if (button1.getText().toString().equals("Hanuman")) {
						p1 = 900;
						if (button3.getText().toString().equals("Ravan")) {
							p3 = -500;
							if (button4.getText().toString().equals("Laxmana")) {
								p4 = 800;
								p2 = 1000;
							}
							else {
								p4 = 1000;
								p2 = 800;
							}
						}
						if (button3.getText().toString().equals("Laxmana")) {
							p3 = 800;
							if (button4.getText().toString().equals("Ravan")) {
								p4 = -500;
								p2 = 1000;
							}
							else {
								p4 = 1000;
								p2 = -500;
							}
						}
						if (button3.getText().toString().equals("Rama")) {
							p3 = 1000;
							if (button4.getText().toString().equals("Laxmana")) {
								p4 = 800;
								p2 = -500;
							}
							else {
								p4 = -500;
								p2 = 800;
							}
						}
					}
				}
				else {
					sound = sp.play((int)(sid3), 1.0f, 1.0f, 1, (int)(0), 1.0f);
					showMessage("FALSE");
					vibe.vibrate((long)(50));
					if (button5.getText().toString().equals("Laxmana")) {
						p5 = 800;
						if (button1.getText().toString().equals("Rama")) {
							p1 = 0;
							if (button3.getText().toString().equals("Ravan")) {
								p3 = -500;
								if (button4.getText().toString().equals("Sita")) {
									p4 = 1000;
									p2 = 900;
								}
								else {
									p4 = 900;
									p2 = 1000;
								}
							}
							if (button3.getText().toString().equals("Sita")) {
								p3 = 1000;
								if (button4.getText().toString().equals("Ravan")) {
									p4 = -500;
									p2 = 900;
								}
								else {
									p4 = 900;
									p2 = -500;
								}
							}
							if (button3.getText().toString().equals("Hanuman")) {
								p3 = 900;
								if (button4.getText().toString().equals("Ravan")) {
									p2 = 1000;
									p4 = -500;
								}
								else {
									p2 = -500;
									p4 = 1000;
								}
							}
						}
						if (button1.getText().toString().equals("Ravan")) {
							p1 = -500;
							if (button3.getText().toString().equals("Rama")) {
								p3 = 0;
								if (button4.getText().toString().equals("Hanuman")) {
									p2 = 1000;
									p4 = 900;
								}
								else {
									p2 = 900;
									p4 = 1000;
								}
							}
							if (button3.getText().toString().equals("Sita")) {
								p3 = 1000;
								if (button4.getText().toString().equals("Rama")) {
									p4 = 0;
									p2 = 900;
								}
								else {
									p4 = 900;
									p2 = 0;
								}
							}
							if (button3.getText().toString().equals("Hanuman")) {
								p3 = 900;
								if (button4.getText().toString().equals("Sita")) {
									p2 = 0;
									p4 = 1000;
								}
								else {
									p2 = 1000;
									p4 = 0;
								}
							}
						}
						if (button1.getText().toString().equals("Sita")) {
							p1 = 1000;
							if (button3.getText().toString().equals("Ravan")) {
								p3 = -500;
								if (button4.getText().toString().equals("Rama")) {
									p4 = 0;
									p2 = 900;
								}
								else {
									p4 = 900;
									p2 = 0;
								}
							}
							if (button3.getText().toString().equals("Rama")) {
								p3 = 0;
								if (button4.getText().toString().equals("Ravan")) {
									p4 = -500;
									p2 = 900;
								}
								else {
									p4 = 900;
									p2 = -500;
								}
							}
							if (button3.getText().toString().equals("Hanuman")) {
								p3 = 900;
								if (button4.getText().toString().equals("Ravan")) {
									p4 = -500;
									p2 = 0;
								}
								else {
									p4 = 0;
									p2 = -500;
								}
							}
						}
						if (button1.getText().toString().equals("Hanuman")) {
							p1 = 900;
							if (button3.getText().toString().equals("Ravan")) {
								p3 = -500;
								if (button4.getText().toString().equals("Sita")) {
									p2 = 0;
									p4 = 1000;
								}
								else {
									p2 = 1000;
									p4 = 0;
								}
							}
							if (button3.getText().toString().equals("Sita")) {
								p3 = 1000;
								if (button4.getText().toString().equals("Ravan")) {
									p4 = -500;
									p2 = 0;
								}
								else {
									p4 = 0;
									p2 = -500;
								}
							}
							if (button3.getText().toString().equals("Rama")) {
								p3 = 0;
								if (button4.getText().toString().equals("Ravan")) {
									p2 = 1000;
									p4 = -500;
								}
								else {
									p2 = -500;
									p4 = 1000;
								}
							}
						}
					}
					if (button5.getText().toString().equals("Ravan")) {
						p5 = -500;
						if (button1.getText().toString().equals("Rama")) {
							p1 = 0;
							if (button3.getText().toString().equals("Laxmana")) {
								p3 = 800;
								if (button4.getText().toString().equals("Sita")) {
									p4 = 1000;
									p2 = 900;
								}
								else {
									p4 = 900;
									p2 = 1000;
								}
							}
							if (button3.getText().toString().equals("Sita")) {
								p3 = 1000;
								if (button4.getText().toString().equals("Laxmana")) {
									p4 = 800;
									p2 = 900;
								}
								else {
									p4 = 900;
									p2 = 800;
								}
							}
							if (button3.getText().toString().equals("Hanuman")) {
								p3 = 900;
								if (button4.getText().toString().equals("Laxmana")) {
									p2 = 1000;
									p4 = 800;
								}
								else {
									p2 = 800;
									p4 = 1000;
								}
							}
						}
						if (button1.getText().toString().equals("Laxmana")) {
							p1 = 800;
							if (button3.getText().toString().equals("Rama")) {
								p3 = 0;
								if (button4.getText().toString().equals("Hanuman")) {
									p2 = 1000;
									p4 = 900;
								}
								else {
									p2 = 900;
									p4 = 1000;
								}
							}
							if (button3.getText().toString().equals("Sita")) {
								p3 = 1000;
								if (button4.getText().toString().equals("Rama")) {
									p4 = 0;
									p2 = 900;
								}
								else {
									p4 = 900;
									p2 = 0;
								}
							}
							if (button3.getText().toString().equals("Hanuman")) {
								p3 = 900;
								if (button4.getText().toString().equals("Sita")) {
									p2 = 0;
									p4 = 1000;
								}
								else {
									p2 = 1000;
									p4 = 0;
								}
							}
						}
						if (button1.getText().toString().equals("Sita")) {
							p1 = 1000;
							if (button3.getText().toString().equals("Laxmana")) {
								p3 = 800;
								if (button4.getText().toString().equals("Rama")) {
									p4 = 0;
									p2 = 900;
								}
								else {
									p4 = 900;
									p2 = 0;
								}
							}
							if (button3.getText().toString().equals("Rama")) {
								p3 = 0;
								if (button4.getText().toString().equals("Laxmana")) {
									p4 = 800;
									p2 = 900;
								}
								else {
									p4 = 900;
									p2 = 800;
								}
							}
							if (button3.getText().toString().equals("Hanuman")) {
								p3 = 900;
								if (button4.getText().toString().equals("Laxmana")) {
									p4 = 800;
									p2 = 0;
								}
								else {
									p4 = 0;
									p2 = 800;
								}
							}
						}
						if (button1.getText().toString().equals("Hanuman")) {
							p1 = 900;
							if (button3.getText().toString().equals("Laxmana")) {
								p3 = 800;
								if (button4.getText().toString().equals("Sita")) {
									p2 = 0;
									p4 = 1000;
								}
								else {
									p2 = 1000;
									p4 = 0;
								}
							}
							if (button3.getText().toString().equals("Sita")) {
								p3 = 1000;
								if (button4.getText().toString().equals("Laxmana")) {
									p4 = 800;
									p2 = 0;
								}
								else {
									p4 = 0;
									p2 = 800;
								}
							}
							if (button3.getText().toString().equals("Rama")) {
								p3 = 0;
								if (button4.getText().toString().equals("Sita")) {
									p4 = 1000;
									p2 = 800;
								}
								else {
									p2 = 1000;
									p4 = 800;
								}
							}
						}
					}
					if (button5.getText().toString().equals("Hanuman")) {
						p5 = 900;
						if (button1.getText().toString().equals("Rama")) {
							p1 = 0;
							if (button3.getText().toString().equals("Laxmana")) {
								p3 = 800;
								if (button4.getText().toString().equals("Sita")) {
									p4 = 1000;
									p2 = -500;
								}
								else {
									p4 = -500;
									p2 = 1000;
								}
							}
							if (button3.getText().toString().equals("Sita")) {
								p3 = 1000;
								if (button4.getText().toString().equals("Laxmana")) {
									p4 = 800;
									p2 = -500;
								}
								else {
									p4 = -500;
									p2 = 800;
								}
							}
							if (button3.getText().toString().equals("Ravan")) {
								p3 = -500;
								if (button4.getText().toString().equals("Laxmana")) {
									p2 = 1000;
									p4 = 800;
								}
								else {
									p2 = 800;
									p4 = 1000;
								}
							}
						}
						if (button1.getText().toString().equals("Laxmana")) {
							p1 = 800;
							if (button3.getText().toString().equals("Rama")) {
								p3 = 0;
								if (button4.getText().toString().equals("Ravan")) {
									p2 = 1000;
									p4 = -500;
								}
								else {
									p2 = -500;
									p4 = 1000;
								}
							}
							if (button3.getText().toString().equals("Sita")) {
								p3 = 1000;
								if (button4.getText().toString().equals("Rama")) {
									p4 = 0;
									p2 = -500;
								}
								else {
									p4 = -500;
									p2 = 0;
								}
							}
							if (button3.getText().toString().equals("Ravan")) {
								p3 = -500;
								if (button4.getText().toString().equals("Sita")) {
									p2 = 0;
									p4 = 1000;
								}
								else {
									p2 = 1000;
									p4 = 0;
								}
							}
						}
						if (button1.getText().toString().equals("Sita")) {
							p1 = 1000;
							if (button3.getText().toString().equals("Laxmana")) {
								p3 = 800;
								if (button4.getText().toString().equals("Rama")) {
									p4 = 0;
									p2 = -500;
								}
								else {
									p4 = -500;
									p2 = 0;
								}
							}
							if (button3.getText().toString().equals("Rama")) {
								p3 = 0;
								if (button4.getText().toString().equals("Laxmana")) {
									p4 = 800;
									p2 = -500;
								}
								else {
									p4 = -500;
									p2 = 800;
								}
							}
							if (button3.getText().toString().equals("Ravan")) {
								p3 = -500;
								if (button4.getText().toString().equals("Laxmana")) {
									p4 = 800;
									p2 = 0;
								}
								else {
									p4 = 0;
									p2 = 800;
								}
							}
						}
						if (button1.getText().toString().equals("Ravan")) {
							p1 = -500;
							if (button3.getText().toString().equals("Laxmana")) {
								p3 = 800;
								if (button4.getText().toString().equals("Sita")) {
									p2 = 0;
									p4 = 1000;
								}
								else {
									p2 = 1000;
									p4 = 0;
								}
							}
							if (button3.getText().toString().equals("Sita")) {
								p3 = 1000;
								if (button4.getText().toString().equals("Laxmana")) {
									p4 = 800;
									p2 = 0;
								}
								else {
									p4 = 0;
									p2 = 800;
								}
							}
							if (button3.getText().toString().equals("Rama")) {
								p3 = 0;
								if (button4.getText().toString().equals("Sita")) {
									p4 = 1000;
									p2 = 800;
								}
								else {
									p2 = 1000;
									p4 = 800;
								}
							}
						}
					}
				}
				button1.setBackgroundColor(0xFF81D4FA);
				button2.setBackgroundColor(0xFFEA80FC);
				button3.setBackgroundColor(0xFFFFE57F);
				button4.setBackgroundColor(0xFFA7FFEB);
				button5.setBackgroundColor(0xFF8C9EFF);
				textview13.setText(String.valueOf((long)(Double.parseDouble(textview13.getText().toString()) + p1)));
				textview18.setText(String.valueOf((long)(Double.parseDouble(textview18.getText().toString()) + p2)));
				textview19.setText(String.valueOf((long)(Double.parseDouble(textview19.getText().toString()) + p3)));
				textview20.setText(String.valueOf((long)(Double.parseDouble(textview20.getText().toString()) + p4)));
				textview21.setText(String.valueOf((long)(Double.parseDouble(textview21.getText().toString()) + p5)));
				if (Math.max(Double.parseDouble(textview13.getText().toString()), Math.max(Math.max(Double.parseDouble(textview18.getText().toString()), Double.parseDouble(textview19.getText().toString())), Math.max(Double.parseDouble(textview20.getText().toString()), Double.parseDouble(textview21.getText().toString())))) > 9999) {
					play.setEnabled(false);
					if (Double.parseDouble(textview13.getText().toString()) > Math.max(Double.parseDouble(textview18.getText().toString()), Math.max(Math.max(Double.parseDouble(textview19.getText().toString()), Double.parseDouble(textview20.getText().toString())), Double.parseDouble(textview21.getText().toString())))) {
						dia.setTitle(textview1.getText().toString().concat(" is the winner"));
					}
					if (Double.parseDouble(textview18.getText().toString()) > Math.max(Double.parseDouble(textview13.getText().toString()), Math.max(Math.max(Double.parseDouble(textview19.getText().toString()), Double.parseDouble(textview20.getText().toString())), Double.parseDouble(textview21.getText().toString())))) {
						dia.setTitle(textview2.getText().toString().concat(" is the winner"));
					}
					if (Double.parseDouble(textview19.getText().toString()) > Math.max(Double.parseDouble(textview13.getText().toString()), Math.max(Math.max(Double.parseDouble(textview18.getText().toString()), Double.parseDouble(textview20.getText().toString())), Double.parseDouble(textview21.getText().toString())))) {
						dia.setTitle(textview3.getText().toString().concat(" is the winner"));
					}
					if (Double.parseDouble(textview20.getText().toString()) > Math.max(Double.parseDouble(textview13.getText().toString()), Math.max(Math.max(Double.parseDouble(textview19.getText().toString()), Double.parseDouble(textview18.getText().toString())), Double.parseDouble(textview21.getText().toString())))) {
						dia.setTitle(textview4.getText().toString().concat(" is the winner"));
					}
					if (Double.parseDouble(textview21.getText().toString()) > Math.max(Double.parseDouble(textview18.getText().toString()), Math.max(Math.max(Double.parseDouble(textview19.getText().toString()), Double.parseDouble(textview20.getText().toString())), Double.parseDouble(textview13.getText().toString())))) {
						dia.setTitle(textview5.getText().toString().concat(" is the winner"));
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
				play.setEnabled(false);
				button1.setBackgroundColor(0xFF000000);
				button2.setBackgroundColor(0xFF000000);
				button3.setBackgroundColor(0xFF000000);
				button4.setBackgroundColor(0xFF000000);
				button5.setBackgroundColor(0xFF000000);
				sound = sp.play((int)(sid1), 1.0f, 1.0f, 1, (int)(0), 1.0f);
				oa1.setTarget(button1);
				oa1.setPropertyName("rotation");
				oa1.setFloatValues((float)(0), (float)(3780));
				oa1.setDuration((int)(1000));
				oa1.start();
				oa2.setTarget(button2);
				oa2.setPropertyName("rotation");
				oa2.setFloatValues((float)(0), (float)(3600));
				oa2.setDuration((int)(1000));
				oa2.start();
				oa3.setTarget(button3);
				oa3.setPropertyName("rotation");
				oa3.setFloatValues((float)(0), (float)(3600));
				oa3.setDuration((int)(1000));
				oa3.start();
				oa4.setTarget(button4);
				oa4.setPropertyName("rotation");
				oa4.setFloatValues((float)(0), (float)(3600));
				oa4.setDuration((int)(1000));
				oa4.start();
				oa5.setTarget(button5);
				oa5.setPropertyName("rotation");
				oa5.setFloatValues((float)(0), (float)(3780));
				oa5.setDuration((int)(1000));
				oa5.start();
				timer = new TimerTask() {
							@Override
								public void run() {
									runOnUiThread(new Runnable() {
									@Override
										public void run() {
														select1 = getRandom((int)(1), (int)(5));
										if (select1 == 1) {
											button1.setEnabled(false);
											button2.setEnabled(true);
											button3.setEnabled(true);
											button4.setEnabled(true);
											button5.setEnabled(true);
											button1.setBackgroundColor(0xFF81D4FA);
											button1.setText("Rama");
											select2 = getRandom((int)(1), (int)(4));
											if (select2 == 1) {
												button2.setText("Laxmana");
												select3 = getRandom((int)(1), (int)(3));
												if (select3 == 1) {
													button3.setText("Hanuman");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button4.setText("Ravan");
														button5.setText("Sita");
													}
													if (select4 == 2) {
														button4.setText("Sita");
														button5.setText("Ravan");
													}
												}
												if (select3 == 2) {
													button3.setText("Ravan");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button4.setText("Hanuman");
														button5.setText("Sita");
													}
													if (select4 == 2) {
														button4.setText("Sita");
														button5.setText("Hanuman");
													}
												}
												if (select3 == 3) {
													button3.setText("Sita");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button4.setText("Ravan");
														button5.setText("Hanuman");
													}
													if (select4 == 2) {
														button4.setText("Hanuman");
														button5.setText("Ravan");
													}
												}
											}
											if (select2 == 2) {
												button2.setText("Hanuman");
												select3 = getRandom((int)(1), (int)(3));
												if (select3 == 1) {
													button3.setText("Laxmana");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button4.setText("Ravan");
														button5.setText("Sita");
													}
													if (select4 == 2) {
														button4.setText("Sita");
														button5.setText("Ravan");
													}
												}
												if (select3 == 2) {
													button3.setText("Ravan");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button4.setText("Laxmana");
														button5.setText("Sita");
													}
													if (select4 == 2) {
														button4.setText("Sita");
														button5.setText("Laxmana");
													}
												}
												if (select3 == 3) {
													button3.setText("Sita");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button4.setText("Ravan");
														button5.setText("Laxmana");
													}
													if (select4 == 2) {
														button4.setText("Laxmana");
														button5.setText("Ravan");
													}
												}
											}
											if (select2 == 3) {
												button2.setText("Ravan");
												select3 = getRandom((int)(1), (int)(3));
												if (select3 == 1) {
													button3.setText("Laxmana");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button4.setText("Hanuman");
														button5.setText("Sita");
													}
													if (select4 == 2) {
														button4.setText("Sita");
														button5.setText("Hanuman");
													}
												}
												if (select3 == 2) {
													button3.setText("Hanuman");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button4.setText("Laxmana");
														button5.setText("Sita");
													}
													if (select4 == 2) {
														button4.setText("Sita");
														button5.setText("Laxmana");
													}
												}
												if (select3 == 3) {
													button3.setText("Sita");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button4.setText("Hanuman");
														button5.setText("Laxmana");
													}
													if (select4 == 2) {
														button4.setText("Laxmana");
														button5.setText("Hanuman");
													}
												}
											}
											if (select2 == 4) {
												button2.setText("Sita");
												select3 = getRandom((int)(1), (int)(3));
												if (select3 == 1) {
													button3.setText("Laxmana");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button4.setText("Ravan");
														button5.setText("Hanuman");
													}
													if (select4 == 2) {
														button4.setText("Hanuman");
														button5.setText("Ravan");
													}
												}
												if (select3 == 2) {
													button3.setText("Ravan");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button4.setText("Laxmana");
														button5.setText("Hanuman");
													}
													if (select4 == 2) {
														button4.setText("Hanuman");
														button5.setText("Laxmana");
													}
												}
												if (select3 == 3) {
													button3.setText("Hanuman");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button4.setText("Ravan");
														button5.setText("Laxmana");
													}
													if (select4 == 2) {
														button4.setText("Laxmana");
														button5.setText("Ravan");
													}
												}
											}
										}
										if (select1 == 2) {
											button2.setEnabled(false);
											button1.setEnabled(true);
											button3.setEnabled(true);
											button4.setEnabled(true);
											button5.setEnabled(true);
											button2.setBackgroundColor(0xFFEA80FC);
											button2.setText("Rama");
											select2 = getRandom((int)(1), (int)(4));
											if (select2 == 1) {
												button1.setText("Laxmana");
												select3 = getRandom((int)(1), (int)(3));
												if (select3 == 1) {
													button3.setText("Hanuman");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button4.setText("Ravan");
														button5.setText("Sita");
													}
													if (select4 == 2) {
														button4.setText("Sita");
														button5.setText("Ravan");
													}
												}
												if (select3 == 2) {
													button3.setText("Ravan");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button4.setText("Hanuman");
														button5.setText("Sita");
													}
													if (select4 == 2) {
														button4.setText("Sita");
														button5.setText("Hanuman");
													}
												}
												if (select3 == 3) {
													button3.setText("Sita");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button4.setText("Ravan");
														button5.setText("Hanuman");
													}
													if (select4 == 2) {
														button4.setText("Hanuman");
														button5.setText("Ravan");
													}
												}
											}
											if (select2 == 2) {
												button1.setText("Hanuman");
												select3 = getRandom((int)(1), (int)(3));
												if (select3 == 1) {
													button3.setText("Laxmana");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button4.setText("Ravan");
														button5.setText("Sita");
													}
													if (select4 == 2) {
														button4.setText("Sita");
														button5.setText("Ravan");
													}
												}
												if (select3 == 2) {
													button3.setText("Ravan");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button4.setText("Laxmana");
														button5.setText("Sita");
													}
													if (select4 == 2) {
														button4.setText("Sita");
														button5.setText("Laxmana");
													}
												}
												if (select3 == 3) {
													button3.setText("Sita");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button4.setText("Ravan");
														button5.setText("Laxmana");
													}
													if (select4 == 2) {
														button4.setText("Laxmana");
														button5.setText("Ravan");
													}
												}
											}
											if (select2 == 3) {
												button1.setText("Ravan");
												select3 = getRandom((int)(1), (int)(3));
												if (select3 == 1) {
													button3.setText("Laxmana");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button4.setText("Hanuman");
														button5.setText("Sita");
													}
													if (select4 == 2) {
														button4.setText("Sita");
														button5.setText("Hanuman");
													}
												}
												if (select3 == 2) {
													button3.setText("Hanuman");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button4.setText("Laxmana");
														button5.setText("Sita");
													}
													if (select4 == 2) {
														button4.setText("Sita");
														button5.setText("Laxmana");
													}
												}
												if (select3 == 3) {
													button3.setText("Sita");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button4.setText("Hanuman");
														button5.setText("Laxmana");
													}
													if (select4 == 2) {
														button4.setText("Laxmana");
														button5.setText("Hanuman");
													}
												}
											}
											if (select2 == 4) {
												button1.setText("Sita");
												select3 = getRandom((int)(1), (int)(3));
												if (select3 == 1) {
													button3.setText("Laxmana");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button4.setText("Ravan");
														button5.setText("Hanuman");
													}
													if (select4 == 2) {
														button4.setText("Hanuman");
														button5.setText("Ravan");
													}
												}
												if (select3 == 2) {
													button3.setText("Ravan");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button4.setText("Laxmana");
														button5.setText("Hanuman");
													}
													if (select4 == 2) {
														button4.setText("Hanuman");
														button5.setText("Laxmana");
													}
												}
												if (select3 == 3) {
													button3.setText("Hanuman");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button4.setText("Ravan");
														button5.setText("Laxmana");
													}
													if (select4 == 2) {
														button4.setText("Laxmana");
														button5.setText("Ravan");
													}
												}
											}
										}
										if (select1 == 3) {
											button3.setEnabled(false);
											button2.setEnabled(true);
											button1.setEnabled(true);
											button4.setEnabled(true);
											button5.setEnabled(true);
											button3.setBackgroundColor(0xFFFFE57F);
											button3.setText("Rama");
											select2 = getRandom((int)(1), (int)(4));
											if (select2 == 1) {
												button2.setText("Laxmana");
												select3 = getRandom((int)(1), (int)(3));
												if (select3 == 1) {
													button1.setText("Hanuman");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button4.setText("Ravan");
														button5.setText("Sita");
													}
													if (select4 == 2) {
														button4.setText("Sita");
														button5.setText("Ravan");
													}
												}
												if (select3 == 2) {
													button1.setText("Ravan");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button4.setText("Hanuman");
														button5.setText("Sita");
													}
													if (select4 == 2) {
														button4.setText("Sita");
														button5.setText("Hanuman");
													}
												}
												if (select3 == 3) {
													button1.setText("Sita");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button4.setText("Ravan");
														button5.setText("Hanuman");
													}
													if (select4 == 2) {
														button4.setText("Hanuman");
														button5.setText("Ravan");
													}
												}
											}
											if (select2 == 2) {
												button2.setText("Hanuman");
												select3 = getRandom((int)(1), (int)(3));
												if (select3 == 1) {
													button1.setText("Laxmana");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button4.setText("Ravan");
														button5.setText("Sita");
													}
													if (select4 == 2) {
														button4.setText("Sita");
														button5.setText("Ravan");
													}
												}
												if (select3 == 2) {
													button1.setText("Ravan");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button4.setText("Laxmana");
														button5.setText("Sita");
													}
													if (select4 == 2) {
														button4.setText("Sita");
														button5.setText("Laxmana");
													}
												}
												if (select3 == 3) {
													button1.setText("Sita");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button4.setText("Ravan");
														button5.setText("Laxmana");
													}
													if (select4 == 2) {
														button4.setText("Laxmana");
														button5.setText("Ravan");
													}
												}
											}
											if (select2 == 3) {
												button2.setText("Ravan");
												select3 = getRandom((int)(1), (int)(3));
												if (select3 == 1) {
													button1.setText("Laxmana");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button4.setText("Hanuman");
														button5.setText("Sita");
													}
													if (select4 == 2) {
														button4.setText("Sita");
														button5.setText("Hanuman");
													}
												}
												if (select3 == 2) {
													button1.setText("Hanuman");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button4.setText("Laxmana");
														button5.setText("Sita");
													}
													if (select4 == 2) {
														button4.setText("Sita");
														button5.setText("Laxmana");
													}
												}
												if (select3 == 3) {
													button1.setText("Sita");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button4.setText("Hanuman");
														button5.setText("Laxmana");
													}
													if (select4 == 2) {
														button4.setText("Laxmana");
														button5.setText("Hanuman");
													}
												}
											}
											if (select2 == 4) {
												button2.setText("Sita");
												select3 = getRandom((int)(1), (int)(3));
												if (select3 == 1) {
													button1.setText("Laxmana");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button4.setText("Ravan");
														button5.setText("Hanuman");
													}
													if (select4 == 2) {
														button4.setText("Hanuman");
														button5.setText("Ravan");
													}
												}
												if (select3 == 2) {
													button1.setText("Ravan");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button4.setText("Laxmana");
														button5.setText("Hanuman");
													}
													if (select4 == 2) {
														button4.setText("Hanuman");
														button5.setText("Laxmana");
													}
												}
												if (select3 == 3) {
													button1.setText("Hanuman");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button4.setText("Ravan");
														button5.setText("Laxmana");
													}
													if (select4 == 2) {
														button4.setText("Laxmana");
														button5.setText("Ravan");
													}
												}
											}
										}
										if (select1 == 4) {
											button4.setEnabled(false);
											button2.setEnabled(true);
											button3.setEnabled(true);
											button1.setEnabled(true);
											button5.setEnabled(true);
											button4.setBackgroundColor(0xFFA7FFEB);
											button4.setText("Rama");
											select2 = getRandom((int)(1), (int)(4));
											if (select2 == 1) {
												button2.setText("Laxmana");
												select3 = getRandom((int)(1), (int)(3));
												if (select3 == 1) {
													button3.setText("Hanuman");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button1.setText("Ravan");
														button5.setText("Sita");
													}
													if (select4 == 2) {
														button1.setText("Sita");
														button5.setText("Ravan");
													}
												}
												if (select3 == 2) {
													button3.setText("Ravan");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button1.setText("Hanuman");
														button5.setText("Sita");
													}
													if (select4 == 2) {
														button1.setText("Sita");
														button5.setText("Hanuman");
													}
												}
												if (select3 == 3) {
													button3.setText("Sita");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button1.setText("Ravan");
														button5.setText("Hanuman");
													}
													if (select4 == 2) {
														button1.setText("Hanuman");
														button5.setText("Ravan");
													}
												}
											}
											if (select2 == 2) {
												button2.setText("Hanuman");
												select3 = getRandom((int)(1), (int)(3));
												if (select3 == 1) {
													button3.setText("Laxmana");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button1.setText("Ravan");
														button5.setText("Sita");
													}
													if (select4 == 2) {
														button1.setText("Sita");
														button5.setText("Ravan");
													}
												}
												if (select3 == 2) {
													button3.setText("Ravan");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button1.setText("Laxmana");
														button5.setText("Sita");
													}
													if (select4 == 2) {
														button1.setText("Sita");
														button5.setText("Laxmana");
													}
												}
												if (select3 == 3) {
													button3.setText("Sita");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button1.setText("Ravan");
														button5.setText("Laxmana");
													}
													if (select4 == 2) {
														button1.setText("Laxmana");
														button5.setText("Ravan");
													}
												}
											}
											if (select2 == 3) {
												button2.setText("Ravan");
												select3 = getRandom((int)(1), (int)(3));
												if (select3 == 1) {
													button3.setText("Laxmana");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button1.setText("Hanuman");
														button5.setText("Sita");
													}
													if (select4 == 2) {
														button1.setText("Sita");
														button5.setText("Hanuman");
													}
												}
												if (select3 == 2) {
													button3.setText("Hanuman");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button1.setText("Laxmana");
														button5.setText("Sita");
													}
													if (select4 == 2) {
														button1.setText("Sita");
														button5.setText("Laxmana");
													}
												}
												if (select3 == 3) {
													button3.setText("Sita");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button1.setText("Hanuman");
														button5.setText("Laxmana");
													}
													if (select4 == 2) {
														button1.setText("Laxmana");
														button5.setText("Hanuman");
													}
												}
											}
											if (select2 == 4) {
												button2.setText("Sita");
												select3 = getRandom((int)(1), (int)(3));
												if (select3 == 1) {
													button3.setText("Laxmana");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button1.setText("Ravan");
														button5.setText("Hanuman");
													}
													if (select4 == 2) {
														button1.setText("Hanuman");
														button5.setText("Ravan");
													}
												}
												if (select3 == 2) {
													button3.setText("Ravan");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button1.setText("Laxmana");
														button5.setText("Hanuman");
													}
													if (select4 == 2) {
														button1.setText("Hanuman");
														button5.setText("Laxmana");
													}
												}
												if (select3 == 3) {
													button3.setText("Hanuman");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button1.setText("Ravan");
														button5.setText("Laxmana");
													}
													if (select4 == 2) {
														button1.setText("Laxmana");
														button5.setText("Ravan");
													}
												}
											}
										}
										if (select1 == 5) {
											button5.setEnabled(false);
											button2.setEnabled(true);
											button3.setEnabled(true);
											button4.setEnabled(true);
											button1.setEnabled(true);
											button5.setBackgroundColor(0xFF8C9EFF);
											button5.setText("Rama");
											select2 = getRandom((int)(1), (int)(4));
											if (select2 == 1) {
												button2.setText("Laxmana");
												select3 = getRandom((int)(1), (int)(3));
												if (select3 == 1) {
													button3.setText("Hanuman");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button4.setText("Ravan");
														button1.setText("Sita");
													}
													if (select4 == 2) {
														button4.setText("Sita");
														button1.setText("Ravan");
													}
												}
												if (select3 == 2) {
													button3.setText("Ravan");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button4.setText("Hanuman");
														button1.setText("Sita");
													}
													if (select4 == 2) {
														button4.setText("Sita");
														button1.setText("Hanuman");
													}
												}
												if (select3 == 3) {
													button3.setText("Sita");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button4.setText("Ravan");
														button1.setText("Hanuman");
													}
													if (select4 == 2) {
														button4.setText("Hanuman");
														button1.setText("Ravan");
													}
												}
											}
											if (select2 == 2) {
												button2.setText("Hanuman");
												select3 = getRandom((int)(1), (int)(3));
												if (select3 == 1) {
													button3.setText("Laxmana");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button4.setText("Ravan");
														button1.setText("Sita");
													}
													if (select4 == 2) {
														button4.setText("Sita");
														button1.setText("Ravan");
													}
												}
												if (select3 == 2) {
													button3.setText("Ravan");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button4.setText("Laxmana");
														button1.setText("Sita");
													}
													if (select4 == 2) {
														button4.setText("Sita");
														button1.setText("Laxmana");
													}
												}
												if (select3 == 3) {
													button3.setText("Sita");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button4.setText("Ravan");
														button1.setText("Laxmana");
													}
													if (select4 == 2) {
														button4.setText("Laxmana");
														button1.setText("Ravan");
													}
												}
											}
											if (select2 == 3) {
												button2.setText("Ravan");
												select3 = getRandom((int)(1), (int)(3));
												if (select3 == 1) {
													button3.setText("Laxmana");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button4.setText("Hanuman");
														button1.setText("Sita");
													}
													if (select4 == 2) {
														button4.setText("Sita");
														button1.setText("Hanuman");
													}
												}
												if (select3 == 2) {
													button3.setText("Hanuman");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button4.setText("Laxmana");
														button1.setText("Sita");
													}
													if (select4 == 2) {
														button4.setText("Sita");
														button1.setText("Laxmana");
													}
												}
												if (select3 == 3) {
													button3.setText("Sita");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button4.setText("Hanuman");
														button1.setText("Laxmana");
													}
													if (select4 == 2) {
														button4.setText("Laxmana");
														button1.setText("Hanuman");
													}
												}
											}
											if (select2 == 4) {
												button2.setText("Sita");
												select3 = getRandom((int)(1), (int)(3));
												if (select3 == 1) {
													button3.setText("Laxmana");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button4.setText("Ravan");
														button1.setText("Hanuman");
													}
													if (select4 == 2) {
														button4.setText("Hanuman");
														button1.setText("Ravan");
													}
												}
												if (select3 == 2) {
													button3.setText("Ravan");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button4.setText("Laxmana");
														button1.setText("Hanuman");
													}
													if (select4 == 2) {
														button4.setText("Hanuman");
														button1.setText("Laxmana");
													}
												}
												if (select3 == 3) {
													button3.setText("Hanuman");
													select4 = getRandom((int)(1), (int)(2));
													if (select4 == 1) {
														button4.setText("Ravan");
														button1.setText("Laxmana");
													}
													if (select4 == 2) {
														button4.setText("Laxmana");
														button1.setText("Ravan");
													}
												}
											}
										}
										}
									});
								}
							};
							_timer.schedule(timer, (int)(1000));
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
				button5.setEnabled(false);
				if (button4.getText().toString().equals("Sita")) {
					sound = sp.play((int)(sid2), 1.0f, 1.0f, 1, (int)(0), 1.0f);
					showMessage("TRUE");
					p4 = 0;
					if (button2.getText().toString().equals("Rama")) {
						p2 = 1000;
						if (button3.getText().toString().equals("Ravan")) {
							p3 = -500;
							if (button1.getText().toString().equals("Laxmana")) {
								p1 = 800;
								p5 = 900;
							}
							else {
								p1 = 900;
								p5 = 800;
							}
						}
						if (button3.getText().toString().equals("Laxmana")) {
							p3 = 800;
							if (button1.getText().toString().equals("Ravan")) {
								p1 = -500;
								p5 = 900;
							}
							else {
								p1 = 900;
								p5 = -500;
							}
						}
						if (button3.getText().toString().equals("Hanuman")) {
							p3 = 900;
							if (button1.getText().toString().equals("Laxmana")) {
								p1 = 800;
								p5 = -500;
							}
							else {
								p1 = -500;
								p5 = 800;
							}
						}
					}
					if (button2.getText().toString().equals("Ravan")) {
						p2 = -500;
						if (button3.getText().toString().equals("Rama")) {
							p3 = 1000;
							if (button1.getText().toString().equals("Laxmana")) {
								p1 = 800;
								p5 = 900;
							}
							else {
								p1 = 900;
								p5 = 800;
							}
						}
						if (button3.getText().toString().equals("Laxmana")) {
							p3 = 800;
							if (button1.getText().toString().equals("Rama")) {
								p1 = 1000;
								p5 = 900;
							}
							else {
								p1 = 900;
								p5 = 1000;
							}
						}
						if (button3.getText().toString().equals("Hanuman")) {
							p3 = 900;
							if (button1.getText().toString().equals("Laxmana")) {
								p1 = 800;
								p5 = 1000;
							}
							else {
								p1 = 1000;
								p5 = 800;
							}
						}
					}
					if (button2.getText().toString().equals("Laxmana")) {
						p2 = 800;
						if (button3.getText().toString().equals("Ravan")) {
							p3 = -500;
							if (button1.getText().toString().equals("Rama")) {
								p1 = 1000;
								p5 = 900;
							}
							else {
								p1 = 900;
								p5 = 1000;
							}
						}
						if (button3.getText().toString().equals("Rama")) {
							p3 = 1000;
							if (button1.getText().toString().equals("Ravan")) {
								p1 = -500;
								p5 = 900;
							}
							else {
								p1 = 900;
								p5 = -500;
							}
						}
						if (button3.getText().toString().equals("Hanuman")) {
							p3 = 900;
							if (button1.getText().toString().equals("Ravan")) {
								p1 = -500;
								p5 = 1000;
							}
							else {
								p1 = 1000;
								p5 = -500;
							}
						}
					}
					if (button2.getText().toString().equals("Hanuman")) {
						p2 = 900;
						if (button3.getText().toString().equals("Ravan")) {
							p3 = -500;
							if (button1.getText().toString().equals("Laxmana")) {
								p1 = 800;
								p5 = 1000;
							}
							else {
								p1 = 1000;
								p5 = 800;
							}
						}
						if (button3.getText().toString().equals("Laxmana")) {
							p3 = 800;
							if (button1.getText().toString().equals("Ravan")) {
								p1 = -500;
								p5 = 1000;
							}
							else {
								p1 = 1000;
								p5 = -500;
							}
						}
						if (button3.getText().toString().equals("Rama")) {
							p3 = 1000;
							if (button1.getText().toString().equals("Laxmana")) {
								p1 = 800;
								p5 = -500;
							}
							else {
								p1 = -500;
								p5 = 800;
							}
						}
					}
				}
				else {
					sound = sp.play((int)(sid3), 1.0f, 1.0f, 1, (int)(0), 1.0f);
					showMessage("FALSE");
					vibe.vibrate((long)(50));
					if (button4.getText().toString().equals("Laxmana")) {
						p4 = 800;
						if (button2.getText().toString().equals("Rama")) {
							p2 = 0;
							if (button3.getText().toString().equals("Ravan")) {
								p3 = -500;
								if (button1.getText().toString().equals("Sita")) {
									p1 = 1000;
									p5 = 900;
								}
								else {
									p1 = 900;
									p5 = 1000;
								}
							}
							if (button3.getText().toString().equals("Sita")) {
								p3 = 1000;
								if (button1.getText().toString().equals("Ravan")) {
									p1 = -500;
									p5 = 900;
								}
								else {
									p1 = 900;
									p5 = -500;
								}
							}
							if (button3.getText().toString().equals("Hanuman")) {
								p3 = 900;
								if (button1.getText().toString().equals("Ravan")) {
									p5 = 1000;
									p1 = -500;
								}
								else {
									p5 = -500;
									p1 = 1000;
								}
							}
						}
						if (button2.getText().toString().equals("Ravan")) {
							p2 = -500;
							if (button3.getText().toString().equals("Rama")) {
								p3 = 0;
								if (button1.getText().toString().equals("Hanuman")) {
									p5 = 1000;
									p1 = 900;
								}
								else {
									p5 = 900;
									p1 = 1000;
								}
							}
							if (button3.getText().toString().equals("Sita")) {
								p3 = 1000;
								if (button1.getText().toString().equals("Rama")) {
									p1 = 0;
									p5 = 900;
								}
								else {
									p1 = 900;
									p5 = 0;
								}
							}
							if (button3.getText().toString().equals("Hanuman")) {
								p3 = 900;
								if (button1.getText().toString().equals("Sita")) {
									p5 = 0;
									p1 = 1000;
								}
								else {
									p5 = 1000;
									p1 = 0;
								}
							}
						}
						if (button2.getText().toString().equals("Sita")) {
							p2 = 1000;
							if (button3.getText().toString().equals("Ravan")) {
								p3 = -500;
								if (button1.getText().toString().equals("Rama")) {
									p1 = 0;
									p5 = 900;
								}
								else {
									p1 = 900;
									p5 = 0;
								}
							}
							if (button3.getText().toString().equals("Rama")) {
								p3 = 0;
								if (button1.getText().toString().equals("Ravan")) {
									p1 = -500;
									p5 = 900;
								}
								else {
									p1 = 900;
									p5 = -500;
								}
							}
							if (button3.getText().toString().equals("Hanuman")) {
								p3 = 900;
								if (button1.getText().toString().equals("Ravan")) {
									p1 = -500;
									p5 = 0;
								}
								else {
									p1 = 0;
									p5 = -500;
								}
							}
						}
						if (button2.getText().toString().equals("Hanuman")) {
							p2 = 900;
							if (button3.getText().toString().equals("Ravan")) {
								p3 = -500;
								if (button1.getText().toString().equals("Sita")) {
									p5 = 0;
									p1 = 1000;
								}
								else {
									p5 = 1000;
									p1 = 0;
								}
							}
							if (button3.getText().toString().equals("Sita")) {
								p3 = 1000;
								if (button1.getText().toString().equals("Ravan")) {
									p1 = -500;
									p5 = 0;
								}
								else {
									p1 = 0;
									p5 = -500;
								}
							}
							if (button3.getText().toString().equals("Rama")) {
								p3 = 0;
								if (button1.getText().toString().equals("Ravan")) {
									p5 = 1000;
									p1 = -500;
								}
								else {
									p5 = -500;
									p1 = 1000;
								}
							}
						}
					}
					if (button4.getText().toString().equals("Ravan")) {
						p4 = -500;
						if (button2.getText().toString().equals("Rama")) {
							p2 = 0;
							if (button3.getText().toString().equals("Laxmana")) {
								p3 = 800;
								if (button1.getText().toString().equals("Sita")) {
									p1 = 1000;
									p5 = 900;
								}
								else {
									p1 = 900;
									p5 = 1000;
								}
							}
							if (button3.getText().toString().equals("Sita")) {
								p3 = 1000;
								if (button1.getText().toString().equals("Laxmana")) {
									p1 = 800;
									p5 = 900;
								}
								else {
									p1 = 900;
									p5 = 800;
								}
							}
							if (button3.getText().toString().equals("Hanuman")) {
								p3 = 900;
								if (button1.getText().toString().equals("Laxmana")) {
									p5 = 1000;
									p1 = 800;
								}
								else {
									p5 = 800;
									p1 = 1000;
								}
							}
						}
						if (button2.getText().toString().equals("Laxmana")) {
							p2 = 800;
							if (button3.getText().toString().equals("Rama")) {
								p3 = 0;
								if (button1.getText().toString().equals("Hanuman")) {
									p5 = 1000;
									p1 = 900;
								}
								else {
									p5 = 900;
									p1 = 1000;
								}
							}
							if (button3.getText().toString().equals("Sita")) {
								p3 = 1000;
								if (button1.getText().toString().equals("Rama")) {
									p1 = 0;
									p5 = 900;
								}
								else {
									p1 = 900;
									p5 = 0;
								}
							}
							if (button3.getText().toString().equals("Hanuman")) {
								p3 = 900;
								if (button1.getText().toString().equals("Sita")) {
									p5 = 0;
									p1 = 1000;
								}
								else {
									p5 = 1000;
									p1 = 0;
								}
							}
						}
						if (button2.getText().toString().equals("Sita")) {
							p2 = 1000;
							if (button3.getText().toString().equals("Laxmana")) {
								p3 = 800;
								if (button1.getText().toString().equals("Rama")) {
									p1 = 0;
									p5 = 900;
								}
								else {
									p1 = 900;
									p5 = 0;
								}
							}
							if (button3.getText().toString().equals("Rama")) {
								p3 = 0;
								if (button1.getText().toString().equals("Laxmana")) {
									p1 = 800;
									p5 = 900;
								}
								else {
									p1 = 900;
									p5 = 800;
								}
							}
							if (button3.getText().toString().equals("Hanuman")) {
								p3 = 900;
								if (button1.getText().toString().equals("Laxmana")) {
									p1 = 800;
									p5 = 0;
								}
								else {
									p1 = 0;
									p5 = 800;
								}
							}
						}
						if (button2.getText().toString().equals("Hanuman")) {
							p2 = 900;
							if (button3.getText().toString().equals("Laxmana")) {
								p3 = 800;
								if (button1.getText().toString().equals("Sita")) {
									p5 = 0;
									p1 = 1000;
								}
								else {
									p5 = 1000;
									p1 = 0;
								}
							}
							if (button3.getText().toString().equals("Sita")) {
								p3 = 1000;
								if (button1.getText().toString().equals("Laxmana")) {
									p1 = 800;
									p5 = 0;
								}
								else {
									p1 = 0;
									p5 = 800;
								}
							}
							if (button3.getText().toString().equals("Rama")) {
								p3 = 0;
								if (button1.getText().toString().equals("Sita")) {
									p1 = 1000;
									p5 = 800;
								}
								else {
									p5 = 1000;
									p1 = 800;
								}
							}
						}
					}
					if (button4.getText().toString().equals("Hanuman")) {
						p4 = 900;
						if (button2.getText().toString().equals("Rama")) {
							p2 = 0;
							if (button3.getText().toString().equals("Laxmana")) {
								p3 = 800;
								if (button1.getText().toString().equals("Sita")) {
									p1 = 1000;
									p5 = -500;
								}
								else {
									p1 = -500;
									p5 = 1000;
								}
							}
							if (button3.getText().toString().equals("Sita")) {
								p3 = 1000;
								if (button1.getText().toString().equals("Laxmana")) {
									p1 = 800;
									p5 = -500;
								}
								else {
									p1 = -500;
									p5 = 800;
								}
							}
							if (button3.getText().toString().equals("Ravan")) {
								p3 = -500;
								if (button1.getText().toString().equals("Laxmana")) {
									p5 = 1000;
									p1 = 800;
								}
								else {
									p5 = 800;
									p1 = 1000;
								}
							}
						}
						if (button2.getText().toString().equals("Laxmana")) {
							p2 = 800;
							if (button3.getText().toString().equals("Rama")) {
								p3 = 0;
								if (button1.getText().toString().equals("Ravan")) {
									p5 = 1000;
									p1 = -500;
								}
								else {
									p5 = -500;
									p1 = 1000;
								}
							}
							if (button3.getText().toString().equals("Sita")) {
								p3 = 1000;
								if (button1.getText().toString().equals("Rama")) {
									p1 = 0;
									p5 = -500;
								}
								else {
									p1 = -500;
									p5 = 0;
								}
							}
							if (button3.getText().toString().equals("Ravan")) {
								p3 = -500;
								if (button1.getText().toString().equals("Sita")) {
									p5 = 0;
									p1 = 1000;
								}
								else {
									p5 = 1000;
									p1 = 0;
								}
							}
						}
						if (button2.getText().toString().equals("Sita")) {
							p2 = 1000;
							if (button3.getText().toString().equals("Laxmana")) {
								p3 = 800;
								if (button1.getText().toString().equals("Rama")) {
									p1 = 0;
									p5 = -500;
								}
								else {
									p1 = -500;
									p5 = 0;
								}
							}
							if (button3.getText().toString().equals("Rama")) {
								p3 = 0;
								if (button1.getText().toString().equals("Laxmana")) {
									p1 = 800;
									p5 = -500;
								}
								else {
									p1 = -500;
									p5 = 800;
								}
							}
							if (button3.getText().toString().equals("Ravan")) {
								p3 = -500;
								if (button1.getText().toString().equals("Laxmana")) {
									p1 = 800;
									p5 = 0;
								}
								else {
									p1 = 0;
									p5 = 800;
								}
							}
						}
						if (button2.getText().toString().equals("Ravan")) {
							p2 = -500;
							if (button3.getText().toString().equals("Laxmana")) {
								p3 = 800;
								if (button1.getText().toString().equals("Sita")) {
									p5 = 0;
									p1 = 1000;
								}
								else {
									p5 = 1000;
									p1 = 0;
								}
							}
							if (button3.getText().toString().equals("Sita")) {
								p3 = 1000;
								if (button1.getText().toString().equals("Laxmana")) {
									p1 = 800;
									p5 = 0;
								}
								else {
									p1 = 0;
									p5 = 800;
								}
							}
							if (button3.getText().toString().equals("Rama")) {
								p3 = 0;
								if (button1.getText().toString().equals("Sita")) {
									p1 = 1000;
									p5 = 800;
								}
								else {
									p5 = 1000;
									p1 = 800;
								}
							}
						}
					}
				}
				button1.setBackgroundColor(0xFF81D4FA);
				button2.setBackgroundColor(0xFFEA80FC);
				button3.setBackgroundColor(0xFFFFE57F);
				button4.setBackgroundColor(0xFFA7FFEB);
				button5.setBackgroundColor(0xFF8C9EFF);
				textview13.setText(String.valueOf((long)(Double.parseDouble(textview13.getText().toString()) + p1)));
				textview18.setText(String.valueOf((long)(Double.parseDouble(textview18.getText().toString()) + p2)));
				textview19.setText(String.valueOf((long)(Double.parseDouble(textview19.getText().toString()) + p3)));
				textview20.setText(String.valueOf((long)(Double.parseDouble(textview20.getText().toString()) + p4)));
				textview21.setText(String.valueOf((long)(Double.parseDouble(textview21.getText().toString()) + p5)));
				if (Math.max(Double.parseDouble(textview13.getText().toString()), Math.max(Math.max(Double.parseDouble(textview18.getText().toString()), Double.parseDouble(textview19.getText().toString())), Math.max(Double.parseDouble(textview20.getText().toString()), Double.parseDouble(textview21.getText().toString())))) > 9999) {
					play.setEnabled(false);
					if (Double.parseDouble(textview13.getText().toString()) > Math.max(Double.parseDouble(textview18.getText().toString()), Math.max(Math.max(Double.parseDouble(textview19.getText().toString()), Double.parseDouble(textview20.getText().toString())), Double.parseDouble(textview21.getText().toString())))) {
						dia.setTitle(textview1.getText().toString().concat(" is the winner"));
					}
					if (Double.parseDouble(textview18.getText().toString()) > Math.max(Double.parseDouble(textview13.getText().toString()), Math.max(Math.max(Double.parseDouble(textview19.getText().toString()), Double.parseDouble(textview20.getText().toString())), Double.parseDouble(textview21.getText().toString())))) {
						dia.setTitle(textview2.getText().toString().concat(" is the winner"));
					}
					if (Double.parseDouble(textview19.getText().toString()) > Math.max(Double.parseDouble(textview13.getText().toString()), Math.max(Math.max(Double.parseDouble(textview18.getText().toString()), Double.parseDouble(textview20.getText().toString())), Double.parseDouble(textview21.getText().toString())))) {
						dia.setTitle(textview3.getText().toString().concat(" is the winner"));
					}
					if (Double.parseDouble(textview20.getText().toString()) > Math.max(Double.parseDouble(textview13.getText().toString()), Math.max(Math.max(Double.parseDouble(textview19.getText().toString()), Double.parseDouble(textview18.getText().toString())), Double.parseDouble(textview21.getText().toString())))) {
						dia.setTitle(textview4.getText().toString().concat(" is the winner"));
					}
					if (Double.parseDouble(textview21.getText().toString()) > Math.max(Double.parseDouble(textview18.getText().toString()), Math.max(Math.max(Double.parseDouble(textview19.getText().toString()), Double.parseDouble(textview20.getText().toString())), Double.parseDouble(textview13.getText().toString())))) {
						dia.setTitle(textview5.getText().toString().concat(" is the winner"));
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
				button5.setEnabled(false);
				if (button3.getText().toString().equals("Sita")) {
					sound = sp.play((int)(sid2), 1.0f, 1.0f, 1, (int)(0), 1.0f);
					showMessage("TRUE");
					p3 = 0;
					if (button2.getText().toString().equals("Rama")) {
						p2 = 1000;
						if (button1.getText().toString().equals("Ravan")) {
							p1 = -500;
							if (button4.getText().toString().equals("Laxmana")) {
								p4 = 800;
								p5 = 900;
							}
							else {
								p4 = 900;
								p5 = 800;
							}
						}
						if (button1.getText().toString().equals("Laxmana")) {
							p1 = 800;
							if (button4.getText().toString().equals("Ravan")) {
								p4 = -500;
								p5 = 900;
							}
							else {
								p4 = 900;
								p5 = -500;
							}
						}
						if (button1.getText().toString().equals("Hanuman")) {
							p1 = 900;
							if (button4.getText().toString().equals("Laxmana")) {
								p4 = 800;
								p5 = -500;
							}
							else {
								p4 = -500;
								p5 = 800;
							}
						}
					}
					if (button2.getText().toString().equals("Ravan")) {
						p2 = -500;
						if (button1.getText().toString().equals("Rama")) {
							p1 = 1000;
							if (button4.getText().toString().equals("Laxmana")) {
								p4 = 800;
								p5 = 900;
							}
							else {
								p4 = 900;
								p5 = 800;
							}
						}
						if (button1.getText().toString().equals("Laxmana")) {
							p1 = 800;
							if (button4.getText().toString().equals("Rama")) {
								p4 = 1000;
								p5 = 900;
							}
							else {
								p4 = 900;
								p5 = 1000;
							}
						}
						if (button1.getText().toString().equals("Hanuman")) {
							p1 = 900;
							if (button4.getText().toString().equals("Laxmana")) {
								p4 = 800;
								p5 = 1000;
							}
							else {
								p4 = 1000;
								p5 = 800;
							}
						}
					}
					if (button2.getText().toString().equals("Laxmana")) {
						p2 = 800;
						if (button1.getText().toString().equals("Ravan")) {
							p1 = -500;
							if (button4.getText().toString().equals("Rama")) {
								p4 = 1000;
								p5 = 900;
							}
							else {
								p4 = 900;
								p5 = 1000;
							}
						}
						if (button1.getText().toString().equals("Rama")) {
							p1 = 1000;
							if (button4.getText().toString().equals("Ravan")) {
								p4 = -500;
								p5 = 900;
							}
							else {
								p4 = 900;
								p5 = -500;
							}
						}
						if (button1.getText().toString().equals("Hanuman")) {
							p1 = 900;
							if (button4.getText().toString().equals("Ravan")) {
								p4 = -500;
								p5 = 1000;
							}
							else {
								p4 = 1000;
								p5 = -500;
							}
						}
					}
					if (button2.getText().toString().equals("Hanuman")) {
						p2 = 900;
						if (button1.getText().toString().equals("Ravan")) {
							p1 = -500;
							if (button4.getText().toString().equals("Laxmana")) {
								p4 = 800;
								p5 = 1000;
							}
							else {
								p4 = 1000;
								p5 = 800;
							}
						}
						if (button1.getText().toString().equals("Laxmana")) {
							p1 = 800;
							if (button4.getText().toString().equals("Ravan")) {
								p4 = -500;
								p5 = 1000;
							}
							else {
								p4 = 1000;
								p5 = -500;
							}
						}
						if (button1.getText().toString().equals("Rama")) {
							p1 = 1000;
							if (button4.getText().toString().equals("Laxmana")) {
								p4 = 800;
								p5 = -500;
							}
							else {
								p4 = -500;
								p5 = 800;
							}
						}
					}
				}
				else {
					sound = sp.play((int)(sid3), 1.0f, 1.0f, 1, (int)(0), 1.0f);
					showMessage("FALSE");
					vibe.vibrate((long)(50));
					if (button3.getText().toString().equals("Laxmana")) {
						p3 = 800;
						if (button2.getText().toString().equals("Rama")) {
							p2 = 0;
							if (button1.getText().toString().equals("Ravan")) {
								p1 = -500;
								if (button4.getText().toString().equals("Sita")) {
									p4 = 1000;
									p5 = 900;
								}
								else {
									p4 = 900;
									p5 = 1000;
								}
							}
							if (button1.getText().toString().equals("Sita")) {
								p1 = 1000;
								if (button4.getText().toString().equals("Ravan")) {
									p4 = -500;
									p5 = 900;
								}
								else {
									p4 = 900;
									p5 = -500;
								}
							}
							if (button1.getText().toString().equals("Hanuman")) {
								p1 = 900;
								if (button4.getText().toString().equals("Ravan")) {
									p5 = 1000;
									p4 = -500;
								}
								else {
									p5 = -500;
									p4 = 1000;
								}
							}
						}
						if (button2.getText().toString().equals("Ravan")) {
							p2 = -500;
							if (button1.getText().toString().equals("Rama")) {
								p1 = 0;
								if (button4.getText().toString().equals("Hanuman")) {
									p5 = 1000;
									p4 = 900;
								}
								else {
									p5 = 900;
									p4 = 1000;
								}
							}
							if (button1.getText().toString().equals("Sita")) {
								p1 = 1000;
								if (button4.getText().toString().equals("Rama")) {
									p4 = 0;
									p5 = 900;
								}
								else {
									p4 = 900;
									p5 = 0;
								}
							}
							if (button1.getText().toString().equals("Hanuman")) {
								p1 = 900;
								if (button4.getText().toString().equals("Sita")) {
									p5 = 0;
									p4 = 1000;
								}
								else {
									p5 = 1000;
									p4 = 0;
								}
							}
						}
						if (button2.getText().toString().equals("Sita")) {
							p2 = 1000;
							if (button1.getText().toString().equals("Ravan")) {
								p1 = -500;
								if (button4.getText().toString().equals("Rama")) {
									p4 = 0;
									p5 = 900;
								}
								else {
									p4 = 900;
									p5 = 0;
								}
							}
							if (button1.getText().toString().equals("Rama")) {
								p1 = 0;
								if (button4.getText().toString().equals("Ravan")) {
									p4 = -500;
									p5 = 900;
								}
								else {
									p4 = 900;
									p5 = -500;
								}
							}
							if (button1.getText().toString().equals("Hanuman")) {
								p1 = 900;
								if (button4.getText().toString().equals("Ravan")) {
									p4 = -500;
									p5 = 0;
								}
								else {
									p4 = 0;
									p5 = -500;
								}
							}
						}
						if (button2.getText().toString().equals("Hanuman")) {
							p2 = 900;
							if (button1.getText().toString().equals("Ravan")) {
								p1 = -500;
								if (button4.getText().toString().equals("Sita")) {
									p5 = 0;
									p4 = 1000;
								}
								else {
									p5 = 1000;
									p4 = 0;
								}
							}
							if (button1.getText().toString().equals("Sita")) {
								p1 = 1000;
								if (button4.getText().toString().equals("Ravan")) {
									p4 = -500;
									p5 = 0;
								}
								else {
									p4 = 0;
									p5 = -500;
								}
							}
							if (button1.getText().toString().equals("Rama")) {
								p1 = 0;
								if (button4.getText().toString().equals("Ravan")) {
									p5 = 1000;
									p4 = -500;
								}
								else {
									p5 = -500;
									p4 = 1000;
								}
							}
						}
					}
					if (button3.getText().toString().equals("Ravan")) {
						p3 = -500;
						if (button2.getText().toString().equals("Rama")) {
							p2 = 0;
							if (button1.getText().toString().equals("Laxmana")) {
								p1 = 800;
								if (button4.getText().toString().equals("Sita")) {
									p4 = 1000;
									p5 = 900;
								}
								else {
									p4 = 900;
									p5 = 1000;
								}
							}
							if (button1.getText().toString().equals("Sita")) {
								p1 = 1000;
								if (button4.getText().toString().equals("Laxmana")) {
									p4 = 800;
									p5 = 900;
								}
								else {
									p4 = 900;
									p5 = 800;
								}
							}
							if (button1.getText().toString().equals("Hanuman")) {
								p1 = 900;
								if (button4.getText().toString().equals("Laxmana")) {
									p5 = 1000;
									p4 = 800;
								}
								else {
									p5 = 800;
									p4 = 1000;
								}
							}
						}
						if (button2.getText().toString().equals("Laxmana")) {
							p2 = 800;
							if (button1.getText().toString().equals("Rama")) {
								p1 = 0;
								if (button4.getText().toString().equals("Hanuman")) {
									p5 = 1000;
									p4 = 900;
								}
								else {
									p5 = 900;
									p4 = 1000;
								}
							}
							if (button1.getText().toString().equals("Sita")) {
								p1 = 1000;
								if (button4.getText().toString().equals("Rama")) {
									p4 = 0;
									p5 = 900;
								}
								else {
									p4 = 900;
									p5 = 0;
								}
							}
							if (button1.getText().toString().equals("Hanuman")) {
								p1 = 900;
								if (button4.getText().toString().equals("Sita")) {
									p5 = 0;
									p4 = 1000;
								}
								else {
									p5 = 1000;
									p4 = 0;
								}
							}
						}
						if (button2.getText().toString().equals("Sita")) {
							p2 = 1000;
							if (button1.getText().toString().equals("Laxmana")) {
								p1 = 800;
								if (button4.getText().toString().equals("Rama")) {
									p4 = 0;
									p5 = 900;
								}
								else {
									p4 = 900;
									p5 = 0;
								}
							}
							if (button1.getText().toString().equals("Rama")) {
								p1 = 0;
								if (button4.getText().toString().equals("Laxmana")) {
									p4 = 800;
									p5 = 900;
								}
								else {
									p4 = 900;
									p5 = 800;
								}
							}
							if (button1.getText().toString().equals("Hanuman")) {
								p1 = 900;
								if (button4.getText().toString().equals("Laxmana")) {
									p4 = 800;
									p5 = 0;
								}
								else {
									p4 = 0;
									p5 = 800;
								}
							}
						}
						if (button2.getText().toString().equals("Hanuman")) {
							p2 = 900;
							if (button1.getText().toString().equals("Laxmana")) {
								p1 = 800;
								if (button4.getText().toString().equals("Sita")) {
									p5 = 0;
									p4 = 1000;
								}
								else {
									p5 = 1000;
									p4 = 0;
								}
							}
							if (button1.getText().toString().equals("Sita")) {
								p1 = 1000;
								if (button4.getText().toString().equals("Laxmana")) {
									p4 = 800;
									p5 = 0;
								}
								else {
									p4 = 0;
									p5 = 800;
								}
							}
							if (button1.getText().toString().equals("Rama")) {
								p1 = 0;
								if (button4.getText().toString().equals("Sita")) {
									p4 = 1000;
									p5 = 800;
								}
								else {
									p5 = 1000;
									p4 = 800;
								}
							}
						}
					}
					if (button3.getText().toString().equals("Hanuman")) {
						p3 = 900;
						if (button2.getText().toString().equals("Rama")) {
							p2 = 0;
							if (button1.getText().toString().equals("Laxmana")) {
								p1 = 800;
								if (button4.getText().toString().equals("Sita")) {
									p4 = 1000;
									p5 = -500;
								}
								else {
									p4 = -500;
									p5 = 1000;
								}
							}
							if (button1.getText().toString().equals("Sita")) {
								p1 = 1000;
								if (button4.getText().toString().equals("Laxmana")) {
									p4 = 800;
									p5 = -500;
								}
								else {
									p4 = -500;
									p5 = 800;
								}
							}
							if (button1.getText().toString().equals("Ravan")) {
								p1 = -500;
								if (button4.getText().toString().equals("Laxmana")) {
									p5 = 1000;
									p4 = 800;
								}
								else {
									p5 = 800;
									p4 = 1000;
								}
							}
						}
						if (button2.getText().toString().equals("Laxmana")) {
							p2 = 800;
							if (button1.getText().toString().equals("Rama")) {
								p1 = 0;
								if (button4.getText().toString().equals("Ravan")) {
									p5 = 1000;
									p4 = -500;
								}
								else {
									p5 = -500;
									p4 = 1000;
								}
							}
							if (button1.getText().toString().equals("Sita")) {
								p1 = 1000;
								if (button4.getText().toString().equals("Rama")) {
									p4 = 0;
									p5 = -500;
								}
								else {
									p4 = -500;
									p5 = 0;
								}
							}
							if (button1.getText().toString().equals("Ravan")) {
								p1 = -500;
								if (button4.getText().toString().equals("Sita")) {
									p5 = 0;
									p4 = 1000;
								}
								else {
									p5 = 1000;
									p4 = 0;
								}
							}
						}
						if (button2.getText().toString().equals("Sita")) {
							p2 = 1000;
							if (button1.getText().toString().equals("Laxmana")) {
								p1 = 800;
								if (button4.getText().toString().equals("Rama")) {
									p4 = 0;
									p5 = -500;
								}
								else {
									p4 = -500;
									p5 = 0;
								}
							}
							if (button1.getText().toString().equals("Rama")) {
								p1 = 0;
								if (button4.getText().toString().equals("Laxmana")) {
									p4 = 800;
									p5 = -500;
								}
								else {
									p4 = -500;
									p5 = 800;
								}
							}
							if (button1.getText().toString().equals("Ravan")) {
								p1 = -500;
								if (button4.getText().toString().equals("Laxmana")) {
									p4 = 800;
									p5 = 0;
								}
								else {
									p4 = 0;
									p5 = 800;
								}
							}
						}
						if (button2.getText().toString().equals("Ravan")) {
							p2 = -500;
							if (button1.getText().toString().equals("Laxmana")) {
								p1 = 800;
								if (button4.getText().toString().equals("Sita")) {
									p5 = 0;
									p4 = 1000;
								}
								else {
									p5 = 1000;
									p4 = 0;
								}
							}
							if (button1.getText().toString().equals("Sita")) {
								p1 = 1000;
								if (button4.getText().toString().equals("Laxmana")) {
									p4 = 800;
									p5 = 0;
								}
								else {
									p4 = 0;
									p5 = 800;
								}
							}
							if (button1.getText().toString().equals("Rama")) {
								p1 = 0;
								if (button4.getText().toString().equals("Sita")) {
									p4 = 1000;
									p5 = 800;
								}
								else {
									p5 = 1000;
									p4 = 800;
								}
							}
						}
					}
				}
				button1.setBackgroundColor(0xFF81D4FA);
				button2.setBackgroundColor(0xFFEA80FC);
				button3.setBackgroundColor(0xFFFFE57F);
				button4.setBackgroundColor(0xFFA7FFEB);
				button5.setBackgroundColor(0xFF8C9EFF);
				textview13.setText(String.valueOf((long)(Double.parseDouble(textview13.getText().toString()) + p1)));
				textview18.setText(String.valueOf((long)(Double.parseDouble(textview18.getText().toString()) + p2)));
				textview19.setText(String.valueOf((long)(Double.parseDouble(textview19.getText().toString()) + p3)));
				textview20.setText(String.valueOf((long)(Double.parseDouble(textview20.getText().toString()) + p4)));
				textview21.setText(String.valueOf((long)(Double.parseDouble(textview21.getText().toString()) + p5)));
				if (Math.max(Double.parseDouble(textview13.getText().toString()), Math.max(Math.max(Double.parseDouble(textview18.getText().toString()), Double.parseDouble(textview19.getText().toString())), Math.max(Double.parseDouble(textview20.getText().toString()), Double.parseDouble(textview21.getText().toString())))) > 9999) {
					play.setEnabled(false);
					if (Double.parseDouble(textview13.getText().toString()) > Math.max(Double.parseDouble(textview18.getText().toString()), Math.max(Math.max(Double.parseDouble(textview19.getText().toString()), Double.parseDouble(textview20.getText().toString())), Double.parseDouble(textview21.getText().toString())))) {
						dia.setTitle(textview1.getText().toString().concat(" is the winner"));
					}
					if (Double.parseDouble(textview18.getText().toString()) > Math.max(Double.parseDouble(textview13.getText().toString()), Math.max(Math.max(Double.parseDouble(textview19.getText().toString()), Double.parseDouble(textview20.getText().toString())), Double.parseDouble(textview21.getText().toString())))) {
						dia.setTitle(textview2.getText().toString().concat(" is the winner"));
					}
					if (Double.parseDouble(textview19.getText().toString()) > Math.max(Double.parseDouble(textview13.getText().toString()), Math.max(Math.max(Double.parseDouble(textview18.getText().toString()), Double.parseDouble(textview20.getText().toString())), Double.parseDouble(textview21.getText().toString())))) {
						dia.setTitle(textview3.getText().toString().concat(" is the winner"));
					}
					if (Double.parseDouble(textview20.getText().toString()) > Math.max(Double.parseDouble(textview13.getText().toString()), Math.max(Math.max(Double.parseDouble(textview19.getText().toString()), Double.parseDouble(textview18.getText().toString())), Double.parseDouble(textview21.getText().toString())))) {
						dia.setTitle(textview4.getText().toString().concat(" is the winner"));
					}
					if (Double.parseDouble(textview21.getText().toString()) > Math.max(Double.parseDouble(textview18.getText().toString()), Math.max(Math.max(Double.parseDouble(textview19.getText().toString()), Double.parseDouble(textview20.getText().toString())), Double.parseDouble(textview13.getText().toString())))) {
						dia.setTitle(textview5.getText().toString().concat(" is the winner"));
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
		textview12.setText(b.getString("x1", "").concat("   --->"));
		textview2.setText(b.getString("x2", ""));
		textview14.setText(b.getString("x2", "").concat("   --->"));
		textview4.setText(b.getString("x3", ""));
		textview16.setText(b.getString("x3", "").concat("   --->"));
		textview3.setText(b.getString("x4", ""));
		textview15.setText(b.getString("x4", "").concat("   --->"));
		textview5.setText(b.getString("x5", ""));
		textview17.setText(b.getString("x5", "").concat("   --->"));
		button1.setEnabled(false);
		button2.setEnabled(false);
		button3.setEnabled(false);
		button4.setEnabled(false);
		button5.setEnabled(false);
		play.setEnabled(true);
		p1 = 0;
		p2 = 0;
		p3 = 0;
		p4 = 0;
		p5 = 0;
		rotate = 0;
		textview13.setText("0");
		textview18.setText("0");
		textview19.setText("0");
		textview20.setText("0");
		textview21.setText(" 0");
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
										wish2.setTarget(textview22);
								wish2.setPropertyName("alpha");
								wish2.setFloatValues((float)(0), (float)(1));
								wish2.setDuration((int)(500));
								wish2.start();
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
	@Override
	protected void onPostCreate(Bundle _savedInstanceState) {
		super.onPostCreate(_savedInstanceState);
				if (Math.max(Double.parseDouble(textview13.getText().toString()), Math.max(Math.max(Double.parseDouble(textview18.getText().toString()), Double.parseDouble(textview19.getText().toString())), Math.max(Double.parseDouble(textview20.getText().toString()), Double.parseDouble(textview21.getText().toString())))) > 9999) {
					if (true) {

					}
				}
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
