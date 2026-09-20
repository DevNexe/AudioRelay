package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uq1 extends cx1 implements h81<sd5> {
    public final /* synthetic */ sq1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uq1(sq1 sq1Var) {
        super(0);
        this.w = sq1Var;
    }

    @Override // defpackage.h81
    public final sd5 invoke() {
        this.w.stop();
        return sd5.a;
    }
}
