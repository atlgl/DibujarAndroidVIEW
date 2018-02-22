package filtros.orus.ejemplodibujo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by orus on 12/02/2018.
 */

public class Lineas extends View {

    Paint paint;
    public Lineas(Context context) {
        super(context);
        paint=new Paint(Color.BLACK);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);



        canvas.drawLine(0,0,500,500,paint);

        canvas.drawCircle(0,100,100,paint);
    }
}
