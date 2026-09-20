package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public interface oj extends fk, nk {

    public class w extends z75 {
        public static final long h;
        public static final long i;
        public static w j;
        public boolean e;
        public w f;
        public long g;

        public static final class CQf extends Thread {
            public CQf() {
                super("Okio Watchdog");
                setDaemon(true);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                w wVarA;
                while (true) {
                    try {
                        synchronized (w.class) {
                            w wVar = w.j;
                            wVarA = QnHx.a();
                            if (wVarA == w.j) {
                                w.j = null;
                                return;
                            }
                            sd5 sd5Var = sd5.a;
                        }
                        if (wVarA != null) {
                            wVarA.l();
                        }
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }

        public static final class QnHx {
            public static w a() throws InterruptedException {
                w wVar = w.j.f;
                if (wVar == null) {
                    long jNanoTime = System.nanoTime();
                    w.class.wait(w.h);
                    if (w.j.f != null || System.nanoTime() - jNanoTime < w.i) {
                        return null;
                    }
                    return w.j;
                }
                long jNanoTime2 = wVar.g - System.nanoTime();
                if (jNanoTime2 > 0) {
                    long j = jNanoTime2 / 1000000;
                    w.class.wait(j, (int) (jNanoTime2 - (1000000 * j)));
                    return null;
                }
                w.j.f = wVar.f;
                wVar.f = null;
                return wVar;
            }
        }

        static {
            long millis = TimeUnit.SECONDS.toMillis(60L);
            h = millis;
            i = TimeUnit.MILLISECONDS.toNanos(millis);
        }

        public final void i() {
            w wVar;
            long j2 = this.c;
            boolean z = this.a;
            if (j2 != 0 || z) {
                synchronized (w.class) {
                    if (!(!this.e)) {
                        throw new IllegalStateException("Unbalanced enter/exit".toString());
                    }
                    this.e = true;
                    if (j == null) {
                        j = new w();
                        new CQf().start();
                    }
                    long jNanoTime = System.nanoTime();
                    if (j2 != 0 && z) {
                        this.g = Math.min(j2, c() - jNanoTime) + jNanoTime;
                    } else if (j2 != 0) {
                        this.g = j2 + jNanoTime;
                    } else {
                        if (!z) {
                            throw new AssertionError();
                        }
                        this.g = c();
                    }
                    long j3 = this.g - jNanoTime;
                    w wVar2 = j;
                    while (true) {
                        wVar = wVar2.f;
                        if (wVar == null || j3 < wVar.g - jNanoTime) {
                            break;
                            break;
                        }
                        wVar2 = wVar;
                    }
                    this.f = wVar;
                    wVar2.f = this;
                    if (wVar2 == j) {
                        w.class.notify();
                    }
                    sd5 sd5Var = sd5.a;
                }
            }
        }

        public final boolean j() {
            synchronized (w.class) {
                if (!this.e) {
                    return false;
                }
                this.e = false;
                w wVar = j;
                while (wVar != null) {
                    w wVar2 = wVar.f;
                    if (wVar2 == this) {
                        wVar.f = this.f;
                        this.f = null;
                        return false;
                    }
                    wVar = wVar2;
                }
                return true;
            }
        }

        public IOException k(IOException iOException) {
            InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
            return interruptedIOException;
        }

        public void l() {
        }
    }

    void b(ms1 ms1Var);
}
