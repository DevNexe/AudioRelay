package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class nj4<T> extends roZB<pj4> implements pi2<T>, mz0, q91<T> {
    public final int A;
    public final int B;
    public final lg C;
    public Object[] D;
    public long E;
    public long F;
    public int G;
    public int H;

    public static final class QnHx implements am0 {
        public final nj4<?> w;
        public final long x;
        public final Object y;
        public final z80<sd5> z;

        public QnHx(nj4 nj4Var, long j, Object obj, xm xmVar) {
            this.w = nj4Var;
            this.x = j;
            this.y = obj;
            this.z = xmVar;
        }

        @Override // defpackage.am0
        public final void a() {
            nj4<?> nj4Var = this.w;
            synchronized (nj4Var) {
                if (this.x < nj4Var.r()) {
                    return;
                }
                Object[] objArr = nj4Var.D;
                int i = (int) this.x;
                if (objArr[(objArr.length - 1) & i] != this) {
                    return;
                }
                objArr[i & (objArr.length - 1)] = OW8.I;
                nj4Var.m();
                sd5 sd5Var = sd5.a;
            }
        }
    }

    public nj4(int i, int i2, lg lgVar) {
        this.A = i;
        this.B = i2;
        this.C = lgVar;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00a2 A[Catch: all -> 0x003e, TryCatch #2 {all -> 0x003e, blocks: (B:17:0x003a, B:37:0x0087, B:39:0x008f, B:43:0x00a2, B:46:0x00a9, B:47:0x00ad, B:48:0x00ae), top: B:59:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:63:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x009f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public static va0 n(nj4 nj4Var, nz0 nz0Var, z80 z80Var) throws Throwable {
        oj4 oj4Var;
        pj4 pj4VarH;
        nz0 nz0Var2;
        pj4 pj4Var;
        nj4 nj4Var2;
        Throwable th;
        ms1 ms1Var;
        nz0 nz0Var3;
        Object objV;
        if (z80Var instanceof oj4) {
            oj4Var = (oj4) z80Var;
            int i = oj4Var.F;
            if ((i & Integer.MIN_VALUE) != 0) {
                oj4Var.F = i - Integer.MIN_VALUE;
            } else {
                oj4Var = new oj4(nj4Var, z80Var);
            }
        } else {
            oj4Var = new oj4(nj4Var, z80Var);
        }
        Object obj = oj4Var.D;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = oj4Var.F;
        if (i2 == 0) {
            C0239D.H(obj);
            pj4VarH = nj4Var.h();
            try {
                if (nz0Var instanceof fw4) {
                    oj4Var.z = nj4Var;
                    oj4Var.A = nz0Var;
                    oj4Var.B = pj4VarH;
                    oj4Var.F = 1;
                    if (((fw4) nz0Var).a(oj4Var) == va0Var) {
                        return va0Var;
                    }
                }
                nz0Var2 = nz0Var;
                pj4Var = pj4VarH;
                nj4Var2 = nj4Var;
                ms1Var = (ms1) oj4Var.x.j(ms1.CQf.w);
                nz0Var3 = nz0Var2;
                while (true) {
                    objV = nj4Var2.v(pj4Var);
                    if (objV == OW8.I) {
                        oj4Var.z = nj4Var2;
                        oj4Var.A = nz0Var3;
                        oj4Var.B = pj4Var;
                        oj4Var.C = ms1Var;
                        oj4Var.F = 2;
                        if (nj4Var2.l(pj4Var, oj4Var) == va0Var) {
                            return va0Var;
                        }
                    } else {
                        if (ms1Var != null) {
                            throw ms1Var.P();
                        }
                        oj4Var.z = nj4Var2;
                        oj4Var.A = nz0Var3;
                        oj4Var.B = pj4Var;
                        oj4Var.C = ms1Var;
                        oj4Var.F = 3;
                        if (nz0Var3.f(objV, oj4Var) == va0Var) {
                            return va0Var;
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else if (i2 == 1) {
            pj4Var = oj4Var.B;
            nz0 nz0Var4 = oj4Var.A;
            nj4 nj4Var3 = oj4Var.z;
            try {
                C0239D.H(obj);
                nz0Var2 = nz0Var4;
                nj4Var = nj4Var3;
                try {
                    nj4Var2 = nj4Var;
                    ms1Var = (ms1) oj4Var.x.j(ms1.CQf.w);
                    nz0Var3 = nz0Var2;
                    while (true) {
                        objV = nj4Var2.v(pj4Var);
                        if (objV == OW8.I) {
                            oj4Var.z = nj4Var2;
                            oj4Var.A = nz0Var3;
                            oj4Var.B = pj4Var;
                            oj4Var.C = ms1Var;
                            oj4Var.F = 2;
                            if (nj4Var2.l(pj4Var, oj4Var) == va0Var) {
                                return va0Var;
                            }
                        } else {
                            if (ms1Var != null) {
                                throw ms1Var.P();
                            }
                            oj4Var.z = nj4Var2;
                            oj4Var.A = nz0Var3;
                            oj4Var.B = pj4Var;
                            oj4Var.C = ms1Var;
                            oj4Var.F = 3;
                            if (nz0Var3.f(objV, oj4Var) == va0Var) {
                                return va0Var;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    nj4Var2 = nj4Var;
                    th = th3;
                    pj4VarH = pj4Var;
                    th = th;
                    nj4Var = nj4Var2;
                    nj4Var.k(pj4VarH);
                    throw th;
                }
            } catch (Throwable th4) {
                pj4VarH = pj4Var;
                th = th4;
                nj4Var = nj4Var3;
            }
        } else {
            if (i2 != 2 && i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ms1Var = oj4Var.C;
            pj4Var = oj4Var.B;
            nz0 nz0Var5 = oj4Var.A;
            nj4Var2 = oj4Var.z;
            try {
                C0239D.H(obj);
                nz0Var3 = nz0Var5;
                while (true) {
                    objV = nj4Var2.v(pj4Var);
                    if (objV == OW8.I) {
                        oj4Var.z = nj4Var2;
                        oj4Var.A = nz0Var3;
                        oj4Var.B = pj4Var;
                        oj4Var.C = ms1Var;
                        oj4Var.F = 2;
                        if (nj4Var2.l(pj4Var, oj4Var) == va0Var) {
                            return va0Var;
                        }
                    } else {
                        if (ms1Var != null && !ms1Var.c()) {
                            throw ms1Var.P();
                        }
                        oj4Var.z = nj4Var2;
                        oj4Var.A = nz0Var3;
                        oj4Var.B = pj4Var;
                        oj4Var.C = ms1Var;
                        oj4Var.F = 3;
                        if (nz0Var3.f(objV, oj4Var) == va0Var) {
                            return va0Var;
                        }
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                pj4VarH = pj4Var;
                th = th;
                nj4Var = nj4Var2;
                nj4Var.k(pj4VarH);
                throw th;
            }
        }
        nj4Var.k(pj4VarH);
        throw th;
    }

    @Override // defpackage.mj4, defpackage.mz0
    public final Object a(nz0<? super T> nz0Var, z80<?> z80Var) throws Throwable {
        n(this, nz0Var, z80Var);
        return va0.COROUTINE_SUSPENDED;
    }

    @Override // defpackage.q91
    public final mz0<T> c(la0 la0Var, int i, lg lgVar) {
        return ((i == 0 || i == -3) && lgVar == lg.SUSPEND) ? this : new uo(i, la0Var, lgVar, this);
    }

    @Override // defpackage.pi2
    public final void d() {
        synchronized (this) {
            w(r() + ((long) this.G), this.F, r() + ((long) this.G), r() + ((long) this.G) + ((long) this.H));
            sd5 sd5Var = sd5.a;
        }
    }

    @Override // defpackage.pi2
    public final boolean e(T t) {
        int i;
        boolean z;
        z80<sd5>[] z80VarArrQ = kK.w;
        synchronized (this) {
            if (t(t)) {
                z80VarArrQ = q(z80VarArrQ);
                z = true;
            } else {
                z = false;
            }
        }
        for (z80<sd5> z80Var : z80VarArrQ) {
            if (z80Var != null) {
                z80Var.x(sd5.a);
            }
        }
        return z;
    }

    @Override // defpackage.nz0
    public final Object f(T t, z80<? super sd5> z80Var) {
        z80<sd5>[] z80VarArrQ;
        QnHx qnHx;
        if (e(t)) {
            return sd5.a;
        }
        xm xmVar = new xm(1, ps0.L(z80Var));
        xmVar.r();
        z80<sd5>[] z80VarArrQ2 = kK.w;
        synchronized (this) {
            if (t(t)) {
                xmVar.x(sd5.a);
                z80VarArrQ = q(z80VarArrQ2);
                qnHx = null;
            } else {
                QnHx qnHx2 = new QnHx(this, ((long) (this.G + this.H)) + r(), t, xmVar);
                p(qnHx2);
                this.H++;
                if (this.B == 0) {
                    z80VarArrQ2 = q(z80VarArrQ2);
                }
                z80VarArrQ = z80VarArrQ2;
                qnHx = qnHx2;
            }
        }
        int i = 0;
        if (qnHx != null) {
            xmVar.B(new im0(qnHx, i));
        }
        int length = z80VarArrQ.length;
        while (i < length) {
            z80<sd5> z80Var2 = z80VarArrQ[i];
            if (z80Var2 != null) {
                z80Var2.x(sd5.a);
            }
            i++;
        }
        Object objP = xmVar.p();
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        if (objP != va0Var) {
            objP = sd5.a;
        }
        return objP == va0Var ? objP : sd5.a;
    }

    @Override // defpackage.roZB
    public final z2n i() {
        return new pj4();
    }

    @Override // defpackage.roZB
    public final z2n[] j() {
        return new pj4[2];
    }

    public final Object l(pj4 pj4Var, oj4 oj4Var) {
        xm xmVar = new xm(1, ps0.L(oj4Var));
        xmVar.r();
        synchronized (this) {
            if (u(pj4Var) < 0) {
                pj4Var.b = xmVar;
            } else {
                xmVar.x(sd5.a);
            }
            sd5 sd5Var = sd5.a;
        }
        Object objP = xmVar.p();
        return objP == va0.COROUTINE_SUSPENDED ? objP : sd5.a;
    }

    public final void m() {
        if (this.B != 0 || this.H > 1) {
            Object[] objArr = this.D;
            while (this.H > 0) {
                long jR = r();
                int i = this.G;
                int i2 = this.H;
                if (objArr[(objArr.length - 1) & ((int) ((jR + ((long) (i + i2))) - 1))] != OW8.I) {
                    return;
                }
                this.H = i2 - 1;
                objArr[(objArr.length - 1) & ((int) (r() + ((long) (this.G + this.H))))] = null;
            }
        }
    }

    public final void o() {
        Object[] objArr;
        Object[] objArr2 = this.D;
        objArr2[(objArr2.length - 1) & ((int) r())] = null;
        this.G--;
        long jR = r() + 1;
        if (this.E < jR) {
            this.E = jR;
        }
        if (this.F < jR) {
            if (this.x != 0 && (objArr = this.w) != null) {
                for (Object obj : objArr) {
                    if (obj != null) {
                        pj4 pj4Var = (pj4) obj;
                        long j = pj4Var.a;
                        if (j >= 0 && j < jR) {
                            pj4Var.a = jR;
                        }
                    }
                }
            }
            this.F = jR;
        }
    }

    public final void p(Object obj) {
        int i = this.G + this.H;
        Object[] objArrS = this.D;
        if (objArrS == null) {
            objArrS = s(0, 2, null);
        } else if (i >= objArrS.length) {
            objArrS = s(i, objArrS.length * 2, objArrS);
        }
        objArrS[((int) (r() + ((long) i))) & (objArrS.length - 1)] = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [z80<sd5>[]] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r6v2 */
    public final z80<sd5>[] q(z80<sd5>[] z80VarArr) {
        Object[] objArr;
        pj4 pj4Var;
        xm xmVar;
        int length = z80VarArr.length;
        if (this.x != 0 && (objArr = this.w) != null) {
            int length2 = objArr.length;
            int i = 0;
            while (i < length2) {
                Object obj = objArr[i];
                if (obj == null || (xmVar = (pj4Var = (pj4) obj).b) == null || u(pj4Var) < 0) {
                    z80VarArr = z80VarArr;
                } else {
                    if (length >= z80VarArr.length) {
                        z80VarArr = z80VarArr;
                        z80VarArr = z80VarArr;
                        z80VarArr = Arrays.copyOf((Object[]) z80VarArr, Math.max(2, z80VarArr.length * 2));
                    }
                    z80VarArr = z80VarArr;
                    z80VarArr = z80VarArr;
                    ((z80[]) z80VarArr)[length] = xmVar;
                    pj4Var.b = null;
                    length++;
                }
                i++;
                z80VarArr = z80VarArr;
            }
            z80VarArr = z80VarArr;
        }
        return (z80[]) z80VarArr;
    }

    public final long r() {
        return Math.min(this.F, this.E);
    }

    public final Object[] s(int i, int i2, Object[] objArr) {
        if (!(i2 > 0)) {
            throw new IllegalStateException("Buffer size overflow".toString());
        }
        Object[] objArr2 = new Object[i2];
        this.D = objArr2;
        if (objArr == null) {
            return objArr2;
        }
        long jR = r();
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = (int) (((long) i3) + jR);
            objArr2[i4 & (i2 - 1)] = objArr[(objArr.length - 1) & i4];
        }
        return objArr2;
    }

    public final boolean t(T t) {
        int i = this.x;
        int i2 = this.A;
        if (i == 0) {
            if (i2 != 0) {
                p(t);
                int i3 = this.G + 1;
                this.G = i3;
                if (i3 > i2) {
                    o();
                }
                this.F = r() + ((long) this.G);
            }
            return true;
        }
        int i4 = this.G;
        int i5 = this.B;
        if (i4 >= i5 && this.F <= this.E) {
            int iOrdinal = this.C.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal == 2) {
                return true;
            }
        }
        p(t);
        int i6 = this.G + 1;
        this.G = i6;
        if (i6 > i5) {
            o();
        }
        long jR = r() + ((long) this.G);
        long j = this.E;
        if (((int) (jR - j)) > i2) {
            w(j + 1, this.F, r() + ((long) this.G), r() + ((long) this.G) + ((long) this.H));
        }
        return true;
    }

    public final long u(pj4 pj4Var) {
        long j = pj4Var.a;
        if (j < r() + ((long) this.G)) {
            return j;
        }
        if (this.B <= 0 && j <= r() && this.H != 0) {
            return j;
        }
        return -1L;
    }

    public final Object v(pj4 pj4Var) {
        Object obj;
        z80<sd5>[] z80VarArrX = kK.w;
        synchronized (this) {
            long jU = u(pj4Var);
            if (jU < 0) {
                obj = OW8.I;
            } else {
                long j = pj4Var.a;
                Object[] objArr = this.D;
                Object obj2 = objArr[((int) jU) & (objArr.length - 1)];
                if (obj2 instanceof QnHx) {
                    obj2 = ((QnHx) obj2).y;
                }
                pj4Var.a = jU + 1;
                Object obj3 = obj2;
                z80VarArrX = x(j);
                obj = obj3;
            }
        }
        for (z80<sd5> z80Var : z80VarArrX) {
            if (z80Var != null) {
                z80Var.x(sd5.a);
            }
        }
        return obj;
    }

    public final void w(long j, long j2, long j3, long j4) {
        long jMin = Math.min(j2, j);
        for (long jR = r(); jR < jMin; jR++) {
            Object[] objArr = this.D;
            objArr[((int) jR) & (objArr.length - 1)] = null;
        }
        this.E = j;
        this.F = j2;
        this.G = (int) (j3 - jMin);
        this.H = (int) (j4 - j3);
    }

    public final z80<sd5>[] x(long j) {
        long j2;
        long j3;
        long j4;
        Object[] objArr;
        long j5 = this.F;
        z80<sd5>[] z80VarArr = kK.w;
        if (j > j5) {
            return z80VarArr;
        }
        long jR = r();
        long j6 = ((long) this.G) + jR;
        int i = this.B;
        if (i == 0 && this.H > 0) {
            j6++;
        }
        if (this.x != 0 && (objArr = this.w) != null) {
            for (Object obj : objArr) {
                if (obj != null) {
                    long j7 = ((pj4) obj).a;
                    if (j7 >= 0 && j7 < j6) {
                        j6 = j7;
                    }
                }
            }
        }
        if (j6 <= this.F) {
            return z80VarArr;
        }
        long jR2 = r() + ((long) this.G);
        int iMin = this.x > 0 ? Math.min(this.H, i - ((int) (jR2 - j6))) : this.H;
        long j8 = ((long) this.H) + jR2;
        py4 py4Var = OW8.I;
        if (iMin > 0) {
            z80VarArr = new z80[iMin];
            Object[] objArr2 = this.D;
            long j9 = jR2;
            int i2 = 0;
            while (true) {
                if (jR2 >= j8) {
                    j2 = j6;
                    j3 = j8;
                    break;
                }
                j2 = j6;
                int i3 = (int) jR2;
                Object obj2 = objArr2[(objArr2.length - 1) & i3];
                if (obj2 == py4Var) {
                    j3 = j8;
                    j4 = 1;
                } else {
                    if (obj2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    }
                    QnHx qnHx = (QnHx) obj2;
                    j3 = j8;
                    int i4 = i2 + 1;
                    z80VarArr[i2] = qnHx.z;
                    objArr2[i3 & (objArr2.length - 1)] = py4Var;
                    objArr2[((int) j9) & (objArr2.length - 1)] = qnHx.y;
                    j4 = 1;
                    j9++;
                    if (i4 >= iMin) {
                        break;
                    }
                    i2 = i4;
                }
                jR2 += j4;
                j6 = j2;
                j8 = j3;
            }
            jR2 = j9;
        } else {
            j2 = j6;
            j3 = j8;
        }
        z80<sd5>[] z80VarArr2 = z80VarArr;
        int i5 = (int) (jR2 - jR);
        long j10 = this.x == 0 ? jR2 : j2;
        long jMax = Math.max(this.E, jR2 - ((long) Math.min(this.A, i5)));
        if (i == 0 && jMax < j3) {
            Object[] objArr3 = this.D;
            if (ur1.a(objArr3[((int) jMax) & (objArr3.length - 1)], py4Var)) {
                jR2++;
                jMax++;
            }
        }
        w(jMax, j10, jR2, j3);
        m();
        return (z80VarArr2.length == 0) ^ true ? q(z80VarArr2) : z80VarArr2;
    }
}
