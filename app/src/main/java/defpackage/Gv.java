package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class Gv extends cx1 implements j81<tg, tg> {
    public static final Gv w = new Gv();

    public Gv() {
        super(1);
    }

    @Override // defpackage.j81
    public final tg invoke(tg tgVar) {
        tg tgVar2 = tgVar;
        TJon tJon = tgVar2.d;
        if (tJon != null) {
            return tg.a(tgVar2, null, null, null, TJon.a(tJon, true, false, 13), 23);
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
