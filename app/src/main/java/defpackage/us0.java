package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class us0 {
    public static final qb5 a;
    public static final kz2 b;
    public static final hr4<Float> c;
    public static final hr4<mp1> d;
    public static final hr4<sp1> e;

    public static final class CQf extends cx1 implements j81<Bd_, m95> {
        public static final CQf w = new CQf();

        public CQf() {
            super(1);
        }

        @Override // defpackage.j81
        public final m95 invoke(Bd_ bd_) {
            Bd_ bd_2 = bd_;
            float f = bd_2.a;
            float f2 = bd_2.b;
            return new m95((((long) Float.floatToIntBits(f)) << 32) | (((long) Float.floatToIntBits(f2)) & 4294967295L));
        }
    }

    public static final class QnHx extends cx1 implements j81<m95, Bd_> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(1);
        }

        @Override // defpackage.j81
        public final Bd_ invoke(m95 m95Var) {
            long j = m95Var.a;
            return new Bd_(Float.intBitsToFloat((int) (j >> 32)), m95.a(j));
        }
    }

    static {
        qb5 qb5Var = mg5.a;
        a = new qb5(QnHx.w, CQf.w);
        b = ps0.R(Float.valueOf(1.0f));
        c = hH.w(400.0f, null, 5);
        int i = mp1.c;
        Map<pb5<?, ?>, Float> map = kk5.a;
        d = hH.w(400.0f, new mp1(C0239D.d(1, 1)), 1);
        e = hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1);
    }

    public static lt0 a(pz3.F1 f1, int i) {
        hr4 hr4VarW;
        da daVar;
        if ((i & 1) != 0) {
            Map<pb5<?, ?>, Float> map = kk5.a;
            hr4VarW = hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1);
        } else {
            hr4VarW = null;
        }
        int i2 = i & 2;
        da.CQf cQf = One.QnHx.l;
        da.CQf cQf2 = i2 != 0 ? cQf : null;
        boolean z = (i & 4) != 0;
        j81 j81Var = f1;
        if ((i & 8) != 0) {
            j81Var = bt0.w;
        }
        if (ur1.a(cQf2, One.QnHx.j)) {
            daVar = One.QnHx.b;
        } else {
            daVar = ur1.a(cQf2, cQf) ? One.QnHx.h : One.QnHx.e;
        }
        return new lt0(new v95(null, null, new io(hr4VarW, daVar, new ct0(j81Var), z), null, 11));
    }

    public static lt0 b(nb5 nb5Var, int i) {
        lx0 lx0VarW = nb5Var;
        if ((i & 1) != 0) {
            lx0VarW = hH.w(400.0f, null, 5);
        }
        return new lt0(new v95(new mw0(0.0f, lx0VarW), null, null, null, 14));
    }

    public static mv0 c() {
        return new mv0(new v95(new mw0(0.0f, hH.w(400.0f, null, 5)), null, null, null, 14));
    }

    public static mv0 d(pz3.LPt8Fixed lPt8, int i) {
        hr4 hr4VarW;
        da daVar;
        if ((i & 1) != 0) {
            Map<pb5<?, ?>, Float> map = kk5.a;
            hr4VarW = hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1);
        } else {
            hr4VarW = null;
        }
        int i2 = i & 2;
        da.CQf cQf = One.QnHx.l;
        da.CQf cQf2 = i2 != 0 ? cQf : null;
        boolean z = (i & 4) != 0;
        j81 j81Var = lPt8;
        if ((i & 8) != 0) {
            j81Var = ft0.w;
        }
        if (ur1.a(cQf2, One.QnHx.j)) {
            daVar = One.QnHx.b;
        } else {
            daVar = ur1.a(cQf2, cQf) ? One.QnHx.h : One.QnHx.e;
        }
        return new mv0(new v95(null, null, new io(hr4VarW, daVar, new gt0(j81Var), z), null, 11));
    }

    public static lt0 e(j81 j81Var) {
        int i = mp1.c;
        Map<pb5<?, ?>, Float> map = kk5.a;
        return new lt0(new v95(null, new pm4(hH.w(400.0f, new mp1(C0239D.d(1, 1)), 1), new it0(j81Var)), null, null, 13));
    }

    public static mv0 f(j81 j81Var) {
        int i = mp1.c;
        Map<pb5<?, ?>, Float> map = kk5.a;
        return new mv0(new v95(null, new pm4(hH.w(400.0f, new mp1(C0239D.d(1, 1)), 1), new jt0(j81Var)), null, null, 13));
    }
}
