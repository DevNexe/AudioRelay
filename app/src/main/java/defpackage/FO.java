package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class FO extends oa0 {
    public static final ry4 I = new ry4(QnHx.w);
    public static final CQf J = new CQf();
    public boolean E;
    public boolean F;
    public final hiFV H;
    public final Choreographer y;
    public final Handler z;
    public final Object A = new Object();
    public final syh<Runnable> B = new syh<>();
    public List<Choreographer.FrameCallback> C = new ArrayList();
    public List<Choreographer.FrameCallback> D = new ArrayList();
    public final F1 G = new F1();

    public static final class CQf extends ThreadLocal<la0> {
        @Override // java.lang.ThreadLocal
        public final la0 initialValue() {
            Choreographer choreographer = Choreographer.getInstance();
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                throw new IllegalStateException("no Looper on this thread".toString());
            }
            FO fo = new FO(choreographer, ib1.a(looperMyLooper));
            return la0.QnHx.a(fo, fo.H);
        }
    }

    public static final class F1 implements Choreographer.FrameCallback, Runnable {
        public F1() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            FO.this.z.removeCallbacks(this);
            FO.I(FO.this);
            FO fo = FO.this;
            synchronized (fo.A) {
                if (fo.F) {
                    fo.F = false;
                    List<Choreographer.FrameCallback> list = fo.C;
                    fo.C = fo.D;
                    fo.D = list;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        list.get(i).doFrame(j);
                    }
                    list.clear();
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            FO.I(FO.this);
            FO fo = FO.this;
            synchronized (fo.A) {
                if (fo.C.isEmpty()) {
                    fo.y.removeFrameCallback(this);
                    fo.F = false;
                }
                sd5 sd5Var = sd5.a;
            }
        }
    }

    public static final class QnHx extends cx1 implements h81<la0> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(0);
        }

        @Override // defpackage.h81
        public final la0 invoke() {
            Choreographer choreographer;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                choreographer = Choreographer.getInstance();
            } else {
                qh0 qh0Var = rl0.a;
                choreographer = (Choreographer) fp1.s0(n72.a, new LcA(null));
            }
            FO fo = new FO(choreographer, ib1.a(Looper.getMainLooper()));
            return la0.QnHx.a(fo, fo.H);
        }
    }

    public FO(Choreographer choreographer, Handler handler) {
        this.y = choreographer;
        this.z = handler;
        this.H = new hiFV(choreographer);
    }

    public static final void I(FO fo) {
        Runnable runnableRemoveFirst;
        boolean z;
        do {
            synchronized (fo.A) {
                syh<Runnable> syhVar = fo.B;
                runnableRemoveFirst = syhVar.isEmpty() ? null : syhVar.removeFirst();
            }
            while (runnableRemoveFirst != null) {
                runnableRemoveFirst.run();
                synchronized (fo.A) {
                    syh<Runnable> syhVar2 = fo.B;
                    runnableRemoveFirst = syhVar2.isEmpty() ? null : syhVar2.removeFirst();
                }
            }
            synchronized (fo.A) {
                if (fo.B.isEmpty()) {
                    z = false;
                    fo.E = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    @Override // defpackage.oa0
    public final void g(la0 la0Var, Runnable runnable) {
        synchronized (this.A) {
            this.B.addLast(runnable);
            if (!this.E) {
                this.E = true;
                this.z.post(this.G);
                if (!this.F) {
                    this.F = true;
                    this.y.postFrameCallback(this.G);
                }
            }
            sd5 sd5Var = sd5.a;
        }
    }
}
