package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class Xvf extends cx1 implements j81<tg, tg> {
    public static final Xvf w = new Xvf();

    public Xvf() {
        super(1);
    }

    @Override // defpackage.j81
    public final tg invoke(tg tgVar) {
        tg tgVar2 = tgVar;
        TJon tJon = tgVar2.d;
        if (tJon != null) {
            return tg.a(tgVar2, null, null, null, TJon.a(tJon, false, false, 3), 23);
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
