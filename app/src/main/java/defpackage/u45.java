package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class u45 {
    public c25 a;
    public final rk3 b;
    public final cq4 c = new cq4(2);
    public i55 d;
    public final kz2 e;
    public iy1 f;
    public final kz2 g;
    public final kz2 h;
    public boolean i;
    public final kz2 j;
    public final kz2 k;
    public final kz2 l;
    public final hw1 m;
    public j81<? super x45, sd5> n;
    public final CQf o;
    public final QnHx p;
    public final jtf q;

    public static final class CQf extends cx1 implements j81<x45, sd5> {
        public CQf() {
            super(1);
        }

        @Override // defpackage.j81
        public final sd5 invoke(x45 x45Var) {
            x45 x45Var2 = x45Var;
            String str = x45Var2.a.w;
            u45 u45Var = u45.this;
            if (!ur1.a(str, u45Var.a.a.w)) {
                u45Var.h.setValue(hb1.None);
            }
            u45Var.n.invoke(x45Var2);
            u45Var.b.invalidate();
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements j81<x45, sd5> {
        public static final F1 w = new F1();

        public F1() {
            super(1);
        }

        @Override // defpackage.j81
        public final /* bridge */ /* synthetic */ sd5 invoke(x45 x45Var) {
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements j81<hj1, sd5> {
        public QnHx() {
            super(1);
        }

        @Override // defpackage.j81
        public final sd5 invoke(hj1 hj1Var) {
            j81<iw1, sd5> j81Var;
            sd5 sd5Var;
            int i = hj1Var.a;
            hw1 hw1Var = u45.this.m;
            hw1Var.getClass();
            if (i == 7) {
                j81Var = hw1Var.a().a;
            } else {
                if (i == 2) {
                    j81Var = hw1Var.a().b;
                } else {
                    if (i == 6) {
                        j81Var = hw1Var.a().c;
                    } else {
                        if (i == 5) {
                            j81Var = hw1Var.a().d;
                        } else {
                            if (i == 3) {
                                j81Var = hw1Var.a().e;
                            } else {
                                if (i == 4) {
                                    j81Var = hw1Var.a().f;
                                } else {
                                    if (!((i == 1) || i == 0)) {
                                        throw new IllegalStateException("invalid ImeAction".toString());
                                    }
                                    j81Var = null;
                                }
                            }
                        }
                    }
                }
            }
            if (j81Var != null) {
                j81Var.invoke(hw1Var);
                sd5Var = sd5.a;
            } else {
                sd5Var = null;
            }
            if (sd5Var == null) {
                if (i == 6) {
                    p21 p21Var = hw1Var.b;
                    if (p21Var == null) {
                        ur1.e("focusManager");
                        throw null;
                    }
                    p21Var.a(1);
                } else {
                    if (i == 5) {
                        p21 p21Var2 = hw1Var.b;
                        if (p21Var2 == null) {
                            ur1.e("focusManager");
                            throw null;
                        }
                        p21Var2.a(2);
                    }
                }
            }
            return sd5.a;
        }
    }

    public u45(c25 c25Var, rk3 rk3Var) {
        this.a = c25Var;
        this.b = rk3Var;
        Boolean bool = Boolean.FALSE;
        this.e = ps0.R(bool);
        this.g = ps0.R(null);
        this.h = ps0.R(hb1.None);
        this.j = ps0.R(bool);
        this.k = ps0.R(bool);
        this.l = ps0.R(bool);
        this.m = new hw1();
        this.n = F1.w;
        this.o = new CQf();
        this.p = new QnHx();
        this.q = new jtf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final hb1 a() {
        return (hb1) this.h.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b() {
        return ((Boolean) this.e.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final p55 c() {
        return (p55) this.g.getValue();
    }
}
