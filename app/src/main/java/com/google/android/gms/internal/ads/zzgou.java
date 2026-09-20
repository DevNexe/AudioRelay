package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgou extends AbstractList {
    public final List w;
    public final zzgot x;

    public zzgou(List list, zzgot zzgotVar) {
        this.w = list;
        this.x = zzgotVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        zzbfj zzbfjVarZzb = zzbfj.zzb(((Integer) this.w.get(i)).intValue());
        return zzbfjVarZzb == null ? zzbfj.AD_FORMAT_TYPE_UNSPECIFIED : zzbfjVarZzb;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.w.size();
    }
}
