package arie.mydeepnavigation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    private TextView tvTitle, tvMessage;
    public static final String EXTRA_TITLE = "extra_title";
    public static final String EXTRA_MESSAGE = "extra_message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        tvTitle = (TextView)findViewById(R.id.tv_title);
        tvMessage = (TextView)findViewById(R.id.tv_message);
        String title = getIntent().getStringExtra(EXTRA_TITLE);
        String message = getIntent().getStringExtra(EXTRA_MESSAGE);
        tvTitle.setText(title);
        tvMessage.setText(message);
    }
}
