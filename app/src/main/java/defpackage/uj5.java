package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes3.dex */
public final class uj5 implements gu2 {
    public final /* synthetic */ xj5.QnHx a;
    public final /* synthetic */ xj5.CQf b;

    public uj5(ae aeVar, xj5.CQf cQf) {
        this.a = aeVar;
        this.b = cQf;
    }

    @Override // defpackage.gu2
    public final jm5 a(View view, jm5 jm5Var) {
        xj5.CQf cQf = this.b;
        int i = cQf.a;
        ae aeVar = (ae) this.a;
        aeVar.getClass();
        int iD = jm5Var.d();
        BottomSheetBehavior bottomSheetBehavior = aeVar.b;
        bottomSheetBehavior.r = iD;
        boolean zA = xj5.a(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z = bottomSheetBehavior.m;
        if (z) {
            int iA = jm5Var.a();
            bottomSheetBehavior.q = iA;
            paddingBottom = iA + cQf.c;
        }
        boolean z2 = bottomSheetBehavior.n;
        int i2 = cQf.b;
        if (z2) {
            paddingLeft = (zA ? i2 : i) + jm5Var.b();
        }
        if (bottomSheetBehavior.o) {
            if (!zA) {
                i = i2;
            }
            paddingRight = jm5Var.c() + i;
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        boolean z3 = aeVar.a;
        if (z3) {
            bottomSheetBehavior.k = jm5Var.a.f().d;
        }
        if (z || z3) {
            bottomSheetBehavior.I();
        }
        return jm5Var;
    }
}
