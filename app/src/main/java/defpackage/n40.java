package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class n40 implements d90 {
    public final HashSet<yl3> A;
    public final ln4 B;
    public final xh1<tk3> C;
    public final HashSet<tk3> D;
    public final xh1<vj0<?>> E;
    public final ArrayList F;
    public final ArrayList G;
    public final xh1<tk3> H;
    public vh1 I;
    public boolean J;
    public n40 K;
    public int L;
    public final j30 M;
    public final la0 N;
    public boolean O;
    public x81<? super g30, ? super Integer, sd5> P;
    public final l40 w;
    public final jE<?> x;
    public final AtomicReference<Object> y;
    public final Object z;

    public static final class QnHx implements xl3 {
        public final Set<yl3> a;
        public final ArrayList b = new ArrayList();
        public final ArrayList c = new ArrayList();
        public final ArrayList d = new ArrayList();

        public QnHx(HashSet hashSet) {
            this.a = hashSet;
        }

        @Override // defpackage.xl3
        public final void a(yl3 yl3Var) {
            ArrayList arrayList = this.b;
            int iLastIndexOf = arrayList.lastIndexOf(yl3Var);
            if (iLastIndexOf < 0) {
                this.c.add(yl3Var);
            } else {
                arrayList.remove(iLastIndexOf);
                this.a.remove(yl3Var);
            }
        }

        @Override // defpackage.xl3
        public final void b(h81<sd5> h81Var) {
            this.d.add(h81Var);
        }

        @Override // defpackage.xl3
        public final void c(yl3 yl3Var) {
            ArrayList arrayList = this.c;
            int iLastIndexOf = arrayList.lastIndexOf(yl3Var);
            if (iLastIndexOf < 0) {
                this.b.add(yl3Var);
            } else {
                arrayList.remove(iLastIndexOf);
                this.a.remove(yl3Var);
            }
        }

        public final void d() {
            Set<yl3> set = this.a;
            if (!set.isEmpty()) {
                Trace.beginSection("Compose:abandons");
                try {
                    Iterator<yl3> it = set.iterator();
                    while (it.hasNext()) {
                        yl3 next = it.next();
                        it.remove();
                        next.a();
                    }
                    sd5 sd5Var = sd5.a;
                } finally {
                    Trace.endSection();
                }
            }
        }

        public final void e() {
            ArrayList arrayList = this.c;
            boolean z = !arrayList.isEmpty();
            Set<yl3> set = this.a;
            if (z) {
                Trace.beginSection("Compose:onForgotten");
                try {
                    for (int size = arrayList.size() - 1; -1 < size; size--) {
                        yl3 yl3Var = (yl3) arrayList.get(size);
                        if (!set.contains(yl3Var)) {
                            yl3Var.c();
                        }
                    }
                    sd5 sd5Var = sd5.a;
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            ArrayList arrayList2 = this.b;
            if (!arrayList2.isEmpty()) {
                Trace.beginSection("Compose:onRemembered");
                try {
                    int size2 = arrayList2.size();
                    for (int i = 0; i < size2; i++) {
                        yl3 yl3Var2 = (yl3) arrayList2.get(i);
                        set.remove(yl3Var2);
                        yl3Var2.d();
                    }
                    sd5 sd5Var2 = sd5.a;
                } finally {
                    Trace.endSection();
                }
            }
        }

        public final void f() {
            ArrayList arrayList = this.d;
            if (!arrayList.isEmpty()) {
                Trace.beginSection("Compose:sideeffects");
                try {
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        ((h81) arrayList.get(i)).invoke();
                    }
                    arrayList.clear();
                    sd5 sd5Var = sd5.a;
                } finally {
                    Trace.endSection();
                }
            }
        }
    }

    public n40() {
        throw null;
    }

    public n40(l40 l40Var, LPt8Fixed lPt8) {
        this.w = l40Var;
        this.x = lPt8;
        this.y = new AtomicReference<>(null);
        this.z = new Object();
        HashSet<yl3> hashSet = new HashSet<>();
        this.A = hashSet;
        ln4 ln4Var = new ln4();
        this.B = ln4Var;
        this.C = new xh1<>();
        this.D = new HashSet<>();
        this.E = new xh1<>();
        ArrayList arrayList = new ArrayList();
        this.F = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.G = arrayList2;
        this.H = new xh1<>();
        this.I = new vh1();
        j30 j30Var = new j30(lPt8, l40Var, ln4Var, hashSet, arrayList, arrayList2, this);
        l40Var.l(j30Var);
        this.M = j30Var;
        this.N = null;
        boolean z = l40Var instanceof uk3;
        this.P = n00.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r3v13, types: [T, java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    public static final void u(n40 n40Var, boolean z, jl3<HashSet<tk3>> jl3Var, Object obj) {
        int iZ;
        xh1<tk3> xh1Var = n40Var.C;
        int iB = xh1Var.b(obj);
        if (iB < 0) {
            return;
        }
        wh1<tk3> wh1VarE = xh1Var.e(iB);
        int i = 0;
        while (true) {
            if (!(i < wh1VarE.w)) {
                return;
            }
            int i2 = i + 1;
            Object obj2 = wh1VarE.x[i];
            if (obj2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            }
            tk3 tk3Var = (tk3) obj2;
            if (!n40Var.H.c(obj, tk3Var)) {
                n40 n40Var2 = tk3Var.b;
                if (n40Var2 == null || (iZ = n40Var2.z(tk3Var, obj)) == 0) {
                    iZ = 1;
                }
                if (iZ != 1) {
                    if (!(tk3Var.g != null) || z) {
                        HashSet<tk3> hashSet = jl3Var.w;
                        ?? r3 = hashSet;
                        if (hashSet == null) {
                            ?? hashSet2 = new HashSet();
                            jl3Var.w = hashSet2;
                            r3 = hashSet2;
                        }
                        r3.add(tk3Var);
                    } else {
                        n40Var.D.add(tk3Var);
                    }
                }
            }
            i = i2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0038  */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    public final int A(tk3 tk3Var, Z1 z1, Object obj) {
        boolean z;
        synchronized (this.z) {
            n40 n40Var = this.K;
            if (n40Var != null) {
                ln4 ln4Var = this.B;
                int i = this.L;
                if (!(!ln4Var.B)) {
                    e40.c("Writer is active".toString());
                    throw null;
                }
                if (!(i >= 0 && i < ln4Var.x)) {
                    e40.c("Invalid group index".toString());
                    throw null;
                }
                if (ln4Var.e(z1)) {
                    int iS = fp1.s(ln4Var.w, i) + i;
                    int i2 = z1.a;
                    if (i <= i2 && i2 < iS) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                if (!z) {
                    n40Var = null;
                }
            } else {
                n40Var = null;
            }
            if (n40Var == null) {
                j30 j30Var = this.M;
                if (j30Var.C && j30Var.z0(tk3Var, obj)) {
                    return 4;
                }
                if (obj == null) {
                    this.I.b(tk3Var, null);
                } else {
                    vh1 vh1Var = this.I;
                    Object obj2 = o40.a;
                    if (vh1Var.a(tk3Var) >= 0) {
                        int iA = vh1Var.a(tk3Var);
                        wh1 wh1Var = (wh1) (iA >= 0 ? ((Object[]) vh1Var.c)[iA] : null);
                        if (wh1Var != null) {
                            wh1Var.add(obj);
                        }
                    } else {
                        wh1 wh1Var2 = new wh1();
                        wh1Var2.add(obj);
                        sd5 sd5Var = sd5.a;
                        vh1Var.b(tk3Var, wh1Var2);
                    }
                }
            }
            if (n40Var != null) {
                return n40Var.A(tk3Var, z1, obj);
            }
            this.w.h(this);
            return this.M.C ? 3 : 2;
        }
    }

    public final void B(Object obj) {
        int iZ;
        xh1<tk3> xh1Var = this.C;
        int iB = xh1Var.b(obj);
        if (iB < 0) {
            return;
        }
        wh1<tk3> wh1VarE = xh1Var.e(iB);
        int i = 0;
        while (true) {
            int i2 = 1;
            if (!(i < wh1VarE.w)) {
                return;
            }
            int i3 = i + 1;
            Object obj2 = wh1VarE.x[i];
            if (obj2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            }
            tk3 tk3Var = (tk3) obj2;
            n40 n40Var = tk3Var.b;
            if (n40Var != null && (iZ = n40Var.z(tk3Var, obj)) != 0) {
                i2 = iZ;
            }
            if (i2 == 4) {
                this.H.a(obj, tk3Var);
            }
            i = i3;
        }
    }

    @Override // defpackage.k40
    public final void a() {
        synchronized (this.z) {
            if (!this.O) {
                this.O = true;
                this.P = n00.b;
                boolean z = this.B.x > 0;
                if (z || (true ^ this.A.isEmpty())) {
                    QnHx qnHx = new QnHx(this.A);
                    if (z) {
                        mn4 mn4VarC = this.B.c();
                        try {
                            e40.e(mn4VarC, qnHx);
                            sd5 sd5Var = sd5.a;
                            mn4VarC.f();
                            this.x.clear();
                            qnHx.e();
                        } catch (Throwable th) {
                            mn4VarC.f();
                            throw th;
                        }
                    }
                    qnHx.d();
                }
                this.M.O();
            }
            sd5 sd5Var2 = sd5.a;
        }
        this.w.o(this);
    }

    @Override // defpackage.d90
    public final <R> R b(d90 d90Var, int i, h81<? extends R> h81Var) {
        if (d90Var == null || ur1.a(d90Var, this) || i < 0) {
            return h81Var.invoke();
        }
        this.K = (n40) d90Var;
        this.L = i;
        try {
            return h81Var.invoke();
        } finally {
            this.K = null;
            this.L = 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.d90
    public final void c(ArrayList arrayList) {
        int size = arrayList.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            } else if (!ur1.a(((ih2) ((uy2) arrayList.get(i)).w).c, this)) {
                break;
            } else {
                i++;
            }
        }
        e40.f(z);
        try {
            this.M.Z(arrayList);
            sd5 sd5Var = sd5.a;
        } catch (Throwable th) {
            HashSet<yl3> hashSet = this.A;
            if (!hashSet.isEmpty()) {
                new ArrayList();
                new ArrayList();
                new ArrayList();
                if (!hashSet.isEmpty()) {
                    Trace.beginSection("Compose:abandons");
                    try {
                        Iterator<yl3> it = hashSet.iterator();
                        while (it.hasNext()) {
                            yl3 next = it.next();
                            it.remove();
                            next.a();
                        }
                        sd5 sd5Var2 = sd5.a;
                    } finally {
                        Trace.endSection();
                    }
                }
            }
            throw th;
        }
    }

    @Override // defpackage.d90
    public final void d() {
        synchronized (this.z) {
            if (!this.G.isEmpty()) {
                v(this.G);
            }
            sd5 sd5Var = sd5.a;
        }
    }

    @Override // defpackage.k40
    public final boolean e() {
        return this.O;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00ca A[PHI: r9
  0x00ca: PHI (r9v1 int) = (r9v0 int), (r9v11 int) binds: [B:25:0x0064, B:57:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:62:0x010c  */
    /* JADX WARN: Type inference failed for: r14v0, types: [int[], java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.io.Serializable, java.lang.Object, java.lang.Object[]] */
    @Override // defpackage.d90
    public final void f(Object obj) {
        tk3 tk3VarX;
        int i;
        int i2;
        Object[] objArr;
        int i3;
        j30 j30Var = this.M;
        int i4 = 0;
        if ((j30Var.z > 0) || (tk3VarX = j30Var.X()) == null) {
            return;
        }
        tk3VarX.a |= 1;
        this.C.a(obj, tk3VarX);
        boolean z = obj instanceof vj0;
        if (z) {
            xh1<vj0<?>> xh1Var = this.E;
            xh1Var.d(obj);
            Iterator<T> it = ((vj0) obj).k().iterator();
            while (it.hasNext()) {
                xh1Var.a((ws4) it.next(), obj);
            }
        }
        if ((tk3VarX.a & 32) != 0) {
            return;
        }
        uh1 uh1Var = tk3VarX.f;
        if (uh1Var == null) {
            uh1Var = new uh1(0);
            tk3VarX.f = uh1Var;
        }
        int i5 = tk3VarX.e;
        int i6 = uh1Var.a;
        int i7 = -1;
        if (i6 > 0) {
            int i8 = i6 - 1;
            int iIdentityHashCode = System.identityHashCode(obj);
            while (true) {
                if (i4 <= i8) {
                    int i9 = (i4 + i8) >>> 1;
                    Object obj2 = ((Object[]) uh1Var.b)[i9];
                    int iIdentityHashCode2 = System.identityHashCode(obj2);
                    if (iIdentityHashCode2 >= iIdentityHashCode) {
                        if (iIdentityHashCode2 <= iIdentityHashCode) {
                            if (obj2 != obj) {
                                i3 = i9 - 1;
                                while (true) {
                                    if (-1 < i3) {
                                        Object obj3 = ((Object[]) uh1Var.b)[i3];
                                        if (obj3 != obj) {
                                            if (System.identityHashCode(obj3) == iIdentityHashCode) {
                                                i3--;
                                            }
                                        }
                                    }
                                    int i10 = i9 + 1;
                                    int i11 = uh1Var.a;
                                    while (true) {
                                        if (i10 >= i11) {
                                            i10 = uh1Var.a;
                                        } else {
                                            Object obj4 = ((Object[]) uh1Var.b)[i10];
                                            if (obj4 == obj) {
                                                i3 = i10;
                                                break;
                                            } else if (System.identityHashCode(obj4) == iIdentityHashCode) {
                                                i10++;
                                            }
                                        }
                                        i3 = -(i10 + 1);
                                        break;
                                    }
                                }
                            } else {
                                i7 = i9;
                                break;
                            }
                        } else {
                            i8 = i9 - 1;
                        }
                    } else {
                        i4 = i9 + 1;
                    }
                } else {
                    i3 = -(i4 + 1);
                }
                i7 = i3;
                break;
            }
            if (i7 >= 0) {
                ((int[]) uh1Var.c)[i7] = i5;
            } else {
                i = -(i7 + 1);
                i2 = uh1Var.a;
                objArr = (Object[]) uh1Var.b;
                if (i2 == objArr.length) {
                    ?? r15 = new Object[objArr.length * 2];
                    ?? r14 = new int[objArr.length * 2];
                    int i12 = i + 1;
                    System.arraycopy(objArr, i, r15, i12, i2 - i);
                    System.arraycopy((int[]) uh1Var.c, i, r14, i12, uh1Var.a - i);
                    NPO.a0((Object[]) uh1Var.b, r15, 0, 0, i, 6);
                    NPO.Z((int[]) uh1Var.c, r14, i, 6);
                    uh1Var.b = r15;
                    uh1Var.c = r14;
                } else {
                    int i13 = i + 1;
                    System.arraycopy(objArr, i, objArr, i13, i2 - i);
                    int[] iArr = (int[]) uh1Var.c;
                    System.arraycopy(iArr, i, iArr, i13, uh1Var.a - i);
                }
                ((Object[]) uh1Var.b)[i] = obj;
                ((int[]) uh1Var.c)[i] = i5;
                uh1Var.a++;
            }
        } else {
            i = -(i7 + 1);
            i2 = uh1Var.a;
            objArr = (Object[]) uh1Var.b;
            if (i2 == objArr.length) {
                ?? r16 = new Object[objArr.length * 2];
                ?? r17 = new int[objArr.length * 2];
                int i14 = i + 1;
                System.arraycopy(objArr, i, r16, i14, i2 - i);
                System.arraycopy((int[]) uh1Var.c, i, r17, i14, uh1Var.a - i);
                NPO.a0((Object[]) uh1Var.b, r16, 0, 0, i, 6);
                NPO.Z((int[]) uh1Var.c, r17, i, 6);
                uh1Var.b = r16;
                uh1Var.c = r17;
            } else {
                int i15 = i + 1;
                System.arraycopy(objArr, i, objArr, i15, i2 - i);
                int[] iArr2 = (int[]) uh1Var.c;
                System.arraycopy(iArr2, i, iArr2, i15, uh1Var.a - i);
            }
            ((Object[]) uh1Var.b)[i] = obj;
            ((int[]) uh1Var.c)[i] = i5;
            uh1Var.a++;
        }
        if (z) {
            vh1 vh1Var = tk3VarX.g;
            if (vh1Var == null) {
                vh1Var = new vh1();
                tk3VarX.g = vh1Var;
            }
            vh1Var.b(obj, ((vj0) obj).i());
        }
    }

    @Override // defpackage.d90
    public final boolean g(wh1 wh1Var) {
        int i = 0;
        while (true) {
            if (!(i < wh1Var.w)) {
                return false;
            }
            int i2 = i + 1;
            Object obj = wh1Var.x[i];
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            }
            if (!(this.C.b(obj) >= 0)) {
                if (!(this.E.b(obj) >= 0)) {
                    i = i2;
                }
            }
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x009e  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void h(Set<? extends Object> set, boolean z) {
        boolean z2;
        jl3 jl3Var = new jl3();
        for (Object obj : set) {
            if (obj instanceof tk3) {
                tk3 tk3Var = (tk3) obj;
                n40 n40Var = tk3Var.b;
                if (n40Var != null) {
                    n40Var.z(tk3Var, null);
                }
            } else {
                u(this, z, jl3Var, obj);
                xh1<vj0<?>> xh1Var = this.E;
                int iB = xh1Var.b(obj);
                if (iB >= 0) {
                    wh1<vj0<?>> wh1VarE = xh1Var.e(iB);
                    int i = 0;
                    while (true) {
                        if (!(i < wh1VarE.w)) {
                            break;
                        }
                        int i2 = i + 1;
                        Object obj2 = wh1VarE.x[i];
                        if (obj2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                        }
                        u(this, z, jl3Var, (vj0) obj2);
                        i = i2;
                    }
                } else {
                    continue;
                }
            }
        }
        xh1<tk3> xh1Var2 = this.C;
        if (z) {
            HashSet<tk3> hashSet = this.D;
            if (!hashSet.isEmpty()) {
                int i3 = xh1Var2.d;
                int i4 = 0;
                for (int i5 = 0; i5 < i3; i5++) {
                    int i6 = xh1Var2.a[i5];
                    wh1<tk3> wh1Var = xh1Var2.c[i6];
                    int i7 = wh1Var.w;
                    int i8 = 0;
                    for (int i9 = 0; i9 < i7; i9++) {
                        Object obj3 = wh1Var.x[i9];
                        if (obj3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                        }
                        tk3 tk3Var2 = (tk3) obj3;
                        if (hashSet.contains(tk3Var2)) {
                            z2 = true;
                        } else {
                            HashSet hashSet2 = (HashSet) jl3Var.w;
                            if (hashSet2 != null && hashSet2.contains(tk3Var2)) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        }
                        if (!z2) {
                            if (i8 != i9) {
                                wh1Var.x[i8] = obj3;
                            }
                            i8++;
                        }
                    }
                    int i10 = wh1Var.w;
                    for (int i11 = i8; i11 < i10; i11++) {
                        wh1Var.x[i11] = null;
                    }
                    wh1Var.w = i8;
                    if (i8 > 0) {
                        if (i4 != i5) {
                            int[] iArr = xh1Var2.a;
                            int i12 = iArr[i4];
                            iArr[i4] = i6;
                            iArr[i5] = i12;
                        }
                        i4++;
                    }
                }
                int i13 = xh1Var2.d;
                for (int i14 = i4; i14 < i13; i14++) {
                    xh1Var2.b[xh1Var2.a[i14]] = null;
                }
                xh1Var2.d = i4;
                w();
                hashSet.clear();
                return;
            }
        }
        HashSet hashSet3 = (HashSet) jl3Var.w;
        if (hashSet3 != null) {
            int i15 = xh1Var2.d;
            int i16 = 0;
            for (int i17 = 0; i17 < i15; i17++) {
                int i18 = xh1Var2.a[i17];
                wh1<tk3> wh1Var2 = xh1Var2.c[i18];
                int i19 = wh1Var2.w;
                int i20 = 0;
                for (int i21 = 0; i21 < i19; i21++) {
                    Object obj4 = wh1Var2.x[i21];
                    if (obj4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    }
                    if (!hashSet3.contains((tk3) obj4)) {
                        if (i20 != i21) {
                            wh1Var2.x[i20] = obj4;
                        }
                        i20++;
                    }
                }
                int i22 = wh1Var2.w;
                for (int i23 = i20; i23 < i22; i23++) {
                    wh1Var2.x[i23] = null;
                }
                wh1Var2.w = i20;
                if (i20 > 0) {
                    if (i16 != i17) {
                        int[] iArr2 = xh1Var2.a;
                        int i24 = iArr2[i16];
                        iArr2[i16] = i18;
                        iArr2[i17] = i24;
                    }
                    i16++;
                }
            }
            int i25 = xh1Var2.d;
            for (int i26 = i16; i26 < i25; i26++) {
                xh1Var2.b[xh1Var2.a[i26]] = null;
            }
            xh1Var2.d = i16;
            w();
        }
    }

    @Override // defpackage.d90
    public final void i(Set<? extends Object> set) {
        Object obj;
        boolean z;
        Object obj2;
        do {
            obj = this.y.get();
            z = true;
            if (obj == null ? true : ur1.a(obj, o40.a)) {
                obj2 = set;
            } else if (obj instanceof Set) {
                obj2 = new Set[]{(Set) obj, set};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.y).toString());
                }
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                }
                Set[] setArr = (Set[]) obj;
                int length = setArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(setArr, length + 1);
                objArrCopyOf[length] = set;
                obj2 = objArrCopyOf;
            }
            AtomicReference<Object> atomicReference = this.y;
            while (!atomicReference.compareAndSet(obj, obj2)) {
                if (atomicReference.get() != obj) {
                    z = false;
                    break;
                }
            }
        } while (!z);
        if (obj == null) {
            synchronized (this.z) {
                y();
                sd5 sd5Var = sd5.a;
            }
        }
    }

    @Override // defpackage.d90
    public final void j(xk3 xk3Var) {
        j30 j30Var = this.M;
        if (!(!j30Var.C)) {
            e40.c("Preparing a composition while composing is not supported".toString());
            throw null;
        }
        j30Var.C = true;
        try {
            xk3Var.invoke();
        } finally {
            j30Var.C = false;
        }
    }

    @Override // defpackage.d90
    public final void k() {
        synchronized (this.z) {
            v(this.F);
            y();
            sd5 sd5Var = sd5.a;
        }
    }

    @Override // defpackage.d90
    public final boolean l() {
        return this.M.C;
    }

    @Override // defpackage.d90
    public final void m(Object obj) {
        synchronized (this.z) {
            B(obj);
            xh1<vj0<?>> xh1Var = this.E;
            int iB = xh1Var.b(obj);
            if (iB >= 0) {
                wh1<vj0<?>> wh1VarE = xh1Var.e(iB);
                int i = 0;
                while (true) {
                    if (!(i < wh1VarE.w)) {
                        break;
                    }
                    int i2 = i + 1;
                    Object obj2 = wh1VarE.x[i];
                    if (obj2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    }
                    B((vj0) obj2);
                    i = i2;
                }
            }
            sd5 sd5Var = sd5.a;
        }
    }

    @Override // defpackage.d90
    public final void n(hh2 hh2Var) {
        QnHx qnHx = new QnHx(this.A);
        mn4 mn4VarC = hh2Var.a.c();
        try {
            e40.e(mn4VarC, qnHx);
            sd5 sd5Var = sd5.a;
            mn4VarC.f();
            qnHx.e();
        } catch (Throwable th) {
            mn4VarC.f();
            throw th;
        }
    }

    @Override // defpackage.k40
    public final boolean o() {
        boolean z;
        synchronized (this.z) {
            z = this.I.a > 0;
        }
        return z;
    }

    @Override // defpackage.k40
    public final void p(x81<? super g30, ? super Integer, sd5> x81Var) {
        if (!(!this.O)) {
            throw new IllegalStateException("The composition is disposed".toString());
        }
        this.P = x81Var;
        this.w.a(this, (sz) x81Var);
    }

    @Override // defpackage.d90
    public final void q() {
        synchronized (this.z) {
            this.M.u.clear();
            if (!this.A.isEmpty()) {
                HashSet<yl3> hashSet = this.A;
                new ArrayList();
                new ArrayList();
                new ArrayList();
                if (!hashSet.isEmpty()) {
                    Trace.beginSection("Compose:abandons");
                    try {
                        Iterator<yl3> it = hashSet.iterator();
                        while (it.hasNext()) {
                            yl3 next = it.next();
                            it.remove();
                            next.a();
                        }
                        sd5 sd5Var = sd5.a;
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            sd5 sd5Var2 = sd5.a;
        }
    }

    @Override // defpackage.d90
    public final boolean r() {
        boolean z;
        synchronized (this.z) {
            x();
            try {
                j30 j30Var = this.M;
                vh1 vh1Var = this.I;
                this.I = new vh1();
                if (!j30Var.e.isEmpty()) {
                    e40.c("Expected applyChanges() to have been called".toString());
                    throw null;
                }
                z = false;
                if ((vh1Var.a > 0) || (!j30Var.r.isEmpty())) {
                    j30Var.P(vh1Var, null);
                    z = !j30Var.e.isEmpty();
                }
                if (!z) {
                    y();
                }
            } catch (Throwable th) {
                if (!this.A.isEmpty()) {
                    HashSet<yl3> hashSet = this.A;
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    if (true ^ hashSet.isEmpty()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            Iterator<yl3> it = hashSet.iterator();
                            while (it.hasNext()) {
                                yl3 next = it.next();
                                it.remove();
                                next.a();
                            }
                            sd5 sd5Var = sd5.a;
                        } finally {
                            Trace.endSection();
                        }
                    }
                }
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.d90
    public final void s(sz szVar) {
        try {
            synchronized (this.z) {
                x();
                j30 j30Var = this.M;
                vh1 vh1Var = this.I;
                this.I = new vh1();
                if (!j30Var.e.isEmpty()) {
                    e40.c("Expected applyChanges() to have been called".toString());
                    throw null;
                }
                j30Var.P(vh1Var, szVar);
                sd5 sd5Var = sd5.a;
            }
        } catch (Throwable th) {
            if (!this.A.isEmpty()) {
                HashSet<yl3> hashSet = this.A;
                new ArrayList();
                new ArrayList();
                new ArrayList();
                if (!hashSet.isEmpty()) {
                    Trace.beginSection("Compose:abandons");
                    try {
                        Iterator<yl3> it = hashSet.iterator();
                        while (it.hasNext()) {
                            yl3 next = it.next();
                            it.remove();
                            next.a();
                        }
                        sd5 sd5Var2 = sd5.a;
                    } finally {
                        Trace.endSection();
                    }
                }
            }
            throw th;
        }
    }

    @Override // defpackage.d90
    public final void t() {
        synchronized (this.z) {
            for (Object obj : this.B.y) {
                tk3 tk3Var = obj instanceof tk3 ? (tk3) obj : null;
                if (tk3Var != null) {
                    tk3Var.invalidate();
                }
            }
            sd5 sd5Var = sd5.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0098  */
    public final void v(ArrayList arrayList) {
        boolean z;
        jE<?> jEVar = this.x;
        ArrayList arrayList2 = this.G;
        QnHx qnHx = new QnHx(this.A);
        try {
            if (arrayList.isEmpty()) {
                if (arrayList2.isEmpty()) {
                    qnHx.d();
                    return;
                }
                return;
            }
            Trace.beginSection("Compose:applyChanges");
            try {
                jEVar.d();
                mn4 mn4VarC = this.B.c();
                try {
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        ((y81) arrayList.get(i)).invoke(jEVar, mn4VarC, qnHx);
                    }
                    arrayList.clear();
                    sd5 sd5Var = sd5.a;
                    mn4VarC.f();
                    jEVar.i();
                    Trace.endSection();
                    qnHx.e();
                    qnHx.f();
                    if (this.J) {
                        Trace.beginSection("Compose:unobserve");
                        try {
                            this.J = false;
                            xh1<tk3> xh1Var = this.C;
                            int i2 = xh1Var.d;
                            int i3 = 0;
                            for (int i4 = 0; i4 < i2; i4++) {
                                int i5 = xh1Var.a[i4];
                                wh1<tk3> wh1Var = xh1Var.c[i5];
                                int i6 = wh1Var.w;
                                int i7 = 0;
                                for (int i8 = 0; i8 < i6; i8++) {
                                    Object obj = wh1Var.x[i8];
                                    if (obj == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                    }
                                    tk3 tk3Var = (tk3) obj;
                                    if (tk3Var.b == null) {
                                        z = false;
                                    } else {
                                        Z1 z1 = tk3Var.c;
                                        if (z1 != null ? z1.a() : false) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                    }
                                    if (!(!z)) {
                                        if (i7 != i8) {
                                            wh1Var.x[i7] = obj;
                                        }
                                        i7++;
                                    }
                                }
                                int i9 = wh1Var.w;
                                for (int i10 = i7; i10 < i9; i10++) {
                                    wh1Var.x[i10] = null;
                                }
                                wh1Var.w = i7;
                                if (i7 > 0) {
                                    if (i3 != i4) {
                                        int[] iArr = xh1Var.a;
                                        int i11 = iArr[i3];
                                        iArr[i3] = i5;
                                        iArr[i4] = i11;
                                    }
                                    i3++;
                                }
                            }
                            int i12 = xh1Var.d;
                            for (int i13 = i3; i13 < i12; i13++) {
                                xh1Var.b[xh1Var.a[i13]] = null;
                            }
                            xh1Var.d = i3;
                            w();
                            sd5 sd5Var2 = sd5.a;
                            Trace.endSection();
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        qnHx.d();
                    }
                } catch (Throwable th2) {
                    mn4VarC.f();
                    throw th2;
                }
            } catch (Throwable th3) {
                Trace.endSection();
                throw th3;
            }
        } catch (Throwable th4) {
            if (arrayList2.isEmpty()) {
                qnHx.d();
            }
            throw th4;
        }
    }

    public final void w() {
        xh1<vj0<?>> xh1Var = this.E;
        int i = xh1Var.d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = xh1Var.a[i3];
            wh1<vj0<?>> wh1Var = xh1Var.c[i4];
            int i5 = wh1Var.w;
            int i6 = 0;
            for (int i7 = 0; i7 < i5; i7++) {
                Object obj = wh1Var.x[i7];
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                }
                if (!(!(this.C.b((vj0) obj) >= 0))) {
                    if (i6 != i7) {
                        wh1Var.x[i6] = obj;
                    }
                    i6++;
                }
            }
            int i8 = wh1Var.w;
            for (int i9 = i6; i9 < i8; i9++) {
                wh1Var.x[i9] = null;
            }
            wh1Var.w = i6;
            if (i6 > 0) {
                if (i2 != i3) {
                    int[] iArr = xh1Var.a;
                    int i10 = iArr[i2];
                    iArr[i2] = i4;
                    iArr[i3] = i10;
                }
                i2++;
            }
        }
        int i11 = xh1Var.d;
        for (int i12 = i2; i12 < i11; i12++) {
            xh1Var.b[xh1Var.a[i12]] = null;
        }
        xh1Var.d = i2;
        Iterator<tk3> it = this.D.iterator();
        while (it.hasNext()) {
            if (!(it.next().g != null)) {
                it.remove();
            }
        }
    }

    public final void x() {
        AtomicReference<Object> atomicReference = this.y;
        Object obj = o40.a;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (ur1.a(andSet, obj)) {
                throw new IllegalStateException("pending composition has not been applied".toString());
            }
            if (andSet instanceof Set) {
                h((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                throw new IllegalStateException(("corrupt pendingModifications drain: " + atomicReference).toString());
            }
            for (Set<? extends Object> set : (Set[]) andSet) {
                h(set, true);
            }
        }
    }

    public final void y() {
        AtomicReference<Object> atomicReference = this.y;
        Object andSet = atomicReference.getAndSet(null);
        if (ur1.a(andSet, o40.a)) {
            return;
        }
        if (andSet instanceof Set) {
            h((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            if (andSet == null) {
                throw new IllegalStateException("calling recordModificationsOf and applyChanges concurrently is not supported".toString());
            }
            throw new IllegalStateException(("corrupt pendingModifications drain: " + atomicReference).toString());
        }
        for (Set<? extends Object> set : (Set[]) andSet) {
            h(set, false);
        }
    }

    public final int z(tk3 tk3Var, Object obj) {
        int i = tk3Var.a;
        if ((i & 2) != 0) {
            tk3Var.a = i | 4;
        }
        Z1 z1 = tk3Var.c;
        if (z1 == null || !this.B.e(z1) || !z1.a() || !z1.a()) {
            return 1;
        }
        if (tk3Var.d != null) {
            return A(tk3Var, z1, obj);
        }
        return 1;
    }
}
