package kotlinx.coroutines;

import defpackage.l90;
import defpackage.ms1;
import defpackage.ur1;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class JobCancellationException extends CancellationException implements l90<JobCancellationException> {
    public final transient ms1 w;

    public JobCancellationException(String str, Throwable th, ms1 ms1Var) {
        super(str);
        this.w = ms1Var;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // defpackage.l90
    public final /* bridge */ /* synthetic */ Throwable a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof JobCancellationException) {
                JobCancellationException jobCancellationException = (JobCancellationException) obj;
                if (!ur1.a(jobCancellationException.getMessage(), getMessage()) || !ur1.a(jobCancellationException.w, this.w) || !ur1.a(jobCancellationException.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        int iHashCode = (this.w.hashCode() + (getMessage().hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.w;
    }
}
