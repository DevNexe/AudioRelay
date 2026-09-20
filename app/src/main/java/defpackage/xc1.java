package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class xc1 extends cm5 {
    public xc1(e70 e70Var) {
        super(e70Var);
    }

    @Override // defpackage.cm5, defpackage.lj0
    public final void a(lj0 lj0Var) {
        k8 k8Var = (k8) this.b;
        int i = k8Var.g0;
        qj0 qj0Var = this.h;
        Iterator it = qj0Var.l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((qj0) it.next()).g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            qj0Var.d(i3 + k8Var.i0);
        } else {
            qj0Var.d(i2 + k8Var.i0);
        }
    }

    @Override // defpackage.cm5
    public final void d() {
        e70 e70Var = this.b;
        if (e70Var instanceof k8) {
            qj0 qj0Var = this.h;
            qj0Var.b = true;
            k8 k8Var = (k8) e70Var;
            int i = k8Var.g0;
            boolean z = k8Var.h0;
            ArrayList arrayList = qj0Var.l;
            int i2 = 0;
            if (i == 0) {
                qj0Var.e = 4;
                while (i2 < k8Var.f0) {
                    e70 e70Var2 = k8Var.e0[i2];
                    if (z || e70Var2.X != 8) {
                        qj0 qj0Var2 = e70Var2.d.h;
                        qj0Var2.k.add(qj0Var);
                        arrayList.add(qj0Var2);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 1) {
                qj0Var.e = 5;
                while (i2 < k8Var.f0) {
                    e70 e70Var3 = k8Var.e0[i2];
                    if (z || e70Var3.X != 8) {
                        qj0 qj0Var3 = e70Var3.d.i;
                        qj0Var3.k.add(qj0Var);
                        arrayList.add(qj0Var3);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 2) {
                qj0Var.e = 6;
                while (i2 < k8Var.f0) {
                    e70 e70Var4 = k8Var.e0[i2];
                    if (z || e70Var4.X != 8) {
                        qj0 qj0Var4 = e70Var4.e.h;
                        qj0Var4.k.add(qj0Var);
                        arrayList.add(qj0Var4);
                    }
                    i2++;
                }
                m(this.b.e.h);
                m(this.b.e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            qj0Var.e = 7;
            while (i2 < k8Var.f0) {
                e70 e70Var5 = k8Var.e0[i2];
                if (z || e70Var5.X != 8) {
                    qj0 qj0Var5 = e70Var5.e.i;
                    qj0Var5.k.add(qj0Var);
                    arrayList.add(qj0Var5);
                }
                i2++;
            }
            m(this.b.e.h);
            m(this.b.e.i);
        }
    }

    @Override // defpackage.cm5
    public final void e() {
        e70 e70Var = this.b;
        if (e70Var instanceof k8) {
            int i = ((k8) e70Var).g0;
            qj0 qj0Var = this.h;
            if (i == 0 || i == 1) {
                e70Var.P = qj0Var.g;
            } else {
                e70Var.Q = qj0Var.g;
            }
        }
    }

    @Override // defpackage.cm5
    public final void f() {
        this.c = null;
        this.h.c();
    }

    @Override // defpackage.cm5
    public final boolean k() {
        return false;
    }

    public final void m(qj0 qj0Var) {
        qj0 qj0Var2 = this.h;
        qj0Var2.k.add(qj0Var);
        qj0Var.l.add(qj0Var2);
    }
}
