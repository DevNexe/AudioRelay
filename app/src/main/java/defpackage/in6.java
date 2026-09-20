package defpackage;

import com.google.android.gms.internal.ads.zzfsf;
import j$.util.function.Consumer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class in6 implements Iterator, j$.util.Iterator {
    public final Iterator w;

    @CheckForNull
    public Collection x;
    public final /* synthetic */ jn6 y;

    public in6(jn6 jn6Var) {
        this.y = jn6Var;
        this.w = jn6Var.y.entrySet().iterator();
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
        return this.w.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.w.next();
        this.x = (Collection) entry.getValue();
        return this.y.a(entry);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        zzfsf.zzi(this.x != null, "no calls to next() since the last call to remove()");
        this.w.remove();
        this.y.z.A -= this.x.size();
        this.x.clear();
        this.x = null;
    }
}
