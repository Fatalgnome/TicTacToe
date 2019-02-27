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

	 final int KRYDS = 1;
	 final int BOLLE = 0;
	 int turn = BOLLE;





	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);


		View table = findViewById(R.id.table);
		table.setOnClickListener(this);

		//we add clicklisteners, this, to all our fields
		View field = findViewById(R.id.field1);
		field.setOnClickListener(this);
		
		field = findViewById(R.id.field2);
		field.setOnClickListener(this);
		
		//TODO add click listeners like this for the rest of the imageviews
	
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
		// TODO Here you need to get the ID of the view 
		// being pressed and then if the view is pressed
		// you need to first put a "X", then next time 
		// put a "O" and also make sure that you cannot
		// put a "O" or a "X" if there is already something.
		
		if (view.getId()==R.id.field1)
		{
			ImageView image = (ImageView) view;

			Log.d("Field_Clicked","field 1 pressed");

			//TODO something here

			//An example of how to set the image
			//you need to check if the field is empty
			//before setting a new image
			//and also if the turn is X or O
			image.setImageResource(R.drawable.kryds);
			//then you need to update your int[] array also
		}
	}
}
