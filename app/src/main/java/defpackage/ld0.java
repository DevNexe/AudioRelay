package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ld0 extends cx1 implements h81<ri2<ce0.CQf>> {
    public final /* synthetic */ dd0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld0(dd0 dd0Var) {
        super(0);
        this.w = dd0Var;
    }

    @Override // defpackage.h81
    public final ri2<ce0.CQf> invoke() {
        ce0.CQf cQf = this.w.b;
        if (cQf == null) {
            cQf = new ce0.CQf(null, null);
        }
        return ps0.R(cQf);
    }
}
