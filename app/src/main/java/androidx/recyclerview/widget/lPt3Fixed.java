package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: loaded from: classes.dex */
public final class lPt3Fixed extends MZ {
    public final /* synthetic */ ck32 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lPt3Fixed(ck32 ck32Var, Context context) {
        super(context);
        this.q = ck32Var;
    }

    @Override // androidx.recyclerview.widget.MZ, androidx.recyclerview.widget.RecyclerView.SjP
    public final void c(View view, RecyclerView.SjP.QnHx qnHx) {
        ck32 ck32Var = this.q;
        int[] iArrA = ck32Var.a(ck32Var.a.getLayoutManager(), view);
        int i = iArrA[0];
        int i2 = iArrA[1];
        int iCeil = (int) Math.ceil(((double) g(Math.max(Math.abs(i), Math.abs(i2)))) / 0.3356d);
        if (iCeil > 0) {
            DecelerateInterpolator decelerateInterpolator = this.j;
            qnHx.a = i;
            qnHx.b = i2;
            qnHx.c = iCeil;
            qnHx.e = decelerateInterpolator;
            qnHx.f = true;
        }
    }

    @Override // androidx.recyclerview.widget.MZ
    public final float f(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.MZ
    public final int g(int i) {
        return Math.min(100, super.g(i));
    }
}
