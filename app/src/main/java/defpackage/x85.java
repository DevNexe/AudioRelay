package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x85 extends cx1 implements h81<sd5> {
    public final /* synthetic */ h81<sd5> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x85(h81<sd5> h81Var) {
        super(0);
        this.w = h81Var;
    }

    @Override // defpackage.h81
    public final sd5 invoke() {
        a62 a62Var = a62.a;
        a62.a.g("clicked_on_ad_navigation_back", null);
        this.w.invoke();
        return sd5.a;
    }
}
