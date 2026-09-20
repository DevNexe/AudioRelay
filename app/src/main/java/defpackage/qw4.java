package defpackage;

import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public enum qw4 implements mw4 {
    CANCELLED;

    public static void c(AtomicReference atomicReference) {
        mw4 mw4Var;
        mw4 mw4Var2 = (mw4) atomicReference.get();
        qw4 qw4Var = CANCELLED;
        if (mw4Var2 == qw4Var || (mw4Var = (mw4) atomicReference.getAndSet(qw4Var)) == qw4Var || mw4Var == null) {
            return;
        }
        mw4Var.cancel();
    }

    public static void d(AtomicReference<mw4> atomicReference, AtomicLong atomicLong, long j) {
        mw4 mw4Var = atomicReference.get();
        if (mw4Var != null) {
            mw4Var.a(j);
            return;
        }
        if (l(j)) {
            ps0.h(atomicLong, j);
            mw4 mw4Var2 = atomicReference.get();
            if (mw4Var2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    mw4Var2.a(andSet);
                }
            }
        }
    }

    public static void e(AtomicReference atomicReference, AtomicLong atomicLong, mw4 mw4Var) {
        if (g(atomicReference, mw4Var)) {
            long andSet = atomicLong.getAndSet(0L);
            if (andSet != 0) {
                mw4Var.a(andSet);
            }
        }
    }

    public static boolean g(AtomicReference<mw4> atomicReference, mw4 mw4Var) {
        boolean z;
        if (mw4Var == null) {
            throw new NullPointerException("s is null");
        }
        while (true) {
            if (atomicReference.compareAndSet(null, mw4Var)) {
                z = true;
                break;
            }
            if (atomicReference.get() != null) {
                z = false;
                break;
            }
        }
        if (z) {
            return true;
        }
        mw4Var.cancel();
        if (atomicReference.get() != CANCELLED) {
            m14.b(new ProtocolViolationException("Subscription already set!"));
        }
        return false;
    }

    public static boolean l(long j) {
        if (j > 0) {
            return true;
        }
        m14.b(new IllegalArgumentException("n > 0 required but it was " + j));
        return false;
    }

    public static boolean m(mw4 mw4Var, mw4 mw4Var2) {
        if (mw4Var2 == null) {
            m14.b(new NullPointerException("next is null"));
            return false;
        }
        if (mw4Var == null) {
            return true;
        }
        mw4Var2.cancel();
        m14.b(new ProtocolViolationException("Subscription already set!"));
        return false;
    }

    @Override // defpackage.mw4
    public final void a(long j) {
    }

    @Override // defpackage.mw4
    public final void cancel() {
    }
}
