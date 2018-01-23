package com.ezerka.college;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            startActivity(new Intent(this, SettingsActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void track_activity(View view) {
        startActivity(new Intent(this, TrackActivity.class));

    }

    public void attendance_activity(View view) {
        startActivity(new Intent(this, AttendanceActivity.class));
    }

    public void results_activity(View view) {
        startActivity(new Intent(this, ResultsActivity.class));

    }

    public void notices_activity(View view) {
        startActivity(new Intent(this, NoticesActivity.class));

    }

    public void clubs_activity(View view) {
        startActivity(new Intent(this, ClubsActivity.class));

    }

    public void anti_ragging_activity(View view) {
        startActivity(new Intent(this, AntiRaggingActivity.class));

    }

    public void faculty_activity(View view) {
        startActivity(new Intent(this, FacultyActivity.class));

    }

    public void payment_activity(View view) {
        startActivity(new Intent(this, PaymentActivity.class));

    }

    public void forums_activity(View view) {
        startActivity(new Intent(this, ForumsActivity.class));
    }

    public void contact_us_activity(View view) {
        startActivity(new Intent(this, ContactActivity.class));
    }
}
