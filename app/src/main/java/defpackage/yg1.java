package defpackage;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class yg1 {
    public final ig1 a;
    public final ue1 b;

    @if0(c = "io.ktor.client.statement.HttpStatement", f = "HttpStatement.kt", l = {107}, m = "executeUnsafe")
    public static final class CQf extends b90 {
        public int B;
        public /* synthetic */ Object z;

        public CQf(z80<? super CQf> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.z = obj;
            this.B |= Integer.MIN_VALUE;
            return yg1.this.b(this);
        }
    }

    @if0(c = "io.ktor.client.statement.HttpStatement", f = "HttpStatement.kt", l = {125}, m = "cleanup")
    public static final class QnHx extends b90 {
        public /* synthetic */ Object A;
        public int C;
        public jx z;

        public QnHx(z80<? super QnHx> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.A = obj;
            this.C |= Integer.MIN_VALUE;
            return yg1.this.a(null, this);
        }
    }

    public yg1(ig1 ig1Var, ue1 ue1Var) {
        Set setKeySet;
        this.a = ig1Var;
        this.b = ue1Var;
        Map map = (Map) ig1Var.f.d(gf1.a);
        if (map == null || (setKeySet = map.keySet()) == null) {
            return;
        }
        ArrayList<kf1> arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (obj instanceof kf1) {
                arrayList.add(obj);
            }
        }
        for (kf1 kf1Var : arrayList) {
            ue1 ue1Var2 = this.b;
            Dt<Bpm> dt = lf1.a;
            Bpm bpm = (Bpm) ue1Var2.E.d(lf1.a);
            if ((bpm != null ? bpm.d(kf1Var.getKey()) : null) == null) {
                throw new IllegalArgumentException(("Consider installing " + kf1Var + " plugin because the request requires it to be installed").toString());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(qg1 qg1Var, z80<? super sd5> z80Var) throws Throwable {
        QnHx qnHx;
        if (z80Var instanceof QnHx) {
            qnHx = (QnHx) z80Var;
            int i = qnHx.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                qnHx.C = i - Integer.MIN_VALUE;
            } else {
                qnHx = new QnHx(z80Var);
            }
        } else {
            qnHx = new QnHx(z80Var);
        }
        Object obj = qnHx.A;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = qnHx.C;
        if (i2 == 0) {
            C0239D.H(obj);
            jx jxVar = (jx) qg1Var.g().j(ms1.CQf.w);
            jxVar.h();
            try {
                qg1Var.d().l(null);
            } catch (Throwable unused) {
            }
            qnHx.z = jxVar;
            qnHx.C = 1;
            if (jxVar.K(qnHx) == va0Var) {
                return va0Var;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0239D.H(obj);
        }
        return sd5.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(z80<? super qg1> z80Var) {
        CQf cQf;
        if (z80Var instanceof CQf) {
            cQf = (CQf) z80Var;
            int i = cQf.B;
            if ((i & Integer.MIN_VALUE) != 0) {
                cQf.B = i - Integer.MIN_VALUE;
            } else {
                cQf = new CQf(z80Var);
            }
        } else {
            cQf = new CQf(z80Var);
        }
        Object objA = cQf.z;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = cQf.B;
        try {
            if (i2 == 0) {
                C0239D.H(objA);
                ig1 ig1Var = new ig1();
                ig1Var.c(this.a);
                ue1 ue1Var = this.b;
                cQf.B = 1;
                ue1Var.F.a(m57.w);
                objA = ue1Var.A.a(ig1Var, ig1Var.d, cQf);
                if (objA != va0Var) {
                    objA = (ve1) objA;
                }
                if (objA == va0Var) {
                    return va0Var;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(objA);
            }
            return ((ve1) objA).e();
        } catch (CancellationException e) {
            throw X.H(e);
        }
    }

    public final String toString() {
        return "HttpStatement[" + this.a.a.c() + ']';
    }
}
