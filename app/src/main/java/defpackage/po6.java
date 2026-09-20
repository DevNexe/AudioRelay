package defpackage;

import com.google.android.gms.internal.ads.zzfsf;
import com.google.android.gms.internal.ads.zzfuv;
import com.google.android.gms.internal.ads.zzfwv;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class po6 extends zzfwv {
    public final int w;
    public int x;
    public final zzfuv y;

    public po6(int i, zzfuv zzfuvVar) {
        int size = zzfuvVar.size();
        zzfsf.zzb(i, size, "index");
        this.w = size;
        this.x = i;
        this.y = zzfuvVar;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean hasNext() {
        return this.x < this.w;
    }

    @Override // java.util.ListIterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final boolean hasPrevious() {
        return this.x > 0;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.x;
        this.x = i + 1;
        return this.y.get(i);
    }

    @Override // java.util.ListIterator
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.x - 1;
        this.x = i;
        return this.y.get(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.x;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.x - 1;
    }
}
