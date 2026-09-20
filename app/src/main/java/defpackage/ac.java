package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.ComponentActivity;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public final class ac implements cv5 {
    public static ej1 a;
    public static ej1 c;
    public static final v52 b = new v52(new fp1(), new FWT(), new XTd3());
    public static final /* synthetic */ ac d = new ac();

    public static final n80 b(tf1 tf1Var) {
        oc1 oc1VarA = tf1Var.a();
        List<String> list = rf1.a;
        String strG = oc1VarA.g("Content-Type");
        if (strG == null) {
            return null;
        }
        n80 n80Var = n80.e;
        return n80.CQf.a(strG);
    }

    public static final rv1 c(Collection collection, lb4 lb4Var) {
        Collection collection2 = collection;
        ArrayList arrayListF0 = wu.F0(collection2);
        ArrayList arrayList = new ArrayList(mu.w0(arrayListF0, 10));
        Iterator it = arrayListF0.iterator();
        while (it.hasNext()) {
            arrayList.add(f(it.next(), lb4Var));
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(((rv1) obj).a().a())) {
                arrayList2.add(obj);
            }
        }
        boolean z = true;
        if (arrayList2.size() > 1) {
            StringBuilder sb = new StringBuilder("Serializing collections of different element types is not yet supported. Selected serializers: ");
            ArrayList arrayList3 = new ArrayList(mu.w0(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((rv1) it2.next()).a().a());
            }
            sb.append(arrayList3);
            throw new IllegalStateException(sb.toString().toString());
        }
        rv1<String> rv1VarSerializer = (rv1) wu.X0(arrayList2);
        if (rv1VarSerializer == null) {
            rv1VarSerializer = ii.serializer(pu4.a);
        }
        if (rv1VarSerializer.a().c()) {
            return rv1VarSerializer;
        }
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            z = false;
        } else {
            Iterator it3 = collection2.iterator();
            while (it3.hasNext()) {
                if (it3.next() == null) {
                }
            }
            z = false;
        }
        return z ? ii.b(rv1VarSerializer) : rv1VarSerializer;
    }

    public static r91 d(Future future) {
        if (future != null) {
            return new r91(future);
        }
        throw new NullPointerException("future is null");
    }

    public static final xq0 e(ComponentActivity componentActivity) {
        String packageName = componentActivity.getPackageName();
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", packageName, null));
        try {
            componentActivity.startActivity(intent);
            return new xq0.CQf(sd5.a);
        } catch (ActivityNotFoundException e) {
            return new xq0.QnHx(e);
        } catch (IllegalStateException e2) {
            return new xq0.QnHx(e2);
        }
    }

    public static final rv1 f(Object obj, lb4 lb4Var) {
        rv1 rv1VarB;
        rv1 rv1VarF;
        pu4 pu4Var = pu4.a;
        if (obj == null) {
            return ii.b(ii.serializer(pu4Var));
        }
        if (obj instanceof List) {
            return ii.a(c((Collection) obj, lb4Var));
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            Object obj2 = objArr.length == 0 ? null : objArr[0];
            return (obj2 == null || (rv1VarF = f(obj2, lb4Var)) == null) ? ii.a(ii.serializer(pu4Var)) : rv1VarF;
        }
        if (obj instanceof Set) {
            rv1VarB = new p350(c((Collection) obj, lb4Var), 1);
        } else if (obj instanceof Map) {
            Map map = (Map) obj;
            rv1VarB = new v32(c(map.keySet(), lb4Var), c(map.values(), lb4Var));
        } else {
            rv1VarB = lb4Var.b(nl3.a(obj.getClass()), cs0.w);
            if (rv1VarB == null) {
                return ib4.serializer(nl3.a(obj.getClass()));
            }
        }
        return rv1VarB;
    }

    public static final void g(int i) {
        throw new EOFException(ex0.b("Premature end of stream: expected ", i, " bytes"));
    }

    public static byte[] h(hk hkVar) throws Throwable {
        long j = ((long) (hkVar.A - hkVar.z)) + hkVar.B;
        if (j > 2147483647L) {
            throw new IllegalArgumentException("Unable to convert to a ByteArray: packet is too big");
        }
        int i = (int) j;
        if (i == 0) {
            return YKK.F;
        }
        byte[] bArr = new byte[i];
        boolean z = true;
        oq oqVarG = YKK.g(hkVar, 1);
        if (oqVarG != null) {
            int i2 = 0;
            while (true) {
                try {
                    int iMin = Math.min(i, oqVarG.c - oqVarG.b);
                    i(oqVarG, bArr, i2, iMin);
                    i -= iMin;
                    i2 += iMin;
                    if (!(i > 0)) {
                        break;
                    }
                    try {
                        oq oqVarH = YKK.h(hkVar, oqVarG);
                        if (oqVarH == null) {
                            z = false;
                            break;
                        }
                        oqVarG = oqVarH;
                    } catch (Throwable th) {
                        th = th;
                        z = false;
                        if (z) {
                            YKK.b(hkVar, oqVarG);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (z) {
                YKK.b(hkVar, oqVarG);
            }
        }
        if (i <= 0) {
            return bArr;
        }
        g(i);
        throw null;
    }

    public static final void i(oq oqVar, byte[] bArr, int i, int i2) throws EOFException {
        int i3 = oqVar.b;
        if (oqVar.c - i3 < i2) {
            throw new EOFException("Not enough bytes to read a byte array of size " + i2 + '.');
        }
        ByteBuffer byteBuffer = oqVar.a;
        if (!byteBuffer.hasArray() || byteBuffer.isReadOnly()) {
            byteBuffer.duplicate().get(bArr, i, i2);
        } else {
            System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset() + i3, bArr, i, i2);
        }
        sd5 sd5Var = sd5.a;
        oqVar.c(i2);
    }

    public static final rv1 j(rb5 rb5Var, lb4 lb4Var) {
        rv1 rv1VarB;
        sv1 sv1Var = rb5Var.c;
        boolean z = false;
        if (sv1Var != null) {
            rv1<Object> rv1VarA = sv1Var.c().isEmpty() ? null : kb4.a(lb4Var, sv1Var, false);
            if (rv1VarA != null) {
                return rv1VarA;
            }
        }
        cs0 cs0Var = cs0.w;
        fv1<?> fv1Var = rb5Var.a;
        rv1 rv1VarB2 = lb4Var.b(fv1Var, cs0Var);
        sv1 sv1Var2 = rb5Var.c;
        if (rv1VarB2 != null) {
            if (sv1Var2 != null && sv1Var2.a()) {
                z = true;
            }
            if (z) {
                rv1VarB = ii.b(rv1VarB2);
                return rv1VarB;
            }
            return rv1VarB2;
        }
        rv1VarB2 = ib4.serializer(fv1Var);
        if (sv1Var2 != null && sv1Var2.a()) {
            z = true;
        }
        if (z) {
            rv1VarB = ii.b(rv1VarB2);
            return rv1VarB;
        }
        return rv1VarB2;
    }

    public static final wj4 k(g30 g30Var) {
        g30Var.e(-1226051879);
        ak1 ak1Var = (ak1) f43.a.getValue();
        e40.CQf cQf = e40.a;
        g30Var.e(291190016);
        long jB = yu.b(((rv) g30Var.E(sv.a)).k(), 0.75f);
        g30Var.G();
        wj4 wj4Var = new wj4(jB, ak1Var, 0.6f);
        g30Var.G();
        return wj4Var;
    }

    public static final int l(int i, int i2) {
        return ur1.b(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE);
    }

    public static final int m(long j, long j2) {
        long j3 = j ^ Long.MIN_VALUE;
        long j4 = j2 ^ Long.MIN_VALUE;
        if (j3 < j4) {
            return -1;
        }
        return j3 == j4 ? 0 : 1;
    }

    public static final double n(long j) {
        return ((j >>> 11) * ((double) 2048)) + (j & 2047);
    }

    public static final void o(pw2 pw2Var, CharSequence charSequence, int i, int i2, Charset charset) {
        int i3;
        if (charset != up.a) {
            ps0.B(charset.newEncoder(), pw2Var, charSequence, i, i2);
            return;
        }
        oq oqVarI = YKK.i(pw2Var, 1, null);
        while (true) {
            try {
                int iC = ps0.C(oqVarI.a, charSequence, i, i2, oqVarI.c, oqVarI.e);
                int i4 = ((short) (iC >>> 16)) & 65535;
                i += i4;
                oqVarI.a(((short) (iC & 65535)) & 65535);
                if (i4 != 0 || i >= i2) {
                    i3 = i < i2 ? 1 : 0;
                } else {
                    i3 = 8;
                }
                if (i3 <= 0) {
                    pw2Var.b();
                    return;
                }
                oqVarI = YKK.i(pw2Var, i3, oqVarI);
            } catch (Throwable th) {
                pw2Var.b();
                throw th;
            }
        }
    }

    public static int p(int i) {
        int[] iArr = {1, 2, 3};
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }

    public static hu5 q(hu5 hu5Var, ma5 ma5Var, az5 az5Var, Boolean bool, Boolean bool2) {
        hu5 hu5Var2 = new hu5();
        Iterator itG = hu5Var.g();
        while (itG.hasNext()) {
            int iIntValue = ((Integer) itG.next()).intValue();
            if (hu5Var.r(iIntValue)) {
                ez5 ez5VarD = az5Var.d(ma5Var, Arrays.asList(hu5Var.e(iIntValue), new gw5(Double.valueOf(iIntValue)), hu5Var));
                if (ez5VarD.zzg().equals(bool)) {
                    return hu5Var2;
                }
                if (bool2 == null || ez5VarD.zzg().equals(bool2)) {
                    hu5Var2.p(iIntValue, ez5VarD);
                }
            }
        }
        return hu5Var2;
    }

    public static ez5 r(hu5 hu5Var, ma5 ma5Var, ArrayList arrayList, boolean z) {
        ez5 ez5VarD;
        nw6.i("reduce", 1, arrayList);
        nw6.j("reduce", 2, arrayList);
        ez5 ez5VarB = ma5Var.b((ez5) arrayList.get(0));
        if (!(ez5VarB instanceof uw5)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (arrayList.size() == 2) {
            ez5VarD = ma5Var.b((ez5) arrayList.get(1));
            if (ez5VarD instanceof uv5) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (hu5Var.d() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            ez5VarD = null;
        }
        uw5 uw5Var = (uw5) ez5VarB;
        int iD = hu5Var.d();
        int i = z ? 0 : iD - 1;
        int i2 = z ? iD - 1 : 0;
        int i3 = true == z ? 1 : -1;
        if (ez5VarD == null) {
            ez5VarD = hu5Var.e(i);
            i += i3;
        }
        while ((i2 - i) * i3 >= 0) {
            if (hu5Var.r(i)) {
                ez5VarD = uw5Var.d(ma5Var, Arrays.asList(ez5VarD, hu5Var.e(i), new gw5(Double.valueOf(i)), hu5Var));
                if (ez5VarD instanceof uv5) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i += i3;
            } else {
                i += i3;
            }
        }
        return ez5VarD;
    }

    @Override // defpackage.cv5
    public String a(String str, String str2) {
        return null;
    }
}
