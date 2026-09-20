package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class su2 {
    public final ui2<yy1> a = new ui2<>(new yy1[16]);

    public static void a(yy1 yy1Var) {
        ui2<uy2<kz1, ou2>> ui2Var;
        int i;
        int i2 = 0;
        if (yy1Var.E == 3 && !yy1Var.n0 && !yy1Var.m0 && yy1Var.Q && (ui2Var = yy1Var.j0) != null && (i = ui2Var.y) > 0) {
            uy2<kz1, ou2>[] uy2VarArr = ui2Var.w;
            int i3 = 0;
            do {
                uy2<kz1, ou2> uy2Var = uy2VarArr[i3];
                uy2Var.x.G(uy2Var.w);
                i3++;
            } while (i3 < i);
        }
        yy1Var.k0 = false;
        ui2<yy1> ui2VarV = yy1Var.v();
        int i4 = ui2VarV.y;
        if (i4 > 0) {
            yy1[] yy1VarArr = ui2VarV.w;
            do {
                a(yy1VarArr[i2]);
                i2++;
            } while (i2 < i4);
        }
    }
}
