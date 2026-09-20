package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class ue1 implements ua0, Closeable {
    public static final /* synthetic */ AtomicIntegerFieldUpdater H = AtomicIntegerFieldUpdater.newUpdater(ue1.class, "closed");
    public final pg1 A;
    public final ug1 B;
    public final xg1 C;
    public final bg1 D;
    public final GPUw E;
    public final su0 F;
    public final we1<hf1> G;
    private volatile /* synthetic */ int closed;
    public final ze1 w;
    public final boolean x;
    public final os1 y;
    public final la0 z;

    @if0(c = "io.ktor.client.HttpClient$2", f = "HttpClient.kt", l = {140, 142}, m = "invokeSuspend")
    public static final class CQf extends px4 implements y81<k33<Object, ig1>, Object, z80<? super sd5>, Object> {
        public int A;
        public /* synthetic */ k33 B;
        public /* synthetic */ Object C;

        public CQf(z80<? super CQf> z80Var) {
            super(3, z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            Object obj2;
            k33 k33Var;
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            if (i != 0) {
                if (i == 1) {
                    obj2 = this.C;
                    k33Var = this.B;
                    C0239D.H(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C0239D.H(obj);
                }
                return sd5.a;
            }
            C0239D.H(obj);
            k33 k33Var2 = this.B;
            obj2 = this.C;
            if (!(obj2 instanceof ve1)) {
                throw new IllegalStateException(("Error: HttpClientCall expected, but found " + obj2 + '(' + nl3.a(obj2.getClass()) + ").").toString());
            }
            bg1 bg1Var = ue1.this.D;
            sd5 sd5Var = sd5.a;
            qg1 qg1VarE = ((ve1) obj2).e();
            this.B = k33Var2;
            this.C = obj2;
            this.A = 1;
            Object objA = bg1Var.a(sd5Var, qg1VarE, this);
            if (objA == va0Var) {
                return va0Var;
            }
            k33Var = k33Var2;
            obj = objA;
            ((ve1) obj2).y = (qg1) obj;
            this.B = null;
            this.C = null;
            this.A = 2;
            if (k33Var.e(obj2, this) == va0Var) {
                return va0Var;
            }
            return sd5.a;
        }

        @Override // defpackage.y81
        public final Object invoke(k33<Object, ig1> k33Var, Object obj, z80<? super sd5> z80Var) {
            CQf cQf = ue1.this.new CQf(z80Var);
            cQf.B = k33Var;
            cQf.C = obj;
            return cQf.i(sd5.a);
        }
    }

    public static final class F1 extends cx1 implements j81<ue1, sd5> {
        public static final F1 w = new F1();

        public F1() {
            super(1);
        }

        @Override // defpackage.j81
        public final sd5 invoke(ue1 ue1Var) {
            ue1 ue1Var2 = ue1Var;
            ue1Var2.A.f(pg1.i, new bi0(null));
            ta2 ta2Var = ug1.g;
            ci0 ci0Var = new ci0(null);
            ug1 ug1Var = ue1Var2.B;
            ug1Var.f(ta2Var, ci0Var);
            ug1Var.f(ta2Var, new ei0(null));
            return sd5.a;
        }
    }

    @if0(c = "io.ktor.client.HttpClient$4", f = "HttpClient.kt", l = {173}, m = "invokeSuspend")
    public static final class LPt8Fixed extends px4 implements y81<k33<rg1, ve1>, rg1, z80<? super sd5>, Object> {
        public int A;
        public /* synthetic */ k33 B;

        public LPt8Fixed(z80<? super LPt8Fixed> z80Var) {
            super(3, z80Var);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0048  */
        /* JADX WARN: Code duplicated, block: B:25:0x0055  */
        /* JADX WARN: Code duplicated, block: B:28:0x005a  */
        /* JADX WARN: Code duplicated, block: B:40:0x0076  */
        /* JADX WARN: Code duplicated, block: B:41:0x0077  */
        /* JADX WARN: Code duplicated, block: B:52:0x006e A[SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            k33 k33Var;
            Throwable th;
            h52 h52Var;
            Throwable th2;
            kotlinx.coroutines.internal.QnHx qnHxL;
            sd5 sd5Var;
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            if (i == 0) {
                C0239D.H(obj);
                k33 k33Var2 = this.B;
                try {
                    this.B = k33Var2;
                    this.A = 1;
                    if (k33Var2.d(this) == va0Var) {
                        return va0Var;
                    }
                    return sd5.a;
                } catch (Throwable th3) {
                    k33Var = k33Var2;
                    th = th3;
                    su0 su0Var = ue1.this.F;
                    sy4 sy4Var = m57.z;
                    ((ve1) k33Var.w).e();
                    h52Var = (h52) su0Var.a.a(sy4Var);
                    th2 = null;
                    if (h52Var != null) {
                        Throwable th4 = null;
                        for (qnHxL = (kotlinx.coroutines.internal.QnHx) h52Var.k(); !ur1.a(qnHxL, h52Var); qnHxL = qnHxL.l()) {
                            if (!(qnHxL instanceof su0.QnHx)) {
                                ((su0.QnHx) qnHxL).getClass();
                                throw null;
                            }
                        }
                        th2 = th4;
                    }
                    if (th2 == null) {
                        throw th;
                    }
                    throw th2;
                }
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k33Var = this.B;
            try {
                C0239D.H(obj);
                return sd5.a;
            } catch (Throwable th5) {
                th = th5;
                su0 su0Var2 = ue1.this.F;
                sy4 sy4Var2 = m57.z;
                ((ve1) k33Var.w).e();
                h52Var = (h52) su0Var2.a.a(sy4Var2);
                th2 = null;
                if (h52Var != null) {
                    Throwable th6 = null;
                    while (!ur1.a(qnHxL, h52Var)) {
                        if (!(qnHxL instanceof su0.QnHx)) {
                            try {
                                ((su0.QnHx) qnHxL).getClass();
                                throw null;
                            } catch (Throwable th7) {
                                if (th6 != null) {
                                    Th.a(th6, th7);
                                    sd5Var = sd5.a;
                                } else {
                                    sd5Var = null;
                                }
                                if (sd5Var == null) {
                                    th6 = th7;
                                }
                            }
                        }
                    }
                    th2 = th6;
                }
                if (th2 == null) {
                    throw th;
                }
                throw th2;
            }
        }

        @Override // defpackage.y81
        public final Object invoke(k33<rg1, ve1> k33Var, rg1 rg1Var, z80<? super sd5> z80Var) {
            LPt8Fixed lPt8 = ue1.this.new LPt8Fixed(z80Var);
            lPt8.B = k33Var;
            return lPt8.i(sd5.a);
        }
    }

    public static final class QnHx extends cx1 implements j81<Throwable, sd5> {
        public QnHx() {
            super(1);
        }

        @Override // defpackage.j81
        public final sd5 invoke(Throwable th) {
            if (th != null) {
                fp1.H(ue1.this.w, null);
            }
            return sd5.a;
        }
    }

    public ue1() {
        throw null;
    }

    public ue1(ze1 ze1Var, we1 we1Var) {
        this.w = ze1Var;
        this.closed = 0;
        os1 os1Var = new os1((ms1) ze1Var.g().j(ms1.CQf.w));
        this.y = os1Var;
        this.z = ze1Var.g().g0(os1Var);
        this.A = new pg1(we1Var.h);
        this.B = new ug1(we1Var.h);
        xg1 xg1Var = new xg1(we1Var.h);
        this.C = xg1Var;
        this.D = new bg1(we1Var.h);
        this.E = new c50();
        ze1Var.D();
        this.F = new su0();
        we1<hf1> we1Var2 = new we1<>();
        this.G = we1Var2;
        if (this.x) {
            os1Var.r0(new QnHx());
        }
        ze1Var.k0(this);
        xg1Var.f(xg1.j, new CQf(null));
        mg1.QnHx qnHx = mg1.a;
        xe1 xe1Var = xe1.w;
        we1Var2.a(qnHx, xe1Var);
        we1Var2.a(lc.a, xe1Var);
        if (we1Var.f) {
            we1Var2.c.put("DefaultTransformers", F1.w);
        }
        we1Var2.a(vg1.c, xe1Var);
        pe1.QnHx qnHx2 = pe1.d;
        we1Var2.a(qnHx2, xe1Var);
        if (we1Var.e) {
            we1Var2.a(cg1.c, xe1Var);
        }
        we1Var2.e = we1Var.e;
        we1Var2.f = we1Var.f;
        we1Var2.g = we1Var.g;
        we1Var2.a.putAll(we1Var.a);
        we1Var2.b.putAll(we1Var.b);
        we1Var2.c.putAll(we1Var.c);
        if (we1Var.f) {
            we1Var2.a(vf1.d, xe1Var);
        }
        Dt<sd5> dt = nh0.a;
        mh0 mh0Var = new mh0(we1Var2);
        Dt<Boolean> dt2 = te1.a;
        we1Var2.a(qnHx2, mh0Var);
        Iterator it = we1Var2.a.values().iterator();
        while (it.hasNext()) {
            ((j81) it.next()).invoke(this);
        }
        Iterator it2 = we1Var2.c.values().iterator();
        while (it2.hasNext()) {
            ((j81) it2.next()).invoke(this);
        }
        this.B.f(ug1.f, new LPt8Fixed(null));
        this.x = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (H.compareAndSet(this, 0, 1)) {
            Bpm bpm = (Bpm) this.E.e(lf1.a);
            Iterator<T> it = bpm.b().iterator();
            while (it.hasNext()) {
                Object objE = bpm.e((Dt) it.next());
                if (objE instanceof Closeable) {
                    ((Closeable) objE).close();
                }
            }
            this.y.h();
            if (this.x) {
                this.w.close();
            }
        }
    }

    @Override // defpackage.ua0
    public final la0 g() {
        return this.z;
    }

    public final String toString() {
        return "HttpClient[" + this.w + ']';
    }
}
