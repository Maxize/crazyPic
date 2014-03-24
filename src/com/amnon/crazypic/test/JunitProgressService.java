package com.amnon.crazypic.test;

import android.test.AndroidTestCase;
import android.util.Log;

public class JunitProgressService extends AndroidTestCase {
    private final String TAG = "main";

    public JunitProgressService() {
        // TODO Auto-generated constructor stub
    }

    public void getCurrentProgerssTest() {
        ProgressService progressService = new ProgressService();

        Integer pro = progressService.getCurrentProgerss(20, 70);

        Log.i(TAG, pro.toString());
    }
}
