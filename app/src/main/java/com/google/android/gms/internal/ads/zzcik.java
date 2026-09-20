package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import defpackage.a42;
import defpackage.c96;
import defpackage.cz5;
import defpackage.dz5;
import defpackage.f96;
import defpackage.oa3;
import java.util.HashMap;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
public final class zzcik extends FrameLayout implements zzcib {
    public static final /* synthetic */ int O = 0;
    public final f96 A;
    public final long B;
    public final zzcic C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public long H;
    public long I;
    public String J;
    public String[] K;
    public Bitmap L;
    public final ImageView M;
    public boolean N;
    public final zzciw w;
    public final FrameLayout x;
    public final View y;
    public final zzbjn z;

    public zzcik(Context context, zzciw zzciwVar, int i, boolean z, zzbjn zzbjnVar, zzciv zzcivVar) {
        super(context);
        this.w = zzciwVar;
        this.z = zzbjnVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.x = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        oa3.h(zzciwVar.zzm());
        zzcid zzcidVar = zzciwVar.zzm().zza;
        zzcic zzcjoVar = i == 2 ? new zzcjo(context, new zzcix(context, zzciwVar.zzp(), zzciwVar.zzu(), zzbjnVar, zzciwVar.zzn()), zzciwVar, z, zzciwVar.zzQ().zzi(), zzcivVar) : new zzcia(context, zzciwVar, z, zzciwVar.zzQ().zzi(), zzcivVar, new zzcix(context, zzciwVar.zzp(), zzciwVar.zzu(), zzbjnVar, zzciwVar.zzn()));
        this.C = zzcjoVar;
        View view = new View(context);
        this.y = view;
        view.setBackgroundColor(0);
        frameLayout.addView(zzcjoVar, new FrameLayout.LayoutParams(-1, -1, 17));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzD)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzA)).booleanValue()) {
            zzm();
        }
        this.M = new ImageView(context);
        this.B = ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzF)).longValue();
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzC)).booleanValue();
        this.G = zBooleanValue;
        if (zzbjnVar != null) {
            zzbjnVar.zzd("spinner_used", true != zBooleanValue ? "0" : "1");
        }
        this.A = new f96(this);
        zzcjoVar.zzr(this);
    }

    public final void a() {
        zzciw zzciwVar = this.w;
        if (zzciwVar.zzk() == null || !this.E || this.F) {
            return;
        }
        zzciwVar.zzk().getWindow().clearFlags(128);
        this.E = false;
    }

    public final void b(String str, String... strArr) {
        HashMap map = new HashMap();
        map.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                map.put(str2, str3);
                str2 = null;
            }
        }
        this.w.zzd("onVideoEvent", map);
    }

    public final void c() {
        zzcic zzcicVar = this.C;
        if (zzcicVar == null) {
            return;
        }
        long jZza = zzcicVar.zza();
        if (this.H == jZza || jZza <= 0) {
            return;
        }
        float f = jZza / 1000.0f;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbB)).booleanValue()) {
            b("timeupdate", "time", String.valueOf(f), "totalBytes", String.valueOf(zzcicVar.zzh()), "qoeCachedBytes", String.valueOf(zzcicVar.zzf()), "qoeLoadedBytes", String.valueOf(zzcicVar.zzg()), "droppedFrames", String.valueOf(zzcicVar.zzb()), "reportTime", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().b()));
        } else {
            b("timeupdate", "time", String.valueOf(f));
        }
        this.H = jZza;
    }

    public final void finalize() throws Throwable {
        try {
            this.A.a();
            final zzcic zzcicVar = this.C;
            if (zzcicVar != null) {
                zzcha.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcie
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcicVar.zzt();
                    }
                });
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z) {
        super.onWindowFocusChanged(z);
        f96 f96Var = this.A;
        if (z) {
            f96Var.x = false;
            zzfph zzfphVar = com.google.android.gms.ads.internal.util.zzs.zza;
            zzfphVar.removeCallbacks(f96Var);
            zzfphVar.postDelayed(f96Var, 250L);
        } else {
            f96Var.a();
            this.I = this.H;
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcif
            @Override // java.lang.Runnable
            public final void run() {
                zzcik zzcikVar = this.zza;
                boolean z2 = z;
                zzcikVar.getClass();
                zzcikVar.b("windowFocusChanged", "hasWindowFocus", String.valueOf(z2));
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcib
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        boolean z = false;
        f96 f96Var = this.A;
        if (i == 0) {
            f96Var.x = false;
            zzfph zzfphVar = com.google.android.gms.ads.internal.util.zzs.zza;
            zzfphVar.removeCallbacks(f96Var);
            zzfphVar.postDelayed(f96Var, 250L);
            z = true;
        } else {
            f96Var.a();
            this.I = this.H;
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new c96(this, z));
    }

    public final void zzA(int i) {
        zzcic zzcicVar = this.C;
        if (zzcicVar == null) {
            return;
        }
        zzcicVar.zzz(i);
    }

    public final void zzB(int i) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzD)).booleanValue()) {
            this.x.setBackgroundColor(i);
            this.y.setBackgroundColor(i);
        }
    }

    public final void zzC(int i) {
        zzcic zzcicVar = this.C;
        if (zzcicVar == null) {
            return;
        }
        zzcicVar.zzA(i);
    }

    public final void zzD(String str, String[] strArr) {
        this.J = str;
        this.K = strArr;
    }

    public final void zzE(int i, int i2, int i3, int i4) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            StringBuilder sbA = a42.a("Set video bounds to x:", i, ";y:", i2, ";w:");
            sbA.append(i3);
            sbA.append(";h:");
            sbA.append(i4);
            com.google.android.gms.ads.internal.util.zze.zza(sbA.toString());
        }
        if (i3 == 0 || i4 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
        layoutParams.setMargins(i, i2, 0, 0);
        this.x.setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void zzF(float f) {
        zzcic zzcicVar = this.C;
        if (zzcicVar == null) {
            return;
        }
        zzcicVar.x.zze(f);
        zzcicVar.zzn();
    }

    public final void zzG(float f, float f2) {
        zzcic zzcicVar = this.C;
        if (zzcicVar != null) {
            zzcicVar.zzu(f, f2);
        }
    }

    public final void zzH() {
        zzcic zzcicVar = this.C;
        if (zzcicVar == null) {
            return;
        }
        zzcicVar.x.zzd(false);
        zzcicVar.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbE)).booleanValue()) {
            this.A.a();
        }
        b("ended", new String[0]);
        a();
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void zzb(String str, String str2) {
        b("error", "what", str, "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void zzc(String str, String str2) {
        b("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void zzd() {
        b("pause", new String[0]);
        a();
        this.D = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void zze() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbE)).booleanValue()) {
            f96 f96Var = this.A;
            f96Var.x = false;
            zzfph zzfphVar = com.google.android.gms.ads.internal.util.zzs.zza;
            zzfphVar.removeCallbacks(f96Var);
            zzfphVar.postDelayed(f96Var, 250L);
        }
        zzciw zzciwVar = this.w;
        if (zzciwVar.zzk() != null && !this.E) {
            boolean z = (zzciwVar.zzk().getWindow().getAttributes().flags & 128) != 0;
            this.F = z;
            if (!z) {
                zzciwVar.zzk().getWindow().addFlags(128);
                this.E = true;
            }
        }
        this.D = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void zzf() {
        zzcic zzcicVar = this.C;
        if (zzcicVar != null && this.I == 0) {
            b("canplaythrough", "duration", String.valueOf(zzcicVar.zzc() / 1000.0f), "videoWidth", String.valueOf(zzcicVar.zze()), "videoHeight", String.valueOf(zzcicVar.zzd()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void zzg() {
        this.y.setVisibility(4);
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcig
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.b("firstFrameRendered", new String[0]);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void zzh() {
        f96 f96Var = this.A;
        f96Var.x = false;
        zzfph zzfphVar = com.google.android.gms.ads.internal.util.zzs.zza;
        zzfphVar.removeCallbacks(f96Var);
        zzfphVar.postDelayed(f96Var, 250L);
        zzfphVar.post(new cz5(this, 5));
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void zzi() {
        if (this.N && this.L != null) {
            ImageView imageView = this.M;
            if (!(imageView.getParent() != null)) {
                imageView.setImageBitmap(this.L);
                imageView.invalidate();
                FrameLayout frameLayout = this.x;
                frameLayout.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
                frameLayout.bringChildToFront(imageView);
            }
        }
        this.A.a();
        this.I = this.H;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new dz5(this, 4));
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void zzj(int i, int i2) {
        if (this.G) {
            zzbiq zzbiqVar = zzbiy.zzE;
            int iMax = Math.max(i / ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiqVar)).intValue(), 1);
            int iMax2 = Math.max(i2 / ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiqVar)).intValue(), 1);
            Bitmap bitmap = this.L;
            if (bitmap != null && bitmap.getWidth() == iMax && this.L.getHeight() == iMax2) {
                return;
            }
            this.L = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
            this.N = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcib
    public final void zzk() {
        if (this.D) {
            ImageView imageView = this.M;
            if (imageView.getParent() != null) {
                this.x.removeView(imageView);
            }
        }
        zzcic zzcicVar = this.C;
        if (zzcicVar == null || this.L == null) {
            return;
        }
        long jC = com.google.android.gms.ads.internal.zzt.zzB().c();
        if (zzcicVar.getBitmap(this.L) != null) {
            this.N = true;
        }
        long jC2 = com.google.android.gms.ads.internal.zzt.zzB().c() - jC;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Spinner frame grab took " + jC2 + "ms");
        }
        if (jC2 > this.B) {
            zzcgn.zzj("Spinner frame grab crossed jank threshold! Suspending spinner.");
            this.G = false;
            this.L = null;
            zzbjn zzbjnVar = this.z;
            if (zzbjnVar != null) {
                zzbjnVar.zzd("spinner_jank", Long.toString(jC2));
            }
        }
    }

    public final void zzm() {
        zzcic zzcicVar = this.C;
        if (zzcicVar == null) {
            return;
        }
        TextView textView = new TextView(zzcicVar.getContext());
        textView.setText("AdMob - ".concat(zzcicVar.zzj()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        FrameLayout frameLayout = this.x;
        frameLayout.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        frameLayout.bringChildToFront(textView);
    }

    public final void zzn() {
        this.A.a();
        zzcic zzcicVar = this.C;
        if (zzcicVar != null) {
            zzcicVar.zzt();
        }
        a();
    }

    public final void zzq() {
        zzcic zzcicVar = this.C;
        if (zzcicVar == null) {
            return;
        }
        if (TextUtils.isEmpty(this.J)) {
            b("no_src", new String[0]);
        } else {
            zzcicVar.zzB(this.J, this.K);
        }
    }

    public final void zzr() {
        zzcic zzcicVar = this.C;
        if (zzcicVar == null) {
            return;
        }
        zzcicVar.x.zzd(true);
        zzcicVar.zzn();
    }

    public final void zzt() {
        zzcic zzcicVar = this.C;
        if (zzcicVar == null) {
            return;
        }
        zzcicVar.zzo();
    }

    public final void zzu() {
        zzcic zzcicVar = this.C;
        if (zzcicVar == null) {
            return;
        }
        zzcicVar.zzp();
    }

    public final void zzv(int i) {
        zzcic zzcicVar = this.C;
        if (zzcicVar == null) {
            return;
        }
        zzcicVar.zzq(i);
    }

    public final void zzw(MotionEvent motionEvent) {
        zzcic zzcicVar = this.C;
        if (zzcicVar == null) {
            return;
        }
        zzcicVar.dispatchTouchEvent(motionEvent);
    }

    public final void zzx(int i) {
        zzcic zzcicVar = this.C;
        if (zzcicVar == null) {
            return;
        }
        zzcicVar.zzw(i);
    }

    public final void zzy(int i) {
        zzcic zzcicVar = this.C;
        if (zzcicVar == null) {
            return;
        }
        zzcicVar.zzx(i);
    }

    public final void zzz(int i) {
        zzcic zzcicVar = this.C;
        if (zzcicVar == null) {
            return;
        }
        zzcicVar.zzy(i);
    }
}
