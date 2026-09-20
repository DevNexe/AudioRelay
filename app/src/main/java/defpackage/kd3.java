package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kd3 extends cx1 implements h81<md3> {
    public static final kd3 w = new kd3();

    public kd3() {
        super(0);
    }

    @Override // defpackage.h81
    public final md3 invoke() {
        lb3 lb3Var = lb3.b;
        if (lb3Var != null) {
            return lb3Var.a.a.invoke();
        }
        ur1.e("INSTANCE");
        throw null;
    }
}
