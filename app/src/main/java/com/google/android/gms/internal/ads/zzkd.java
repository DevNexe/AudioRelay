package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.util.Log;
import android.view.Surface;
import defpackage.az6;
import defpackage.cz6;
import defpackage.d17;
import defpackage.lz6;
import defpackage.p07;
import defpackage.rt6;
import defpackage.v07;
import defpackage.x17;
import defpackage.xz6;
import defpackage.z17;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class zzkd extends zzm implements zzhj {
    public final cz6 b;
    public final zzdg c;

    public zzkd(zzhi zzhiVar) {
        zzdg zzdgVar = new zzdg(zzde.zza);
        this.c = zzdgVar;
        try {
            this.b = new cz6(zzhiVar, this);
            zzdgVar.zze();
        } catch (Throwable th) {
            this.c.zze();
            throw th;
        }
    }

    public final void zzA(zzkp zzkpVar) {
        this.c.zzb();
        this.b.o.zzR(zzkpVar);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void zzB(zzsi zzsiVar) {
        this.c.zzb();
        cz6 cz6Var = this.b;
        cz6Var.n();
        List listSingletonList = Collections.singletonList(zzsiVar);
        cz6Var.n();
        cz6Var.n();
        cz6Var.a();
        cz6Var.zzl();
        cz6Var.v++;
        ArrayList arrayList = cz6Var.m;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = size - 1; i >= 0; i--) {
                arrayList.remove(i);
            }
            cz6Var.R = cz6Var.R.zzh(0, size);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < listSingletonList.size(); i2++) {
            p07 p07Var = new p07((zzsi) listSingletonList.get(i2), cz6Var.n);
            arrayList2.add(p07Var);
            arrayList.add(i2, new az6(p07Var.b, p07Var.a.zzA()));
        }
        cz6Var.R = cz6Var.R.zzg(0, arrayList2.size());
        d17 d17Var = new d17(arrayList, cz6Var.R);
        boolean zZzo = d17Var.zzo();
        int i3 = d17Var.c;
        if (!zZzo && i3 < 0) {
            throw new zzag(d17Var, -1, -9223372036854775807L);
        }
        int iZzg = d17Var.zzg(false);
        v07 v07VarF = cz6Var.f(cz6Var.N, d17Var, cz6Var.d(d17Var, iZzg, -9223372036854775807L));
        int i4 = v07VarF.e;
        if (iZzg != -1 && i4 != 1) {
            i4 = (d17Var.zzo() || iZzg >= i3) ? 4 : 2;
        }
        v07 v07VarF2 = v07VarF.f(i4);
        long jZzv = zzel.zzv(-9223372036854775807L);
        zztz zztzVar = cz6Var.R;
        xz6 xz6Var = cz6Var.i;
        xz6Var.getClass();
        xz6Var.D.zzb(17, new lz6(arrayList2, zztzVar, iZzg, jZzv)).zza();
        cz6Var.m(v07VarF2, 0, 1, false, (cz6Var.N.b.zza.equals(v07VarF2.b.zza) || cz6Var.N.a.zzo()) ? false : true, 4, cz6Var.b(v07VarF2), -1);
    }

    public final void zzC(boolean z) {
        this.c.zzb();
        cz6 cz6Var = this.b;
        cz6Var.n();
        cz6Var.zzh();
        cz6Var.s.a();
        int i = 1;
        int i2 = z ? 1 : -1;
        if (z && i2 != 1) {
            i = 2;
        }
        cz6Var.l(i2, i, z);
    }

    public final void zzE(Surface surface) {
        this.c.zzb();
        cz6 cz6Var = this.b;
        cz6Var.n();
        cz6Var.j(surface);
        int i = surface == null ? 0 : -1;
        cz6Var.h(i, i);
    }

    public final void zzF(float f) {
        this.c.zzb();
        cz6 cz6Var = this.b;
        cz6Var.n();
        final float fZza = zzel.zza(f, 0.0f, 1.0f);
        if (cz6Var.H == fZza) {
            return;
        }
        cz6Var.H = fZza;
        cz6Var.i(1, 2, Float.valueOf(cz6Var.s.e * fZza));
        zzdq zzdqVar = new zzdq() { // from class: com.google.android.gms.internal.ads.zzhy
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
                float f2 = fZza;
                int i = cz6.S;
                ((zzcd) obj).zzv(f2);
            }
        };
        zzdt zzdtVar = cz6Var.j;
        zzdtVar.zzd(22, zzdqVar);
        zzdtVar.zzc();
    }

    public final void zzG() {
        this.c.zzb();
        cz6 cz6Var = this.b;
        cz6Var.n();
        cz6Var.n();
        cz6Var.zzq();
        cz6Var.s.a();
        cz6Var.k(null);
        zzdc zzdcVar = zzdc.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final int zzd() {
        this.c.zzb();
        return this.b.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final int zze() {
        this.c.zzb();
        return this.b.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final int zzf() {
        this.c.zzb();
        return this.b.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final int zzg() {
        this.c.zzb();
        return this.b.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final int zzh() {
        this.c.zzb();
        return this.b.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final int zzi() {
        this.c.zzb();
        return this.b.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final int zzj() {
        this.c.zzb();
        this.b.n();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final long zzk() {
        this.c.zzb();
        return this.b.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final long zzl() {
        this.c.zzb();
        return this.b.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final long zzm() {
        this.c.zzb();
        return this.b.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final zzcn zzn() {
        this.c.zzb();
        return this.b.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final zzcy zzo() {
        this.c.zzb();
        return this.b.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final void zzp(int i, long j) {
        this.c.zzb();
        this.b.zzp(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final boolean zzq() {
        this.c.zzb();
        return this.b.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final boolean zzr() {
        this.c.zzb();
        this.b.n();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final boolean zzs() {
        this.c.zzb();
        return this.b.zzs();
    }

    public final int zzt() {
        this.c.zzb();
        cz6 cz6Var = this.b;
        cz6Var.n();
        int length = cz6Var.f.length;
        return 2;
    }

    public final long zzu() {
        this.c.zzb();
        cz6 cz6Var = this.b;
        cz6Var.n();
        if (cz6Var.zzs()) {
            v07 v07Var = cz6Var.N;
            return v07Var.k.equals(v07Var.b) ? zzel.zzz(cz6Var.N.q) : cz6Var.p();
        }
        cz6Var.n();
        if (cz6Var.N.a.zzo()) {
            return cz6Var.P;
        }
        v07 v07Var2 = cz6Var.N;
        long j = 0;
        if (v07Var2.k.zzd != v07Var2.b.zzd) {
            return zzel.zzz(v07Var2.a.zze(cz6Var.zzf(), cz6Var.a, 0L).zzn);
        }
        long j2 = v07Var2.q;
        if (cz6Var.N.k.zzb()) {
            v07 v07Var3 = cz6Var.N;
            v07Var3.a.zzn(v07Var3.k.zza, cz6Var.l).zzh(cz6Var.N.k.zzb);
        } else {
            j = j2;
        }
        v07 v07Var4 = cz6Var.N;
        v07Var4.a.zzn(v07Var4.k.zza, cz6Var.l);
        return zzel.zzz(j);
    }

    public final long zzv() {
        this.c.zzb();
        return this.b.p();
    }

    public final zzgy zzw() {
        this.c.zzb();
        cz6 cz6Var = this.b;
        cz6Var.n();
        return cz6Var.N.f;
    }

    public final void zzx(zzkp zzkpVar) {
        this.c.zzb();
        cz6 cz6Var = this.b;
        cz6Var.getClass();
        zzkpVar.getClass();
        cz6Var.o.zzw(zzkpVar);
    }

    public final void zzy() {
        this.c.zzb();
        cz6 cz6Var = this.b;
        cz6Var.n();
        boolean zZzq = cz6Var.zzq();
        cz6Var.s.a();
        int i = zZzq ? 1 : -1;
        cz6Var.l(i, (!zZzq || i == 1) ? 1 : 2, zZzq);
        v07 v07Var = cz6Var.N;
        if (v07Var.e != 1) {
            return;
        }
        v07 v07VarE = v07Var.e(null);
        v07 v07VarF = v07VarE.f(true == v07VarE.a.zzo() ? 4 : 2);
        cz6Var.v++;
        cz6Var.i.D.zza(0).zza();
        cz6Var.m(v07VarF, 1, 1, false, false, 5, -9223372036854775807L, -1);
    }

    public final void zzz() {
        boolean z;
        AudioTrack audioTrack;
        this.c.zzb();
        cz6 cz6Var = this.b;
        cz6Var.getClass();
        Log.i("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(cz6Var)) + " [AndroidXMedia3/1.0.0-beta01] [" + zzel.zze + "] [" + zzbh.zza() + "]");
        cz6Var.n();
        if (zzel.zza < 21 && (audioTrack = cz6Var.B) != null) {
            audioTrack.release();
            cz6Var.B = null;
        }
        z17 z17Var = cz6Var.t;
        x17 x17Var = z17Var.e;
        if (x17Var != null) {
            try {
                z17Var.a.unregisterReceiver(x17Var);
            } catch (RuntimeException e) {
                zzdu.zzb("StreamVolumeManager", "Error unregistering stream volume receiver", e);
            }
            z17Var.e = null;
        }
        rt6 rt6Var = cz6Var.s;
        rt6Var.c = null;
        rt6Var.a();
        xz6 xz6Var = cz6Var.i;
        synchronized (xz6Var) {
            if (xz6Var.R || !xz6Var.E.isAlive()) {
                z = true;
            } else {
                xz6Var.D.zzh(7);
                xz6Var.w(new zzis(xz6Var));
                z = xz6Var.R;
            }
        }
        if (!z) {
            zzdt zzdtVar = cz6Var.j;
            zzdtVar.zzd(10, new zzdq() { // from class: com.google.android.gms.internal.ads.zzhw
                @Override // com.google.android.gms.internal.ads.zzdq
                public final void zza(Object obj) {
                    ((zzcd) obj).zzl(zzgy.zzd(new zzjd(1), 1003));
                }
            });
            zzdtVar.zzc();
        }
        cz6Var.j.zze();
        cz6Var.h.zzd(null);
        cz6Var.q.zzf(cz6Var.o);
        v07 v07VarF = cz6Var.N.f(1);
        cz6Var.N = v07VarF;
        v07 v07VarA = v07VarF.a(v07VarF.b);
        cz6Var.N = v07VarA;
        v07VarA.q = v07VarA.s;
        cz6Var.N.r = 0L;
        cz6Var.o.zzQ();
        cz6Var.g.zzh();
        Surface surface = cz6Var.D;
        if (surface != null) {
            surface.release();
            cz6Var.D = null;
        }
        zzdc zzdcVar = zzdc.zza;
    }
}
