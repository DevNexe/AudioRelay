package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzvc extends zzcu {
    public static final zzvc zzD;

    @Deprecated
    public static final zzvc zzE;
    public static final zzn zzF;
    public final SparseArray a;
    public final SparseBooleanArray b;
    public final boolean zzG;
    public final boolean zzH;
    public final boolean zzI;
    public final boolean zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final boolean zzR;
    public final boolean zzS;

    static {
        zzvc zzvcVar = new zzvc(new zzva());
        zzD = zzvcVar;
        zzE = zzvcVar;
        zzF = new zzn() { // from class: com.google.android.gms.internal.ads.zzuy
        };
    }

    public zzvc(zzva zzvaVar) {
        super(zzvaVar);
        this.zzG = zzvaVar.k;
        this.zzH = false;
        this.zzI = zzvaVar.l;
        this.zzJ = false;
        this.zzK = zzvaVar.m;
        this.zzL = false;
        this.zzM = false;
        this.zzN = false;
        this.zzO = false;
        this.zzP = zzvaVar.n;
        this.zzQ = zzvaVar.o;
        this.zzR = false;
        this.zzS = zzvaVar.p;
        this.a = zzvaVar.q;
        this.b = zzvaVar.r;
    }

    public static zzvc zzd(Context context) {
        return new zzvc(new zzva(context));
    }

    @Override // com.google.android.gms.internal.ads.zzcu
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzvc.class == obj.getClass()) {
            zzvc zzvcVar = (zzvc) obj;
            if (super.equals(zzvcVar) && this.zzG == zzvcVar.zzG && this.zzI == zzvcVar.zzI && this.zzK == zzvcVar.zzK && this.zzP == zzvcVar.zzP && this.zzQ == zzvcVar.zzQ && this.zzS == zzvcVar.zzS) {
                SparseBooleanArray sparseBooleanArray = this.b;
                int size = sparseBooleanArray.size();
                SparseBooleanArray sparseBooleanArray2 = zzvcVar.b;
                if (sparseBooleanArray2.size() == size) {
                    for (int i = 0; i < size; i++) {
                        if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) >= 0) {
                        }
                    }
                    SparseArray sparseArray = this.a;
                    int size2 = sparseArray.size();
                    SparseArray sparseArray2 = zzvcVar.a;
                    if (sparseArray2.size() == size2) {
                        for (int i2 = 0; i2 < size2; i2++) {
                            int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                            if (iIndexOfKey >= 0) {
                                Map map = (Map) sparseArray.valueAt(i2);
                                Map map2 = (Map) sparseArray2.valueAt(iIndexOfKey);
                                if (map2.size() == map.size()) {
                                    for (Map.Entry entry : map.entrySet()) {
                                        zzue zzueVar = (zzue) entry.getKey();
                                        if (!map2.containsKey(zzueVar) || !zzel.zzT(entry.getValue(), map2.get(zzueVar))) {
                                        }
                                    }
                                }
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcu
    public final int hashCode() {
        return ((((((((((((super.hashCode() + 31) * 31) + (this.zzG ? 1 : 0)) * 961) + (this.zzI ? 1 : 0)) * 961) + (this.zzK ? 1 : 0)) * 28629151) + (this.zzP ? 1 : 0)) * 31) + (this.zzQ ? 1 : 0)) * 961) + (this.zzS ? 1 : 0);
    }

    public final zzva zzc() {
        return new zzva(this);
    }

    @Deprecated
    public final zzve zze(int i, zzue zzueVar) {
        Map map = (Map) this.a.get(i);
        if (map != null) {
            return (zzve) map.get(zzueVar);
        }
        return null;
    }

    public final boolean zzf(int i) {
        return this.b.get(i);
    }

    @Deprecated
    public final boolean zzg(int i, zzue zzueVar) {
        Map map = (Map) this.a.get(i);
        return map != null && map.containsKey(zzueVar);
    }
}
