package defpackage;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes.dex */
public final class l22 extends MetricAffectingSpan {
    public final /* synthetic */ int w;
    public final float x;

    public /* synthetic */ l22(float f, int i) {
        this.w = i;
        this.x = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int i = this.w;
        float f = this.x;
        switch (i) {
            case 0:
                textPaint.setLetterSpacing(f);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + f);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        int i = this.w;
        float f = this.x;
        switch (i) {
            case 0:
                textPaint.setLetterSpacing(f);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + f);
                break;
        }
    }
}
