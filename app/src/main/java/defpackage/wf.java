package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class wf implements yg2 {
    public final h81<sd5> w;
    public Throwable y;
    public final Object x = new Object();
    public List<QnHx<?>> z = new ArrayList();
    public List<QnHx<?>> A = new ArrayList();

    public static final class CQf extends cx1 implements j81<Throwable, sd5> {
        public final /* synthetic */ jl3<QnHx<R>> x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(jl3<QnHx<R>> jl3Var) {
            super(1);
            this.x = jl3Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.j81
        public final sd5 invoke(Throwable th) {
            wf wfVar = wf.this;
            Object obj = wfVar.x;
            jl3<QnHx<R>> jl3Var = this.x;
            synchronized (obj) {
                List<QnHx<?>> list = wfVar.z;
                T t = jl3Var.w;
                if (t == 0) {
                    ur1.e("awaiter");
                    throw null;
                }
                list.remove((QnHx) t);
            }
            return sd5.a;
        }
    }

    public static final class QnHx<R> {
        public final j81<Long, R> a;
        public final z80<R> b;

        public QnHx(j81 j81Var, xm xmVar) {
            this.a = j81Var;
            this.b = xmVar;
        }
    }

    public wf(uk3.LPt8Fixed lPt8) {
        this.w = lPt8;
    }

    public final boolean a() {
        boolean z;
        synchronized (this.x) {
            z = !this.z.isEmpty();
        }
        return z;
    }

    public final void b(long j) {
        Object qnHx;
        synchronized (this.x) {
            List<QnHx<?>> list = this.z;
            this.z = this.A;
            this.A = list;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                QnHx<?> qnHx2 = list.get(i);
                qnHx2.getClass();
                try {
                    qnHx = qnHx2.a.invoke(Long.valueOf(j));
                } catch (Throwable th) {
                    qnHx = new fq3.QnHx(th);
                }
                qnHx2.b.x(qnHx);
            }
            list.clear();
            sd5 sd5Var = sd5.a;
        }
    }

    @Override // la0.CQf, defpackage.la0
    public final la0 e(la0.F1<?> f1) {
        return la0.CQf.QnHx.b(this, f1);
    }

    @Override // defpackage.la0
    public final la0 g0(la0 la0Var) {
        return la0.QnHx.a(this, la0Var);
    }

    @Override // la0.CQf
    public final la0.F1 getKey() {
        return yg2.QnHx.w;
    }

    @Override // la0.CQf, defpackage.la0
    public final <R> R i(R r, x81<? super R, ? super la0.CQf, ? extends R> x81Var) {
        return x81Var.invoke(r, this);
    }

    @Override // la0.CQf, defpackage.la0
    public final <E extends la0.CQf> E j(la0.F1<E> f1) {
        return (E) la0.CQf.QnHx.a(this, f1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, wf$QnHx] */
    @Override // defpackage.yg2
    public final <R> Object z(j81<? super Long, ? extends R> j81Var, z80<? super R> z80Var) {
        h81<sd5> h81Var;
        xm xmVar = new xm(1, ps0.L(z80Var));
        xmVar.r();
        jl3 jl3Var = new jl3();
        synchronized (this.x) {
            Throwable th = this.y;
            if (th != null) {
                xmVar.x(new fq3.QnHx(th));
            } else {
                jl3Var.w = new QnHx(j81Var, xmVar);
                boolean z = !this.z.isEmpty();
                List<QnHx<?>> list = this.z;
                T t = jl3Var.w;
                if (t == 0) {
                    ur1.e("awaiter");
                    throw null;
                }
                list.add((QnHx) t);
                boolean z2 = !z;
                xmVar.B(new CQf(jl3Var));
                if (z2 && (h81Var = this.w) != null) {
                    try {
                        h81Var.invoke();
                    } catch (Throwable th2) {
                        synchronized (this.x) {
                            if (this.y == null) {
                                this.y = th2;
                                List<QnHx<?>> list2 = this.z;
                                int size = list2.size();
                                for (int i = 0; i < size; i++) {
                                    list2.get(i).b.x(new fq3.QnHx(th2));
                                }
                                this.z.clear();
                                sd5 sd5Var = sd5.a;
                            }
                        }
                    }
                }
            }
        }
        return xmVar.p();
    }
}
