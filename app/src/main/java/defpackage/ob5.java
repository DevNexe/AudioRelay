package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class ob5 {

    public static final class QnHx extends cx1 implements j81<x9.QnHx, Boolean> {
        public final /* synthetic */ r21 w;
        public final /* synthetic */ r21 x;
        public final /* synthetic */ int y;
        public final /* synthetic */ j81<r21, Boolean> z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(r21 r21Var, r21 r21Var2, int i, j81<? super r21, Boolean> j81Var) {
            super(1);
            this.w = r21Var;
            this.x = r21Var2;
            this.y = i;
            this.z = j81Var;
        }

        @Override // defpackage.j81
        public final Boolean invoke(x9.QnHx qnHx) {
            x9.QnHx qnHx2 = qnHx;
            Boolean boolValueOf = Boolean.valueOf(ob5.g(this.w, this.x, this.y, this.z));
            if (boolValueOf.booleanValue() || !qnHx2.a()) {
                return boolValueOf;
            }
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x005d  */
    public static final boolean a(dl3 dl3Var, dl3 dl3Var2, dl3 dl3Var3, int i) {
        boolean z;
        float f;
        float f2;
        if (!b(i, dl3Var3, dl3Var) && b(i, dl3Var2, dl3Var)) {
            boolean z2 = i == 3;
            float f3 = dl3Var3.b;
            float f4 = dl3Var3.d;
            float f5 = dl3Var3.a;
            float f6 = dl3Var3.c;
            float f7 = dl3Var.d;
            float f8 = dl3Var.b;
            float f9 = dl3Var.c;
            float f10 = dl3Var.a;
            if (!z2) {
                if (!(i == 4)) {
                    if (!(i == 5)) {
                        if (!(i == 6)) {
                            throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                        }
                        if (f7 <= f3) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else if (f8 >= f4) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else if (f9 <= f5) {
                    z = true;
                } else {
                    z = false;
                }
            } else if (f10 >= f6) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (!(i == 3)) {
                    if (!(i == 4)) {
                        if (i == 3) {
                            f2 = dl3Var2.c;
                            f = f10;
                        } else {
                            if (i == 4) {
                                f = dl3Var2.a;
                                f2 = f9;
                            } else {
                                if (i == 5) {
                                    f2 = dl3Var2.d;
                                    f = f8;
                                } else {
                                    if (!(i == 6)) {
                                        throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                                    }
                                    f = dl3Var2.b;
                                    f2 = f7;
                                }
                            }
                        }
                        float fMax = Math.max(0.0f, f - f2);
                        if (i == 3) {
                            f4 = f10;
                            f3 = f5;
                        } else {
                            if (i == 4) {
                                f4 = f6;
                                f3 = f9;
                            } else {
                                if (i == 5) {
                                    f4 = f8;
                                } else {
                                    if (!(i == 6)) {
                                        throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                                    }
                                    f3 = f7;
                                }
                            }
                        }
                        if (fMax < Math.max(1.0f, f4 - f3)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean b(int i, dl3 dl3Var, dl3 dl3Var2) {
        if (!((i == 3) || i == 4)) {
            if (!((i == 5) || i == 6)) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            if (dl3Var.c > dl3Var2.a && dl3Var.a < dl3Var2.c) {
                return true;
            }
        } else if (dl3Var.d > dl3Var2.b && dl3Var.b < dl3Var2.d) {
            return true;
        }
        return false;
    }

    public static final r21 c(ui2<r21> ui2Var, dl3 dl3Var, int i) {
        dl3 dl3VarD;
        boolean z = i == 3;
        float f = dl3Var.a;
        float f2 = dl3Var.c;
        if (z) {
            dl3VarD = dl3Var.d((f2 - f) + 1, 0.0f);
        } else {
            if (i == 4) {
                dl3VarD = dl3Var.d(-((f2 - f) + 1), 0.0f);
            } else {
                boolean z2 = i == 5;
                float f3 = dl3Var.b;
                float f4 = dl3Var.d;
                if (z2) {
                    dl3VarD = dl3Var.d(0.0f, (f4 - f3) + 1);
                } else {
                    if (!(i == 6)) {
                        throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                    }
                    dl3VarD = dl3Var.d(0.0f, -((f4 - f3) + 1));
                }
            }
        }
        int i2 = ui2Var.y;
        r21 r21Var = null;
        if (i2 > 0) {
            r21[] r21VarArr = ui2Var.w;
            int i3 = 0;
            do {
                r21 r21Var2 = r21VarArr[i3];
                if (iE.i(r21Var2)) {
                    dl3 dl3VarG = iE.g(r21Var2);
                    if (e(i, dl3VarG, dl3Var) && (!e(i, dl3VarD, dl3Var) || a(dl3Var, dl3VarG, dl3VarD, i) || (!a(dl3Var, dl3VarD, dl3VarG, i) && f(i, dl3Var, dl3VarG) < f(i, dl3Var, dl3VarD)))) {
                        r21Var = r21Var2;
                        dl3VarD = dl3VarG;
                    }
                }
                i3++;
            } while (i3 < i2);
        }
        return r21Var;
    }

    public static final boolean d(r21 r21Var, r21 r21Var2, int i, j81<? super r21, Boolean> j81Var) {
        if (g(r21Var, r21Var2, i, j81Var)) {
            return true;
        }
        Boolean bool = (Boolean) fp1.u0(r21Var, i, new QnHx(r21Var, r21Var2, i, j81Var));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean e(int i, dl3 dl3Var, dl3 dl3Var2) {
        boolean z = i == 3;
        float f = dl3Var.a;
        float f2 = dl3Var.c;
        float f3 = dl3Var2.a;
        float f4 = dl3Var2.c;
        if (!z) {
            if (!(i == 4)) {
                boolean z2 = i == 5;
                float f5 = dl3Var.b;
                float f6 = dl3Var.d;
                float f7 = dl3Var2.b;
                float f8 = dl3Var2.d;
                if (!z2) {
                    if (!(i == 6)) {
                        throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                    }
                    if ((f7 >= f5 && f8 > f5) || f8 >= f6) {
                        return false;
                    }
                } else if ((f8 <= f6 && f7 < f6) || f7 <= f5) {
                    return false;
                }
            } else if ((f3 >= f && f4 > f) || f4 >= f2) {
                return false;
            }
        } else if ((f4 <= f2 && f3 < f2) || f3 <= f) {
            return false;
        }
        return true;
    }

    public static final long f(int i, dl3 dl3Var, dl3 dl3Var2) {
        float f;
        float f2;
        float f3;
        float f4;
        boolean z = i == 3;
        float f5 = dl3Var.d;
        float f6 = dl3Var.b;
        float f7 = dl3Var.c;
        float f8 = dl3Var.a;
        float f9 = dl3Var2.b;
        float f10 = dl3Var2.d;
        float f11 = dl3Var2.a;
        float f12 = dl3Var2.c;
        if (z) {
            f2 = f8;
            f = f12;
        } else {
            if (i == 4) {
                f = f7;
                f2 = f11;
            } else {
                if (i == 5) {
                    f2 = f6;
                    f = f10;
                } else {
                    if (!(i == 6)) {
                        throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                    }
                    f = f5;
                    f2 = f9;
                }
            }
        }
        long jAbs = (long) Math.abs(Math.max(0.0f, f2 - f));
        if ((i == 3) || i == 4) {
            f3 = 2;
            f4 = ((f5 - f6) / f3) + f6;
        } else {
            if (!((i == 5) || i == 6)) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            f3 = 2;
            f4 = ((f7 - f8) / f3) + f8;
            f10 = f12;
            f9 = f11;
        }
        long jAbs2 = (long) Math.abs(f4 - (((f10 - f9) / f3) + f9));
        return (jAbs2 * jAbs2) + (((long) 13) * jAbs * jAbs);
    }

    public static final boolean g(r21 r21Var, r21 r21Var2, int i, j81<? super r21, Boolean> j81Var) {
        r21 r21VarC;
        ui2<r21> ui2Var = r21Var.y;
        ui2 ui2Var2 = new ui2(new r21[ui2Var.y]);
        ui2Var2.c(ui2Var2.y, ui2Var);
        while (ui2Var2.k() && (r21VarC = c(ui2Var2, iE.g(r21Var2), i)) != null) {
            if (!r21VarC.z.d()) {
                return j81Var.invoke(r21VarC).booleanValue();
            }
            if (d(r21VarC, r21Var2, i, j81Var)) {
                return true;
            }
            ui2Var2.l(r21VarC);
        }
        return false;
    }

    public static final boolean h(r21 r21Var, int i, q21.QnHx qnHx) {
        dl3 dl3Var;
        int iOrdinal = r21Var.z.ordinal();
        boolean z = true;
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        return false;
                    }
                    if (iOrdinal != 4) {
                        if (iOrdinal == 5) {
                            return ((Boolean) qnHx.invoke(r21Var)).booleanValue();
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            r21 r21Var2 = r21Var.A;
            if (r21Var2 == null) {
                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
            }
            int iOrdinal2 = r21Var2.z.ordinal();
            if (iOrdinal2 != 0) {
                if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            if (iOrdinal2 != 4) {
                                if (iOrdinal2 != 5) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                    }
                }
                if (!h(r21Var2, i, qnHx)) {
                    g31 g31Var = r21Var2.z;
                    if (!(g31Var == g31.ActiveParent || g31Var == g31.DeactivatedParent)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    r21 r21VarE = iE.e(r21Var2);
                    if (r21VarE == null) {
                        throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                    }
                    if (!d(r21Var, r21VarE, i, qnHx)) {
                        return false;
                    }
                }
                return true;
            }
            return d(r21Var, r21Var2, i, qnHx);
        }
        ui2 ui2VarA = iE.a(r21Var);
        if (ui2VarA.y <= 1) {
            r21 r21Var3 = (r21) (ui2VarA.j() ? null : ui2VarA.w[0]);
            if (r21Var3 != null) {
                return ((Boolean) qnHx.invoke(r21Var3)).booleanValue();
            }
            return false;
        }
        if ((i == 4) || i == 6) {
            dl3 dl3VarG = iE.g(r21Var);
            float f = dl3VarG.a;
            float f2 = dl3VarG.b;
            dl3Var = new dl3(f, f2, f, f2);
        } else {
            if (!(i == 3) && i != 5) {
                z = false;
            }
            if (!z) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            dl3 dl3VarG2 = iE.g(r21Var);
            float f3 = dl3VarG2.c;
            float f4 = dl3VarG2.d;
            dl3Var = new dl3(f3, f4, f3, f4);
        }
        r21 r21VarC = c(ui2VarA, dl3Var, i);
        if (r21VarC != null) {
            return ((Boolean) qnHx.invoke(r21VarC)).booleanValue();
        }
        return false;
    }
}
