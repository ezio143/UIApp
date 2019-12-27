package com.example.uiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static String TAG = "MAIN_ACTIVITY";

    private TextView text_result,text_result_desc;
    private Button btn_init,btn_deinit,btn_register
            ,btn_unregister,btn_connect,btn_disconnect,btn_pause,btn_resume,btn_accept,btn_reject;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    private void initView() {
        text_result = findViewById(R.id.text_result);
        text_result_desc = findViewById(R.id.text_result_desc);

        btn_init = findViewById(R.id.button_init);
        btn_deinit = findViewById(R.id.button_deinit);
        btn_register = findViewById(R.id.button_register);
        btn_unregister = findViewById(R.id.button_unregister);
        btn_connect = findViewById(R.id.button_connect);
        btn_disconnect = findViewById(R.id.button_disconnect);
        btn_pause = findViewById(R.id.button_pause);
        btn_resume = findViewById(R.id.button_resume);
        btn_accept = findViewById(R.id.button_accept);
        btn_reject = findViewById(R.id.button_reject);

        btn_init.setOnClickListener(this);
        btn_deinit.setOnClickListener(this);
        btn_register.setOnClickListener(this);
        btn_unregister.setOnClickListener(this);
        btn_connect.setOnClickListener(this);
        btn_disconnect.setOnClickListener(this);
        btn_pause.setOnClickListener(this);
        btn_resume.setOnClickListener(this);
        btn_accept.setOnClickListener(this);
        btn_reject.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.button_init:
                initFunc();
                break;
            case R.id.button_deinit:
                deinitFunc();
                break;
            case R.id.button_register:
                registerFunc();
                break;
            case R.id.button_unregister:
                unRegisterFunc();
                break;
            case R.id.button_connect:
                connectFunc();
                break;
            case R.id.button_disconnect:
                disconnectFunc();
                break;
            case R.id.button_pause:
                pauseFunc();
                break;
            case R.id.button_resume:
                resumeFunc();
                break;
            case R.id.button_accept:
                acceptFunc();
                break;
            case R.id.button_reject:
                rejectFunc();
                break;


        }

    }

    private void rejectFunc() {
        //TODO: call android api here
        //TODO: call native code here
        showTodo("REJECT");
    }

    private void acceptFunc() {
        showTodo("ACCEPT");
    }

    private void registerFunc() {

        showTodo("REJISTER");
    }

    private void unRegisterFunc() {
        showTodo("UNREGISTER");
    }

    private void connectFunc() {
        showTodo("CONNECT");
    }
    private void disconnectFunc() {
        showTodo("DISCONNECT");
    }
    private void pauseFunc() {
        showTodo("PAUSE");
    }

    private void resumeFunc() { showTodo("RESUME");
    }


    private void deinitFunc() {
        showTodo("DE-INIT");
    }

    private void initFunc() {
        showTodo("INIT");

    }



    private void showTodo(String action) {
        text_result.setText(action);
        //Toast.makeText(this, "TODO:implement", Toast.LENGTH_SHORT).show();
    }

}
