package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* JADX INFO: loaded from: classes.dex */
public final class xi4 extends CharacterStyle implements UpdateAppearance {
    public cm4 w;

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        cm4 cm4Var;
        if (textPaint == null || (cm4Var = this.w) == null) {
            return;
        }
        long j = cm4Var.a;
        throw null;
    }
}
