package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class he implements rb2 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ One b;

    public static final class CQf extends cx1 implements j81<b43.QnHx, sd5> {
        public final /* synthetic */ int A;
        public final /* synthetic */ One B;
        public final /* synthetic */ b43 w;
        public final /* synthetic */ ob2 x;
        public final /* synthetic */ vb2 y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(b43 b43Var, ob2 ob2Var, vb2 vb2Var, int i, int i2, One one) {
            super(1);
            this.w = b43Var;
            this.x = ob2Var;
            this.y = vb2Var;
            this.z = i;
            this.A = i2;
            this.B = one;
        }

        @Override // defpackage.j81
        public final sd5 invoke(b43.QnHx qnHx) {
            fe.b(qnHx, this.w, this.x, this.y.getLayoutDirection(), this.z, this.A, this.B);
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements j81<b43.QnHx, sd5> {
        public final /* synthetic */ hl3 A;
        public final /* synthetic */ One B;
        public final /* synthetic */ b43[] w;
        public final /* synthetic */ List<ob2> x;
        public final /* synthetic */ vb2 y;
        public final /* synthetic */ hl3 z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public F1(b43[] b43VarArr, List<? extends ob2> list, vb2 vb2Var, hl3 hl3Var, hl3 hl3Var2, One one) {
            super(1);
            this.w = b43VarArr;
            this.x = list;
            this.y = vb2Var;
            this.z = hl3Var;
            this.A = hl3Var2;
            this.B = one;
        }

        @Override // defpackage.j81
        public final sd5 invoke(b43.QnHx qnHx) {
            b43.QnHx qnHx2 = qnHx;
            One one = this.B;
            b43[] b43VarArr = this.w;
            int length = b43VarArr.length;
            int i = 0;
            int i2 = 0;
            while (i2 < length) {
                b43 b43Var = b43VarArr[i2];
                int i3 = i + 1;
                if (b43Var == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                }
                fe.b(qnHx2, b43Var, this.x.get(i), this.y.getLayoutDirection(), this.z.w, this.A.w, one);
                i2++;
                i = i3;
            }
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements j81<b43.QnHx, sd5> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(1);
        }

        @Override // defpackage.j81
        public final /* bridge */ /* synthetic */ sd5 invoke(b43.QnHx qnHx) {
            return sd5.a;
        }
    }

    public he(One one, boolean z) {
        this.a = z;
        this.b = one;
    }

    @Override // defpackage.rb2
    public final sb2 a(vb2 vb2Var, List<? extends ob2> list, long j) {
        int iJ;
        int i;
        b43 b43VarY;
        boolean zIsEmpty = list.isEmpty();
        ds0 ds0Var = ds0.w;
        if (zIsEmpty) {
            return vb2Var.K(g70.j(j), g70.i(j), ds0Var, QnHx.w);
        }
        long jA = this.a ? j : g70.a(j, 0, 0, 0, 0, 10);
        if (list.size() == 1) {
            ob2 ob2Var = list.get(0);
            Object objB = ob2Var.B();
            ee eeVar = objB instanceof ee ? (ee) objB : null;
            if (eeVar != null ? eeVar.y : false) {
                iJ = g70.j(j);
                i = g70.i(j);
                b43VarY = ob2Var.y(g70.QnHx.c(g70.j(j), g70.i(j)));
            } else {
                b43VarY = ob2Var.y(jA);
                iJ = Math.max(g70.j(j), b43VarY.w);
                i = Math.max(g70.i(j), b43VarY.x);
            }
            int i2 = iJ;
            int i3 = i;
            return vb2Var.K(i2, i3, ds0Var, new CQf(b43VarY, ob2Var, vb2Var, i2, i3, this.b));
        }
        b43[] b43VarArr = new b43[list.size()];
        hl3 hl3Var = new hl3();
        hl3Var.w = g70.j(j);
        hl3 hl3Var2 = new hl3();
        hl3Var2.w = g70.i(j);
        int size = list.size();
        boolean z = false;
        for (int i4 = 0; i4 < size; i4++) {
            ob2 ob2Var2 = list.get(i4);
            Object objB2 = ob2Var2.B();
            ee eeVar2 = objB2 instanceof ee ? (ee) objB2 : null;
            if (eeVar2 != null ? eeVar2.y : false) {
                z = true;
            } else {
                b43 b43VarY2 = ob2Var2.y(jA);
                b43VarArr[i4] = b43VarY2;
                hl3Var.w = Math.max(hl3Var.w, b43VarY2.w);
                hl3Var2.w = Math.max(hl3Var2.w, b43VarY2.x);
            }
        }
        if (z) {
            int i5 = hl3Var.w;
            int i6 = i5 != Integer.MAX_VALUE ? i5 : 0;
            int i7 = hl3Var2.w;
            long jM = FWT.m(i6, i5, i7 != Integer.MAX_VALUE ? i7 : 0, i7);
            int size2 = list.size();
            for (int i8 = 0; i8 < size2; i8++) {
                ob2 ob2Var3 = list.get(i8);
                Object objB3 = ob2Var3.B();
                ee eeVar3 = objB3 instanceof ee ? (ee) objB3 : null;
                if (eeVar3 != null ? eeVar3.y : false) {
                    b43VarArr[i8] = ob2Var3.y(jM);
                }
            }
        }
        return vb2Var.K(hl3Var.w, hl3Var2.w, ds0Var, new F1(b43VarArr, list, vb2Var, hl3Var, hl3Var2, this.b));
    }

    @Override // defpackage.rb2
    public final /* synthetic */ int b(yy1.byN byn, List list, int i) {
        return qb2.c(this, byn, list, i);
    }

    @Override // defpackage.rb2
    public final /* synthetic */ int c(yy1.byN byn, List list, int i) {
        return qb2.d(this, byn, list, i);
    }

    @Override // defpackage.rb2
    public final /* synthetic */ int d(yy1.byN byn, List list, int i) {
        return qb2.b(this, byn, list, i);
    }

    @Override // defpackage.rb2
    public final /* synthetic */ int e(yy1.byN byn, List list, int i) {
        return qb2.a(this, byn, list, i);
    }
}
