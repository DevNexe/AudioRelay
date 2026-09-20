package defpackage;

import com.google.android.gms.internal.ads.zzfwq;
import java.util.AbstractSet;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public abstract class op6 extends AbstractSet {
    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        return zzfwq.c(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        collection.getClass();
        return super.retainAll(collection);
    }
}
