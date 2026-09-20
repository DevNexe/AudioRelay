package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class SJ extends cx1 implements j81<yy1, Boolean> {
    public static final SJ w = new SJ();

    public SJ() {
        super(1);
    }

    @Override // defpackage.j81
    public final Boolean invoke(yy1 yy1Var) {
        z84 z84VarZ = fp1.Z(yy1Var);
        x84 x84VarC = z84VarZ != null ? z84VarZ.c() : null;
        boolean z = false;
        if ((x84VarC != null && x84VarC.x) && x84VarC.b(w84.h)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
