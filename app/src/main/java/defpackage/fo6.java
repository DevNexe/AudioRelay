package defpackage;

import com.google.android.gms.internal.ads.zzfsa;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class fo6 extends AbstractSet {
    public final /* synthetic */ jo6 w;

    public fo6(jo6 jo6Var) {
        this.w = jo6Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.w.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        jo6 jo6Var = this.w;
        Map mapA = jo6Var.a();
        if (mapA != null) {
            return mapA.entrySet().contains(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        int iE = jo6Var.e(entry.getKey());
        if (iE == -1) {
            return false;
        }
        Object[] objArr = jo6Var.z;
        objArr.getClass();
        return zzfsa.zza(objArr[iE], entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        jo6 jo6Var = this.w;
        Map mapA = jo6Var.a();
        return mapA != null ? mapA.entrySet().iterator() : new co6(jo6Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@CheckForNull Object obj) {
        jo6 jo6Var = this.w;
        Map mapA = jo6Var.a();
        if (mapA != null) {
            return mapA.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (jo6Var.c()) {
            return false;
        }
        int i = (1 << (jo6Var.A & 31)) - 1;
        Object key = entry.getKey();
        Object value = entry.getValue();
        Object obj2 = jo6Var.w;
        obj2.getClass();
        int[] iArr = jo6Var.x;
        iArr.getClass();
        Object[] objArr = jo6Var.y;
        objArr.getClass();
        Object[] objArr2 = jo6Var.z;
        objArr2.getClass();
        int i2 = ko6.i(key, value, i, obj2, iArr, objArr, objArr2);
        if (i2 == -1) {
            return false;
        }
        jo6Var.b(i2, i);
        jo6Var.B--;
        jo6Var.A += 32;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.w.size();
    }
}
