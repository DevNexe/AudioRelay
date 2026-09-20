package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class PE extends cx1 implements j81<tg, tg> {
    public static final PE w = new PE();

    public PE() {
        super(1);
    }

    @Override // defpackage.j81
    public final tg invoke(tg tgVar) {
        tg tgVar2 = tgVar;
        TJon tJon = tgVar2.d;
        if (tJon != null) {
            return tg.a(tgVar2, null, null, null, TJon.a(tJon, false, true, 7), 23);
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
