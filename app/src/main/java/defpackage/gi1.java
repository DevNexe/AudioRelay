package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gi1 extends cx1 implements j81<ci1, ci1> {
    public final /* synthetic */ bi1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gi1(bi1 bi1Var) {
        super(1);
        this.w = bi1Var;
    }

    @Override // defpackage.j81
    public final ci1 invoke(ci1 ci1Var) {
        bi1.YKK ykk = (bi1.YKK) this.w;
        return new ci1(Boolean.valueOf(ykk.a), Boolean.valueOf(ykk.c), ykk.b);
    }
}
