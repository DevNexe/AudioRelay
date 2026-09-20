package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d81 extends cx1 implements h81<sd5> {
    public final /* synthetic */ j81<d71, sd5> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d81(j81<? super d71, sd5> j81Var) {
        super(0);
        this.w = j81Var;
    }

    @Override // defpackage.h81
    public final sd5 invoke() {
        a62 a62Var = a62.a;
        a62.a.g("clicked_on_go_premium", null);
        this.w.invoke(d71.F1.a);
        return sd5.a;
    }
}
