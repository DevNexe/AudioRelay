package com.google.protobuf;

import defpackage.i22;
import defpackage.lk;
import defpackage.wd5;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class ct extends LPt8Fixed<String> implements i22, RandomAccess {
    public static final ct y;
    public final ArrayList x;

    static {
        ct ctVar = new ct(10);
        ctVar.w = false;
        y = ctVar;
    }

    public ct(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        a();
        this.x.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.LPt8Fixed, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.protobuf.LPt8Fixed, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.x.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        String str;
        ArrayList arrayList = this.x;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof lk) {
            lk lkVar = (lk) obj;
            str = lkVar.s();
            if (lkVar.g()) {
                arrayList.set(i, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, SjP.a);
            bm88.CQf cQf = bm88.a;
            if (bm88.a.c(0, bArr.length, bArr) == 0) {
                arrayList.set(i, str);
            }
        }
        return str;
    }

    @Override // defpackage.i22
    public final List<?> l() {
        return Collections.unmodifiableList(this.x);
    }

    @Override // defpackage.i22
    public final void o(lk lkVar) {
        a();
        this.x.add(lkVar);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.LPt8Fixed, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        Object objRemove = this.x.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        return objRemove instanceof lk ? ((lk) objRemove).s() : new String((byte[]) objRemove, SjP.a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a();
        Object obj2 = this.x.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        return obj2 instanceof lk ? ((lk) obj2).s() : new String((byte[]) obj2, SjP.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.x.size();
    }

    @Override // defpackage.i22
    public final i22 t() {
        return this.w ? new wd5(this) : this;
    }

    @Override // defpackage.i22
    public final Object w(int i) {
        return this.x.get(i);
    }

    public ct(i22 i22Var) {
        this.x = new ArrayList(i22Var.size());
        addAll(i22Var);
    }

    @Override // com.google.protobuf.LPt8Fixed, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        a();
        if (collection instanceof i22) {
            collection = ((i22) collection).l();
        }
        boolean zAddAll = this.x.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    public ct(ArrayList<Object> arrayList) {
        this.x = arrayList;
    }
}
