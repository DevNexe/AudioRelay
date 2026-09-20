package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yh4 extends cx1 implements j81<Boolean, sd5> {
    public final /* synthetic */ j81<tg4, sd5> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public yh4(j81<? super tg4, sd5> j81Var) {
        super(1);
        this.w = j81Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(Boolean bool) {
        this.w.invoke(new tg4.LPt6Fixed(bool.booleanValue()));
        return sd5.a;
    }
}
