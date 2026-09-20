package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class im1 extends cx1 implements h81<j83> {
    public final /* synthetic */ em1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public im1(em1 em1Var) {
        super(0);
        this.w = em1Var;
    }

    @Override // defpackage.h81
    public final j83 invoke() {
        em1 em1Var = this.w;
        return new j83(em1Var.l(), em1Var.m());
    }
}
