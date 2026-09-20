package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nx4 extends cx1 implements j81<Long, Object> {
    public final /* synthetic */ j81<Long, Object> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public nx4(j81<? super Long, Object> j81Var) {
        super(1);
        this.w = j81Var;
    }

    @Override // defpackage.j81
    public final Object invoke(Long l) {
        return this.w.invoke(Long.valueOf(l.longValue() / 1));
    }
}
