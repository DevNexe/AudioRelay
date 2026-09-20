package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class l55 {
    public final boolean a;
    public final Layout b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public final oz1 g;

    /* JADX WARN: Code duplicated, block: B:53:0x012f  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a6  */
    public l55(CharSequence charSequence, float f, UH8 uh8, int i, TextUtils.TruncateAt truncateAt, int i2, boolean z, int i3, int i4, ry1 ry1Var) {
        Layout layoutA;
        boolean z2;
        int iMax;
        uy2<Integer, Integer> uy2Var;
        m32[] m32VarArr;
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristicA = n55.a(i2);
        Layout.Alignment alignment = r15.a;
        Layout.Alignment alignment2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? Layout.Alignment.ALIGN_NORMAL : r15.b : r15.a : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z3 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, y8.class) < length;
        BoringLayout.Metrics metrics = (BoringLayout.Metrics) ry1Var.a.getValue();
        double d = f;
        int iCeil = (int) Math.ceil(d);
        if (metrics == null || ((Number) ry1Var.c.getValue()).floatValue() > f || z3) {
            this.f = false;
            gt4 gt4Var = ft4.a;
            layoutA = ft4.a.a(new it4(charSequence, charSequence.length(), uh8, iCeil, textDirectionHeuristicA, alignment2, i3, truncateAt, (int) Math.ceil(d), 1.0f, 0.0f, i4, z, true, 0, 0, null, null));
        } else {
            this.f = true;
            if (!(iCeil >= 0)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(iCeil >= 0)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            layoutA = truncateAt == null ? new BoringLayout(charSequence, uh8, iCeil, alignment2, 1.0f, 0.0f, metrics, z) : new BoringLayout(charSequence, uh8, iCeil, alignment2, 1.0f, 0.0f, metrics, z, truncateAt, iCeil);
        }
        this.b = layoutA;
        int iMin = Math.min(layoutA.getLineCount(), i3);
        this.c = iMin;
        if (iMin < i3) {
            z2 = false;
        } else {
            int i5 = iMin - 1;
            if (layoutA.getEllipsisCount(i5) > 0 || layoutA.getLineEnd(i5) != charSequence.length()) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        this.a = z2;
        if (z) {
            iMax = 0;
            uy2Var = new uy2<>(0, 0);
        } else if (!this.f && Build.VERSION.SDK_INT >= 28) {
            iMax = 0;
            uy2Var = new uy2<>(0, 0);
        } else {
            TextPaint paint = layoutA.getPaint();
            CharSequence text = layoutA.getText();
            iMax = 0;
            Rect rectS = Cz.s(paint, text, layoutA.getLineStart(0), layoutA.getLineEnd(0));
            int lineAscent = layoutA.getLineAscent(0);
            int i6 = rectS.top;
            int topPadding = i6 < lineAscent ? lineAscent - i6 : layoutA.getTopPadding();
            if (iMin != 1) {
                int lineCount = layoutA.getLineCount() - 1;
                rectS = Cz.s(paint, text, layoutA.getLineStart(lineCount), layoutA.getLineEnd(lineCount));
            }
            int lineDescent = layoutA.getLineDescent(layoutA.getLineCount() - 1);
            int i7 = rectS.bottom;
            int bottomPadding = i7 > lineDescent ? i7 - lineDescent : layoutA.getBottomPadding();
            uy2Var = (topPadding == 0 && bottomPadding == 0) ? n55.a : new uy2<>(Integer.valueOf(topPadding), Integer.valueOf(bottomPadding));
        }
        if (e() instanceof Spanned) {
            m32VarArr = (m32[]) ((Spanned) e()).getSpans(iMax, e().length(), m32.class);
            if (m32VarArr.length == 0) {
                m32VarArr = new m32[iMax];
            }
        } else {
            m32VarArr = new m32[iMax];
        }
        int iMax2 = 0;
        for (m32 m32Var : m32VarArr) {
            int i8 = m32Var.G;
            iMax = i8 < 0 ? Math.max(iMax, Math.abs(i8)) : iMax;
            int i9 = m32Var.H;
            if (i9 < 0) {
                iMax2 = Math.max(iMax, Math.abs(i9));
            }
        }
        uy2<Integer, Integer> uy2Var2 = (iMax == 0 && iMax2 == 0) ? n55.a : new uy2<>(Integer.valueOf(iMax), Integer.valueOf(iMax2));
        this.d = Math.max(uy2Var.w.intValue(), uy2Var2.w.intValue());
        this.e = Math.max(uy2Var.x.intValue(), uy2Var2.x.intValue());
        this.g = qLd.h(3, new k55(this));
    }

    public static float d(l55 l55Var, int i) {
        return ((ky1) l55Var.g.getValue()).a(i, true, false);
    }

    public final float a(int i) {
        return this.d + this.b.getLineBaseline(i);
    }

    public final float b(int i) {
        return this.d + this.b.getLineBottom(i) + (i == this.c + (-1) ? this.e : 0);
    }

    public final float c(int i) {
        return this.b.getLineTop(i) + (i == 0 ? 0 : this.d);
    }

    public final CharSequence e() {
        return this.b.getText();
    }
}
