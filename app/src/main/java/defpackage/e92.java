package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e92 extends cx1 implements h81<ri2<x45>> {
    public final /* synthetic */ l82 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e92(l82 l82Var) {
        super(0);
        this.w = l82Var;
    }

    @Override // defpackage.h81
    public final ri2<x45> invoke() {
        String str = this.w.a;
        if (str == null) {
            str = "";
        }
        return ps0.R(new x45(str, 0L, 6));
    }
}
