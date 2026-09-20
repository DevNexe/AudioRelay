package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class sx5 implements Iterator {
    public final /* synthetic */ Iterator w;

    public sx5(Iterator it) {
        this.w = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.w.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new f06((String) this.w.next());
    }
}
