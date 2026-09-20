package defpackage;

import com.google.android.gms.internal.ads.zzfsa;
import com.google.android.gms.internal.ads.zzfsf;
import com.google.android.gms.internal.ads.zzfxa;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class jo6 extends AbstractMap implements Serializable {
    public static final Object F = new Object();
    public transient int A = zzfxa.zzb(8, 1, 1073741823);
    public transient int B;

    @CheckForNull
    public transient ho6 C;

    @CheckForNull
    public transient fo6 D;

    @CheckForNull
    public transient zn6 E;

    @CheckForNull
    public transient Object w;

    @CheckForNull
    public transient int[] x;

    @CheckForNull
    public transient Object[] y;

    @CheckForNull
    public transient Object[] z;

    @CheckForNull
    public final Map a() {
        Object obj = this.w;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void b(int i, int i2) {
        Object obj = this.w;
        obj.getClass();
        int[] iArr = this.x;
        iArr.getClass();
        Object[] objArr = this.y;
        objArr.getClass();
        Object[] objArr2 = this.z;
        objArr2.getClass();
        int size = size() - 1;
        if (i >= size) {
            objArr[i] = null;
            objArr2[i] = null;
            iArr[i] = 0;
            return;
        }
        Object obj2 = objArr[size];
        objArr[i] = obj2;
        objArr2[i] = objArr2[size];
        objArr[size] = null;
        objArr2[size] = null;
        iArr[i] = iArr[size];
        iArr[size] = 0;
        int iH = ko6.h(obj2) & i2;
        int iJ = ko6.j(iH, obj);
        int i3 = size + 1;
        if (iJ == i3) {
            ko6.l(iH, i + 1, obj);
            return;
        }
        while (true) {
            int i4 = iJ - 1;
            int i5 = iArr[i4];
            int i6 = i5 & i2;
            if (i6 == i3) {
                iArr[i4] = ((i + 1) & i2) | (i5 & (~i2));
                return;
            }
            iJ = i6;
        }
    }

    public final boolean c() {
        return this.w == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (c()) {
            return;
        }
        this.A += 32;
        Map mapA = a();
        if (mapA != null) {
            this.A = zzfxa.zzb(size(), 3, 1073741823);
            mapA.clear();
            this.w = null;
            this.B = 0;
            return;
        }
        Object[] objArr = this.y;
        objArr.getClass();
        Arrays.fill(objArr, 0, this.B, (Object) null);
        Object[] objArr2 = this.z;
        objArr2.getClass();
        Arrays.fill(objArr2, 0, this.B, (Object) null);
        Object obj = this.w;
        obj.getClass();
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        int[] iArr = this.x;
        iArr.getClass();
        Arrays.fill(iArr, 0, this.B, 0);
        this.B = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(@CheckForNull Object obj) {
        Map mapA = a();
        if (mapA != null) {
            return mapA.containsKey(obj);
        }
        return e(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(@CheckForNull Object obj) {
        Map mapA = a();
        if (mapA != null) {
            return mapA.containsValue(obj);
        }
        for (int i = 0; i < this.B; i++) {
            Object[] objArr = this.z;
            objArr.getClass();
            if (zzfsa.zza(obj, objArr[i])) {
                return true;
            }
        }
        return false;
    }

    public final int e(@CheckForNull Object obj) {
        if (c()) {
            return -1;
        }
        int iH = ko6.h(obj);
        int i = (1 << (this.A & 31)) - 1;
        Object obj2 = this.w;
        obj2.getClass();
        int iJ = ko6.j(iH & i, obj2);
        if (iJ != 0) {
            int i2 = ~i;
            int i3 = iH & i2;
            do {
                int i4 = iJ - 1;
                int[] iArr = this.x;
                iArr.getClass();
                int i5 = iArr[i4];
                if ((i5 & i2) == i3) {
                    Object[] objArr = this.y;
                    objArr.getClass();
                    if (zzfsa.zza(obj, objArr[i4])) {
                        return i4;
                    }
                }
                iJ = i5 & i;
            } while (iJ != 0);
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        fo6 fo6Var = this.D;
        if (fo6Var != null) {
            return fo6Var;
        }
        fo6 fo6Var2 = new fo6(this);
        this.D = fo6Var2;
        return fo6Var2;
    }

    public final int f(int i, int i2, int i3, int i4) {
        Object objK = ko6.k(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            ko6.l(i3 & i5, i4 + 1, objK);
        }
        Object obj = this.w;
        obj.getClass();
        int[] iArr = this.x;
        iArr.getClass();
        for (int i6 = 0; i6 <= i; i6++) {
            int iJ = ko6.j(i6, obj);
            while (iJ != 0) {
                int i7 = iJ - 1;
                int i8 = iArr[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iJ2 = ko6.j(i10, objK);
                ko6.l(i10, iJ, objK);
                iArr[i7] = ((~i5) & i9) | (iJ2 & i5);
                iJ = i8 & i;
            }
        }
        this.w = objK;
        this.A = ((32 - Integer.numberOfLeadingZeros(i5)) & 31) | (this.A & (-32));
        return i5;
    }

    public final Object g(@CheckForNull Object obj) {
        boolean zC = c();
        Object obj2 = F;
        if (zC) {
            return obj2;
        }
        int i = (1 << (this.A & 31)) - 1;
        Object obj3 = this.w;
        obj3.getClass();
        int[] iArr = this.x;
        iArr.getClass();
        Object[] objArr = this.y;
        objArr.getClass();
        int i2 = ko6.i(obj, null, i, obj3, iArr, objArr, null);
        if (i2 == -1) {
            return obj2;
        }
        Object[] objArr2 = this.z;
        objArr2.getClass();
        Object obj4 = objArr2[i2];
        b(i2, i);
        this.B--;
        this.A += 32;
        return obj4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final Object get(@CheckForNull Object obj) {
        Map mapA = a();
        if (mapA != null) {
            return mapA.get(obj);
        }
        int iE = e(obj);
        if (iE == -1) {
            return null;
        }
        Object[] objArr = this.z;
        objArr.getClass();
        return objArr[iE];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        ho6 ho6Var = this.C;
        if (ho6Var != null) {
            return ho6Var;
        }
        ho6 ho6Var2 = new ho6(this);
        this.C = ho6Var2;
        return ho6Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final Object put(Object obj, Object obj2) {
        int iMin;
        int i = -1;
        if (c()) {
            zzfsf.zzi(c(), "Arrays already allocated");
            int i2 = this.A;
            int iMax = Math.max(i2 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.w = ko6.k(iMax2);
            this.A = ((32 - Integer.numberOfLeadingZeros(iMax2 - 1)) & 31) | (this.A & (-32));
            this.x = new int[i2];
            this.y = new Object[i2];
            this.z = new Object[i2];
        }
        Map mapA = a();
        if (mapA != null) {
            return mapA.put(obj, obj2);
        }
        int[] iArr = this.x;
        iArr.getClass();
        Object[] objArr = this.y;
        objArr.getClass();
        Object[] objArr2 = this.z;
        objArr2.getClass();
        int i3 = this.B;
        int i4 = i3 + 1;
        int iH = ko6.h(obj);
        int iF = (1 << (this.A & 31)) - 1;
        int i5 = iH & iF;
        Object obj3 = this.w;
        obj3.getClass();
        int iJ = ko6.j(i5, obj3);
        if (iJ != 0) {
            int i6 = ~iF;
            int i7 = iH & i6;
            int i8 = 0;
            while (true) {
                int i9 = iJ + i;
                int i10 = iArr[i9];
                int i11 = i10 & i6;
                if (i11 == i7 && zzfsa.zza(obj, objArr[i9])) {
                    Object obj4 = objArr2[i9];
                    objArr2[i9] = obj2;
                    return obj4;
                }
                int i12 = i10 & iF;
                int i13 = i7;
                int i14 = i8 + 1;
                if (i12 == 0) {
                    if (i14 < 9) {
                        if (i4 <= iF) {
                            iArr[i9] = i11 | (i4 & iF);
                            break;
                        }
                        iF = f(iF, (iF + 1) * (iF < 32 ? 4 : 2), iH, i3);
                        break;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(((1 << (this.A & 31)) - 1) + 1, 1.0f);
                    int i15 = isEmpty() ? -1 : 0;
                    while (i15 >= 0) {
                        Object[] objArr3 = this.y;
                        objArr3.getClass();
                        Object obj5 = objArr3[i15];
                        Object[] objArr4 = this.z;
                        objArr4.getClass();
                        linkedHashMap.put(obj5, objArr4[i15]);
                        int i16 = i15 + 1;
                        i15 = i16 < this.B ? i16 : -1;
                    }
                    this.w = linkedHashMap;
                    this.x = null;
                    this.y = null;
                    this.z = null;
                    this.A += 32;
                    return linkedHashMap.put(obj, obj2);
                }
                i8 = i14;
                iJ = i12;
                i7 = i13;
                i = -1;
            }
        } else if (i4 > iF) {
            iF = f(iF, (iF + 1) * (iF < 32 ? 4 : 2), iH, i3);
        } else {
            Object obj6 = this.w;
            obj6.getClass();
            ko6.l(i5, i4, obj6);
        }
        int[] iArr2 = this.x;
        iArr2.getClass();
        int length = iArr2.length;
        if (i4 > length && (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            int[] iArr3 = this.x;
            iArr3.getClass();
            this.x = Arrays.copyOf(iArr3, iMin);
            Object[] objArr5 = this.y;
            objArr5.getClass();
            this.y = Arrays.copyOf(objArr5, iMin);
            Object[] objArr6 = this.z;
            objArr6.getClass();
            this.z = Arrays.copyOf(objArr6, iMin);
        }
        int[] iArr4 = this.x;
        iArr4.getClass();
        iArr4[i3] = (~iF) & iH;
        Object[] objArr7 = this.y;
        objArr7.getClass();
        objArr7[i3] = obj;
        Object[] objArr8 = this.z;
        objArr8.getClass();
        objArr8[i3] = obj2;
        this.B = i4;
        this.A += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final Object remove(@CheckForNull Object obj) {
        Map mapA = a();
        if (mapA != null) {
            return mapA.remove(obj);
        }
        Object objG = g(obj);
        if (objG == F) {
            return null;
        }
        return objG;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapA = a();
        return mapA != null ? mapA.size() : this.B;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        zn6 zn6Var = this.E;
        if (zn6Var != null) {
            return zn6Var;
        }
        zn6 zn6Var2 = new zn6(this, 1);
        this.E = zn6Var2;
        return zn6Var2;
    }
}
