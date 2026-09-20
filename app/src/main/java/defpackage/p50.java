package defpackage;

import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.internal.UndeliveredElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class p50<E> extends NUlFixed<E> {
    public Object A;
    public final ReentrantLock z;

    public p50(j81<? super E, sd5> j81Var) {
        super(j81Var);
        this.z = new ReentrantLock();
        this.A = YKK.w;
    }

    @Override // defpackage.NUlFixed
    public final Object B() {
        ReentrantLock reentrantLock = this.z;
        reentrantLock.lock();
        try {
            Object obj = this.A;
            py4 py4Var = YKK.w;
            if (obj != py4Var) {
                this.A = py4Var;
                sd5 sd5Var = sd5.a;
                return obj;
            }
            Object objJ = j();
            if (objJ == null) {
                objJ = YKK.z;
            }
            return objJ;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.mw0t
    public final String i() {
        ReentrantLock reentrantLock = this.z;
        reentrantLock.lock();
        try {
            return "(value=" + this.A + ')';
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.mw0t
    public final boolean l() {
        return false;
    }

    @Override // defpackage.mw0t
    public final boolean n() {
        return false;
    }

    @Override // defpackage.mw0t
    public final Object o(E e) {
        j81<E, sd5> j81Var;
        ReentrantLock reentrantLock = this.z;
        reentrantLock.lock();
        try {
            nt<?> ntVarJ = j();
            if (ntVarJ != null) {
                reentrantLock.unlock();
                return ntVarJ;
            }
            Object obj = this.A;
            py4 py4Var = YKK.w;
            if (obj == py4Var) {
                while (true) {
                    ok3<E> ok3VarS = s();
                    if (ok3VarS == null) {
                        break;
                    }
                    if (ok3VarS instanceof nt) {
                        reentrantLock.unlock();
                        return ok3VarS;
                    }
                    if (ok3VarS.b(e) != null) {
                        sd5 sd5Var = sd5.a;
                        reentrantLock.unlock();
                        ok3VarS.g(e);
                        return ok3VarS.d();
                    }
                }
            }
            Object obj2 = this.A;
            UndeliveredElementException undeliveredElementExceptionG = null;
            if (obj2 != py4Var && (j81Var = this.w) != null) {
                undeliveredElementExceptionG = fp1.G(j81Var, obj2, null);
            }
            this.A = e;
            if (undeliveredElementExceptionG != null) {
                throw undeliveredElementExceptionG;
            }
            py4 py4Var2 = YKK.x;
            reentrantLock.unlock();
            return py4Var2;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // defpackage.NUlFixed
    public final boolean v(mk3<? super E> mk3Var) {
        ReentrantLock reentrantLock = this.z;
        reentrantLock.lock();
        try {
            return super.v(mk3Var);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.NUlFixed
    public final boolean w() {
        return false;
    }

    @Override // defpackage.NUlFixed
    public final boolean x() {
        ReentrantLock reentrantLock = this.z;
        reentrantLock.lock();
        try {
            return this.A == YKK.w;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.NUlFixed
    public final void z(boolean z) {
        j81<E, sd5> j81Var;
        ReentrantLock reentrantLock = this.z;
        reentrantLock.lock();
        try {
            py4 py4Var = YKK.w;
            Object obj = this.A;
            UndeliveredElementException undeliveredElementExceptionG = null;
            if (obj != py4Var && (j81Var = this.w) != null) {
                undeliveredElementExceptionG = fp1.G(j81Var, obj, null);
            }
            this.A = py4Var;
            sd5 sd5Var = sd5.a;
            reentrantLock.unlock();
            super.z(z);
            if (undeliveredElementExceptionG != null) {
                throw undeliveredElementExceptionG;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
