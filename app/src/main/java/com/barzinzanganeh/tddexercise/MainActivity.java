package com.barzinzanganeh.tddexercise;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.first_name_value)
    TextView firstNameValue;
    @BindView(R.id.last_name_value)
    TextView lastNameValue;
    @BindView(R.id.age_value)
    TextView ageValue;
    @BindView(R.id.save_button)
    Button saveButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        saveButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "The message is saved", Toast.LENGTH_SHORT).show();

    }
}
