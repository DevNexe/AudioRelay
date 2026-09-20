package defpackage;

import com.google.android.gms.internal.ads.zzfsf;
import j$.util.function.Consumer;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class go6 implements Iterator, j$.util.Iterator {
    public int w;
    public int x;
    public int y;
    public final /* synthetic */ jo6 z;

    public go6(jo6 jo6Var) {
        this.z = jo6Var;
        this.w = jo6Var.A;
        this.x = jo6Var.isEmpty() ? -1 : 0;
        this.y = -1;
    }

    public abstract Object a(int i);

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        j$.util.Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.x >= 0;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        jo6 jo6Var = this.z;
        if (jo6Var.A != this.w) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.x;
        this.y = i;
        Object objA = a(i);
        int i2 = this.x + 1;
        if (i2 >= jo6Var.B) {
            i2 = -1;
        }
        this.x = i2;
        return objA;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        jo6 jo6Var = this.z;
        if (jo6Var.A != this.w) {
            throw new ConcurrentModificationException();
        }
        zzfsf.zzi(this.y >= 0, "no calls to next() since the last call to remove()");
        this.w += 32;
        int i = this.y;
        Object[] objArr = jo6Var.y;
        objArr.getClass();
        jo6Var.remove(objArr[i]);
        this.x--;
        this.y = -1;
    }
}
