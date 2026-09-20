package defpackage;

import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class av2 {

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
            Boolean boolValueOf = Boolean.valueOf(av2.e(this.w, this.x, this.y, this.z));
            if (boolValueOf.booleanValue() || !qnHx2.a()) {
                return boolValueOf;
            }
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:24:0x0046 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0048 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x007f  */
    public static final boolean a(r21 r21Var, j81<? super r21, Boolean> j81Var) {
        r21 r21Var2;
        int iOrdinal;
        int iOrdinal2 = r21Var.z.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                r21Var2 = r21Var.A;
                if (r21Var2 != null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                }
                iOrdinal = r21Var2.z.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            if (iOrdinal != 3) {
                                if (iOrdinal != 4) {
                                    if (iOrdinal != 5) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                } else if (a(r21Var2, j81Var) && !c(r21Var, r21Var2, 2, j81Var)) {
                                    return false;
                                }
                            }
                            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                        }
                    } else if (a(r21Var2, j81Var) && !j81Var.invoke(r21Var2).booleanValue()) {
                        return false;
                    }
                }
                return c(r21Var, r21Var2, 2, j81Var);
            }
            if (iOrdinal2 != 2 && iOrdinal2 != 3) {
                if (iOrdinal2 == 4) {
                    r21Var2 = r21Var.A;
                    if (r21Var2 != null) {
                        throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                    }
                    iOrdinal = r21Var2.z.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            if (iOrdinal != 2) {
                                if (iOrdinal != 3) {
                                    if (iOrdinal != 4) {
                                        if (iOrdinal != 5) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    } else if (a(r21Var2, j81Var)) {
                                    }
                                }
                                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                            }
                        } else if (a(r21Var2, j81Var)) {
                        }
                    }
                    return c(r21Var, r21Var2, 2, j81Var);
                }
                if (iOrdinal2 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!d(r21Var, j81Var) && !j81Var.invoke(r21Var).booleanValue()) {
                    return false;
                }
            }
            return true;
        }
        return d(r21Var, j81Var);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x006d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    public static final boolean b(r21 r21Var, j81<? super r21, Boolean> j81Var) {
        ui2<r21> ui2Var;
        int i;
        r21[] r21VarArr;
        int i2;
        r21 r21Var2;
        boolean z;
        int iOrdinal = r21Var.z.ordinal();
        if (iOrdinal == 0) {
            bv2 bv2Var = new bv2();
            ui2Var = r21Var.y;
            Arrays.sort(ui2Var.w, 0, ui2Var.y, bv2Var);
            i = ui2Var.y;
            if (i > 0) {
                return false;
            }
            r21VarArr = ui2Var.w;
            i2 = 0;
            do {
                r21Var2 = r21VarArr[i2];
                if (iE.i(r21Var2) || !b(r21Var2, j81Var)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    i2++;
                }
            } while (i2 < i);
            return false;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2 || iOrdinal == 3) {
                bv2 bv2Var2 = new bv2();
                ui2Var = r21Var.y;
                Arrays.sort(ui2Var.w, 0, ui2Var.y, bv2Var2);
                i = ui2Var.y;
                if (i > 0) {
                    return false;
                }
                r21VarArr = ui2Var.w;
                i2 = 0;
                do {
                    r21Var2 = r21VarArr[i2];
                    if (iE.i(r21Var2)) {
                        z = false;
                    } else {
                        z = false;
                    }
                    if (z) {
                        i2++;
                    }
                } while (i2 < i);
                return false;
            }
            if (iOrdinal != 4) {
                if (iOrdinal == 5) {
                    return j81Var.invoke(r21Var).booleanValue();
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        r21 r21Var3 = r21Var.A;
        if (r21Var3 == null) {
            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
        }
        if (!b(r21Var3, j81Var) && !c(r21Var, r21Var3, 1, j81Var)) {
            return false;
        }
        return true;
    }

    public static final boolean c(r21 r21Var, r21 r21Var2, int i, j81<? super r21, Boolean> j81Var) {
        if (e(r21Var, r21Var2, i, j81Var)) {
            return true;
        }
        Boolean bool = (Boolean) fp1.u0(r21Var, i, new QnHx(r21Var, r21Var2, i, j81Var));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean d(r21 r21Var, j81<? super r21, Boolean> j81Var) {
        ui2<r21> ui2Var = r21Var.y;
        Arrays.sort(ui2Var.w, 0, ui2Var.y, new bv2());
        ui2<r21> ui2Var2 = r21Var.y;
        int i = ui2Var2.y;
        if (i > 0) {
            int i2 = i - 1;
            r21[] r21VarArr = ui2Var2.w;
            do {
                r21 r21Var2 = r21VarArr[i2];
                if (iE.i(r21Var2) && a(r21Var2, j81Var)) {
                    return true;
                }
                i2--;
            } while (i2 >= 0);
        }
        return false;
    }

    public static final boolean e(r21 r21Var, r21 r21Var2, int i, j81<? super r21, Boolean> j81Var) {
        g31 g31Var = r21Var.z;
        g31 g31Var2 = g31.ActiveParent;
        g31 g31Var3 = g31.DeactivatedParent;
        if (!(g31Var == g31Var2 || g31Var == g31Var3)) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.".toString());
        }
        bv2 bv2Var = new bv2();
        ui2<r21> ui2Var = r21Var.y;
        Arrays.sort(ui2Var.w, 0, ui2Var.y, bv2Var);
        if (i == 1) {
            int i2 = new pp1(0, ui2Var.y - 1).x;
            if (i2 >= 0) {
                boolean z = false;
                int i3 = 0;
                while (true) {
                    if (z) {
                        r21 r21Var3 = ui2Var.w[i3];
                        if (iE.i(r21Var3) && b(r21Var3, j81Var)) {
                            return true;
                        }
                    }
                    if (ur1.a(ui2Var.w[i3], r21Var2)) {
                        z = true;
                    }
                    if (i3 == i2) {
                        break;
                    }
                    i3++;
                }
            }
        } else {
            if (!(i == 2)) {
                throw new IllegalStateException("This function should only be used for 1-D focus search".toString());
            }
            int i4 = new pp1(0, ui2Var.y - 1).x;
            if (i4 >= 0) {
                boolean z2 = false;
                while (true) {
                    if (z2) {
                        r21 r21Var4 = ui2Var.w[i4];
                        if (iE.i(r21Var4) && a(r21Var4, j81Var)) {
                            return true;
                        }
                    }
                    if (ur1.a(ui2Var.w[i4], r21Var2)) {
                        z2 = true;
                    }
                    if (i4 == 0) {
                        break;
                    }
                    i4--;
                }
            }
        }
        if (!(i == 1) && r21Var.z != g31Var3) {
            if (!(r21Var.x == null)) {
                return j81Var.invoke(r21Var).booleanValue();
            }
        }
        return false;
    }
}
