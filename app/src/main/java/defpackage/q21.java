package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class q21 implements p21 {
    public final r21 a;
    public final pg2 b;
    public jy1 c;

    public static final class QnHx extends cx1 implements j81<r21, Boolean> {
        public final /* synthetic */ r21 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(r21 r21Var) {
            super(1);
            this.w = r21Var;
        }

        @Override // defpackage.j81
        public final Boolean invoke(r21 r21Var) {
            r21 r21Var2 = r21Var;
            if (ur1.a(r21Var2, this.w)) {
                return Boolean.FALSE;
            }
            if (r21Var2.x == null) {
                throw new IllegalStateException("Move focus landed at the root.".toString());
            }
            OW8.t(r21Var2);
            return Boolean.TRUE;
        }
    }

    public q21() {
        r21 r21Var = new r21(0);
        this.a = r21Var;
        this.b = hj0.b(r21Var, s21.b);
    }

    /* JADX WARN: Code duplicated, block: B:147:0x0167  */
    /* JADX WARN: Code duplicated, block: B:167:0x019c  */
    @Override // defpackage.p21
    public final boolean a(int i) {
        b31 b31Var;
        boolean zBooleanValue;
        boolean zA;
        r21 r21Var = this.a;
        r21 r21VarE = iE.e(r21Var);
        if (r21VarE == null) {
            return false;
        }
        jy1 jy1Var = this.c;
        if (jy1Var == null) {
            ur1.e("layoutDirection");
            throw null;
        }
        boolean z = i == 1;
        int i2 = 4;
        y21 y21Var = r21VarE.F;
        if (z) {
            b31Var = y21Var.b;
        } else {
            if (i == 2) {
                b31Var = y21Var.c;
            } else {
                if (i == 5) {
                    b31Var = y21Var.d;
                } else {
                    if (i == 6) {
                        b31Var = y21Var.e;
                    } else {
                        if (i == 3) {
                            int iOrdinal = jy1Var.ordinal();
                            if (iOrdinal == 0) {
                                b31Var = y21Var.h;
                            } else {
                                if (iOrdinal != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                b31Var = y21Var.i;
                            }
                            if (ur1.a(b31Var, b31.b)) {
                                b31Var = null;
                            }
                            if (b31Var == null) {
                                b31Var = y21Var.f;
                            }
                        } else {
                            if (i == 4) {
                                int iOrdinal2 = jy1Var.ordinal();
                                if (iOrdinal2 == 0) {
                                    b31Var = y21Var.i;
                                } else {
                                    if (iOrdinal2 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    b31Var = y21Var.h;
                                }
                                if (ur1.a(b31Var, b31.b)) {
                                    b31Var = null;
                                }
                                if (b31Var == null) {
                                    b31Var = y21Var.g;
                                }
                            } else {
                                if (i == 7) {
                                    b31Var = b31.b;
                                } else {
                                    if (!(i == 8)) {
                                        throw new IllegalStateException("invalid FocusDirection".toString());
                                    }
                                    b31Var = b31.b;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!ur1.a(b31Var, b31.b)) {
            b31Var.a();
            return true;
        }
        jy1 jy1Var2 = this.c;
        if (jy1Var2 == null) {
            ur1.e("layoutDirection");
            throw null;
        }
        QnHx qnHx = new QnHx(r21VarE);
        if ((i == 1) || i == 2) {
            if (i == 1) {
                zBooleanValue = av2.b(r21Var, qnHx);
            } else {
                if (!(i == 2)) {
                    throw new IllegalStateException("This function should only be used for 1-D focus search".toString());
                }
                zBooleanValue = av2.a(r21Var, qnHx);
            }
        } else {
            if ((((i == 3) || i == 4) || i == 5) || i == 6) {
                zBooleanValue = ob5.h(r21Var, i, qnHx);
            } else {
                if (i == 7) {
                    int iOrdinal3 = jy1Var2.ordinal();
                    if (iOrdinal3 != 0) {
                        if (iOrdinal3 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i2 = 3;
                    }
                    r21 r21VarE2 = iE.e(r21Var);
                    if (r21VarE2 != null) {
                        zBooleanValue = ob5.h(r21VarE2, i2, qnHx);
                    } else {
                        zBooleanValue = false;
                    }
                } else {
                    if (!(i == 8)) {
                        throw new IllegalStateException("Invalid FocusDirection".toString());
                    }
                    r21 r21VarE3 = iE.e(r21Var);
                    r21 r21VarF = r21VarE3 != null ? iE.f(r21VarE3) : null;
                    if (ur1.a(r21VarF, r21Var) || r21VarF == null) {
                        zBooleanValue = false;
                    } else {
                        zBooleanValue = ((Boolean) qnHx.invoke(r21VarF)).booleanValue();
                    }
                }
            }
        }
        if (!zBooleanValue) {
            if (!r21Var.z.a() || r21Var.z.c()) {
                zA = false;
            } else {
                if ((i == 1) || i == 2) {
                    b(false);
                    if (r21Var.z.c()) {
                        zA = a(i);
                    }
                }
                zA = false;
            }
            if (!zA) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.p21
    public final void b(boolean z) {
        g31 g31Var;
        r21 r21Var = this.a;
        g31 g31Var2 = r21Var.z;
        if (OW8.l(r21Var, z)) {
            int iOrdinal = g31Var2.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                g31Var = g31.Active;
            } else if (iOrdinal == 3 || iOrdinal == 4) {
                g31Var = g31.Deactivated;
            } else {
                if (iOrdinal != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                g31Var = g31.Inactive;
            }
            r21Var.b(g31Var);
        }
    }
}
