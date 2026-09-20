package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class ol0 extends c54 {
    public static final /* synthetic */ AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(ol0.class, "workerCounter");
    public final oa0 b;
    public final xw4 c;
    public final w80 d;
    private volatile /* synthetic */ long workerCounter;

    public static final class CQf extends cx1 implements j81<j81<? super z80<? super sd5>, ? extends Object>, Runnable> {
        public CQf() {
            super(1);
        }

        @Override // defpackage.j81
        public final Runnable invoke(j81<? super z80<? super sd5>, ? extends Object> j81Var) {
            return new ql0(ol0.this, j81Var);
        }
    }

    public static final class QnHx extends c54.F1 {
        public final NUlFixed A;
        public final long w;
        public final oa0 x;
        public final xw4 y;
        public final w80 z;

        /* JADX INFO: renamed from: ol0$QnHx$QnHx, reason: collision with other inner class name */
        public static final class C0178QnHx extends cx1 implements j81<j81<? super z80<? super sd5>, ? extends Object>, Runnable> {
            public C0178QnHx() {
                super(1);
            }

            @Override // defpackage.j81
            public final Runnable invoke(j81<? super z80<? super sd5>, ? extends Object> j81Var) {
                return new nl0(QnHx.this, j81Var);
            }
        }

        public QnHx(long j, oa0 oa0Var, xw4 xw4Var) {
            this.w = j;
            this.x = oa0Var;
            xw4 xw4Var2 = new xw4(xw4Var);
            this.y = xw4Var2;
            w80 w80VarJ = fp1.j(la0.QnHx.a(xw4Var2, oa0Var));
            this.z = w80VarJ;
            this.A = AY.a(Integer.MAX_VALUE, null, 6);
            fp1.k0(w80VarJ, null, 0, new ml0(this, null), 3);
        }

        @Override // defpackage.vl0
        public final void a() {
            this.A.a(null);
            this.y.m(null);
        }

        @Override // c54.F1
        public final vl0 d(Runnable runnable, long j, TimeUnit timeUnit) {
            return FNO9.b(this.z, runnable, timeUnit.toMillis(j), new C0178QnHx());
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return !fp1.e0(this.z);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.x);
            sb.append(" (worker ");
            sb.append(this.w);
            sb.append(", ");
            return bl2.c(sb, e() ? "disposed" : "active", ')');
        }
    }

    public ol0(gv0 gv0Var) {
        this.b = gv0Var;
        xw4 xw4VarD = ddf.d();
        this.c = xw4VarD;
        this.d = fp1.j(la0.QnHx.a(xw4VarD, gv0Var));
        this.workerCounter = 1L;
    }

    @Override // defpackage.c54
    public final c54.F1 a() {
        return new QnHx(e.getAndIncrement(this), this.b, this.c);
    }

    @Override // defpackage.c54
    public final vl0 c(Runnable runnable, long j, TimeUnit timeUnit) {
        return FNO9.b(this.d, runnable, timeUnit.toMillis(j), new CQf());
    }

    public final String toString() {
        return this.b.toString();
    }
}
