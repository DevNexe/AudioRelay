package com.google.android.gms.internal.ads;

import defpackage.fw6;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgui extends AbstractList {
    public static final zzguj y = zzguj.zzb(zzgui.class);
    public final List w;
    public final Iterator x;

    public zzgui(List list, Iterator it) {
        this.w = list;
        this.x = it;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        List list = this.w;
        if (list.size() > i) {
            return list.get(i);
        }
        Iterator it = this.x;
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        list.add(it.next());
        return get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new fw6(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        zzguj zzgujVar = y;
        zzgujVar.zza("potentially expensive size() call");
        zzgujVar.zza("blowup running");
        while (true) {
            Iterator it = this.x;
            boolean zHasNext = it.hasNext();
            List list = this.w;
            if (!zHasNext) {
                return list.size();
            }
            list.add(it.next());
        }
    }
}
