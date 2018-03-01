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
        String name1 = getInputById(R.id.inputClient1);
        double amount1 = Double.parseDouble(getInputById(R.id.inputClient1Amount));
        String name2 = getInputById(R.id.inputClient2);
        double amount2 = Double.parseDouble(getInputById(R.id.inputClient2Amount));
        String name3 = getInputById(R.id.inputClient3);
        double amount3 = Double.parseDouble(getInputById(R.id.inputClient3Amount));

        b = new Bank(new Client(name1, amount1), new Client(name2, amount2), new Client(name3, amount3));

        setTextViewById(R.id.lableResult, b.toString());
    }

    public void doAction(View v) {
        String action = getItemSelectedById(R.id.spinnerService);
        Client from = b.getClient(getItemSelectedById(R.id.spinnerFromClient));
        Client to = b.getClient(getItemSelectedById(R.id.spinnerToClient));
        double amount = Double.parseDouble(getInputById(R.id.inputAmount));

        b.doAction(action, from, to, amount);

        setTextViewById(R.id.lableResult, b.toString());
    }
}
