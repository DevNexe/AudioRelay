package defpackage;

import com.google.android.gms.internal.ads.DzVS;
import com.google.android.gms.internal.ads.zzgmo;
import com.google.android.gms.internal.ads.zzgnf;
import com.google.android.gms.internal.ads.zzgnu;
import com.google.android.gms.internal.ads.zzgor;
import com.google.android.gms.internal.ads.zzgpd;
import com.google.android.gms.internal.ads.zzgpf;
import com.google.android.gms.internal.ads.zzgpx;
import com.google.protobuf.ta;
import com.google.protobuf.v2zj;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class xu6 {
    public static final Class a = ta.class;
    public static final hv6 b = v(false);
    public static final hv6 c = v(true);
    public static final DzVS d = new DzVS();

    public static int A(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgnu.zzE(i << 3) + 4) * size;
    }

    public static int B(List list) {
        return list.size() * 4;
    }

    public static int C(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgnu.zzE(i << 3) + 8) * size;
    }

    public static int D(List list) {
        return list.size() * 8;
    }

    public static int E(int i, List list, wu6 wu6Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iC = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iC += zzgnu.c(i, (zzgpx) list.get(i2), wu6Var);
        }
        return iC;
    }

    public static int F(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgnu.zzD(i) * size) + G(list);
    }

    public static int G(List list) {
        int iZzy;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof yt6) {
            yt6 yt6Var = (yt6) list;
            iZzy = 0;
            while (i < size) {
                yt6Var.b(i);
                iZzy += zzgnu.zzy(yt6Var.x[i]);
                i++;
            }
        } else {
            iZzy = 0;
            while (i < size) {
                iZzy += zzgnu.zzy(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iZzy;
    }

    public static int H(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzgnu.zzD(i) * list.size()) + I(list);
    }

    public static int I(List list) {
        int iZzF;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof eu6) {
            eu6 eu6Var = (eu6) list;
            iZzF = 0;
            while (i < size) {
                eu6Var.c(i);
                iZzF += zzgnu.zzF(eu6Var.x[i]);
                i++;
            }
        } else {
            iZzF = 0;
            while (i < size) {
                iZzF += zzgnu.zzF(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return iZzF;
    }

    public static int J(int i, wu6 wu6Var, Object obj) {
        if (obj instanceof zzgpd) {
            int iZzE = zzgnu.zzE(i << 3);
            int iZza = ((zzgpd) obj).zza();
            return zzgnu.zzE(iZza) + iZza + iZzE;
        }
        int iZzE2 = zzgnu.zzE(i << 3);
        zzgmo zzgmoVar = (zzgmo) ((zzgpx) obj);
        int iA = zzgmoVar.a();
        if (iA == -1) {
            iA = wu6Var.zza(zzgmoVar);
            zzgmoVar.c(iA);
        }
        return zzgnu.zzE(iA) + iA + iZzE2;
    }

    public static int K(int i, List list, wu6 wu6Var) {
        int iZzE;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzD = zzgnu.zzD(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof zzgpd) {
                iZzE = zzgnu.zzz((zzgpd) obj);
            } else {
                zzgmo zzgmoVar = (zzgmo) ((zzgpx) obj);
                int iA = zzgmoVar.a();
                if (iA == -1) {
                    iA = wu6Var.zza(zzgmoVar);
                    zzgmoVar.c(iA);
                }
                iZzE = zzgnu.zzE(iA) + iA;
            }
            iZzD += iZzE;
        }
        return iZzD;
    }

    public static int L(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgnu.zzD(i) * size) + M(list);
    }

    public static int M(List list) {
        int iZzE;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof yt6) {
            yt6 yt6Var = (yt6) list;
            iZzE = 0;
            while (i < size) {
                yt6Var.b(i);
                int i2 = yt6Var.x[i];
                iZzE += zzgnu.zzE((i2 >> 31) ^ (i2 + i2));
                i++;
            }
        } else {
            iZzE = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iZzE += zzgnu.zzE((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
        }
        return iZzE;
    }

    public static int N(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgnu.zzD(i) * size) + O(list);
    }

    public static int O(List list) {
        int iZzF;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof eu6) {
            eu6 eu6Var = (eu6) list;
            iZzF = 0;
            while (i < size) {
                eu6Var.c(i);
                long j = eu6Var.x[i];
                iZzF += zzgnu.zzF((j >> 63) ^ (j + j));
                i++;
            }
        } else {
            iZzF = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iZzF += zzgnu.zzF((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
        }
        return iZzF;
    }

    public static int P(List list, int i) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iZzD = zzgnu.zzD(i) * size;
        if (list instanceof zzgpf) {
            zzgpf zzgpfVar = (zzgpf) list;
            while (i2 < size) {
                Object objZzf = zzgpfVar.zzf(i2);
                iZzD = (objZzf instanceof zzgnf ? zzgnu.zzw((zzgnf) objZzf) : zzgnu.zzC((String) objZzf)) + iZzD;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                iZzD = (obj instanceof zzgnf ? zzgnu.zzw((zzgnf) obj) : zzgnu.zzC((String) obj)) + iZzD;
                i2++;
            }
        }
        return iZzD;
    }

    public static int Q(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgnu.zzD(i) * size) + R(list);
    }

    public static int R(List list) {
        int iZzE;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof yt6) {
            yt6 yt6Var = (yt6) list;
            iZzE = 0;
            while (i < size) {
                yt6Var.b(i);
                iZzE += zzgnu.zzE(yt6Var.x[i]);
                i++;
            }
        } else {
            iZzE = 0;
            while (i < size) {
                iZzE += zzgnu.zzE(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iZzE;
    }

    public static int S(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgnu.zzD(i) * size) + T(list);
    }

    public static int T(List list) {
        int iZzF;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof eu6) {
            eu6 eu6Var = (eu6) list;
            iZzF = 0;
            while (i < size) {
                eu6Var.c(i);
                iZzF += zzgnu.zzF(eu6Var.x[i]);
                i++;
            }
        } else {
            iZzF = 0;
            while (i < size) {
                iZzF += zzgnu.zzF(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return iZzF;
    }

    public static Object a(int i, List list, zzgor zzgorVar, Object obj, hv6 hv6Var) {
        if (zzgorVar == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int iIntValue = ((Integer) list.get(i3)).intValue();
                if (zzgorVar.zza(iIntValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(iIntValue));
                    }
                    i2++;
                } else {
                    if (obj == null) {
                        obj = hv6Var.f();
                    }
                    hv6Var.l(obj, iIntValue, i);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = ((Integer) it.next()).intValue();
                if (!zzgorVar.zza(iIntValue2)) {
                    if (obj == null) {
                        obj = hv6Var.f();
                    }
                    hv6Var.l(obj, iIntValue2, i);
                    it.remove();
                }
            }
        }
        return obj;
    }

    public static boolean b(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void c(int i, List list, ot6 ot6Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgnu zzgnuVar = ot6Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzgnuVar.zzP(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        zzgnuVar.zzq(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).booleanValue();
            i3++;
        }
        zzgnuVar.zzs(i3);
        while (i2 < list.size()) {
            zzgnuVar.zzO(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void d(int i, List list, ot6 ot6Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ot6Var.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            ot6Var.a.zzQ(i, (zzgnf) list.get(i2));
        }
    }

    public static void e(int i, List list, ot6 ot6Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgnu zzgnuVar = ot6Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzgnuVar.zzj(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        zzgnuVar.zzq(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).doubleValue();
            i3 += 8;
        }
        zzgnuVar.zzs(i3);
        while (i2 < list.size()) {
            zzgnuVar.zzk(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void f(int i, List list, ot6 ot6Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgnu zzgnuVar = ot6Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzgnuVar.zzl(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzgnuVar.zzq(i, 2);
        int iZzy = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzy += zzgnu.zzy(((Integer) list.get(i3)).intValue());
        }
        zzgnuVar.zzs(iZzy);
        while (i2 < list.size()) {
            zzgnuVar.zzm(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void g(int i, List list, ot6 ot6Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgnu zzgnuVar = ot6Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzgnuVar.zzh(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzgnuVar.zzq(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).intValue();
            i3 += 4;
        }
        zzgnuVar.zzs(i3);
        while (i2 < list.size()) {
            zzgnuVar.zzi(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void h(int i, List list, ot6 ot6Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgnu zzgnuVar = ot6Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzgnuVar.zzj(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzgnuVar.zzq(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).longValue();
            i3 += 8;
        }
        zzgnuVar.zzs(i3);
        while (i2 < list.size()) {
            zzgnuVar.zzk(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void i(int i, List list, ot6 ot6Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgnu zzgnuVar = ot6Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzgnuVar.zzh(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        zzgnuVar.zzq(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).floatValue();
            i3 += 4;
        }
        zzgnuVar.zzs(i3);
        while (i2 < list.size()) {
            zzgnuVar.zzi(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void j(int i, List list, ot6 ot6Var, wu6 wu6Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ot6Var.l(i, wu6Var, list.get(i2));
        }
    }

    public static void k(int i, List list, ot6 ot6Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgnu zzgnuVar = ot6Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzgnuVar.zzl(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzgnuVar.zzq(i, 2);
        int iZzy = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzy += zzgnu.zzy(((Integer) list.get(i3)).intValue());
        }
        zzgnuVar.zzs(iZzy);
        while (i2 < list.size()) {
            zzgnuVar.zzm(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void l(int i, List list, ot6 ot6Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgnu zzgnuVar = ot6Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzgnuVar.zzt(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzgnuVar.zzq(i, 2);
        int iZzF = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzF += zzgnu.zzF(((Long) list.get(i3)).longValue());
        }
        zzgnuVar.zzs(iZzF);
        while (i2 < list.size()) {
            zzgnuVar.zzu(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void m(int i, List list, ot6 ot6Var, wu6 wu6Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ot6Var.o(i, wu6Var, list.get(i2));
        }
    }

    public static void n(int i, List list, ot6 ot6Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgnu zzgnuVar = ot6Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzgnuVar.zzh(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzgnuVar.zzq(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).intValue();
            i3 += 4;
        }
        zzgnuVar.zzs(i3);
        while (i2 < list.size()) {
            zzgnuVar.zzi(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void o(int i, List list, ot6 ot6Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgnu zzgnuVar = ot6Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzgnuVar.zzj(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzgnuVar.zzq(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).longValue();
            i3 += 8;
        }
        zzgnuVar.zzs(i3);
        while (i2 < list.size()) {
            zzgnuVar.zzk(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void p(int i, List list, ot6 ot6Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgnu zzgnuVar = ot6Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                zzgnuVar.zzr(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                i2++;
            }
            return;
        }
        zzgnuVar.zzq(i, 2);
        int iZzE = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue2 = ((Integer) list.get(i3)).intValue();
            iZzE += zzgnu.zzE((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
        }
        zzgnuVar.zzs(iZzE);
        while (i2 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i2)).intValue();
            zzgnuVar.zzs((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
            i2++;
        }
    }

    public static void q(int i, List list, ot6 ot6Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgnu zzgnuVar = ot6Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                zzgnuVar.zzt(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i2++;
            }
            return;
        }
        zzgnuVar.zzq(i, 2);
        int iZzF = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iZzF += zzgnu.zzF((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        zzgnuVar.zzs(iZzF);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            zzgnuVar.zzu((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i2++;
        }
    }

    public static void r(int i, List list, ot6 ot6Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ot6Var.getClass();
        boolean z = list instanceof zzgpf;
        int i2 = 0;
        zzgnu zzgnuVar = ot6Var.a;
        if (!z) {
            while (i2 < list.size()) {
                zzgnuVar.zzo(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        zzgpf zzgpfVar = (zzgpf) list;
        while (i2 < list.size()) {
            Object objZzf = zzgpfVar.zzf(i2);
            if (objZzf instanceof String) {
                zzgnuVar.zzo(i, (String) objZzf);
            } else {
                zzgnuVar.zzQ(i, (zzgnf) objZzf);
            }
            i2++;
        }
    }

    public static void s(int i, List list, ot6 ot6Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgnu zzgnuVar = ot6Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzgnuVar.zzr(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzgnuVar.zzq(i, 2);
        int iZzE = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzE += zzgnu.zzE(((Integer) list.get(i3)).intValue());
        }
        zzgnuVar.zzs(iZzE);
        while (i2 < list.size()) {
            zzgnuVar.zzs(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static int t(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgnu.zzE(i << 3) + 1) * size;
    }

    public static void u(int i, List list, ot6 ot6Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgnu zzgnuVar = ot6Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzgnuVar.zzt(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzgnuVar.zzq(i, 2);
        int iZzF = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzF += zzgnu.zzF(((Long) list.get(i3)).longValue());
        }
        zzgnuVar.zzs(iZzF);
        while (i2 < list.size()) {
            zzgnuVar.zzu(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    public static hv6 v(boolean z) {
        if (v2zj.class == 0) {
            return null;
        }
        try {
            return (hv6) v2zj.class.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int w(List list) {
        return list.size();
    }

    public static int x(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzD = zzgnu.zzD(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            iZzD += zzgnu.zzw((zzgnf) list.get(i2));
        }
        return iZzD;
    }

    public static int y(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgnu.zzD(i) * size) + z(list);
    }

    public static int z(List list) {
        int iZzy;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof yt6) {
            yt6 yt6Var = (yt6) list;
            iZzy = 0;
            while (i < size) {
                yt6Var.b(i);
                iZzy += zzgnu.zzy(yt6Var.x[i]);
                i++;
            }
        } else {
            iZzy = 0;
            while (i < size) {
                iZzy += zzgnu.zzy(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iZzy;
    }
}
