package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class cp4 {
    public gp4 a;
    public int b;
    public boolean c;
    public int d;

    public static final class QnHx {
        public static Object a(j81 j81Var, h81 h81Var) {
            cp4 qa5Var;
            if (j81Var == null) {
                return h81Var.invoke();
            }
            cp4 cp4Var = (cp4) ip4.b.h();
            if (cp4Var == null || (cp4Var instanceof qi2)) {
                qa5Var = new qa5(cp4Var instanceof qi2 ? (qi2) cp4Var : null, j81Var, null, true, false);
            } else {
                if (j81Var == null) {
                    return h81Var.invoke();
                }
                qa5Var = cp4Var.r(j81Var);
            }
            try {
                cp4 cp4VarI = qa5Var.i();
                try {
                    Object objInvoke = h81Var.invoke();
                    cp4.o(cp4VarI);
                    qa5Var.c();
                    return objInvoke;
                } catch (Throwable th) {
                    cp4.o(cp4VarI);
                    throw th;
                }
            } catch (Throwable th2) {
                qa5Var.c();
                throw th2;
            }
        }
    }

    public cp4(int i, gp4 gp4Var) {
        int iA;
        int iW;
        this.a = gp4Var;
        this.b = i;
        if (i != 0) {
            gp4 gp4VarE = e();
            ip4.QnHx qnHx = ip4.a;
            int[] iArr = gp4VarE.z;
            if (iArr != null) {
                i = iArr[0];
            } else {
                int i2 = gp4VarE.y;
                long j = gp4VarE.x;
                if (j != 0) {
                    iW = fp1.w(j);
                } else {
                    long j2 = gp4VarE.w;
                    if (j2 != 0) {
                        i2 += 64;
                        iW = fp1.w(j2);
                    }
                }
                i = iW + i2;
            }
            synchronized (ip4.c) {
                iA = ip4.f.a(i);
            }
        } else {
            iA = -1;
        }
        this.d = iA;
    }

    public static void o(cp4 cp4Var) {
        ip4.b.j(cp4Var);
    }

    public final void a() {
        synchronized (ip4.c) {
            b();
            n();
            sd5 sd5Var = sd5.a;
        }
    }

    public void b() {
        ip4.d = ip4.d.b(d());
    }

    public void c() {
        this.c = true;
        synchronized (ip4.c) {
            int i = this.d;
            if (i >= 0) {
                ip4.o(i);
                this.d = -1;
            }
            sd5 sd5Var = sd5.a;
        }
    }

    public int d() {
        return this.b;
    }

    public gp4 e() {
        return this.a;
    }

    public abstract j81<Object, sd5> f();

    public abstract boolean g();

    public abstract j81<Object, sd5> h();

    public final cp4 i() {
        cq4 cq4Var = ip4.b;
        cp4 cp4Var = (cp4) cq4Var.h();
        cq4Var.j(this);
        return cp4Var;
    }

    public abstract void j();

    public abstract void k();

    public abstract void l();

    public abstract void m(ws4 ws4Var);

    public void n() {
        int i = this.d;
        if (i >= 0) {
            ip4.o(i);
            this.d = -1;
        }
    }

    public void p(int i) {
        this.b = i;
    }

    public void q(gp4 gp4Var) {
        this.a = gp4Var;
    }

    public abstract cp4 r(j81<Object, sd5> j81Var);
}
