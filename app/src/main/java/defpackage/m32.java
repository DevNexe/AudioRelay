package defpackage;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* JADX INFO: loaded from: classes.dex */
public final class m32 implements LineHeightSpan {
    public final boolean A;
    public final int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public final float w;
    public final int x = 0;
    public final int y;
    public final boolean z;

    public m32(float f, int i, boolean z, boolean z2, int i2) {
        this.w = f;
        this.y = i;
        this.z = z;
        this.A = z2;
        this.B = i2;
        if (!((i2 >= 0 && i2 < 101) || i2 == -1)) {
            throw new IllegalStateException("topRatio should be in [0..100] range or -1".toString());
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int i5 = fontMetricsInt.descent;
        int i6 = fontMetricsInt.ascent;
        if (i5 - i6 <= 0) {
            return;
        }
        boolean z = i == this.x;
        boolean z2 = i2 == this.y;
        boolean z3 = this.A;
        boolean z4 = this.z;
        if (z && z2 && z4 && z3) {
            return;
        }
        if (z) {
            int i7 = i5 - i6;
            int iCeil = (int) Math.ceil(this.w);
            int i8 = iCeil - i7;
            int iAbs = this.B;
            if (iAbs == -1) {
                iAbs = (int) ((Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent)) * 100.0f);
            }
            int iCeil2 = (int) (i8 <= 0 ? Math.ceil((i8 * iAbs) / 100.0f) : Math.ceil(((100 - iAbs) * i8) / 100.0f));
            int i9 = fontMetricsInt.descent;
            int i10 = iCeil2 + i9;
            this.E = i10;
            int i11 = i10 - iCeil;
            this.D = i11;
            if (z4) {
                i11 = fontMetricsInt.ascent;
            }
            this.C = i11;
            if (z3) {
                i10 = i9;
            }
            this.F = i10;
            this.G = fontMetricsInt.ascent - i11;
            this.H = i10 - i9;
        }
        fontMetricsInt.ascent = z ? this.C : this.D;
        fontMetricsInt.descent = z2 ? this.F : this.E;
    }
}
