package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fd0 extends cx1 implements h81<sd5> {
    public final /* synthetic */ j81<cd0, sd5> w;
    public final /* synthetic */ ce0.CQf x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public fd0(j81<? super cd0, sd5> j81Var, ce0.CQf cQf) {
        super(0);
        this.w = j81Var;
        this.x = cQf;
    }

    @Override // defpackage.h81
    public final sd5 invoke() {
        a62.a.e("clicked_save");
        this.w.invoke(new cd0.F1(this.x));
        return sd5.a;
    }
}
