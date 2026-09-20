package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class ct {
    public static int a(RecyclerView.Aa aa, LPt9Fixed lPt9, View view, View view2, RecyclerView.PRnFixed pRn, boolean z) {
        if (pRn.v() == 0 || aa.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(RecyclerView.PRnFixed.D(view) - RecyclerView.PRnFixed.D(view2)) + 1;
        }
        return Math.min(lPt9.l(), lPt9.b(view2) - lPt9.e(view));
    }

    public static int b(RecyclerView.Aa aa, LPt9Fixed lPt9, View view, View view2, RecyclerView.PRnFixed pRn, boolean z, boolean z2) {
        if (pRn.v() == 0 || aa.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (aa.b() - Math.max(RecyclerView.PRnFixed.D(view), RecyclerView.PRnFixed.D(view2))) - 1) : Math.max(0, Math.min(RecyclerView.PRnFixed.D(view), RecyclerView.PRnFixed.D(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(lPt9.b(view2) - lPt9.e(view)) / (Math.abs(RecyclerView.PRnFixed.D(view) - RecyclerView.PRnFixed.D(view2)) + 1))) + (lPt9.k() - lPt9.e(view)));
        }
        return iMax;
    }

    public static int c(RecyclerView.Aa aa, LPt9Fixed lPt9, View view, View view2, RecyclerView.PRnFixed pRn, boolean z) {
        if (pRn.v() == 0 || aa.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return aa.b();
        }
        return (int) (((lPt9.b(view2) - lPt9.e(view)) / (Math.abs(RecyclerView.PRnFixed.D(view) - RecyclerView.PRnFixed.D(view2)) + 1)) * aa.b());
    }
}
