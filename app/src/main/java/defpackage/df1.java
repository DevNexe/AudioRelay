package defpackage;

import java.io.Closeable;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public abstract class df1 implements ze1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater y = AtomicIntegerFieldUpdater.newUpdater(df1.class, "closed");
    public final String w = "ktor-okhttp";
    private volatile /* synthetic */ int closed = 0;
    public final ry4 x = new ry4(new ef1(this));

    public static final class QnHx extends cx1 implements j81<Throwable, sd5> {
        public QnHx() {
            super(1);
        }

        @Override // defpackage.j81
        public final sd5 invoke(Throwable th) {
            la0.CQf cQf = (oa0) ((tt2) df1.this).A.getValue();
            try {
                if (cQf instanceof gv0) {
                    ((gv0) cQf).close();
                } else if (cQf instanceof Closeable) {
                    ((Closeable) cQf).close();
                }
            } catch (Throwable unused) {
            }
            return sd5.a;
        }
    }

    @Override // defpackage.ze1
    public Set<ff1<?>> G() {
        return hs0.w;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (y.compareAndSet(this, 0, 1)) {
            la0 la0VarG = g();
            int i = ms1.j;
            la0.CQf cQfJ = la0VarG.j(ms1.CQf.w);
            jx jxVar = cQfJ instanceof jx ? (jx) cQfJ : null;
            if (jxVar == null) {
                return;
            }
            jxVar.h();
            jxVar.r0(new QnHx());
        }
    }

    @Override // defpackage.ua0
    public la0 g() {
        return (la0) this.x.getValue();
    }

    @Override // defpackage.ze1
    public final void k0(ue1 ue1Var) {
        ue1Var.C.f(xg1.i, new cf1(ue1Var, this, null));
    }
}
