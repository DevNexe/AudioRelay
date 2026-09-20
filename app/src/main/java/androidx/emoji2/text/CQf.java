package androidx.emoji2.text;

import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public final class CQf implements LPt8Fixed.InterfaceC0023LPt8 {
    public static final ThreadLocal<StringBuilder> b = new ThreadLocal<>();
    public final TextPaint a;

    public CQf() {
        TextPaint textPaint = new TextPaint();
        this.a = textPaint;
        textPaint.setTextSize(10.0f);
    }
}
