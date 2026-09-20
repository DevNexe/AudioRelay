package defpackage;

import io.ktor.utils.io.QnHx;
import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class cr2 extends dw2.F1 {
    public final la0 a;
    public final y81<Long, Long, z80<? super sd5>, Object> b;
    public final fk c;
    public final dw2 d;

    public cr2(dw2 dw2Var, ms1 ms1Var, y81 y81Var) {
        fk fkVarD;
        this.a = ms1Var;
        this.b = y81Var;
        if (dw2Var instanceof dw2.QnHx) {
            byte[] bArrD = ((dw2.QnHx) dw2Var).d();
            fkVarD = new QnHx(ByteBuffer.wrap(bArrD, 0, bArrD.length));
        } else if (dw2Var instanceof dw2.CQf) {
            fk.a.getClass();
            fkVarD = (fk) fk.QnHx.b.getValue();
        } else if (dw2Var instanceof dw2.F1) {
            fkVarD = ((dw2.F1) dw2Var).d();
        } else {
            if (!(dw2Var instanceof dw2.LPt8Fixed)) {
                throw new NoWhenBranchMatchedException();
            }
            fkVarD = xnX3.c(ha1.w, ms1Var, true, new br2(dw2Var, null)).x;
        }
        this.c = fkVarD;
        this.d = dw2Var;
    }

    @Override // defpackage.dw2
    public final Long a() {
        return this.d.a();
    }

    @Override // defpackage.dw2
    public final n80 b() {
        return this.d.b();
    }

    @Override // defpackage.dw2
    public final mc1 c() {
        return this.d.c();
    }

    @Override // dw2.F1
    public final fk d() {
        Long lA = a();
        return xnX3.c(ha1.w, this.a, true, new C1646zj(lA, this.c, this.b, null)).x;
    }
}
