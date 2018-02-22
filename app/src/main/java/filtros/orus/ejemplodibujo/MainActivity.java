package filtros.orus.ejemplodibujo;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Lineas linea=new Lineas(getBaseContext());
        linea.setBackgroundColor(Color.GREEN);
        setContentView(linea);

        //setContentView(R.layout.activity_main);
    }
}
