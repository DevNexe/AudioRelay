package defpackage;

import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class i47 implements Iterator, j$.util.Iterator {
    public int w = -1;
    public boolean x;
    public Iterator y;
    public final /* synthetic */ k47 z;

    public /* synthetic */ i47(k47 k47Var) {
        this.z = k47Var;
    }

    public final Iterator a() {
        if (this.y == null) {
            this.y = this.z.y.entrySet().iterator();
        }
        return this.y;
    }

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
        int i = this.w + 1;
        k47 k47Var = this.z;
        if (i >= k47Var.x.size()) {
            return !k47Var.y.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.x = true;
        int i = this.w + 1;
        this.w = i;
        k47 k47Var = this.z;
        return i < k47Var.x.size() ? (Map.Entry) k47Var.x.get(this.w) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        if (!this.x) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.x = false;
        int i = k47.C;
        k47 k47Var = this.z;
        k47Var.g();
        if (this.w >= k47Var.x.size()) {
            a().remove();
            return;
        }
        int i2 = this.w;
        this.w = i2 - 1;
        k47Var.e(i2);
    }
}
