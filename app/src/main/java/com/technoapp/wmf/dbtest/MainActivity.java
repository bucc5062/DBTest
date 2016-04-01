package com.technoapp.wmf.dbtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.Console;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String eTAG = "Exception";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(eTAG, "MainActivity onCreate");
        eqDatabaseService eqDB = new eqDatabaseService(this,2);

        eqDB.insertCustomGaits();

        List<eqCustomGaits_dt> allGaits = eqDB.getAllGaits();

        for (eqCustomGaits_dt row:allGaits) {
            Log.d(eTAG, row.getName() + "," + row.getCategory() + "," + row.getGait() + "," + row.getUom() + "," + row.getPace().toString());
        }

        eqDB.close();

    }
}
