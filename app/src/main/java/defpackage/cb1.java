package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cb1 extends cm5 {
    public cb1(e70 e70Var) {
        super(e70Var);
        e70Var.d.f();
        e70Var.e.f();
        this.f = ((bb1) e70Var).i0;
    }

    @Override // defpackage.cm5, defpackage.lj0
    public final void a(lj0 lj0Var) {
        qj0 qj0Var = this.h;
        if (qj0Var.c && !qj0Var.j) {
            qj0Var.d((int) ((((qj0) qj0Var.l.get(0)).g * ((bb1) this.b).e0) + 0.5f));
        }
    }

    @Override // defpackage.cm5
    public final void d() {
        e70 e70Var = this.b;
        bb1 bb1Var = (bb1) e70Var;
        int i = bb1Var.f0;
        int i2 = bb1Var.g0;
        int i3 = bb1Var.i0;
        qj0 qj0Var = this.h;
        if (i3 == 1) {
            if (i != -1) {
                qj0Var.l.add(e70Var.K.d.h);
                this.b.K.d.h.k.add(qj0Var);
                qj0Var.f = i;
            } else if (i2 != -1) {
                qj0Var.l.add(e70Var.K.d.i);
                this.b.K.d.i.k.add(qj0Var);
                qj0Var.f = -i2;
            } else {
                qj0Var.b = true;
                qj0Var.l.add(e70Var.K.d.i);
                this.b.K.d.i.k.add(qj0Var);
            }
            m(this.b.d.h);
            m(this.b.d.i);
            return;
        }
        if (i != -1) {
            qj0Var.l.add(e70Var.K.e.h);
            this.b.K.e.h.k.add(qj0Var);
            qj0Var.f = i;
        } else if (i2 != -1) {
            qj0Var.l.add(e70Var.K.e.i);
            this.b.K.e.i.k.add(qj0Var);
            qj0Var.f = -i2;
        } else {
            qj0Var.b = true;
            qj0Var.l.add(e70Var.K.e.i);
            this.b.K.e.i.k.add(qj0Var);
        }
        m(this.b.e.h);
        m(this.b.e.i);
    }

    @Override // defpackage.cm5
    public final void e() {
        e70 e70Var = this.b;
        int i = ((bb1) e70Var).i0;
        qj0 qj0Var = this.h;
        if (i == 1) {
            e70Var.P = qj0Var.g;
        } else {
            e70Var.Q = qj0Var.g;
        }
    }

    @Override // defpackage.cm5
    public final void f() {
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
