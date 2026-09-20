package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vh extends cx1 implements h81<lQ> {
    public static final vh w = new vh();

    public vh() {
        super(0);
    }

    @Override // defpackage.h81
    public final lQ invoke() {
        ks ksVar = ks.c;
        if (ksVar == null) {
            ur1.e("INSTANCE");
            throw null;
        }
        lQ lQVar = (lQ) ((h81) ksVar.b.a).invoke();
        lQVar.g(VV4.NUlFixed.a);
        return lQVar;
    }
}
