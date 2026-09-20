package defpackage;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class it4 {
    public final CharSequence a;
    public final int b = 0;
    public final int c;
    public final TextPaint d;
    public final int e;
    public final TextDirectionHeuristic f;
    public final Layout.Alignment g;
    public final int h;
    public final TextUtils.TruncateAt i;
    public final int j;
    public final float k;
    public final float l;
    public final int m;
    public final boolean n;
    public final boolean o;
    public final int p;
    public final int q;
    public final int[] r;
    public final int[] s;

    public it4(CharSequence charSequence, int i, UH8 uh8, int i2, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i3, TextUtils.TruncateAt truncateAt, int i4, float f, float f2, int i5, boolean z, boolean z2, int i6, int i7, int[] iArr, int[] iArr2) {
        this.a = charSequence;
        this.c = i;
        this.d = uh8;
        this.e = i2;
        this.f = textDirectionHeuristic;
        this.g = alignment;
        this.h = i3;
        this.i = truncateAt;
        this.j = i4;
        this.k = f;
        this.l = f2;
        this.m = i5;
        this.n = z;
        this.o = z2;
        this.p = i6;
        this.q = i7;
        this.r = iArr;
        this.s = iArr2;
        if (!(i >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i >= 0 && i <= charSequence.length())) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i3 >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(f >= 0.0f)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }
}
