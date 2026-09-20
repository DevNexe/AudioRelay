package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcjo extends zzcic implements TextureView.SurfaceTextureListener, zzcim {
    public final zzciv A;
    public zzcib B;
    public Surface C;
    public zzcin D;
    public String E;
    public String[] F;
    public boolean G;
    public int H;
    public zzciu I;
    public final boolean J;
    public boolean K;
    public boolean L;
    public int M;
    public int N;
    public float O;
    public final zzciw y;
    public final zzcix z;

    public zzcjo(Context context, zzcix zzcixVar, zzciw zzciwVar, boolean z, boolean z2, zzciv zzcivVar) {
        super(context);
        this.H = 1;
        this.y = zzciwVar;
        this.z = zzcixVar;
        this.J = z;
        this.A = zzcivVar;
        setSurfaceTextureListener(this);
        zzcixVar.zza(this);
    }

    public static String a(String str, Exception exc) {
        return str + "/" + exc.getClass().getCanonicalName() + ":" + exc.getMessage();
    }

    public final void b() {
        if (this.K) {
            return;
        }
        this.K = true;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcji
            @Override // java.lang.Runnable
            public final void run() {
                zzcib zzcibVar = this.zza.B;
                if (zzcibVar != null) {
                    zzcibVar.zzf();
                }
            }
        });
        zzn();
        this.z.zzb();
        if (this.L) {
            zzp();
        }
    }

    public final void c(boolean z) {
        zzcin zzcinVar = this.D;
        if ((zzcinVar != null && !z) || this.E == null || this.C == null) {
            return;
        }
        if (z) {
            if (!g()) {
                zzcgn.zzj("No valid ExoPlayerAdapter exists when switch source.");
                return;
            } else {
                zzcinVar.zzQ();
                d();
            }
        }
        boolean zStartsWith = this.E.startsWith("cache:");
        zzciv zzcivVar = this.A;
        zzciw zzciwVar = this.y;
        if (zStartsWith) {
            zzckz zzckzVarZzr = zzciwVar.zzr(this.E);
            if (zzckzVarZzr instanceof zzcli) {
                zzcin zzcinVarZzj = ((zzcli) zzckzVarZzr).zzj();
                this.D = zzcinVarZzj;
                if (!zzcinVarZzj.zzR()) {
                    zzcgn.zzj("Precached video player has been released.");
                    return;
                }
            } else {
                if (!(zzckzVarZzr instanceof zzclf)) {
                    zzcgn.zzj("Stream cache miss: ".concat(String.valueOf(this.E)));
                    return;
                }
                zzclf zzclfVar = (zzclf) zzckzVarZzr;
                String strZzc = com.google.android.gms.ads.internal.zzt.zzq().zzc(zzciwVar.getContext(), zzciwVar.zzp().zza);
                ByteBuffer byteBufferZzl = zzclfVar.zzl();
                boolean zZzm = zzclfVar.zzm();
                String strZzi = zzclfVar.zzi();
                if (strZzi == null) {
                    zzcgn.zzj("Stream cache URL is null.");
                    return;
                } else {
                    zzcin zzcmaVar = zzcivVar.zzm ? new zzcma(zzciwVar.getContext(), zzcivVar, zzciwVar) : new zzcke(zzciwVar.getContext(), zzcivVar, zzciwVar);
                    this.D = zzcmaVar;
                    zzcmaVar.zzD(new Uri[]{Uri.parse(strZzi)}, strZzc, byteBufferZzl, zZzm);
                }
            }
        } else {
            this.D = zzcivVar.zzm ? new zzcma(zzciwVar.getContext(), zzcivVar, zzciwVar) : new zzcke(zzciwVar.getContext(), zzcivVar, zzciwVar);
            String strZzc2 = com.google.android.gms.ads.internal.zzt.zzq().zzc(zzciwVar.getContext(), zzciwVar.zzp().zza);
            Uri[] uriArr = new Uri[this.F.length];
            int i = 0;
            while (true) {
                String[] strArr = this.F;
                if (i >= strArr.length) {
                    break;
                }
                uriArr[i] = Uri.parse(strArr[i]);
                i++;
            }
            this.D.zzC(uriArr, strZzc2);
        }
        this.D.zzI(this);
        e(this.C, false);
        if (this.D.zzR()) {
            int iZzt = this.D.zzt();
            this.H = iZzt;
            if (iZzt == 3) {
                b();
            }
        }
    }

    public final void d() {
        if (this.D != null) {
            e(null, true);
            zzcin zzcinVar = this.D;
            if (zzcinVar != null) {
                zzcinVar.zzI(null);
                this.D.zzE();
                this.D = null;
            }
            this.H = 1;
            this.G = false;
            this.K = false;
            this.L = false;
        }
    }

    public final void e(Surface surface, boolean z) {
        zzcin zzcinVar = this.D;
        if (zzcinVar == null) {
            zzcgn.zzj("Trying to set surface before player is initialized.");
            return;
        }
        try {
            zzcinVar.zzO(surface, z);
        } catch (IOException e) {
            zzcgn.zzk("", e);
        }
    }

    public final boolean f() {
        return g() && this.H != 1;
    }

    public final boolean g() {
        zzcin zzcinVar = this.D;
        return (zzcinVar == null || !zzcinVar.zzR() || this.G) ? false : true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = this.O;
        if (f != 0.0f && this.I == null) {
            float f2 = measuredWidth;
            float f3 = f2 / measuredHeight;
            if (f > f3) {
                measuredHeight = (int) (f2 / f);
            }
            if (f < f3) {
                measuredWidth = (int) (measuredHeight * f);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        zzciu zzciuVar = this.I;
        if (zzciuVar != null) {
            zzciuVar.zzc(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        zzcin zzcinVar;
        float f;
        int i3;
        if (this.J) {
            zzciu zzciuVar = new zzciu(getContext());
            this.I = zzciuVar;
            zzciuVar.zzd(surfaceTexture, i, i2);
            this.I.start();
            SurfaceTexture surfaceTextureZzb = this.I.zzb();
            if (surfaceTextureZzb != null) {
                surfaceTexture = surfaceTextureZzb;
            } else {
                this.I.zze();
                this.I = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.C = surface;
        if (this.D == null) {
            c(false);
        } else {
            e(surface, true);
            if (!this.A.zza && (zzcinVar = this.D) != null) {
                zzcinVar.zzM(true);
            }
        }
        int i4 = this.M;
        if (i4 == 0 || (i3 = this.N) == 0) {
            f = i2 > 0 ? i / i2 : 1.0f;
            if (this.O != f) {
                this.O = f;
                requestLayout();
            }
        } else {
            f = i3 > 0 ? i4 / i3 : 1.0f;
            if (this.O != f) {
                this.O = f;
                requestLayout();
            }
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjj
            @Override // java.lang.Runnable
            public final void run() {
                zzcib zzcibVar = this.zza.B;
                if (zzcibVar != null) {
                    zzcibVar.zzh();
                }
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzo();
        zzciu zzciuVar = this.I;
        if (zzciuVar != null) {
            zzciuVar.zze();
            this.I = null;
        }
        zzcin zzcinVar = this.D;
        if (zzcinVar != null) {
            if (zzcinVar != null) {
                zzcinVar.zzM(false);
            }
            Surface surface = this.C;
            if (surface != null) {
                surface.release();
            }
            this.C = null;
            e(null, true);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjm
            @Override // java.lang.Runnable
            public final void run() {
                zzcib zzcibVar = this.zza.B;
                if (zzcibVar != null) {
                    zzcibVar.zzi();
                }
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i, final int i2) {
        zzciu zzciuVar = this.I;
        if (zzciuVar != null) {
            zzciuVar.zzc(i, i2);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjl
            @Override // java.lang.Runnable
            public final void run() {
                zzcjo zzcjoVar = this.zza;
                int i3 = i;
                int i4 = i2;
                zzcib zzcibVar = zzcjoVar.B;
                if (zzcibVar != null) {
                    zzcibVar.zzj(i3, i4);
                }
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.z.zzf(this);
        this.w.zza(surfaceTexture, this.B);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(final int i) {
        com.google.android.gms.ads.internal.util.zze.zza("AdExoPlayerView3 window visibility changed to " + i);
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjk
            @Override // java.lang.Runnable
            public final void run() {
                zzcjo zzcjoVar = this.zza;
                int i2 = i;
                zzcib zzcibVar = zzcjoVar.B;
                if (zzcibVar != null) {
                    zzcibVar.onWindowVisibilityChanged(i2);
                }
            }
        });
        super.onWindowVisibilityChanged(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcic
    public final void zzA(int i) {
        zzcin zzcinVar = this.D;
        if (zzcinVar != null) {
            zzcinVar.zzN(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcic
    public final void zzB(String str, String[] strArr) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.F = new String[]{str};
        } else {
            this.F = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.E;
        boolean z = this.A.zzn && str2 != null && !str.equals(str2) && this.H == 4;
        this.E = str;
        c(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcim
    public final void zzC(int i, int i2) {
        this.M = i;
        this.N = i2;
        float f = i2 > 0 ? i / i2 : 1.0f;
        if (this.O != f) {
            this.O = f;
            requestLayout();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcic
    public final int zza() {
        if (f()) {
            return (int) this.D.zzy();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcic
    public final int zzb() {
        zzcin zzcinVar = this.D;
        if (zzcinVar != null) {
            return zzcinVar.zzr();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcic
    public final int zzc() {
        if (f()) {
            return (int) this.D.zzz();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcic
    public final int zzd() {
        return this.N;
    }

    @Override // com.google.android.gms.internal.ads.zzcic
    public final int zze() {
        return this.M;
    }

    @Override // com.google.android.gms.internal.ads.zzcic
    public final long zzf() {
        zzcin zzcinVar = this.D;
        if (zzcinVar != null) {
            return zzcinVar.zzx();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcic
    public final long zzg() {
        zzcin zzcinVar = this.D;
        if (zzcinVar != null) {
            return zzcinVar.zzA();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcic
    public final long zzh() {
        zzcin zzcinVar = this.D;
        if (zzcinVar != null) {
            return zzcinVar.zzB();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcim
    public final void zzi(final boolean z, final long j) {
        if (this.y != null) {
            zzcha.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjb
                @Override // java.lang.Runnable
                public final void run() {
                    zzcjo zzcjoVar = this.zza;
                    zzcjoVar.y.zzx(z, j);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcic
    public final String zzj() {
        return "ExoPlayer/3".concat(true != this.J ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.zzcim
    public final void zzk(String str, Exception exc) {
        zzcin zzcinVar;
        final String strA = a(str, exc);
        zzcgn.zzj("ExoPlayerAdapter error: ".concat(strA));
        this.G = true;
        if (this.A.zza && (zzcinVar = this.D) != null) {
            zzcinVar.zzM(false);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcje
            @Override // java.lang.Runnable
            public final void run() {
                zzcjo zzcjoVar = this.zza;
                String str2 = strA;
                zzcib zzcibVar = zzcjoVar.B;
                if (zzcibVar != null) {
                    zzcibVar.zzb("ExoPlayerAdapter error", str2);
                }
            }
        });
        com.google.android.gms.ads.internal.zzt.zzp().zzs(exc, "AdExoPlayerView.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcim
    public final void zzl(String str, Exception exc) {
        final String strA = a("onLoadException", exc);
        zzcgn.zzj("ExoPlayerAdapter exception: ".concat(strA));
        com.google.android.gms.ads.internal.zzt.zzp().zzs(exc, "AdExoPlayerView.onException");
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjd
            @Override // java.lang.Runnable
            public final void run() {
                zzcjo zzcjoVar = this.zza;
                String str2 = strA;
                zzcib zzcibVar = zzcjoVar.B;
                if (zzcibVar != null) {
                    zzcibVar.zzc("ExoPlayerAdapter exception", str2);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcim
    public final void zzm(int i) {
        zzcin zzcinVar;
        if (this.H != i) {
            this.H = i;
            if (i == 3) {
                b();
                return;
            }
            if (i != 4) {
                return;
            }
            if (this.A.zza && (zzcinVar = this.D) != null) {
                zzcinVar.zzM(false);
            }
            this.z.zze();
            this.x.zzc();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjc
                @Override // java.lang.Runnable
                public final void run() {
                    zzcib zzcibVar = this.zza.B;
                    if (zzcibVar != null) {
                        zzcibVar.zza();
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcic, defpackage.g96
    public final void zzn() {
        if (this.A.zzm) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjg
                @Override // java.lang.Runnable
                public final void run() {
                    zzcjo zzcjoVar = this.zza;
                    float fZza = zzcjoVar.x.zza();
                    zzcin zzcinVar = zzcjoVar.D;
                    if (zzcinVar == null) {
                        zzcgn.zzj("Trying to set volume before player is initialized.");
                        return;
                    }
                    try {
                        zzcinVar.zzP(fZza, false);
                    } catch (IOException e) {
                        zzcgn.zzk("", e);
                    }
                }
            });
            return;
        }
        float fZza = this.x.zza();
        zzcin zzcinVar = this.D;
        if (zzcinVar == null) {
            zzcgn.zzj("Trying to set volume before player is initialized.");
            return;
        }
        try {
            zzcinVar.zzP(fZza, false);
        } catch (IOException e) {
            zzcgn.zzk("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcic
    public final void zzo() {
        zzcin zzcinVar;
        if (f()) {
            if (this.A.zza && (zzcinVar = this.D) != null) {
                zzcinVar.zzM(false);
            }
            this.D.zzL(false);
            this.z.zze();
            this.x.zzc();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjh
                @Override // java.lang.Runnable
                public final void run() {
                    zzcib zzcibVar = this.zza.B;
                    if (zzcibVar != null) {
                        zzcibVar.zzd();
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcic
    public final void zzp() {
        zzcin zzcinVar;
        if (!f()) {
            this.L = true;
            return;
        }
        if (this.A.zza && (zzcinVar = this.D) != null) {
            zzcinVar.zzM(true);
        }
        this.D.zzL(true);
        this.z.zzc();
        this.x.zzb();
        this.w.zzb();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjn
            @Override // java.lang.Runnable
            public final void run() {
                zzcib zzcibVar = this.zza.B;
                if (zzcibVar != null) {
                    zzcibVar.zze();
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcic
    public final void zzq(int i) {
        if (f()) {
            this.D.zzF(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcic
    public final void zzr(zzcib zzcibVar) {
        this.B = zzcibVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcic
    public final void zzs(String str) {
        if (str != null) {
            zzB(str, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcic
    public final void zzt() {
        if (g()) {
            this.D.zzQ();
            d();
        }
        zzcix zzcixVar = this.z;
        zzcixVar.zze();
        this.x.zzc();
        zzcixVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcic
    public final void zzu(float f, float f2) {
        zzciu zzciuVar = this.I;
        if (zzciuVar != null) {
            zzciuVar.zzf(f, f2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcim
    public final void zzv() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjf
            @Override // java.lang.Runnable
            public final void run() {
                zzcib zzcibVar = this.zza.B;
                if (zzcibVar != null) {
                    zzcibVar.zzg();
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcic
    public final void zzw(int i) {
        zzcin zzcinVar = this.D;
        if (zzcinVar != null) {
            zzcinVar.zzG(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcic
    public final void zzx(int i) {
        zzcin zzcinVar = this.D;
        if (zzcinVar != null) {
            zzcinVar.zzH(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcic
    public final void zzy(int i) {
        zzcin zzcinVar = this.D;
        if (zzcinVar != null) {
            zzcinVar.zzJ(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcic
    public final void zzz(int i) {
        zzcin zzcinVar = this.D;
        if (zzcinVar != null) {
            zzcinVar.zzK(i);
        }
    }
}
