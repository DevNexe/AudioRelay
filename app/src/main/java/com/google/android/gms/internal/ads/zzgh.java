package com.google.android.gms.internal.ads;

import android.util.Pair;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzgh extends zzcn {
    public final int a;
    public final zztz b;

    public zzgh(boolean z, zztz zztzVar, byte[] bArr) {
        this.b = zztzVar;
        this.a = zztzVar.zzc();
    }

    public abstract int a(Object obj);

    public abstract int b(int i);

    public abstract int c(int i);

    public abstract int d(int i);

    public abstract int e(int i);

    public abstract zzcn f(int i);

    public abstract Object g(int i);

    public final int h(int i, boolean z) {
        if (z) {
            return this.b.zzd(i);
        }
        if (i >= this.a - 1) {
            return -1;
        }
        return i + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final int zza(Object obj) {
        int iZza;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iA = a(obj2);
        if (iA == -1 || (iZza = f(iA).zza(obj3)) == -1) {
            return -1;
        }
        return d(iA) + iZza;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final zzck zzd(int i, zzck zzckVar, boolean z) {
        int iB = b(i);
        int iE = e(iB);
        f(iB).zzd(i - d(iB), zzckVar, z);
        zzckVar.zzd += iE;
        if (z) {
            Object objG = g(iB);
            Object obj = zzckVar.zzc;
            obj.getClass();
            zzckVar.zzc = Pair.create(objG, obj);
        }
        return zzckVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final zzcm zze(int i, zzcm zzcmVar, long j) {
        int iC = c(i);
        int iE = e(iC);
        int iD = d(iC);
        f(iC).zze(i - iE, zzcmVar, j);
        Object objG = g(iC);
        if (!zzcm.zza.equals(zzcmVar.zzc)) {
            objG = Pair.create(objG, zzcmVar.zzc);
        }
        zzcmVar.zzc = objG;
        zzcmVar.zzo += iD;
        zzcmVar.zzp += iD;
        return zzcmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final Object zzf(int i) {
        int iB = b(i);
        return Pair.create(g(iB), f(iB).zzf(i - d(iB)));
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final int zzg(boolean z) {
        if (this.a == 0) {
            return -1;
        }
        int iZza = z ? this.b.zza() : 0;
        while (f(iZza).zzo()) {
            iZza = h(iZza, z);
            if (iZza == -1) {
                return -1;
            }
        }
        return f(iZza).zzg(z) + e(iZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final int zzh(boolean z) {
        int i = this.a;
        if (i == 0) {
            return -1;
        }
        zztz zztzVar = this.b;
        int iZzb = z ? zztzVar.zzb() : i - 1;
        while (f(iZzb).zzo()) {
            if (z) {
                iZzb = zztzVar.zze(iZzb);
            } else {
                iZzb = iZzb <= 0 ? -1 : iZzb - 1;
            }
            if (iZzb == -1) {
                return -1;
            }
        }
        return f(iZzb).zzh(z) + e(iZzb);
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final int zzj(int i, int i2, boolean z) {
        int iC = c(i);
        int iE = e(iC);
        int iZzj = f(iC).zzj(i - iE, i2 == 2 ? 0 : i2, z);
        if (iZzj != -1) {
            return iE + iZzj;
        }
        int iH = h(iC, z);
        while (iH != -1 && f(iH).zzo()) {
            iH = h(iH, z);
        }
        if (iH != -1) {
            return f(iH).zzg(z) + e(iH);
        }
        if (i2 == 2) {
            return zzg(z);
        }
        return -1;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0028 -> B:7:0x0019). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:9:0x001c
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.google.android.gms.internal.ads.zzcn
    public final int zzk(int r3, int r4, boolean r5) {
        /*
            r2 = this;
            int r4 = r2.c(r3)
            int r5 = r2.e(r4)
            com.google.android.gms.internal.ads.zzcn r0 = r2.f(r4)
            int r3 = r3 - r5
            r1 = 0
            int r3 = r0.zzk(r3, r1, r1)
            r0 = -1
            if (r3 == r0) goto L17
            int r5 = r5 + r3
            return r5
        L17:
            if (r4 > 0) goto L1b
        L19:
            r4 = -1
            goto L1c
        L1b:
            int r4 = r4 + r0
        L1c:
            if (r4 == r0) goto L2e
            com.google.android.gms.internal.ads.zzcn r3 = r2.f(r4)
            boolean r3 = r3.zzo()
            if (r3 == 0) goto L2e
            if (r4 > 0) goto L2b
            goto L19
        L2b:
            int r4 = r4 + (-1)
            goto L1c
        L2e:
            if (r4 == r0) goto L3e
            int r3 = r2.e(r4)
            com.google.android.gms.internal.ads.zzcn r4 = r2.f(r4)
            int r4 = r4.zzh(r1)
            int r4 = r4 + r3
            return r4
        L3e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgh.zzk(int, int, boolean):int");
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final zzck zzn(Object obj, zzck zzckVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iA = a(obj2);
        int iE = e(iA);
        f(iA).zzn(obj3, zzckVar);
        zzckVar.zzd += iE;
        zzckVar.zzc = obj;
        return zzckVar;
    }
}
