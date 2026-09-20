package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes.dex */
public class MZ extends RecyclerView.SjP {
    public PointF k;
    public final DisplayMetrics l;
    public float n;
    public final LinearInterpolator i = new LinearInterpolator();
    public final DecelerateInterpolator j = new DecelerateInterpolator();
    public boolean m = false;
    public int o = 0;
    public int p = 0;

    public MZ(Context context) {
        this.l = context.getResources().getDisplayMetrics();
    }

    public static int e(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0015  */
    /* JADX WARN: Code duplicated, block: B:25:0x006b  */
    @Override // androidx.recyclerview.widget.RecyclerView.SjP
    public void c(View view, RecyclerView.SjP.QnHx qnHx) {
        int i;
        int iE;
        PointF pointF = this.k;
        int i2 = -1;
        int iE2 = 0;
        if (pointF != null) {
            float f = pointF.x;
            if (f == 0.0f) {
                i = 0;
            } else {
                i = f > 0.0f ? 1 : -1;
            }
        } else {
            i = 0;
        }
        RecyclerView.PRnFixed pRn = this.c;
        if (pRn == null || !pRn.d()) {
            iE = 0;
        } else {
            RecyclerView.y yVar = (RecyclerView.y) view.getLayoutParams();
            iE = e((view.getLeft() - ((RecyclerView.y) view.getLayoutParams()).b.left) - ((ViewGroup.MarginLayoutParams) yVar).leftMargin, view.getRight() + ((RecyclerView.y) view.getLayoutParams()).b.right + ((ViewGroup.MarginLayoutParams) yVar).rightMargin, pRn.A(), pRn.n - pRn.B(), i);
        }
        PointF pointF2 = this.k;
        if (pointF2 != null) {
            float f2 = pointF2.y;
            if (f2 == 0.0f) {
                i2 = 0;
            } else if (f2 > 0.0f) {
                i2 = 1;
            }
        } else {
            i2 = 0;
        }
        RecyclerView.PRnFixed pRn2 = this.c;
        if (pRn2 != null && pRn2.e()) {
            RecyclerView.y yVar2 = (RecyclerView.y) view.getLayoutParams();
            iE2 = e((view.getTop() - ((RecyclerView.y) view.getLayoutParams()).b.top) - ((ViewGroup.MarginLayoutParams) yVar2).topMargin, view.getBottom() + ((RecyclerView.y) view.getLayoutParams()).b.bottom + ((ViewGroup.MarginLayoutParams) yVar2).bottomMargin, pRn2.C(), pRn2.o - pRn2.z(), i2);
        }
        int iCeil = (int) Math.ceil(((double) g((int) Math.sqrt((iE2 * iE2) + (iE * iE)))) / 0.3356d);
        if (iCeil > 0) {
            DecelerateInterpolator decelerateInterpolator = this.j;
            qnHx.a = -iE;
            qnHx.b = -iE2;
            qnHx.c = iCeil;
            qnHx.e = decelerateInterpolator;
            qnHx.f = true;
        }
    }

    public float f(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int g(int i) {
        float fAbs = Math.abs(i);
        if (!this.m) {
            this.n = f(this.l);
            this.m = true;
        }
        return (int) Math.ceil(fAbs * this.n);
    }
}
