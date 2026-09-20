package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class pb2 {
    public final yy1 a;
    public boolean c;
    public g70 h;
    public final tj0 b = new tj0();
    public final su2 d = new su2();
    public final ui2<ww2.QnHx> e = new ui2<>(new ww2.QnHx[16]);
    public final long f = 1;
    public final ArrayList g = new ArrayList();

    public pb2(yy1 yy1Var) {
        this.a = yy1Var;
    }

    public final void a(boolean z) {
        su2 su2Var = this.d;
        if (z) {
            ui2<yy1> ui2Var = su2Var.a;
            ui2Var.e();
            yy1 yy1Var = this.a;
            ui2Var.b(yy1Var);
            yy1Var.k0 = true;
        }
        ru2 ru2Var = ru2.w;
        ui2<yy1> ui2Var2 = su2Var.a;
        Arrays.sort(ui2Var2.w, 0, ui2Var2.y, ru2Var);
        int i = ui2Var2.y;
        if (i > 0) {
            int i2 = i - 1;
            yy1[] yy1VarArr = ui2Var2.w;
            do {
                yy1 yy1Var2 = yy1VarArr[i2];
                if (yy1Var2.k0) {
                    su2.a(yy1Var2);
                }
                i2--;
            } while (i2 >= 0);
        }
        ui2Var2.e();
    }

    public final boolean b(yy1 yy1Var, g70 g70Var) {
        boolean zA0;
        if (g70Var != null) {
            if (yy1Var.V == 3) {
                yy1Var.l();
            }
            zA0 = yy1Var.Z.A0(g70Var.a);
        } else {
            cw2 cw2Var = yy1Var.Z;
            g70 g70Var2 = cw2Var.C ? new g70(cw2Var.z) : null;
            if (g70Var2 != null) {
                if (yy1Var.V == 3) {
                    yy1Var.l();
                }
                zA0 = yy1Var.Z.A0(g70Var2.a);
            } else {
                zA0 = false;
            }
        }
        yy1 yy1VarS = yy1Var.s();
        if (zA0 && yy1VarS != null) {
            int i = yy1Var.U;
            if (i == 1) {
                h(yy1VarS, false);
            } else if (i == 2) {
                g(yy1VarS, false);
            }
        }
        return zA0;
    }

    public final void c(yy1 yy1Var) {
        tj0 tj0Var = this.b;
        if (tj0Var.a.isEmpty()) {
            return;
        }
        if (!this.c) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(!yy1Var.m0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        ui2<yy1> ui2VarV = yy1Var.v();
        int i = ui2VarV.y;
        if (i > 0) {
            yy1[] yy1VarArr = ui2VarV.w;
            int i2 = 0;
            do {
                yy1 yy1Var2 = yy1VarArr[i2];
                if (yy1Var2.m0 && tj0Var.b(yy1Var2)) {
                    f(yy1Var2);
                }
                if (!yy1Var2.m0) {
                    c(yy1Var2);
                }
                i2++;
            } while (i2 < i);
        }
        if (yy1Var.m0 && tj0Var.b(yy1Var)) {
            f(yy1Var);
        }
    }

    public final boolean d(AndroidComposeView.auxFixed auxVar) {
        boolean z;
        tj0 tj0Var = this.b;
        yy1 yy1Var = this.a;
        if (!yy1Var.E()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!yy1Var.Q) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(!this.c)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i = 0;
        if (this.h != null) {
            this.c = true;
            try {
                boolean zIsEmpty = tj0Var.a.isEmpty();
                bb5<yy1> bb5Var = tj0Var.a;
                if (!zIsEmpty) {
                    z = false;
                    while (!bb5Var.isEmpty()) {
                        yy1 yy1VarFirst = bb5Var.first();
                        tj0Var.b(yy1VarFirst);
                        boolean zF = f(yy1VarFirst);
                        if (yy1VarFirst == yy1Var && zF) {
                            z = true;
                        }
                    }
                    if (auxVar != null) {
                        auxVar.invoke();
                    }
                } else {
                    z = false;
                }
                this.c = false;
            } catch (Throwable th) {
                this.c = false;
                throw th;
            }
        } else {
            z = false;
        }
        ui2<ww2.QnHx> ui2Var = this.e;
        int i2 = ui2Var.y;
        if (i2 > 0) {
            ww2.QnHx[] qnHxArr = ui2Var.w;
            do {
                qnHxArr[i].a();
                i++;
            } while (i < i2);
        }
        ui2Var.e();
        return z;
    }

    public final void e(yy1 yy1Var, long j) {
        yy1 yy1Var2 = this.a;
        if (!(!ur1.a(yy1Var, yy1Var2))) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!yy1Var2.E()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!yy1Var2.Q) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(!this.c)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i = 0;
        if (this.h != null) {
            this.c = true;
            try {
                this.b.b(yy1Var);
                b(yy1Var, new g70(j));
                if (yy1Var.n0 && yy1Var.Q) {
                    yy1Var.N();
                    this.d.a.b(yy1Var);
                    yy1Var.k0 = true;
                }
                this.c = false;
            } catch (Throwable th) {
                this.c = false;
                throw th;
            }
        }
        ui2<ww2.QnHx> ui2Var = this.e;
        int i2 = ui2Var.y;
        if (i2 > 0) {
            ww2.QnHx[] qnHxArr = ui2Var.w;
            do {
                qnHxArr[i].a();
                i++;
            } while (i < i2);
        }
        ui2Var.e();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001e  */
    public final boolean f(yy1 yy1Var) {
        boolean z;
        if (!yy1Var.Q) {
            boolean z2 = yy1Var.m0;
            dz1 dz1Var = yy1Var.P;
            if (z2) {
                if (yy1Var.U != 1) {
                    dz1Var.c();
                    if (!(dz1Var.h != null)) {
                        z = false;
                    }
                }
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                dz1Var.c();
                if (!(dz1Var.h != null)) {
                    return false;
                }
            }
        }
        boolean z3 = yy1Var.m0;
        yy1 yy1Var2 = this.a;
        boolean zB = z3 ? b(yy1Var, yy1Var == yy1Var2 ? this.h : null) : false;
        if (yy1Var.n0 && yy1Var.Q) {
            if (yy1Var == yy1Var2) {
                if (yy1Var.V == 3) {
                    yy1Var.m();
                }
                b43.QnHx.C0045QnHx c0045QnHx = b43.QnHx.a;
                cw2 cw2Var = yy1Var.Z;
                int iK0 = cw2Var.k0();
                jy1 jy1Var = yy1Var.N;
                c0045QnHx.getClass();
                int i = b43.QnHx.c;
                jy1 jy1Var2 = b43.QnHx.b;
                b43.QnHx.c = iK0;
                b43.QnHx.b = jy1Var;
                b43.QnHx.f(c0045QnHx, cw2Var, 0, 0);
                b43.QnHx.c = i;
                b43.QnHx.b = jy1Var2;
            } else {
                yy1Var.N();
            }
            this.d.a.b(yy1Var);
            yy1Var.k0 = true;
        }
        ArrayList arrayList = this.g;
        if (true ^ arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                yy1 yy1Var3 = (yy1) arrayList.get(i2);
                if (yy1Var3.E()) {
                    h(yy1Var3, false);
                }
            }
            arrayList.clear();
        }
        return zB;
    }

    public final boolean g(yy1 yy1Var, boolean z) {
        int iH = O.h(yy1Var.E);
        if (iH == 0 || iH == 1) {
            return false;
        }
        if (iH != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if ((yy1Var.m0 || yy1Var.n0) && !z) {
            return false;
        }
        yy1Var.n0 = true;
        if (yy1Var.Q) {
            yy1 yy1VarS = yy1Var.s();
            if (!(yy1VarS != null && yy1VarS.n0)) {
                if (!(yy1VarS != null && yy1VarS.m0)) {
                    this.b.a(yy1Var);
                }
            }
        }
        return !this.c;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0031  */
    /* JADX WARN: Code duplicated, block: B:25:0x0034  */
    /* JADX WARN: Code duplicated, block: B:30:0x0040  */
    /* JADX WARN: Code duplicated, block: B:32:0x0043  */
    public final boolean h(yy1 yy1Var, boolean z) {
        yy1 yy1VarS;
        boolean z2;
        boolean z3;
        int iH = O.h(yy1Var.E);
        if (iH == 0) {
            return false;
        }
        if (iH == 1) {
            this.g.add(yy1Var);
            return false;
        }
        if (iH != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (yy1Var.m0 && !z) {
            return false;
        }
        yy1Var.m0 = true;
        if (yy1Var.Q) {
            yy1VarS = yy1Var.s();
            if (yy1VarS == null && yy1VarS.m0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                this.b.a(yy1Var);
            }
        } else {
            if (yy1Var.U != 1) {
                dz1 dz1Var = yy1Var.P;
                dz1Var.c();
                if (dz1Var.h != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            } else {
                z3 = true;
            }
            if (z3) {
                yy1VarS = yy1Var.s();
                if (yy1VarS == null) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    this.b.a(yy1Var);
                }
            }
        }
        return !this.c;
    }

    public final void i(long j) {
        g70 g70Var = this.h;
        if (g70Var == null ? false : g70.b(g70Var.a, j)) {
            return;
        }
        if (!(!this.c)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        this.h = new g70(j);
        yy1 yy1Var = this.a;
        yy1Var.m0 = true;
        this.b.a(yy1Var);
    }
}
