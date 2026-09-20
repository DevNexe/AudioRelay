package defpackage;

import com.google.android.gms.internal.ads.zzfsf;
import j$.util.function.Consumer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ln6 implements Iterator, j$.util.Iterator {

    @CheckForNull
    public Map.Entry w;
    public final /* synthetic */ Iterator x;
    public final /* synthetic */ mn6 y;

    public ln6(mn6 mn6Var, Iterator it) {
        this.y = mn6Var;
        this.x = it;
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
        return this.x.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.x.next();
        this.w = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        zzfsf.zzi(this.w != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.w.getValue();
        this.x.remove();
        this.y.x.A -= collection.size();
        collection.clear();
        this.w = null;
    }
}
