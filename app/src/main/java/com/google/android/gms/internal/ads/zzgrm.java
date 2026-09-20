package com.google.android.gms.internal.ads;

import defpackage.iv6;
import defpackage.uu6;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgrm extends AbstractList implements RandomAccess, zzgpf {
    public final zzgpf w;

    public zzgrm(zzgpf zzgpfVar) {
        this.w = zzgpfVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((zzgpe) this.w).get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new uu6(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new iv6(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.w.size();
    }

    @Override // com.google.android.gms.internal.ads.zzgpf
    public final zzgpf zze() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgpf
    public final Object zzf(int i) {
        return this.w.zzf(i);
    }

    @Override // com.google.android.gms.internal.ads.zzgpf
    public final List zzh() {
        return this.w.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzgpf
    public final void zzi(zzgnf zzgnfVar) {
        throw new UnsupportedOperationException();
    }
}
