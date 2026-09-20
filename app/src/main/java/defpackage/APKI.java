package defpackage;

import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.internal.UndeliveredElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class APKI<E> extends NUlFixed<E> {
    public final lg A;
    public final ReentrantLock B;
    public Object[] C;
    public int D;
    private volatile /* synthetic */ int size;
    public final int z;

    public APKI(int i, lg lgVar, j81<? super E, sd5> j81Var) {
        super(j81Var);
        this.z = i;
        this.A = lgVar;
        if (!(i >= 1)) {
            throw new IllegalArgumentException(ex0.b("ArrayChannel capacity must be at least 1, but ", i, " was specified").toString());
        }
        this.B = new ReentrantLock();
        int iMin = Math.min(i, 8);
        Object[] objArr = new Object[iMin];
        Arrays.fill(objArr, 0, iMin, YKK.w);
        this.C = objArr;
        this.size = 0;
    }

    @Override // defpackage.NUlFixed
    public final Object B() {
        Object objT;
        p94 p94VarU;
        boolean z;
        ReentrantLock reentrantLock = this.B;
        reentrantLock.lock();
        try {
            int i = this.size;
            Object obj = YKK.z;
            if (i == 0) {
                nt<?> ntVarJ = j();
                if (ntVarJ != null) {
                    obj = ntVarJ;
                }
                reentrantLock.unlock();
                return obj;
            }
            Object[] objArr = this.C;
            int i2 = this.D;
            Object obj2 = objArr[i2];
            p94 p94Var = null;
            objArr[i2] = null;
            this.size = i - 1;
            if (i != this.z) {
                objT = obj;
                p94VarU = p94Var;
                z = false;
                break;
            }
            while (true) {
                p94VarU = u();
                if (p94VarU == null) {
                    objT = obj;
                    p94VarU = p94Var;
                    z = false;
                    break;
                }
                if (p94VarU.v() != null) {
                    objT = p94VarU.t();
                    z = true;
                    break;
                }
                p94VarU.w();
                p94Var = p94VarU;
            }
            if (objT != obj && !(objT instanceof nt)) {
                this.size = i;
                Object[] objArr2 = this.C;
                objArr2[(this.D + i) % objArr2.length] = objT;
            }
            this.D = (this.D + 1) % this.C.length;
            sd5 sd5Var = sd5.a;
            reentrantLock.unlock();
            if (z) {
                p94VarU.s();
            }
            return obj2;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void D(int i, E e) {
        int i2 = this.z;
        if (i >= i2) {
            Object[] objArr = this.C;
            int i3 = this.D;
            objArr[i3 % objArr.length] = null;
            objArr[(i + i3) % objArr.length] = e;
            this.D = (i3 + 1) % objArr.length;
            return;
        }
        Object[] objArr2 = this.C;
        if (i >= objArr2.length) {
            int iMin = Math.min(objArr2.length * 2, i2);
            Object[] objArr3 = new Object[iMin];
            for (int i4 = 0; i4 < i; i4++) {
                Object[] objArr4 = this.C;
                objArr3[i4] = objArr4[(this.D + i4) % objArr4.length];
            }
            Arrays.fill(objArr3, i, iMin, YKK.w);
            this.C = objArr3;
            this.D = 0;
        }
        Object[] objArr5 = this.C;
        objArr5[(this.D + i) % objArr5.length] = e;
    }

    @Override // defpackage.mw0t
    public final Object h(r94 r94Var) {
        ReentrantLock reentrantLock = this.B;
        reentrantLock.lock();
        try {
            return super.h(r94Var);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.mw0t
    public final String i() {
        StringBuilder sb = new StringBuilder("(buffer:capacity=");
        sb.append(this.z);
        sb.append(",size=");
        return qc0.a(sb, this.size, ')');
    }

    @Override // defpackage.mw0t
    public final boolean l() {
        return false;
    }

    @Override // defpackage.mw0t
    public final boolean n() {
        return this.size == this.z && this.A == lg.SUSPEND;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0038  */
    /* JADX WARN: Code duplicated, block: B:26:0x003c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x003e A[Catch: all -> 0x006b, LOOP:0: B:27:0x003e->B:50:?, LOOP_START, TRY_ENTER, TryCatch #0 {all -> 0x006b, blocks: (B:3:0x0005, B:7:0x0011, B:11:0x0019, B:27:0x003e, B:30:0x0045, B:32:0x0049, B:35:0x004f, B:37:0x0055, B:40:0x0064, B:12:0x001c, B:19:0x002c, B:20:0x0031, B:22:0x0034), top: B:46:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0045 A[Catch: all -> 0x006b, TryCatch #0 {all -> 0x006b, blocks: (B:3:0x0005, B:7:0x0011, B:11:0x0019, B:27:0x003e, B:30:0x0045, B:32:0x0049, B:35:0x004f, B:37:0x0055, B:40:0x0064, B:12:0x001c, B:19:0x002c, B:20:0x0031, B:22:0x0034), top: B:46:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x004f A[Catch: all -> 0x006b, TRY_ENTER, TryCatch #0 {all -> 0x006b, blocks: (B:3:0x0005, B:7:0x0011, B:11:0x0019, B:27:0x003e, B:30:0x0045, B:32:0x0049, B:35:0x004f, B:37:0x0055, B:40:0x0064, B:12:0x001c, B:19:0x002c, B:20:0x0031, B:22:0x0034), top: B:46:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:? A[LOOP:0: B:27:0x003e->B:50:?, LOOP_END, SYNTHETIC] */
    @Override // defpackage.mw0t
    public final Object o(E e) {
        py4 py4Var;
        ok3<E> ok3VarS;
        ReentrantLock reentrantLock = this.B;
        reentrantLock.lock();
        try {
            int i = this.size;
            nt<?> ntVarJ = j();
            if (ntVarJ != null) {
                reentrantLock.unlock();
                return ntVarJ;
            }
            int i2 = this.z;
            py4 py4Var2 = YKK.x;
            if (i >= i2) {
                int iOrdinal = this.A.ordinal();
                if (iOrdinal == 0) {
                    py4Var = YKK.y;
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    py4Var = py4Var2;
                }
                if (py4Var != null) {
                    reentrantLock.unlock();
                    return py4Var;
                }
                if (i == 0) {
                    while (true) {
                        ok3VarS = s();
                        if (ok3VarS == null) {
                            break;
                        }
                        if (ok3VarS instanceof nt) {
                            this.size = i;
                            reentrantLock.unlock();
                            return ok3VarS;
                        }
                        if (ok3VarS.b(e) != null) {
                            this.size = i;
                            sd5 sd5Var = sd5.a;
                            reentrantLock.unlock();
                            ok3VarS.g(e);
                            return ok3VarS.d();
                        }
                    }
                }
                D(i, e);
                reentrantLock.unlock();
                return py4Var2;
            }
            this.size = i + 1;
            py4Var = null;
            if (py4Var != null) {
                reentrantLock.unlock();
                return py4Var;
            }
            if (i == 0) {
                while (true) {
                    ok3VarS = s();
                    if (ok3VarS == null) {
                        break;
                        break;
                    }
                    if (ok3VarS instanceof nt) {
                        this.size = i;
                        reentrantLock.unlock();
                        return ok3VarS;
                    }
                    if (ok3VarS.b(e) != null) {
                        this.size = i;
                        sd5 sd5Var2 = sd5.a;
                        reentrantLock.unlock();
                        ok3VarS.g(e);
                        return ok3VarS.d();
                    }
                }
            }
            D(i, e);
            reentrantLock.unlock();
            return py4Var2;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // defpackage.NUlFixed
    public final boolean v(mk3<? super E> mk3Var) {
        ReentrantLock reentrantLock = this.B;
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
        return this.size == 0;
    }

    @Override // defpackage.NUlFixed
    public final boolean y() {
        ReentrantLock reentrantLock = this.B;
        reentrantLock.lock();
        try {
            return super.y();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.NUlFixed
    public final void z(boolean z) {
        j81<E, sd5> j81Var = this.w;
        ReentrantLock reentrantLock = this.B;
        reentrantLock.lock();
        try {
            int i = this.size;
            UndeliveredElementException undeliveredElementExceptionG = null;
            for (int i2 = 0; i2 < i; i2++) {
                Object obj = this.C[this.D];
                py4 py4Var = YKK.w;
                if (j81Var != null && obj != py4Var) {
                    undeliveredElementExceptionG = fp1.G(j81Var, obj, undeliveredElementExceptionG);
                }
                Object[] objArr = this.C;
                int i3 = this.D;
                objArr[i3] = py4Var;
                this.D = (i3 + 1) % objArr.length;
            }
            this.size = 0;
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
