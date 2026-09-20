package defpackage;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class f02 implements yl3, e02.CQf, Runnable, Choreographer.FrameCallback {
    public static long G;
    public long B;
    public long C;
    public boolean D;
    public boolean F;
    public final e02 w;
    public final aw4 x;
    public final yz1 y;
    public final View z;
    public final ui2<QnHx> A = new ui2<>(new QnHx[16]);
    public final Choreographer E = Choreographer.getInstance();

    public static final class QnHx implements e02.QnHx {
        public final int w;
        public final long x;
        public aw4.QnHx y;
        public boolean z;

        public QnHx(int i, long j) {
            this.w = i;
            this.x = j;
        }

        @Override // e02.QnHx
        public final void cancel() {
            if (this.z) {
                return;
            }
            this.z = true;
            aw4.QnHx qnHx = this.y;
            if (qnHx != null) {
                qnHx.a();
            }
            this.y = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003b  */
    public f02(e02 e02Var, aw4 aw4Var, yz1 yz1Var, View view) {
        float refreshRate;
        this.w = e02Var;
        this.x = aw4Var;
        this.y = yz1Var;
        this.z = view;
        if (G == 0) {
            Display display = view.getDisplay();
            if (!view.isInEditMode() && display != null) {
                refreshRate = display.getRefreshRate();
                refreshRate = refreshRate < 30.0f ? 60.0f : refreshRate;
            }
            G = (long) (1000000000 / refreshRate);
        }
    }

    @Override // defpackage.yl3
    public final void a() {
    }

    @Override // e02.CQf
    public final QnHx b(int i, long j) {
        QnHx qnHx = new QnHx(i, j);
        this.A.b(qnHx);
        if (!this.D) {
            this.D = true;
            this.z.post(this);
        }
        return qnHx;
    }

    @Override // defpackage.yl3
    public final void c() {
        this.F = false;
        this.w.a.setValue(null);
        this.z.removeCallbacks(this);
        this.E.removeFrameCallback(this);
    }

    @Override // defpackage.yl3
    public final void d() {
        this.w.a.setValue(this);
        this.F = true;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.F) {
            this.z.post(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x010f  */
    @Override // java.lang.Runnable
    public final void run() {
        long j;
        ui2<QnHx> ui2Var = this.A;
        boolean z = false;
        if (!ui2Var.j() && this.D && this.F) {
            View view = this.z;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime()) + G;
                boolean z2 = false;
                while (ui2Var.k() && !z2) {
                    QnHx qnHx = ui2Var.w[z ? 1 : 0];
                    yz1 yz1Var = this.y;
                    zz1 zz1VarInvoke = yz1Var.b.invoke();
                    if (qnHx.z) {
                        j = nanos;
                        ui2Var.n(z ? 1 : 0);
                    } else {
                        int iG = zz1VarInvoke.g();
                        int i = qnHx.w;
                        if (!(i >= 0 && i < iG)) {
                            j = nanos;
                            ui2Var.n(z ? 1 : 0);
                        } else if (qnHx.y == null) {
                            Trace.beginSection("compose:lazylist:prefetch:compose");
                            try {
                                long jNanoTime = System.nanoTime();
                                if (jNanoTime > nanos || jNanoTime + this.B < nanos) {
                                    Object objA = zz1VarInvoke.a(i);
                                    qnHx.y = this.x.b(objA, yz1Var.a(i, objA));
                                    long jNanoTime2 = System.nanoTime() - jNanoTime;
                                    long j2 = this.B;
                                    if (j2 != 0) {
                                        long j3 = 4;
                                        jNanoTime2 = (jNanoTime2 / j3) + ((j2 / j3) * ((long) 3));
                                    }
                                    this.B = jNanoTime2;
                                } else {
                                    z2 = true;
                                }
                                sd5 sd5Var = sd5.a;
                                Trace.endSection();
                                j = nanos;
                            } catch (Throwable th) {
                                Trace.endSection();
                                throw th;
                            }
                        } else {
                            Trace.beginSection("compose:lazylist:prefetch:measure");
                            try {
                                long jNanoTime3 = System.nanoTime();
                                if (jNanoTime3 > nanos || this.C + jNanoTime3 < nanos) {
                                    aw4.QnHx qnHx2 = qnHx.y;
                                    int iB = qnHx2.b();
                                    int i2 = 0;
                                    while (i2 < iB) {
                                        qnHx2.c(i2, qnHx.x);
                                        i2++;
                                        nanos = nanos;
                                    }
                                    j = nanos;
                                    long jNanoTime4 = System.nanoTime() - jNanoTime3;
                                    long j4 = this.C;
                                    if (j4 != 0) {
                                        long j5 = 4;
                                        jNanoTime4 = (jNanoTime4 / j5) + ((j4 / j5) * ((long) 3));
                                    }
                                    this.C = jNanoTime4;
                                    ui2Var.n(0);
                                } else {
                                    j = nanos;
                                    sd5 sd5Var2 = sd5.a;
                                    z2 = true;
                                }
                                Trace.endSection();
                                z = false;
                            } catch (Throwable th2) {
                                Trace.endSection();
                                throw th2;
                            }
                        }
                    }
                    nanos = j;
                }
                if (z2) {
                    this.E.postFrameCallback(this);
                    return;
                } else {
                    this.D = z;
                    return;
                }
            }
        }
        this.D = false;
    }
}
