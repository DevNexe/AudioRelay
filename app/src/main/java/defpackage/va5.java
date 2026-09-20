package defpackage;

import android.content.Context;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventInterstitialListener;
import com.google.android.gms.internal.ads.zzbkh;
import com.google.android.gms.internal.ads.zzbtq;
import com.google.android.gms.internal.ads.zzbtr;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzchj;
import com.google.android.gms.internal.ads.zzexq;
import com.google.android.gms.internal.ads.zzexr;
import com.google.android.gms.internal.ads.zzfir;
import com.google.android.gms.internal.ads.zzfje;
import com.google.android.gms.internal.ads.zzguz;

/* JADX INFO: loaded from: classes.dex */
public final class va5 implements CustomEventInterstitialListener, zzchj, zzexq {
    public final Object w;
    public Object x;
    public Object y;

    public /* synthetic */ va5(eb6 eb6Var) {
        this.w = eb6Var;
    }

    public /* synthetic */ va5(Object obj, Object obj2, Object obj3) {
        this.y = obj;
        this.w = obj2;
        this.x = obj3;
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdClicked() {
        zzcgn.zze("Custom event adapter called onAdClicked.");
        ((MediationInterstitialListener) this.x).onAdClicked((CustomEventAdapter) this.w);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdClosed() {
        zzcgn.zze("Custom event adapter called onAdClosed.");
        ((MediationInterstitialListener) this.x).onAdClosed((CustomEventAdapter) this.w);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdFailedToLoad(int i) {
        zzcgn.zze("Custom event adapter called onFailedToReceiveAd.");
        ((MediationInterstitialListener) this.x).onAdFailedToLoad((CustomEventAdapter) this.w, i);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdLeftApplication() {
        zzcgn.zze("Custom event adapter called onAdLeftApplication.");
        ((MediationInterstitialListener) this.x).onAdLeftApplication((CustomEventAdapter) this.w);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventInterstitialListener
    public final void onAdLoaded() {
        zzcgn.zze("Custom event adapter called onReceivedAd.");
        ((MediationInterstitialListener) this.x).onAdLoaded((CustomEventAdapter) this.y);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdOpened() {
        zzcgn.zze("Custom event adapter called onAdOpened.");
        ((MediationInterstitialListener) this.x).onAdOpened((CustomEventAdapter) this.w);
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final /* synthetic */ zzexq zza(String str) {
        str.getClass();
        this.y = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final /* synthetic */ zzexq zzb(Context context) {
        context.getClass();
        this.x = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final zzexr zzc() {
        zzguz.zzc((Context) this.x, Context.class);
        zzguz.zzc((String) this.y, String.class);
        return new kb6((eb6) this.w, (Context) this.x, (String) this.y);
    }

    @Override // com.google.android.gms.internal.ads.zzchj
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzfje zzfjeVar;
        synchronized (((zzbtr) this.y).a) {
            try {
                Object obj2 = this.y;
                ((zzbtr) obj2).i = 0;
                zzbtq zzbtqVar = ((zzbtr) obj2).h;
                if (zzbtqVar != null && ((zzbtq) this.w) != zzbtqVar) {
                    zze.zza("New JS engine is loaded, marking previous one as destroyable.");
                    ((zzbtr) this.y).h.zzb();
                }
                ((zzbtr) this.y).h = (zzbtq) this.w;
                if (((Boolean) zzbkh.zzd.zze()).booleanValue() && (zzfjeVar = ((zzbtr) this.y).e) != null) {
                    zzfir zzfirVar = (zzfir) this.x;
                    zzfirVar.zze(true);
                    zzfjeVar.zzb(zzfirVar.zzj());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdFailedToLoad(AdError adError) {
        zzcgn.zze("Custom event adapter called onFailedToReceiveAd.");
        ((MediationInterstitialListener) this.x).onAdFailedToLoad((CustomEventAdapter) this.w, adError);
    }
}
