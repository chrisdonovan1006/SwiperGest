package com.livebythecode.dvn.swipergest;

import android.os.Bundle;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener{
    private TextView gestureText;
    private GestureDetectorCompat gestureDetector;

    private static final String TAG = "SwiperGest";
    private static final boolean DEBUG = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gestureText = (TextView) findViewById(R.id.stateMessage);

        this.gestureDetector = new GestureDetectorCompat(this, this);
        gestureDetector.setOnDoubleTapListener(this);
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        if (DEBUG)
        {
            Log.i(TAG, "onSingleTapConfirmed()");
        }
        gestureText.setText("onSingleTapConfirmed()");
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        if (DEBUG)
        {
            Log.i(TAG, "onDoubleTap()");
        }
        gestureText.setText("onDoubleTap()");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        if (DEBUG)
        {
            Log.i(TAG, "onDoubleTapEvent()");
        }
        gestureText.setText("onDoubleTapEvent()");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        if (DEBUG)
        {
            Log.i(TAG, "onDown()");
        }
        gestureText.setText("onDown()");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        if (DEBUG)
        {
            Log.i(TAG, "onShowPress()");
        }
        gestureText.setText("onShowPress()");

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        if (DEBUG)
        {
            Log.i(TAG, "onSingleTapUp()");
        }
        gestureText.setText("onSingleTapUp()");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        if (DEBUG)
        {
            Log.i(TAG, "onScroll()");
        }
        gestureText.setText("onScroll()");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        if (DEBUG){
            Log.i(TAG, "onLongPress()");
        }
        gestureText.setText("onLongPress()");

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        if (DEBUG){
            Log.i(TAG, "onFling");
        }
        gestureText.setText("onFling()");
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
