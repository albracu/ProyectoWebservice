package co.alfredobravocuero.abracu.proyectowebservice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView texto;
    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = (TextView) findViewById(R.id.texto);

        boton = (Button) findViewById(R.id.boton);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        //Cualquier cosa
                        String txt = "Loque sea";
                        //texto.setText(txt);
                    }
                }).start();


               /* Hilo hilo = new Hilo();
                hilo.start();*/
            }
        });
    }

    /*public class Hilo extends Thread{

        public void run(){

            for (int i=1; i<= 10; i++){
                //Cualquier cosa

                //texto.setText(String.valueOf(i));

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                Log.d("DEBUG", String.valueOf(i));

            }

        }

    }
*/

}
