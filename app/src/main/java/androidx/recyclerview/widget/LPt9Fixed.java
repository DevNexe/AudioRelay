package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class LPt9Fixed {
    public final RecyclerView.PRnFixed a;
    public int b = Integer.MIN_VALUE;
    public final Rect c = new Rect();

    public LPt9Fixed(RecyclerView.PRnFixed pRn) {
        this.a = pRn;
    }

    public static LPt9Fixed a(RecyclerView.PRnFixed pRn, int i) {
        if (i == 0) {
            return new Xn1(pRn);
        }
        if (i == 1) {
            return new ta(pRn);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m(View view);

    public abstract int n(View view);

    public abstract void o(int i);
}
