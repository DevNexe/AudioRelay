package defpackage;

import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public class nw4 extends AtomicInteger implements mw4 {
    public volatile boolean C;
    public boolean D;
    public mw4 w;
    public long x;
    public final boolean B = false;
    public final AtomicReference<mw4> y = new AtomicReference<>();
    public final AtomicLong z = new AtomicLong();
    public final AtomicLong A = new AtomicLong();

    @Override // defpackage.mw4
    public final void a(long j) {
        if (!qw4.l(j) || this.D) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            ps0.h(this.z, j);
            c();
            return;
        }
        long j2 = this.x;
        if (j2 != Long.MAX_VALUE) {
            long jI = ps0.i(j2, j);
            this.x = jI;
            if (jI == Long.MAX_VALUE) {
                this.D = true;
            }
        }
        mw4 mw4Var = this.w;
        if (decrementAndGet() != 0) {
            e();
        }
        if (mw4Var != null) {
            mw4Var.a(j);
        }
    }

    final void c() {
        if (getAndIncrement() != 0) {
            return;
        }
        e();
    }

    @Override // defpackage.mw4
    public void cancel() {
        if (this.C) {
            return;
        }
        this.C = true;
        c();
    }

    final void e() {
        int iAddAndGet = 1;
        mw4 mw4Var = null;
        long jI = 0;
        mw4 mw4Var2 = null;
        while (true) {
            mw4 andSet = this.y.get();
            if (andSet != null) {
                andSet = this.y.getAndSet(mw4Var);
            }
            long andSet2 = this.z.get();
            if (andSet2 != 0) {
                andSet2 = this.z.getAndSet(0L);
            }
            long andSet3 = this.A.get();
            if (andSet3 != 0) {
                andSet3 = this.A.getAndSet(0L);
            }
            mw4 mw4Var3 = this.w;
            if (this.C) {
                if (mw4Var3 != null) {
                    mw4Var3.cancel();
                    this.w = mw4Var;
                }
                if (andSet != null) {
                    andSet.cancel();
                }
            } else {
                long jI2 = this.x;
                if (jI2 != Long.MAX_VALUE) {
                    jI2 = ps0.i(jI2, andSet2);
                    if (jI2 != Long.MAX_VALUE) {
                        jI2 -= andSet3;
                        if (jI2 < 0) {
                            m14.b(new ProtocolViolationException("More produced than requested: " + jI2));
                            jI2 = 0L;
                        }
                    }
                    this.x = jI2;
                }
                if (andSet != null) {
                    if (mw4Var3 != null && this.B) {
                        mw4Var3.cancel();
                    }
                    this.w = andSet;
                    if (jI2 != 0) {
                        jI = ps0.i(jI, jI2);
                        mw4Var2 = andSet;
                    }
                } else if (mw4Var3 != null && andSet2 != 0) {
                    jI = ps0.i(jI, andSet2);
                    mw4Var2 = mw4Var3;
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                break;
            } else {
                mw4Var = null;
            }
        }
        if (jI != 0) {
            mw4Var2.a(jI);
        }
    }

    public final void f(long j) {
        if (this.D) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            ps0.h(this.A, j);
            c();
            return;
        }
        long j2 = this.x;
        if (j2 != Long.MAX_VALUE) {
            long j3 = j2 - j;
            if (j3 < 0) {
                m14.b(new ProtocolViolationException("More produced than requested: " + j3));
                j3 = 0L;
            }
            this.x = j3;
        }
        if (decrementAndGet() == 0) {
            return;
        }
        e();
    }

    public final void h(mw4 mw4Var) {
        if (this.C) {
            mw4Var.cancel();
            return;
        }
        if (mw4Var == null) {
            throw new NullPointerException("s is null");
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            mw4 andSet = this.y.getAndSet(mw4Var);
            if (andSet != null && this.B) {
                andSet.cancel();
            }
            c();
            return;
        }
        mw4 mw4Var2 = this.w;
        if (mw4Var2 != null && this.B) {
            mw4Var2.cancel();
        }
        this.w = mw4Var;
        long j = this.x;
        if (decrementAndGet() != 0) {
            e();
        }
        if (j != 0) {
            mw4Var.a(j);
        }
    }
}
