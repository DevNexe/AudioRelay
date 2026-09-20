package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class ck32 extends Z {
    public ta c;
    public Xn1 d;

    public static int c(View view, LPt9Fixed lPt9) {
        return ((lPt9.c(view) / 2) + lPt9.e(view)) - ((lPt9.l() / 2) + lPt9.k());
    }

    public static View d(RecyclerView.PRnFixed pRn, LPt9Fixed lPt9) {
        int iV = pRn.v();
        View view = null;
        if (iV == 0) {
            return null;
        }
        int iL = (lPt9.l() / 2) + lPt9.k();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < iV; i2++) {
            View viewU = pRn.u(i2);
            int iAbs = Math.abs(((lPt9.c(viewU) / 2) + lPt9.e(viewU)) - iL);
            if (iAbs < i) {
                view = viewU;
                i = iAbs;
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.Z
    public final int[] a(RecyclerView.PRnFixed pRn, View view) {
        int[] iArr = new int[2];
        if (pRn.d()) {
            iArr[0] = c(view, e(pRn));
        } else {
            iArr[0] = 0;
        }
        if (pRn.e()) {
            iArr[1] = c(view, f(pRn));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public final LPt9Fixed e(RecyclerView.PRnFixed pRn) {
        Xn1 xn1 = this.d;
        if (xn1 == null || xn1.a != pRn) {
            this.d = new Xn1(pRn);
        }
        return this.d;
    }

    public final LPt9Fixed f(RecyclerView.PRnFixed pRn) {
        ta taVar = this.c;
        if (taVar == null || taVar.a != pRn) {
            this.c = new ta(pRn);
        }
        return this.c;
    }
}
