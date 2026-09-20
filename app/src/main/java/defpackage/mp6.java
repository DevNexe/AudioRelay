package defpackage;

import com.google.android.gms.internal.ads.zzfsf;
import com.google.android.gms.internal.ads.zzfsg;
import com.google.android.gms.internal.ads.zzfvb;
import com.google.android.gms.internal.ads.zzfvf;
import com.google.android.gms.internal.ads.zzfwq;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public class mp6 extends AbstractCollection implements Set {
    public final Collection w;
    public final zzfsg x;

    public mp6(Set set, zzfsg zzfsgVar) {
        this.w = set;
        this.x = zzfsgVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean add(Object obj) {
        zzfsf.zze(this.x.zza(obj));
        return this.w.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zzfsf.zze(this.x.zza(it.next()));
        }
        return this.w.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void clear() {
        zzfvb.zza(this.w, this.x);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final boolean contains(@CheckForNull Object obj) {
        boolean zContains;
        Collection collection = this.w;
        collection.getClass();
        try {
            zContains = collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            zContains = false;
        }
        if (zContains) {
            return this.x.zza(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object obj) {
        return zzfwq.b(this, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final boolean isEmpty() {
        Iterator it = this.w.iterator();
        zzfsg zzfsgVar = this.x;
        zzfsf.zzc(zzfsgVar, "predicate");
        int i = 0;
        while (it.hasNext()) {
            if (zzfsgVar.zza(it.next())) {
                return i == -1;
            }
            i++;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Iterator iterator() {
        Iterator it = this.w.iterator();
        it.getClass();
        zzfsg zzfsgVar = this.x;
        zzfsgVar.getClass();
        return new to6(it, zzfsgVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final boolean remove(@CheckForNull Object obj) {
        return contains(obj) && this.w.remove(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return zzfwq.a(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final boolean removeAll(Collection collection) {
        Iterator it = this.w.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.x.zza(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final boolean retainAll(Collection collection) {
        Iterator it = this.w.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.x.zza(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final int size() {
        Iterator it = this.w.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.x.zza(it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        zzfvf.zzc(arrayList, it);
        return arrayList.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        zzfvf.zzc(arrayList, it);
        return arrayList.toArray(objArr);
    }
}
