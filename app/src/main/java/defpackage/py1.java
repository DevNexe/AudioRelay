package defpackage;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public final class py1 extends cx1 implements h81<Float> {
    public final /* synthetic */ ry1 w;
    public final /* synthetic */ CharSequence x;
    public final /* synthetic */ TextPaint y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public py1(ry1 ry1Var, CharSequence charSequence, UH8 uh8) {
        super(0);
        this.w = ry1Var;
        this.x = charSequence;
        this.y = uh8;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    @Override // defpackage.h81
    public final Float invoke() {
        BoringLayout.Metrics metrics = (BoringLayout.Metrics) this.w.a.getValue();
        boolean z = false;
        TextPaint textPaint = this.y;
        CharSequence charSequence = this.x;
        float desiredWidth = metrics != null ? metrics.width : Layout.getDesiredWidth(charSequence, 0, charSequence.length(), textPaint);
        if (!(desiredWidth == 0.0f) && (charSequence instanceof Spanned)) {
            if (textPaint.getLetterSpacing() == 0.0f) {
                Spanned spanned = (Spanned) charSequence;
                if (spanned.nextSpanTransition(-1, spanned.length(), m22.class) != spanned.length()) {
                    z = true;
                } else {
                    if (spanned.nextSpanTransition(-1, spanned.length(), l22.class) != spanned.length()) {
                        z = true;
                    }
                }
            } else {
                z = true;
            }
        }
        if (z) {
            desiredWidth += 0.5f;
        }
        return Float.valueOf(desiredWidth);
    }
}
