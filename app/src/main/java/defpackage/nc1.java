package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class nc1 implements Iterable<uy2<? extends String, ? extends String>>, jv1 {
    public final String[] w;

    public static final class CQf {
        public static void a(String str) {
            if (!(str.length() > 0)) {
                throw new IllegalArgumentException("name is empty".toString());
            }
            int length = str.length();
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                char cCharAt = str.charAt(i);
                if (!('!' <= cCharAt && cCharAt < 127)) {
                    throw new IllegalArgumentException(qf5.i("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str).toString());
                }
                i = i2;
            }
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0023  */
        public static void b(String str, String str2) {
            boolean z;
            int length = str.length();
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                char cCharAt = str.charAt(i);
                if (cCharAt == '\t') {
                    z = true;
                } else {
                    if (' ' <= cCharAt && cCharAt < 127) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (!z) {
                    throw new IllegalArgumentException(ur1.d(qf5.q(str2) ? "" : ur1.d(str, ": "), qf5.i("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i), str2)).toString());
                }
                i = i2;
            }
        }

        public static nc1 c(String... strArr) {
            int i = 0;
            if (!(strArr.length % 2 == 0)) {
                throw new IllegalArgumentException("Expected alternating header names and values".toString());
            }
            String[] strArr2 = (String[]) strArr.clone();
            int length = strArr2.length;
            int i2 = 0;
            while (i2 < length) {
                int i3 = i2 + 1;
                String str = strArr2[i2];
                if (!(str != null)) {
                    throw new IllegalArgumentException("Headers cannot be null".toString());
                }
                strArr2[i2] = mv4.W(str).toString();
                i2 = i3;
            }
            int i4 = ddf.i(0, strArr2.length - 1, 2);
            if (i4 >= 0) {
                while (true) {
                    int i5 = i + 2;
                    String str2 = strArr2[i];
                    String str3 = strArr2[i + 1];
                    a(str2);
                    b(str3, str2);
                    if (i == i4) {
                        break;
                    }
                    i = i5;
                }
            }
            return new nc1(strArr2);
        }
    }

    public static final class QnHx {
        public final ArrayList a = new ArrayList(20);

        public final void a(String str, String str2) {
            ArrayList arrayList = this.a;
            arrayList.add(str);
            arrayList.add(mv4.W(str2).toString());
        }

        public final nc1 b() {
            Object[] array = this.a.toArray(new String[0]);
            if (array != null) {
                return new nc1((String[]) array);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        public final void c(String str) {
            int i = 0;
            while (true) {
                ArrayList arrayList = this.a;
                if (i >= arrayList.size()) {
                    return;
                }
                if (iv4.r(str, (String) arrayList.get(i))) {
                    arrayList.remove(i);
                    arrayList.remove(i);
                    i -= 2;
                }
                i += 2;
            }
        }

        public final void d(String str, String str2) {
            CQf.a(str);
            CQf.b(str2, str);
            c(str);
            a(str, str2);
        }
    }

    public nc1(String[] strArr) {
        this.w = strArr;
    }

    public final String a(String str) {
        String[] strArr = this.w;
        int length = strArr.length - 2;
        int i = ddf.i(length, 0, -2);
        if (i <= length) {
            while (true) {
                int i2 = length - 2;
                if (iv4.r(str, strArr[length])) {
                    return strArr[length + 1];
                }
                if (length != i) {
                    length = i2;
                }
            }
        }
        return null;
    }

    public final String b(int i) {
        return this.w[i * 2];
    }

    public final QnHx c() {
        QnHx qnHx = new QnHx();
        qnHx.a.addAll(Arrays.asList(this.w));
        return qnHx;
    }

    public final String e(int i) {
        return this.w[(i * 2) + 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nc1) {
            if (Arrays.equals(this.w, ((nc1) obj).w)) {
                return true;
            }
        }
        return false;
    }

    public final List<String> f(String str) {
        int length = this.w.length / 2;
        ArrayList arrayList = null;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            if (iv4.r(str, b(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(e(i));
            }
            i = i2;
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : cs0.w;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.w);
    }

    @Override // java.lang.Iterable
    public final Iterator<uy2<? extends String, ? extends String>> iterator() {
        int length = this.w.length / 2;
        uy2[] uy2VarArr = new uy2[length];
        for (int i = 0; i < length; i++) {
            uy2VarArr[i] = new uy2(b(i), e(i));
        }
        return new tj1(uy2VarArr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int length = this.w.length / 2;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            String strB = b(i);
            String strE = e(i);
            sb.append(strB);
            sb.append(": ");
            if (qf5.q(strB)) {
                strE = "██";
            }
            sb.append(strE);
            sb.append("\n");
            i = i2;
        }
        return sb.toString();
    }
}
