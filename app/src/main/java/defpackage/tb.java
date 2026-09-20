package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tb extends cx1 implements j81<Throwable, sd5> {
    public final /* synthetic */ j81<ev3, sd5> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public tb(j81<? super ev3, sd5> j81Var) {
        super(1);
        this.w = j81Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(Throwable th) {
        this.w.invoke(new ev3.EQ(th));
        return sd5.a;
    }
}
