package org.example.tictactoe;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.support.v7.app.AppCompatActivity;

// we implement the onClickListener - so this means there
//will be an onClick method defined for ALL the views later
//in the onClick method
public class MainActivity extends AppCompatActivity implements OnClickListener {

	 final int KRYDS = 2;
	 final int BOLLE = 1;
	 final int EMPTY = 0;
	 int turn = KRYDS;
	 int[] fields = new int[9];
	 int counter;
	 boolean KrydsWin;
	 boolean BolleWin;
	 boolean Draw;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Initialize();

		View table = findViewById(R.id.table);
		table.setOnClickListener(this);

		//we add clicklisteners, this, to all our fields

	
	} 
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}



	@Override
	public void onClick(View view) {
		ImageView image = (ImageView) view;

		switch (view.getId())
		{
			case R.id.field0:
				if (fields[0] == EMPTY && counter < 6)
				{
					Log.d("Field_Clicked","field 0 pressed");
					place(image);
					fields[0] = turn;
					counter++;
				}
				else
				{
					Log.d("Field_Clicked", "Pressed a field with stone");
				}
				break;
			case R.id.field1:
				if (fields[1] == EMPTY && counter < 6)
				{
					Log.d("Field_Clicked","field 1 pressed");
					place(image);
					fields[1] = turn;
					counter++;
				}
				else
				{
					Log.d("Field_Clicked", "Pressed a field with stone");
				}
				break;
			case R.id.field2:
				if (fields[2] == EMPTY && counter < 6)
				{
					Log.d("Field_Clicked","field 2 pressed");
					place(image);
					fields[2] = turn;
					counter++;
				}
				else
				{
					Log.d("Field_Clicked", "Pressed a field with stone");
				}
				break;
			case R.id.field3:
				if (fields[3] == EMPTY && counter < 6)
				{
					Log.d("Field_Clicked","field 3 pressed");
					place(image);
					fields[3] = turn;
					counter++;
				}
				else
				{
					Log.d("Field_Clicked", "Pressed a field with stone");
				}
				break;
			case R.id.field4:
				if (fields[4] == EMPTY && counter < 6)
				{
					Log.d("Field_Clicked","field 4 pressed");
					place(image);
					fields[4] = turn;
					counter++;
				}
				else
				{
					Log.d("Field_Clicked", "Pressed a field with stone");
				}
				break;
			case R.id.field5:
				if (fields[5] == EMPTY && counter < 6)
				{
					Log.d("Field_Clicked","field 5 pressed");
					place(image);
					fields[5] = turn;
					counter++;
				}
				else
				{
					Log.d("Field_Clicked", "Pressed a field with stone");
				}
				break;
			case R.id.field6:
				if (fields[6] == EMPTY && counter < 6)
				{
					Log.d("Field_Clicked","field 6 pressed");
					place(image);
					fields[6] = turn;
					counter++;
				}
				else
				{
					Log.d("Field_Clicked", "Pressed a field with stone");
				}
				break;
			case R.id.field7:
				if (fields[7] == EMPTY && counter < 6)
				{
					Log.d("Field_Clicked","field 7 pressed");
					place(image);
					fields[7] = turn;
					counter++;
				}
				else
				{
					Log.d("Field_Clicked", "Pressed a field with stone");
				}
				break;
			case R.id.field8:
				if (fields[8] == EMPTY && counter < 6)
				{
					Log.d("Field_Clicked","field 8 pressed");
					place(image);
					fields[8] = turn;
					counter++;
				}
				else
				{
					Log.d("Field_Clicked", "Pressed a field with stone");
				}
				break;

				default:
					Log.d("Field_Clicked", "Pressed a field with stone");
		}

	}

	public void Initialize()
	{
		View field;
		for(int i = 0; i < 9; i++)
		{
			switch (i)
			{
				case 0:
					field = findViewById(R.id.field0);
					field.setOnClickListener(this);
					break;
				case 1:
					field = findViewById(R.id.field1);
					field.setOnClickListener(this);
					break;
				case 2:
					field = findViewById(R.id.field2);
					field.setOnClickListener(this);
					break;
				case 3:
					field = findViewById(R.id.field3);
					field.setOnClickListener(this);
					break;
				case 4:
					field = findViewById(R.id.field4);
					field.setOnClickListener(this);
					break;
				case 5:
					field = findViewById(R.id.field5);
					field.setOnClickListener(this);
					break;
				case 6:
					field = findViewById(R.id.field6);
					field.setOnClickListener(this);
					break;
				case 7:
					field = findViewById(R.id.field7);
					field.setOnClickListener(this);
					break;
				case 8:
					field = findViewById(R.id.field8);
					field.setOnClickListener(this);
					break;

			}
			fields[i] = EMPTY;
			turn = KRYDS;
			counter = 0;
			KrydsWin = false;
			BolleWin = false;
			Draw = false;
		}
	}

	public void restart(View view)
	{
	//	ImageView image = (ImageView) view;

		for(int i = 0; i < 9; i++)
		{
			switch (i)
			{
				case 0:
					if (fields[0] == KRYDS || fields[0] == BOLLE)
					{
						ImageView image = findViewById(R.id.field0);
						image.setImageResource(R.drawable.blank);
						fields[0] = EMPTY;
					}
					break;
				case 1:
					if (fields[1] == KRYDS || fields[1] == BOLLE)
					{
						ImageView image = findViewById(R.id.field1);
						image.setImageResource(R.drawable.blank);
						fields[1] = EMPTY;
					}
					break;
				case 2:
					if (fields[2] == KRYDS || fields[2] == BOLLE)
					{
						ImageView image = findViewById(R.id.field2);
						image.setImageResource(R.drawable.blank);
						fields[2] = EMPTY;
					}
					break;
				case 3:
					if (fields[3] == KRYDS || fields[3] == BOLLE)
					{
						ImageView image = findViewById(R.id.field3);
						image.setImageResource(R.drawable.blank);
						fields[3] = EMPTY;
					}
					break;
				case 4:
					if (fields[4] == KRYDS || fields[4] == BOLLE)
					{
						ImageView image = findViewById(R.id.field4);
						image.setImageResource(R.drawable.blank);
						fields[4] = EMPTY;
					}
					break;
				case 5:
					if (fields[5] == KRYDS || fields[5] == BOLLE)
					{
						ImageView image = findViewById(R.id.field5);
						image.setImageResource(R.drawable.blank);
						fields[5] = EMPTY;
					}
					break;
				case 6:
					if (fields[6] == KRYDS || fields[6] == BOLLE)
					{
						ImageView image = findViewById(R.id.field6);
						image.setImageResource(R.drawable.blank);
						fields[6] = EMPTY;
					}
					break;
				case 7:
					if (fields[7] == KRYDS || fields[7] == BOLLE)
					{
						ImageView image = findViewById(R.id.field7);
						image.setImageResource(R.drawable.blank);
						fields[7] = EMPTY;
					}
					break;
				case 8:
					if (fields[8] == KRYDS || fields[8] == BOLLE)
					{
						ImageView image = findViewById(R.id.field8);
						image.setImageResource(R.drawable.blank);
						fields[8] = EMPTY;
					}
					break;
			}
            fields[i] = EMPTY;
			turn = KRYDS;
			counter = 0;
			KrydsWin = false;
			BolleWin = false;
			Draw = false;
		}
	}

	public void place(ImageView imageView)
	{
		switch (turn)
		{
			case KRYDS:
				imageView.setImageResource(R.drawable.kryds);
				turn = BOLLE;
				break;
			case BOLLE:
				imageView.setImageResource(R.drawable.bolle);
				turn = KRYDS;
				break;
		}
	}
	public void checkWin()
	{
		if (counter >= 6)
		{
		}
	}
}
