package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ca1 implements qs4 {
    public final sf5 a;
    public final z05<cp1> b;

    public ca1(sf5 sf5Var, z05<cp1> z05Var) {
        this.a = sf5Var;
        this.b = z05Var;
    }

    @Override // defpackage.qs4
    public final boolean a(Exception exc) {
        this.b.b(exc);
        return true;
    }

    @Override // defpackage.qs4
    public final boolean b(z3 z3Var) {
        if (!(z3Var.f() == 4) || this.a.a(z3Var)) {
            return false;
        }
        String str = z3Var.d;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        Long lValueOf = Long.valueOf(z3Var.f);
        Long lValueOf2 = Long.valueOf(z3Var.g);
        String strConcat = lValueOf == null ? "".concat(" tokenExpirationTimestamp") : "";
        if (lValueOf2 == null) {
            strConcat = rz.a(strConcat, " tokenCreationTimestamp");
        }
        if (!strConcat.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(strConcat));
        }
        this.b.a(new s3(str, lValueOf.longValue(), lValueOf2.longValue()));
        return true;
    }
}
