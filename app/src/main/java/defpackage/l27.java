package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class l27 extends wy6 implements RandomAccess, m27 {
    public final ArrayList x;

    static {
        new l27(10).w = false;
    }

    public l27() {
        this(10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        a();
        this.x.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.wy6, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        a();
        if (collection instanceof m27) {
            collection = ((m27) collection).zzh();
        }
        boolean zAddAll = this.x.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String get(int i) {
        ArrayList arrayList = this.x;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof a07) {
            a07 a07Var = (a07) obj;
            String strF = a07Var.c() == 0 ? "" : a07Var.f(f27.a);
            if (a07Var.h()) {
                arrayList.set(i, strF);
            }
            return strF;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, f27.a);
        p57 p57Var = s57.a;
        int length = bArr.length;
        p57Var.getClass();
        if (g57.a(bArr, 0, length)) {
            arrayList.set(i, str);
        }
        return str;
    }

    @Override // defpackage.wy6, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.x.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.m27
    public final void q(a07 a07Var) {
        a();
        this.x.add(a07Var);
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.wy6, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        Object objRemove = this.x.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof a07)) {
            return new String((byte[]) objRemove, f27.a);
        }
        a07 a07Var = (a07) objRemove;
        return a07Var.c() == 0 ? "" : a07Var.f(f27.a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a();
        Object obj2 = this.x.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof a07)) {
            return new String((byte[]) obj2, f27.a);
        }
        a07 a07Var = (a07) obj2;
        return a07Var.c() == 0 ? "" : a07Var.f(f27.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.x.size();
    }

    @Override // defpackage.d27
    public final /* bridge */ /* synthetic */ d27 zzd(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.x);
        return new l27(arrayList);
    }

    @Override // defpackage.m27
    public final m27 zze() {
        return this.w ? new q47(this) : this;
    }

    @Override // defpackage.m27
    public final Object zzf(int i) {
        return this.x.get(i);
    }

    @Override // defpackage.m27
    public final List zzh() {
        return Collections.unmodifiableList(this.x);
    }

    public l27(int i) {
        this.x = new ArrayList(i);
    }

    public l27(ArrayList arrayList) {
        this.x = arrayList;
    }

    @Override // defpackage.wy6, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
