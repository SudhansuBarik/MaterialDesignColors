package com.example.mypc.materialdesigncolors;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        RelativeLayout red = (RelativeLayout) findViewById(R.id.red);
        RelativeLayout pink = (RelativeLayout) findViewById(R.id.pink);
        RelativeLayout purple = (RelativeLayout) findViewById(R.id.purple);
        RelativeLayout deep_purple = (RelativeLayout) findViewById(R.id.deep_purple);
        RelativeLayout indigo = (RelativeLayout) findViewById(R.id.indigo);
        final RelativeLayout blue = (RelativeLayout) findViewById(R.id.blue);
        RelativeLayout light_blue = (RelativeLayout) findViewById(R.id.light_blue);
        RelativeLayout cyan = (RelativeLayout) findViewById(R.id.cyan);
        RelativeLayout teal = (RelativeLayout) findViewById(R.id.teal);
        RelativeLayout green = (RelativeLayout) findViewById(R.id.green);
        RelativeLayout light_green = (RelativeLayout) findViewById(R.id.light_green);
        final RelativeLayout lime = (RelativeLayout) findViewById(R.id.lime);
        RelativeLayout yellow = (RelativeLayout) findViewById(R.id.yellow);
        final RelativeLayout amber = (RelativeLayout) findViewById(R.id.amber);
        RelativeLayout orange = (RelativeLayout) findViewById(R.id.orange);
        RelativeLayout deep_orange = (RelativeLayout) findViewById(R.id.deep_orange);
        final RelativeLayout brown = (RelativeLayout) findViewById(R.id.brown);
        RelativeLayout grey = (RelativeLayout) findViewById(R.id.grey);
        RelativeLayout blue_grey = (RelativeLayout) findViewById(R.id.blue_grey);

        // Set a click listener on that View
        if (red != null) {
            red.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the red View is clicked on.
                @Override
                public void onClick(View view) {
                    //Create a new intent to open the {@link RedActivity}
                    Intent redIntent = new Intent(MainActivity.this, RedActivity.class);
                    //Start new activity
                    startActivity(redIntent);
                }
            });
        }

        if (pink != null) {
            pink.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the pink View is clicked on.
                @Override
                public void onClick(View view) {
                    //Create a new intent to open the {@Link PinkActivity}
                    Intent pinkIntent = new Intent(MainActivity.this, PinkActivity.class);
                    //Start new activity
                    startActivity(pinkIntent);
                }
            });
        }

        if (purple != null) {
            purple.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the purple View is clicked on.
                @Override
                public void onClick(View view) {
                    //Create a new intent to open the {@link PurpleActivity}
                    Intent purpleIntent = new Intent(MainActivity.this, PurpleActivity.class);
                    //Start new activity
                    startActivity(purpleIntent);
                }
            });
        }

        if (deep_purple != null) {
            deep_purple.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the deep purple View is clicked on.
                @Override
                public void onClick(View view) {
                    //Create a new intent to open the {@link DeepPurpleActivity}
                    Intent deepPurpleIntent = new Intent(MainActivity.this, DeepPurpleActivity.class);
                    //Start new activity
                    startActivity(deepPurpleIntent);
                }
            });
        }

        if (indigo != null) {
            indigo.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the indigo View is clicked on.
                @Override
                public void onClick(View view) {
                    //Create a new intent to open the {@link IndigoActivity}
                    Intent indigoIntent = new Intent(MainActivity.this, IndigoActivity.class);
                    //Start new activity
                    startActivity(indigoIntent);
                }
            });
        }

        if (blue != null) {
            blue.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the blue View is clicked on.
                @Override
                public void onClick(View view) {
                    //Create a new intent to open the {@link BlueActivity}
                    Intent blueIntent = new Intent(MainActivity.this, BlueActivity.class);
                    //Start new activity
                    startActivity(blueIntent);
                }
            });
        }

        if (light_blue != null) {
            light_blue.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the light blue View is clicked on.
                @Override
                public void onClick(View view) {
                    //Create a new intent to open the {@link LightBlueActivity}
                    Intent lightBlueIntent = new Intent(MainActivity.this, LightBlueActivity.class);
                    //Start new activity
                    startActivity(lightBlueIntent);
                }
            });
        }

        if (cyan != null) {
            cyan.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the cyan View is clicked on.
                @Override
                public void onClick(View view) {
                    //Create a new intent to open the {@link CyanActivity}
                    Intent cyanIntent = new Intent(MainActivity.this, CyanActivity.class);
                    //Start new activity
                    startActivity(cyanIntent);
                }
            });
        }

        if (teal != null) {
            teal.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the teal View is clicked on.
                @Override
                public void onClick(View view) {
                    //Create a new intent to open the {@link TealActivity}
                    Intent tealIntent = new Intent(MainActivity.this, TealActivity.class);
                    //Start new activity
                    startActivity(tealIntent);
                }
            });
        }


        if (green != null) {
            green.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the teal View is clicked on.
                @Override
                public void onClick(View view) {
                    //Create a new intent to open the {@link GreenActivity}
                    Intent greenIntent = new Intent(MainActivity.this, GreenActivity.class);
                    //Start new activity
                    startActivity(greenIntent);
                }
            });
        }

        if (light_green != null) {
            light_green.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the teal View is clicked on.
                @Override
                public void onClick(View view) {
                    //Create a new intent to open the {@link LightGreenActivity}
                    Intent lightGreenIntent = new Intent(MainActivity.this, LightGreenActivity.class);
                    //Start new activity
                    startActivity(lightGreenIntent);
                }
            });
        }

        if (lime != null) {
            lime.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the teal View is clicked on.
                @Override
                public void onClick(View view) {
                    //Create a new intent to open the {@link LimeActivity}
                    Intent limeIntent = new Intent(MainActivity.this, LimeActivity.class);
                    //Start new activity
                    startActivity(limeIntent);
                }
            });
        }

        if (yellow != null) {
            yellow.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the teal View is clicked on.
                @Override
                public void onClick(View view) {
                    //Create a new intent to open the {@link yellowActivity}
                    Intent yellowIntent = new Intent(MainActivity.this, YellowActivity.class);
                    //Start new activity
                    startActivity(yellowIntent);
                }
            });
        }

        if (amber != null) {
            amber.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the teal View is clicked on.
                @Override
                public void onClick(View view) {
                    //Create a new intent to open the {@link AmberActivity}
                    Intent amberIntent = new Intent(MainActivity.this, AmberActivity.class);
                    //Start new activity
                    startActivity(amberIntent);
                }
            });
        }

        if (orange != null) {
            orange.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the teal View is clicked on.
                @Override
                public void onClick(View view) {
                    //Create a new intent to open the {@link OrangeActivity}
                    Intent orangeIntent = new Intent(MainActivity.this, OrangeActivity.class);
                    //Start new activity
                    startActivity(orangeIntent);
                }
            });
        }

        if (deep_orange != null) {
            deep_orange.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the teal View is clicked on.
                @Override
                public void onClick(View view) {
                    //Create a new intent to open the {@link DeepOrangeActivity}
                    Intent deepOrangeIntent = new Intent(MainActivity.this, DeepOrangeActivity.class);
                    //Start new activity
                    startActivity(deepOrangeIntent);
                }
            });
        }

        if (brown != null) {
            brown.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the teal View is clicked on.
                @Override
                public void onClick(View view) {
                    //Create a new intent to open the {@link BrownActivity}
                    Intent brownIntent = new Intent(MainActivity.this, BrownActivity.class);
                    //Start new activity
                    startActivity(brownIntent);
                }
            });
        }

        if (grey != null) {
            grey.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the teal View is clicked on.
                @Override
                public void onClick(View view) {
                    //Create a new intent to open the {@link GreyActivity}
                    Intent greyIntent = new Intent(MainActivity.this, GreyActivity.class);
                    //Start new activity
                    startActivity(greyIntent);
                }
            });
        }

        if (blue_grey != null) {
            blue_grey.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the teal View is clicked on.
                @Override
                public void onClick(View view) {
                    //Create a new intent to open the {@link BlueGreyActivity}
                    Intent blueGreyIntent = new Intent(MainActivity.this, BlueGreyActivity.class);
                    //Start new activity
                    startActivity(blueGreyIntent);
                }
            });
        }

    }
}
