package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ed0 extends cx1 implements h81<sd5> {
    public final /* synthetic */ j81<cd0, sd5> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ed0(j81<? super cd0, sd5> j81Var) {
        super(0);
        this.w = j81Var;
    }

    @Override // defpackage.h81
    public final sd5 invoke() {
        a62.a.e("clicked_cancel");
        this.w.invoke(cd0.QnHx.a);
        return sd5.a;
    }
}
