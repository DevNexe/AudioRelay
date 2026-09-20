package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class li1 extends cx1 implements j81<Throwable, sd5> {
    public final /* synthetic */ j81<bi1, sd5> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public li1(j81<? super bi1, sd5> j81Var) {
        super(1);
        this.w = j81Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(Throwable th) {
        this.w.invoke(new bi1.CQf(th));
        return sd5.a;
    }
}
