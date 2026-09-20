package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jy3 extends cx1 implements h81<ly3> {
    public static final jy3 w = new jy3();

    public jy3() {
        super(0);
    }

    @Override // defpackage.h81
    public final ly3 invoke() {
        ks ksVar = ks.c;
        if (ksVar != null) {
            return (ly3) ((h81) ksVar.b.c).invoke();
        }
        ur1.e("INSTANCE");
        throw null;
    }
}
