package j$.time.temporal;

import j$.time.DateTimeException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p {
    static final o a = new o(1);
    static final o b = new o(2);
    static final o c = new o(3);
    static final o d = new o(4);
    static final o e = new o(5);
    static final o f = new o(6);
    static final o g = new o(7);

    public static int a(l lVar, q qVar) {
        u uVarL = lVar.l(qVar);
        if (!uVarL.h()) {
            throw new t("Invalid field " + qVar + " for get() method, use getLong() instead");
        }
        long jG = lVar.g(qVar);
        if (uVarL.i(jG)) {
            return (int) jG;
        }
        throw new DateTimeException("Invalid value for " + qVar + " (valid values " + uVarL + "): " + jG);
    }

    public static k b(k kVar, long j, b bVar) {
        long j2;
        if (j == Long.MIN_VALUE) {
            kVar = kVar.d(Long.MAX_VALUE, bVar);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return kVar.d(j2, bVar);
    }

    public static Object c(l lVar, r rVar) {
        if (rVar == a || rVar == b || rVar == c) {
            return null;
        }
        return rVar.g(lVar);
    }

    public static u d(l lVar, q qVar) {
        if (qVar instanceof a) {
            if (lVar.e(qVar)) {
                return qVar.l();
            }
            throw new t(j$.time.c.a("Unsupported field: ", qVar));
        }
        if (qVar != null) {
            return qVar.k(lVar);
        }
        throw new NullPointerException("field");
    }

    public static o e() {
        return b;
    }

    public static o f() {
        return f;
    }

    public static o g() {
        return g;
    }

    public static o h() {
        return d;
    }

    public static o i() {
        return c;
    }

    public static o j() {
        return e;
    }

    public static o k() {
        return a;
    }
}
