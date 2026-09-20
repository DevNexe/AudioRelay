package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lz1 extends cx1 implements h81<sd5> {
    public final /* synthetic */ kz1 w;
    public final /* synthetic */ dn x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lz1(kz1 kz1Var, dn dnVar) {
        super(0);
        this.w = kz1Var;
        this.x = dnVar;
    }

    @Override // defpackage.h81
    public final sd5 invoke() {
        kz1 kz1Var = this.w;
        lo0 lo0Var = (lo0) kz1Var.O[0];
        dn dnVar = this.x;
        if (lo0Var == null) {
            kz1Var.X0(dnVar);
        } else {
            lo0Var.c(dnVar);
        }
        return sd5.a;
    }
}
