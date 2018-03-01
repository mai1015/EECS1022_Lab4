package eecs1022.lab4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Lab4Activity extends AppCompatActivity {

    private Bank b;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab4);
    }

    private void setTextViewById(int ID, String text) {
        TextView view = (TextView) findViewById(ID);
        view.setText(text);
    }

    private String getInputById(int ID) {
        EditText view = (EditText) findViewById(ID);
        return view.getText().toString();
    }

    private String getItemSelectedById(int ID) {
        Spinner spinner = (Spinner) findViewById(ID);
        return spinner.getSelectedItem().toString();
    }

    public void inintializeClients(View v) {

    }

    public void doAction(View v) {

    }
}
