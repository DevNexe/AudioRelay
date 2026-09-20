package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbca;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzbkm;
import com.google.android.gms.internal.ads.zzbvc;
import com.google.android.gms.internal.ads.zzcgg;
import com.google.android.gms.internal.ads.zzcgn;
import defpackage.bf6;
import defpackage.fw5;
import defpackage.jx5;
import java.util.concurrent.atomic.AtomicBoolean;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* JADX INFO: loaded from: classes.dex */
public final class zzdu {
    public final zzbvc a;
    public final zzp b;
    public final AtomicBoolean c;
    public final VideoController d;
    public final bf6 e;
    public zza f;
    public AdListener g;
    public AdSize[] h;
    public AppEventListener i;
    public zzbs j;
    public VideoOptions k;
    public String l;

    @NotOnlyInitialized
    public final ViewGroup m;
    public final int n;
    public boolean o;
    public OnPaidEventListener p;

    public zzdu(ViewGroup viewGroup) {
        this(viewGroup, null, false, zzp.zza, 0);
    }

    public static zzq a(Context context, AdSize[] adSizeArr, int i) {
        for (AdSize adSize : adSizeArr) {
            if (adSize.equals(AdSize.INVALID)) {
                return zzq.zze();
            }
        }
        zzq zzqVar = new zzq(context, adSizeArr);
        zzqVar.zzj = i == 1;
        return zzqVar;
    }

    public final boolean zzA() {
        try {
            zzbs zzbsVar = this.j;
            if (zzbsVar != null) {
                return zzbsVar.zzY();
            }
            return false;
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
            return false;
        }
    }

    public final AdSize[] zzB() {
        return this.h;
    }

    public final AdListener zza() {
        return this.g;
    }

    public final AdSize zzb() {
        zzq zzqVarZzg;
        try {
            zzbs zzbsVar = this.j;
            if (zzbsVar != null && (zzqVarZzg = zzbsVar.zzg()) != null) {
                return com.google.android.gms.ads.zzb.zzc(zzqVarZzg.zze, zzqVarZzg.zzb, zzqVarZzg.zza);
            }
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
        AdSize[] adSizeArr = this.h;
        if (adSizeArr != null) {
            return adSizeArr[0];
        }
        return null;
    }

    public final OnPaidEventListener zzc() {
        return this.p;
    }

    public final ResponseInfo zzd() {
        zzdh zzdhVarZzk = null;
        try {
            zzbs zzbsVar = this.j;
            if (zzbsVar != null) {
                zzdhVarZzk = zzbsVar.zzk();
            }
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
        return ResponseInfo.zza(zzdhVarZzk);
    }

    public final VideoController zzf() {
        return this.d;
    }

    public final VideoOptions zzg() {
        return this.k;
    }

    public final AppEventListener zzh() {
        return this.i;
    }

    public final zzdk zzi() {
        zzbs zzbsVar = this.j;
        if (zzbsVar != null) {
            try {
                return zzbsVar.zzl();
            } catch (RemoteException e) {
                zzcgn.zzl("#007 Could not call remote method.", e);
            }
        }
        return null;
    }

    public final String zzj() {
        zzbs zzbsVar;
        if (this.l == null && (zzbsVar = this.j) != null) {
            try {
                this.l = zzbsVar.zzr();
            } catch (RemoteException e) {
                zzcgn.zzl("#007 Could not call remote method.", e);
            }
        }
        return this.l;
    }

    public final void zzk() {
        try {
            zzbs zzbsVar = this.j;
            if (zzbsVar != null) {
                zzbsVar.zzx();
            }
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00cf A[Catch: RemoteException -> 0x00d9, TRY_LEAVE, TryCatch #0 {RemoteException -> 0x00d9, blocks: (B:26:0x009e, B:28:0x00a4, B:30:0x00b2, B:32:0x00c4, B:33:0x00cf), top: B:47:0x009e, outer: #1 }] */
    public final void zzm(zzdr zzdrVar) {
        try {
            zzbs zzbsVar = this.j;
            ViewGroup viewGroup = this.m;
            if (zzbsVar == null) {
                if (this.h == null || this.l == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context = viewGroup.getContext();
                zzq zzqVarA = a(context, this.h, this.n);
                zzbs zzbsVar2 = "search_v2".equals(zzqVarA.zza) ? (zzbs) new jx5(zzaw.zza(), context, zzqVarA, this.l).d(context, false) : (zzbs) new fw5(zzaw.zza(), context, zzqVarA, this.l, this.a).d(context, false);
                this.j = zzbsVar2;
                zzbsVar2.zzD(new zzg(this.e));
                zza zzaVar = this.f;
                if (zzaVar != null) {
                    this.j.zzC(new zzb(zzaVar));
                }
                AppEventListener appEventListener = this.i;
                if (appEventListener != null) {
                    this.j.zzG(new zzbca(appEventListener));
                }
                if (this.k != null) {
                    this.j.zzU(new zzff(this.k));
                }
                this.j.zzP(new zzey(this.p));
                this.j.zzN(this.o);
                zzbs zzbsVar3 = this.j;
                if (zzbsVar3 != null) {
                    try {
                        final IObjectWrapper iObjectWrapperZzn = zzbsVar3.zzn();
                        if (iObjectWrapperZzn != null) {
                            if (((Boolean) zzbkm.zzf.zze()).booleanValue()) {
                                if (((Boolean) zzay.zzc().zzb(zzbiy.zziG)).booleanValue()) {
                                    zzcgg.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzds
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            zzdu zzduVar = this.zza;
                                            IObjectWrapper iObjectWrapper = iObjectWrapperZzn;
                                            zzduVar.getClass();
                                            zzduVar.m.addView((View) ObjectWrapper.M0(iObjectWrapper));
                                        }
                                    });
                                } else {
                                    viewGroup.addView((View) ObjectWrapper.M0(iObjectWrapperZzn));
                                }
                            } else {
                                viewGroup.addView((View) ObjectWrapper.M0(iObjectWrapperZzn));
                            }
                        }
                    } catch (RemoteException e) {
                        zzcgn.zzl("#007 Could not call remote method.", e);
                    }
                }
            }
            zzbs zzbsVar4 = this.j;
            zzbsVar4.getClass();
            zzbsVar4.zzaa(this.b.zza(viewGroup.getContext(), zzdrVar));
        } catch (RemoteException e2) {
            zzcgn.zzl("#007 Could not call remote method.", e2);
        }
    }

    public final void zzn() {
        try {
            zzbs zzbsVar = this.j;
            if (zzbsVar != null) {
                zzbsVar.zzz();
            }
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzo() {
        if (this.c.getAndSet(true)) {
            return;
        }
        try {
            zzbs zzbsVar = this.j;
            if (zzbsVar != null) {
                zzbsVar.zzA();
            }
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzp() {
        try {
            zzbs zzbsVar = this.j;
            if (zzbsVar != null) {
                zzbsVar.zzB();
            }
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzq(zza zzaVar) {
        try {
            this.f = zzaVar;
            zzbs zzbsVar = this.j;
            if (zzbsVar != null) {
                zzbsVar.zzC(zzaVar != null ? new zzb(zzaVar) : null);
            }
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzr(AdListener adListener) {
        this.g = adListener;
        this.e.zza(adListener);
    }

    public final void zzs(AdSize... adSizeArr) {
        if (this.h != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        zzt(adSizeArr);
    }

    public final void zzt(AdSize... adSizeArr) {
        ViewGroup viewGroup = this.m;
        this.h = adSizeArr;
        try {
            zzbs zzbsVar = this.j;
            if (zzbsVar != null) {
                zzbsVar.zzF(a(viewGroup.getContext(), this.h, this.n));
            }
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
        viewGroup.requestLayout();
    }

    public final void zzu(String str) {
        if (this.l != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.l = str;
    }

    public final void zzv(AppEventListener appEventListener) {
        try {
            this.i = appEventListener;
            zzbs zzbsVar = this.j;
            if (zzbsVar != null) {
                zzbsVar.zzG(appEventListener != null ? new zzbca(appEventListener) : null);
            }
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzw(boolean z) {
        this.o = z;
        try {
            zzbs zzbsVar = this.j;
            if (zzbsVar != null) {
                zzbsVar.zzN(z);
            }
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzx(OnPaidEventListener onPaidEventListener) {
        try {
            this.p = onPaidEventListener;
            zzbs zzbsVar = this.j;
            if (zzbsVar != null) {
                zzbsVar.zzP(new zzey(onPaidEventListener));
            }
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzy(VideoOptions videoOptions) {
        this.k = videoOptions;
        try {
            zzbs zzbsVar = this.j;
            if (zzbsVar != null) {
                zzbsVar.zzU(videoOptions == null ? null : new zzff(videoOptions));
            }
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    public final boolean zzz(zzbs zzbsVar) {
        try {
            IObjectWrapper iObjectWrapperZzn = zzbsVar.zzn();
            if (iObjectWrapperZzn == null || ((View) ObjectWrapper.M0(iObjectWrapperZzn)).getParent() != null) {
                return false;
            }
            this.m.addView((View) ObjectWrapper.M0(iObjectWrapperZzn));
            this.j = zzbsVar;
            return true;
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
            return false;
        }
    }

    public zzdu(ViewGroup viewGroup, int i) {
        this(viewGroup, null, false, zzp.zza, i);
    }

    public zzdu(ViewGroup viewGroup, AttributeSet attributeSet, boolean z) {
        this(viewGroup, attributeSet, z, zzp.zza, 0);
    }

    public zzdu(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, int i) {
        this(viewGroup, attributeSet, z, zzp.zza, i);
    }

    public zzdu(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, zzp zzpVar, int i) {
        zzq zzqVarZze;
        this.a = new zzbvc();
        this.d = new VideoController();
        this.e = new bf6(this);
        this.m = viewGroup;
        this.b = zzpVar;
        this.j = null;
        this.c = new AtomicBoolean(false);
        this.n = i;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                zzy zzyVar = new zzy(context, attributeSet);
                this.h = zzyVar.zzb(z);
                this.l = zzyVar.zza();
                if (viewGroup.isInEditMode()) {
                    zzcgg zzcggVarZzb = zzaw.zzb();
                    AdSize adSize = this.h[0];
                    if (adSize.equals(AdSize.INVALID)) {
                        zzqVarZze = zzq.zze();
                    } else {
                        zzq zzqVar = new zzq(context, adSize);
                        zzqVar.zzj = i == 1;
                        zzqVarZze = zzqVar;
                    }
                    zzcggVarZzb.zzl(viewGroup, zzqVarZze, "Ads by Google");
                }
            } catch (IllegalArgumentException e) {
                zzaw.zzb().zzk(viewGroup, new zzq(context, AdSize.BANNER), e.getMessage(), e.getMessage());
            }
        }
    }
}
