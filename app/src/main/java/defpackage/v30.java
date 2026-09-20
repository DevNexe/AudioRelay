package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v30 extends cx1 implements y81<jE<?>, mn4, xl3, sd5> {
    public final /* synthetic */ j30 w;
    public final /* synthetic */ ih2 x;
    public final /* synthetic */ ih2 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v30(j30 j30Var, ih2 ih2Var, ih2 ih2Var2) {
        super(3);
        this.w = j30Var;
        this.x = ih2Var;
        this.y = ih2Var2;
    }

    @Override // defpackage.y81
    public final sd5 invoke(jE<?> jEVar, mn4 mn4Var, xl3 xl3Var) {
        mn4 mn4Var2 = mn4Var;
        hh2 hh2VarJ = this.w.b.j(this.x);
        if (hh2VarJ == null) {
            e40.c("Could not resolve state for movable content");
            throw null;
        }
        e40.f(mn4Var2.m <= 0 && mn4Var2.o(mn4Var2.r + 1) == 1);
        int i = mn4Var2.r;
        int i2 = mn4Var2.h;
        int i3 = mn4Var2.i;
        mn4Var2.a(1);
        mn4Var2.J();
        mn4Var2.e();
        mn4 mn4VarC = hh2VarJ.a.c();
        try {
            List listA = mn4.QnHx.a(mn4VarC, 1, mn4Var2, false, true);
            mn4VarC.f();
            mn4Var2.j();
            mn4Var2.i();
            mn4Var2.r = i;
            mn4Var2.h = i2;
            mn4Var2.i = i3;
            if (!listA.isEmpty()) {
                n40 n40Var = (n40) this.y.c;
                int size = listA.size();
                for (int i4 = 0; i4 < size; i4++) {
                    Object objH = mn4Var2.H(mn4Var2.c((Z1) listA.get(i4)), 0);
                    tk3 tk3Var = objH instanceof tk3 ? (tk3) objH : null;
                    if (tk3Var != null) {
                        tk3Var.b = n40Var;
                    }
                }
            }
            return sd5.a;
        } catch (Throwable th) {
            mn4VarC.f();
            throw th;
        }
    }
}
