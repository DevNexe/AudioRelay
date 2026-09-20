package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a04 extends cx1 implements h81<sd5> {
    public final /* synthetic */ j81<sy3, sd5> w;
    public final /* synthetic */ mp2 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a04(mp2 mp2Var, j81 j81Var) {
        super(0);
        this.w = j81Var;
        this.x = mp2Var;
    }

    @Override // defpackage.h81
    public final sd5 invoke() {
        this.w.invoke(new sy3.T23(this.x));
        return sd5.a;
    }
}
