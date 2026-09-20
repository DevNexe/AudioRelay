package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.TrafficStats;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.zzbr;
import defpackage.bi5;
import defpackage.oa6;
import defpackage.pa6;
import defpackage.qa3;
import defpackage.qa6;
import defpackage.xi5;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
public class zzcmu extends WebViewClient implements zzcoa {
    public static final /* synthetic */ int zzb = 0;
    public com.google.android.gms.ads.internal.client.zza A;
    public com.google.android.gms.ads.internal.overlay.zzo B;
    public zzcny C;
    public zzcnz D;
    public zzbol E;
    public zzbon F;
    public zzdkl G;
    public boolean H;
    public boolean I;

    @GuardedBy("lock")
    public boolean J;

    @GuardedBy("lock")
    public boolean K;

    @GuardedBy("lock")
    public boolean L;
    public com.google.android.gms.ads.internal.overlay.zzz M;
    public zzbxz N;
    public com.google.android.gms.ads.internal.zzb O;
    public zzbxu P;
    public zzcdo Q;
    public zzfju R;
    public boolean S;
    public boolean T;
    public int U;
    public boolean V;
    public final HashSet W;
    public oa6 X;
    public final zzcmn w;
    public final zzbel x;
    public final HashMap y;
    public final Object z;

    public zzcmu(zzcmn zzcmnVar, zzbel zzbelVar, boolean z) {
        zzbxz zzbxzVar = new zzbxz(zzcmnVar, zzcmnVar.zzG(), new zzbii(zzcmnVar.getContext()));
        this.y = new HashMap();
        this.z = new Object();
        this.x = zzbelVar;
        this.w = zzcmnVar;
        this.J = z;
        this.N = zzbxzVar;
        this.P = null;
        this.W = new HashSet(Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzeG)).split(",")));
    }

    public static WebResourceResponse a() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzaD)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    public static final boolean e(boolean z, zzcmn zzcmnVar) {
        return (!z || zzcmnVar.zzQ().zzi() || zzcmnVar.zzU().equals("interstitial_mb")) ? false : true;
    }

    public final WebResourceResponse b(String str, Map map) throws IOException {
        zzcmn zzcmnVar = this.w;
        URL url = new URL(str);
        try {
            TrafficStats.setThreadStatsTag(264);
            int i = 0;
            while (true) {
                i++;
                if (i > 20) {
                    TrafficStats.clearThreadStatsTag();
                    throw new IOException("Too many redirects (20)");
                }
                URLConnection uRLConnectionOpenConnection = url.openConnection();
                uRLConnectionOpenConnection.setConnectTimeout(10000);
                uRLConnectionOpenConnection.setReadTimeout(10000);
                for (Map.Entry entry : map.entrySet()) {
                    uRLConnectionOpenConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                    throw new IOException("Invalid protocol.");
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                com.google.android.gms.ads.internal.zzt.zzq().zze(zzcmnVar.getContext(), zzcmnVar.zzp().zza, false, httpURLConnection, false, 60000);
                zzcgm zzcgmVar = new zzcgm(null);
                zzcgmVar.zzc(httpURLConnection, null);
                int responseCode = httpURLConnection.getResponseCode();
                zzcgmVar.zze(httpURLConnection, responseCode);
                if (responseCode < 300 || responseCode >= 400) {
                    com.google.android.gms.ads.internal.zzt.zzq();
                    WebResourceResponse webResourceResponseZzM = com.google.android.gms.ads.internal.util.zzs.zzM(httpURLConnection);
                    TrafficStats.clearThreadStatsTag();
                    return webResourceResponseZzM;
                }
                String headerField = httpURLConnection.getHeaderField("Location");
                if (headerField == null) {
                    throw new IOException("Missing Location header in redirect");
                }
                if (headerField.startsWith("tel:")) {
                    TrafficStats.clearThreadStatsTag();
                    return null;
                }
                URL url2 = new URL(url, headerField);
                String protocol = url2.getProtocol();
                if (protocol == null) {
                    zzcgn.zzj("Protocol is null");
                    WebResourceResponse webResourceResponseA = a();
                    TrafficStats.clearThreadStatsTag();
                    return webResourceResponseA;
                }
                if (!protocol.equals("http") && !protocol.equals("https")) {
                    zzcgn.zzj("Unsupported scheme: " + protocol);
                    WebResourceResponse webResourceResponseA2 = a();
                    TrafficStats.clearThreadStatsTag();
                    return webResourceResponseA2;
                }
                zzcgn.zze("Redirecting to " + headerField);
                httpURLConnection.disconnect();
                url = url2;
            }
        } catch (Throwable th) {
            TrafficStats.clearThreadStatsTag();
            throw th;
        }
    }

    public final void c(String str, Map map, List list) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                com.google.android.gms.ads.internal.util.zze.zza("  " + str2 + ": " + ((String) map.get(str2)));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zzbpq) it.next()).zza(this.w, map);
        }
    }

    public final void d(final View view, final zzcdo zzcdoVar, final int i) {
        if (!zzcdoVar.zzi() || i <= 0) {
            return;
        }
        zzcdoVar.zzg(view);
        if (zzcdoVar.zzi()) {
            com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmq
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.d(view, zzcdoVar, i - 1);
                }
            }, 100L);
        }
    }

    public final WebResourceResponse f(String str, Map map) {
        zzbdu zzbduVarZzb;
        try {
            if (((Boolean) zzbkp.zza.zze()).booleanValue() && this.R != null && "oda".equals(Uri.parse(str).getScheme())) {
                this.R.zzc(str, null);
                return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
            }
            String strZzc = zzceu.zzc(str, this.w.getContext(), this.V);
            if (!strZzc.equals(str)) {
                return b(strZzc, map);
            }
            zzbdx zzbdxVarZza = zzbdx.zza(Uri.parse(str));
            if (zzbdxVarZza != null && (zzbduVarZzb = com.google.android.gms.ads.internal.zzt.zzc().zzb(zzbdxVarZza)) != null && zzbduVarZzb.zze()) {
                return new WebResourceResponse("", "", zzbduVarZzb.zzc());
            }
            if (zzcgm.zzl() && ((Boolean) zzbkk.zzb.zze()).booleanValue()) {
                return b(str, map);
            }
            return null;
        } catch (Exception | NoClassDefFoundError e) {
            com.google.android.gms.ads.internal.zzt.zzp().zzt(e, "AdWebViewClient.interceptRequest");
            return a();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        com.google.android.gms.ads.internal.client.zza zzaVar = this.A;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        com.google.android.gms.ads.internal.util.zze.zza("Loading resource: ".concat(String.valueOf(str)));
        Uri uri = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uri.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            zzi(uri);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.z) {
            if (this.w.zzaB()) {
                com.google.android.gms.ads.internal.util.zze.zza("Blank page loaded, 1...");
                this.w.zzW();
                return;
            }
            this.S = true;
            zzcnz zzcnzVar = this.D;
            if (zzcnzVar != null) {
                zzcnzVar.zza();
                this.D = null;
            }
            zzg();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.I = true;
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.w.zzaA(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return f(str, Collections.emptyMap());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        com.google.android.gms.ads.internal.util.zze.zza("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri uriZza = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uriZza.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uriZza.getHost())) {
            zzi(uriZza);
        } else {
            boolean z = this.H;
            zzcmn zzcmnVar = this.w;
            if (z && webView == zzcmnVar.zzI()) {
                String scheme = uriZza.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    com.google.android.gms.ads.internal.client.zza zzaVar = this.A;
                    if (zzaVar != null) {
                        zzaVar.onAdClicked();
                        zzcdo zzcdoVar = this.Q;
                        if (zzcdoVar != null) {
                            zzcdoVar.zzh(str);
                        }
                        this.A = null;
                    }
                    zzdkl zzdklVar = this.G;
                    if (zzdklVar != null) {
                        zzdklVar.zzq();
                        this.G = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (zzcmnVar.zzI().willNotDraw()) {
                zzcgn.zzj("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            } else {
                try {
                    zzapb zzapbVarZzK = zzcmnVar.zzK();
                    if (zzapbVarZzK != null && zzapbVarZzK.zzf(uriZza)) {
                        uriZza = zzapbVarZzK.zza(uriZza, zzcmnVar.getContext(), (View) zzcmnVar, zzcmnVar.zzk());
                    }
                } catch (zzapc unused) {
                    zzcgn.zzj("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                com.google.android.gms.ads.internal.zzb zzbVar = this.O;
                if (zzbVar == null || zzbVar.zzc()) {
                    zzr(new com.google.android.gms.ads.internal.overlay.zzc("android.intent.action.VIEW", uriZza.toString(), null, null, null, null, null, null), true);
                } else {
                    this.O.zzb(str);
                }
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcoa
    public final void zzA(int i, int i2) {
        zzbxu zzbxuVar = this.P;
        if (zzbxuVar != null) {
            zzbxuVar.zzd(i, i2);
        }
    }

    public final void zzB(boolean z) {
        this.H = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcoa
    public final void zzC(boolean z) {
        synchronized (this.z) {
            this.L = z;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcoa
    public final void zzD() {
        synchronized (this.z) {
            this.H = false;
            this.J = true;
            zzcha.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmp
                @Override // java.lang.Runnable
                public final void run() {
                    zzcmn zzcmnVar = this.zza.w;
                    zzcmnVar.zzac();
                    com.google.android.gms.ads.internal.overlay.zzl zzlVarZzN = zzcmnVar.zzN();
                    if (zzlVarZzN != null) {
                        zzlVarZzN.zzx();
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcoa
    public final void zzE(boolean z) {
        synchronized (this.z) {
            this.K = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcoa
    public final void zzF(zzcnz zzcnzVar) {
        this.D = zzcnzVar;
    }

    public final void zzG(String str, zzbpq zzbpqVar) {
        synchronized (this.z) {
            List list = (List) this.y.get(str);
            if (list == null) {
                return;
            }
            list.remove(zzbpqVar);
        }
    }

    public final void zzH(String str, qa3 qa3Var) {
        synchronized (this.z) {
            List<zzbpq> list = (List) this.y.get(str);
            if (list == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (zzbpq zzbpqVar : list) {
                if (qa3Var.apply(zzbpqVar)) {
                    arrayList.add(zzbpqVar);
                }
            }
            list.removeAll(arrayList);
        }
    }

    public final boolean zzI() {
        boolean z;
        synchronized (this.z) {
            z = this.L;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzcoa
    public final boolean zzJ() {
        boolean z;
        synchronized (this.z) {
            z = this.J;
        }
        return z;
    }

    public final boolean zzK() {
        boolean z;
        synchronized (this.z) {
            z = this.K;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzcoa
    public final void zzL(com.google.android.gms.ads.internal.client.zza zzaVar, zzbol zzbolVar, com.google.android.gms.ads.internal.overlay.zzo zzoVar, zzbon zzbonVar, com.google.android.gms.ads.internal.overlay.zzz zzzVar, boolean z, zzbpt zzbptVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbyb zzbybVar, zzcdo zzcdoVar, final zzefz zzefzVar, final zzfju zzfjuVar, zzdxo zzdxoVar, zzfhz zzfhzVar, zzbpr zzbprVar, final zzdkl zzdklVar, zzbqh zzbqhVar) {
        zzcmn zzcmnVar = this.w;
        com.google.android.gms.ads.internal.zzb zzbVar2 = zzbVar == null ? new com.google.android.gms.ads.internal.zzb(zzcmnVar.getContext(), zzcdoVar, null) : zzbVar;
        this.P = new zzbxu(zzcmnVar, zzbybVar);
        this.Q = zzcdoVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzaL)).booleanValue()) {
            zzx("/adMetadata", new zzbok(zzbolVar));
        }
        if (zzbonVar != null) {
            zzx("/appEvent", new zzbom(zzbonVar));
        }
        zzx("/backButton", zzbpp.zzj);
        zzx("/refresh", zzbpp.zzk);
        zzx("/canOpenApp", zzbpp.zzb);
        zzx("/canOpenURLs", zzbpp.zza);
        zzx("/canOpenIntents", zzbpp.zzc);
        zzx("/close", zzbpp.zzd);
        zzx("/customClose", zzbpp.zze);
        zzx("/instrument", zzbpp.zzn);
        zzx("/delayPageLoaded", zzbpp.zzp);
        zzx("/delayPageClosed", zzbpp.zzq);
        zzx("/getLocationInfo", zzbpp.zzr);
        zzx("/log", zzbpp.zzg);
        zzx("/mraid", new zzbpx(zzbVar2, this.P, zzbybVar));
        zzbxz zzbxzVar = this.N;
        if (zzbxzVar != null) {
            zzx("/mraidLoaded", zzbxzVar);
        }
        com.google.android.gms.ads.internal.zzb zzbVar3 = zzbVar2;
        zzx("/open", new zzbqb(zzbVar2, this.P, zzefzVar, zzdxoVar, zzfhzVar));
        zzx("/precache", new zzcla());
        zzx("/touch", zzbpp.zzi);
        zzx("/video", zzbpp.zzl);
        zzx("/videoMeta", zzbpp.zzm);
        if (zzefzVar == null || zzfjuVar == null) {
            zzx("/click", zzbpp.zza(zzdklVar));
            zzx("/httpTrack", zzbpp.zzf);
        } else {
            zzx("/click", new zzbpq() { // from class: com.google.android.gms.internal.ads.zzfdu
                @Override // com.google.android.gms.internal.ads.zzbpq
                public final void zza(Object obj, Map map) {
                    zzdkl zzdklVar2 = zzdklVar;
                    zzfju zzfjuVar2 = zzfjuVar;
                    zzefz zzefzVar2 = zzefzVar;
                    zzcmn zzcmnVar2 = (zzcmn) obj;
                    zzbpp.zzd(map, zzdklVar2);
                    String str = (String) map.get("u");
                    if (str == null) {
                        zzcgn.zzj("URL missing from click GMSG.");
                    } else {
                        zzfyo.zzr(zzbpp.zzb(zzcmnVar2, str), new xi5(zzcmnVar2, zzfjuVar2, zzefzVar2, 4), zzcha.zza);
                    }
                }
            });
            zzx("/httpTrack", new zzbpq() { // from class: com.google.android.gms.internal.ads.zzfdt
                @Override // com.google.android.gms.internal.ads.zzbpq
                public final void zza(Object obj, Map map) {
                    zzfju zzfjuVar2 = zzfjuVar;
                    zzefz zzefzVar2 = zzefzVar;
                    zzcme zzcmeVar = (zzcme) obj;
                    String str = (String) map.get("u");
                    if (str == null) {
                        zzcgn.zzj("URL missing from httpTrack GMSG.");
                    } else if (zzcmeVar.zzF().zzak) {
                        zzefzVar2.zzd(new zzegb(com.google.android.gms.ads.internal.zzt.zzB().b(), ((zzcnk) zzcmeVar).zzR().zzb, str, 2));
                    } else {
                        zzfjuVar2.zzc(str, null);
                    }
                }
            });
        }
        if (com.google.android.gms.ads.internal.zzt.zzo().zzu(zzcmnVar.getContext())) {
            zzx("/logScionEvent", new zzbpw(zzcmnVar.getContext()));
        }
        if (zzbptVar != null) {
            zzx("/setInterstitialProperties", new zzbps(zzbptVar, null));
        }
        if (zzbprVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhz)).booleanValue()) {
                zzx("/inspectorNetworkExtras", zzbprVar);
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhS)).booleanValue() && zzbqhVar != null) {
            zzx("/shareSheet", zzbqhVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zziN)).booleanValue()) {
            zzx("/bindPlayStoreOverlay", zzbpp.zzu);
            zzx("/presentPlayStoreOverlay", zzbpp.zzv);
            zzx("/expandPlayStoreOverlay", zzbpp.zzw);
            zzx("/collapsePlayStoreOverlay", zzbpp.zzx);
            zzx("/closePlayStoreOverlay", zzbpp.zzy);
        }
        this.A = zzaVar;
        this.B = zzoVar;
        this.E = zzbolVar;
        this.F = zzbonVar;
        this.M = zzzVar;
        this.O = zzbVar3;
        this.G = zzdklVar;
        this.H = z;
        this.R = zzfjuVar;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener zza() {
        synchronized (this.z) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener zzb() {
        synchronized (this.z) {
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcoa
    public final com.google.android.gms.ads.internal.zzb zzd() {
        return this.O;
    }

    public final void zzg() {
        zzcny zzcnyVar = this.C;
        zzcmn zzcmnVar = this.w;
        if (zzcnyVar != null && ((this.S && this.U <= 0) || this.T || this.I)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbB)).booleanValue() && zzcmnVar.zzo() != null) {
                zzbjf.zza(zzcmnVar.zzo().zza(), zzcmnVar.zzn(), "awfllc");
            }
            zzcny zzcnyVar2 = this.C;
            boolean z = false;
            if (!this.T && !this.I) {
                z = true;
            }
            zzcnyVar2.zza(z);
            this.C = null;
        }
        zzcmnVar.zzae();
    }

    public final void zzh(boolean z) {
        this.V = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcoa
    public final void zzi(Uri uri) {
        String path = uri.getPath();
        List list = (List) this.y.get(path);
        if (path == null || list == null) {
            com.google.android.gms.ads.internal.util.zze.zza("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfM)).booleanValue() || com.google.android.gms.ads.internal.zzt.zzp().zzf() == null) {
                return;
            }
            final String strSubstring = (path == null || path.length() < 2) ? "null" : path.substring(1);
            zzcha.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmo
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    String str = strSubstring;
                    int i = zzcmu.zzb;
                    com.google.android.gms.ads.internal.zzt.zzp().zzf().zze(str);
                }
            });
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzeF)).booleanValue() && this.W.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzeH)).intValue()) {
                com.google.android.gms.ads.internal.util.zze.zza("Parsing gmsg query params on BG thread: ".concat(path));
                zzfyo.zzr(com.google.android.gms.ads.internal.zzt.zzq().zzb(uri), new pa6(this, list, path, uri), zzcha.zze);
                return;
            }
        }
        com.google.android.gms.ads.internal.zzt.zzq();
        c(path, com.google.android.gms.ads.internal.util.zzs.zzL(uri), list);
    }

    @Override // com.google.android.gms.internal.ads.zzcoa
    public final void zzj() {
        zzbel zzbelVar = this.x;
        if (zzbelVar != null) {
            zzbelVar.zzc(10005);
        }
        this.T = true;
        zzg();
        this.w.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzcoa
    public final void zzk() {
        synchronized (this.z) {
        }
        this.U++;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcoa
    public final void zzl() {
        this.U--;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcoa
    public final void zzo(int i, int i2, boolean z) {
        zzbxz zzbxzVar = this.N;
        if (zzbxzVar != null) {
            zzbxzVar.zzb(i, i2);
        }
        zzbxu zzbxuVar = this.P;
        if (zzbxuVar != null) {
            zzbxuVar.zzc(i, i2, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzcoa
    public final void zzp() {
        zzcdo zzcdoVar = this.Q;
        if (zzcdoVar != null) {
            zzcmn zzcmnVar = this.w;
            WebView webViewZzI = zzcmnVar.zzI();
            Field field = bi5.a;
            if (bi5.auxFixed.b(webViewZzI)) {
                d(webViewZzI, zzcdoVar, 10);
                return;
            }
            oa6 oa6Var = this.X;
            if (oa6Var != null) {
                ((View) zzcmnVar).removeOnAttachStateChangeListener(oa6Var);
            }
            oa6 oa6Var2 = new oa6(this, zzcdoVar);
            this.X = oa6Var2;
            ((View) zzcmnVar).addOnAttachStateChangeListener(oa6Var2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdkl
    public final void zzq() {
        zzdkl zzdklVar = this.G;
        if (zzdklVar != null) {
            zzdklVar.zzq();
        }
    }

    public final void zzr(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z) {
        zzcmn zzcmnVar = this.w;
        boolean zZzaC = zzcmnVar.zzaC();
        boolean zE = e(zZzaC, zzcmnVar);
        boolean z2 = true;
        if (!zE && z) {
            z2 = false;
        }
        zzu(new AdOverlayInfoParcel(zzcVar, zE ? null : this.A, zZzaC ? null : this.B, this.M, zzcmnVar.zzp(), this.w, z2 ? null : this.G));
    }

    public final void zzs(zzbr zzbrVar, zzefz zzefzVar, zzdxo zzdxoVar, zzfhz zzfhzVar, String str, String str2, int i) {
        zzcmn zzcmnVar = this.w;
        zzu(new AdOverlayInfoParcel(zzcmnVar, zzcmnVar.zzp(), zzbrVar, zzefzVar, zzdxoVar, zzfhzVar, str, str2, 14));
    }

    public final void zzt(boolean z, int i, boolean z2) {
        zzcmn zzcmnVar = this.w;
        boolean zE = e(zzcmnVar.zzaC(), zzcmnVar);
        boolean z3 = true;
        if (!zE && z2) {
            z3 = false;
        }
        zzu(new AdOverlayInfoParcel(zE ? null : this.A, this.B, this.M, zzcmnVar, z, i, zzcmnVar.zzp(), z3 ? null : this.G));
    }

    public final void zzu(AdOverlayInfoParcel adOverlayInfoParcel) {
        com.google.android.gms.ads.internal.overlay.zzc zzcVar;
        zzbxu zzbxuVar = this.P;
        boolean zZze = zzbxuVar != null ? zzbxuVar.zze() : false;
        com.google.android.gms.ads.internal.zzt.zzj();
        com.google.android.gms.ads.internal.overlay.zzm.zza(this.w.getContext(), adOverlayInfoParcel, !zZze);
        zzcdo zzcdoVar = this.Q;
        if (zzcdoVar != null) {
            String str = adOverlayInfoParcel.zzl;
            if (str == null && (zzcVar = adOverlayInfoParcel.zza) != null) {
                str = zzcVar.zzb;
            }
            zzcdoVar.zzh(str);
        }
    }

    public final void zzv(boolean z, int i, String str, boolean z2) {
        zzcmn zzcmnVar = this.w;
        boolean zZzaC = zzcmnVar.zzaC();
        boolean zE = e(zZzaC, zzcmnVar);
        boolean z3 = true;
        if (!zE && z2) {
            z3 = false;
        }
        zzu(new AdOverlayInfoParcel(zE ? null : this.A, zZzaC ? null : new qa6(zzcmnVar, this.B), this.E, this.F, this.M, zzcmnVar, z, i, str, zzcmnVar.zzp(), z3 ? null : this.G));
    }

    public final void zzw(boolean z, int i, String str, String str2, boolean z2) {
        zzcmn zzcmnVar = this.w;
        boolean zZzaC = zzcmnVar.zzaC();
        boolean zE = e(zZzaC, zzcmnVar);
        boolean z3 = true;
        if (!zE && z2) {
            z3 = false;
        }
        zzu(new AdOverlayInfoParcel(zE ? null : this.A, zZzaC ? null : new qa6(zzcmnVar, this.B), this.E, this.F, this.M, zzcmnVar, z, i, str, str2, zzcmnVar.zzp(), z3 ? null : this.G));
    }

    public final void zzx(String str, zzbpq zzbpqVar) {
        synchronized (this.z) {
            List copyOnWriteArrayList = (List) this.y.get(str);
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList();
                this.y.put(str, copyOnWriteArrayList);
            }
            copyOnWriteArrayList.add(zzbpqVar);
        }
    }

    public final void zzy() {
        zzcdo zzcdoVar = this.Q;
        if (zzcdoVar != null) {
            zzcdoVar.zze();
            this.Q = null;
        }
        oa6 oa6Var = this.X;
        if (oa6Var != null) {
            ((View) this.w).removeOnAttachStateChangeListener(oa6Var);
        }
        synchronized (this.z) {
            this.y.clear();
            this.A = null;
            this.B = null;
            this.C = null;
            this.D = null;
            this.E = null;
            this.F = null;
            this.H = false;
            this.J = false;
            this.K = false;
            this.M = null;
            this.O = null;
            this.N = null;
            zzbxu zzbxuVar = this.P;
            if (zzbxuVar != null) {
                zzbxuVar.zza(true);
                this.P = null;
            }
            this.R = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcoa
    public final void zzz(zzcny zzcnyVar) {
        this.C = zzcnyVar;
    }
}
