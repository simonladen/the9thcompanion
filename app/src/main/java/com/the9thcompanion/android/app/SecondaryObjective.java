package com.the9thcompanion.android.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

import static android.graphics.Color.CYAN;
import static android.graphics.Color.WHITE;

public class SecondaryObjective extends Activity  {

    private TextView mSelectObj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary_objective);
        getActionBar().setTitle("Secondary Objective");
    }



    public void RandomObjective(View view) {
        // reset the highlight first
        resetHighlight(view);

        // maximum number of secondary objectives = 6
        Random r = new Random();
        int selectObj = r.nextInt(6) +1;
        String viewId = "textObj" + selectObj;
        int resId = getResources().getIdentifier(viewId, "id", getPackageName());
        mSelectObj = (TextView) findViewById(resId);
        mSelectObj.setBackgroundColor(CYAN);
    }

    public void resetHighlight(View view){
        // every textViews get their background back to white
        for (int i = 1;  i<7; i++){
            String viewId = "textObj" + i;
            int resId = getResources().getIdentifier(viewId, "id", getPackageName());
            mSelectObj = (TextView) findViewById(resId);
            mSelectObj.setBackgroundColor(WHITE);
        }
    }
}
