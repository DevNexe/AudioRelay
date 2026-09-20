package com.google.android.gms.internal.ads;

import defpackage.ys6;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgpe extends ys6 implements RandomAccess, zzgpf {
    public static final zzgpf zza;
    public final ArrayList x;

    static {
        zzgpe zzgpeVar = new zzgpe(10);
        zzgpeVar.zzb();
        zza = zzgpeVar;
    }

    public zzgpe() {
        this(10);
    }

    @Override // defpackage.ys6, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        a();
        this.x.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.ys6, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        a();
        if (collection instanceof zzgpf) {
            collection = ((zzgpf) collection).zzh();
        }
        boolean zAddAll = this.x.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // defpackage.ys6, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.x.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.ys6, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        Object objRemove = this.x.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        return objRemove instanceof zzgnf ? ((zzgnf) objRemove).zzA(zzgox.a) : zzgox.zzh((byte[]) objRemove);
    }

    @Override // defpackage.ys6, java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a();
        Object obj2 = this.x.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        return obj2 instanceof zzgnf ? ((zzgnf) obj2).zzA(zzgox.a) : zzgox.zzh((byte[]) obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.x.size();
    }

    @Override // com.google.android.gms.internal.ads.zzgow
    public final /* bridge */ /* synthetic */ zzgow zzd(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.x);
        return new zzgpe(arrayList);
    }

    @Override // com.google.android.gms.internal.ads.zzgpf
    public final zzgpf zze() {
        return zzc() ? new zzgrm(this) : this;
    }

    @Override // com.google.android.gms.internal.ads.zzgpf
    public final Object zzf(int i) {
        return this.x.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final String get(int i) {
        ArrayList arrayList = this.x;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzgnf) {
            zzgnf zzgnfVar = (zzgnf) obj;
            String strZzA = zzgnfVar.zzA(zzgox.a);
            if (zzgnfVar.zzp()) {
                arrayList.set(i, strZzA);
            }
            return strZzA;
        }
        byte[] bArr = (byte[]) obj;
        String strZzh = zzgox.zzh(bArr);
        if (zzgox.zzi(bArr)) {
            arrayList.set(i, strZzh);
        }
        return strZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzgpf
    public final List zzh() {
        return Collections.unmodifiableList(this.x);
    }

    @Override // com.google.android.gms.internal.ads.zzgpf
    public final void zzi(zzgnf zzgnfVar) {
        a();
        this.x.add(zzgnfVar);
        ((AbstractList) this).modCount++;
    }

    public zzgpe(int i) {
        this.x = new ArrayList(i);
    }

    public zzgpe(ArrayList arrayList) {
        this.x = arrayList;
    }

    @Override // defpackage.ys6, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
