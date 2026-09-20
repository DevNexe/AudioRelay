package defpackage;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class qa5 extends qi2 {
    public final qi2 l;
    public final j81<Object, sd5> m;
    public final j81<Object, sd5> n;
    public final boolean o;
    public final boolean p;

    public qa5(qi2 qi2Var, j81<Object, sd5> j81Var, j81<Object, sd5> j81Var2, boolean z, boolean z2) {
        j81<Object, sd5> j81Var3;
        j81<Object, sd5> j81Var4;
        super(0, gp4.A, ip4.i(j81Var, (qi2Var == null || (j81Var4 = qi2Var.e) == null) ? ip4.i.get().e : j81Var4, z), ip4.b(j81Var2, (qi2Var == null || (j81Var3 = qi2Var.f) == null) ? ip4.i.get().f : j81Var3));
        this.l = qi2Var;
        this.m = j81Var;
        this.n = j81Var2;
        this.o = z;
        this.p = z2;
    }

    public final qi2 A() {
        qi2 qi2Var = this.l;
        return qi2Var == null ? ip4.i.get() : qi2Var;
    }

    @Override // defpackage.qi2, defpackage.cp4
    public final void c() {
        qi2 qi2Var;
        this.c = true;
        if (!this.p || (qi2Var = this.l) == null) {
            return;
        }
        qi2Var.c();
    }

    @Override // defpackage.cp4
    public final int d() {
        return A().d();
    }

    @Override // defpackage.cp4
    public final gp4 e() {
        return A().e();
    }

    @Override // defpackage.qi2, defpackage.cp4
    public final boolean g() {
        return A().g();
    }

    @Override // defpackage.qi2, defpackage.cp4
    public final void j() {
        zp4.a();
        throw null;
    }

    @Override // defpackage.qi2, defpackage.cp4
    public final void k() {
        zp4.a();
        throw null;
    }

    @Override // defpackage.qi2, defpackage.cp4
    public final void l() {
        A().l();
    }

    @Override // defpackage.qi2, defpackage.cp4
    public final void m(ws4 ws4Var) {
        A().m(ws4Var);
    }

    @Override // defpackage.cp4
    public final void p(int i) {
        zp4.a();
        throw null;
    }

    @Override // defpackage.cp4
    public final void q(gp4 gp4Var) {
        zp4.a();
        throw null;
    }

    @Override // defpackage.qi2, defpackage.cp4
    public final cp4 r(j81<Object, sd5> j81Var) {
        j81<Object, sd5> j81VarI = ip4.i(j81Var, this.e, true);
        return !this.o ? ip4.f(A().r(null), j81VarI, true) : A().r(j81VarI);
    }

    @Override // defpackage.qi2
    public final ep4 t() {
        return A().t();
    }

    @Override // defpackage.qi2
    public final Set<ws4> u() {
        return A().u();
    }

    @Override // defpackage.qi2
    public final void x(HashSet hashSet) {
        zp4.a();
        throw null;
    }

    @Override // defpackage.qi2
    public final qi2 y(j81<Object, sd5> j81Var, j81<Object, sd5> j81Var2) {
        j81<Object, sd5> j81VarI = ip4.i(j81Var, this.e, true);
        j81<Object, sd5> j81VarB = ip4.b(j81Var2, this.f);
        return !this.o ? new qa5(A().y(null, j81VarB), j81VarI, j81VarB, false, true) : A().y(j81VarI, j81VarB);
    }
}
