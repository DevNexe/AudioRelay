package defpackage;

import java.security.cert.Certificate;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class fj3 extends cx1 implements h81<List<? extends Certificate>> {
    public final /* synthetic */ wn w;
    public final /* synthetic */ ub1 x;
    public final /* synthetic */ COm6Fixed y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fj3(wn wnVar, ub1 ub1Var, COm6Fixed cOm6) {
        super(0);
        this.w = wnVar;
        this.x = ub1Var;
        this.y = cOm6;
    }

    @Override // defpackage.h81
    public final List<? extends Certificate> invoke() {
        return this.w.b.t0(this.y.i.d, this.x.a());
    }
}
