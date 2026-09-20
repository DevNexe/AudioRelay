package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.SparseArray;
import com.facebook.ads.AdError;
import defpackage.eg2;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class zzmq implements zzkm {
    public final zzde a;
    public final zzck b;
    public final zzcm c;
    public final eg2 d;
    public final SparseArray e;
    public zzdt f;
    public zzcg g;
    public zzdn h;
    public boolean i;

    public zzmq(zzde zzdeVar) {
        zzdeVar.getClass();
        this.a = zzdeVar;
        this.f = new zzdt(zzel.zzE(), zzdeVar, new zzdr() { // from class: com.google.android.gms.internal.ads.zzkw
            @Override // com.google.android.gms.internal.ads.zzdr
            public final void zza(Object obj, zzaa zzaaVar) {
            }
        });
        zzck zzckVar = new zzck();
        this.b = zzckVar;
        this.c = new zzcm();
        this.d = new eg2(zzckVar);
        this.e = new SparseArray();
    }

    public static /* synthetic */ void zzW(zzmq zzmqVar) {
        final zzkn zzknVarA = zzmqVar.a();
        zzmqVar.c(zzknVarA, 1028, new zzdq() { // from class: com.google.android.gms.internal.ads.zzlm
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
        zzmqVar.f.zze();
    }

    public final zzkn a() {
        return d((zzsg) this.d.d);
    }

    @RequiresNonNull({"player"})
    public final zzkn b(zzcn zzcnVar, int i, zzsg zzsgVar) {
        zzsg zzsgVar2 = true == zzcnVar.zzo() ? null : zzsgVar;
        long jZza = this.a.zza();
        boolean z = zzcnVar.equals(this.g.zzn()) && i == this.g.zzf();
        long jZzz = 0;
        if (zzsgVar2 == null || !zzsgVar2.zzb()) {
            if (z) {
                jZzz = this.g.zzk();
            } else if (!zzcnVar.zzo()) {
                long j = zzcnVar.zze(i, this.c, 0L).zzm;
                jZzz = zzel.zzz(0L);
            }
        } else if (z && this.g.zzd() == zzsgVar2.zzb && this.g.zze() == zzsgVar2.zzc) {
            jZzz = this.g.zzl();
        }
        return new zzkn(jZza, zzcnVar, i, zzsgVar2, jZzz, this.g.zzn(), this.g.zzf(), (zzsg) this.d.d, this.g.zzl(), this.g.zzm());
    }

    public final void c(zzkn zzknVar, int i, zzdq zzdqVar) {
        this.e.put(i, zzknVar);
        zzdt zzdtVar = this.f;
        zzdtVar.zzd(i, zzdqVar);
        zzdtVar.zzc();
    }

    public final zzkn d(zzsg zzsgVar) {
        this.g.getClass();
        zzcn zzcnVar = zzsgVar == null ? null : (zzcn) ((zzfuy) this.d.c).get(zzsgVar);
        if (zzsgVar != null && zzcnVar != null) {
            return b(zzcnVar, zzcnVar.zzn(zzsgVar.zza, this.b).zzd, zzsgVar);
        }
        int iZzf = this.g.zzf();
        zzcn zzcnVarZzn = this.g.zzn();
        if (iZzf >= zzcnVarZzn.zzc()) {
            zzcnVarZzn = zzcn.zza;
        }
        return b(zzcnVarZzn, iZzf, null);
    }

    public final zzkn e(int i, zzsg zzsgVar) {
        zzcg zzcgVar = this.g;
        zzcgVar.getClass();
        if (zzsgVar != null) {
            return ((zzcn) ((zzfuy) this.d.c).get(zzsgVar)) != null ? d(zzsgVar) : b(zzcn.zza, i, zzsgVar);
        }
        zzcn zzcnVarZzn = zzcgVar.zzn();
        if (i >= zzcnVarZzn.zzc()) {
            zzcnVarZzn = zzcn.zza;
        }
        return b(zzcnVarZzn, i, null);
    }

    public final zzkn f() {
        return d((zzsg) this.d.f);
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final void zzA(final String str) {
        final zzkn zzknVarF = f();
        c(zzknVarF, 1012, new zzdq() { // from class: com.google.android.gms.internal.ads.zzmo
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final void zzB(final zzgq zzgqVar) {
        final zzkn zzknVarD = d((zzsg) this.d.e);
        c(zzknVarD, 1013, new zzdq() { // from class: com.google.android.gms.internal.ads.zzme
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final void zzC(final zzgq zzgqVar) {
        final zzkn zzknVarF = f();
        c(zzknVarF, 1007, new zzdq() { // from class: com.google.android.gms.internal.ads.zzlt
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final void zzD(final zzaf zzafVar, final zzgr zzgrVar) {
        final zzkn zzknVarF = f();
        c(zzknVarF, 1009, new zzdq() { // from class: com.google.android.gms.internal.ads.zzmd
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
                ((zzkp) obj).zze(zzknVarF, zzafVar, zzgrVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final void zzE(final long j) {
        final zzkn zzknVarF = f();
        c(zzknVarF, 1010, new zzdq(j) { // from class: com.google.android.gms.internal.ads.zzmg
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final void zzF(final Exception exc) {
        final zzkn zzknVarF = f();
        c(zzknVarF, 1014, new zzdq() { // from class: com.google.android.gms.internal.ads.zzlb
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final void zzG(final int i, final long j, final long j2) {
        final zzkn zzknVarF = f();
        c(zzknVarF, 1011, new zzdq(i, j, j2) { // from class: com.google.android.gms.internal.ads.zzkt
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final void zzH(final int i, final long j) {
        final zzkn zzknVarD = d((zzsg) this.d.e);
        c(zzknVarD, 1018, new zzdq() { // from class: com.google.android.gms.internal.ads.zzlo
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
                ((zzkp) obj).zzh(zzknVarD, i, j);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final void zzI(final Object obj, final long j) {
        final zzkn zzknVarF = f();
        c(zzknVarF, 26, new zzdq() { // from class: com.google.android.gms.internal.ads.zzmk
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj2) {
                ((zzkp) obj2).zzn(zzknVarF, obj, j);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final void zzJ(final Exception exc) {
        final zzkn zzknVarF = f();
        c(zzknVarF, 1030, new zzdq() { // from class: com.google.android.gms.internal.ads.zzkz
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final void zzK(final String str, final long j, final long j2) {
        final zzkn zzknVarF = f();
        c(zzknVarF, 1016, new zzdq(str, j2, j) { // from class: com.google.android.gms.internal.ads.zzlk
            public final /* synthetic */ String zzb;

            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final void zzL(final String str) {
        final zzkn zzknVarF = f();
        c(zzknVarF, 1019, new zzdq() { // from class: com.google.android.gms.internal.ads.zzks
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final void zzM(final zzgq zzgqVar) {
        final zzkn zzknVarD = d((zzsg) this.d.e);
        c(zzknVarD, 1020, new zzdq() { // from class: com.google.android.gms.internal.ads.zzmj
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
                ((zzkp) obj).zzo(zzknVarD, zzgqVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final void zzN(final zzgq zzgqVar) {
        final zzkn zzknVarF = f();
        c(zzknVarF, 1015, new zzdq() { // from class: com.google.android.gms.internal.ads.zzlp
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final void zzO(final long j, final int i) {
        final zzkn zzknVarD = d((zzsg) this.d.e);
        c(zzknVarD, 1021, new zzdq(j, i) { // from class: com.google.android.gms.internal.ads.zzlc
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final void zzP(final zzaf zzafVar, final zzgr zzgrVar) {
        final zzkn zzknVarF = f();
        c(zzknVarF, 1017, new zzdq() { // from class: com.google.android.gms.internal.ads.zzkr
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
                ((zzkp) obj).zzp(zzknVarF, zzafVar, zzgrVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final void zzQ() {
        zzdn zzdnVar = this.h;
        zzdd.zzb(zzdnVar);
        zzdnVar.zzg(new Runnable() { // from class: com.google.android.gms.internal.ads.zzmf
            @Override // java.lang.Runnable
            public final void run() {
                zzmq.zzW(this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final void zzR(zzkp zzkpVar) {
        this.f.zzf(zzkpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final void zzS(final zzcg zzcgVar, Looper looper) {
        boolean z = true;
        if (this.g != null && !((zzfuv) this.d.b).isEmpty()) {
            z = false;
        }
        zzdd.zzf(z);
        zzcgVar.getClass();
        this.g = zzcgVar;
        this.h = this.a.zzb(looper, null);
        this.f = this.f.zza(looper, new zzdr() { // from class: com.google.android.gms.internal.ads.zzlj
            @Override // com.google.android.gms.internal.ads.zzdr
            public final void zza(Object obj, zzaa zzaaVar) {
                zzkp zzkpVar = (zzkp) obj;
                zzkpVar.zzi(zzcgVar, new zzko(zzaaVar, this.zza.e));
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final void zzT(List list, zzsg zzsgVar) {
        zzcg zzcgVar = this.g;
        zzcgVar.getClass();
        eg2 eg2Var = this.d;
        eg2Var.getClass();
        eg2Var.b = zzfuv.zzm(list);
        if (!list.isEmpty()) {
            eg2Var.e = (zzsg) list.get(0);
            zzsgVar.getClass();
            eg2Var.f = zzsgVar;
        }
        if (((zzsg) eg2Var.d) == null) {
            eg2Var.d = eg2.a(zzcgVar, (zzfuv) eg2Var.b, (zzsg) eg2Var.e, (zzck) eg2Var.a);
        }
        eg2Var.c(zzcgVar.zzn());
    }

    @Override // com.google.android.gms.internal.ads.zzwd
    public final void zzY(final int i, final long j, final long j2) {
        Object next;
        Object obj;
        zzsg zzsgVar;
        eg2 eg2Var = this.d;
        if (((zzfuv) eg2Var.b).isEmpty()) {
            zzsgVar = null;
        } else {
            zzfuv zzfuvVar = (zzfuv) eg2Var.b;
            if (!(zzfuvVar instanceof List)) {
                Iterator<E> it = zzfuvVar.iterator();
                do {
                    next = it.next();
                } while (it.hasNext());
                obj = next;
            } else {
                if (zzfuvVar.isEmpty()) {
                    throw new NoSuchElementException();
                }
                obj = zzfuvVar.get(zzfuvVar.size() - 1);
            }
            zzsgVar = (zzsg) obj;
        }
        final zzkn zzknVarD = d(zzsgVar);
        c(zzknVarD, 1006, new zzdq() { // from class: com.google.android.gms.internal.ads.zzla
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj2) {
                ((zzkp) obj2).zzf(zzknVarD, i, j, j2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zza(final zzcc zzccVar) {
        final zzkn zzknVarA = a();
        c(zzknVarA, 13, new zzdq() { // from class: com.google.android.gms.internal.ads.zzle
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzaf(int i, zzsg zzsgVar, final zzsc zzscVar) {
        final zzkn zzknVarE = e(i, zzsgVar);
        c(zzknVarE, 1004, new zzdq() { // from class: com.google.android.gms.internal.ads.zzky
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
                ((zzkp) obj).zzg(zzknVarE, zzscVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzag(int i, zzsg zzsgVar, final zzrx zzrxVar, final zzsc zzscVar) {
        final zzkn zzknVarE = e(i, zzsgVar);
        c(zzknVarE, AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, new zzdq() { // from class: com.google.android.gms.internal.ads.zzlq
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzah(int i, zzsg zzsgVar, final zzrx zzrxVar, final zzsc zzscVar) {
        final zzkn zzknVarE = e(i, zzsgVar);
        c(zzknVarE, AdError.NO_FILL_ERROR_CODE, new zzdq() { // from class: com.google.android.gms.internal.ads.zzma
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzai(int i, zzsg zzsgVar, final zzrx zzrxVar, final zzsc zzscVar, final IOException iOException, final boolean z) {
        final zzkn zzknVarE = e(i, zzsgVar);
        c(zzknVarE, 1003, new zzdq() { // from class: com.google.android.gms.internal.ads.zzll
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
                ((zzkp) obj).zzj(zzknVarE, zzrxVar, zzscVar, iOException, z);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzaj(int i, zzsg zzsgVar, final zzrx zzrxVar, final zzsc zzscVar) {
        final zzkn zzknVarE = e(i, zzsgVar);
        c(zzknVarE, AdError.NETWORK_ERROR_CODE, new zzdq() { // from class: com.google.android.gms.internal.ads.zzlu
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzb(final zzt zztVar) {
        final zzkn zzknVarA = a();
        c(zzknVarA, 29, new zzdq() { // from class: com.google.android.gms.internal.ads.zzlf
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzc(final int i, final boolean z) {
        final zzkn zzknVarA = a();
        c(zzknVarA, 30, new zzdq(i, z) { // from class: com.google.android.gms.internal.ads.zzli
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzd(final boolean z) {
        final zzkn zzknVarA = a();
        c(zzknVarA, 3, new zzdq(z) { // from class: com.google.android.gms.internal.ads.zzmn
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zze(final boolean z) {
        final zzkn zzknVarA = a();
        c(zzknVarA, 7, new zzdq(z) { // from class: com.google.android.gms.internal.ads.zzlw
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzf(final zzbg zzbgVar, final int i) {
        final zzkn zzknVarA = a();
        c(zzknVarA, 1, new zzdq(zzbgVar, i) { // from class: com.google.android.gms.internal.ads.zzlz
            public final /* synthetic */ zzbg zzb;

            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzg(final zzbm zzbmVar) {
        final zzkn zzknVarA = a();
        c(zzknVarA, 14, new zzdq() { // from class: com.google.android.gms.internal.ads.zzmc
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzh(final boolean z, final int i) {
        final zzkn zzknVarA = a();
        c(zzknVarA, 5, new zzdq(z, i) { // from class: com.google.android.gms.internal.ads.zzlv
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzi(final zzby zzbyVar) {
        final zzkn zzknVarA = a();
        c(zzknVarA, 12, new zzdq() { // from class: com.google.android.gms.internal.ads.zzkv
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzj(final int i) {
        final zzkn zzknVarA = a();
        c(zzknVarA, 4, new zzdq() { // from class: com.google.android.gms.internal.ads.zzly
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
                ((zzkp) obj).zzk(zzknVarA, i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzk(final int i) {
        final zzkn zzknVarA = a();
        c(zzknVarA, 6, new zzdq(i) { // from class: com.google.android.gms.internal.ads.zzmm
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzl(final zzbw zzbwVar) {
        zzbn zzbnVar;
        final zzkn zzknVarA = (!(zzbwVar instanceof zzgy) || (zzbnVar = ((zzgy) zzbwVar).zzj) == null) ? a() : d(new zzsg(zzbnVar));
        c(zzknVarA, 10, new zzdq() { // from class: com.google.android.gms.internal.ads.zzlr
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
                ((zzkp) obj).zzl(zzknVarA, zzbwVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzm(final zzbw zzbwVar) {
        zzbn zzbnVar;
        final zzkn zzknVarA = (!(zzbwVar instanceof zzgy) || (zzbnVar = ((zzgy) zzbwVar).zzj) == null) ? a() : d(new zzsg(zzbnVar));
        c(zzknVarA, 10, new zzdq() { // from class: com.google.android.gms.internal.ads.zzmb
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzn(final boolean z, final int i) {
        final zzkn zzknVarA = a();
        c(zzknVarA, -1, new zzdq(z, i) { // from class: com.google.android.gms.internal.ads.zzkq
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzo(final zzcf zzcfVar, final zzcf zzcfVar2, final int i) {
        if (i == 1) {
            this.i = false;
            i = 1;
        }
        zzcg zzcgVar = this.g;
        zzcgVar.getClass();
        eg2 eg2Var = this.d;
        eg2Var.d = eg2.a(zzcgVar, (zzfuv) eg2Var.b, (zzsg) eg2Var.e, (zzck) eg2Var.a);
        final zzkn zzknVarA = a();
        c(zzknVarA, 11, new zzdq() { // from class: com.google.android.gms.internal.ads.zzld
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
                zzkp zzkpVar = (zzkp) obj;
                zzkpVar.zzm(zzknVarA, zzcfVar, zzcfVar2, i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzp() {
        final zzkn zzknVarA = a();
        c(zzknVarA, -1, new zzdq() { // from class: com.google.android.gms.internal.ads.zzkx
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzq(final boolean z) {
        final zzkn zzknVarF = f();
        c(zzknVarF, 23, new zzdq(z) { // from class: com.google.android.gms.internal.ads.zzlx
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzr(final int i, final int i2) {
        final zzkn zzknVarF = f();
        c(zzknVarF, 24, new zzdq(i, i2) { // from class: com.google.android.gms.internal.ads.zzml
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzs(zzcn zzcnVar, final int i) {
        zzcg zzcgVar = this.g;
        zzcgVar.getClass();
        eg2 eg2Var = this.d;
        eg2Var.d = eg2.a(zzcgVar, (zzfuv) eg2Var.b, (zzsg) eg2Var.e, (zzck) eg2Var.a);
        eg2Var.c(zzcgVar.zzn());
        final zzkn zzknVarA = a();
        c(zzknVarA, 0, new zzdq(i) { // from class: com.google.android.gms.internal.ads.zzln
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzt(final zzcy zzcyVar) {
        final zzkn zzknVarA = a();
        c(zzknVarA, 2, new zzdq() { // from class: com.google.android.gms.internal.ads.zzlg
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzu(final zzda zzdaVar) {
        final zzkn zzknVarF = f();
        c(zzknVarF, 25, new zzdq() { // from class: com.google.android.gms.internal.ads.zzmi
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
                zzkn zzknVar = zzknVarF;
                zzda zzdaVar2 = zzdaVar;
                ((zzkp) obj).zzq(zzknVar, zzdaVar2);
                int i = zzdaVar2.zzc;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzv(final float f) {
        final zzkn zzknVarF = f();
        c(zzknVarF, 22, new zzdq(f) { // from class: com.google.android.gms.internal.ads.zzku
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final void zzw(zzkp zzkpVar) {
        this.f.zzb(zzkpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final void zzx() {
        if (this.i) {
            return;
        }
        final zzkn zzknVarA = a();
        this.i = true;
        c(zzknVarA, -1, new zzdq() { // from class: com.google.android.gms.internal.ads.zzmh
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final void zzy(final Exception exc) {
        final zzkn zzknVarF = f();
        c(zzknVarF, 1029, new zzdq() { // from class: com.google.android.gms.internal.ads.zzlh
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final void zzz(final String str, final long j, final long j2) {
        final zzkn zzknVarF = f();
        c(zzknVarF, 1008, new zzdq(str, j2, j) { // from class: com.google.android.gms.internal.ads.zzls
            public final /* synthetic */ String zzb;

            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }
}
