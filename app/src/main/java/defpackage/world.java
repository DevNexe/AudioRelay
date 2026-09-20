package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextUtils;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class world implements xy2 {
    public final h a;
    public final int b;
    public final long c;
    public final l55 d;
    public final List<dl3> e;
    public final oz1 f;

    public static final class QnHx extends cx1 implements h81<zm5> {
        public QnHx() {
            super(0);
        }

        @Override // defpackage.h81
        public final zm5 invoke() {
            world worldVar = world.this;
            return new zm5(worldVar.a.g.getTextLocale(), worldVar.d.e());
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x007a  */
    /* JADX WARN: Code duplicated, block: B:87:0x00d5  */
    public world(h hVar, int i, boolean z, long j) {
        int i2;
        xi4[] xi4VarArr;
        List<dl3> list;
        dl3 dl3Var;
        float fS;
        this.a = hVar;
        this.b = i;
        this.c = j;
        if (!(g70.i(j) == 0 && g70.j(j) == 0)) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString());
        }
        if (!(i >= 1)) {
            throw new IllegalArgumentException("maxLines should be greater than 0".toString());
        }
        w55 w55Var = hVar.b;
        q15 q15Var = w55Var.b.a;
        if (q15Var != null && q15Var.a == 1) {
            i2 = 3;
        } else {
            i2 = 2;
            if (q15Var != null && q15Var.a == 2) {
                i2 = 4;
            } else if (!(q15Var != null && q15Var.a == 3)) {
                if (q15Var != null && q15Var.a == 5) {
                    i2 = 0;
                } else if (q15Var != null && q15Var.a == 6) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
            }
        }
        int i3 = (q15Var != null && q15Var.a == 4) ? 1 : 0;
        TextUtils.TruncateAt truncateAt = z ? TextUtils.TruncateAt.END : null;
        l55 l55VarU = u(i2, i3, truncateAt, i);
        if (z) {
            int i4 = l55VarU.c;
            boolean z2 = l55VarU.a;
            Layout layout = l55VarU.b;
            if ((z2 ? layout.getLineBottom(i4 - 1) : layout.getHeight()) + l55VarU.d + l55VarU.e <= g70.g(j) || i <= 1) {
                this.d = l55VarU;
            } else {
                int iG = g70.g(j);
                for (int i5 = 0; i5 < i4; i5++) {
                    if (l55VarU.b(i5) > iG) {
                        i4 = i5;
                        break;
                    }
                }
                if (i4 > 0 && i4 != this.b) {
                    l55VarU = u(i2, i3, truncateAt, i4);
                }
                this.d = l55VarU;
            }
        } else {
            this.d = l55VarU;
        }
        UH8 uh8 = this.a.g;
        w55Var.a.a.d();
        uh8.a(null, ps0.e(v(), getHeight()));
        l55 l55Var = this.d;
        if (l55Var.e() instanceof Spanned) {
            xi4VarArr = (xi4[]) ((Spanned) l55Var.e()).getSpans(0, l55Var.e().length(), xi4.class);
            if (xi4VarArr.length == 0) {
                xi4VarArr = new xi4[0];
            }
        } else {
            xi4VarArr = new xi4[0];
        }
        for (xi4 xi4Var : xi4VarArr) {
            xi4Var.w = new cm4(ps0.e(v(), getHeight()));
        }
        CharSequence charSequence = this.a.h;
        if (charSequence instanceof Spanned) {
            Object[] spans = ((Spanned) charSequence).getSpans(0, charSequence.length(), m43.class);
            ArrayList arrayList = new ArrayList(spans.length);
            for (Object obj : spans) {
                m43 m43Var = (m43) obj;
                Spanned spanned = (Spanned) charSequence;
                int spanStart = spanned.getSpanStart(m43Var);
                int spanEnd = spanned.getSpanEnd(m43Var);
                int lineForOffset = this.d.b.getLineForOffset(spanStart);
                boolean z3 = this.d.b.getEllipsisCount(lineForOffset) > 0 && spanEnd > this.d.b.getEllipsisStart(lineForOffset);
                Layout layout2 = this.d.b;
                boolean z4 = spanEnd > (layout2.getEllipsisStart(lineForOffset) == 0 ? layout2.getLineEnd(lineForOffset) : layout2.getText().length());
                if (z3 || z4) {
                    dl3Var = null;
                } else {
                    int iOrdinal = i(spanStart).ordinal();
                    if (iOrdinal == 0) {
                        fS = s(spanStart, true);
                    } else {
                        if (iOrdinal != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        fS = s(spanStart, true) - m43Var.c();
                    }
                    float fC = m43Var.c() + fS;
                    float fA = this.d.a(lineForOffset) - m43Var.b();
                    dl3Var = new dl3(fS, fA, fC, m43Var.b() + fA);
                }
                arrayList.add(dl3Var);
            }
            list = arrayList;
        } else {
            list = cs0.w;
        }
        this.e = list;
        this.f = qLd.h(3, new QnHx());
    }

    @Override // defpackage.xy2
    public final dl3 a(int i) {
        l55 l55Var = this.d;
        float fD = l55.d(l55Var, i);
        float fD2 = l55.d(l55Var, i + 1);
        int lineForOffset = l55Var.b.getLineForOffset(i);
        return new dl3(fD, l55Var.c(lineForOffset), fD2, l55Var.b(lineForOffset));
    }

    @Override // defpackage.xy2
    public final np3 b(int i) {
        l55 l55Var = this.d;
        return l55Var.b.getParagraphDirection(l55Var.b.getLineForOffset(i)) == 1 ? np3.Ltr : np3.Rtl;
    }

    @Override // defpackage.xy2
    public final float c(int i) {
        return this.d.c(i);
    }

    @Override // defpackage.xy2
    public final float d() {
        l55 l55Var = this.d;
        int i = l55Var.c;
        int i2 = this.b;
        return i2 < i ? l55Var.a(i2 - 1) : l55Var.a(i - 1);
    }

    @Override // defpackage.xy2
    public final dl3 e(int i) {
        h hVar = this.a;
        if (!(i >= 0 && i <= hVar.h.length())) {
            StringBuilder sbC = iZUl.c("offset(", i, ") is out of bounds (0,");
            sbC.append(hVar.h.length());
            throw new AssertionError(sbC.toString());
        }
        l55 l55Var = this.d;
        float fD = l55.d(l55Var, i);
        int lineForOffset = l55Var.b.getLineForOffset(i);
        return new dl3(fD, l55Var.c(lineForOffset), fD, l55Var.b(lineForOffset));
    }

    @Override // defpackage.xy2
    public final long f(int i) {
        int iPreceding;
        int iPreceding2;
        int iFollowing;
        int iFollowing2;
        oz1 oz1Var = this.f;
        an5 an5Var = ((zm5) oz1Var.getValue()).a;
        an5Var.a(i);
        boolean zE = an5Var.e(an5Var.d.preceding(i));
        BreakIterator breakIterator = an5Var.d;
        if (zE) {
            an5Var.a(i);
            iPreceding = i;
            while (iPreceding != -1) {
                if (an5Var.e(iPreceding) && !an5Var.c(iPreceding)) {
                    break;
                }
                an5Var.a(iPreceding);
                iPreceding = breakIterator.preceding(iPreceding);
            }
        } else {
            an5Var.a(i);
            if (an5Var.d(i)) {
                if (!breakIterator.isBoundary(i) || an5Var.b(i)) {
                    iPreceding2 = breakIterator.preceding(i);
                    iPreceding = iPreceding2;
                } else {
                    iPreceding = i;
                }
            } else if (an5Var.b(i)) {
                iPreceding2 = breakIterator.preceding(i);
                iPreceding = iPreceding2;
            } else {
                iPreceding = -1;
            }
        }
        if (iPreceding == -1) {
            iPreceding = i;
        }
        an5 an5Var2 = ((zm5) oz1Var.getValue()).a;
        an5Var2.a(i);
        boolean zC = an5Var2.c(an5Var2.d.following(i));
        BreakIterator breakIterator2 = an5Var2.d;
        if (zC) {
            an5Var2.a(i);
            iFollowing = i;
            while (iFollowing != -1) {
                if (!an5Var2.e(iFollowing) && an5Var2.c(iFollowing)) {
                    break;
                }
                an5Var2.a(iFollowing);
                iFollowing = breakIterator2.following(iFollowing);
            }
        } else {
            an5Var2.a(i);
            if (an5Var2.b(i)) {
                if (!breakIterator2.isBoundary(i) || an5Var2.d(i)) {
                    iFollowing2 = breakIterator2.following(i);
                    iFollowing = iFollowing2;
                } else {
                    iFollowing = i;
                }
            } else if (an5Var2.d(i)) {
                iFollowing2 = breakIterator2.following(i);
                iFollowing = iFollowing2;
            } else {
                iFollowing = -1;
            }
        }
        if (iFollowing != -1) {
            i = iFollowing;
        }
        return Cz.a(iPreceding, i);
    }

    @Override // defpackage.xy2
    public final int g(int i) {
        return this.d.b.getLineForOffset(i);
    }

    @Override // defpackage.xy2
    public final float getHeight() {
        l55 l55Var = this.d;
        boolean z = l55Var.a;
        Layout layout = l55Var.b;
        return (z ? layout.getLineBottom(l55Var.c - 1) : layout.getHeight()) + l55Var.d + l55Var.e;
    }

    @Override // defpackage.xy2
    public final float h() {
        return this.d.a(0);
    }

    @Override // defpackage.xy2
    public final np3 i(int i) {
        return this.d.b.isRtlCharAt(i) ? np3.Rtl : np3.Ltr;
    }

    @Override // defpackage.xy2
    public final float j(int i) {
        return this.d.b(i);
    }

    @Override // defpackage.xy2
    public final int k(long j) {
        int iD = (int) kt2.d(j);
        l55 l55Var = this.d;
        return l55Var.b.getOffsetForHorizontal(l55Var.b.getLineForVertical(l55Var.d + iD), kt2.c(j));
    }

    @Override // defpackage.xy2
    public final List<dl3> l() {
        return this.e;
    }

    @Override // defpackage.xy2
    public final void m(dn dnVar, long j, yi4 yi4Var, a25 a25Var) {
        UH8 uh8 = this.a.g;
        uh8.b(j);
        uh8.c(yi4Var);
        uh8.d(a25Var);
        Canvas canvas = F6mt.a;
        Canvas canvas2 = ((ZCR) dnVar).a;
        l55 l55Var = this.d;
        if (l55Var.a) {
            canvas2.save();
            canvas2.clipRect(0.0f, 0.0f, v(), getHeight());
        }
        int i = l55Var.d;
        if (i != 0) {
            canvas2.translate(0.0f, i);
        }
        l55Var.b.draw(canvas2);
        if (i != 0) {
            canvas2.translate(0.0f, (-1) * i);
        }
        if (l55Var.a) {
            canvas2.restore();
        }
    }

    @Override // defpackage.xy2
    public final int n(int i) {
        return this.d.b.getLineStart(i);
    }

    @Override // defpackage.xy2
    public final int o(int i, boolean z) {
        l55 l55Var = this.d;
        if (!z) {
            Layout layout = l55Var.b;
            return layout.getEllipsisStart(i) == 0 ? layout.getLineEnd(i) : layout.getText().length();
        }
        Layout layout2 = l55Var.b;
        if (layout2.getEllipsisStart(i) == 0) {
            return layout2.getLineVisibleEnd(i);
        }
        return layout2.getEllipsisStart(i) + layout2.getLineStart(i);
    }

    @Override // defpackage.xy2
    public final float p(int i) {
        return this.d.b.getLineRight(i);
    }

    @Override // defpackage.xy2
    public final int q(float f) {
        l55 l55Var = this.d;
        return l55Var.b.getLineForVertical(l55Var.d + ((int) f));
    }

    @Override // defpackage.xy2
    public final TQ2_ r(int i, int i2) {
        boolean z = i >= 0 && i <= i2;
        h hVar = this.a;
        if (!z || i2 > hVar.h.length()) {
            StringBuilder sbA = a42.a("Start(", i, ") or End(", i2, ") is out of Range(0..");
            sbA.append(hVar.h.length());
            sbA.append("), or start > end!");
            throw new AssertionError(sbA.toString());
        }
        Path path = new Path();
        l55 l55Var = this.d;
        l55Var.b.getSelectionPath(i, i2, path);
        int i3 = l55Var.d;
        if (i3 != 0 && !path.isEmpty()) {
            path.offset(0.0f, i3);
        }
        return new TQ2_(path);
    }

    @Override // defpackage.xy2
    public final float s(int i, boolean z) {
        l55 l55Var = this.d;
        return z ? l55.d(l55Var, i) : ((ky1) l55Var.g.getValue()).a(i, false, false);
    }

    @Override // defpackage.xy2
    public final float t(int i) {
        return this.d.b.getLineLeft(i);
    }

    public final l55 u(int i, int i2, TextUtils.TruncateAt truncateAt, int i3) {
        n53 n53Var;
        h hVar = this.a;
        CharSequence charSequence = hVar.h;
        float fV = v();
        UH8 uh8 = hVar.g;
        int i4 = hVar.k;
        ry1 ry1Var = hVar.i;
        s53 s53Var = hVar.b.c;
        return new l55(charSequence, fV, uh8, i, truncateAt, i4, (s53Var == null || (n53Var = s53Var.b) == null) ? true : n53Var.a, i3, i2, ry1Var);
    }

    public final float v() {
        return g70.h(this.c);
    }
}
