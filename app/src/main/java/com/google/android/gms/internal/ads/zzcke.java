package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import defpackage.j96;
import defpackage.k96;
import defpackage.n96;
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
public final class zzcke extends zzcin implements zzazx, zzaxv, zzbbh, zzatp, zzasf {
    public static final /* synthetic */ int zzc = 0;
    public final zzbaw A;
    public final zzaue B;
    public final zzayv C;
    public final zzciv D;
    public zzasi E;
    public ByteBuffer F;
    public boolean G;
    public final WeakReference H;
    public zzcim I;
    public int J;
    public int K;
    public long L;
    public final String M;
    public final int N;

    @GuardedBy("httpDataSourcesLock")
    public final ArrayList P;
    public volatile zzcjs Q;
    public final Context y;
    public final zzcjt z;
    public final Object O = new Object();
    public final HashSet R = new HashSet();

    public zzcke(Context context, zzciv zzcivVar, zzciw zzciwVar) {
        this.y = context;
        this.D = zzcivVar;
        this.H = new WeakReference(zzciwVar);
        zzcjt zzcjtVar = new zzcjt();
        this.z = zzcjtVar;
        zzaws zzawsVar = zzaws.zza;
        zzfph zzfphVar = com.google.android.gms.ads.internal.util.zzs.zza;
        zzbaw zzbawVar = new zzbaw(context, zzawsVar, 0L, zzfphVar, this, -1);
        this.A = zzbawVar;
        zzaue zzaueVar = new zzaue(zzawsVar, null, true, zzfphVar, this);
        this.B = zzaueVar;
        zzayv zzayvVar = new zzayv(null);
        this.C = zzayvVar;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("ForkedExoPlayerAdapter initialize ".concat(toString()));
        }
        zzcin.w.incrementAndGet();
        zzasi zzasiVarZza = zzasj.zza(new zzasx[]{zzaueVar, zzbawVar}, zzayvVar, zzcjtVar);
        this.E = zzasiVarZza;
        zzasiVarZza.zze(this);
        this.J = 0;
        this.L = 0L;
        this.K = 0;
        this.P = new ArrayList();
        this.Q = null;
        this.M = (zzciwVar == null || zzciwVar.zzt() == null) ? "" : zzciwVar.zzt();
        this.N = zzciwVar != null ? zzciwVar.zzh() : 0;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzn)).booleanValue()) {
            this.E.zzg();
        }
        if (zzciwVar != null && zzciwVar.zzg() > 0) {
            this.E.zzp(zzciwVar.zzg());
        }
        if (zzciwVar != null && zzciwVar.zzf() > 0) {
            this.E.zzo(zzciwVar.zzf());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzp)).booleanValue()) {
            this.E.zzi();
            this.E.zzh(((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzq)).intValue());
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0048  */
    /* JADX WARN: Code duplicated, block: B:13:0x004c  */
    /* JADX WARN: Code duplicated, block: B:14:0x004e  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a7  */
    public final zzaxw a(final String str, Uri uri) {
        final boolean z;
        final zzazh zzazhVar;
        final zzazh zzazhVar2;
        zzazh zzazhVar3;
        zzaux zzauxVar;
        boolean z2 = this.G;
        zzciv zzcivVar = this.D;
        if (!z2 || this.F.limit() <= 0) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbK)).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbB)).booleanValue()) {
                    z = true;
                } else if (zzcivVar.zzj) {
                    z = false;
                } else {
                    z = true;
                }
            } else if (zzcivVar.zzj) {
                z = true;
            } else {
                z = false;
            }
            if (zzcivVar.zzo) {
                zzazhVar = new zzazh() { // from class: com.google.android.gms.internal.ads.zzcjv
                    @Override // com.google.android.gms.internal.ads.zzazh
                    public final zzazi zza() {
                        zzcke zzckeVar = this.zza;
                        String str2 = str;
                        boolean z3 = z;
                        zzckeVar.getClass();
                        zzcke zzckeVar2 = true != z3 ? null : zzckeVar;
                        zzciv zzcivVar2 = zzckeVar.D;
                        return new n96(str2, zzckeVar2, zzcivVar2.zzd, zzcivVar2.zzf, zzcivVar2.zzp, zzcivVar2.zzq);
                    }
                };
            } else {
                zzazhVar = zzcivVar.zzi > 0 ? new zzazh() { // from class: com.google.android.gms.internal.ads.zzcjw
                    @Override // com.google.android.gms.internal.ads.zzazh
                    public final zzazi zza() {
                        zzcke zzckeVar = this.zza;
                        String str2 = str;
                        boolean z3 = z;
                        zzckeVar.getClass();
                        zzcke zzckeVar2 = true != z3 ? null : zzckeVar;
                        zzciv zzcivVar2 = zzckeVar.D;
                        j96 j96Var = new j96(str2, zzckeVar2, zzcivVar2.zzd, zzcivVar2.zzf, zzcivVar2.zzi);
                        zzckeVar.R.add(new WeakReference(j96Var));
                        return j96Var;
                    }
                } : new zzazh() { // from class: com.google.android.gms.internal.ads.zzcjx
                    @Override // com.google.android.gms.internal.ads.zzazh
                    public final zzazi zza() {
                        zzcke zzckeVar = this.zza;
                        String str2 = str;
                        boolean z3 = z;
                        zzckeVar.getClass();
                        zzcke zzckeVar2 = true != z3 ? null : zzckeVar;
                        zzciv zzcivVar2 = zzckeVar.D;
                        return new zzazm(str2, null, zzckeVar2, zzcivVar2.zzd, zzcivVar2.zzf, true, null);
                    }
                };
            }
            zzazhVar2 = zzcivVar.zzj ? new zzazh() { // from class: com.google.android.gms.internal.ads.zzcjy
                @Override // com.google.android.gms.internal.ads.zzazh
                public final zzazi zza() {
                    zzcke zzckeVar = this.zza;
                    return new zzcjs(zzckeVar.y, zzazhVar.zza(), zzckeVar.M, zzckeVar.N, zzckeVar, new zzcka(zzckeVar), null);
                }
            } : zzazhVar;
            ByteBuffer byteBuffer = this.F;
            if (byteBuffer != null && byteBuffer.limit() > 0) {
                final byte[] bArr = new byte[this.F.limit()];
                this.F.get(bArr);
                zzazhVar3 = new zzazh() { // from class: com.google.android.gms.internal.ads.zzcjz
                    @Override // com.google.android.gms.internal.ads.zzazh
                    public final zzazi zza() {
                        zzazh zzazhVar4 = zzazhVar2;
                        byte[] bArr2 = bArr;
                        int i = zzcke.zzc;
                        return new k96(new zzazg(bArr2), bArr2.length, zzazhVar4.zza());
                    }
                };
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzm)).booleanValue()) {
                zzauxVar = new zzaux() { // from class: com.google.android.gms.internal.ads.zzckc
                    @Override // com.google.android.gms.internal.ads.zzaux
                    /* JADX INFO: renamed from: zza */
                    public final zzauv[] mo48zza() {
                        int i = zzcke.zzc;
                        return new zzauv[]{new zzawi(), new zzavn(0), new zzawe(0, null, null)};
                    }
                };
            } else {
                zzauxVar = new zzaux() { // from class: com.google.android.gms.internal.ads.zzckd
                    @Override // com.google.android.gms.internal.ads.zzaux
                    /* JADX INFO: renamed from: zza */
                    public final zzauv[] mo48zza() {
                        int i = zzcke.zzc;
                        return new zzauv[]{new zzawi(), new zzavn(0)};
                    }
                };
            }
            return new zzaxw(uri, zzazhVar3, zzauxVar, zzcivVar.zzk, com.google.android.gms.ads.internal.util.zzs.zza, this, null, zzcivVar.zzg);
        }
        final byte[] bArr2 = new byte[this.F.limit()];
        this.F.get(bArr2);
        zzazhVar2 = new zzazh() { // from class: com.google.android.gms.internal.ads.zzcju
            @Override // com.google.android.gms.internal.ads.zzazh
            public final zzazi zza() {
                return new zzazg(bArr2);
            }
        };
        zzazhVar3 = zzazhVar2;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzm)).booleanValue()) {
            zzauxVar = new zzaux() { // from class: com.google.android.gms.internal.ads.zzckc
                @Override // com.google.android.gms.internal.ads.zzaux
                /* JADX INFO: renamed from: zza */
                public final zzauv[] mo48zza() {
                    int i = zzcke.zzc;
                    return new zzauv[]{new zzawi(), new zzavn(0), new zzawe(0, null, null)};
                }
            };
        } else {
            zzauxVar = new zzaux() { // from class: com.google.android.gms.internal.ads.zzckd
                @Override // com.google.android.gms.internal.ads.zzaux
                /* JADX INFO: renamed from: zza */
                public final zzauv[] mo48zza() {
                    int i = zzcke.zzc;
                    return new zzauv[]{new zzawi(), new zzavn(0)};
                }
            };
        }
        return new zzaxw(uri, zzazhVar3, zzauxVar, zzcivVar.zzk, com.google.android.gms.ads.internal.util.zzs.zza, this, null, zzcivVar.zzg);
    }

    public final void finalize() {
        zzcin.w.decrementAndGet();
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("ForkedExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final long zzA() {
        if (this.Q != null && this.Q.zzk()) {
            return 0L;
        }
        return this.J;
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final long zzB() {
        long j;
        if (this.Q != null && this.Q.zzk()) {
            return this.Q.zzf();
        }
        synchronized (this.O) {
            while (!this.P.isEmpty()) {
                long j2 = this.L;
                Map mapZze = ((zzazr) this.P.remove(0)).zze();
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
                this.L = j2 + j;
            }
        }
        return this.L;
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final void zzC(Uri[] uriArr, String str) {
        zzD(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final void zzD(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        zzaya zzayeVar;
        if (this.E == null) {
            return;
        }
        this.F = byteBuffer;
        this.G = z;
        int length = uriArr.length;
        if (length == 1) {
            zzayeVar = a(str, uriArr[0]);
        } else {
            zzaya[] zzayaVarArr = new zzaya[length];
            for (int i = 0; i < uriArr.length; i++) {
                zzayaVarArr[i] = a(str, uriArr[i]);
            }
            zzayeVar = new zzaye(zzayaVarArr);
        }
        this.E.zzj(zzayeVar);
        zzcin.x.incrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final void zzE() {
        zzasi zzasiVar = this.E;
        if (zzasiVar != null) {
            zzasiVar.zzl(this);
            this.E.zzk();
            this.E = null;
            zzcin.x.decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final void zzF(long j) {
        this.E.zzm(j);
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final void zzG(int i) {
        this.z.zzf(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final void zzH(int i) {
        this.z.zzg(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final void zzI(zzcim zzcimVar) {
        this.I = zzcimVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final void zzJ(int i) {
        this.z.zzh(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final void zzK(int i) {
        this.z.zzi(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final void zzL(boolean z) {
        this.E.zzq(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final void zzM(boolean z) {
        if (this.E != null) {
            for (int i = 0; i < 2; i++) {
                this.C.zze(i, !z);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final void zzN(int i) {
        Iterator it = this.R.iterator();
        while (it.hasNext()) {
            j96 j96Var = (j96) ((WeakReference) it.next()).get();
            if (j96Var != null) {
                j96Var.o = i;
                for (Socket socket : j96Var.p) {
                    if (!socket.isClosed()) {
                        try {
                            socket.setReceiveBufferSize(j96Var.o);
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
        zzasi zzasiVar = this.E;
        if (zzasiVar == null) {
            return;
        }
        zzash zzashVar = new zzash(this.A, 1, surface);
        if (z) {
            zzasiVar.zzf(zzashVar);
        } else {
            zzasiVar.zzn(zzashVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final void zzP(float f, boolean z) {
        if (this.E == null) {
            return;
        }
        this.E.zzn(new zzash(this.B, 2, Float.valueOf(f)));
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final void zzQ() {
        this.E.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final boolean zzR() {
        return this.E != null;
    }

    public final void zzW(zzazi zzaziVar, int i) {
        this.J += i;
    }

    @Override // com.google.android.gms.internal.ads.zzazx
    /* JADX INFO: renamed from: zzX, reason: merged with bridge method [inline-methods] */
    public final void zzk(zzazi zzaziVar, zzazk zzazkVar) {
        if (zzaziVar instanceof zzazr) {
            synchronized (this.O) {
                this.P.add((zzazr) zzaziVar);
            }
        } else if (zzaziVar instanceof zzcjs) {
            this.Q = (zzcjs) zzaziVar;
            final zzciw zzciwVar = (zzciw) this.H.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbB)).booleanValue() && zzciwVar != null && this.Q.zzh()) {
                final HashMap map = new HashMap();
                map.put("gcacheHit", String.valueOf(this.Q.zzj()));
                map.put("gcacheDownloaded", String.valueOf(this.Q.zzi()));
                com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckb
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzciw zzciwVar2 = zzciwVar;
                        Map map2 = map;
                        int i = zzcke.zzc;
                        zzciwVar2.zzd("onGcacheInfoEvent", map2);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasf
    public final void zza(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzasf
    public final void zzb(zzasw zzaswVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzasf
    public final void zzc(zzase zzaseVar) {
        zzcim zzcimVar = this.I;
        if (zzcimVar != null) {
            zzcimVar.zzk("onPlayerError", zzaseVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasf
    public final void zzd(boolean z, int i) {
        zzcim zzcimVar = this.I;
        if (zzcimVar != null) {
            zzcimVar.zzm(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasf
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzasf
    public final void zzf(zzatd zzatdVar, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzasf
    public final void zzg(zzayp zzaypVar, zzazb zzazbVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzatp
    public final void zzh(zzass zzassVar) {
        zzciw zzciwVar = (zzciw) this.H.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbB)).booleanValue() || zzciwVar == null || zzassVar == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("audioMime", zzassVar.zze);
        map.put("audioSampleMime", zzassVar.zzf);
        map.put("audioCodec", zzassVar.zzc);
        zzciwVar.zzd("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.zzaxv
    public final void zzi(IOException iOException) {
        zzcim zzcimVar = this.I;
        if (zzcimVar != null) {
            if (this.D.zzl) {
                zzcimVar.zzl("onLoadException", iOException);
            } else {
                zzcimVar.zzk("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazx
    public final /* synthetic */ void zzj(Object obj, int i) {
        this.J += i;
    }

    @Override // com.google.android.gms.internal.ads.zzbbh
    public final void zzl(int i, long j) {
        this.K += i;
    }

    @Override // com.google.android.gms.internal.ads.zzbbh
    public final void zzm(Surface surface) {
        zzcim zzcimVar = this.I;
        if (zzcimVar != null) {
            zzcimVar.zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbh
    public final void zzn(zzass zzassVar) {
        zzciw zzciwVar = (zzciw) this.H.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbB)).booleanValue() || zzciwVar == null || zzassVar == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("frameRate", String.valueOf(zzassVar.zzl));
        map.put("bitRate", String.valueOf(zzassVar.zzb));
        map.put("resolution", zzassVar.zzj + "x" + zzassVar.zzk);
        map.put("videoMime", zzassVar.zze);
        map.put("videoSampleMime", zzassVar.zzf);
        map.put("videoCodec", zzassVar.zzc);
        zzciwVar.zzd("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.zzbbh
    public final void zzo(int i, int i2, int i3, float f) {
        zzcim zzcimVar = this.I;
        if (zzcimVar != null) {
            zzcimVar.zzC(i, i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final int zzr() {
        return this.K;
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final int zzt() {
        return this.E.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final long zzv() {
        return this.E.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final long zzw() {
        return this.J;
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final long zzx() {
        if ((this.Q != null && this.Q.zzk()) && this.Q.zzj()) {
            return Math.min(this.J, this.Q.zze());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final long zzy() {
        return this.E.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final long zzz() {
        return this.E.zzd();
    }
}
