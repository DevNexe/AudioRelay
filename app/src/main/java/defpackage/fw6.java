package defpackage;

import com.google.android.gms.internal.ads.zzgui;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class fw6 implements Iterator, j$.util.Iterator {
    public int w = 0;
    public final /* synthetic */ zzgui x;

    public fw6(zzgui zzguiVar) {
        this.x = zzguiVar;
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
        int i = this.w;
        zzgui zzguiVar = this.x;
        return i < zzguiVar.w.size() || zzguiVar.x.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        int i = this.w;
        zzgui zzguiVar = this.x;
        int size = zzguiVar.w.size();
        List list = zzguiVar.w;
        if (i >= size) {
            list.add(zzguiVar.x.next());
            return next();
        }
        int i2 = this.w;
        this.w = i2 + 1;
        return list.get(i2);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
