package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k55 extends cx1 implements h81<ky1> {
    public final /* synthetic */ l55 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k55(l55 l55Var) {
        super(0);
        this.w = l55Var;
    }

    @Override // defpackage.h81
    public final ky1 invoke() {
        return new ky1(this.w.b);
    }
}
