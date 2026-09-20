package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class xo2 {
    public final ui2<uo2> a = new ui2<>(new uo2[16]);

    public boolean a(Map<c93, d93> map, iy1 iy1Var, zp1 zp1Var, boolean z) {
        ui2<uo2> ui2Var = this.a;
        int i = ui2Var.y;
        if (i <= 0) {
            return false;
        }
        uo2[] uo2VarArr = ui2Var.w;
        int i2 = 0;
        boolean z2 = false;
        do {
            z2 = uo2VarArr[i2].a(map, iy1Var, zp1Var, z) || z2;
            i2++;
        } while (i2 < i);
        return z2;
    }

    public void b(zp1 zp1Var) {
        ui2<uo2> ui2Var = this.a;
        int i = ui2Var.y;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (ui2Var.w[i].c.j()) {
                ui2Var.n(i);
            }
        }
    }

    public void c() {
        ui2<uo2> ui2Var = this.a;
        int i = ui2Var.y;
        if (i > 0) {
            uo2[] uo2VarArr = ui2Var.w;
            int i2 = 0;
            do {
                uo2VarArr[i2].c();
                i2++;
            } while (i2 < i);
        }
    }

    public boolean d(zp1 zp1Var) {
        ui2<uo2> ui2Var = this.a;
        int i = ui2Var.y;
        boolean z = false;
        if (i > 0) {
            uo2[] uo2VarArr = ui2Var.w;
            int i2 = 0;
            boolean z2 = false;
            do {
                z2 = uo2VarArr[i2].d(zp1Var) || z2;
                i2++;
            } while (i2 < i);
            z = z2;
        }
        b(zp1Var);
        return z;
    }

    public boolean e(Map<c93, d93> map, iy1 iy1Var, zp1 zp1Var, boolean z) {
        ui2<uo2> ui2Var = this.a;
        int i = ui2Var.y;
        if (i <= 0) {
            return false;
        }
        uo2[] uo2VarArr = ui2Var.w;
        int i2 = 0;
        boolean z2 = false;
        do {
            z2 = uo2VarArr[i2].e(map, iy1Var, zp1Var, z) || z2;
            i2++;
        } while (i2 < i);
        return z2;
    }

    public final void f() {
        int i = 0;
        while (true) {
            ui2<uo2> ui2Var = this.a;
            if (i >= ui2Var.y) {
                return;
            }
            uo2 uo2Var = ui2Var.w[i];
            if (uo2Var.b.x) {
                i++;
                uo2Var.f();
            } else {
                ui2Var.n(i);
                uo2Var.c();
            }
        }
    }
}
