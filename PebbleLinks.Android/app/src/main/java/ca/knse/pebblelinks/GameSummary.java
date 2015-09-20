package ca.knse.pebblelinks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.getpebble.android.kit.PebbleKit;

public class GameSummary extends AppCompatActivity {

    private PebbleKit.PebbleDataReceiver m_pebbleReceiver;

    //TODO:  Initialize location services
    //TODO:  Background timer on location services
    //      With 15-seconds of no movement push current distance from last shot to watch
    //TODO:  Push end-of-hole stats to phone
    //TODO:  Background thread accept incoming data from watch
    //      Swing + DateTimeStamp(UTC)
    //      End Hole (stop location services if battery power is saved sufficiently to warrant it)
    //      Start Hole (start location services if they are off)
    //

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_summary);
    }

    @Override
    protected void onPause() {
        super.onPause();

        //Always deregister any Activity-scoped broadcast receivers when the Activity is paused.
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_game_summary, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
