package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class ke0 extends la2 {
    public final Paint T;
    public final RectF U;
    public int V;

    public ke0() {
        this(null);
    }

    @Override // defpackage.la2, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, null);
            }
        } else {
            this.V = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
        }
        super.draw(canvas);
        canvas.drawRect(this.U, this.T);
        if (getCallback() instanceof View) {
            return;
        }
        canvas.restoreToCount(this.V);
    }

    public final void n(float f, float f2, float f3, float f4) {
        RectF rectF = this.U;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }

    public ke0(ej4 ej4Var) {
        super(ej4Var == null ? new ej4() : ej4Var);
        Paint paint = new Paint(1);
        this.T = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.U = new RectF();
    }
}
