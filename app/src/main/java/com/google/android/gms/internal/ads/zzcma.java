package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import defpackage.ba6;
import defpackage.ca6;
import defpackage.ga6;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcma extends zzcin implements zzfx, zzkp {
    public static final /* synthetic */ int zzc = 0;
    public final zzvo A;
    public final zzciv B;
    public final WeakReference C;
    public final zztl D;
    public zzkd E;
    public ByteBuffer F;
    public boolean G;
    public zzcim H;
    public int I;
    public int J;
    public long K;
    public final String L;
    public final int M;

    @GuardedBy("httpDataSourcesLock")
    public final ArrayList O;
    public volatile zzcln P;
    public final Context y;
    public final zzcll z;
    public final Object N = new Object();
    public final HashSet Q = new HashSet();

    /* JADX WARN: Code duplicated, block: B:27:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:29:0x00fa  */
    public zzcma(Context context, zzciv zzcivVar, zzciw zzciwVar) {
        final boolean z;
        final zzeu zzeuVar;
        this.y = context;
        this.B = zzcivVar;
        this.C = new WeakReference(zzciwVar);
        zzcll zzcllVar = new zzcll();
        this.z = zzcllVar;
        zzvo zzvoVar = new zzvo(context);
        this.A = zzvoVar;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("OfficialSimpleExoPlayerAdapter initialize ".concat(toString()));
        }
        zzcin.w.incrementAndGet();
        zzkc zzkcVar = new zzkc(context, new zzclw(this), null);
        zzkcVar.zzb(zzvoVar);
        zzkcVar.zza(zzcllVar);
        this.E = zzkcVar.zzc();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbI)).booleanValue()) {
            zzjc.zza(this.E);
        }
        this.E.zzx(this);
        this.I = 0;
        this.K = 0L;
        this.J = 0;
        this.O = new ArrayList();
        this.P = null;
        this.L = (zzciwVar == null || zzciwVar.zzt() == null) ? "" : zzciwVar.zzt();
        this.M = zzciwVar != null ? zzciwVar.zzh() : 0;
        final String strZzc = com.google.android.gms.ads.internal.zzt.zzq().zzc(context, zzciwVar.zzp().zza);
        if (!this.G || this.F.limit() <= 0) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbK)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbB)).booleanValue()) {
                    z = zzcivVar.zzj ? false : true;
                }
            } else if (zzcivVar.zzj) {
            }
            final zzeu zzeuVar2 = zzcivVar.zzo ? new zzeu() { // from class: com.google.android.gms.internal.ads.zzclr
                @Override // com.google.android.gms.internal.ads.zzeu
                public final zzev zza() {
                    zzcma zzcmaVar = this.zza;
                    String str = strZzc;
                    boolean z2 = z;
                    zzcmaVar.getClass();
                    zzcma zzcmaVar2 = true != z2 ? null : zzcmaVar;
                    zzciv zzcivVar2 = zzcmaVar.B;
                    return new ga6(str, zzcmaVar2, zzcivVar2.zzd, zzcivVar2.zzf, zzcivVar2.zzp, zzcivVar2.zzq);
                }
            } : zzcivVar.zzi > 0 ? new zzeu() { // from class: com.google.android.gms.internal.ads.zzcls
                @Override // com.google.android.gms.internal.ads.zzeu
                public final zzev zza() {
                    zzcma zzcmaVar = this.zza;
                    String str = strZzc;
                    boolean z2 = z;
                    zzcmaVar.getClass();
                    zzcma zzcmaVar2 = true != z2 ? null : zzcmaVar;
                    zzciv zzcivVar2 = zzcmaVar.B;
                    ba6 ba6Var = new ba6(str, zzcmaVar2, zzcivVar2.zzd, zzcivVar2.zzf, zzcivVar2.zzi);
                    zzcmaVar.Q.add(new WeakReference(ba6Var));
                    return ba6Var;
                }
            } : new zzeu() { // from class: com.google.android.gms.internal.ads.zzclt
                @Override // com.google.android.gms.internal.ads.zzeu
                public final zzev zza() {
                    zzcma zzcmaVar = this.zza;
                    String str = strZzc;
                    boolean z2 = z;
                    zzcmaVar.getClass();
                    zzfd zzfdVar = new zzfd();
                    zzfdVar.zzf(str);
                    zzfdVar.zze(true != z2 ? null : zzcmaVar);
                    zzciv zzcivVar2 = zzcmaVar.B;
                    zzfdVar.zzc(zzcivVar2.zzd);
                    zzfdVar.zzd(zzcivVar2.zzf);
                    zzfdVar.zzb(true);
                    return zzfdVar.zza();
                }
            };
            zzeuVar = zzcivVar.zzj ? new zzeu() { // from class: com.google.android.gms.internal.ads.zzclu
                @Override // com.google.android.gms.internal.ads.zzeu
                public final zzev zza() {
                    zzcma zzcmaVar = this.zza;
                    return new zzcln(zzcmaVar.y, zzeuVar2.zza(), zzcmaVar.L, zzcmaVar.M, zzcmaVar, new zzclq(zzcmaVar), null);
                }
            } : zzeuVar2;
            ByteBuffer byteBuffer = this.F;
            if (byteBuffer != null && byteBuffer.limit() > 0) {
                final byte[] bArr = new byte[this.F.limit()];
                this.F.get(bArr);
                zzeuVar = new zzeu() { // from class: com.google.android.gms.internal.ads.zzclv
                    @Override // com.google.android.gms.internal.ads.zzeu
                    public final zzev zza() {
                        zzeu zzeuVar3 = zzeuVar;
                        byte[] bArr2 = bArr;
                        int i = zzcma.zzc;
                        return new ca6(new zzeq(bArr2), bArr2.length, zzeuVar3.zza());
                    }
                };
            }
        } else {
            final byte[] bArr2 = new byte[this.F.limit()];
            this.F.get(bArr2);
            zzeuVar = new zzeu() { // from class: com.google.android.gms.internal.ads.zzclp
                @Override // com.google.android.gms.internal.ads.zzeu
                public final zzev zza() {
                    return new zzeq(bArr2);
                }
            };
        }
        this.D = new zztl(zzeuVar, new zztk(((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzm)).booleanValue() ? new zzzm() { // from class: com.google.android.gms.internal.ads.zzcly
            @Override // com.google.android.gms.internal.ads.zzzm
            public final zzzf[] zza() {
                int i = zzcma.zzc;
                return new zzzf[]{new zzafn(0), new zzaef(0), new zzafi(0, null)};
            }

            @Override // com.google.android.gms.internal.ads.zzzm
            public final /* synthetic */ zzzf[] zzb(Uri uri, Map map) {
                return zzzl.zza(this, uri, map);
            }
        } : new zzzm() { // from class: com.google.android.gms.internal.ads.zzclz
            @Override // com.google.android.gms.internal.ads.zzzm
            public final zzzf[] zza() {
                int i = zzcma.zzc;
                return new zzzf[]{new zzafn(0), new zzaef(0)};
            }

            @Override // com.google.android.gms.internal.ads.zzzm
            public final /* synthetic */ zzzf[] zzb(Uri uri, Map map) {
                return zzzl.zza(this, uri, map);
            }
        }), null);
    }

    public final void finalize() {
        zzcin.w.decrementAndGet();
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("OfficialSimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final long zzA() {
        if (this.P != null && this.P.zzq()) {
            return 0L;
        }
        return this.I;
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final long zzB() {
        long j;
        if (this.P != null && this.P.zzq()) {
            return this.P.zzl();
        }
        synchronized (this.N) {
            while (!this.O.isEmpty()) {
                long j2 = this.K;
                Map mapZze = ((zzfs) this.O.remove(0)).zze();
                if (mapZze == null) {
                    j = 0;
                    break;
                }
                Iterator it = mapZze.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        j = 0;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (entry != null) {
                        try {
                            if (entry.getKey() != null && zzfrm.zzc("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                j = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                break;
                            }
                        } catch (NumberFormatException unused) {
                            continue;
                        }
                    }
                }
                this.K = j2 + j;
            }
        }
        return this.K;
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final void zzC(Uri[] uriArr, String str) {
        zzD(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final void zzD(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        zzsi zzsyVar;
        if (this.E == null) {
            return;
        }
        this.F = byteBuffer;
        this.G = z;
        int length = uriArr.length;
        zztl zztlVar = this.D;
        zzciv zzcivVar = this.B;
        if (length == 1) {
            Uri uri = uriArr[0];
            zzaj zzajVar = new zzaj();
            zzajVar.zzb(uri);
            zzbg zzbgVarZzc = zzajVar.zzc();
            zztlVar.zza(zzcivVar.zzg);
            zzsyVar = zztlVar.zzb(zzbgVarZzc);
        } else {
            zzsi[] zzsiVarArr = new zzsi[length];
            for (int i = 0; i < uriArr.length; i++) {
                Uri uri2 = uriArr[i];
                zzaj zzajVar2 = new zzaj();
                zzajVar2.zzb(uri2);
                zzbg zzbgVarZzc2 = zzajVar2.zzc();
                zztlVar.zza(zzcivVar.zzg);
                zzsiVarArr[i] = zztlVar.zzb(zzbgVarZzc2);
            }
            zzsyVar = new zzsy(false, false, zzsiVarArr);
        }
        this.E.zzB(zzsyVar);
        this.E.zzy();
        zzcin.x.incrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final void zzE() {
        zzkd zzkdVar = this.E;
        if (zzkdVar != null) {
            zzkdVar.zzA(this);
            this.E.zzz();
            this.E = null;
            zzcin.x.decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final void zzF(long j) {
        zzkd zzkdVar = this.E;
        zzkdVar.zzp(zzkdVar.zzf(), j);
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final void zzG(int i) {
        this.z.zzk(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final void zzH(int i) {
        this.z.zzl(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final void zzI(zzcim zzcimVar) {
        this.H = zzcimVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final void zzJ(int i) {
        this.z.zzm(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final void zzK(int i) {
        this.z.zzn(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final void zzL(boolean z) {
        this.E.zzC(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final void zzM(boolean z) {
        if (this.E == null) {
            return;
        }
        int i = 0;
        while (true) {
            this.E.zzt();
            if (i >= 2) {
                return;
            }
            zzvo zzvoVar = this.A;
            zzva zzvaVarZzc = zzvoVar.zzc().zzc();
            zzvaVarZzc.zzo(i, !z);
            zzvoVar.zzj(zzvaVarZzc);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final void zzN(int i) {
        Iterator it = this.Q.iterator();
        while (it.hasNext()) {
            ba6 ba6Var = (ba6) ((WeakReference) it.next()).get();
            if (ba6Var != null) {
                ba6Var.s = i;
                for (Socket socket : ba6Var.t) {
                    if (!socket.isClosed()) {
                        try {
                            socket.setReceiveBufferSize(ba6Var.s);
                        } catch (SocketException e) {
                            zzcgn.zzk("Failed to update receive buffer size.", e);
                        }
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final void zzO(Surface surface, boolean z) {
        zzkd zzkdVar = this.E;
        if (zzkdVar == null) {
            return;
        }
        zzkdVar.zzE(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final void zzP(float f, boolean z) {
        zzkd zzkdVar = this.E;
        if (zzkdVar == null) {
            return;
        }
        zzkdVar.zzF(f);
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final void zzQ() {
        this.E.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final boolean zzR() {
        return this.E != null;
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final void zza(zzev zzevVar, zzfa zzfaVar, boolean z, int i) {
        this.I += i;
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final void zzb(zzev zzevVar, zzfa zzfaVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final void zzc(zzev zzevVar, zzfa zzfaVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final void zzd(zzev zzevVar, zzfa zzfaVar, boolean z) {
        if (zzevVar instanceof zzfs) {
            synchronized (this.N) {
                this.O.add((zzfs) zzevVar);
            }
        } else if (zzevVar instanceof zzcln) {
            this.P = (zzcln) zzevVar;
            final zzciw zzciwVar = (zzciw) this.C.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbB)).booleanValue() && zzciwVar != null && this.P.zzn()) {
                final HashMap map = new HashMap();
                map.put("gcacheHit", String.valueOf(this.P.zzp()));
                map.put("gcacheDownloaded", String.valueOf(this.P.zzo()));
                com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclx
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzciw zzciwVar2 = zzciwVar;
                        Map map2 = map;
                        int i = zzcma.zzc;
                        zzciwVar2.zzd("onGcacheInfoEvent", map2);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final void zze(zzkn zzknVar, zzaf zzafVar, zzgr zzgrVar) {
        zzciw zzciwVar = (zzciw) this.C.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbB)).booleanValue() || zzciwVar == null || zzafVar == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("audioMime", zzafVar.zzl);
        map.put("audioSampleMime", zzafVar.zzm);
        map.put("audioCodec", zzafVar.zzj);
        zzciwVar.zzd("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final /* synthetic */ void zzf(zzkn zzknVar, int i, long j, long j2) {
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final /* synthetic */ void zzg(zzkn zzknVar, zzsc zzscVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final void zzh(zzkn zzknVar, int i, long j) {
        this.J += i;
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final /* synthetic */ void zzi(zzcg zzcgVar, zzko zzkoVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final void zzj(zzkn zzknVar, zzrx zzrxVar, zzsc zzscVar, IOException iOException, boolean z) {
        zzcim zzcimVar = this.H;
        if (zzcimVar != null) {
            if (this.B.zzl) {
                zzcimVar.zzl("onLoadException", iOException);
            } else {
                zzcimVar.zzk("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final void zzk(zzkn zzknVar, int i) {
        zzcim zzcimVar = this.H;
        if (zzcimVar != null) {
            zzcimVar.zzm(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final void zzl(zzkn zzknVar, zzbw zzbwVar) {
        zzcim zzcimVar = this.H;
        if (zzcimVar != null) {
            zzcimVar.zzk("onPlayerError", zzbwVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final /* synthetic */ void zzm(zzkn zzknVar, zzcf zzcfVar, zzcf zzcfVar2, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final void zzn(zzkn zzknVar, Object obj, long j) {
        zzcim zzcimVar = this.H;
        if (zzcimVar != null) {
            zzcimVar.zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final /* synthetic */ void zzo(zzkn zzknVar, zzgq zzgqVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final void zzp(zzkn zzknVar, zzaf zzafVar, zzgr zzgrVar) {
        zzciw zzciwVar = (zzciw) this.C.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbB)).booleanValue() || zzciwVar == null || zzafVar == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("frameRate", String.valueOf(zzafVar.zzt));
        map.put("bitRate", String.valueOf(zzafVar.zzi));
        map.put("resolution", zzafVar.zzr + "x" + zzafVar.zzs);
        map.put("videoMime", zzafVar.zzl);
        map.put("videoSampleMime", zzafVar.zzm);
        map.put("videoCodec", zzafVar.zzj);
        zzciwVar.zzd("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final void zzq(zzkn zzknVar, zzda zzdaVar) {
        zzcim zzcimVar = this.H;
        if (zzcimVar != null) {
            zzcimVar.zzC(zzdaVar.zzc, zzdaVar.zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final int zzr() {
        return this.J;
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final int zzt() {
        return this.E.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final long zzv() {
        return this.E.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final long zzw() {
        return this.I;
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final long zzx() {
        if ((this.P != null && this.P.zzq()) && this.P.zzp()) {
            return Math.min(this.I, this.P.zzk());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final long zzy() {
        return this.E.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final long zzz() {
        return this.E.zzv();
    }
}
