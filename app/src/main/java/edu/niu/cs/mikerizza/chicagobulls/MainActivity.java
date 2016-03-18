package edu.niu.cs.mikerizza.chicagobulls;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends Activity
{

    private Button playerBtn;

    private ImageView playerIV;

    private Spinner spinner;

    private String playerName;

    static final int REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playerBtn = (Button)findViewById(R.id.playerButton);  //connect button
        playerIV = (ImageView)findViewById(R.id.playerImageView); //connect player Image

        spinner =(Spinner)findViewById(R.id.spinner); //connect spinner

        //set spinner to array
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this,R.array.players,android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);

        //when item is selected on spinner
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                if (position == 0)
                {
                    playerIV.setImageResource(R.drawable.rose);
                    playerName = "Derrick Rose";
                }

                if (position == 1)
                {
                    playerIV.setImageResource(R.drawable.butler);
                    playerName = "Jimmy Butler";
                }

                if (position == 2)
                {
                    playerIV.setImageResource(R.drawable.doug);
                    playerName = "Doug McDermott";
                }

                if (position == 3)
                {
                    playerIV.setImageResource(R.drawable.taj);
                    playerName = "Taj Gibson";
                }

                if (position == 4)
                {
                    playerIV.setImageResource(R.drawable.noah);
                    playerName = "Joakim Noah";
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }//end of onCreate

    //use button to start player activity
    public void doPlayer(View view)
    {
        Intent playerIntent = new Intent(MainActivity.this, Player.class );
        playerIntent.putExtra("playerName", playerName);
        startActivity(playerIntent);
    }



}//end of Main
