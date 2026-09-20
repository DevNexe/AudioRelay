package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes3.dex */
public final class t15 extends B8C {
    public final /* synthetic */ TextPaint w;
    public final /* synthetic */ B8C x;
    public final /* synthetic */ s15 y;

    public t15(s15 s15Var, TextPaint textPaint, B8C b8c) {
        this.y = s15Var;
        this.w = textPaint;
        this.x = b8c;
    }

    @Override // defpackage.B8C
    public final void J0(int i) {
        this.x.J0(i);
    }

    @Override // defpackage.B8C
    public final void K0(Typeface typeface, boolean z) {
        this.y.g(this.w, typeface);
        this.x.K0(typeface, z);
    }
}
