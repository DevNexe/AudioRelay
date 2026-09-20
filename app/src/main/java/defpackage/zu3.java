package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zu3 {
    public final cm5 a;
    public final ArrayList<cm5> b = new ArrayList<>();

    public zu3(cm5 cm5Var) {
        this.a = null;
        this.a = cm5Var;
    }

    public static long a(qj0 qj0Var, long j) {
        cm5 cm5Var = qj0Var.d;
        if (cm5Var instanceof xc1) {
            return j;
        }
        ArrayList arrayList = qj0Var.k;
        int size = arrayList.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            lj0 lj0Var = (lj0) arrayList.get(i);
            if (lj0Var instanceof qj0) {
                qj0 qj0Var2 = (qj0) lj0Var;
                if (qj0Var2.d != cm5Var) {
                    jMin = Math.min(jMin, a(qj0Var2, ((long) qj0Var2.f) + j));
                }
            }
        }
        if (qj0Var != cm5Var.i) {
            return jMin;
        }
        long j2 = cm5Var.j();
        qj0 qj0Var3 = cm5Var.h;
        long j3 = j - j2;
        return Math.min(Math.min(jMin, a(qj0Var3, j3)), j3 - ((long) qj0Var3.f));
    }

    public static long b(qj0 qj0Var, long j) {
        cm5 cm5Var = qj0Var.d;
        if (cm5Var instanceof xc1) {
            return j;
        }
        ArrayList arrayList = qj0Var.k;
        int size = arrayList.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            lj0 lj0Var = (lj0) arrayList.get(i);
            if (lj0Var instanceof qj0) {
                qj0 qj0Var2 = (qj0) lj0Var;
                if (qj0Var2.d != cm5Var) {
                    jMax = Math.max(jMax, b(qj0Var2, ((long) qj0Var2.f) + j));
                }
            }
        }
        if (qj0Var != cm5Var.h) {
            return jMax;
        }
        long j2 = cm5Var.j();
        qj0 qj0Var3 = cm5Var.i;
        long j3 = j + j2;
        return Math.max(Math.max(jMax, b(qj0Var3, j3)), j3 - ((long) qj0Var3.f));
    }
}
