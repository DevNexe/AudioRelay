package defpackage;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class uu0 {
    public static final QnHx a = new QnHx();

    public static final class QnHx extends Throwable {
        public QnHx() {
            super("No further exceptions");
        }

        @Override // java.lang.Throwable
        public final Throwable fillInStackTrace() {
            return this;
        }
    }

    public static <T> boolean a(AtomicReference<Throwable> atomicReference, Throwable th) {
        boolean z;
        do {
            Throwable th2 = atomicReference.get();
            z = false;
            if (th2 == a) {
                return false;
            }
            Throwable compositeException = th2 == null ? th : new CompositeException(th2, th);
            do {
                if (atomicReference.compareAndSet(th2, compositeException)) {
                    z = true;
                    break;
                }
            } while (atomicReference.get() == th2);
        } while (!z);
        return true;
    }

    public static <T> Throwable b(AtomicReference<Throwable> atomicReference) {
        Throwable th = atomicReference.get();
        QnHx qnHx = a;
        return th != qnHx ? atomicReference.getAndSet(qnHx) : th;
    }

    public static String c(long j, TimeUnit timeUnit) {
        StringBuilder sbB = qc0.b("The source did not signal an event for ", j, " ");
        sbB.append(timeUnit.toString().toLowerCase());
        sbB.append(" and has been terminated.");
        return sbB.toString();
    }

    public static RuntimeException d(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        }
        return th instanceof RuntimeException ? (RuntimeException) th : new RuntimeException(th);
    }
}
