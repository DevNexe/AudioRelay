package com.google.android.gms.internal.ads;

import defpackage.fq6;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzfxf<V> extends zzfzq implements zzfyx<V> {
    public static final Logger A;
    public static final RBi B;
    public static final Object C;
    public static final boolean z;

    @CheckForNull
    public volatile Object w;

    @CheckForNull
    public volatile Xn1 x;

    @CheckForNull
    public volatile WE y;

    static {
        boolean z2;
        Throwable th;
        Throwable th2;
        RBi lpt3;
        try {
            z2 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z2 = false;
        }
        z = z2;
        A = Logger.getLogger(zzfxf.class.getName());
        try {
            lpt3 = new Aa();
            th2 = null;
            th = null;
        } catch (Error | RuntimeException e) {
            try {
                th = null;
                th2 = e;
                lpt3 = new ta(AtomicReferenceFieldUpdater.newUpdater(WE.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(WE.class, WE.class, "b"), AtomicReferenceFieldUpdater.newUpdater(zzfxf.class, WE.class, "y"), AtomicReferenceFieldUpdater.newUpdater(zzfxf.class, Xn1.class, "x"), AtomicReferenceFieldUpdater.newUpdater(zzfxf.class, Object.class, "w"));
            } catch (Error | RuntimeException e2) {
                th = e2;
                th2 = e;
                lpt3 = new lPt3Fixed();
            }
        }
        B = lpt3;
        if (th != null) {
            Logger logger = A;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        C = new Object();
    }

    public static final Object c(Object obj) throws ExecutionException {
        if (obj instanceof MZ) {
            Throwable th = ((MZ) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof LPt6Fixed) {
            throw new ExecutionException(((LPt6Fixed) obj).a);
        }
        if (obj == C) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object f(zzfyx zzfyxVar) {
        Throwable thA;
        if (zzfyxVar instanceof ck32) {
            Object mz = ((zzfxf) zzfyxVar).w;
            if (mz instanceof MZ) {
                MZ mz2 = (MZ) mz;
                if (mz2.a) {
                    Throwable th = mz2.b;
                    mz = th != null ? new MZ(th, false) : MZ.d;
                }
            }
            mz.getClass();
            return mz;
        }
        if ((zzfyxVar instanceof zzfzq) && (thA = ((zzfzq) zzfyxVar).a()) != null) {
            return new LPt6Fixed(thA);
        }
        boolean zIsCancelled = zzfyxVar.isCancelled();
        if ((!z) && zIsCancelled) {
            MZ mz3 = MZ.d;
            mz3.getClass();
            return mz3;
        }
        try {
            Object objG = g(zzfyxVar);
            if (!zIsCancelled) {
                return objG == null ? C : objG;
            }
            return new MZ(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + zzfyxVar), false);
        } catch (Error e) {
            e = e;
            return new LPt6Fixed(e);
        } catch (CancellationException e2) {
            if (zIsCancelled) {
                return new MZ(e2, false);
            }
            zzfyxVar.toString();
            return new LPt6Fixed(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(zzfyxVar)), e2));
        } catch (RuntimeException e3) {
            e = e3;
            return new LPt6Fixed(e);
        } catch (ExecutionException e4) {
            if (!zIsCancelled) {
                return new LPt6Fixed(e4.getCause());
            }
            zzfyxVar.toString();
            return new MZ(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(zzfyxVar)), e4), false);
        }
    }

    public static Object g(Future future) {
        Object obj;
        boolean z2 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static void l(zzfxf zzfxfVar) {
        Xn1 xn1 = null;
        while (true) {
            for (WE weB = B.b(zzfxfVar); weB != null; weB = weB.b) {
                Thread thread = weB.a;
                if (thread != null) {
                    weB.a = null;
                    LockSupport.unpark(thread);
                }
            }
            zzfxfVar.e();
            Xn1 xn2 = xn1;
            Xn1 xn1A = B.a(zzfxfVar, Xn1.d);
            Xn1 xn3 = xn2;
            while (xn1A != null) {
                Xn1 xn4 = xn1A.c;
                xn1A.c = xn3;
                xn3 = xn1A;
                xn1A = xn4;
            }
            while (xn3 != null) {
                xn1 = xn3.c;
                Runnable runnable = xn3.a;
                runnable.getClass();
                if (runnable instanceof LPt9Fixed) {
                    LPt9Fixed lPt9 = (LPt9Fixed) runnable;
                    zzfxfVar = lPt9.w;
                    if (zzfxfVar.w == lPt9) {
                        if (B.f(zzfxfVar, lPt9, f(lPt9.x))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = xn3.b;
                    executor.getClass();
                    m(runnable, executor);
                }
                xn3 = xn1;
            }
            return;
        }
    }

    public static void m(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            A.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfzq
    @CheckForNull
    public final Throwable a() {
        if (!(this instanceof ck32)) {
            return null;
        }
        Object obj = this.w;
        if (obj instanceof LPt6Fixed) {
            return ((LPt6Fixed) obj).a;
        }
        return null;
    }

    public final void b(WE we) {
        we.a = null;
        while (true) {
            WE we2 = this.y;
            if (we2 != WE.c) {
                WE we3 = null;
                while (we2 != null) {
                    WE we4 = we2.b;
                    if (we2.a != null) {
                        we3 = we2;
                    } else if (we3 != null) {
                        we3.b = we4;
                        if (we3.a == null) {
                        }
                    } else if (!B.g(this, we2, we4)) {
                    }
                    we2 = we4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z2) {
        MZ mz;
        Object obj = this.w;
        if (!(obj == null) && !(obj instanceof LPt9Fixed)) {
            return false;
        }
        if (z) {
            mz = new MZ(new CancellationException("Future.cancel() was called."), z2);
        } else {
            mz = z2 ? MZ.c : MZ.d;
            mz.getClass();
        }
        boolean z3 = false;
        zzfxf<V> zzfxfVar = this;
        while (true) {
            if (B.f(zzfxfVar, obj, mz)) {
                if (z2) {
                    zzfxfVar.h();
                }
                l(zzfxfVar);
                if (obj instanceof LPt9Fixed) {
                    zzfyx<? extends V> zzfyxVar = ((LPt9Fixed) obj).x;
                    if (zzfyxVar instanceof ck32) {
                        zzfxfVar = (zzfxf) zzfyxVar;
                        obj = zzfxfVar.w;
                        if ((obj == null) | (obj instanceof LPt9Fixed)) {
                            z3 = true;
                        }
                    } else {
                        zzfyxVar.cancel(z2);
                    }
                }
                return true;
            }
            obj = zzfxfVar.w;
            if (!(obj instanceof LPt9Fixed)) {
                return z3;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckForNull
    public String d() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public void e() {
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.w;
        if ((obj2 != null) && (!(obj2 instanceof LPt9Fixed))) {
            return c(obj2);
        }
        WE we = this.y;
        WE we2 = WE.c;
        if (we != we2) {
            WE we3 = new WE();
            do {
                RBi rBi = B;
                rBi.c(we3, we);
                if (rBi.g(this, we, we3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            b(we3);
                            throw new InterruptedException();
                        }
                        obj = this.w;
                    } while (!((obj != null) & (!(obj instanceof LPt9Fixed))));
                    return c(obj);
                }
                we = this.y;
            } while (we != we2);
        }
        Object obj3 = this.w;
        obj3.getClass();
        return c(obj3);
    }

    public void h() {
    }

    public final void i(@CheckForNull zzfyx zzfyxVar) {
        if ((zzfyxVar != null) && isCancelled()) {
            Object obj = this.w;
            zzfyxVar.cancel((obj instanceof MZ) && ((MZ) obj).a);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.w instanceof MZ;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.w;
        return (!(obj instanceof LPt9Fixed)) & (obj != null);
    }

    public final void j(zzfyx zzfyxVar) {
        LPt6Fixed lPt6;
        zzfyxVar.getClass();
        Object obj = this.w;
        if (obj == null) {
            if (zzfyxVar.isDone()) {
                if (B.f(this, null, f(zzfyxVar))) {
                    l(this);
                    return;
                }
                return;
            }
            LPt9Fixed lPt9 = new LPt9Fixed(this, zzfyxVar);
            if (B.f(this, null, lPt9)) {
                try {
                    zzfyxVar.zzc(lPt9, fq6.INSTANCE);
                    return;
                } catch (Error | RuntimeException e) {
                    try {
                        lPt6 = new LPt6Fixed(e);
                    } catch (Error | RuntimeException unused) {
                        lPt6 = LPt6Fixed.b;
                    }
                    B.f(this, lPt9, lPt6);
                    return;
                }
            }
            obj = this.w;
        }
        if (obj instanceof MZ) {
            zzfyxVar.cancel(((MZ) obj).a);
        }
    }

    public final void k(StringBuilder sb) {
        try {
            Object objG = g(this);
            sb.append("SUCCESS, result=[");
            if (objG == null) {
                sb.append("null");
            } else if (objG == this) {
                sb.append("this future");
            } else {
                sb.append(objG.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(objG)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    public String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            k(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.w;
            if (obj instanceof LPt9Fixed) {
                sb.append(", setFuture=[");
                zzfyx<? extends V> zzfyxVar = ((LPt9Fixed) obj).x;
                try {
                    if (zzfyxVar == this) {
                        sb.append("this future");
                    } else {
                        sb.append(zzfyxVar);
                    }
                } catch (RuntimeException | StackOverflowError e) {
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                }
                sb.append("]");
            } else {
                try {
                    strConcat = zzfsu.zza(d());
                } catch (RuntimeException | StackOverflowError e2) {
                    Class<?> cls = e2.getClass();
                    cls.toString();
                    strConcat = "Exception thrown from implementation: ".concat(String.valueOf(cls));
                }
                if (strConcat != null) {
                    sb.append(", info=[");
                    sb.append(strConcat);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                k(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfyx
    public void zzc(Runnable runnable, Executor executor) {
        Xn1 xn1;
        zzfsf.zzc(runnable, "Runnable was null.");
        zzfsf.zzc(executor, "Executor was null.");
        if (!isDone() && (xn1 = this.x) != Xn1.d) {
            Xn1 xn2 = new Xn1(runnable, executor);
            do {
                xn2.c = xn1;
                if (B.e(this, xn1, xn2)) {
                    return;
                } else {
                    xn1 = this.x;
                }
            } while (xn1 != Xn1.d);
        }
        m(runnable, executor);
    }

    public boolean zzd(Object obj) {
        if (obj == null) {
            obj = C;
        }
        if (!B.f(this, null, obj)) {
            return false;
        }
        l(this);
        return true;
    }

    public boolean zze(Throwable th) {
        th.getClass();
        if (!B.f(this, null, new LPt6Fixed(th))) {
            return false;
        }
        l(this);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b9 A[EDGE_INSN: B:55:0x00b9->B:56:0x00bf BREAK  A[LOOP:0: B:21:0x0041->B:85:?]] */
    /* JADX WARN: Code duplicated, block: B:59:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:63:0x010c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0114  */
    /* JADX WARN: Code duplicated, block: B:70:0x012b  */
    /* JADX WARN: Code duplicated, block: B:73:0x0137  */
    /* JADX WARN: Code duplicated, block: B:77:0x0157  */
    /* JADX WARN: Code duplicated, block: B:79:0x0163  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00b9 -> B:56:0x00bf). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // java.util.concurrent.Future
    public java.lang.Object get(long r19, java.util.concurrent.TimeUnit r21) {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfxf.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }
}
