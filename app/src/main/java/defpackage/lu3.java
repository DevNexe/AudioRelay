package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lu3 extends ga0 {
    public lu3(ja0 ja0Var, ja0 ja0Var2, ja0 ja0Var3, ja0 ja0Var4) {
        super(ja0Var, ja0Var2, ja0Var3, ja0Var4);
    }

    @Override // defpackage.ga0
    public final lu3 b(ja0 ja0Var, ja0 ja0Var2, ja0 ja0Var3, ja0 ja0Var4) {
        return new lu3(ja0Var, ja0Var2, ja0Var3, ja0Var4);
    }

    @Override // defpackage.ga0
    public final ew2 c(long j, float f, float f2, float f3, float f4, jy1 jy1Var) {
        if (((f + f2) + f3) + f4 == 0.0f) {
            return new ew2.CQf(ps0.q0(j));
        }
        dl3 dl3VarQ0 = ps0.q0(j);
        jy1 jy1Var2 = jy1.Ltr;
        float f5 = jy1Var == jy1Var2 ? f : f2;
        long jF = hH.f(f5, f5);
        float f6 = jy1Var == jy1Var2 ? f2 : f;
        long jF2 = hH.f(f6, f6);
        float f7 = jy1Var == jy1Var2 ? f3 : f4;
        long jF3 = hH.f(f7, f7);
        float f8 = jy1Var == jy1Var2 ? f4 : f3;
        return new ew2.F1(new ku3(dl3VarQ0.a, dl3VarQ0.b, dl3VarQ0.c, dl3VarQ0.d, jF, jF2, jF3, hH.f(f8, f8)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lu3)) {
            return false;
        }
        lu3 lu3Var = (lu3) obj;
        if (!ur1.a(this.a, lu3Var.a)) {
            return false;
        }
        if (!ur1.a(this.b, lu3Var.b)) {
            return false;
        }
        if (ur1.a(this.c, lu3Var.c)) {
            return ur1.a(this.d, lu3Var.d);
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.a + ", topEnd = " + this.b + ", bottomEnd = " + this.c + ", bottomStart = " + this.d + ')';
    }
}
