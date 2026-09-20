package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.emoji2.text.LPt8Fixed;
import androidx.emoji2.text.T23;

/* JADX INFO: loaded from: classes.dex */
public final class kc5 extends mr0 {
    public kc5(lr0 lr0Var) {
        super(lr0Var);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        LPt8Fixed.a().getClass();
        lr0 lr0Var = this.x;
        T23 t23 = lr0Var.b;
        Typeface typeface = t23.d;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        canvas.drawText(t23.b, lr0Var.a * 2, 2, f, i4, paint);
        paint.setTypeface(typeface2);
    }
}
