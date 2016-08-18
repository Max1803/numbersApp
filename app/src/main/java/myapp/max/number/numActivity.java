package myapp.max.number;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class numActivity extends AppCompatActivity {
    EditText n1;
    EditText n2;
    TextView num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_num);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_num, menu);
        return true;
    }

    @Override//Функция для обработки нажатий на каждый пунк меню
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        n1 = (EditText) findViewById(R.id.num1);
        n2 = (EditText) findViewById(R.id.num2);
        String s1 = n1.getText().toString();
        String s2 = n2.getText().toString();
        num = (TextView) findViewById(R.id.res);

        if (id == R.id.sqrt) {
            double s = Double.valueOf(s1);
            num.setText("sqrt = " + Math.sqrt(s));
        }
        if (id == R.id.pow) {
            double s = Double.valueOf(s1);
            double n = Double.valueOf(s2);
            num.setText("pow = " + Math.pow(s, n));
        }
        if (id == R.id.sin) {
            double s = Double.valueOf(s1);
            num.setText("sin = " + Math.sin(s));
        }
        if (id == R.id.cos) {
            double s = Double.valueOf(s1);
            num.setText("cos = " + Math.cos(s));
        }
        if (id == R.id.tan) {
            double s = Double.valueOf(s1);
            num.setText("tan = " + Math.tan(s));
        }
        if (id == R.id.asin) {
            double s = Double.valueOf(s1);
            num.setText("asin = " + Math.asin(s));
        }
        if (id == R.id.acos) {
            double s = Double.valueOf(s1);
            num.setText("acos = " + Math.acos(s));
        }
        if (id == R.id.atan) {
            double s = Double.valueOf(s1);
            num.setText("atan = " + Math.atan(s));
        }
        if (id == R.id.max) {
            double s = Double.valueOf(s1);
            double n = Double.valueOf(s2);
            num.setText("max = " + Math.max(s, n));
        }
        if (id == R.id.min) {
            double s = Double.valueOf(s1);
            double n = Double.valueOf(s2);
            num.setText("min = " + Math.min(s, n));
        }
        if (id == R.id.round) {
            double s = Double.valueOf(s1);
            num.setText("round = " + Math.round(s));
        }
        if (id == R.id.sum) {
            String[] c;
            c = s1.split("/");
            int sum = 0;
            for (int y = 0; y < c.length; y++) {
                int digit = Integer.valueOf(c[y]);
                sum = sum + digit;
                num.setText(String.valueOf(sum));
            }
        }
        if (id == R.id.average) {
            String[] c;
            c = s1.split("/");
            double sum = 0;
            for (int y = 0; y < c.length; y++) {
                int digit = Integer.valueOf(c[y]);
                sum = sum + digit;
            }

            double t = sum / c.length;
            num.setText(String.valueOf(t));
        }
        if (id == R.id.even) {
            String[] c;
            String res = "";
            c = s1.split("/");
            for (int y = 0; y < c.length; y++) {
                int digit = Integer.valueOf(c[y]);
                if (Integer.valueOf(c[y]) % 2 == 0) {
                    res = res + c[y] + "";
                }
                num.setText(String.valueOf(digit));
            }



        }
        return super.onOptionsItemSelected(item);
    }
}