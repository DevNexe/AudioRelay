package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class kh2 {
    public final lh2 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final int f;
    public final ArrayList g;
    public final ArrayList h;

    public kh2(lh2 lh2Var, long j, int i, boolean z) {
        boolean z2;
        int iG;
        this.a = lh2Var;
        this.b = i;
        if (!(g70.j(j) == 0 && g70.i(j) == 0)) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString());
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = lh2Var.e;
        int size = arrayList2.size();
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        while (true) {
            if (i2 >= size) {
                z2 = false;
                break;
            }
            zy2 zy2Var = (zy2) arrayList2.get(i2);
            az2 az2Var = zy2Var.a;
            int iH = g70.h(j);
            if (g70.c(j)) {
                iG = g70.g(j) - ((int) Math.ceil(f));
                if (iG < 0) {
                    iG = 0;
                }
            } else {
                iG = g70.g(j);
            }
            world worldVar = new world((h) az2Var, this.b - i3, z, FWT.n(iH, iG, 5));
            float height = worldVar.getHeight() + f;
            l55 l55Var = worldVar.d;
            int i4 = i3 + l55Var.c;
            arrayList.add(new yy2(worldVar, zy2Var.b, zy2Var.c, i3, i4, f, height));
            if (l55Var.a) {
                i3 = i4;
            } else {
                i3 = i4;
                if (i3 != this.b || i2 == ps0.J(this.a.e)) {
                    i2++;
                    f = height;
                }
            }
            f = height;
            z2 = true;
            break;
        }
        this.e = f;
        this.f = i3;
        this.c = z2;
        this.h = arrayList;
        this.d = g70.h(j);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i5 = 0; i5 < size2; i5++) {
            yy2 yy2Var = (yy2) arrayList.get(i5);
            List<dl3> listL = yy2Var.a.l();
            ArrayList arrayList4 = new ArrayList(listL.size());
            int size3 = listL.size();
            for (int i6 = 0; i6 < size3; i6++) {
                dl3 dl3Var = listL.get(i6);
                arrayList4.add(dl3Var != null ? dl3Var.e(X.a(0.0f, yy2Var.f)) : null);
            }
            su.x0(arrayList4, arrayList3);
        }
        if (arrayList3.size() < this.a.b.size()) {
            int size4 = this.a.b.size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i7 = 0; i7 < size4; i7++) {
                arrayList5.add(null);
            }
            arrayList3 = wu.U0(arrayList5, arrayList3);
        }
        this.g = arrayList3;
    }

    public final TQ2_ a(int i, int i2) {
        boolean z = false;
        boolean z2 = i >= 0 && i <= i2;
        lh2 lh2Var = this.a;
        if (z2 && i2 <= lh2Var.a.w.length()) {
            z = true;
        }
        if (!z) {
            StringBuilder sbA = a42.a("Start(", i, ") or End(", i2, ") is out of range [0..");
            sbA.append(lh2Var.a.w.length());
            sbA.append("), or start > end!");
            throw new IllegalArgumentException(sbA.toString().toString());
        }
        if (i == i2) {
            return hH.g();
        }
        ArrayList arrayList = this.h;
        TQ2_ tq2_G = hH.g();
        int size = arrayList.size();
        for (int iN = Cz.n(arrayList, i); iN < size; iN++) {
            yy2 yy2Var = (yy2) arrayList.get(iN);
            int i3 = yy2Var.b;
            if (i3 >= i2) {
                break;
            }
            if (i3 != yy2Var.c) {
                TQ2_ tq2_R = yy2Var.a.r(yy2Var.a(i), yy2Var.a(i2));
                tq2_R.o(X.a(0.0f, yy2Var.f));
                tq2_G.l(tq2_R, kt2.b);
            }
        }
        return tq2_G;
    }

    public final void b(int i) {
        lh2 lh2Var = this.a;
        boolean z = false;
        if (i >= 0 && i <= lh2Var.a.w.length()) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbC = iZUl.c("offset(", i, ") is out of bounds [0, ");
        sbC.append(lh2Var.a.length());
        sbC.append(']');
        throw new IllegalArgumentException(sbC.toString().toString());
    }

    public final void c(int i) {
        boolean z = false;
        if (i >= 0 && i < this.f) {
            z = true;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(("lineIndex(" + i + ") is out of bounds [0, " + i + ')').toString());
    }
}
