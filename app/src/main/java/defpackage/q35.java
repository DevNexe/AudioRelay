package defpackage;

import android.view.KeyEvent;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q35 extends l91 implements j81<xv1, Boolean> {
    public q35(p35 p35Var) {
        super(1, p35Var, p35.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
    }

    @Override // defpackage.j81
    public final Boolean invoke(xv1 xv1Var) {
        int iA;
        KeyEvent keyEvent = xv1Var.a;
        p35 p35Var = (p35) this.x;
        p35Var.getClass();
        boolean z = false;
        dw dwVar = keyEvent.getAction() == 0 && keyEvent.getUnicodeChar() != 0 ? new dw(new StringBuilder().appendCodePoint(keyEvent.getUnicodeChar()).toString(), 1) : null;
        r55 r55Var = p35Var.f;
        boolean z2 = p35Var.d;
        if (dwVar == null) {
            if ((zv1.c(keyEvent) == 2) && (iA = p35Var.i.a(keyEvent)) != 0 && (!pj0.a(iA) || z2)) {
                fl3 fl3Var = new fl3();
                fl3Var.w = true;
                o35 o35Var = new o35(iA, p35Var, fl3Var);
                p55 p55VarC = p35Var.a.c();
                x45 x45Var = p35Var.c;
                z35 z35Var = new z35(x45Var, p35Var.g, p55VarC, r55Var);
                o35Var.invoke(z35Var);
                boolean zA = s55.a(z35Var.f, x45Var.b);
                Z7jl z7jl = z35Var.g;
                if (!zA || !ur1.a(z7jl, x45Var.a)) {
                    p35Var.j.invoke(x45.a(x45Var, z7jl, z35Var.f, 4));
                }
                qd5 qd5Var = p35Var.h;
                if (qd5Var != null) {
                    qd5Var.f = true;
                }
                z = fl3Var.w;
            }
        } else if (z2) {
            p35Var.a(Collections.singletonList(dwVar));
            r55Var.a = null;
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
