package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ug2 implements h81<sd5> {
    public boolean A;
    public final ui2<sg2> B = new ui2<>(new sg2[16]);
    public final yy1 w;
    public final tg2<?> x;
    public ug2 y;
    public ug2 z;

    public ug2(yy1 yy1Var, tg2<?> tg2Var) {
        this.w = yy1Var;
        this.x = tg2Var;
    }

    public final void a() {
        this.A = false;
        ui2<sg2> ui2Var = this.B;
        int i = ui2Var.y;
        if (i > 0) {
            sg2[] sg2VarArr = ui2Var.w;
            int i2 = 0;
            do {
                sg2 sg2Var = sg2VarArr[i2];
                sg2Var.x.c(sg2.B);
                sg2Var.z = false;
                i2++;
            } while (i2 < i);
        }
        c(this.x.getKey(), false);
    }

    public final tg2 b(mg3 mg3Var) {
        ug2 ug2Var;
        tg2 tg2VarB;
        tg2<?> tg2Var = this.x;
        if (ur1.a(tg2Var.getKey(), mg3Var)) {
            return tg2Var;
        }
        ug2 ug2Var2 = this.z;
        if (ug2Var2 != null && (tg2VarB = ug2Var2.b(mg3Var)) != null) {
            return tg2VarB;
        }
        yy1 yy1VarS = this.w.s();
        if (yy1VarS == null || (ug2Var = yy1VarS.f0) == null) {
            return null;
        }
        return ug2Var.b(mg3Var);
    }

    public final void c(mg3 mg3Var, boolean z) {
        sd5 sd5Var;
        ui2<yy1> ui2VarV;
        int i;
        ww2 ww2Var;
        if (z && ur1.a(this.x.getKey(), mg3Var)) {
            return;
        }
        ui2<sg2> ui2Var = this.B;
        int i2 = ui2Var.y;
        int i3 = 0;
        if (i2 > 0) {
            sg2[] sg2VarArr = ui2Var.w;
            int i4 = 0;
            do {
                sg2 sg2Var = sg2VarArr[i4];
                if (sg2Var.y.f(mg3Var) && (ww2Var = sg2Var.w.w.C) != null) {
                    ww2Var.i(sg2Var);
                }
                i4++;
            } while (i4 < i2);
        }
        ug2 ug2Var = this.y;
        if (ug2Var != null) {
            ug2Var.c(mg3Var, true);
            sd5Var = sd5.a;
        } else {
            sd5Var = null;
        }
        if (sd5Var != null || (i = (ui2VarV = this.w.v()).y) <= 0) {
            return;
        }
        yy1[] yy1VarArr = ui2VarV.w;
        do {
            yy1VarArr[i3].e0.c(mg3Var, true);
            i3++;
        } while (i3 < i);
    }

    @Override // defpackage.h81
    public final sd5 invoke() {
        if (this.A) {
            c(this.x.getKey(), false);
        }
        return sd5.a;
    }
}
