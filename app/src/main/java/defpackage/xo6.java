package defpackage;

import com.google.android.gms.internal.ads.zzfru;
import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class xo6 extends AbstractSequentialList implements Serializable {
    public final List w;
    public final zzfru x;

    public xo6(List list, zzfru zzfruVar) {
        this.w = list;
        this.x = zzfruVar;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.w.clear();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new wo6(this.w.listIterator(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.w.size();
    }
}
