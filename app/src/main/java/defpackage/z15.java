package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class z15 extends cx1 implements j81<ro0, sd5> {
    public final /* synthetic */ w15 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z15(w15 w15Var) {
        super(1);
        this.w = w15Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(ro0 ro0Var) {
        Map<Long, n74> mapI;
        ro0 ro0Var2 = ro0Var;
        w15 w15Var = this.w;
        v55 v55Var = w15Var.w;
        o55 o55Var = v55Var.f;
        if (o55Var != null) {
            v55Var.i.getValue();
            sd5 sd5Var = sd5.a;
            q84 q84Var = w15Var.x;
            v55 v55Var2 = w15Var.w;
            n74 n74Var = (q84Var == null || (mapI = q84Var.i()) == null) ? null : mapI.get(Long.valueOf(v55Var2.b));
            if (n74Var != null) {
                n74.QnHx qnHx = n74Var.a;
                n74.QnHx qnHx2 = n74Var.b;
                boolean z = n74Var.c;
                int i = !z ? qnHx.b : qnHx2.b;
                int i2 = !z ? qnHx2.b : qnHx.b;
                if (i != i2) {
                    TQ2_ tq2_A = o55Var.b.a(i, i2);
                    long j = v55Var2.h;
                    int i3 = qo0.a;
                    ro0Var2.n(tq2_A, j, 1.0f, gx0.w, null, 3);
                }
            }
            hn.c(ro0Var2.e0().b(), o55Var);
        }
        return sd5.a;
    }
}
