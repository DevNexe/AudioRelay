package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.database.Cursor;
import android.view.MotionEvent;
import androidx.activity.result.QnHx;
import com.facebook.ads.AdError;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.lang.reflect.Array;
import java.net.IDN;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.JsonEncodingException;

/* JADX INFO: loaded from: classes.dex */
public class AY implements qf6 {
    public static ej1 A;
    public static bj1 x;
    public static dn y;
    public static en z;
    public static final Object[] w = new Object[0];
    public static final /* synthetic */ AY B = new AY();

    public static float A(g30 g30Var) {
        g30Var.e(629162431);
        float fS = s(1.0f, 0.87f, g30Var);
        g30Var.G();
        return fS;
    }

    public static final ms1 B(la0 la0Var) {
        int i = ms1.j;
        ms1 ms1Var = (ms1) la0Var.j(ms1.CQf.w);
        if (ms1Var != null) {
            return ms1Var;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + la0Var).toString());
    }

    public static float C(g30 g30Var, int i) {
        g30Var.e(1999054879);
        float fS = s(0.74f, 0.6f, g30Var);
        g30Var.G();
        return fS;
    }

    public static final xm D(z80 z80Var) {
        if (!(z80Var instanceof il0)) {
            return new xm(1, z80Var);
        }
        xm xmVarH = ((il0) z80Var).h();
        if (xmVarH != null) {
            if (!xmVarH.z()) {
                xmVarH = null;
            }
            if (xmVarH != null) {
                return xmVarH;
            }
        }
        return new xm(2, z80Var);
    }

    public static final int E(pa4 pa4Var, pa4[] pa4VarArr) {
        int iHashCode = (pa4Var.a().hashCode() * 31) + Arrays.hashCode(pa4VarArr);
        int iF = pa4Var.f();
        int i = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(iF > 0)) {
                break;
            }
            int i2 = iF - 1;
            int i3 = i * 31;
            String strA = pa4Var.j(pa4Var.f() - iF).a();
            if (strA != null) {
                iHashCode2 = strA.hashCode();
            }
            i = i3 + iHashCode2;
            iF = i2;
        }
        int iF2 = pa4Var.f();
        int iHashCode3 = 1;
        while (true) {
            if (!(iF2 > 0)) {
                return (((iHashCode * 31) + i) * 31) + iHashCode3;
            }
            int i4 = iF2 - 1;
            int i5 = iHashCode3 * 31;
            xa4 xa4VarE = pa4Var.j(pa4Var.f() - iF2).e();
            iHashCode3 = i5 + (xa4VarE != null ? xa4VarE.hashCode() : 0);
            iF2 = i4;
        }
    }

    public static final boolean F(la0 la0Var) {
        int i = ms1.j;
        ms1 ms1Var = (ms1) la0Var.j(ms1.CQf.w);
        return ms1Var != null && ms1Var.c();
    }

    public static boolean G(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }

    public static final CharSequence H(int i, CharSequence charSequence) {
        if (charSequence.length() < 200) {
            return charSequence;
        }
        if (i == -1) {
            int length = charSequence.length() - 60;
            if (length <= 0) {
                return charSequence;
            }
            return "....." + charSequence.subSequence(length, charSequence.length()).toString();
        }
        int i2 = i - 30;
        int i3 = i + 30;
        String str = i2 <= 0 ? "" : ".....";
        String str2 = i3 >= charSequence.length() ? "" : ".....";
        StringBuilder sbG = Md5A.g(str);
        if (i2 < 0) {
            i2 = 0;
        }
        int length2 = charSequence.length();
        if (i3 > length2) {
            i3 = length2;
        }
        sbG.append(charSequence.subSequence(i2, i3).toString());
        sbG.append(str2);
        return sbG.toString();
    }

    public static final int I(yh3.QnHx qnHx, pp1 pp1Var) {
        try {
            if (pp1Var.isEmpty()) {
                throw new IllegalArgumentException("Cannot get random in empty range: " + pp1Var);
            }
            int i = pp1Var.w;
            int i2 = pp1Var.x;
            if (i2 < Integer.MAX_VALUE) {
                return qnHx.e(i, i2 + 1);
            }
            return i > Integer.MIN_VALUE ? qnHx.e(i - 1, i2) + 1 : qnHx.d();
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public static final g82 J(FLr fLr, j81 j81Var, g30 g30Var) {
        g30Var.e(-1408504823);
        ri2 ri2VarF0 = ps0.f0(fLr, g30Var);
        ri2 ri2VarF1 = ps0.f0(j81Var, g30Var);
        String str = (String) g7.f(new Object[0], null, null, WPy.w, g30Var, 6);
        lq0 lq0Var = o42.a;
        g30Var.e(1418020823);
        nH nHVar = (nH) g30Var.E(o42.a);
        if (nHVar == null) {
            Object baseContext = (Context) g30Var.E(Ll.b);
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof nH) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            nHVar = (nH) baseContext;
        }
        g30Var.G();
        if (nHVar == null) {
            throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner".toString());
        }
        QnHx qnHxE = nHVar.E();
        g30Var.e(-3687241);
        Object objF = g30Var.f();
        g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
        if (objF == c0132QnHx) {
            objF = new lpT1Fixed();
            g30Var.B(objF);
        }
        g30Var.G();
        lpT1Fixed lpt1 = (lpT1Fixed) objF;
        g30Var.e(-3687241);
        Object objF2 = g30Var.f();
        if (objF2 == c0132QnHx) {
            objF2 = new g82(lpt1, ri2VarF0);
            g30Var.B(objF2);
        }
        g30Var.G();
        g82 g82Var = (g82) objF2;
        wq0.c(qnHxE, str, fLr, new lrBU(lpt1, qnHxE, str, fLr, ri2VarF1), g30Var);
        g30Var.G();
        return g82Var;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0022  */
    /* JADX WARN: Code duplicated, block: B:21:? A[RETURN, SYNTHETIC] */
    public static final int K(j74 j74Var, int i) {
        int i2;
        int i3 = i + 1;
        int length = j74Var.A.length - 1;
        int i4 = 0;
        while (i4 <= length) {
            i2 = (i4 + length) >>> 1;
            int i5 = j74Var.B[i2];
            if (i5 < i3) {
                i4 = i2 + 1;
            } else {
                if (i5 <= i3) {
                    if (i2 >= 0) {
                        return i2;
                    }
                    return ~i2;
                }
                length = i2 - 1;
            }
        }
        i2 = (-i4) - 1;
        if (i2 >= 0) {
            return i2;
        }
        return ~i2;
    }

    public static final void L(z80 z80Var, z80 z80Var2) {
        try {
            kd.w(ps0.L(z80Var), sd5.a, null);
        } catch (Throwable th) {
            z80Var2.x(new fq3.QnHx(th));
            throw th;
        }
    }

    public static final np1 M(pp1 pp1Var, int i) {
        boolean z2 = i > 0;
        Integer numValueOf = Integer.valueOf(i);
        if (z2) {
            if (pp1Var.y <= 0) {
                i = -i;
            }
            return new np1(pp1Var.w, pp1Var.x, i);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
    }

    public static final int N(pa4 pa4Var, ws1 ws1Var) {
        xa4 xa4VarE = pa4Var.e();
        if (xa4VarE instanceof q93) {
            return 4;
        }
        if (!ur1.a(xa4VarE, uv4.CQf.a)) {
            if (!ur1.a(xa4VarE, uv4.F1.a)) {
                return 1;
            }
            pa4 pa4VarK = k(pa4Var.j(0), ws1Var.b);
            xa4 xa4VarE2 = pa4VarK.e();
            if ((xa4VarE2 instanceof ee3) || ur1.a(xa4VarE2, xa4.CQf.a)) {
                return 3;
            }
            if (!ws1Var.a.d) {
                throw d(pa4VarK);
            }
        }
        return 2;
    }

    public static final void O(LPt9Fixed lPt9, Number number) {
        LPt9Fixed.o(lPt9, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }

    public static final void P(int i, int i2, u83 u83Var) {
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(u83Var.e[i4]);
            }
            i3 >>>= 1;
        }
        String str = u83Var.a;
        throw new MissingFieldException(arrayList, arrayList.size() == 1 ? "Field '" + ((String) arrayList.get(0)) + "' is required for type with serial name '" + str + "', but it was missing" : "Fields " + arrayList + " are required for type with serial name '" + str + "', but they were missing", null);
    }

    public static final Object[] Q(Collection collection) {
        int size = collection.size();
        Object[] objArr = w;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArrCopyOf = new Object[size];
        int i = 0;
        while (true) {
            int i2 = i + 1;
            objArrCopyOf[i] = it.next();
            if (i2 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = 2147483645;
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
            } else if (!it.hasNext()) {
                return Arrays.copyOf(objArrCopyOf, i2);
            }
            i = i2;
        }
    }

    public static final Object[] R(Collection collection, Object[] objArr) {
        objArr.getClass();
        int size = collection.size();
        int i = 0;
        if (size == 0) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        Object[] objArrCopyOf = size <= objArr.length ? objArr : (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        while (true) {
            int i2 = i + 1;
            objArrCopyOf[i] = it.next();
            if (i2 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = 2147483645;
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
            } else if (!it.hasNext()) {
                if (objArrCopyOf != objArr) {
                    return Arrays.copyOf(objArrCopyOf, i2);
                }
                objArr[i2] = null;
                return objArr;
            }
            i = i2;
        }
    }

    public static final String S(String str) {
        int i;
        int i2 = 0;
        int i3 = -1;
        if (!mv4.y(str, ":", false)) {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                while (i < length) {
                    int i4 = i + 1;
                    char cCharAt = lowerCase.charAt(i);
                    i = (ur1.b(cCharAt, 31) > 0 && ur1.b(cCharAt, 127) < 0 && mv4.E(" #%/:?@[\\]", cCharAt, 0, false, 6) == -1) ? i4 : 0;
                    i2 = 1;
                    break;
                }
                if (i2 != 0) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressU = (iv4.x(str, "[", false) && str.endsWith("]")) ? u(1, str.length() - 1, str) : u(0, str.length(), str);
        if (inetAddressU == null) {
            return null;
        }
        byte[] address = inetAddressU.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return inetAddressU.getHostAddress();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < address.length) {
            int i7 = i5;
            while (i7 < 16 && address[i7] == 0 && address[i7 + 1] == 0) {
                i7 += 2;
            }
            int i8 = i7 - i5;
            if (i8 > i6 && i8 >= 4) {
                i3 = i5;
                i6 = i8;
            }
            i5 = i7 + 2;
        }
        gg ggVar = new gg();
        while (i2 < address.length) {
            if (i2 == i3) {
                ggVar.L(58);
                i2 += i6;
                if (i2 == 16) {
                    ggVar.L(58);
                }
            } else {
                if (i2 > 0) {
                    ggVar.L(58);
                }
                byte b = address[i2];
                byte[] bArr = qf5.a;
                ggVar.M(((b & 255) << 8) | (address[i2 + 1] & 255));
                i2 += 2;
            }
        }
        return ggVar.A();
    }

    public static final vc5 T(String str) {
        int i;
        Th.c(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        if (ur1.b(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i = 0;
        }
        int i3 = 119304647;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (ac.l(i2, i3) > 0) {
                if (i3 == 119304647) {
                    i3 = (int) ((((long) (-1)) & 4294967295L) / (4294967295L & ((long) 10)));
                    if (ac.l(i2, i3) > 0) {
                    }
                }
                return null;
            }
            int i4 = i2 * 10;
            int i5 = iDigit + i4;
            if (ac.l(i5, i4) < 0) {
                return null;
            }
            i++;
            i2 = i5;
        }
        return new vc5(i2);
    }

    public static final xc5 U(String str) {
        int i;
        long j;
        int i2 = 10;
        Th.c(10);
        int length = str.length();
        if (length != 0) {
            char cCharAt = str.charAt(0);
            if (ur1.b(cCharAt, 48) < 0) {
                i = (length != 1 && cCharAt == '+') ? 1 : 0;
            }
            long j2 = 10;
            long j3 = 0;
            long j4 = 512409557603043100L;
            while (i < length) {
                int iDigit = Character.digit((int) str.charAt(i), i2);
                if (iDigit >= 0) {
                    if (ac.m(j3, j4) <= 0) {
                        length = length;
                        j = j2;
                    } else if (j4 == 512409557603043100L) {
                        if (j2 < 0) {
                            j = j2;
                            j4 = ac.m(-1L, j) < 0 ? 0L : 1L;
                        } else {
                            j = j2;
                            long j5 = (Long.MAX_VALUE / j) << 1;
                            j4 = j5 + ((long) (ac.m((-1) - (j5 * j), j) >= 0 ? 1 : 0));
                        }
                        if (ac.m(j3, j4) > 0) {
                        }
                    }
                    long j6 = j3 * j;
                    long j7 = j4;
                    long j8 = (((long) iDigit) & 4294967295L) + j6;
                    if (ac.m(j8, j6) >= 0) {
                        i++;
                        j2 = j;
                        j3 = j8;
                        length = length;
                        j4 = j7;
                        i2 = 10;
                    }
                }
            }
            return new xc5(j3);
        }
        return null;
    }

    public static final pp1 V(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new pp1(i, i2 - 1);
        }
        pp1 pp1Var = pp1.z;
        return pp1.z;
    }

    public static final j8 W(j8 j8Var, String str, j81 j81Var) {
        ArrayList arrayList;
        List<d7> list = j8Var.e;
        Iterator<d7> it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (ur1.a(it.next().c, str)) {
                break;
            }
            i++;
        }
        ArrayList arrayList2 = new ArrayList(list);
        if (i != -1) {
            d7 d7Var = (d7) j81Var.invoke(arrayList2.get(i));
            s42.QnHx qnHx = s42.Companion;
            arrayList2.set(i, d7.a(d7Var, null, null, null, null, Th.q(), 127));
            arrayList = arrayList2;
        } else {
            String str2 = j8Var.a;
            String str3 = j8Var.b;
            d7.QnHx.F1 f1 = d7.QnHx.F1.a;
            s42.QnHx qnHx2 = s42.Companion;
            arrayList = arrayList2;
            arrayList.add(0, j81Var.invoke(new d7(str2, str3, str, "", "", f1, Th.q(), Th.q())));
        }
        sd5 sd5Var = sd5.a;
        return j8.a(j8Var, null, null, wu.e1(arrayList), null, null, false, false, null, null, 8175);
    }

    public static final j8 X(j8 j8Var, String str, Object obj, j81 j81Var) {
        List<h7> list = j8Var.d;
        Iterator<h7> it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (ur1.a(it.next().c, str)) {
                break;
            }
            i++;
        }
        ArrayList arrayList = new ArrayList(list);
        if (i != -1) {
            arrayList.set(i, j81Var.invoke(arrayList.get(i)));
        } else {
            String str2 = j8Var.a;
            String str3 = j8Var.b;
            h7.QnHx.NUlFixed nUl = h7.QnHx.NUlFixed.a;
            s42.QnHx qnHx = s42.Companion;
            arrayList.add(0, j81Var.invoke(new h7(str2, str3, str, obj, "", "", nUl, Th.q(), Th.q())));
        }
        sd5 sd5Var = sd5.a;
        return j8.a(j8Var, null, wu.e1(arrayList), null, null, null, false, false, null, null, 8183);
    }

    public static final j8 Y(j8 j8Var, String str, j81 j81Var) {
        ArrayList arrayList;
        List<q7> list = j8Var.f;
        Iterator<q7> it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (ur1.a(it.next().c, str)) {
                break;
            }
            i++;
        }
        ArrayList arrayList2 = new ArrayList(list);
        if (i != -1) {
            q7 q7Var = (q7) j81Var.invoke(arrayList2.get(i));
            s42.QnHx qnHx = s42.Companion;
            arrayList2.set(i, q7.a(q7Var, null, null, null, null, Th.q(), 127));
            arrayList = arrayList2;
        } else {
            String str2 = j8Var.a;
            String str3 = j8Var.b;
            gk4.QnHx qnHx2 = gk4.QnHx.Initial;
            q7.QnHx.NUlFixed nUl = q7.QnHx.NUlFixed.a;
            s42.QnHx qnHx3 = s42.Companion;
            arrayList = arrayList2;
            arrayList.add(0, j81Var.invoke(new q7(str2, str3, str, "", qnHx2, nUl, Th.q(), Th.q())));
        }
        sd5 sd5Var = sd5.a;
        return j8.a(j8Var, null, null, null, wu.e1(arrayList), null, false, false, null, null, 8159);
    }

    public static NUlFixed a(int i, lg lgVar, int i2) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        int i3 = i2 & 2;
        lg lgVar2 = lg.SUSPEND;
        if (i3 != 0) {
            lgVar = lgVar2;
        }
        int i4 = 1;
        if (i == -2) {
            if (lgVar == lgVar2) {
                jo.c.getClass();
                i4 = jo.QnHx.b;
            }
            return new APKI(i4, lgVar, null);
        }
        if (i == -1) {
            if (lgVar == lgVar2) {
                return new p50(null);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        if (i == 0) {
            return lgVar == lgVar2 ? new ap3(null) : new APKI(1, lgVar, null);
        }
        if (i != Integer.MAX_VALUE) {
            return (i == 1 && lgVar == lg.DROP_OLDEST) ? new p50(null) : new APKI(i, lgVar, null);
        }
        return new w32(null);
    }

    public static final JsonDecodingException b(Number number, String str, String str2) {
        return g(-1, "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) H(-1, str2)));
    }

    public static final JsonEncodingException c(Number number, String str) {
        return new JsonEncodingException("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) H(-1, str)));
    }

    public static final JsonEncodingException d(pa4 pa4Var) {
        return new JsonEncodingException("Value of type '" + pa4Var.a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + pa4Var.e() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static os1 e() {
        return new os1(null);
    }

    public static iu1 f(j81 j81Var) {
        kt1 kt1Var = new kt1(ws1.d);
        j81Var.invoke(kt1Var);
        if (kt1Var.i && !ur1.a(kt1Var.j, "type")) {
            throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified".toString());
        }
        boolean z2 = kt1Var.f;
        String str = kt1Var.g;
        if (z2) {
            if (!ur1.a(str, "    ")) {
                boolean z3 = false;
                int i = 0;
                while (true) {
                    boolean z4 = true;
                    if (i >= str.length()) {
                        z3 = true;
                        break;
                    }
                    char cCharAt = str.charAt(i);
                    if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\r' && cCharAt != '\n') {
                        z4 = false;
                    }
                    if (!z4) {
                        break;
                    }
                    i++;
                }
                if (!z3) {
                    throw new IllegalArgumentException("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had ".concat(str).toString());
                }
            }
        } else if (!ur1.a(str, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used".toString());
        }
        return new iu1(new mt1(kt1Var.a, kt1Var.c, kt1Var.d, kt1Var.e, kt1Var.f, kt1Var.b, kt1Var.g, kt1Var.h, kt1Var.i, kt1Var.j, kt1Var.k, kt1Var.l), kt1Var.m);
    }

    public static final JsonDecodingException g(int i, String str) {
        if (i >= 0) {
            str = "Unexpected JSON token at offset " + i + ": " + str;
        }
        return new JsonDecodingException(str);
    }

    public static final JsonDecodingException h(String str, CharSequence charSequence, int i) {
        return g(i, str + "\nJSON input: " + ((Object) H(i, charSequence)));
    }

    public static final void i(v05 v05Var, g15 g15Var, String str) {
        h15.h.getClass();
        h15.j.fine(g15Var.b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + v05Var.a);
    }

    public static final void j(la0 la0Var, CancellationException cancellationException) {
        int i = ms1.j;
        ms1 ms1Var = (ms1) la0Var.j(ms1.CQf.w);
        if (ms1Var != null) {
            ms1Var.m(cancellationException);
        }
    }

    public static final pa4 k(pa4 pa4Var, lb4 lb4Var) {
        pa4 pa4VarK;
        rv1 rv1VarB;
        if (!ur1.a(pa4Var.e(), xa4.QnHx.a)) {
            return pa4Var.h() ? k(pa4Var.j(0), lb4Var) : pa4Var;
        }
        fv1 fv1VarX = x(pa4Var);
        pa4 pa4VarA = (fv1VarX == null || (rv1VarB = lb4Var.b(fv1VarX, cs0.w)) == null) ? null : rv1VarB.a();
        return (pa4VarA == null || (pa4VarK = k(pa4VarA, lb4Var)) == null) ? pa4Var : pa4VarK;
    }

    public static final byte l(char c) {
        if (c < '~') {
            return lp.b[c];
        }
        return (byte) 0;
    }

    public static final double m(double d, double d2, double d3) {
        if (d2 <= d3) {
            if (d < d2) {
                return d2;
            }
            return d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
    }

    public static final float n(float f, float f2, float f3) {
        if (f2 <= f3) {
            if (f < f2) {
                return f2;
            }
            return f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    public static final int o(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i < i2) {
                return i2;
            }
            return i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static final long p(long j, long j2, long j3) {
        if (j2 <= j3) {
            if (j < j2) {
                return j2;
            }
            return j > j3 ? j3 : j;
        }
        StringBuilder sbB = qc0.b("Cannot coerce value to an empty range: maximum ", j3, " is less than minimum ");
        sbB.append(j2);
        sbB.append('.');
        throw new IllegalArgumentException(sbB.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final long q(long j, o62 o62Var) {
        if (o62Var instanceof rt) {
            return ((Number) r(Long.valueOf(j), (rt) o62Var)).longValue();
        }
        if (!o62Var.isEmpty()) {
            if (j < ((Number) o62Var.b()).longValue()) {
                return ((Number) o62Var.b()).longValue();
            }
            return j > ((Number) o62Var.e()).longValue() ? ((Number) o62Var.e()).longValue() : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + o62Var + '.');
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Comparable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Comparable] */
    public static final Comparable r(Comparable comparable, rt rtVar) {
        if (rtVar.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + rtVar + '.');
        }
        if (!rtVar.a(comparable, rtVar.b()) || rtVar.a(rtVar.b(), comparable)) {
            return (!rtVar.a(rtVar.e(), comparable) || rtVar.a(comparable, rtVar.e())) ? comparable : rtVar.e();
        }
        return rtVar.b();
    }

    public static float s(float f, float f2, g30 g30Var) {
        g30Var.e(-1528360391);
        long j = ((yu) g30Var.E(r70.a)).a;
        if (!((rv) g30Var.E(sv.a)).l() ? hH.s(j) >= 0.5d : hH.s(j) <= 0.5d) {
            f = f2;
        }
        g30Var.G();
        return f;
    }

    public static final void t(int i, int i2) {
        if (i > i2) {
            throw new IndexOutOfBoundsException(bj0.a("toIndex (", i, ") is greater than size (", i2, ")."));
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:49:0x008d A[LOOP:2: B:24:0x004a->B:49:0x008d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b7 A[LOOP:1: B:60:0x00a9->B:64:0x00b7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:87:0x00bd A[EDGE_INSN: B:87:0x00bd->B:65:0x00bd BREAK  A[LOOP:1: B:60:0x00a9->B:64:0x00b7], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x009e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0088 A[SYNTHETIC] */
    public static final InetAddress u(int i, int i2, String str) {
        boolean z2;
        int i3;
        int i4;
        char cCharAt;
        int i5;
        int i6;
        int iR;
        int i7 = 16;
        byte[] bArr = new byte[16];
        int i8 = -1;
        boolean z3 = false;
        int i9 = 0;
        int i10 = -1;
        int i11 = -1;
        int i12 = i;
        while (i12 < i2) {
            if (i9 == i7) {
                return null;
            }
            int i13 = i12 + 2;
            if (i13 <= i2 && iv4.w(str, i12, "::", z3)) {
                if (i10 != i8) {
                    return null;
                }
                i9 += 2;
                i10 = i9;
                if (i13 == i2) {
                    break;
                }
                i11 = i13;
                i12 = i11;
                i5 = 0;
                while (i12 < i2) {
                    iR = qf5.r(str.charAt(i12));
                    if (iR == -1) {
                        break;
                        break;
                    }
                    i5 = (i5 << 4) + iR;
                    i12++;
                }
                i6 = i12 - i11;
                if (i6 != 0) {
                }
                return null;
            }
            if (i9 != 0) {
                if (!iv4.w(str, i12, ":", z3)) {
                    if (!iv4.w(str, i12, ".", z3)) {
                        return null;
                    }
                    int i14 = i9 - 2;
                    int i15 = i14;
                    loop2: while (true) {
                        if (i11 >= i2) {
                            if (i15 == i14 + 4) {
                                z2 = true;
                                break;
                            }
                        } else if (i15 != i7) {
                            if (i15 == i14) {
                                i3 = i11;
                                i4 = 0;
                                while (true) {
                                    if (i3 < i2) {
                                        cCharAt = str.charAt(i3);
                                        if (ur1.b(cCharAt, 48) < 0 && ur1.b(cCharAt, 57) <= 0) {
                                            if ((i4 != 0 || i11 == i3) && (i4 = ((i4 * 10) + cCharAt) - 48) <= 255) {
                                                i3++;
                                            }
                                        }
                                    }
                                    if (i3 - i11 == 0) {
                                        bArr[i15] = (byte) i4;
                                        i15++;
                                        i11 = i3;
                                        i7 = 16;
                                    }
                                }
                            } else if (str.charAt(i11) == '.') {
                                i11++;
                                i3 = i11;
                                i4 = 0;
                                while (true) {
                                    if (i3 < i2) {
                                        cCharAt = str.charAt(i3);
                                        if (ur1.b(cCharAt, 48) < 0) {
                                        }
                                    }
                                    if (i3 - i11 == 0) {
                                        bArr[i15] = (byte) i4;
                                        i15++;
                                        i11 = i3;
                                        i7 = 16;
                                    }
                                    i3++;
                                }
                            }
                        }
                        z2 = false;
                        break loop2;
                    }
                    if (!z2) {
                        return null;
                    }
                    i9 += 2;
                    break;
                }
                i12++;
            }
            i11 = i12;
            i12 = i11;
            i5 = 0;
            while (i12 < i2) {
                iR = qf5.r(str.charAt(i12));
                if (iR == -1) {
                    break;
                }
                i5 = (i5 << 4) + iR;
                i12++;
            }
            i6 = i12 - i11;
            if (i6 != 0 || i6 > 4) {
                return null;
            }
            int i16 = i9 + 1;
            bArr[i9] = (byte) ((i5 >>> 8) & 255);
            i9 = i16 + 1;
            bArr[i16] = (byte) (i5 & 255);
            i7 = 16;
            i8 = -1;
            z3 = false;
        }
        if (i9 != 16) {
            if (i10 == -1) {
                return null;
            }
            int i17 = i9 - i10;
            System.arraycopy(bArr, i10, bArr, 16 - i17, i17);
            Arrays.fill(bArr, i10, (16 - i9) + i10, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    public static final void v(la0 la0Var) {
        ms1 ms1Var = (ms1) la0Var.j(ms1.CQf.w);
        if (ms1Var != null && !ms1Var.c()) {
            throw ms1Var.P();
        }
    }

    public static final String w(long j) {
        String str;
        if (j <= -999500000) {
            str = ((j - ((long) 500000000)) / ((long) 1000000000)) + " s ";
        } else if (j <= -999500) {
            str = ((j - ((long) 500000)) / ((long) UtilsKt.MICROS_MULTIPLIER)) + " ms";
        } else if (j <= 0) {
            str = ((j - ((long) RCHTTPStatusCodes.ERROR)) / ((long) AdError.NETWORK_ERROR_CODE)) + " µs";
        } else if (j < 999500) {
            str = ((j + ((long) RCHTTPStatusCodes.ERROR)) / ((long) AdError.NETWORK_ERROR_CODE)) + " µs";
        } else if (j < 999500000) {
            str = ((j + ((long) 500000)) / ((long) UtilsKt.MICROS_MULTIPLIER)) + " ms";
        } else {
            str = ((j + ((long) 500000000)) / ((long) 1000000000)) + " s ";
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
    }

    public static final fv1 x(pa4 pa4Var) {
        if (pa4Var instanceof t80) {
            return ((t80) pa4Var).b;
        }
        if (pa4Var instanceof qa4) {
            return x(((qa4) pa4Var).a);
        }
        return null;
    }

    public static int y(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        return cursor.getColumnIndexOrThrow("`" + str + "`");
    }

    public static float z(g30 g30Var) {
        g30Var.e(621183615);
        float fS = s(0.38f, 0.38f, g30Var);
        g30Var.G();
        return fS;
    }

    @Override // defpackage.qf6
    public Object zza() {
        List list = lg6.a;
        return Boolean.valueOf(((r77) p77.x.w.zza()).zza());
    }
}
