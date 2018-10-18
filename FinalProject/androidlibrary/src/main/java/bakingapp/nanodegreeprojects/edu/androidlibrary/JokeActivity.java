package bakingapp.nanodegreeprojects.edu.androidlibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    TextView tvJokes;
    private static final String TAG_EXTRA = "joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        String joke = intent.getStringExtra(TAG_EXTRA);

        initComponents(joke);

    }

    public void initComponents(String joke) {
        tvJokes = findViewById(R.id.tv_jokes);
        tvJokes.setText(joke);
    }

}
