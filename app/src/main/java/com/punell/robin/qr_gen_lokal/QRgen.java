package com.punell.robin.qr_gen_lokal;
import android.content.Context;
import android.telephony.TelephonyManager;
import android.content.Context;

/**
 * Created by P on 2015-09-17.
 */
public class QRgen {
    Context mContext;


    public QRgen(Context mContext){
        this.mContext = mContext;

    }

    public String getPhoneNumber(){
        TelephonyManager tm = (TelephonyManager)mContext.getSystemService(Context.TELEPHONY_SERVICE);
        String phoneNumber = tm.getLine1Number(); // Return null if it is unavailable.

        if(phoneNumber == null){
            return "Number unavailable";
        }

        return phoneNumber;
    }

    public String cryptNr(String nr){
        //Kod för kryptering
        return nr;
    }

    public void qrGen(String code){
        //Generering av QR-kod


    }





/**
 * Alt. Kod
 *
 *
 */







}



