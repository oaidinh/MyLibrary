package com.example.testlibrary;

import android.content.Context;
import android.widget.Toast;

public class AwesomeToast {
    public static void showToast(Context context,String mess) {
        Toast.makeText(context, mess, Toast.LENGTH_SHORT).show();
    }
}
