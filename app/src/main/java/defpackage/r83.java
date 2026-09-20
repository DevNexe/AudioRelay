package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class r83 extends cx1 implements h81<t83> {
    public static final r83 w = new r83();

    public r83() {
        super(0);
    }

    @Override // defpackage.h81
    public final t83 invoke() {
        zouF zouf = zouF.b;
        if (zouf != null) {
            return (t83) ((h81) zouf.a().a).invoke();
        }
        ur1.e("INSTANCE");
        throw null;
    }
}
