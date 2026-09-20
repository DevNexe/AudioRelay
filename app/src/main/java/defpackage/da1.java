package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class da1 implements qs4 {
    public final z05<String> a;

    public da1(z05<String> z05Var) {
        this.a = z05Var;
    }

    @Override // defpackage.qs4
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // defpackage.qs4
    public final boolean b(z3 z3Var) {
        if (!(z3Var.f() == 3)) {
            if (!(z3Var.f() == 4)) {
                if (!(z3Var.f() == 5)) {
                    return false;
                }
            }
        }
        this.a.c(z3Var.b);
        return true;
    }
}
