package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class su3 implements rb2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ c91<Integer, int[], jy1, ij0, int[], sd5> d;
    public final /* synthetic */ oc0 e;

    public static final class QnHx extends cx1 implements j81<b43.QnHx, sd5> {
        public final /* synthetic */ vb2 A;
        public final /* synthetic */ int[] B;
        public final /* synthetic */ int C;
        public final /* synthetic */ tu3[] D;
        public final /* synthetic */ oc0 E;
        public final /* synthetic */ int F;
        public final /* synthetic */ hl3 G;
        public final /* synthetic */ List<ob2> w;
        public final /* synthetic */ b43[] x;
        public final /* synthetic */ c91<Integer, int[], jy1, ij0, int[], sd5> y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<+Lob2;>;[Lb43;Lc91<-Ljava/lang/Integer;-[I-Ljy1;-Lij0;-[ILsd5;>;ILvb2;[ILjava/lang/Object;[Ltu3;Loc0;ILhl3;)V */
        public QnHx(List list, b43[] b43VarArr, c91 c91Var, int i, vb2 vb2Var, int[] iArr, int i2, tu3[] tu3VarArr, oc0 oc0Var, int i3, hl3 hl3Var) {
            super(1);
            this.w = list;
            this.x = b43VarArr;
            this.y = c91Var;
            this.z = i;
            this.A = vb2Var;
            this.B = iArr;
            this.C = i2;
            this.D = tu3VarArr;
            this.E = oc0Var;
            this.F = i3;
            this.G = hl3Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(b43.QnHx qnHx) {
            int i;
            b43[] b43VarArr;
            b43.QnHx qnHx2 = qnHx;
            int size = this.w.size();
            int[] iArr = new int[size];
            int i2 = 0;
            int i3 = 0;
            while (true) {
                i = this.C;
                b43VarArr = this.x;
                if (i3 >= size) {
                    break;
                }
                b43 b43Var = b43VarArr[i3];
                iArr[i3] = i == 1 ? b43Var.w : b43Var.x;
                i3++;
            }
            c91<Integer, int[], jy1, ij0, int[], sd5> c91Var = this.y;
            Integer numValueOf = Integer.valueOf(this.z);
            vb2 vb2Var = this.A;
            c91Var.j0(numValueOf, iArr, vb2Var.getLayoutDirection(), this.A, this.B);
            int length = b43VarArr.length;
            int i4 = 0;
            while (i2 < length) {
                b43 b43Var2 = b43VarArr[i2];
                int i5 = i4 + 1;
                tu3 tu3Var = this.D[i4];
                oc0 oc0Var = tu3Var != null ? tu3Var.c : null;
                if (oc0Var == null) {
                    oc0Var = this.E;
                }
                int i6 = this.F - (i == 1 ? b43Var2.x : b43Var2.w);
                jy1 layoutDirection = i == 1 ? jy1.Ltr : vb2Var.getLayoutDirection();
                int i7 = this.G.w;
                int iA = oc0Var.a(i6, layoutDirection);
                int[] iArr2 = this.B;
                if (i == 1) {
                    b43.QnHx.c(qnHx2, b43Var2, iArr2[i4], iA);
                } else {
                    b43.QnHx.c(qnHx2, b43Var2, iA, iArr2[i4]);
                }
                i2++;
                i4 = i5;
            }
            return sd5.a;
        }
    }

    public su3(float f, oc0 oc0Var, int i, c91 c91Var) {
        this.a = i;
        this.b = f;
        this.d = c91Var;
        this.e = oc0Var;
    }

    @Override // defpackage.rb2
    public final sb2 a(vb2 vb2Var, List<? extends ob2> list, long j) {
        int iMax;
        tu3[] tu3VarArr;
        int i;
        int i2;
        int i3;
        List<? extends ob2> list2 = list;
        int i4 = this.a;
        int iJ = i4 == 1 ? g70.j(j) : g70.i(j);
        int iH = i4 == 1 ? g70.h(j) : g70.g(j);
        int i5 = i4 == 1 ? g70.i(j) : g70.j(j);
        int iG = i4 == 1 ? g70.g(j) : g70.h(j);
        int iP0 = vb2Var.p0(this.b);
        b43[] b43VarArr = new b43[list.size()];
        int size = list.size();
        tu3[] tu3VarArr2 = new tu3[size];
        for (int i6 = 0; i6 < size; i6++) {
            tu3VarArr2[i6] = kK.d(list2.get(i6));
        }
        int size2 = list.size();
        float f = 0.0f;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        float f2 = 0.0f;
        while (i7 < size2) {
            ob2 ob2Var = list2.get(i7);
            float fE = kK.e(tu3VarArr2[i7]);
            if (fE > f) {
                f2 += fE;
                i9++;
                size2 = size2;
            } else {
                if (iH == Integer.MAX_VALUE) {
                    i3 = 1;
                    i2 = Integer.MAX_VALUE;
                } else {
                    i2 = iH - i10;
                    i3 = 1;
                }
                b43 b43VarY = ob2Var.y(i4 == i3 ? FWT.m(0, i2, 0, iG) : FWT.m(0, iG, 0, i2));
                int iMin = Math.min(iP0, (iH - i10) - (i4 == 1 ? b43VarY.w : b43VarY.x));
                int i12 = (i4 == 1 ? b43VarY.w : b43VarY.x) + iMin + i10;
                int iMax2 = Math.max(i8, i4 == 1 ? b43VarY.x : b43VarY.w);
                b43VarArr[i7] = b43VarY;
                i11 = iMin;
                i10 = i12;
                i8 = iMax2;
            }
            i7++;
            size2 = size2;
            f = 0.0f;
        }
        int i13 = i8;
        if (i9 == 0) {
            i10 -= i11;
            tu3VarArr = tu3VarArr2;
            iMax = i13;
            i = 0;
        } else {
            int i14 = (i9 - 1) * iP0;
            int i15 = (((f2 <= 0.0f || iH == Integer.MAX_VALUE) ? iJ : iH) - i10) - i14;
            float f3 = f2 > 0.0f ? i15 / f2 : 0.0f;
            int iC = 0;
            for (int i16 = 0; i16 < size; i16++) {
                iC = sy4.c(kK.e(tu3VarArr2[i16]) * f3) + iC;
            }
            int size3 = list.size();
            iMax = i13;
            int i17 = 0;
            int i18 = i15 - iC;
            int i19 = 0;
            while (i19 < size3) {
                if (b43VarArr[i19] == null) {
                    ob2 ob2Var2 = list2.get(i19);
                    tu3 tu3Var = tu3VarArr2[i19];
                    float fE2 = kK.e(tu3Var);
                    if (!(fE2 > 0.0f)) {
                        throw new IllegalStateException("All weights <= 0 should have placeables".toString());
                    }
                    int i20 = i18 < 0 ? -1 : i18 > 0 ? 1 : 0;
                    int i21 = i18 - i20;
                    int iMax3 = Math.max(0, sy4.c(fE2 * f3) + i20);
                    int i22 = (!(tu3Var != null ? tu3Var.b : true) || iMax3 == Integer.MAX_VALUE) ? 0 : iMax3;
                    b43 b43VarY2 = ob2Var2.y(i4 == 1 ? FWT.m(i22, iMax3, 0, iG) : FWT.m(0, iG, i22, iMax3));
                    int i23 = (i4 == 1 ? b43VarY2.w : b43VarY2.x) + i17;
                    iMax = Math.max(iMax, i4 == 1 ? b43VarY2.x : b43VarY2.w);
                    b43VarArr[i19] = b43VarY2;
                    i17 = i23;
                    i18 = i21;
                }
                i19++;
                list2 = list;
                size3 = size3;
                tu3VarArr2 = tu3VarArr2;
                f3 = f3;
            }
            tu3VarArr = tu3VarArr2;
            i = i17 + i14;
            int i24 = iH - i10;
            if (i > i24) {
                i = i24;
            }
        }
        hl3 hl3Var = new hl3();
        int iMax4 = Math.max(i10 + i, iJ);
        int iMax5 = (iG == Integer.MAX_VALUE || this.c != 2) ? Math.max(iMax, Math.max(i5, hl3Var.w + 0)) : iG;
        int i25 = i4 == 1 ? iMax4 : iMax5;
        int i26 = i4 == 1 ? iMax5 : iMax4;
        int size4 = list.size();
        int[] iArr = new int[size4];
        for (int i27 = 0; i27 < size4; i27++) {
            iArr[i27] = 0;
        }
        return vb2Var.K(i25, i26, ds0.w, new QnHx(list, b43VarArr, this.d, iMax4, vb2Var, iArr, this.a, tu3VarArr, this.e, iMax5, hl3Var));
    }

    @Override // defpackage.rb2
    public final int b(yy1.byN byn, List list, int i) {
        y81 y81Var = this.a == 1 ? cr1.c : cr1.d;
        Integer numValueOf = Integer.valueOf(i);
        byn.getClass();
        return ((Number) y81Var.invoke(list, numValueOf, Integer.valueOf(hj0.a(this.b, byn)))).intValue();
    }

    @Override // defpackage.rb2
    public final int c(yy1.byN byn, List list, int i) {
        y81 y81Var = this.a == 1 ? cr1.a : cr1.b;
        Integer numValueOf = Integer.valueOf(i);
        byn.getClass();
        return ((Number) y81Var.invoke(list, numValueOf, Integer.valueOf(hj0.a(this.b, byn)))).intValue();
    }

    @Override // defpackage.rb2
    public final int d(yy1.byN byn, List list, int i) {
        y81 y81Var = this.a == 1 ? cr1.e : cr1.f;
        Integer numValueOf = Integer.valueOf(i);
        byn.getClass();
        return ((Number) y81Var.invoke(list, numValueOf, Integer.valueOf(hj0.a(this.b, byn)))).intValue();
    }

    @Override // defpackage.rb2
    public final int e(yy1.byN byn, List list, int i) {
        y81 y81Var = this.a == 1 ? cr1.g : cr1.h;
        Integer numValueOf = Integer.valueOf(i);
        byn.getClass();
        return ((Number) y81Var.invoke(list, numValueOf, Integer.valueOf(hj0.a(this.b, byn)))).intValue();
    }
}
