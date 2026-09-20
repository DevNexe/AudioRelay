package j$.util.concurrent;

import j$.util.function.BiConsumer;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiFunction;
import java.util.function.Function;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public class ConcurrentHashMap<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable, v {
    private static final int g = (1 << (32 - 16)) - 1;
    private static final int h = 32 - 16;
    static final int i = Runtime.getRuntime().availableProcessors();
    private static final Unsafe j;
    private static final long k;
    private static final long l;
    private static final long m;
    private static final long n;
    private static final long o;
    private static final long p;
    private static final int q;
    private static final ObjectStreamField[] serialPersistentFields;
    private static final long serialVersionUID = 7249069246763182397L;
    volatile transient m[] a;
    private volatile transient m[] b;
    private volatile transient long baseCount;
    private volatile transient d[] c;
    private volatile transient int cellsBusy;
    private transient j d;
    private transient t e;
    private transient f f;
    private volatile transient int sizeCtl;
    private volatile transient int transferIndex;

    static {
        Class cls = Integer.TYPE;
        serialPersistentFields = new ObjectStreamField[]{new ObjectStreamField("segments", o[].class), new ObjectStreamField("segmentMask", cls), new ObjectStreamField("segmentShift", cls)};
        try {
            Unsafe unsafeC = w.c();
            j = unsafeC;
            k = unsafeC.objectFieldOffset(ConcurrentHashMap.class.getDeclaredField("sizeCtl"));
            l = unsafeC.objectFieldOffset(ConcurrentHashMap.class.getDeclaredField("transferIndex"));
            m = unsafeC.objectFieldOffset(ConcurrentHashMap.class.getDeclaredField("baseCount"));
            n = unsafeC.objectFieldOffset(ConcurrentHashMap.class.getDeclaredField("cellsBusy"));
            o = unsafeC.objectFieldOffset(d.class.getDeclaredField("value"));
            p = unsafeC.arrayBaseOffset(m[].class);
            int iArrayIndexScale = unsafeC.arrayIndexScale(m[].class);
            if (((iArrayIndexScale - 1) & iArrayIndexScale) != 0) {
                throw new Error("data type scale not a power of two");
            }
            q = 31 - Integer.numberOfLeadingZeros(iArrayIndexScale);
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    public ConcurrentHashMap() {
    }

    public ConcurrentHashMap(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        this.sizeCtl = i2 >= 536870912 ? 1073741824 : n(i2 + (i2 >>> 1) + 1);
    }

    public ConcurrentHashMap(int i2, float f, int i3) {
        if (f <= 0.0f || i2 < 0 || i3 <= 0) {
            throw new IllegalArgumentException();
        }
        long j2 = (long) (((double) ((i2 < i3 ? i3 : i2) / f)) + 1.0d);
        this.sizeCtl = j2 >= 1073741824 ? 1073741824 : n((int) j2);
    }

    public ConcurrentHashMap(Map<? extends K, ? extends V> map) {
        this.sizeCtl = 16;
        putAll(map);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0032  */
    /* JADX WARN: Code duplicated, block: B:15:0x0034 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0036 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:17:0x0037  */
    /* JADX WARN: Code duplicated, block: B:6:0x0014  */
    private final void a(long j2, int i2) {
        boolean z;
        int length;
        d dVar;
        boolean zCompareAndSwapLong;
        long jL;
        m[] mVarArr;
        int length2;
        m[] mVarArr2;
        d[] dVarArr = this.c;
        if (dVarArr != null) {
            z = true;
            if (dVarArr != null) {
                Unsafe unsafe = j;
                long j3 = o;
                long j4 = dVar.value;
                zCompareAndSwapLong = unsafe.compareAndSwapLong(dVar, j3, j4, j4 + j2);
                if (!zCompareAndSwapLong) {
                    z = zCompareAndSwapLong;
                } else if (i2 <= 1) {
                    return;
                } else {
                    jL = l();
                }
            }
            e(j2, z);
            return;
        }
        Unsafe unsafe2 = j;
        long j5 = m;
        long j6 = this.baseCount;
        jL = j6 + j2;
        if (!unsafe2.compareAndSwapLong(this, j5, j6, jL)) {
            z = true;
            if (dVarArr != null && (length = dVarArr.length - 1) >= 0 && (dVar = dVarArr[length & ThreadLocalRandom.b()]) != null) {
                Unsafe unsafe3 = j;
                long j7 = o;
                long j8 = dVar.value;
                zCompareAndSwapLong = unsafe3.compareAndSwapLong(dVar, j7, j8, j8 + j2);
                if (!zCompareAndSwapLong) {
                    z = zCompareAndSwapLong;
                } else if (i2 <= 1) {
                    return;
                } else {
                    jL = l();
                }
            }
            e(j2, z);
            return;
        }
        if (i2 < 0) {
            return;
        }
        while (true) {
            int i3 = this.sizeCtl;
            if (jL < i3 || (mVarArr = this.a) == null || (length2 = mVarArr.length) >= 1073741824) {
                return;
            }
            int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(length2) | 32768;
            int i4 = h;
            if (i3 < 0) {
                if ((i3 >>> i4) != iNumberOfLeadingZeros || i3 == iNumberOfLeadingZeros + 1 || i3 == iNumberOfLeadingZeros + g || (mVarArr2 = this.b) == null || this.transferIndex <= 0) {
                    return;
                }
                if (j.compareAndSwapInt(this, k, i3, i3 + 1)) {
                    o(mVarArr, mVarArr2);
                }
            } else if (j.compareAndSwapInt(this, k, i3, (iNumberOfLeadingZeros << i4) + 2)) {
                o(mVarArr, null);
            }
            jL = l();
        }
    }

    static final boolean b(m[] mVarArr, int i2, m mVar) {
        return AbstractC1463a.a(j, mVarArr, (((long) i2) << q) + p, mVar);
    }

    static Class c(Object obj) {
        Type[] actualTypeArguments;
        if (!(obj instanceof Comparable)) {
            return null;
        }
        Class<?> cls = obj.getClass();
        if (cls == String.class) {
            return cls;
        }
        Type[] genericInterfaces = cls.getGenericInterfaces();
        if (genericInterfaces == null) {
            return null;
        }
        for (Type type : genericInterfaces) {
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                if (parameterizedType.getRawType() == Comparable.class && (actualTypeArguments = parameterizedType.getActualTypeArguments()) != null && actualTypeArguments.length == 1 && actualTypeArguments[0] == cls) {
                    return cls;
                }
            }
        }
        return null;
    }

    static int d(Class cls, Object obj, Object obj2) {
        if (obj2 == null || obj2.getClass() != cls) {
            return 0;
        }
        return ((Comparable) obj).compareTo(obj2);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    private final void e(long j2, boolean z) {
        int iB;
        boolean z2;
        d[] dVarArr;
        boolean z3;
        int length;
        boolean z4;
        int length2;
        int iB2 = ThreadLocalRandom.b();
        if (iB2 == 0) {
            ThreadLocalRandom.f();
            iB = ThreadLocalRandom.b();
            z2 = true;
        } else {
            iB = iB2;
            z2 = z;
        }
        int iA = iB;
        while (true) {
            boolean z5 = false;
            while (true) {
                dVarArr = this.c;
                if (dVarArr != null && (length = dVarArr.length) > 0) {
                    d dVar = dVarArr[(length - 1) & iA];
                    if (dVar != null) {
                        if (z2) {
                            Unsafe unsafe = j;
                            long j3 = o;
                            long j4 = dVar.value;
                            if (unsafe.compareAndSwapLong(dVar, j3, j4, j4 + j2)) {
                                return;
                            }
                            if (this.c == dVarArr && length < i) {
                                if (z5) {
                                    if (this.cellsBusy == 0 && unsafe.compareAndSwapInt(this, n, 0, 1)) {
                                        break;
                                    }
                                } else {
                                    z5 = true;
                                }
                            }
                        } else {
                            z2 = true;
                        }
                        iA = ThreadLocalRandom.a(iA);
                    } else if (this.cellsBusy == 0) {
                        d dVar2 = new d(j2);
                        if (this.cellsBusy == 0 && j.compareAndSwapInt(this, n, 0, 1)) {
                            try {
                                d[] dVarArr2 = this.c;
                                if (dVarArr2 == null || (length2 = dVarArr2.length) <= 0) {
                                    z4 = false;
                                } else {
                                    int i2 = (length2 - 1) & iA;
                                    if (dVarArr2[i2] == null) {
                                        dVarArr2[i2] = dVar2;
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                }
                                this.cellsBusy = 0;
                                if (z4) {
                                    return;
                                }
                            } catch (Throwable th) {
                                this.cellsBusy = 0;
                                throw th;
                            }
                        }
                    }
                    z5 = false;
                    iA = ThreadLocalRandom.a(iA);
                } else if (this.cellsBusy == 0 && this.c == dVarArr && j.compareAndSwapInt(this, n, 0, 1)) {
                    try {
                        if (this.c == dVarArr) {
                            d[] dVarArr3 = new d[2];
                            dVarArr3[iA & 1] = new d(j2);
                            this.c = dVarArr3;
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        this.cellsBusy = 0;
                        if (z3) {
                            return;
                        }
                    } catch (Throwable th2) {
                        this.cellsBusy = 0;
                        throw th2;
                    }
                } else {
                    Unsafe unsafe2 = j;
                    long j5 = m;
                    long j6 = this.baseCount;
                    if (unsafe2.compareAndSwapLong(this, j5, j6, j6 + j2)) {
                        return;
                    }
                }
            }
            try {
                if (this.c == dVarArr) {
                    d[] dVarArr4 = new d[length << 1];
                    for (int i3 = 0; i3 < length; i3++) {
                        dVarArr4[i3] = dVarArr[i3];
                    }
                    this.c = dVarArr4;
                }
                this.cellsBusy = 0;
            } catch (Throwable th3) {
                this.cellsBusy = 0;
                throw th3;
            }
        }
    }

    private final m[] g() {
        while (true) {
            m[] mVarArr = this.a;
            if (mVarArr != null && mVarArr.length != 0) {
                return mVarArr;
            }
            int i2 = this.sizeCtl;
            if (i2 < 0) {
                Thread.yield();
            } else if (j.compareAndSwapInt(this, k, i2, -1)) {
                try {
                    m[] mVarArr2 = this.a;
                    if (mVarArr2 == null || mVarArr2.length == 0) {
                        int i3 = i2 > 0 ? i2 : 16;
                        m[] mVarArr3 = new m[i3];
                        this.a = mVarArr3;
                        i2 = i3 - (i3 >>> 2);
                        mVarArr2 = mVarArr3;
                    }
                    return mVarArr2;
                } finally {
                    this.sizeCtl = i2;
                }
            }
        }
    }

    static final void j(m[] mVarArr, int i2, m mVar) {
        j.putObjectVolatile(mVarArr, (((long) i2) << q) + p, mVar);
    }

    static final int k(int i2) {
        return (i2 ^ (i2 >>> 16)) & Integer.MAX_VALUE;
    }

    static final m m(m[] mVarArr, int i2) {
        return (m) j.getObjectVolatile(mVarArr, (((long) i2) << q) + p);
    }

    private static final int n(int i2) {
        int i3 = i2 - 1;
        int i4 = i3 | (i3 >>> 1);
        int i5 = i4 | (i4 >>> 2);
        int i6 = i5 | (i5 >>> 4);
        int i7 = i6 | (i6 >>> 8);
        int i8 = i7 | (i7 >>> 16);
        if (i8 < 0) {
            return 1;
        }
        if (i8 >= 1073741824) {
            return 1073741824;
        }
        return 1 + i8;
    }

    private final void o(m[] mVarArr, m[] mVarArr2) {
        m[] mVarArr3;
        ConcurrentHashMap<K, V> concurrentHashMap;
        m[] mVarArr4;
        int i2;
        int i3;
        h hVar;
        ConcurrentHashMap<K, V> concurrentHashMap2;
        int i4;
        m mVar;
        ConcurrentHashMap<K, V> concurrentHashMap3 = this;
        int length = mVarArr.length;
        int i5 = i;
        int i6 = i5 > 1 ? (length >>> 3) / i5 : length;
        int i7 = i6 < 16 ? 16 : i6;
        if (mVarArr2 == null) {
            try {
                m[] mVarArr5 = new m[length << 1];
                concurrentHashMap3.b = mVarArr5;
                concurrentHashMap3.transferIndex = length;
                mVarArr3 = mVarArr5;
            } catch (Throwable unused) {
                concurrentHashMap3.sizeCtl = Integer.MAX_VALUE;
                return;
            }
        } else {
            mVarArr3 = mVarArr2;
        }
        int length2 = mVarArr3.length;
        h hVar2 = new h(mVarArr3);
        m[] mVarArr6 = mVarArr;
        ConcurrentHashMap<K, V> concurrentHashMap4 = concurrentHashMap3;
        int i8 = 0;
        int i9 = 0;
        boolean zB = true;
        boolean z = false;
        while (true) {
            if (zB) {
                int i10 = i8 - 1;
                if (i10 >= i9 || z) {
                    concurrentHashMap = concurrentHashMap4;
                    mVarArr4 = mVarArr6;
                    i8 = i10;
                    i9 = i9;
                    mVarArr6 = mVarArr4;
                    concurrentHashMap4 = concurrentHashMap;
                    zB = false;
                } else {
                    int i11 = concurrentHashMap4.transferIndex;
                    if (i11 <= 0) {
                        concurrentHashMap = concurrentHashMap4;
                        mVarArr4 = mVarArr6;
                        i8 = -1;
                    } else {
                        Unsafe unsafe = j;
                        long j2 = l;
                        int i12 = i11 > i7 ? i11 - i7 : 0;
                        concurrentHashMap = concurrentHashMap4;
                        mVarArr4 = mVarArr6;
                        int i13 = i9;
                        if (unsafe.compareAndSwapInt(this, j2, i11, i12)) {
                            i8 = i11 - 1;
                            i9 = i12;
                        } else {
                            mVarArr6 = mVarArr4;
                            i8 = i10;
                            i9 = i13;
                            concurrentHashMap4 = concurrentHashMap;
                        }
                    }
                    mVarArr6 = mVarArr4;
                    concurrentHashMap4 = concurrentHashMap;
                    zB = false;
                }
            } else {
                ConcurrentHashMap<K, V> concurrentHashMap5 = concurrentHashMap4;
                m[] mVarArr7 = mVarArr6;
                int i14 = i9;
                s sVar = null;
                m mVar2 = null;
                if (i8 < 0 || i8 >= length || (i4 = i8 + length) >= length2) {
                    i2 = i7;
                    i3 = length2;
                    hVar = hVar2;
                    if (z) {
                        this.b = null;
                        this.a = mVarArr3;
                        this.sizeCtl = (length << 1) - (length >>> 1);
                        return;
                    }
                    concurrentHashMap2 = this;
                    Unsafe unsafe2 = j;
                    long j3 = k;
                    int i15 = concurrentHashMap2.sizeCtl;
                    int i16 = i8;
                    if (!unsafe2.compareAndSwapInt(this, j3, i15, i15 - 1)) {
                        concurrentHashMap4 = concurrentHashMap2;
                        mVarArr6 = mVarArr7;
                        i8 = i16;
                    } else {
                        if (i15 - 2 != ((Integer.numberOfLeadingZeros(length) | 32768) << h)) {
                            return;
                        }
                        i8 = length;
                        concurrentHashMap4 = concurrentHashMap2;
                        mVarArr6 = mVarArr7;
                        zB = true;
                        z = true;
                    }
                } else {
                    m mVarM = m(mVarArr7, i8);
                    if (mVarM == null) {
                        zB = b(mVarArr7, i8, hVar2);
                        i2 = i7;
                        i3 = length2;
                        hVar = hVar2;
                        mVarArr6 = mVarArr7;
                        concurrentHashMap4 = concurrentHashMap5;
                    } else {
                        int i17 = mVarM.a;
                        if (i17 == -1) {
                            concurrentHashMap2 = concurrentHashMap3;
                            i2 = i7;
                            i3 = length2;
                            hVar = hVar2;
                            mVarArr6 = mVarArr7;
                            concurrentHashMap4 = concurrentHashMap5;
                            zB = true;
                        } else {
                            synchronized (mVarM) {
                                if (m(mVarArr7, i8) == mVarM) {
                                    if (i17 >= 0) {
                                        int i18 = i17 & length;
                                        m mVar3 = mVarM;
                                        for (m mVar4 = mVarM.d; mVar4 != null; mVar4 = mVar4.d) {
                                            int i19 = mVar4.a & length;
                                            if (i19 != i18) {
                                                mVar3 = mVar4;
                                                i18 = i19;
                                            }
                                        }
                                        if (i18 == 0) {
                                            mVar = mVar3;
                                        } else {
                                            mVar = null;
                                            mVar2 = mVar3;
                                        }
                                        m mVar5 = mVarM;
                                        while (mVar5 != mVar3) {
                                            int i20 = mVar5.a;
                                            int i21 = i7;
                                            Object obj = mVar5.b;
                                            int i22 = length2;
                                            Object obj2 = mVar5.c;
                                            if ((i20 & length) == 0) {
                                                mVar = new m(i20, obj, obj2, mVar);
                                            } else {
                                                mVar2 = new m(i20, obj, obj2, mVar2);
                                            }
                                            mVar5 = mVar5.d;
                                            i7 = i21;
                                            length2 = i22;
                                            mVar3 = mVar3;
                                        }
                                        i2 = i7;
                                        i3 = length2;
                                        j(mVarArr3, i8, mVar);
                                        j(mVarArr3, i4, mVar2);
                                        j(mVarArr7, i8, hVar2);
                                        hVar = hVar2;
                                    } else {
                                        i2 = i7;
                                        i3 = length2;
                                        if (mVarM instanceof r) {
                                            r rVar = (r) mVarM;
                                            s sVar2 = null;
                                            s sVar3 = null;
                                            m mVar6 = rVar.f;
                                            int i23 = 0;
                                            int i24 = 0;
                                            s sVar4 = null;
                                            while (mVar6 != null) {
                                                r rVar2 = rVar;
                                                int i25 = mVar6.a;
                                                h hVar3 = hVar2;
                                                s sVar5 = new s(i25, mVar6.b, mVar6.c, null, null);
                                                if ((i25 & length) == 0) {
                                                    sVar5.h = sVar3;
                                                    if (sVar3 == null) {
                                                        sVar = sVar5;
                                                    } else {
                                                        sVar3.d = sVar5;
                                                    }
                                                    i23++;
                                                    sVar3 = sVar5;
                                                } else {
                                                    sVar5.h = sVar2;
                                                    if (sVar2 == null) {
                                                        sVar4 = sVar5;
                                                    } else {
                                                        sVar2.d = sVar5;
                                                    }
                                                    i24++;
                                                    sVar2 = sVar5;
                                                }
                                                mVar6 = mVar6.d;
                                                rVar = rVar2;
                                                hVar2 = hVar3;
                                            }
                                            r rVar3 = rVar;
                                            h hVar4 = hVar2;
                                            m mVarR = i23 <= 6 ? r(sVar) : i24 != 0 ? new r(sVar) : rVar3;
                                            m mVarR2 = i24 <= 6 ? r(sVar4) : i23 != 0 ? new r(sVar4) : rVar3;
                                            j(mVarArr3, i8, mVarR);
                                            j(mVarArr3, i4, mVarR2);
                                            hVar = hVar4;
                                            j(mVarArr, i8, hVar);
                                            mVarArr7 = mVarArr;
                                        }
                                    }
                                    zB = true;
                                } else {
                                    i2 = i7;
                                    i3 = length2;
                                }
                                hVar = hVar2;
                            }
                            concurrentHashMap4 = this;
                            mVarArr6 = mVarArr7;
                        }
                    }
                    concurrentHashMap2 = this;
                }
                hVar2 = hVar;
                concurrentHashMap3 = concurrentHashMap2;
                i9 = i14;
                i7 = i2;
                length2 = i3;
            }
        }
    }

    private final void p(m[] mVarArr, int i2) {
        int length = mVarArr.length;
        if (length < 64) {
            q(length << 1);
            return;
        }
        m mVarM = m(mVarArr, i2);
        if (mVarM == null || mVarM.a < 0) {
            return;
        }
        synchronized (mVarM) {
            if (m(mVarArr, i2) == mVarM) {
                s sVar = null;
                m mVar = mVarM;
                s sVar2 = null;
                while (mVar != null) {
                    s sVar3 = new s(mVar.a, mVar.b, mVar.c, null, null);
                    sVar3.h = sVar2;
                    if (sVar2 == null) {
                        sVar = sVar3;
                    } else {
                        sVar2.d = sVar3;
                    }
                    mVar = mVar.d;
                    sVar2 = sVar3;
                }
                j(mVarArr, i2, new r(sVar));
            }
        }
    }

    private final void q(int i2) {
        int length;
        m[] mVarArr;
        int iN = i2 >= 536870912 ? 1073741824 : n(i2 + (i2 >>> 1) + 1);
        while (true) {
            int i3 = this.sizeCtl;
            if (i3 < 0) {
                return;
            }
            m[] mVarArr2 = this.a;
            if (mVarArr2 == null || (length = mVarArr2.length) == 0) {
                int i4 = i3 > iN ? i3 : iN;
                if (j.compareAndSwapInt(this, k, i3, -1)) {
                    try {
                        if (this.a == mVarArr2) {
                            this.a = new m[i4];
                            i3 = i4 - (i4 >>> 2);
                        }
                        this.sizeCtl = i3;
                    } catch (Throwable th) {
                        this.sizeCtl = i3;
                        throw th;
                    }
                } else {
                    continue;
                }
            } else {
                if (iN <= i3 || length >= 1073741824) {
                    return;
                }
                if (mVarArr2 == this.a) {
                    int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(length) | 32768;
                    int i5 = h;
                    if (i3 < 0) {
                        if ((i3 >>> i5) != iNumberOfLeadingZeros || i3 == iNumberOfLeadingZeros + 1 || i3 == iNumberOfLeadingZeros + g || (mVarArr = this.b) == null || this.transferIndex <= 0) {
                            return;
                        }
                        if (j.compareAndSwapInt(this, k, i3, i3 + 1)) {
                            o(mVarArr2, mVarArr);
                        }
                    } else if (j.compareAndSwapInt(this, k, i3, (iNumberOfLeadingZeros << i5) + 2)) {
                        o(mVarArr2, null);
                    }
                } else {
                    continue;
                }
            }
        }
    }

    static m r(s sVar) {
        m mVar = null;
        m mVar2 = null;
        for (m mVar3 = sVar; mVar3 != null; mVar3 = mVar3.d) {
            m mVar4 = new m(mVar3.a, mVar3.b, mVar3.c, null);
            if (mVar2 == null) {
                mVar = mVar4;
            } else {
                mVar2.d = mVar4;
            }
            mVar2 = mVar4;
        }
        return mVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        long j2;
        int iN;
        boolean z;
        Object obj;
        this.sizeCtl = -1;
        objectInputStream.defaultReadObject();
        long j3 = 0;
        long j4 = 0;
        m mVar = null;
        while (true) {
            Object object = objectInputStream.readObject();
            Object object2 = objectInputStream.readObject();
            j2 = 1;
            if (object == null || object2 == null) {
                break;
            }
            j4++;
            mVar = new m(k(object.hashCode()), object, object2, mVar);
        }
        if (j4 == 0) {
            this.sizeCtl = 0;
            return;
        }
        if (j4 >= 536870912) {
            iN = 1073741824;
        } else {
            int i2 = (int) j4;
            iN = n(i2 + (i2 >>> 1) + 1);
        }
        m[] mVarArr = new m[iN];
        int i3 = iN - 1;
        while (mVar != null) {
            m mVar2 = mVar.d;
            int i4 = mVar.a;
            int i5 = i4 & i3;
            m mVarM = m(mVarArr, i5);
            if (mVarM == null) {
                z = true;
            } else {
                Object obj2 = mVar.b;
                if (mVarM.a >= 0) {
                    m mVar3 = mVarM;
                    int i6 = 0;
                    while (true) {
                        if (mVar3 == null) {
                            z = true;
                            break;
                        }
                        if (mVar3.a == i4 && ((obj = mVar3.b) == obj2 || (obj != null && obj2.equals(obj)))) {
                            z = false;
                            break;
                        } else {
                            i6++;
                            mVar3 = mVar3.d;
                        }
                    }
                    if (z && i6 >= 8) {
                        long j5 = j3 + 1;
                        mVar.d = mVarM;
                        m mVar4 = mVar;
                        s sVar = null;
                        s sVar2 = null;
                        while (mVar4 != null) {
                            long j6 = j5;
                            s sVar3 = new s(mVar4.a, mVar4.b, mVar4.c, null, null);
                            sVar3.h = sVar2;
                            if (sVar2 == null) {
                                sVar = sVar3;
                            } else {
                                sVar2.d = sVar3;
                            }
                            mVar4 = mVar4.d;
                            sVar2 = sVar3;
                            j5 = j6;
                        }
                        j(mVarArr, i5, new r(sVar));
                        j3 = j5;
                    }
                } else if (((r) mVarM).f(i4, obj2, mVar.c) == null) {
                    j3 += j2;
                }
                z = false;
            }
            if (z) {
                j3++;
                mVar.d = mVarM;
                j(mVarArr, i5, mVar);
            }
            j2 = 1;
            mVar = mVar2;
        }
        this.a = mVarArr;
        this.sizeCtl = iN - (iN >>> 2);
        this.baseCount = j3;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i2 = 1;
        int i3 = 0;
        while (i2 < 16) {
            i3++;
            i2 <<= 1;
        }
        int i4 = 32 - i3;
        int i5 = i2 - 1;
        o[] oVarArr = new o[16];
        for (int i6 = 0; i6 < 16; i6++) {
            oVarArr[i6] = new o();
        }
        objectOutputStream.putFields().put("segments", oVarArr);
        objectOutputStream.putFields().put("segmentShift", i4);
        objectOutputStream.putFields().put("segmentMask", i5);
        objectOutputStream.writeFields();
        m[] mVarArr = this.a;
        if (mVarArr != null) {
            q qVar = new q(mVarArr, mVarArr.length, 0, mVarArr.length);
            while (true) {
                m mVarF = qVar.f();
                if (mVarF == null) {
                    break;
                }
                objectOutputStream.writeObject(mVarF.b);
                objectOutputStream.writeObject(mVarF.c);
            }
        }
        objectOutputStream.writeObject(null);
        objectOutputStream.writeObject(null);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public void clear() {
        m mVarM;
        m mVar;
        m[] mVarArrF = this.a;
        long j2 = 0;
        loop0: while (true) {
            int i2 = 0;
            while (true) {
                if (mVarArrF == null || i2 >= mVarArrF.length) {
                    break loop0;
                }
                mVarM = m(mVarArrF, i2);
                if (mVarM == null) {
                    i2++;
                } else {
                    int i3 = mVarM.a;
                    if (i3 == -1) {
                        break;
                    }
                    synchronized (mVarM) {
                        if (m(mVarArrF, i2) == mVarM) {
                            if (i3 >= 0) {
                                mVar = mVarM;
                            } else {
                                mVar = mVarM instanceof r ? ((r) mVarM).f : null;
                            }
                            while (mVar != null) {
                                j2--;
                                mVar = mVar.d;
                            }
                            j(mVarArrF, i2, null);
                            i2++;
                        }
                    }
                }
            }
            mVarArrF = f(mVarArrF, mVarM);
        }
        if (j2 != 0) {
            a(j2, -1);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x004f */
    @Override // j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object compute(java.lang.Object r14, j$.util.function.BiFunction r15) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.compute(java.lang.Object, j$.util.function.BiFunction):java.lang.Object");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return compute(obj, j$.util.function.BiFunction.VivifiedWrapper.convert(biFunction));
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x004c */
    /* JADX WARN: Code duplicated, block: B:67:0x00b5 A[PHI: r4 r5
  0x00b5: PHI (r4v7 int) = (r4v1 int), (r4v1 int), (r4v12 int) binds: [B:36:0x005e, B:57:0x0095, B:66:0x00b4] A[DONT_GENERATE, DONT_INLINE]
  0x00b5: PHI (r5v9 java.lang.Object) = (r5v1 java.lang.Object), (r5v1 java.lang.Object), (r5v13 java.lang.Object) binds: [B:36:0x005e, B:57:0x0095, B:66:0x00b4] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object computeIfAbsent(java.lang.Object r12, j$.util.function.Function r13) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.computeIfAbsent(java.lang.Object, j$.util.function.Function):java.lang.Object");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return computeIfAbsent(obj, j$.util.function.Function.VivifiedWrapper.convert(function));
    }

    @Override // j$.util.Map
    public final Object computeIfPresent(Object obj, j$.util.function.BiFunction biFunction) {
        s sVarB;
        Object obj2;
        if (obj == null || biFunction == null) {
            throw null;
        }
        int iK = k(obj.hashCode());
        m[] mVarArrG = this.a;
        int i2 = 0;
        Object objApply = null;
        int i3 = 0;
        while (true) {
            if (mVarArrG != null) {
                int length = mVarArrG.length;
                if (length != 0) {
                    int i4 = (length - 1) & iK;
                    m mVarM = m(mVarArrG, i4);
                    if (mVarM == null) {
                        break;
                    }
                    int i5 = mVarM.a;
                    if (i5 == -1) {
                        mVarArrG = f(mVarArrG, mVarM);
                    } else {
                        synchronized (mVarM) {
                            try {
                                if (m(mVarArrG, i4) == mVarM) {
                                    if (i5 >= 0) {
                                        i3 = 1;
                                        m mVar = null;
                                        m mVar2 = mVarM;
                                        while (true) {
                                            if (mVar2.a == iK && ((obj2 = mVar2.b) == obj || (obj2 != null && obj.equals(obj2)))) {
                                                objApply = biFunction.apply(obj, mVar2.c);
                                                if (objApply == null) {
                                                    m mVar3 = mVar2.d;
                                                    if (mVar != null) {
                                                        mVar.d = mVar3;
                                                    } else {
                                                        j(mVarArrG, i4, mVar3);
                                                    }
                                                    i2 = -1;
                                                    break;
                                                }
                                                mVar2.c = objApply;
                                                break;
                                            }
                                            m mVar4 = mVar2.d;
                                            if (mVar4 == null) {
                                                break;
                                            }
                                            i3++;
                                            mVar = mVar2;
                                            mVar2 = mVar4;
                                        }
                                    } else if (mVarM instanceof r) {
                                        r rVar = (r) mVarM;
                                        s sVar = rVar.e;
                                        if (sVar != null && (sVarB = sVar.b(iK, obj, null)) != null) {
                                            objApply = biFunction.apply(obj, sVarB.c);
                                            if (objApply != null) {
                                                sVarB.c = objApply;
                                            } else {
                                                if (rVar.g(sVarB)) {
                                                    j(mVarArrG, i4, r(rVar.f));
                                                }
                                                i2 = -1;
                                            }
                                        }
                                        i3 = 2;
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (i3 != 0) {
                            break;
                        }
                    }
                }
            }
            mVarArrG = g();
        }
        if (i2 != 0) {
            a(i2, i3);
        }
        return objApply;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return computeIfPresent(obj, j$.util.function.BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final boolean containsValue(Object obj) {
        obj.getClass();
        m[] mVarArr = this.a;
        if (mVarArr != null) {
            q qVar = new q(mVarArr, mVarArr.length, 0, mVarArr.length);
            while (true) {
                m mVarF = qVar.f();
                if (mVarF == null) {
                    break;
                }
                Object obj2 = mVarF.c;
                if (obj2 == obj) {
                    return true;
                }
                if (obj2 != null && obj.equals(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        f fVar = this.f;
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f(this);
        this.f = fVar2;
        return fVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final boolean equals(Object obj) {
        V value;
        V v;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        m[] mVarArr = this.a;
        int length = mVarArr == null ? 0 : mVarArr.length;
        q qVar = new q(mVarArr, length, 0, length);
        while (true) {
            m mVarF = qVar.f();
            if (mVarF == null) {
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    K key = entry.getKey();
                    if (key == null || (value = entry.getValue()) == null || (v = get(key)) == null || (value != v && !value.equals(v))) {
                        return false;
                    }
                }
                return true;
            }
            Object obj2 = mVarF.c;
            Object obj3 = map.get(mVarF.b);
            if (obj3 == null || (obj3 != obj2 && !obj3.equals(obj2))) {
                break;
            }
        }
        return false;
    }

    final m[] f(m[] mVarArr, m mVar) {
        m[] mVarArr2;
        int i2;
        if (!(mVar instanceof h) || (mVarArr2 = ((h) mVar).e) == null) {
            return this.a;
        }
        int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(mVarArr.length) | 32768;
        while (mVarArr2 == this.b && this.a == mVarArr && (i2 = this.sizeCtl) < 0 && (i2 >>> h) == iNumberOfLeadingZeros && i2 != iNumberOfLeadingZeros + 1 && i2 != g + iNumberOfLeadingZeros && this.transferIndex > 0) {
            if (j.compareAndSwapInt(this, k, i2, i2 + 1)) {
                o(mVarArr, mVarArr2);
                break;
            }
        }
        return mVarArr2;
    }

    @Override // j$.util.concurrent.v, j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
        biConsumer.getClass();
        m[] mVarArr = this.a;
        if (mVarArr == null) {
            return;
        }
        q qVar = new q(mVarArr, mVarArr.length, 0, mVarArr.length);
        while (true) {
            m mVarF = qVar.f();
            if (mVarF == null) {
                return;
            } else {
                biConsumer.accept(mVarF.b, mVarF.c);
            }
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        forEach(BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public V get(Object obj) {
        int length;
        m mVarM;
        Object obj2;
        int iK = k(obj.hashCode());
        m[] mVarArr = this.a;
        if (mVarArr != null && (length = mVarArr.length) > 0 && (mVarM = m(mVarArr, (length - 1) & iK)) != null) {
            int i2 = mVarM.a;
            if (i2 == iK) {
                Object obj3 = mVarM.b;
                if (obj3 == obj || (obj3 != null && obj.equals(obj3))) {
                    return (V) mVarM.c;
                }
            } else if (i2 < 0) {
                m mVarA = mVarM.a(iK, obj);
                if (mVarA != null) {
                    return (V) mVarA.c;
                }
                return null;
            }
            while (true) {
                mVarM = mVarM.d;
                if (mVarM == null) {
                    break;
                }
                if (mVarM.a == iK && ((obj2 = mVarM.b) == obj || (obj2 != null && obj.equals(obj2)))) {
                    return (V) mVarM.c;
                }
            }
        }
        return null;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.v, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        V v = get(obj);
        return v == null ? obj2 : v;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0081 A[PHI: r3
  0x0081: PHI (r3v4 int) = (r3v1 int), (r3v1 int), (r3v11 int) binds: [B:20:0x003c, B:38:0x006b, B:35:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    final Object h(Object obj, Object obj2, boolean z) {
        Object obj3;
        Object obj4;
        if (obj == null || obj2 == null) {
            throw null;
        }
        int iK = k(obj.hashCode());
        m[] mVarArrG = this.a;
        int i2 = 0;
        while (true) {
            if (mVarArrG != null) {
                int length = mVarArrG.length;
                if (length != 0) {
                    int i3 = (length - 1) & iK;
                    m mVarM = m(mVarArrG, i3);
                    if (mVarM != null) {
                        int i4 = mVarM.a;
                        if (i4 == -1) {
                            mVarArrG = f(mVarArrG, mVarM);
                        } else {
                            synchronized (mVarM) {
                                if (m(mVarArrG, i3) != mVarM) {
                                    obj3 = null;
                                } else if (i4 >= 0) {
                                    i2 = 1;
                                    m mVar = mVarM;
                                    while (true) {
                                        if (mVar.a != iK || ((obj4 = mVar.b) != obj && (obj4 == null || !obj.equals(obj4)))) {
                                            m mVar2 = mVar.d;
                                            if (mVar2 == null) {
                                                mVar.d = new m(iK, obj, obj2, null);
                                                obj3 = null;
                                            } else {
                                                i2++;
                                                mVar = mVar2;
                                            }
                                        } else {
                                            obj3 = mVar.c;
                                            if (!z) {
                                                mVar.c = obj2;
                                            }
                                        }
                                    }
                                } else if (mVarM instanceof r) {
                                    s sVarF = ((r) mVarM).f(iK, obj, obj2);
                                    if (sVarF != null) {
                                        Object obj5 = sVarF.c;
                                        if (!z) {
                                            sVarF.c = obj2;
                                        }
                                        obj3 = obj5;
                                    } else {
                                        obj3 = null;
                                    }
                                    i2 = 2;
                                } else {
                                    obj3 = null;
                                }
                            }
                            if (i2 != 0) {
                                if (i2 >= 8) {
                                    p(mVarArrG, i3);
                                }
                                if (obj3 == null) {
                                    break;
                                }
                                return obj3;
                            }
                        }
                    } else if (b(mVarArrG, i3, new m(iK, obj, obj2, null))) {
                        break;
                    }
                }
            }
            mVarArrG = g();
        }
        a(1L, i2);
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final int hashCode() {
        m[] mVarArr = this.a;
        int iHashCode = 0;
        if (mVarArr != null) {
            q qVar = new q(mVarArr, mVarArr.length, 0, mVarArr.length);
            while (true) {
                m mVarF = qVar.f();
                if (mVarF == null) {
                    break;
                }
                iHashCode += mVarF.c.hashCode() ^ mVarF.b.hashCode();
            }
        }
        return iHashCode;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x009d  */
    final Object i(Object obj, Object obj2, Object obj3) {
        int length;
        int i2;
        m mVarM;
        boolean z;
        Object obj4;
        s sVarB;
        m mVarR;
        Object obj5;
        int iK = k(obj.hashCode());
        m[] mVarArrF = this.a;
        while (mVarArrF != null && (length = mVarArrF.length) != 0 && (mVarM = m(mVarArrF, (i2 = (length - 1) & iK))) != null) {
            int i3 = mVarM.a;
            if (i3 == -1) {
                mVarArrF = f(mVarArrF, mVarM);
            } else {
                synchronized (mVarM) {
                    try {
                        if (m(mVarArrF, i2) == mVarM) {
                            z = true;
                            if (i3 >= 0) {
                                m mVar = null;
                                m mVar2 = mVarM;
                                while (true) {
                                    if (mVar2.a != iK || ((obj5 = mVar2.b) != obj && (obj5 == null || !obj.equals(obj5)))) {
                                        m mVar3 = mVar2.d;
                                        if (mVar3 != null) {
                                            mVar = mVar2;
                                            mVar2 = mVar3;
                                        }
                                    } else {
                                        obj4 = mVar2.c;
                                        if (obj3 == null || obj3 == obj4 || (obj4 != null && obj3.equals(obj4))) {
                                            if (obj2 != null) {
                                                mVar2.c = obj2;
                                            } else if (mVar != null) {
                                                mVar.d = mVar2.d;
                                            } else {
                                                mVarR = mVar2.d;
                                                j(mVarArrF, i2, mVarR);
                                            }
                                        }
                                    }
                                    obj4 = null;
                                }
                            } else {
                                if (mVarM instanceof r) {
                                    r rVar = (r) mVarM;
                                    s sVar = rVar.e;
                                    if (sVar != null && (sVarB = sVar.b(iK, obj, null)) != null) {
                                        obj4 = sVarB.c;
                                        if (obj3 == null || obj3 == obj4 || (obj4 != null && obj3.equals(obj4))) {
                                            if (obj2 != null) {
                                                sVarB.c = obj2;
                                            } else if (rVar.g(sVarB)) {
                                                mVarR = r(rVar.f);
                                                j(mVarArrF, i2, mVarR);
                                            }
                                        }
                                    }
                                } else {
                                    z = false;
                                }
                                obj4 = null;
                            }
                        } else {
                            z = false;
                            obj4 = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z) {
                    if (obj4 == null) {
                        break;
                    }
                    if (obj2 == null) {
                        a(-1L, -1);
                    }
                    return obj4;
                }
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final boolean isEmpty() {
        return l() <= 0;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public Set<K> keySet() {
        j jVar = this.d;
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(this);
        this.d = jVar2;
        return jVar2;
    }

    final long l() {
        d[] dVarArr = this.c;
        long j2 = this.baseCount;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                if (dVar != null) {
                    j2 += dVar.value;
                }
            }
        }
        return j2;
    }

    @Override // j$.util.Map
    public final Object merge(Object obj, Object obj2, j$.util.function.BiFunction biFunction) {
        int i2;
        Object objApply;
        Object obj3;
        Object obj4 = obj2;
        if (obj == null || obj4 == null || biFunction == null) {
            throw null;
        }
        int iK = k(obj.hashCode());
        m[] mVarArrG = this.a;
        int i3 = 0;
        Object obj5 = null;
        int i4 = 0;
        while (true) {
            if (mVarArrG != null) {
                int length = mVarArrG.length;
                if (length != 0) {
                    int i5 = (length - 1) & iK;
                    m mVarM = m(mVarArrG, i5);
                    i2 = 1;
                    if (mVarM != null) {
                        int i6 = mVarM.a;
                        if (i6 == -1) {
                            mVarArrG = f(mVarArrG, mVarM);
                        } else {
                            synchronized (mVarM) {
                                try {
                                    if (m(mVarArrG, i5) == mVarM) {
                                        if (i6 >= 0) {
                                            m mVar = null;
                                            m mVar2 = mVarM;
                                            int i7 = 1;
                                            while (true) {
                                                if (mVar2.a == iK && ((obj3 = mVar2.b) == obj || (obj3 != null && obj.equals(obj3)))) {
                                                    objApply = biFunction.apply(mVar2.c, obj4);
                                                    if (objApply == null) {
                                                        m mVar3 = mVar2.d;
                                                        if (mVar != null) {
                                                            mVar.d = mVar3;
                                                        } else {
                                                            j(mVarArrG, i5, mVar3);
                                                        }
                                                        i4 = -1;
                                                        break;
                                                    }
                                                    mVar2.c = objApply;
                                                    break;
                                                }
                                                m mVar4 = mVar2.d;
                                                if (mVar4 == null) {
                                                    mVar2.d = new m(iK, obj, obj4, null);
                                                    objApply = obj4;
                                                    i4 = 1;
                                                    break;
                                                }
                                                i7++;
                                                mVar = mVar2;
                                                mVar2 = mVar4;
                                            }
                                            i3 = i7;
                                            obj5 = objApply;
                                        } else if (mVarM instanceof r) {
                                            r rVar = (r) mVarM;
                                            s sVar = rVar.e;
                                            s sVarB = sVar == null ? null : sVar.b(iK, obj, null);
                                            Object objApply2 = sVarB == null ? obj4 : biFunction.apply(sVarB.c, obj4);
                                            if (objApply2 != null) {
                                                if (sVarB != null) {
                                                    sVarB.c = objApply2;
                                                    obj5 = objApply2;
                                                    i3 = 2;
                                                } else {
                                                    rVar.f(iK, obj, objApply2);
                                                    obj5 = objApply2;
                                                    i3 = 2;
                                                    i4 = 1;
                                                }
                                            } else if (sVarB != null) {
                                                if (rVar.g(sVarB)) {
                                                    j(mVarArrG, i5, r(rVar.f));
                                                }
                                                obj5 = objApply2;
                                                i3 = 2;
                                                i4 = -1;
                                            } else {
                                                obj5 = objApply2;
                                                i3 = 2;
                                            }
                                        }
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            if (i3 != 0) {
                                if (i3 >= 8) {
                                    p(mVarArrG, i5);
                                }
                                i2 = i4;
                                obj4 = obj5;
                                break;
                            }
                        }
                    } else if (b(mVarArrG, i5, new m(iK, obj, obj4, null))) {
                        break;
                    }
                }
            }
            mVarArrG = g();
        }
        if (i2 != 0) {
            a(i2, i3);
        }
        return obj4;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return merge(obj, obj2, j$.util.function.BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public V put(K k2, V v) {
        return (V) h(k2, v, false);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        q(map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            h(entry.getKey(), entry.getValue(), false);
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public V putIfAbsent(K k2, V v) {
        return (V) h(k2, v, true);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public V remove(Object obj) {
        return (V) i(obj, null, null);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public boolean remove(Object obj, Object obj2) {
        obj.getClass();
        return (obj2 == null || i(obj, null, obj2) == null) ? false : true;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            throw null;
        }
        return i(obj, obj2, null);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        if (obj == null || obj2 == null || obj3 == null) {
            throw null;
        }
        return i(obj, obj3, obj2) != null;
    }

    @Override // j$.util.Map
    public final void replaceAll(j$.util.function.BiFunction biFunction) {
        biFunction.getClass();
        m[] mVarArr = this.a;
        if (mVarArr == null) {
            return;
        }
        q qVar = new q(mVarArr, mVarArr.length, 0, mVarArr.length);
        while (true) {
            m mVarF = qVar.f();
            if (mVarF == null) {
                return;
            }
            Object obj = mVarF.c;
            Object obj2 = mVarF.b;
            do {
                Object objApply = biFunction.apply(obj2, obj);
                objApply.getClass();
                if (i(obj2, objApply, obj) != null) {
                    break;
                } else {
                    obj = get(obj2);
                }
            } while (obj != null);
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        replaceAll(j$.util.function.BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public int size() {
        long jL = l();
        if (jL < 0) {
            return 0;
        }
        if (jL > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) jL;
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        m[] mVarArr = this.a;
        int length = mVarArr == null ? 0 : mVarArr.length;
        q qVar = new q(mVarArr, length, 0, length);
        StringBuilder sb = new StringBuilder("{");
        m mVarF = qVar.f();
        if (mVarF != null) {
            while (true) {
                Object obj = mVarF.b;
                Object obj2 = mVarF.c;
                if (obj == this) {
                    obj = "(this Map)";
                }
                sb.append(obj);
                sb.append('=');
                if (obj2 == this) {
                    obj2 = "(this Map)";
                }
                sb.append(obj2);
                mVarF = qVar.f();
                if (mVarF == null) {
                    break;
                }
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public Collection<V> values() {
        t tVar = this.e;
        if (tVar != null) {
            return tVar;
        }
        t tVar2 = new t(this);
        this.e = tVar2;
        return tVar2;
    }
}
