package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class v73 extends cx1 implements h81<x73> {
    public static final v73 w = new v73();

    public v73() {
        super(0);
    }

    @Override // defpackage.h81
    public final x73 invoke() {
        zouF zouf = zouF.b;
        if (zouf != null) {
            return (x73) ((h81) zouf.a().d).invoke();
        }
        ur1.e("INSTANCE");
        throw null;
    }
}
