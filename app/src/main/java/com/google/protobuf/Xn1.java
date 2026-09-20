package com.google.protobuf;

import com.google.protobuf.Xn1.CQf;
import defpackage.eg3;
import defpackage.jd2;
import defpackage.lk;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class Xn1<T extends CQf<T>> {
    public static final Xn1 d;
    public final d_OZ<T, Object> a;
    public boolean b;
    public boolean c;

    public interface CQf<T extends CQf<T>> extends Comparable<T> {
        int b();

        boolean f();

        LF.QnHx h();

        DzVS.QnHx i(DzVS.QnHx qnHx, DzVS dzVS);

        LF.CQf j();

        boolean k();
    }

    public static final class QnHx<T extends CQf<T>> {
        public d_OZ<T, Object> a;
        public boolean b;
        public boolean c;
        public boolean d;

        public QnHx(int i) {
            int i2 = d_OZ.C;
            this.a = new vq(16);
            this.c = true;
        }

        public static <T extends CQf<T>> Object k(T t, Object obj, boolean z) {
            Object objF;
            if (obj == null || t.j() != LF.CQf.F) {
                return obj;
            }
            if (!t.f()) {
                if (!(obj instanceof DzVS.QnHx)) {
                    return obj;
                }
                DzVS.QnHx qnHx = (DzVS.QnHx) obj;
                return z ? qnHx.f() : qnHx.build();
            }
            if (!(obj instanceof List)) {
                throw new IllegalStateException("Repeated field should contains a List but actually contains type: " + obj.getClass());
            }
            List arrayList = (List) obj;
            for (int i = 0; i < arrayList.size(); i++) {
                Object obj2 = arrayList.get(i);
                if (obj2 instanceof DzVS.QnHx) {
                    DzVS.QnHx qnHx2 = (DzVS.QnHx) obj2;
                    objF = z ? qnHx2.f() : qnHx2.build();
                } else {
                    objF = obj2;
                }
                if (objF != obj2) {
                    if (arrayList == obj) {
                        arrayList = new ArrayList(arrayList);
                    }
                    arrayList.set(i, objF);
                }
            }
            return arrayList;
        }

        public static void l(vq vqVar, boolean z) {
            for (int i = 0; i < vqVar.e(); i++) {
                Map.Entry<Object, Object> entryC = vqVar.c(i);
                entryC.setValue(k((CQf) entryC.getKey(), entryC.getValue(), z));
            }
            for (Map.Entry<Object, Object> entry : vqVar.f()) {
                entry.setValue(k((CQf) entry.getKey(), entry.getValue(), z));
            }
        }

        public static void n(CQf cQf, Object obj) {
            if (Xn1.p(cQf.h(), obj)) {
                return;
            }
            if (cQf.h().w != LF.CQf.F || !(obj instanceof DzVS.QnHx)) {
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(cQf.b()), cQf.h().w, obj.getClass().getName()));
            }
        }

        public final void a(T t, Object obj) {
            List arrayList;
            d();
            if (!t.f()) {
                throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
            }
            this.d = this.d || (obj instanceof DzVS.QnHx);
            n(t, obj);
            Object objF = f(t);
            if (objF == null) {
                arrayList = new ArrayList();
                this.a.put(t, arrayList);
            } else {
                arrayList = (List) objF;
            }
            arrayList.add(obj);
        }

        public final Xn1<T> b(boolean z) {
            if (this.a.isEmpty()) {
                return Xn1.d;
            }
            this.c = false;
            vq vqVarB = this.a;
            if (this.d) {
                vqVarB = Xn1.b(vqVarB, false);
                l(vqVarB, z);
            }
            Xn1<T> xn1 = new Xn1<>(vqVarB);
            xn1.c = this.b;
            return xn1;
        }

        public final void c(T t) {
            d();
            this.a.remove(t);
            if (this.a.isEmpty()) {
                this.b = false;
            }
        }

        public final void d() {
            if (this.c) {
                return;
            }
            this.a = Xn1.b(this.a, true);
            this.c = true;
        }

        public final Map<T, Object> e() {
            if (!this.b) {
                d_OZ<T, Object> d_oz = this.a;
                return d_oz.z ? d_oz : Collections.unmodifiableMap(d_oz);
            }
            vq vqVarB = Xn1.b(this.a, false);
            if (this.a.z) {
                vqVarB.h();
            } else {
                l(vqVarB, true);
            }
            return vqVarB;
        }

        public final Object f(T t) {
            Object obj = this.a.get(t);
            return obj instanceof Aa ? ((Aa) obj).c() : obj;
        }

        public final boolean g(T t) {
            if (t.f()) {
                throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
            }
            return this.a.get(t) != null;
        }

        public final boolean h() {
            for (int i = 0; i < this.a.e(); i++) {
                if (!Xn1.o(this.a.c(i))) {
                    return false;
                }
            }
            Iterator it = this.a.f().iterator();
            while (it.hasNext()) {
                if (!Xn1.o((Map.Entry) it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final void i(Xn1<T> xn1) {
            d_OZ<T, Object> d_oz;
            d();
            int i = 0;
            while (true) {
                int iE = xn1.a.e();
                d_oz = xn1.a;
                if (i >= iE) {
                    break;
                }
                j(d_oz.c(i));
                i++;
            }
            Iterator it = d_oz.f().iterator();
            while (it.hasNext()) {
                j((Map.Entry) it.next());
            }
        }

        public final void j(Map.Entry<T, Object> entry) {
            T key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Aa) {
                value = ((Aa) value).c();
            }
            if (key.f()) {
                List arrayList = (List) f(key);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.a.put(key, arrayList);
                }
                Iterator it = ((List) value).iterator();
                while (it.hasNext()) {
                    arrayList.add(Xn1.d(it.next()));
                }
                return;
            }
            if (key.j() != LF.CQf.F) {
                this.a.put(key, Xn1.d(value));
                return;
            }
            Object objF = f(key);
            if (objF == null) {
                this.a.put(key, Xn1.d(value));
            } else if (objF instanceof DzVS.QnHx) {
                key.i((DzVS.QnHx) objF, (DzVS) value);
            } else {
                this.a.put(key, key.i(((DzVS) objF).c(), (DzVS) value).build());
            }
        }

        public final void m(T t, Object obj) {
            d();
            if (!t.f()) {
                n(t, obj);
            } else {
                if (!(obj instanceof List)) {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                ArrayList arrayList = new ArrayList((List) obj);
                for (Object obj2 : arrayList) {
                    n(t, obj2);
                    this.d = this.d || (obj2 instanceof DzVS.QnHx);
                }
                obj = arrayList;
            }
            if (obj instanceof Aa) {
                this.b = true;
            }
            this.d = this.d || (obj instanceof DzVS.QnHx);
            this.a.put(t, obj);
        }
    }

    static {
        int i = d_OZ.C;
        Xn1 xn1 = new Xn1(new vq(0));
        xn1.r();
        d = xn1;
    }

    public Xn1() {
        int i = d_OZ.C;
        this.a = new vq(16);
    }

    public static vq b(d_OZ d_oz, boolean z) {
        int i = d_OZ.C;
        vq vqVar = new vq(16);
        for (int i2 = 0; i2 < d_oz.e(); i2++) {
            c(vqVar, d_oz.c(i2), z);
        }
        Iterator it = d_oz.f().iterator();
        while (it.hasNext()) {
            c(vqVar, (Map.Entry) it.next(), z);
        }
        return vqVar;
    }

    public static void c(vq vqVar, Map.Entry entry, boolean z) {
        CQf cQf = (CQf) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof Aa) {
            vqVar.put(cQf, ((Aa) value).c());
        } else if (z && (value instanceof List)) {
            vqVar.put(cQf, new ArrayList((List) value));
        } else {
            vqVar.put(cQf, value);
        }
    }

    public static Object d(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static int e(LF.QnHx qnHx, Object obj) {
        switch (qnHx.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                Logger logger = CodedOutputStream.x;
                return 8;
            case 1:
                ((Float) obj).floatValue();
                Logger logger2 = CodedOutputStream.x;
                return 4;
            case 2:
                return CodedOutputStream.t1(((Long) obj).longValue());
            case 3:
                return CodedOutputStream.t1(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.f1(((Integer) obj).intValue());
            case 5:
                ((Long) obj).longValue();
                Logger logger3 = CodedOutputStream.x;
                return 8;
            case 6:
                ((Integer) obj).intValue();
                Logger logger4 = CodedOutputStream.x;
                return 4;
            case 7:
                ((Boolean) obj).booleanValue();
                Logger logger5 = CodedOutputStream.x;
                return 1;
            case 8:
                return obj instanceof lk ? CodedOutputStream.X0((lk) obj) : CodedOutputStream.o1((String) obj);
            case 9:
                Logger logger6 = CodedOutputStream.x;
                return ((DzVS) obj).j();
            case 10:
                if (obj instanceof Aa) {
                    return CodedOutputStream.h1((Aa) obj);
                }
                Logger logger7 = CodedOutputStream.x;
                int iJ = ((DzVS) obj).j();
                return CodedOutputStream.r1(iJ) + iJ;
            case 11:
                if (obj instanceof lk) {
                    return CodedOutputStream.X0((lk) obj);
                }
                Logger logger8 = CodedOutputStream.x;
                int length = ((byte[]) obj).length;
                return CodedOutputStream.r1(length) + length;
            case 12:
                return CodedOutputStream.r1(((Integer) obj).intValue());
            case 13:
                return obj instanceof SjP.QnHx ? CodedOutputStream.f1(((SjP.QnHx) obj).b()) : CodedOutputStream.f1(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                Logger logger9 = CodedOutputStream.x;
                return 4;
            case 15:
                ((Long) obj).longValue();
                Logger logger10 = CodedOutputStream.x;
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return CodedOutputStream.r1((iIntValue >> 31) ^ (iIntValue << 1));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return CodedOutputStream.t1((jLongValue >> 63) ^ (jLongValue << 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int f(CQf<?> cQf, Object obj) {
        LF.QnHx qnHxH = cQf.h();
        int iB = cQf.b();
        if (!cQf.f()) {
            int iP1 = CodedOutputStream.p1(iB);
            if (qnHxH == LF.QnHx.y) {
                iP1 *= 2;
            }
            return e(qnHxH, obj) + iP1;
        }
        int iE = 0;
        if (cQf.k()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iE += e(qnHxH, it.next());
            }
            return CodedOutputStream.r1(iE) + CodedOutputStream.p1(iB) + iE;
        }
        for (Object obj2 : (List) obj) {
            int iP2 = CodedOutputStream.p1(iB);
            if (qnHxH == LF.QnHx.y) {
                iP2 *= 2;
            }
            iE += e(qnHxH, obj2) + iP2;
        }
        return iE;
    }

    public static int j(Map.Entry entry) {
        CQf cQf = (CQf) entry.getKey();
        Object value = entry.getValue();
        if (cQf.j() != LF.CQf.F || cQf.f() || cQf.k()) {
            return f(cQf, value);
        }
        if (!(value instanceof Aa)) {
            int iB = ((CQf) entry.getKey()).b();
            return CodedOutputStream.i1(3, (DzVS) value) + CodedOutputStream.q1(2, iB) + (CodedOutputStream.p1(1) * 2);
        }
        int iB2 = ((CQf) entry.getKey()).b();
        return CodedOutputStream.h1((Aa) value) + CodedOutputStream.p1(3) + CodedOutputStream.q1(2, iB2) + (CodedOutputStream.p1(1) * 2);
    }

    public static <T extends CQf<T>> boolean o(Map.Entry<T, Object> entry) {
        boolean zIsInitialized;
        T key = entry.getKey();
        if (key.j() == LF.CQf.F) {
            if (!key.f()) {
                Object value = entry.getValue();
                if (value instanceof jd2) {
                    return ((jd2) value).isInitialized();
                }
                if (value instanceof Aa) {
                    return true;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            for (Object obj : (List) entry.getValue()) {
                if (obj instanceof jd2) {
                    zIsInitialized = ((jd2) obj).isInitialized();
                } else {
                    if (!(obj instanceof Aa)) {
                        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                    }
                    zIsInitialized = true;
                }
                if (!zIsInitialized) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean p(LF.QnHx qnHx, Object obj) {
        Charset charset = SjP.a;
        obj.getClass();
        switch (qnHx.w) {
            case x:
                return obj instanceof Integer;
            case y:
                return obj instanceof Long;
            case z:
                return obj instanceof Float;
            case A:
                return obj instanceof Double;
            case B:
                return obj instanceof Boolean;
            case C:
                return obj instanceof String;
            case D:
                return (obj instanceof lk) || (obj instanceof byte[]);
            case E:
                return (obj instanceof Integer) || (obj instanceof SjP.QnHx);
            case F:
                return (obj instanceof DzVS) || (obj instanceof Aa);
            default:
                return false;
        }
    }

    public static void t(CQf cQf, Object obj) {
        if (!p(cQf.h(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(cQf.b()), cQf.h().w, obj.getClass().getName()));
        }
    }

    public static void u(CodedOutputStream codedOutputStream, LF.QnHx qnHx, int i, Object obj) {
        if (qnHx != LF.QnHx.y) {
            codedOutputStream.N1(i, qnHx.x);
            v(codedOutputStream, qnHx, obj);
        } else {
            codedOutputStream.N1(i, 3);
            ((DzVS) obj).h(codedOutputStream);
            codedOutputStream.N1(i, 4);
        }
    }

    public static void v(CodedOutputStream codedOutputStream, LF.QnHx qnHx, Object obj) {
        switch (qnHx.ordinal()) {
            case 0:
                double dDoubleValue = ((Double) obj).doubleValue();
                codedOutputStream.getClass();
                codedOutputStream.D1(Double.doubleToRawLongBits(dDoubleValue));
                break;
            case 1:
                float fFloatValue = ((Float) obj).floatValue();
                codedOutputStream.getClass();
                codedOutputStream.B1(Float.floatToRawIntBits(fFloatValue));
                break;
            case 2:
                codedOutputStream.R1(((Long) obj).longValue());
                break;
            case 3:
                codedOutputStream.R1(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.F1(((Integer) obj).intValue());
                break;
            case 5:
                codedOutputStream.D1(((Long) obj).longValue());
                break;
            case 6:
                codedOutputStream.B1(((Integer) obj).intValue());
                break;
            case 7:
                codedOutputStream.v1(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof lk)) {
                    codedOutputStream.M1((String) obj);
                } else {
                    codedOutputStream.z1((lk) obj);
                }
                break;
            case 9:
                codedOutputStream.getClass();
                ((DzVS) obj).h(codedOutputStream);
                break;
            case 10:
                codedOutputStream.I1((DzVS) obj);
                break;
            case 11:
                if (!(obj instanceof lk)) {
                    byte[] bArr = (byte[]) obj;
                    codedOutputStream.getClass();
                    codedOutputStream.x1(bArr, bArr.length);
                } else {
                    codedOutputStream.z1((lk) obj);
                }
                break;
            case 12:
                codedOutputStream.P1(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof SjP.QnHx)) {
                    codedOutputStream.F1(((Integer) obj).intValue());
                } else {
                    codedOutputStream.F1(((SjP.QnHx) obj).b());
                }
                break;
            case 14:
                codedOutputStream.B1(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.D1(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                codedOutputStream.P1((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                codedOutputStream.R1((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public static void w(CQf<?> cQf, Object obj, CodedOutputStream codedOutputStream) {
        LF.QnHx qnHxH = cQf.h();
        int iB = cQf.b();
        if (!cQf.f()) {
            if (obj instanceof Aa) {
                u(codedOutputStream, qnHxH, iB, ((Aa) obj).c());
                return;
            } else {
                u(codedOutputStream, qnHxH, iB, obj);
                return;
            }
        }
        List list = (List) obj;
        if (!cQf.k()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                u(codedOutputStream, qnHxH, iB, it.next());
            }
            return;
        }
        codedOutputStream.N1(iB, 2);
        Iterator it2 = list.iterator();
        int iE = 0;
        while (it2.hasNext()) {
            iE += e(qnHxH, it2.next());
        }
        codedOutputStream.P1(iE);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            v(codedOutputStream, qnHxH, it3.next());
        }
    }

    public static void x(Map.Entry entry, CodedOutputStream codedOutputStream) {
        CQf cQf = (CQf) entry.getKey();
        if (cQf.j() != LF.CQf.F || cQf.f() || cQf.k()) {
            w(cQf, entry.getValue(), codedOutputStream);
            return;
        }
        Object value = entry.getValue();
        if (value instanceof Aa) {
            value = ((Aa) value).c();
        }
        codedOutputStream.J1(((CQf) entry.getKey()).b(), (DzVS) value);
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Xn1<T> clone() {
        d_OZ<T, Object> d_oz;
        Xn1<T> xn1 = new Xn1<>();
        int i = 0;
        while (true) {
            d_oz = this.a;
            if (i >= d_oz.e()) {
                break;
            }
            Map.Entry<K, Object> entryC = d_oz.c(i);
            xn1.s((CQf) entryC.getKey(), entryC.getValue());
            i++;
        }
        Iterator it = d_oz.f().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            xn1.s((CQf) entry.getKey(), entry.getValue());
        }
        xn1.c = this.c;
        return xn1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Xn1) {
            return this.a.equals(((Xn1) obj).a);
        }
        return false;
    }

    public final Map<T, Object> g() {
        boolean z = this.c;
        d_OZ<T, Object> d_oz = this.a;
        if (!z) {
            return d_oz.z ? d_oz : Collections.unmodifiableMap(d_oz);
        }
        vq vqVarB = b(d_oz, false);
        if (d_oz.z) {
            vqVarB.h();
        }
        return vqVarB;
    }

    public final Object h(T t) {
        Object obj = this.a.get(t);
        return obj instanceof Aa ? ((Aa) obj).c() : obj;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final int i() {
        d_OZ<T, Object> d_oz;
        int i = 0;
        int iJ = 0;
        while (true) {
            d_oz = this.a;
            if (i >= d_oz.e()) {
                break;
            }
            iJ += j(d_oz.c(i));
            i++;
        }
        Iterator it = d_oz.f().iterator();
        while (it.hasNext()) {
            iJ += j((Map.Entry) it.next());
        }
        return iJ;
    }

    public final int k() {
        d_OZ<T, Object> d_oz;
        int i = 0;
        int iF = 0;
        while (true) {
            d_oz = this.a;
            if (i >= d_oz.e()) {
                break;
            }
            Map.Entry<K, Object> entryC = d_oz.c(i);
            iF += f((CQf) entryC.getKey(), entryC.getValue());
            i++;
        }
        Iterator it = d_oz.f().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iF += f((CQf) entry.getKey(), entry.getValue());
        }
        return iF;
    }

    public final boolean l(T t) {
        if (t.f()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.a.get(t) != null;
    }

    public final boolean m() {
        return this.a.isEmpty();
    }

    public final boolean n() {
        int i = 0;
        while (true) {
            d_OZ<T, Object> d_oz = this.a;
            if (i >= d_oz.e()) {
                Iterator it = d_oz.f().iterator();
                while (it.hasNext()) {
                    if (!o((Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            }
            if (!o(d_oz.c(i))) {
                return false;
            }
            i++;
        }
    }

    public final Iterator<Map.Entry<T, Object>> q() {
        boolean z = this.c;
        d_OZ<T, Object> d_oz = this.a;
        return z ? new Aa.CQf(d_oz.entrySet().iterator()) : d_oz.entrySet().iterator();
    }

    public final void r() {
        if (this.b) {
            return;
        }
        int i = 0;
        while (true) {
            d_OZ<T, Object> d_oz = this.a;
            if (i >= d_oz.e()) {
                d_oz.h();
                this.b = true;
                return;
            }
            Map.Entry<K, Object> entryC = d_oz.c(i);
            if (entryC.getValue() instanceof LPt9Fixed) {
                LPt9Fixed lPt9 = (LPt9Fixed) entryC.getValue();
                lPt9.getClass();
                eg3 eg3Var = eg3.c;
                eg3Var.getClass();
                eg3Var.a(lPt9.getClass()).b(lPt9);
                lPt9.H();
            }
            i++;
        }
    }

    public final void s(T t, Object obj) {
        if (!t.f()) {
            t(t, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                t(t, it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof Aa) {
            this.c = true;
        }
        this.a.put(t, obj);
    }

    public Xn1(d_OZ<T, Object> d_oz) {
        this.a = d_oz;
        r();
    }
}
