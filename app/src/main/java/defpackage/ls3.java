package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ls3 implements uj1 {
    public final boolean a;
    public final float b;
    public final is4<yu> c;

    public ls3() {
        throw null;
    }

    public ls3(boolean z, float f, ri2 ri2Var) {
        this.a = z;
        this.b = f;
        this.c = ri2Var;
    }

    @Override // defpackage.uj1
    public final vj1 a(wp1 wp1Var, g30 g30Var) {
        g30Var.e(988743187);
        ws3 ws3Var = (ws3) g30Var.E(xs3.a);
        g30Var.e(-1524341038);
        is4<yu> is4Var = this.c;
        long jB = (is4Var.getValue().a > yu.h ? 1 : (is4Var.getValue().a == yu.h ? 0 : -1)) != 0 ? is4Var.getValue().a : ws3Var.b(g30Var);
        g30Var.G();
        us3 us3VarB = b(wp1Var, this.a, this.b, ps0.f0(new yu(jB), g30Var), ps0.f0(ws3Var.a(g30Var), g30Var), g30Var);
        wq0.e(us3VarB, wp1Var, new ks3(wp1Var, us3VarB, null), g30Var);
        g30Var.G();
        return us3VarB;
    }

    public abstract us3 b(wp1 wp1Var, boolean z, float f, ri2 ri2Var, ri2 ri2Var2, g30 g30Var);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ls3)) {
            return false;
        }
        ls3 ls3Var = (ls3) obj;
        return this.a == ls3Var.a && wm0.a(this.b, ls3Var.b) && ur1.a(this.c, ls3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ry0.b(this.b, (this.a ? 1231 : 1237) * 31, 31);
    }
}
