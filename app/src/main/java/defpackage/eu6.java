package defpackage;

import com.google.android.gms.internal.ads.zzgov;
import com.google.android.gms.internal.ads.zzgox;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class eu6 extends ys6 implements RandomAccess, zzgov, ou6 {
    public static final eu6 z;
    public long[] x;
    public int y;

    static {
        eu6 eu6Var = new eu6(new long[0], 0);
        z = eu6Var;
        eu6Var.zzb();
    }

    public eu6() {
        this(new long[10], 0);
    }

    @Override // defpackage.ys6, java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        a();
        if (i < 0 || i > (i2 = this.y)) {
            throw new IndexOutOfBoundsException(Md5A.e("Index:", i, ", Size:", this.y));
        }
        long[] jArr = this.x;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[qa0.a(i2, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.x, i, jArr2, i + 1, this.y - i);
            this.x = jArr2;
        }
        this.x[i] = jLongValue;
        this.y++;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.ys6, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = zzgox.a;
        collection.getClass();
        if (!(collection instanceof eu6)) {
            return super.addAll(collection);
        }
        eu6 eu6Var = (eu6) collection;
        int i = eu6Var.y;
        if (i == 0) {
            return false;
        }
        int i2 = this.y;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.x;
        if (i3 > jArr.length) {
            this.x = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(eu6Var.x, 0, this.x, this.y, eu6Var.y);
        this.y = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(long j) {
        a();
        int i = this.y;
        long[] jArr = this.x;
        if (i == jArr.length) {
            long[] jArr2 = new long[qa0.a(i, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.x = jArr2;
        }
        long[] jArr3 = this.x;
        int i2 = this.y;
        this.y = i2 + 1;
        jArr3[i2] = j;
    }

    public final void c(int i) {
        if (i < 0 || i >= this.y) {
            throw new IndexOutOfBoundsException(Md5A.e("Index:", i, ", Size:", this.y));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.ys6, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eu6)) {
            return super.equals(obj);
        }
        eu6 eu6Var = (eu6) obj;
        if (this.y != eu6Var.y) {
            return false;
        }
        long[] jArr = eu6Var.x;
        for (int i = 0; i < this.y; i++) {
            if (this.x[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        c(i);
        return Long.valueOf(this.x[i]);
    }

    @Override // defpackage.ys6, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZzc = 1;
        for (int i = 0; i < this.y; i++) {
            iZzc = (iZzc * 31) + zzgox.zzc(this.x[i]);
        }
        return iZzc;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i = this.y;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.x[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.ys6, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        a();
        c(i);
        long[] jArr = this.x;
        long j = jArr[i];
        int i2 = this.y;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.y--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        a();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.x;
        System.arraycopy(jArr, i2, jArr, i, this.y - i2);
        this.y -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.ys6, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        a();
        c(i);
        long[] jArr = this.x;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.y;
    }

    @Override // com.google.android.gms.internal.ads.zzgow
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzgov zzd(int i) {
        if (i >= this.y) {
            return new eu6(Arrays.copyOf(this.x, i), this.y);
        }
        throw new IllegalArgumentException();
    }

    public eu6(long[] jArr, int i) {
        this.x = jArr;
        this.y = i;
    }

    @Override // defpackage.ys6, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        b(((Long) obj).longValue());
        return true;
    }
}
