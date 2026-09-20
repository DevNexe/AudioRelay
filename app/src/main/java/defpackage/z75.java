package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class z75 {
    public static final QnHx d = new QnHx();
    public boolean a;
    public long b;
    public long c;

    public static final class QnHx extends z75 {
        @Override // defpackage.z75
        public final z75 d(long j) {
            return this;
        }

        @Override // defpackage.z75
        public final void f() {
        }

        @Override // defpackage.z75
        public final z75 g(long j, TimeUnit timeUnit) {
            return this;
        }
    }

    public z75 a() {
        this.a = false;
        return this;
    }

    public z75 b() {
        this.c = 0L;
        return this;
    }

    public long c() {
        if (this.a) {
            return this.b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public z75 d(long j) {
        this.a = true;
        this.b = j;
        return this;
    }

    public boolean e() {
        return this.a;
    }

    public void f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.a && this.b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public z75 g(long j, TimeUnit timeUnit) {
        if (!(j >= 0)) {
            throw new IllegalArgumentException(ur1.d(Long.valueOf(j), "timeout < 0: ").toString());
        }
        this.c = timeUnit.toNanos(j);
        return this;
    }

    public long h() {
        return this.c;
    }
}
