package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t21 extends cx1 implements h81<sd5> {
    public final /* synthetic */ r21 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t21(r21 r21Var) {
        super(0);
        this.w = r21Var;
    }

    @Override // defpackage.h81
    public final sd5 invoke() {
        i21 i21Var = this.w.B;
        if (i21Var != null) {
            i21Var.d();
        }
        return sd5.a;
    }
}
