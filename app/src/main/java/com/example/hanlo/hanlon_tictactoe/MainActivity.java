package com.example.hanlo.hanlon_tictactoe;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.lang.annotation.Target;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void onSubmitName(View view){
        EditText editText = (EditText) findViewById(R.id.name_input);
        String message = editText.getText().toString();
        Intent intent = new Intent(this, TicTacToe.class);
        intent.putExtra(TicTacToe.intent_message, message);
        startActivity(intent);
    }
}
