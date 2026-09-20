package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: loaded from: classes.dex */
public abstract class mr0 extends ReplacementSpan {
    public final lr0 x;
    public final Paint.FontMetricsInt w = new Paint.FontMetricsInt();
    public float y = 1.0f;

    public mr0(lr0 lr0Var) {
        if (lr0Var == null) {
            throw new NullPointerException("metadata cannot be null");
        }
        this.x = lr0Var;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.w;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        lr0 lr0Var = this.x;
        ce2 ce2VarC = lr0Var.c();
        int iA = ce2VarC.a(14);
        this.y = fAbs / (iA != 0 ? ce2VarC.b.getShort(iA + ce2VarC.a) : (short) 0);
        ce2 ce2VarC2 = lr0Var.c();
        int iA2 = ce2VarC2.a(14);
        if (iA2 != 0) {
            ce2VarC2.b.getShort(iA2 + ce2VarC2.a);
        }
        ce2 ce2VarC3 = lr0Var.c();
        int iA3 = ce2VarC3.a(12);
        short s = (short) ((iA3 != 0 ? ce2VarC3.b.getShort(iA3 + ce2VarC3.a) : (short) 0) * this.y);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s;
    }
}
