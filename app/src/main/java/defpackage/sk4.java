package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class sk4 {

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ pg2 w;
        public final /* synthetic */ x81<g30, Integer, sd5> x;
        public final /* synthetic */ int y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CQf(pg2 pg2Var, x81<? super g30, ? super Integer, sd5> x81Var, int i, int i2) {
            super(2);
            this.w = pg2Var;
            this.x = x81Var;
            this.y = i;
            this.z = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            sk4.a(this.w, this.x, g30Var, i, this.z);
            return sd5.a;
        }
    }

    public static final class QnHx implements rb2 {
        public static final QnHx a = new QnHx();

        /* JADX INFO: renamed from: sk4$QnHx$QnHx, reason: collision with other inner class name */
        public static final class C0198QnHx extends cx1 implements j81<b43.QnHx, sd5> {
            public final /* synthetic */ List<b43> w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0198QnHx(ArrayList arrayList) {
                super(1);
                this.w = arrayList;
            }

            @Override // defpackage.j81
            public final sd5 invoke(b43.QnHx qnHx) {
                b43.QnHx qnHx2 = qnHx;
                List<b43> list = this.w;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    b43.QnHx.c(qnHx2, list.get(i), 0, 0);
                }
                return sd5.a;
            }
        }

        @Override // defpackage.rb2
        public final sb2 a(vb2 vb2Var, List<? extends ob2> list, long j) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            Integer numValueOf = 0;
            for (int i = 0; i < size; i++) {
                arrayList.add(list.get(i).y(j));
            }
            int size2 = arrayList.size();
            Integer numValueOf2 = numValueOf;
            for (int i2 = 0; i2 < size2; i2++) {
                numValueOf2 = Integer.valueOf(Math.max(numValueOf2.intValue(), ((b43) arrayList.get(i2)).w));
            }
            int iIntValue = numValueOf2.intValue();
            int size3 = arrayList.size();
            for (int i3 = 0; i3 < size3; i3++) {
                numValueOf = Integer.valueOf(Math.max(numValueOf.intValue(), ((b43) arrayList.get(i3)).x));
            }
            return vb2Var.K(iIntValue, numValueOf.intValue(), ds0.w, new C0198QnHx(arrayList));
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

    public static final void a(pg2 pg2Var, x81<? super g30, ? super Integer, sd5> x81Var, g30 g30Var, int i, int i2) {
        int i3;
        j30 j30VarQ = g30Var.q(-2105228848);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (j30VarQ.I(pg2Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= j30VarQ.I(x81Var) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            if (i4 != 0) {
                pg2Var = pg2.QnHx.w;
            }
            QnHx qnHx = QnHx.a;
            j30VarQ.e(-1323940314);
            ij0 ij0Var = (ij0) j30VarQ.E(r40.e);
            jy1 jy1Var = (jy1) j30VarQ.E(r40.k);
            ti5 ti5Var = (ti5) j30VarQ.E(r40.o);
            a30.e.getClass();
            yy1.QnHx qnHx2 = a30.QnHx.b;
            sz szVarJ = S12N.j(pg2Var);
            int i5 = (((((i3 << 3) & 112) | ((i3 >> 3) & 14)) << 9) & 7168) | 6;
            if (!(j30VarQ.a instanceof jE)) {
                fp1.c0();
                throw null;
            }
            j30VarQ.s();
            if (j30VarQ.K) {
                j30VarQ.l(qnHx2);
            } else {
                j30VarQ.A();
            }
            j30VarQ.x = false;
            hH.u(j30VarQ, qnHx, a30.QnHx.e);
            hH.u(j30VarQ, ij0Var, a30.QnHx.d);
            hH.u(j30VarQ, jy1Var, a30.QnHx.f);
            szVarJ.invoke(sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, Integer.valueOf((i5 >> 3) & 112));
            j30VarQ.e(2058660585);
            fc2.b((i5 >> 9) & 14, x81Var, j30VarQ, false, true, false);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(pg2Var, x81Var, i, i2);
    }
}
