package br.com.uniritter.app1_2023_1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    EditText Name;
    EditText Senha;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Button btn2_1 = findViewById(R.id.button2_1);

        Button btn_login = findViewById(R.id.btn_logar);

        Name = findViewById(R.id.login_name);
        Senha = findViewById(R.id.login_senha);

        btn2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), DashBoard.class);
                startActivity(intent);
            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                if(Senha.getText().toString().equals("Admin") && Name.getText().toString().equals("Admin")){

                    Context context = getApplicationContext();
                    CharSequence text = "Logado com sucesso";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    Intent intent = new Intent(getApplicationContext(), DashBoard.class);
                    startActivity(intent);


                }else {

                    Context context = getApplicationContext();
                    CharSequence text = "Usuário não encontrado";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                }
             }
        });




    }
}