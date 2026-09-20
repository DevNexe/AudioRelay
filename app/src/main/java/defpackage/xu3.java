package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xu3 implements wu3 {
    public static final xu3 a = new xu3();

    @Override // defpackage.wu3
    public final pg2 a(pg2 pg2Var, float f, boolean z) {
        if (((double) f) > 0.0d) {
            wo1.QnHx qnHx = wo1.a;
            return pg2Var.y(new mz1(f, z));
        }
        throw new IllegalArgumentException(("invalid weight " + f + "; must be greater than zero").toString());
    }

    public final pg2 b(pg2 pg2Var, da.CQf cQf) {
        wo1.QnHx qnHx = wo1.a;
        return pg2Var.y(new th5(cQf));
    }
}
