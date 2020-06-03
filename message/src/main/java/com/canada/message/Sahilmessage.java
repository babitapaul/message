package com.canada.message;

import android.content.Context;
import android.widget.Toast;

public class Sahilmessage {
    public static void DisplayMessage(Context c, String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

    }
}