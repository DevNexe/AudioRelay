package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes3.dex */
public final class b60 {
    public static final b60 e;
    public static final b60 f;
    public final boolean a;
    public final boolean b;
    public final String[] c;
    public final String[] d;

    static {
        pq pqVar = pq.r;
        pq pqVar2 = pq.s;
        pq pqVar3 = pq.t;
        pq pqVar4 = pq.l;
        pq pqVar5 = pq.n;
        pq pqVar6 = pq.m;
        pq pqVar7 = pq.o;
        pq pqVar8 = pq.q;
        pq pqVar9 = pq.p;
        pq[] pqVarArr = {pqVar, pqVar2, pqVar3, pqVar4, pqVar5, pqVar6, pqVar7, pqVar8, pqVar9};
        pq[] pqVarArr2 = {pqVar, pqVar2, pqVar3, pqVar4, pqVar5, pqVar6, pqVar7, pqVar8, pqVar9, pq.j, pq.k, pq.h, pq.i, pq.f, pq.g, pq.e};
        QnHx qnHx = new QnHx();
        qnHx.b((pq[]) Arrays.copyOf(pqVarArr, 9));
        i85 i85Var = i85.TLS_1_3;
        i85 i85Var2 = i85.TLS_1_2;
        qnHx.e(i85Var, i85Var2);
        qnHx.d();
        qnHx.a();
        QnHx qnHx2 = new QnHx();
        qnHx2.b((pq[]) Arrays.copyOf(pqVarArr2, 16));
        qnHx2.e(i85Var, i85Var2);
        qnHx2.d();
        e = qnHx2.a();
        QnHx qnHx3 = new QnHx();
        qnHx3.b((pq[]) Arrays.copyOf(pqVarArr2, 16));
        qnHx3.e(i85Var, i85Var2, i85.TLS_1_1, i85.TLS_1_0);
        qnHx3.d();
        qnHx3.a();
        f = new b60(false, false, null, null);
    }

    public b60(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.a = z;
        this.b = z2;
        this.c = strArr;
        this.d = strArr2;
    }

    public final List<pq> a() {
        String[] strArr = this.c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(pq.b.b(str));
        }
        return wu.e1(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.a) {
            return false;
        }
        String[] strArr = this.d;
        if (strArr != null && !qf5.j(strArr, sSLSocket.getEnabledProtocols(), gk2.w)) {
            return false;
        }
        String[] strArr2 = this.c;
        return strArr2 == null || qf5.j(strArr2, sSLSocket.getEnabledCipherSuites(), pq.c);
    }

    public final List<i85> c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(i85.QnHx.a(str));
        }
        return wu.e1(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b60)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        b60 b60Var = (b60) obj;
        boolean z = b60Var.a;
        boolean z2 = this.a;
        if (z2 != z) {
            return false;
        }
        return !z2 || (Arrays.equals(this.c, b60Var.c) && Arrays.equals(this.d, b60Var.d) && this.b == b60Var.b);
    }

    public final int hashCode() {
        if (!this.a) {
            return 17;
        }
        String[] strArr = this.c;
        int iHashCode = (527 + (strArr == null ? 0 : Arrays.hashCode(strArr))) * 31;
        String[] strArr2 = this.d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.b ? 1 : 0);
    }

    public final String toString() {
        if (!this.a) {
            return "ConnectionSpec()";
        }
        StringBuilder sb = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb.append((Object) Objects.toString(a(), "[all enabled]"));
        sb.append(", tlsVersions=");
        sb.append((Object) Objects.toString(c(), "[all enabled]"));
        sb.append(", supportsTlsExtensions=");
        return dj.c(sb, this.b, ')');
    }

    public static final class QnHx {
        public final boolean a;
        public String[] b;
        public String[] c;
        public boolean d;

        public QnHx() {
            this.a = true;
        }

        public final b60 a() {
            return new b60(this.a, this.d, this.b, this.c);
        }

        public final void b(pq... pqVarArr) {
            if (!this.a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(pqVarArr.length);
            for (pq pqVar : pqVarArr) {
                arrayList.add(pqVar.a);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            String[] strArr = (String[]) array;
            c((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final void c(String... strArr) {
            if (!this.a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            if (!(!(strArr.length == 0))) {
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            this.b = (String[]) strArr.clone();
        }

        public final void d() {
            if (!this.a) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
            }
            this.d = true;
        }

        public final void e(i85... i85VarArr) {
            if (!this.a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(i85VarArr.length);
            for (i85 i85Var : i85VarArr) {
                arrayList.add(i85Var.w);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            String[] strArr = (String[]) array;
            f((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final void f(String... strArr) {
            if (!this.a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            if (!(!(strArr.length == 0))) {
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            this.c = (String[]) strArr.clone();
        }

        public QnHx(b60 b60Var) {
            this.a = b60Var.a;
            this.b = b60Var.c;
            this.c = b60Var.d;
            this.d = b60Var.b;
        }
    }
}
