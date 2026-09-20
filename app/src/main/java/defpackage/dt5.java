package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class dt5 implements Iterator {
    public final /* synthetic */ Iterator w;
    public final /* synthetic */ Iterator x;

    public dt5(Iterator it, Iterator it2) {
        this.w = it;
        this.x = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.w.hasNext()) {
            return true;
        }
        return this.x.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Iterator it = this.w;
        if (it.hasNext()) {
            return new f06(((Integer) it.next()).toString());
        }
        Iterator it2 = this.x;
        if (it2.hasNext()) {
            return new f06((String) it2.next());
        }
        throw new NoSuchElementException();
    }
}
