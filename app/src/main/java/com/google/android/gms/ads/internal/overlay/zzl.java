package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.AdError;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzbol;
import com.google.android.gms.internal.ads.zzbon;
import com.google.android.gms.internal.ads.zzbya;
import com.google.android.gms.internal.ads.zzbyz;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzcgt;
import com.google.android.gms.internal.ads.zzcmn;
import com.google.android.gms.internal.ads.zzcmz;
import com.google.android.gms.internal.ads.zzcny;
import com.google.android.gms.internal.ads.zzcoa;
import com.google.android.gms.internal.ads.zzcoc;
import com.google.android.gms.internal.ads.zzddl;
import com.google.android.gms.internal.ads.zzdkl;
import com.google.android.gms.internal.ads.zzegh;
import com.google.android.gms.internal.ads.zzfph;
import defpackage.j17;
import defpackage.nj6;
import defpackage.wq6;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public class zzl extends zzbyz implements zzad {
    public static final int Q = Color.argb(0, 0, 0, 0);
    public zzr A;
    public FrameLayout C;
    public WebChromeClient.CustomViewCallback D;
    public wq6 G;
    public zze J;
    public boolean K;
    public boolean L;
    public final Activity w;
    public AdOverlayInfoParcel x;
    public zzcmn y;
    public zzh z;
    public boolean B = false;
    public boolean E = false;
    public boolean F = false;
    public boolean H = false;
    public int P = 1;
    public final Object I = new Object();
    public boolean M = false;
    public boolean N = false;
    public boolean O = true;

    public zzl(Activity activity) {
        this.w = activity;
    }

    public final void L0(boolean z) throws nj6 {
        boolean z2 = this.L;
        Activity activity = this.w;
        if (!z2) {
            activity.requestWindowFeature(1);
        }
        Window window = activity.getWindow();
        if (window == null) {
            throw new nj6("Invalid activity, no window available.");
        }
        zzcmn zzcmnVar = this.x.zzd;
        zzcoa zzcoaVarZzP = zzcmnVar != null ? zzcmnVar.zzP() : null;
        boolean z3 = false;
        boolean z4 = zzcoaVarZzP != null && zzcoaVarZzP.zzJ();
        this.H = false;
        if (z4) {
            int i = this.x.zzj;
            if (i == 6) {
                z3 = activity.getResources().getConfiguration().orientation == 1;
                this.H = z3;
            } else if (i == 7) {
                z3 = activity.getResources().getConfiguration().orientation == 2;
                this.H = z3;
            }
        }
        zzcgn.zze("Delay onShow to next orientation change: " + z3);
        zzy(this.x.zzj);
        window.setFlags(16777216, 16777216);
        zzcgn.zze("Hardware acceleration on the AdActivity window enabled.");
        if (this.F) {
            this.G.setBackgroundColor(Q);
        } else {
            this.G.setBackgroundColor(-16777216);
        }
        activity.setContentView(this.G);
        this.L = true;
        if (z) {
            try {
                com.google.android.gms.ads.internal.zzt.zzA();
                Activity activity2 = this.w;
                zzcmn zzcmnVar2 = this.x.zzd;
                zzcoc zzcocVarZzQ = zzcmnVar2 != null ? zzcmnVar2.zzQ() : null;
                zzcmn zzcmnVar3 = this.x.zzd;
                String strZzU = zzcmnVar3 != null ? zzcmnVar3.zzU() : null;
                AdOverlayInfoParcel adOverlayInfoParcel = this.x;
                zzcgt zzcgtVar = adOverlayInfoParcel.zzm;
                zzcmn zzcmnVar4 = adOverlayInfoParcel.zzd;
                zzcmn zzcmnVarZza = zzcmz.zza(activity2, zzcocVarZzQ, strZzU, true, z4, null, null, zzcgtVar, null, null, zzcmnVar4 != null ? zzcmnVar4.zzm() : null, zzbel.zza(), null, null);
                this.y = zzcmnVarZza;
                zzcoa zzcoaVarZzP2 = zzcmnVarZza.zzP();
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.x;
                zzbol zzbolVar = adOverlayInfoParcel2.zzp;
                zzbon zzbonVar = adOverlayInfoParcel2.zze;
                zzz zzzVar = adOverlayInfoParcel2.zzi;
                zzcmn zzcmnVar5 = adOverlayInfoParcel2.zzd;
                zzcoaVarZzP2.zzL(null, zzbolVar, null, zzbonVar, zzzVar, true, null, zzcmnVar5 != null ? zzcmnVar5.zzP().zzd() : null, null, null, null, null, null, null, null, null, null);
                this.y.zzP().zzz(new zzcny() { // from class: com.google.android.gms.ads.internal.overlay.zzd
                    @Override // com.google.android.gms.internal.ads.zzcny
                    public final void zza(boolean z5) {
                        zzcmn zzcmnVar6 = this.zza.y;
                        if (zzcmnVar6 != null) {
                            zzcmnVar6.zzZ();
                        }
                    }
                });
                AdOverlayInfoParcel adOverlayInfoParcel3 = this.x;
                String str = adOverlayInfoParcel3.zzl;
                if (str != null) {
                    this.y.loadUrl(str);
                } else {
                    String str2 = adOverlayInfoParcel3.zzh;
                    if (str2 == null) {
                        throw new nj6("No URL or HTML to display in ad overlay.");
                    }
                    this.y.loadDataWithBaseURL(adOverlayInfoParcel3.zzf, str2, "text/html", "UTF-8", null);
                }
                zzcmn zzcmnVar6 = this.x.zzd;
                if (zzcmnVar6 != null) {
                    zzcmnVar6.zzat(this);
                }
            } catch (Exception e) {
                zzcgn.zzh("Error obtaining webview.", e);
                throw new nj6(e);
            }
        } else {
            zzcmn zzcmnVar7 = this.x.zzd;
            this.y = zzcmnVar7;
            zzcmnVar7.zzam(activity);
        }
        this.y.zzah(this);
        zzcmn zzcmnVar8 = this.x.zzd;
        if (zzcmnVar8 != null) {
            IObjectWrapper iObjectWrapperZzS = zzcmnVar8.zzS();
            wq6 wq6Var = this.G;
            if (iObjectWrapperZzS != null && wq6Var != null) {
                com.google.android.gms.ads.internal.zzt.zzh().zzc(iObjectWrapperZzS, wq6Var);
            }
        }
        if (this.x.zzk != 5) {
            ViewParent parent = this.y.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(this.y.zzH());
            }
            if (this.F) {
                this.y.zzal();
            }
            this.G.addView(this.y.zzH(), -1, -1);
        }
        if (!z && !this.H) {
            this.y.zzZ();
        }
        AdOverlayInfoParcel adOverlayInfoParcel4 = this.x;
        if (adOverlayInfoParcel4.zzk == 5) {
            zzegh.zzh(this.w, this, adOverlayInfoParcel4.zzu, adOverlayInfoParcel4.zzr, adOverlayInfoParcel4.zzs, adOverlayInfoParcel4.zzt, adOverlayInfoParcel4.zzq, adOverlayInfoParcel4.zzv);
            return;
        }
        zzu(z4);
        if (this.y.zzay()) {
            zzw(z4, true);
        }
    }

    public final void M0(Configuration configuration) {
        com.google.android.gms.ads.internal.zzj zzjVar;
        int i;
        com.google.android.gms.ads.internal.zzj zzjVar2;
        AdOverlayInfoParcel adOverlayInfoParcel = this.x;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = (adOverlayInfoParcel == null || (zzjVar2 = adOverlayInfoParcel.zzo) == null || !zzjVar2.zzb) ? false : true;
        com.google.android.gms.ads.internal.util.zzaa zzaaVarZzr = com.google.android.gms.ads.internal.zzt.zzr();
        Activity activity = this.w;
        boolean zZze = zzaaVarZzr.zze(activity, configuration);
        if ((!this.F || z3) && !zZze) {
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.x;
            if (adOverlayInfoParcel2 != null && (zzjVar = adOverlayInfoParcel2.zzo) != null && zzjVar.zzg) {
                z2 = true;
            }
        } else {
            z = false;
        }
        Window window = activity.getWindow();
        if (((Boolean) zzay.zzc().zzb(zzbiy.zzaY)).booleanValue()) {
            View decorView = window.getDecorView();
            if (z) {
                i = z2 ? 5894 : 5380;
            } else {
                i = 256;
            }
            decorView.setSystemUiVisibility(i);
            return;
        }
        if (!z) {
            window.addFlags(2048);
            window.clearFlags(1024);
            return;
        }
        window.addFlags(1024);
        window.clearFlags(2048);
        if (z2) {
            window.getDecorView().setSystemUiVisibility(4098);
        }
    }

    public final void zzA(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        Activity activity = this.w;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.C = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.C.addView(view, -1, -1);
        activity.setContentView(this.C);
        this.L = true;
        this.D = customViewCallback;
        this.B = true;
    }

    public final void zzC() {
        synchronized (this.I) {
            this.K = true;
            zze zzeVar = this.J;
            if (zzeVar != null) {
                zzfph zzfphVar = com.google.android.gms.ads.internal.util.zzs.zza;
                zzfphVar.removeCallbacks(zzeVar);
                zzfphVar.post(this.J);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [com.google.android.gms.ads.internal.overlay.zze, java.lang.Runnable] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void zzD() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        zzo zzoVar;
        if (!this.w.isFinishing() || this.M) {
            return;
        }
        this.M = true;
        zzcmn zzcmnVar = this.y;
        if (zzcmnVar != null) {
            zzcmnVar.zzY(this.P - 1);
            synchronized (this.I) {
                if (!this.K && this.y.zzaz()) {
                    if (((Boolean) zzay.zzc().zzb(zzbiy.zzdS)).booleanValue() && !this.N && (adOverlayInfoParcel = this.x) != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
                        zzoVar.zzbC();
                    }
                    ?? r1 = new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zze
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzc();
                        }
                    };
                    this.J = r1;
                    com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(r1, ((Long) zzay.zzc().zzb(zzbiy.zzaR)).longValue());
                    return;
                }
            }
        }
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final boolean zzE() {
        this.P = 1;
        if (this.y == null) {
            return true;
        }
        if (((Boolean) zzay.zzc().zzb(zzbiy.zzhz)).booleanValue() && this.y.canGoBack()) {
            this.y.goBack();
            return false;
        }
        boolean zZzaE = this.y.zzaE();
        if (!zZzaE) {
            this.y.zzd("onbackblocked", Collections.emptyMap());
        }
        return zZzaE;
    }

    public final void zzb() {
        this.P = 3;
        Activity activity = this.w;
        activity.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.x;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.zzk != 5) {
            return;
        }
        activity.overridePendingTransition(0, 0);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzad
    public final void zzbJ() {
        this.P = 2;
        this.w.finish();
    }

    public final void zzc() {
        zzcmn zzcmnVar;
        zzo zzoVar;
        if (this.N) {
            return;
        }
        this.N = true;
        zzcmn zzcmnVar2 = this.y;
        if (zzcmnVar2 != null) {
            this.G.removeView(zzcmnVar2.zzH());
            zzh zzhVar = this.z;
            if (zzhVar != null) {
                this.y.zzam(zzhVar.zzd);
                this.y.zzap(false);
                ViewGroup viewGroup = this.z.zzc;
                View viewZzH = this.y.zzH();
                zzh zzhVar2 = this.z;
                viewGroup.addView(viewZzH, zzhVar2.zza, zzhVar2.zzb);
                this.z = null;
            } else {
                Activity activity = this.w;
                if (activity.getApplicationContext() != null) {
                    this.y.zzam(activity.getApplicationContext());
                }
            }
            this.y = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.x;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
            zzoVar.zzf(this.P);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.x;
        if (adOverlayInfoParcel2 == null || (zzcmnVar = adOverlayInfoParcel2.zzd) == null) {
            return;
        }
        IObjectWrapper iObjectWrapperZzS = zzcmnVar.zzS();
        View viewZzH2 = this.x.zzd.zzH();
        if (iObjectWrapperZzS == null || viewZzH2 == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzh().zzc(iObjectWrapperZzS, viewZzH2);
    }

    public final void zzd() {
        this.G.x = true;
    }

    public final void zzf() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.x;
        if (adOverlayInfoParcel != null && this.B) {
            zzy(adOverlayInfoParcel.zzj);
        }
        if (this.C != null) {
            this.w.setContentView(this.G);
            this.L = true;
            this.C.removeAllViews();
            this.C = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.D;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.D = null;
        }
        this.B = false;
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzg(int i, int i2, Intent intent) {
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzh() {
        this.P = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzj(IObjectWrapper iObjectWrapper) {
        M0((Configuration) ObjectWrapper.M0(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public void zzk(Bundle bundle) {
        Activity activity = this.w;
        activity.requestWindowFeature(1);
        this.E = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            AdOverlayInfoParcel adOverlayInfoParcelZza = AdOverlayInfoParcel.zza(activity.getIntent());
            this.x = adOverlayInfoParcelZza;
            if (adOverlayInfoParcelZza == null) {
                throw new nj6("Could not get info for ad overlay.");
            }
            if (adOverlayInfoParcelZza.zzm.zzc > 7500000) {
                this.P = 4;
            }
            if (activity.getIntent() != null) {
                this.O = activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.x;
            com.google.android.gms.ads.internal.zzj zzjVar = adOverlayInfoParcel.zzo;
            if (zzjVar != null) {
                boolean z = zzjVar.zza;
                this.F = z;
                if (z) {
                    if (adOverlayInfoParcel.zzk != 5 && zzjVar.zzf != -1) {
                        new j17(this).zzb();
                    }
                }
            } else if (adOverlayInfoParcel.zzk == 5) {
                this.F = true;
                if (adOverlayInfoParcel.zzk != 5) {
                    new j17(this).zzb();
                }
            } else {
                this.F = false;
            }
            if (bundle == null) {
                if (this.O) {
                    zzddl zzddlVar = this.x.zzx;
                    if (zzddlVar != null) {
                        zzddlVar.zze();
                    }
                    zzo zzoVar = this.x.zzc;
                    if (zzoVar != null) {
                        zzoVar.zzb();
                    }
                }
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.x;
                if (adOverlayInfoParcel2.zzk != 1) {
                    com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel2.zzb;
                    if (zzaVar != null) {
                        zzaVar.onAdClicked();
                    }
                    zzdkl zzdklVar = this.x.zzy;
                    if (zzdklVar != null) {
                        zzdklVar.zzq();
                    }
                }
            }
            AdOverlayInfoParcel adOverlayInfoParcel3 = this.x;
            wq6 wq6Var = new wq6(activity, adOverlayInfoParcel3.zzn, adOverlayInfoParcel3.zzm.zza, adOverlayInfoParcel3.zzw);
            this.G = wq6Var;
            wq6Var.setId(AdError.NETWORK_ERROR_CODE);
            com.google.android.gms.ads.internal.zzt.zzr().zzj(activity);
            AdOverlayInfoParcel adOverlayInfoParcel4 = this.x;
            int i = adOverlayInfoParcel4.zzk;
            if (i == 1) {
                L0(false);
                return;
            }
            if (i == 2) {
                this.z = new zzh(adOverlayInfoParcel4.zzd);
                L0(false);
            } else if (i == 3) {
                L0(true);
            } else {
                if (i != 5) {
                    throw new nj6("Could not determine ad overlay type.");
                }
                L0(false);
            }
        } catch (nj6 e) {
            zzcgn.zzj(e.getMessage());
            this.P = 4;
            activity.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzl() {
        zzcmn zzcmnVar = this.y;
        if (zzcmnVar != null) {
            try {
                this.G.removeView(zzcmnVar.zzH());
            } catch (NullPointerException unused) {
            }
        }
        zzD();
    }

    public final void zzm() {
        if (this.H) {
            this.H = false;
            this.y.zzZ();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzn() {
        zzo zzoVar;
        zzf();
        AdOverlayInfoParcel adOverlayInfoParcel = this.x;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
            zzoVar.zzbr();
        }
        if (!((Boolean) zzay.zzc().zzb(zzbiy.zzdU)).booleanValue() && this.y != null && (!this.w.isFinishing() || this.z == null)) {
            this.y.onPause();
        }
        zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzo() {
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzp() {
        zzo zzoVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.x;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
            zzoVar.zzbK();
        }
        M0(this.w.getResources().getConfiguration());
        if (((Boolean) zzay.zzc().zzb(zzbiy.zzdU)).booleanValue()) {
            return;
        }
        zzcmn zzcmnVar = this.y;
        if (zzcmnVar == null || zzcmnVar.zzaB()) {
            zzcgn.zzj("The webview does not exist. Ignoring action.");
        } else {
            this.y.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzq(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.E);
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzr() {
        if (((Boolean) zzay.zzc().zzb(zzbiy.zzdU)).booleanValue()) {
            zzcmn zzcmnVar = this.y;
            if (zzcmnVar == null || zzcmnVar.zzaB()) {
                zzcgn.zzj("The webview does not exist. Ignoring action.");
            } else {
                this.y.onResume();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzs() {
        if (((Boolean) zzay.zzc().zzb(zzbiy.zzdU)).booleanValue() && this.y != null && (!this.w.isFinishing() || this.z == null)) {
            this.y.onPause();
        }
        zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzt() {
        zzo zzoVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.x;
        if (adOverlayInfoParcel == null || (zzoVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzoVar.zze();
    }

    public final void zzu(boolean z) {
        int iIntValue = ((Integer) zzay.zzc().zzb(zzbiy.zzdW)).intValue();
        boolean z2 = ((Boolean) zzay.zzc().zzb(zzbiy.zzaU)).booleanValue() || z;
        zzq zzqVar = new zzq();
        zzqVar.zzd = 50;
        zzqVar.zza = true != z2 ? 0 : iIntValue;
        zzqVar.zzb = true != z2 ? iIntValue : 0;
        zzqVar.zzc = iIntValue;
        this.A = new zzr(this.w, zzqVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z2 ? 9 : 11);
        zzw(z, this.x.zzg);
        this.G.addView(this.A, layoutParams);
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzv() {
        this.L = true;
    }

    public final void zzw(boolean z, boolean z2) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        com.google.android.gms.ads.internal.zzj zzjVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        com.google.android.gms.ads.internal.zzj zzjVar2;
        boolean z3 = true;
        boolean z4 = ((Boolean) zzay.zzc().zzb(zzbiy.zzaS)).booleanValue() && (adOverlayInfoParcel2 = this.x) != null && (zzjVar2 = adOverlayInfoParcel2.zzo) != null && zzjVar2.zzh;
        boolean z5 = ((Boolean) zzay.zzc().zzb(zzbiy.zzaT)).booleanValue() && (adOverlayInfoParcel = this.x) != null && (zzjVar = adOverlayInfoParcel.zzo) != null && zzjVar.zzi;
        if (z && z2 && z4 && !z5) {
            new zzbya(this.y, "useCustomClose").zzg("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        zzr zzrVar = this.A;
        if (zzrVar != null) {
            if (!z5 && (!z2 || z4)) {
                z3 = false;
            }
            zzrVar.zzb(z3);
        }
    }

    public final void zzx() {
        this.G.removeView(this.A);
        zzu(true);
    }

    public final void zzy(int i) {
        Activity activity = this.w;
        if (activity.getApplicationInfo().targetSdkVersion >= ((Integer) zzay.zzc().zzb(zzbiy.zzeY)).intValue()) {
            if (activity.getApplicationInfo().targetSdkVersion <= ((Integer) zzay.zzc().zzb(zzbiy.zzeZ)).intValue()) {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= ((Integer) zzay.zzc().zzb(zzbiy.zzfa)).intValue()) {
                    if (i2 <= ((Integer) zzay.zzc().zzb(zzbiy.zzfb)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            activity.setRequestedOrientation(i);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzp().zzs(th, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void zzz(boolean z) {
        if (z) {
            this.G.setBackgroundColor(0);
        } else {
            this.G.setBackgroundColor(-16777216);
        }
    }
}
