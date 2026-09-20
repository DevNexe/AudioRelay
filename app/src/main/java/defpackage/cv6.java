package defpackage;

import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class cv6 implements Iterator, j$.util.Iterator {
    public int w = -1;
    public boolean x;
    public Iterator y;
    public final /* synthetic */ fv6 z;

    public /* synthetic */ cv6(fv6 fv6Var) {
        this.z = fv6Var;
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
        fv6 fv6Var = this.z;
        if (i >= fv6Var.x.size()) {
            return !fv6Var.y.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.x = true;
        int i = this.w + 1;
        this.w = i;
        fv6 fv6Var = this.z;
        return i < fv6Var.x.size() ? (Map.Entry) fv6Var.x.get(this.w) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        if (!this.x) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.x = false;
        int i = fv6.C;
        fv6 fv6Var = this.z;
        fv6Var.g();
        if (this.w >= fv6Var.x.size()) {
            a().remove();
            return;
        }
        int i2 = this.w;
        this.w = i2 - 1;
        fv6Var.e(i2);
    }
}
