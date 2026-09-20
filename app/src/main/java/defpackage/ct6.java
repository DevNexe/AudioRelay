package defpackage;

import com.google.android.gms.internal.ads.zzgow;
import com.google.android.gms.internal.ads.zzgox;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class ct6 extends ys6 implements RandomAccess, ou6 {
    public boolean[] x;
    public int y;

    static {
        new ct6(new boolean[0], 0).zzb();
    }

    public ct6() {
        this(new boolean[10], 0);
    }

    @Override // defpackage.ys6, java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        a();
        if (i < 0 || i > (i2 = this.y)) {
            throw new IndexOutOfBoundsException(Md5A.e("Index:", i, ", Size:", this.y));
        }
        boolean[] zArr = this.x;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[qa0.a(i2, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.x, i, zArr2, i + 1, this.y - i);
            this.x = zArr2;
        }
        this.x[i] = zBooleanValue;
        this.y++;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.ys6, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = zzgox.a;
        collection.getClass();
        if (!(collection instanceof ct6)) {
            return super.addAll(collection);
        }
        ct6 ct6Var = (ct6) collection;
        int i = ct6Var.y;
        if (i == 0) {
            return false;
        }
        int i2 = this.y;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.x;
        if (i3 > zArr.length) {
            this.x = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(ct6Var.x, 0, this.x, this.y, ct6Var.y);
        this.y = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(boolean z) {
        a();
        int i = this.y;
        boolean[] zArr = this.x;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[qa0.a(i, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.x = zArr2;
        }
        boolean[] zArr3 = this.x;
        int i2 = this.y;
        this.y = i2 + 1;
        zArr3[i2] = z;
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
        if (!(obj instanceof ct6)) {
            return super.equals(obj);
        }
        ct6 ct6Var = (ct6) obj;
        if (this.y != ct6Var.y) {
            return false;
        }
        boolean[] zArr = ct6Var.x;
        for (int i = 0; i < this.y; i++) {
            if (this.x[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        c(i);
        return Boolean.valueOf(this.x[i]);
    }

    @Override // defpackage.ys6, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZza = 1;
        for (int i = 0; i < this.y; i++) {
            iZza = (iZza * 31) + zzgox.zza(this.x[i]);
        }
        return iZza;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i = this.y;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.x[i2] == zBooleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.ys6, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        a();
        c(i);
        boolean[] zArr = this.x;
        boolean z = zArr[i];
        int i2 = this.y;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.y--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        a();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.x;
        System.arraycopy(zArr, i2, zArr, i, this.y - i2);
        this.y -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.ys6, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        a();
        c(i);
        boolean[] zArr = this.x;
        boolean z = zArr[i];
        zArr[i] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.y;
    }

    @Override // com.google.android.gms.internal.ads.zzgow
    public final /* bridge */ /* synthetic */ zzgow zzd(int i) {
        if (i >= this.y) {
            return new ct6(Arrays.copyOf(this.x, i), this.y);
        }
        throw new IllegalArgumentException();
    }

    public ct6(boolean[] zArr, int i) {
        this.x = zArr;
        this.y = i;
    }

    @Override // defpackage.ys6, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        b(((Boolean) obj).booleanValue());
        return true;
    }
}
