package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fw extends cx1 implements h81<sd5> {
    public final /* synthetic */ h81<sd5> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw(h81<sd5> h81Var) {
        super(0);
        this.w = h81Var;
    }

    @Override // defpackage.h81
    public final sd5 invoke() {
        a62.a.e("clicked_ok");
        this.w.invoke();
        return sd5.a;
    }
}
