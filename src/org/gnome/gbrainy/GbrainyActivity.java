package org.gnome.gbrainy;

import android.app.Activity;
import android.os.Bundle;

public class GbrainyActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}