package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class pe1 {
    public static final QnHx d = new QnHx();
    public static final Dt<pe1> e = new Dt<>("HttpResponseValidator");
    public final List<x81<qg1, z80<? super sd5>, Object>> a;
    public final List<tb1> b;
    public final boolean c;

    public static final class CQf {
        public final ArrayList a = new ArrayList();
        public final ArrayList b = new ArrayList();
        public boolean c = true;
    }

    public static final class QnHx implements kf1<CQf, pe1> {
        @Override // defpackage.kf1
        public final void a(pe1 pe1Var, ue1 ue1Var) throws as1 {
            pe1 pe1Var2 = pe1Var;
            ue1Var.A.f(pg1.f, new me1(pe1Var2, null));
            ta2 ta2Var = new ta2("BeforeReceive");
            ta2 ta2Var2 = ug1.f;
            ug1 ug1Var = ue1Var.B;
            if (!ug1Var.e(ta2Var)) {
                int iC = ug1Var.c(ta2Var2);
                if (iC == -1) {
                    throw new as1("Phase " + ta2Var2 + " was not registered for this pipeline");
                }
                ug1Var.a.add(iC, new e23(ta2Var, new a43.CQf()));
            }
            ug1Var.f(ta2Var, new ne1(pe1Var2, null));
            ((vg1) lf1.a(ue1Var, vg1.c)).b.add(new oe1(pe1Var2, null));
        }

        @Override // defpackage.kf1
        public final pe1 b(j81<? super CQf, sd5> j81Var) {
            CQf cQf = new CQf();
            j81Var.invoke(cQf);
            return new pe1(wu.W0(cQf.a), wu.W0(cQf.b), cQf.c);
        }

        @Override // defpackage.kf1
        public final Dt<pe1> getKey() {
            return pe1.e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public pe1(List<? extends x81<? super qg1, ? super z80<? super sd5>, ? extends Object>> list, List<? extends tb1> list2, boolean z) {
        this.a = list;
        this.b = list2;
        this.c = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final sd5 a(pe1 pe1Var, Throwable th, gg1 gg1Var, z80 z80Var) throws Throwable {
        qe1 qe1Var;
        Iterator it;
        pe1Var.getClass();
        if (z80Var instanceof qe1) {
            qe1Var = (qe1) z80Var;
            int i = qe1Var.E;
            if ((i & Integer.MIN_VALUE) != 0) {
                qe1Var.E = i - Integer.MIN_VALUE;
            } else {
                qe1Var = new qe1(pe1Var, z80Var);
            }
        } else {
            qe1Var = new qe1(pe1Var, z80Var);
        }
        Object obj = qe1Var.C;
        int i2 = qe1Var.E;
        if (i2 == 0) {
            C0239D.H(obj);
            it = pe1Var.b.iterator();
        } else {
            if (i2 != 1 && i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = qe1Var.B;
            gg1Var = qe1Var.A;
            th = qe1Var.z;
            C0239D.H(obj);
        }
        while (it.hasNext()) {
            tb1 tb1Var = (tb1) it.next();
            if (tb1Var instanceof tu0) {
                ((tu0) tb1Var).getClass();
                qe1Var.z = th;
                qe1Var.A = gg1Var;
                qe1Var.B = it;
                qe1Var.E = 1;
                throw null;
            }
            if (tb1Var instanceof gp3) {
                ((gp3) tb1Var).getClass();
                qe1Var.z = th;
                qe1Var.A = gg1Var;
                qe1Var.B = it;
                qe1Var.E = 2;
                throw null;
            }
        }
        return sd5.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object b(pe1 pe1Var, qg1 qg1Var, z80 z80Var) throws Throwable {
        re1 re1Var;
        Iterator it;
        pe1Var.getClass();
        if (z80Var instanceof re1) {
            re1Var = (re1) z80Var;
            int i = re1Var.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                re1Var.D = i - Integer.MIN_VALUE;
            } else {
                re1Var = new re1(pe1Var, z80Var);
            }
        } else {
            re1Var = new re1(pe1Var, z80Var);
        }
        Object obj = re1Var.B;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = re1Var.D;
        if (i2 == 0) {
            C0239D.H(obj);
            it = pe1Var.a.iterator();
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = re1Var.A;
            qg1Var = re1Var.z;
            C0239D.H(obj);
        }
        while (it.hasNext()) {
            x81 x81Var = (x81) it.next();
            re1Var.z = qg1Var;
            re1Var.A = it;
            re1Var.D = 1;
            if (x81Var.invoke(qg1Var, re1Var) == va0Var) {
                return va0Var;
            }
        }
        return sd5.a;
    }
}
