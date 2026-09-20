package defpackage;

import j$.util.DesugarTimeZone;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class qf5 {
    public static final byte[] a;
    public static final nc1 b = nc1.CQf.c(new String[0]);
    public static final yp3 c;
    public static final TimeZone d;
    public static final pl3 e;
    public static final String f;

    static {
        byte[] bArr = new byte[0];
        a = bArr;
        gg ggVar = new gg();
        ggVar.write(bArr, 0, 0);
        long j = 0;
        c = new yp3(j, ggVar);
        c(j, j, j);
        new dp3(0, 0, bArr);
        mk[] mkVarArr = {mk.QnHx.a("efbbbf"), mk.QnHx.a("feff"), mk.QnHx.a("fffe"), mk.QnHx.a("0000ffff"), mk.QnHx.a("ffff0000")};
        ArrayList arrayList = new ArrayList(new hello(mkVarArr, false));
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(5);
        for (int i = 0; i < 5; i++) {
            mk mkVar = mkVarArr[i];
            arrayList2.add(-1);
        }
        Object[] array = arrayList2.toArray(new Integer[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        Integer[] numArr = (Integer[]) array;
        ArrayList arrayListP = ps0.P(Arrays.copyOf(numArr, numArr.length));
        int i2 = 0;
        int i3 = 0;
        while (i2 < 5) {
            arrayListP.set(ps0.m(arrayList, mkVarArr[i2]), Integer.valueOf(i3));
            i2++;
            i3++;
        }
        if (!(((mk) arrayList.get(0)).c() > 0)) {
            throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
        }
        int i4 = 0;
        while (i4 < arrayList.size()) {
            mk mkVar2 = (mk) arrayList.get(i4);
            int i5 = i4 + 1;
            int i6 = i5;
            while (i6 < arrayList.size()) {
                mk mkVar3 = (mk) arrayList.get(i6);
                mkVar3.getClass();
                if (!mkVar3.m(mkVar2, mkVar2.c())) {
                    break;
                }
                if (!(mkVar3.c() != mkVar2.c())) {
                    throw new IllegalArgumentException(ur1.d(mkVar3, "duplicate option: ").toString());
                }
                if (((Number) arrayListP.get(i6)).intValue() > ((Number) arrayListP.get(i4)).intValue()) {
                    arrayList.remove(i6);
                    arrayListP.remove(i6);
                } else {
                    i6++;
                }
            }
            i4 = i5;
        }
        gg ggVar2 = new gg();
        qLd.d(0L, ggVar2, 0, arrayList, 0, arrayList.size(), arrayListP);
        int[] iArr = new int[(int) (ggVar2.x / ((long) 4))];
        int i7 = 0;
        while (!ggVar2.E()) {
            iArr[i7] = ggVar2.readInt();
            i7++;
        }
        d = DesugarTimeZone.getTimeZone("GMT");
        e = new pl3("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        String name = rt2.class.getName();
        if (mv4.R(name, "okhttp3.")) {
            name = name.substring("okhttp3.".length());
        }
        if (mv4.A(name, "Client")) {
            name = name.substring(0, name.length() - "Client".length());
        }
        f = name;
    }

    public static final boolean a(ch1 ch1Var, ch1 ch1Var2) {
        return ur1.a(ch1Var.d, ch1Var2.d) && ch1Var.e == ch1Var2.e && ur1.a(ch1Var.a, ch1Var2.a);
    }

    public static final int b(long j, TimeUnit timeUnit) {
        if (!(j >= 0)) {
            throw new IllegalStateException(ur1.d(" < 0", "timeout").toString());
        }
        if (!(timeUnit != null)) {
            throw new IllegalStateException("unit == null".toString());
        }
        long millis = timeUnit.toMillis(j);
        if (!(millis <= 2147483647L)) {
            throw new IllegalArgumentException(ur1.d(" too large.", "timeout").toString());
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException(ur1.d(" too small.", "timeout").toString());
    }

    public static final void c(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void d(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final void e(Socket socket) {
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (!ur1.a(e3.getMessage(), "bio == null")) {
                throw e3;
            }
        } catch (Exception unused) {
        }
    }

    public static final int f(char c2, int i, int i2, String str) {
        while (i < i2) {
            int i3 = i + 1;
            if (str.charAt(i) == c2) {
                return i;
            }
            i = i3;
        }
        return i2;
    }

    public static final int g(int i, int i2, String str, String str2) {
        while (i < i2) {
            int i3 = i + 1;
            if (mv4.z(str2, str.charAt(i))) {
                return i;
            }
            i = i3;
        }
        return i2;
    }

    public static /* synthetic */ int h(String str, char c2, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return f(c2, i, i2, str);
    }

    public static final String i(String str, Object... objArr) {
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final boolean j(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        if (!(strArr.length == 0) && strArr2 != null) {
            if (!(strArr2.length == 0)) {
                int length = strArr.length;
                int i = 0;
                while (i < length) {
                    String str = strArr[i];
                    i++;
                    tj1 tj1Var = new tj1(strArr2);
                    while (tj1Var.hasNext()) {
                        if (comparator.compare(str, (String) tj1Var.next()) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long k(xp3 xp3Var) {
        String strA = xp3Var.B.a("Content-Length");
        if (strA != null) {
            try {
                return Long.parseLong(strA);
            } catch (NumberFormatException unused) {
            }
        }
        return -1L;
    }

    @SafeVarargs
    public static final <T> List<T> l(T... tArr) {
        Object[] objArr = (Object[]) tArr.clone();
        return Collections.unmodifiableList(ps0.M(Arrays.copyOf(objArr, objArr.length)));
    }

    public static final int m(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (ur1.b(cCharAt, 31) <= 0 || ur1.b(cCharAt, 127) >= 0) {
                return i;
            }
            i = i2;
        }
        return -1;
    }

    public static final int n(int i, int i2, String str) {
        while (i < i2) {
            int i3 = i + 1;
            char cCharAt = str.charAt(i);
            if (!((((cCharAt == '\t' || cCharAt == '\n') || cCharAt == '\f') || cCharAt == '\r') || cCharAt == ' ')) {
                return i;
            }
            i = i3;
        }
        return i2;
    }

    public static final int o(int i, int i2, String str) {
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                int i4 = i3 - 1;
                char cCharAt = str.charAt(i3);
                if (!((((cCharAt == '\t' || cCharAt == '\n') || cCharAt == '\f') || cCharAt == '\r') || cCharAt == ' ')) {
                    return i3 + 1;
                }
                if (i3 != i) {
                    i3 = i4;
                }
            }
        }
        return i;
    }

    public static final String[] p(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            i++;
            int length2 = strArr2.length;
            int i2 = 0;
            while (i2 < length2) {
                String str2 = strArr2[i2];
                i2++;
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public static final boolean q(String str) {
        return iv4.r(str, "Authorization") || iv4.r(str, "Cookie") || iv4.r(str, "Proxy-Authorization") || iv4.r(str, "Set-Cookie");
    }

    public static final int r(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        char c3 = 'a';
        if (!('a' <= c2 && c2 < 'g')) {
            c3 = 'A';
            if (!('A' <= c2 && c2 < 'G')) {
                return -1;
            }
        }
        return (c2 - c3) + 10;
    }

    public static final boolean s(nq4 nq4Var, int i, TimeUnit timeUnit) {
        long jNanoTime = System.nanoTime();
        long jC = nq4Var.d().e() ? nq4Var.d().c() - jNanoTime : Long.MAX_VALUE;
        nq4Var.d().d(Math.min(jC, timeUnit.toNanos(i)) + jNanoTime);
        try {
            gg ggVar = new gg();
            while (nq4Var.p(ggVar, 8192L) != -1) {
                ggVar.skip(ggVar.x);
            }
            if (jC == Long.MAX_VALUE) {
                nq4Var.d().a();
            } else {
                nq4Var.d().d(jNanoTime + jC);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                nq4Var.d().a();
            } else {
                nq4Var.d().d(jNanoTime + jC);
            }
            return false;
        } catch (Throwable th) {
            if (jC == Long.MAX_VALUE) {
                nq4Var.d().a();
            } else {
                nq4Var.d().d(jNanoTime + jC);
            }
            throw th;
        }
    }

    public static final nc1 t(List<cc1> list) {
        nc1.QnHx qnHx = new nc1.QnHx();
        for (cc1 cc1Var : list) {
            qnHx.a(cc1Var.a.p(), cc1Var.b.p());
        }
        return qnHx.b();
    }

    public static final String u(ch1 ch1Var, boolean z) {
        int i;
        String str = ch1Var.d;
        if (mv4.y(str, ":", false)) {
            str = "[" + str + ']';
        }
        int i2 = ch1Var.e;
        if (!z) {
            String str2 = ch1Var.a;
            if (ur1.a(str2, "http")) {
                i = 80;
            } else {
                i = ur1.a(str2, "https") ? 443 : -1;
            }
            if (i2 == i) {
                return str;
            }
        }
        return str + ':' + i2;
    }

    public static final <T> List<T> v(List<? extends T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static final int w(int i, String str) {
        Long lValueOf;
        if (str == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException unused) {
                return i;
            }
        }
        if (lValueOf == null) {
            return i;
        }
        long jLongValue = lValueOf.longValue();
        if (jLongValue > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (jLongValue < 0) {
            return 0;
        }
        return (int) jLongValue;
    }

    public static final String x(int i, int i2, String str) {
        int iN = n(i, i2, str);
        return str.substring(iN, o(iN, i2, str));
    }

    public static final void y(IOException iOException, List list) {
        if (list.size() > 1) {
            System.out.println(list);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Th.a(iOException, (Exception) it.next());
        }
    }
}
