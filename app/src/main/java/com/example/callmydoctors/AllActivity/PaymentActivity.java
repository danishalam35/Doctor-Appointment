package com.example.callmydoctors.AllActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.callmydoctors.R;
import com.razorpay.Checkout;
import com.razorpay.PaymentResultListener;
import com.shreyaspatil.EasyUpiPayment.EasyUpiPayment;
import com.shreyaspatil.EasyUpiPayment.listener.PaymentStatusListener;
import com.shreyaspatil.EasyUpiPayment.model.TransactionDetails;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;






public class PaymentActivity extends AppCompatActivity implements PaymentResultListener {

    Button bt_pay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        bt_pay=findViewById(R.id.bt_pay);

        //amount
        String sAmount = "400";
        // convert and round off
        final int amount = Math.round(Float.parseFloat(sAmount)*100);
        bt_pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // initialize razorpay check out
                Checkout checkout = new Checkout();
                //set key id

                checkout.setKeyID("rzp_live_qvwjvf07VIrDpq");

                // set img
                checkout.setImage(R.drawable.rzp_logo);
                //initialize json obj
                JSONObject object = new JSONObject();



                try {
                    // put name
                    object.put("name","Call My doctor");
                    // put description
                    object.put("description"," We provide valuable services");

                    // put theme color

                    object.put("theme.color","#0093DD");
                    // put currency unit

                    object.put("currency","INR");
                    // put amount

                    object.put("amount",amount);
                    // put mobile number

                    object.put("prefill.contact","8789774627");

                    //put email
                    object.put("prefill.email","danish@rzp.com");
                    //open razorpay checkout act..

                    checkout.open(PaymentActivity.this,object);

                } catch (JSONException e) {
                    e.printStackTrace();
                }


            }
        });

    }

    @Override
    public void onPaymentSuccess(String s) {
        // initalize alert dialog
        AlertDialog.Builder builder =new AlertDialog.Builder(this);
        // set Title
        builder.setTitle("Payment ID");
        // set Message
        builder.setMessage(s);
        //show alert dialog
        builder.show();
    }

    @Override
    public void onPaymentError(int i, String s) {

        //Display message
        Toast.makeText(getApplicationContext(),s,Toast.LENGTH_SHORT).show();
    }
}