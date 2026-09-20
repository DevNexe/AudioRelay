package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class Xn1<V> implements j42<V> {
    public static final QnHx B;
    public static final Object C;
    public volatile Object w;
    public volatile LPt8Fixed x;
    public volatile T23 y;
    public static final boolean z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger A = Logger.getLogger(Xn1.class.getName());

    public static final class CQf {
        public static final CQf c;
        public static final CQf d;
        public final boolean a;
        public final Throwable b;

        static {
            if (Xn1.z) {
                d = null;
                c = null;
            } else {
                d = new CQf(null, false);
                c = new CQf(null, true);
            }
        }

        public CQf(Throwable th, boolean z) {
            this.a = z;
            this.b = th;
        }
    }

    public static final class F1 {
        public static final F1 b = new F1(new QnHx());
        public final Throwable a;

        public class QnHx extends Throwable {
            public QnHx() {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public F1(Throwable th) {
            boolean z = Xn1.z;
            th.getClass();
            this.a = th;
        }
    }

    public static final class LPt8Fixed {
        public static final LPt8Fixed d = new LPt8Fixed(null, null);
        public final Runnable a;
        public final Executor b;
        public LPt8Fixed c;

        public LPt8Fixed(Runnable runnable, Executor executor) {
            this.a = runnable;
            this.b = executor;
        }
    }

    public static final class NUlFixed extends QnHx {
        public final AtomicReferenceFieldUpdater<T23, Thread> a;
        public final AtomicReferenceFieldUpdater<T23, T23> b;
        public final AtomicReferenceFieldUpdater<Xn1, T23> c;
        public final AtomicReferenceFieldUpdater<Xn1, LPt8Fixed> d;
        public final AtomicReferenceFieldUpdater<Xn1, Object> e;

        public NUlFixed(AtomicReferenceFieldUpdater<T23, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<T23, T23> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<Xn1, T23> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<Xn1, LPt8Fixed> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<Xn1, Object> atomicReferenceFieldUpdater5) {
            this.a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        @Override // Xn1.QnHx
        public final boolean a(Xn1<?> xn1, LPt8Fixed lPt8, LPt8Fixed lPt9) {
            AtomicReferenceFieldUpdater<Xn1, LPt8Fixed> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.d;
                if (atomicReferenceFieldUpdater.compareAndSet(xn1, lPt8, lPt9)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(xn1) == lPt8);
            return false;
        }

        @Override // Xn1.QnHx
        public final boolean b(Xn1<?> xn1, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<Xn1, Object> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.e;
                if (atomicReferenceFieldUpdater.compareAndSet(xn1, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(xn1) == obj);
            return false;
        }

        @Override // Xn1.QnHx
        public final boolean c(Xn1<?> xn1, T23 t23, T23 t24) {
            AtomicReferenceFieldUpdater<Xn1, T23> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.c;
                if (atomicReferenceFieldUpdater.compareAndSet(xn1, t23, t24)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(xn1) == t23);
            return false;
        }

        @Override // Xn1.QnHx
        public final void d(T23 t23, T23 t24) {
            this.b.lazySet(t23, t24);
        }

        @Override // Xn1.QnHx
        public final void e(T23 t23, Thread thread) {
            this.a.lazySet(t23, thread);
        }
    }

    public static abstract class QnHx {
        public abstract boolean a(Xn1<?> xn1, LPt8Fixed lPt8, LPt8Fixed lPt9);

        public abstract boolean b(Xn1<?> xn1, Object obj, Object obj2);

        public abstract boolean c(Xn1<?> xn1, T23 t23, T23 t24);

        public abstract void d(T23 t23, T23 t24);

        public abstract void e(T23 t23, Thread thread);
    }

    public static final class T23 {
        public static final T23 c = new T23(0);
        public volatile Thread a;
        public volatile T23 b;

        public T23(int i) {
        }

        public T23() {
            Xn1.B.e(this, Thread.currentThread());
        }
    }

    public static final class YKK<V> implements Runnable {
        public final Xn1<V> w;
        public final j42<? extends V> x;

        public YKK(Xn1<V> xn1, j42<? extends V> j42Var) {
            this.w = xn1;
            this.x = j42Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.w.w != this) {
                return;
            }
            if (Xn1.B.b(this.w, this, Xn1.f(this.x))) {
                Xn1.c(this.w);
            }
        }
    }

    public static final class auxFixed extends QnHx {
        @Override // Xn1.QnHx
        public final boolean a(Xn1<?> xn1, LPt8Fixed lPt8, LPt8Fixed lPt9) {
            synchronized (xn1) {
                if (xn1.x != lPt8) {
                    return false;
                }
                xn1.x = lPt9;
                return true;
            }
        }

        @Override // Xn1.QnHx
        public final boolean b(Xn1<?> xn1, Object obj, Object obj2) {
            synchronized (xn1) {
                if (xn1.w != obj) {
                    return false;
                }
                xn1.w = obj2;
                return true;
            }
        }

        @Override // Xn1.QnHx
        public final boolean c(Xn1<?> xn1, T23 t23, T23 t24) {
            synchronized (xn1) {
                if (xn1.y != t23) {
                    return false;
                }
                xn1.y = t24;
                return true;
            }
        }

        @Override // Xn1.QnHx
        public final void d(T23 t23, T23 t24) {
            t23.b = t24;
        }

        @Override // Xn1.QnHx
        public final void e(T23 t23, Thread thread) {
            t23.a = thread;
        }
    }

    static {
        QnHx auxVar;
        try {
            auxVar = new NUlFixed(AtomicReferenceFieldUpdater.newUpdater(T23.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(T23.class, T23.class, "b"), AtomicReferenceFieldUpdater.newUpdater(Xn1.class, T23.class, "y"), AtomicReferenceFieldUpdater.newUpdater(Xn1.class, LPt8Fixed.class, "x"), AtomicReferenceFieldUpdater.newUpdater(Xn1.class, Object.class, "w"));
            th = null;
        } catch (Throwable th) {
            th = th;
            auxVar = new auxFixed();
        }
        B = auxVar;
        if (th != null) {
            A.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        C = new Object();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void c(Xn1<?> xn1) {
        LPt8Fixed lPt8;
        LPt8Fixed lPt9;
        LPt8Fixed lPt10 = null;
        while (true) {
            T23 t23 = xn1.y;
            if (B.c(xn1, t23, T23.c)) {
                while (t23 != null) {
                    Thread thread = t23.a;
                    if (thread != null) {
                        t23.a = null;
                        LockSupport.unpark(thread);
                    }
                    t23 = t23.b;
                }
                do {
                    lPt8 = xn1.x;
                } while (!B.a(xn1, lPt8, LPt8Fixed.d));
                while (true) {
                    lPt9 = lPt10;
                    lPt10 = lPt8;
                    if (lPt10 == null) {
                        break;
                    }
                    lPt8 = lPt10.c;
                    lPt10.c = lPt9;
                }
                while (lPt9 != null) {
                    lPt10 = lPt9.c;
                    Runnable runnable = lPt9.a;
                    if (runnable instanceof YKK) {
                        YKK ykk = (YKK) runnable;
                        xn1 = ykk.w;
                        if (xn1.w == ykk) {
                            if (B.b(xn1, ykk, f(ykk.x))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        d(runnable, lPt9.b);
                    }
                    lPt9 = lPt10;
                }
                return;
            }
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            A.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static Object e(Object obj) throws ExecutionException {
        if (obj instanceof CQf) {
            Throwable th = ((CQf) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof F1) {
            throw new ExecutionException(((F1) obj).a);
        }
        if (obj == C) {
            return null;
        }
        return obj;
    }

    public static Object f(j42<?> j42Var) {
        Object obj;
        if (j42Var instanceof Xn1) {
            Object obj2 = ((Xn1) j42Var).w;
            if (!(obj2 instanceof CQf)) {
                return obj2;
            }
            CQf cQf = (CQf) obj2;
            if (cQf.a) {
                return cQf.b != null ? new CQf(cQf.b, false) : CQf.d;
            }
            return obj2;
        }
        boolean z2 = ((Xn1) j42Var).w instanceof CQf;
        if ((!z) && z2) {
            return CQf.d;
        }
        boolean z3 = false;
        while (true) {
            try {
                try {
                    obj = ((Xn1) j42Var).get();
                    break;
                } catch (CancellationException e) {
                    if (z2) {
                        return new CQf(e, false);
                    }
                    return new F1(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + j42Var, e));
                } catch (ExecutionException e2) {
                    return new F1(e2.getCause());
                } catch (Throwable th) {
                    return new F1(th);
                }
            } catch (InterruptedException unused) {
                z3 = true;
            } catch (Throwable th2) {
                if (z3) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
        return obj == null ? C : obj;
    }

    public final void a(StringBuilder sb) {
        V v;
        boolean z2 = false;
        while (true) {
            try {
                try {
                    v = get();
                    break;
                } catch (CancellationException unused) {
                    sb.append("CANCELLED");
                    return;
                } catch (RuntimeException e) {
                    sb.append("UNKNOWN, cause=[");
                    sb.append(e.getClass());
                    sb.append(" thrown from get()]");
                    return;
                } catch (ExecutionException e2) {
                    sb.append("FAILURE, cause=[");
                    sb.append(e2.getCause());
                    sb.append("]");
                    return;
                }
            } catch (InterruptedException unused2) {
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
        sb.append("SUCCESS, result=[");
        sb.append(v == this ? "this future" : String.valueOf(v));
        sb.append("]");
    }

    public final void b(Runnable runnable, Executor executor) {
        executor.getClass();
        LPt8Fixed lPt8 = this.x;
        LPt8Fixed lPt9 = LPt8Fixed.d;
        if (lPt8 != lPt9) {
            LPt8Fixed lPt10 = new LPt8Fixed(runnable, executor);
            do {
                lPt10.c = lPt8;
                if (B.a(this, lPt8, lPt10)) {
                    return;
                } else {
                    lPt8 = this.x;
                }
            } while (lPt8 != lPt9);
        }
        d(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        CQf cQf;
        Object obj = this.w;
        if (!(obj == null) && !(obj instanceof YKK)) {
            return false;
        }
        if (z) {
            cQf = new CQf(new CancellationException("Future.cancel() was called."), z2);
        } else {
            cQf = z2 ? CQf.c : CQf.d;
        }
        boolean z3 = false;
        Xn1<V> xn1 = this;
        while (true) {
            if (B.b(xn1, obj, cQf)) {
                c(xn1);
                if (!(obj instanceof YKK)) {
                    break;
                }
                j42<? extends V> j42Var = ((YKK) obj).x;
                if (!(j42Var instanceof Xn1)) {
                    ((Xn1) j42Var).cancel(z2);
                    break;
                }
                xn1 = (Xn1) j42Var;
                obj = xn1.w;
                if (!(obj == null) && !(obj instanceof YKK)) {
                    break;
                }
                z3 = true;
            } else {
                obj = xn1.w;
                if (!(obj instanceof YKK)) {
                    return z3;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String g() {
        Object obj = this.w;
        if (obj instanceof YKK) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            j42<? extends V> j42Var = ((YKK) obj).x;
            return i5.b(sb, j42Var == this ? "this future" : String.valueOf(j42Var), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0095  */
    /* JADX WARN: Code duplicated, block: B:47:0x0099  */
    /* JADX WARN: Code duplicated, block: B:48:0x009b  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ad A[EDGE_INSN: B:55:0x00ad->B:56:0x00b3 BREAK  A[LOOP:0: B:21:0x0041->B:86:?]] */
    /* JADX WARN: Code duplicated, block: B:59:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:63:0x0101  */
    /* JADX WARN: Code duplicated, block: B:67:0x0108  */
    /* JADX WARN: Code duplicated, block: B:69:0x010b  */
    /* JADX WARN: Code duplicated, block: B:71:0x0122  */
    /* JADX WARN: Code duplicated, block: B:74:0x012e  */
    /* JADX WARN: Code duplicated, block: B:78:0x014e  */
    /* JADX WARN: Code duplicated, block: B:80:0x015a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00ad -> B:56:0x00b3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // java.util.concurrent.Future
    public final V get(long r18, java.util.concurrent.TimeUnit r20) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Xn1.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public final void h(T23 t23) {
        t23.a = null;
        while (true) {
            T23 t24 = this.y;
            if (t24 == T23.c) {
                return;
            }
            T23 t25 = null;
            while (t24 != null) {
                T23 t26 = t24.b;
                if (t24.a != null) {
                    t25 = t24;
                } else if (t25 != null) {
                    t25.b = t26;
                    if (t25.a == null) {
                    }
                } else if (!B.c(this, t24, t26)) {
                }
                t24 = t26;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.w instanceof CQf;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.w;
        return (!(obj instanceof YKK)) & (obj != null);
    }

    public final String toString() {
        String strG;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.w instanceof CQf) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                strG = g();
            } catch (RuntimeException e) {
                strG = "Exception thrown from implementation: " + e.getClass();
            }
            if (strG != null && !strG.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strG);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.w;
            if ((obj2 != null) & (!(obj2 instanceof YKK))) {
                return (V) e(obj2);
            }
            T23 t23 = this.y;
            T23 t24 = T23.c;
            if (t23 != t24) {
                T23 t25 = new T23();
                do {
                    QnHx qnHx = B;
                    qnHx.d(t25, t23);
                    if (qnHx.c(this, t23, t25)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.w;
                            } else {
                                h(t25);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof YKK))));
                        return (V) e(obj);
                    }
                    t23 = this.y;
                } while (t23 != t24);
            }
            return (V) e(this.w);
        }
        throw new InterruptedException();
    }
}
