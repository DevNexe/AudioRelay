package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class ig1 implements tf1 {
    public final zc5 a = new zc5(null);
    public uf1 b = uf1.b;
    public final oc1 c = new oc1(0);
    public Object d = wr0.a;
    public ms1 e = ddf.d();
    public final GPUw f = new c50();

    @Override // defpackage.tf1
    public final oc1 a() {
        return this.c;
    }

    public final void b(rb5 rb5Var) {
        GPUw gPUw = this.f;
        if (rb5Var != null) {
            gPUw.a(ep3.a, rb5Var);
        } else {
            gPUw.g().remove(ep3.a);
        }
    }

    public final void c(ig1 ig1Var) {
        this.e = ig1Var.e;
        this.b = ig1Var.b;
        this.d = ig1Var.d;
        Dt<rb5> dt = ep3.a;
        GPUw gPUw = ig1Var.f;
        b((rb5) gPUw.d(dt));
        zc5 zc5Var = ig1Var.a;
        cd5 cd5Var = zc5Var.a;
        zc5 zc5Var2 = this.a;
        zc5Var2.a = cd5Var;
        zc5Var2.b = zc5Var.b;
        zc5Var2.c = zc5Var.c;
        zc5Var2.h = zc5Var.h;
        zc5Var2.e = zc5Var.e;
        zc5Var2.f = zc5Var.f;
        hz2 hz2Var = new hz2(8);
        Th.b(hz2Var, zc5Var.i);
        zc5Var2.i = hz2Var;
        zc5Var2.j = new ye5(hz2Var);
        zc5Var2.g = zc5Var.g;
        zc5Var2.d = zc5Var.d;
        zc5Var2.h = zc5Var2.h;
        Th.b(this.c, ig1Var.c);
        Iterator<T> it = gPUw.b().iterator();
        while (it.hasNext()) {
            Dt dt2 = (Dt) it.next();
            this.f.a(dt2, gPUw.e(dt2));
        }
    }
}
