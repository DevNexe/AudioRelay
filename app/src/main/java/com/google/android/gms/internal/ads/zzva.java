package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzva extends zzct {
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public final SparseArray q;
    public final SparseBooleanArray r;

    @Deprecated
    public zzva() {
        this.q = new SparseArray();
        this.r = new SparseBooleanArray();
        this.k = true;
        this.l = true;
        this.m = true;
        this.n = true;
        this.o = true;
        this.p = true;
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final /* synthetic */ zzct zze(int i, int i2, boolean z) {
        super.zze(i, i2, true);
        return this;
    }

    public final zzva zzo(int i, boolean z) {
        SparseBooleanArray sparseBooleanArray = this.r;
        if (sparseBooleanArray.get(i) == z) {
            return this;
        }
        if (z) {
            sparseBooleanArray.put(i, true);
        } else {
            sparseBooleanArray.delete(i);
        }
        return this;
    }

    public zzva(Context context) {
        super.zzd(context);
        Point pointZzB = zzel.zzB(context);
        zze(pointZzB.x, pointZzB.y, true);
        this.q = new SparseArray();
        this.r = new SparseBooleanArray();
        this.k = true;
        this.l = true;
        this.m = true;
        this.n = true;
        this.o = true;
        this.p = true;
    }

    public /* synthetic */ zzva(zzvc zzvcVar) {
        super(zzvcVar);
        this.k = zzvcVar.zzG;
        this.l = zzvcVar.zzI;
        this.m = zzvcVar.zzK;
        this.n = zzvcVar.zzP;
        this.o = zzvcVar.zzQ;
        this.p = zzvcVar.zzS;
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        while (true) {
            SparseArray sparseArray2 = zzvcVar.a;
            if (i < sparseArray2.size()) {
                sparseArray.put(sparseArray2.keyAt(i), new HashMap((Map) sparseArray2.valueAt(i)));
                i++;
            } else {
                this.q = sparseArray;
                this.r = zzvcVar.b.clone();
                return;
            }
        }
    }
}
