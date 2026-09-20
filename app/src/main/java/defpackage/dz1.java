package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class dz1 {
    public final yy1 a;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public yy1 h;
    public boolean b = true;
    public final HashMap i = new HashMap();

    public dz1(yy1 yy1Var) {
        this.a = yy1Var;
    }

    public static final void b(dz1 dz1Var, IlK ilK, int i, kz1 kz1Var) {
        float f = i;
        long jA = X.a(f, f);
        while (true) {
            jA = kz1Var.c1(jA);
            kz1Var = kz1Var.B;
            if (ur1.a(kz1Var, dz1Var.a.Y)) {
                break;
            } else if (kz1Var.J0().c().containsKey(ilK)) {
                float fJ = kz1Var.J(ilK);
                jA = X.a(fJ, fJ);
            }
        }
        int iC = ilK instanceof ed1 ? sy4.c(kt2.d(jA)) : sy4.c(kt2.c(jA));
        HashMap map = dz1Var.i;
        if (map.containsKey(ilK)) {
            int iIntValue = ((Number) t92.P(ilK, map)).intValue();
            ed1 ed1Var = hnK.a;
            iC = ilK.a.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iC)).intValue();
        }
        map.put(ilK, Integer.valueOf(iC));
    }

    public final boolean a() {
        return this.c || this.e || this.f || this.g;
    }

    public final void c() {
        dz1 dz1Var;
        dz1 dz1Var2;
        boolean zA = a();
        yy1 yy1Var = this.a;
        if (!zA) {
            yy1 yy1VarS = yy1Var.s();
            if (yy1VarS == null) {
                return;
            }
            yy1Var = yy1VarS.P.h;
            if (yy1Var == null || !yy1Var.P.a()) {
                yy1 yy1Var2 = this.h;
                if (yy1Var2 == null || yy1Var2.P.a()) {
                    return;
                }
                yy1 yy1VarS2 = yy1Var2.s();
                if (yy1VarS2 != null && (dz1Var2 = yy1VarS2.P) != null) {
                    dz1Var2.c();
                }
                yy1 yy1VarS3 = yy1Var2.s();
                yy1Var = (yy1VarS3 == null || (dz1Var = yy1VarS3.P) == null) ? null : dz1Var.h;
            }
        }
        this.h = yy1Var;
    }
}
