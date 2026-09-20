package defpackage;

import java.io.IOException;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class ku4 extends B8C {
    public final Long w;
    public final h81<fk> x;

    /* JADX WARN: Multi-variable type inference failed */
    public ku4(Long l, h81<? extends fk> h81Var) {
        this.w = l;
        this.x = h81Var;
    }

    @Override // defpackage.B8C
    public final void S0(zi3 zi3Var) throws IOException {
        fk fkVarInvoke = this.x.invoke();
        ry4 ry4Var = ib.a;
        rn1 rn1Var = new rn1(fkVarInvoke, null);
        Logger logger = eu2.a;
        so1 so1Var = new so1(rn1Var, new z75());
        try {
            zi3Var.c(so1Var);
            Th.d(so1Var, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                Th.d(so1Var, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.B8C
    public final long u0() {
        Long l = this.w;
        if (l != null) {
            return l.longValue();
        }
        return -1L;
    }

    @Override // defpackage.B8C
    public final void v0() {
    }
}
