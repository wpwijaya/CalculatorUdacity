package com.example.quantitycalculator;

import androidx.appcompat.app.AppCompatActivity;
/*import android.support.v7.app.ActionBarActivity;*/
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int quantity=0;
    int price = 5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addQty(View view) {
        quantity= quantity+1;
        display(quantity);
    }

    public void minusQty(View view) {
        quantity=quantity-1;
        display(quantity);
    }

    public void SubmitOrder(View view) {
        display(quantity);
        displayPrice(quantity*price);
    }

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    private void displayPrice (int number){
        TextView priceTextview = (TextView) findViewById(R.id.price_text_view);
        priceTextview.setText(NumberFormat.getCurrencyInstance().format(number));
    }

}
