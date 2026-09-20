package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class m57 implements b91, ILoggerFactory, qf6 {
    public static ej1 C;
    public static final sy4 w = new sy4((Object) null);
    public static final sy4 x = new sy4((Object) null);
    public static final sy4 y = new sy4((Object) null);
    public static final sy4 z = new sy4((Object) null);
    public static final sy4 A = new sy4((Object) null);
    public static final i32 B = new i32();
    public static final char[] D = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final /* synthetic */ m57 E = new m57();

    public static final int c(char c) {
        boolean z2 = false;
        if ('0' <= c && c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if (!('a' <= c && c <= 'f')) {
            c2 = 'A';
            if ('A' <= c && c <= 'F') {
                z2 = true;
            }
            if (!z2) {
                throw new IllegalArgumentException(ur1.d(Character.valueOf(c), "Unexpected hex digit: "));
            }
        }
        return (c - c2) + 10;
    }

    public static final ew2 d(ro0 ro0Var, dj4 dj4Var, long j, g43 g43Var, float f, ew2 ew2Var, jy1 jy1Var, cm4 cm4Var) {
        ew2 ew2VarA = null;
        if (dj4Var == el3.a) {
            qo0.i(ro0Var, j, 0L, 0L, 0.0f, null, 126);
            if (g43Var != null) {
                qo0.h(ro0Var, g43Var.a(ro0Var.d(), f), 0L, 0L, g43Var.c(f), null, 118);
            }
        } else {
            ew2VarA = cm4.a(ro0Var.d(), cm4Var) && ro0Var.getLayoutDirection() == jy1Var ? ew2Var : null;
            if (ew2VarA == null) {
                ew2VarA = dj4Var.a(ro0Var.d(), ro0Var.getLayoutDirection(), ro0Var);
            }
            Cz.j(ro0Var, ew2VarA, j);
            if (g43Var != null) {
                Cz.i(ro0Var, ew2VarA, g43Var.a(ro0Var.d(), f), g43Var.c(f));
            }
        }
        return ew2VarA;
    }

    public static final ej1 e() {
        ej1 ej1Var = C;
        if (ej1Var != null) {
            return ej1Var;
        }
        ej1.QnHx qnHx = new ej1.QnHx("Outlined.VolumeUp");
        int i = sg5.a;
        jq4 jq4Var = new jq4(yu.b);
        le3 le3Var = new le3();
        le3Var.i(3.0f, 9.0f);
        le3Var.n(6.0f);
        le3Var.f(4.0f);
        le3Var.h(5.0f, 5.0f);
        le3Var.g(12.0f, 4.0f);
        le3Var.g(7.0f, 9.0f);
        le3Var.g(3.0f, 9.0f);
        le3Var.b();
        le3Var.i(10.0f, 8.83f);
        le3Var.n(6.34f);
        le3Var.g(7.83f, 13.0f);
        le3Var.g(5.0f, 13.0f);
        le3Var.n(-2.0f);
        le3Var.f(2.83f);
        le3Var.g(10.0f, 8.83f);
        le3Var.b();
        le3Var.i(16.5f, 12.0f);
        le3Var.d(0.0f, -1.77f, -1.02f, -3.29f, -2.5f, -4.03f);
        le3Var.n(8.05f);
        le3Var.d(1.48f, -0.73f, 2.5f, -2.25f, 2.5f, -4.02f);
        le3Var.b();
        le3Var.i(14.0f, 3.23f);
        le3Var.n(2.06f);
        le3Var.d(2.89f, 0.86f, 5.0f, 3.54f, 5.0f, 6.71f);
        le3Var.k(-2.11f, 5.85f, -5.0f, 6.71f);
        le3Var.n(2.06f);
        le3Var.d(4.01f, -0.91f, 7.0f, -4.49f, 7.0f, -8.77f);
        le3Var.d(0.0f, -4.28f, -2.99f, -7.86f, -7.0f, -8.77f);
        le3Var.b();
        qnHx.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var, null, "", le3Var.a);
        ej1 ej1VarD = qnHx.d();
        C = ej1VarD;
        return ej1VarD;
    }

    public static final w55 f(w55 w55Var, jy1 jy1Var) {
        z42 z42Var;
        int i = tq4.e;
        rq4 rq4Var = w55Var.a;
        h25 h25VarC = rq4Var.a.c(sq4.w);
        long j = rq4Var.b;
        if (FWT.D(j)) {
            j = tq4.a;
        }
        long j2 = j;
        x41 x41Var = rq4Var.c;
        if (x41Var == null) {
            x41Var = x41.z;
        }
        x41 x41Var2 = x41Var;
        v41 v41Var = rq4Var.d;
        v41 v41Var2 = new v41(v41Var != null ? v41Var.a : 0);
        w41 w41Var = rq4Var.e;
        w41 w41Var2 = new w41(w41Var != null ? w41Var.a : 1);
        e41 e41Var = rq4Var.f;
        if (e41Var == null) {
            e41Var = e41.w;
        }
        e41 e41Var2 = e41Var;
        String str = rq4Var.g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j3 = rq4Var.h;
        if (FWT.D(j3)) {
            j3 = tq4.b;
        }
        x8 x8Var = rq4Var.i;
        x8 x8Var2 = new x8(x8Var != null ? x8Var.a : 0.0f);
        a55 a55Var = rq4Var.j;
        if (a55Var == null) {
            a55Var = a55.c;
        }
        a55 a55Var2 = a55Var;
        z42 z42Var2 = rq4Var.k;
        if (z42Var2 == null) {
            List<d53> listA = f53.a.a();
            ArrayList arrayList = new ArrayList(listA.size());
            int i2 = 0;
            for (int size = listA.size(); i2 < size; size = size) {
                arrayList.add(new y42(listA.get(i2)));
                i2++;
                listA = listA;
            }
            z42Var = new z42(arrayList);
        } else {
            z42Var = z42Var2;
        }
        long j4 = yu.h;
        long j5 = rq4Var.l;
        long j6 = (j5 > j4 ? 1 : (j5 == j4 ? 0 : -1)) != 0 ? j5 : tq4.c;
        a25 a25Var = rq4Var.m;
        if (a25Var == null) {
            a25Var = a25.b;
        }
        a25 a25Var2 = a25Var;
        yi4 yi4Var = rq4Var.n;
        if (yi4Var == null) {
            yi4Var = yi4.d;
        }
        rq4 rq4Var2 = new rq4(h25VarC, j2, x41Var2, v41Var2, w41Var2, e41Var2, str2, j3, x8Var2, a55Var2, z42Var, j6, a25Var2, yi4Var, rq4Var.o);
        int i3 = cz2.b;
        bz2 bz2Var = w55Var.b;
        q15 q15Var = bz2Var.a;
        int i4 = 5;
        q15 q15Var2 = new q15(q15Var != null ? q15Var.a : 5);
        d25 d25Var = bz2Var.b;
        if (d25Var != null && d25Var.a == 3) {
            int iOrdinal = jy1Var.ordinal();
            if (iOrdinal == 0) {
                i4 = 4;
            } else if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (d25Var == null) {
            int iOrdinal2 = jy1Var.ordinal();
            if (iOrdinal2 == 0) {
                i4 = 1;
            } else {
                if (iOrdinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                i4 = 2;
            }
        } else {
            i4 = d25Var.a;
        }
        d25 d25Var2 = new d25(i4);
        long j7 = bz2Var.c;
        if (FWT.D(j7)) {
            j7 = cz2.a;
        }
        long j8 = j7;
        b55 b55Var = bz2Var.d;
        if (b55Var == null) {
            b55Var = b55.c;
        }
        return new w55(rq4Var2, new bz2(q15Var2, d25Var2, j8, b55Var, bz2Var.e, bz2Var.f), w55Var.c);
    }

    public static String g(@CheckForNull String str, @CheckForNull Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String string;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
                    sb.append(name);
                    sb.append('@');
                    sb.append(hexString);
                    String string2 = sb.toString();
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", string2.length() != 0 ? "Exception during lenientFormat for ".concat(string2) : new String("Exception during lenientFormat for "), (Throwable) e);
                    String name2 = e.getClass().getName();
                    StringBuilder sb2 = new StringBuilder(string2.length() + 9 + name2.length());
                    sb2.append("<");
                    sb2.append(string2);
                    sb2.append(" threw ");
                    sb2.append(name2);
                    sb2.append(">");
                    string = sb2.toString();
                }
            }
            objArr[i2] = string;
            i2++;
        }
        StringBuilder sb3 = new StringBuilder((length * 16) + str.length());
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb3.append((CharSequence) str, i3, iIndexOf);
            sb3.append(objArr[i]);
            i3 = iIndexOf + 2;
            i++;
        }
        sb3.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb3.append(" [");
            sb3.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb3.append(", ");
                sb3.append(objArr[i4]);
            }
            sb3.append(']');
        }
        return sb3.toString();
    }

    @Override // defpackage.b91
    public Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        return new dh.QnHx((mg) obj2, ((Boolean) obj3).booleanValue(), ((Boolean) obj4).booleanValue(), (ad0) obj);
    }

    @Override // defpackage.ILoggerFactory
    public t52 b(String str) {
        return dj2.w;
    }

    @Override // defpackage.qf6
    public Object zza() {
        List list = lg6.a;
        return Long.valueOf(b67.x.zza().zzd());
    }
}
