package com.angluswang.backgammon.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.angluswang.backgammon.R;
import com.angluswang.backgammon.view.BackgammonPanel;

public class MainActivity extends Activity {

    private BackgammonPanel mBackgammonPanel;
    private Button restart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBackgammonPanel = (BackgammonPanel) findViewById(R.id.backgammon_panel);
        restart = (Button) findViewById(R.id.restart);
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBackgammonPanel.restart();
            }
        });
    }
}
