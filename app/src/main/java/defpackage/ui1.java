package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ui1 extends cx1 implements h81<ji1> {
    public static final ui1 w = new ui1();

    public ui1() {
        super(0);
    }

    @Override // defpackage.h81
    public final ji1 invoke() {
        zouF zouf = zouF.b;
        if (zouf != null) {
            return (ji1) ((h81) zouf.a().b).invoke();
        }
        ur1.e("INSTANCE");
        throw null;
    }
}
