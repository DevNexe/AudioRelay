package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class i02 implements tg2<x9>, x9 {
    public final q12 w;
    public final h02 x;
    public final boolean y;
    public final jy1 z;

    public static final class QnHx implements x9.QnHx {
        public final /* synthetic */ jl3<h02.QnHx> b;
        public final /* synthetic */ int c;

        public QnHx(jl3<h02.QnHx> jl3Var, int i) {
            this.b = jl3Var;
            this.c = i;
        }

        @Override // x9.QnHx
        public final boolean a() {
            return i02.this.b(this.b.w, this.c);
        }
    }

    public i02(q12 q12Var, h02 h02Var, boolean z, jy1 jy1Var) {
        this.w = q12Var;
        this.x = h02Var;
        this.y = z;
        this.z = jy1Var;
    }

    public static final boolean d(h02.QnHx qnHx, i02 i02Var) {
        return qnHx.b < i02Var.w.g().d() - 1;
    }

    @Override // defpackage.pg2
    public final /* synthetic */ boolean B(f30.F1 f1) {
        return dj.a(this, f1);
    }

    /* JADX WARN: Code duplicated, block: B:60:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a2  */
    @Override // defpackage.x9
    public final <T> T a(int i, j81<? super x9.QnHx, ? extends T> j81Var) {
        kz2 kz2Var;
        ui2<h02.QnHx> ui2Var;
        jl3 jl3Var = new jl3();
        q12 q12Var = this.w;
        int iE = q12Var.e();
        int index = ((k02) wu.N0(q12Var.g().e())).getIndex();
        h02 h02Var = this.x;
        h02Var.getClass();
        T t = (T) new h02.QnHx(iE, index);
        h02Var.a.b(t);
        jl3Var.w = t;
        T tInvoke = null;
        while (true) {
            kz2Var = q12Var.k;
            ui2Var = h02Var.a;
            if (tInvoke != null || !b((h02.QnHx) jl3Var.w, i)) {
                break;
            }
            h02.QnHx qnHx = (h02.QnHx) jl3Var.w;
            int i2 = qnHx.a;
            boolean z = i == 1;
            int i3 = qnHx.b;
            if (z) {
                i2--;
            } else {
                if (i == 2) {
                    i3++;
                } else {
                    boolean z2 = i == 5;
                    boolean z3 = this.y;
                    if (!z2) {
                        if (!(i == 6)) {
                            boolean z4 = i == 3;
                            jy1 jy1Var = this.z;
                            if (z4) {
                                int iOrdinal = jy1Var.ordinal();
                                if (iOrdinal != 0) {
                                    if (iOrdinal == 1) {
                                        if (z3) {
                                            i2--;
                                        } else {
                                            i3++;
                                        }
                                    }
                                } else if (z3) {
                                    i3++;
                                } else {
                                    i2--;
                                }
                            } else {
                                if (!(i == 4)) {
                                    throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction".toString());
                                }
                                int iOrdinal2 = jy1Var.ordinal();
                                if (iOrdinal2 != 0) {
                                    if (iOrdinal2 == 1) {
                                        if (z3) {
                                            i3++;
                                        } else {
                                            i2--;
                                        }
                                    }
                                } else if (z3) {
                                    i2--;
                                } else {
                                    i3++;
                                }
                            }
                        } else if (z3) {
                            i2--;
                        } else {
                            i3++;
                        }
                    } else if (z3) {
                        i3++;
                    } else {
                        i2--;
                    }
                }
            }
            T t2 = (T) new h02.QnHx(i2, i3);
            ui2Var.b(t2);
            ui2Var.l((h02.QnHx) jl3Var.w);
            jl3Var.w = t2;
            vl3 vl3Var = (vl3) kz2Var.getValue();
            if (vl3Var != null) {
                vl3Var.d();
            }
            tInvoke = j81Var.invoke(new QnHx(jl3Var, i));
        }
        ui2Var.l((h02.QnHx) jl3Var.w);
        vl3 vl3Var2 = (vl3) kz2Var.getValue();
        if (vl3Var2 != null) {
            vl3Var2.d();
        }
        return tInvoke;
    }

    public final boolean b(h02.QnHx qnHx, int i) {
        if (!(i == 1)) {
            if (i == 2) {
                return d(qnHx, this);
            }
            boolean z = i == 5;
            boolean z2 = this.y;
            if (!z) {
                if (!(i == 6)) {
                    boolean z3 = i == 3;
                    jy1 jy1Var = this.z;
                    if (z3) {
                        int iOrdinal = jy1Var.ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (!z2) {
                                return d(qnHx, this);
                            }
                            if (qnHx.a <= 0) {
                                return false;
                            }
                        } else {
                            if (z2) {
                                return d(qnHx, this);
                            }
                            if (qnHx.a <= 0) {
                                return false;
                            }
                        }
                    } else {
                        if (!(i == 4)) {
                            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction".toString());
                        }
                        int iOrdinal2 = jy1Var.ordinal();
                        if (iOrdinal2 != 0) {
                            if (iOrdinal2 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (z2) {
                                return d(qnHx, this);
                            }
                            if (qnHx.a <= 0) {
                                return false;
                            }
                        } else {
                            if (!z2) {
                                return d(qnHx, this);
                            }
                            if (qnHx.a <= 0) {
                                return false;
                            }
                        }
                    }
                } else {
                    if (!z2) {
                        return d(qnHx, this);
                    }
                    if (qnHx.a <= 0) {
                        return false;
                    }
                }
            } else {
                if (z2) {
                    return d(qnHx, this);
                }
                if (qnHx.a <= 0) {
                    return false;
                }
            }
        } else if (qnHx.a <= 0) {
            return false;
        }
        return true;
    }

    @Override // defpackage.tg2
    public final mg3<x9> getKey() {
        return y9.a;
    }

    @Override // defpackage.tg2
    public final x9 getValue() {
        return this;
    }

    @Override // defpackage.pg2
    public final Object m0(Object obj, x81 x81Var) {
        return x81Var.invoke(obj, this);
    }

    @Override // defpackage.pg2
    public final /* synthetic */ pg2 y(pg2 pg2Var) {
        return hj0.b(this, pg2Var);
    }

    @Override // defpackage.pg2
    public final Object z(Object obj, x81 x81Var) {
        return x81Var.invoke(this, obj);
    }
}
