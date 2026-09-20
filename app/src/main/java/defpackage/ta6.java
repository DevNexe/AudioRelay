package defpackage;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.util.zzcb;
import com.google.android.gms.ads.internal.util.zzce;
import com.google.android.gms.ads.internal.util.zzci;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzapb;
import com.google.android.gms.internal.ads.zzbbl;
import com.google.android.gms.internal.ads.zzbcz;
import com.google.android.gms.internal.ads.zzbek;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzbjd;
import com.google.android.gms.internal.ads.zzbjf;
import com.google.android.gms.internal.ads.zzbjk;
import com.google.android.gms.internal.ads.zzbjl;
import com.google.android.gms.internal.ads.zzbjn;
import com.google.android.gms.internal.ads.zzbjx;
import com.google.android.gms.internal.ads.zzbll;
import com.google.android.gms.internal.ads.zzbln;
import com.google.android.gms.internal.ads.zzbpq;
import com.google.android.gms.internal.ads.zzbya;
import com.google.android.gms.internal.ads.zzcgg;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzcgt;
import com.google.android.gms.internal.ads.zzcil;
import com.google.android.gms.internal.ads.zzckz;
import com.google.android.gms.internal.ads.zzcmn;
import com.google.android.gms.internal.ads.zzcmu;
import com.google.android.gms.internal.ads.zzcnj;
import com.google.android.gms.internal.ads.zzcnm;
import com.google.android.gms.internal.ads.zzcnn;
import com.google.android.gms.internal.ads.zzcnt;
import com.google.android.gms.internal.ads.zzcoa;
import com.google.android.gms.internal.ads.zzcob;
import com.google.android.gms.internal.ads.zzcoc;
import com.google.android.gms.internal.ads.zzdsl;
import com.google.android.gms.internal.ads.zzdxo;
import com.google.android.gms.internal.ads.zzefz;
import com.google.android.gms.internal.ads.zzfcs;
import com.google.android.gms.internal.ads.zzfcv;
import com.google.android.gms.internal.ads.zzfhz;
import com.google.android.gms.internal.ads.zzfph;
import com.google.android.gms.internal.ads.zzfyo;
import com.google.android.gms.internal.ads.zzfyx;
import com.unity3d.ads.metadata.MediationMetaData;
import defpackage.ta6;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
@SuppressLint({"ViewConstructor"})
public final class ta6 extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, zzcmn {
    public static final /* synthetic */ int w0 = 0;
    public zzl A;
    public final zza B;
    public final DisplayMetrics C;
    public final float D;
    public zzfcs E;
    public zzfcv F;
    public boolean G;
    public boolean H;
    public zzcmu I;

    @GuardedBy("this")
    public com.google.android.gms.ads.internal.overlay.zzl J;

    @GuardedBy("this")
    public IObjectWrapper K;

    @GuardedBy("this")
    public zzcoc L;

    @GuardedBy("this")
    public final String M;

    @GuardedBy("this")
    public boolean N;

    @GuardedBy("this")
    public boolean O;

    @GuardedBy("this")
    public boolean P;

    @GuardedBy("this")
    public boolean Q;

    @GuardedBy("this")
    public Boolean R;

    @GuardedBy("this")
    public boolean S;

    @GuardedBy("this")
    public final String T;

    @GuardedBy("this")
    public zzcnj U;

    @GuardedBy("this")
    public boolean V;

    @GuardedBy("this")
    public boolean W;

    @GuardedBy("this")
    public zzbln a0;

    @GuardedBy("this")
    public zzbll b0;

    @GuardedBy("this")
    public zzbcz c0;

    @GuardedBy("this")
    public int d0;

    @GuardedBy("this")
    public int e0;
    public zzbjk f0;
    public final zzbjk g0;
    public zzbjk h0;
    public final zzbjl i0;
    public int j0;
    public int k0;
    public int l0;

    @GuardedBy("this")
    public com.google.android.gms.ads.internal.overlay.zzl m0;

    @GuardedBy("this")
    public boolean n0;
    public final zzci o0;
    public int p0;
    public int q0;
    public int r0;
    public int s0;
    public HashMap t0;
    public final WindowManager u0;
    public final zzbel v0;
    public final zzcob w;
    public final zzapb x;
    public final zzbjx y;
    public final zzcgt z;

    public ta6(zzcob zzcobVar, zzcoc zzcocVar, String str, boolean z, zzapb zzapbVar, zzbjx zzbjxVar, zzcgt zzcgtVar, zzl zzlVar, zza zzaVar, zzbel zzbelVar, zzfcs zzfcsVar, zzfcv zzfcvVar) {
        zzfcv zzfcvVar2;
        super(zzcobVar);
        this.G = false;
        this.H = false;
        this.S = true;
        this.T = "";
        this.p0 = -1;
        this.q0 = -1;
        this.r0 = -1;
        this.s0 = -1;
        this.w = zzcobVar;
        this.L = zzcocVar;
        this.M = str;
        this.P = z;
        this.x = zzapbVar;
        this.y = zzbjxVar;
        this.z = zzcgtVar;
        this.A = zzlVar;
        this.B = zzaVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.u0 = windowManager;
        zzt.zzq();
        DisplayMetrics displayMetricsZzr = zzs.zzr(windowManager);
        this.C = displayMetricsZzr;
        this.D = displayMetricsZzr.density;
        this.v0 = zzbelVar;
        this.E = zzfcsVar;
        this.F = zzfcvVar;
        this.o0 = new zzci(zzcobVar.zza(), this, this, null);
        setBackgroundColor(0);
        final WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            zzcgn.zzh("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setMixedContentMode(2);
        settings.setUserAgentString(zzt.zzq().zzc(zzcobVar, zzcgtVar.zza));
        zzt.zzq();
        final Context context = getContext();
        zzcb.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                WebSettings webSettings = settings;
                Context context2 = context;
                zzfph zzfphVar = zzs.zza;
                webSettings.setDatabasePath(context2.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
                webSettings.setDatabaseEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setDisplayZoomControls(false);
                webSettings.setBuiltInZoomControls(true);
                webSettings.setSupportZoom(true);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzaE)).booleanValue()) {
                    webSettings.setTextZoom(100);
                }
                webSettings.setAllowContentAccess(false);
                return Boolean.TRUE;
            }
        });
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        d();
        addJavascriptInterface(new zzcnn(this, new zzcnm(this), null), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        zzbjl zzbjlVar = this.i0;
        if (zzbjlVar != null) {
            zzbjn zzbjnVarZza = zzbjlVar.zza();
            zzbjd zzbjdVarZzf = zzt.zzp().zzf();
            if (zzbjdVarZzf != null) {
                zzbjdVarZzf.zzf(zzbjnVarZza);
            }
        }
        zzbjl zzbjlVar2 = new zzbjl(new zzbjn(true, "make_wv", this.M));
        this.i0 = zzbjlVar2;
        zzbjlVar2.zza().zzc(null);
        if (((Boolean) zzay.zzc().zzb(zzbiy.zzbB)).booleanValue() && (zzfcvVar2 = this.F) != null && zzfcvVar2.zzb != null) {
            zzbjlVar2.zza().zzd("gqi", this.F.zzb);
        }
        zzbjlVar2.zza();
        zzbjk zzbjkVarZzf = zzbjn.zzf();
        this.g0 = zzbjkVarZzf;
        zzbjlVar2.zzb("native:view_create", zzbjkVarZzf);
        this.h0 = null;
        this.f0 = null;
        zzce.zza().zzb(zzcobVar);
        zzt.zzp().zzq();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x004b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0052 A[Catch: all -> 0x005e, TRY_LEAVE, TryCatch #6 {, blocks: (B:40:0x004c, B:42:0x0052, B:45:0x0057), top: B:80:0x004c }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0057 A[Catch: all -> 0x005e, TRY_ENTER, TRY_LEAVE, TryCatch #6 {, blocks: (B:40:0x004c, B:42:0x0052, B:45:0x0057), top: B:80:0x004c }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0061  */
    /* JADX WARN: Code duplicated, block: B:55:0x006e A[Catch: all -> 0x007a, TRY_LEAVE, TryCatch #3 {, blocks: (B:53:0x0068, B:55:0x006e, B:58:0x0073), top: B:76:0x0068 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0073 A[Catch: all -> 0x007a, TRY_ENTER, TRY_LEAVE, TryCatch #3 {, blocks: (B:53:0x0068, B:55:0x006e, B:58:0x0073), top: B:76:0x0068 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0068 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x004c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final void b(String str) {
        Boolean bool;
        Boolean bool2;
        String strConcat;
        synchronized (this) {
            bool = this.R;
        }
        if (bool == null) {
            synchronized (this) {
                Boolean boolZzk = zzt.zzp().zzk();
                this.R = boolZzk;
                if (boolZzk == null) {
                    try {
                        evaluateJavascript("(function(){})()", null);
                        Boolean bool3 = Boolean.TRUE;
                        synchronized (this) {
                            this.R = bool3;
                            zzt.zzp().zzu(bool3);
                        }
                    } catch (IllegalStateException unused) {
                        Boolean bool4 = Boolean.FALSE;
                        synchronized (this) {
                            this.R = bool4;
                            zzt.zzp().zzu(bool4);
                            synchronized (this) {
                                bool2 = this.R;
                                if (bool2.booleanValue()) {
                                    synchronized (this) {
                                        if (zzaB()) {
                                            zzcgn.zzj("#004 The webview is destroyed. Ignoring action.");
                                            return;
                                        } else {
                                            evaluateJavascript(str, null);
                                            return;
                                        }
                                    }
                                }
                                strConcat = "javascript:".concat(str);
                                synchronized (this) {
                                    if (zzaB()) {
                                        zzcgn.zzj("#004 The webview is destroyed. Ignoring action.");
                                    } else {
                                        loadUrl(strConcat);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (bool2.booleanValue()) {
                synchronized (this) {
                    if (zzaB()) {
                        evaluateJavascript(str, null);
                        return;
                    } else {
                        zzcgn.zzj("#004 The webview is destroyed. Ignoring action.");
                        return;
                    }
                }
            }
            strConcat = "javascript:".concat(str);
            synchronized (this) {
                if (zzaB()) {
                    loadUrl(strConcat);
                } else {
                    zzcgn.zzj("#004 The webview is destroyed. Ignoring action.");
                }
            }
        }
        synchronized (this) {
            bool2 = this.R;
            if (bool2.booleanValue()) {
                synchronized (this) {
                    if (zzaB()) {
                        evaluateJavascript(str, null);
                        return;
                    } else {
                        zzcgn.zzj("#004 The webview is destroyed. Ignoring action.");
                        return;
                    }
                }
            }
            strConcat = "javascript:".concat(str);
            synchronized (this) {
                if (zzaB()) {
                    loadUrl(strConcat);
                } else {
                    zzcgn.zzj("#004 The webview is destroyed. Ignoring action.");
                }
            }
        }
    }

    public final boolean c() {
        int iZzu;
        int iZzu2;
        if (!this.I.zzJ() && !this.I.zzK()) {
            return false;
        }
        zzaw.zzb();
        DisplayMetrics displayMetrics = this.C;
        int iZzu3 = zzcgg.zzu(displayMetrics, displayMetrics.widthPixels);
        zzaw.zzb();
        int iZzu4 = zzcgg.zzu(displayMetrics, displayMetrics.heightPixels);
        Activity activityZza = this.w.zza();
        if (activityZza == null || activityZza.getWindow() == null) {
            iZzu = iZzu3;
            iZzu2 = iZzu4;
        } else {
            zzt.zzq();
            int[] iArrZzN = zzs.zzN(activityZza);
            zzaw.zzb();
            iZzu = zzcgg.zzu(displayMetrics, iArrZzN[0]);
            zzaw.zzb();
            iZzu2 = zzcgg.zzu(displayMetrics, iArrZzN[1]);
        }
        int i = this.q0;
        if (i == iZzu3 && this.p0 == iZzu4 && this.r0 == iZzu && this.s0 == iZzu2) {
            return false;
        }
        boolean z = (i == iZzu3 && this.p0 == iZzu4) ? false : true;
        this.q0 = iZzu3;
        this.p0 = iZzu4;
        this.r0 = iZzu;
        this.s0 = iZzu2;
        new zzbya(this, "").zzi(iZzu3, iZzu4, iZzu, iZzu2, displayMetrics.density, this.u0.getDefaultDisplay().getRotation());
        return z;
    }

    public final synchronized void d() {
        zzfcs zzfcsVar = this.E;
        if (zzfcsVar != null && zzfcsVar.zzao) {
            zzcgn.zze("Disabling hardware acceleration on an overlay.");
            synchronized (this) {
                if (!this.Q) {
                    setLayerType(1, null);
                }
                this.Q = true;
            }
            return;
        }
        if (this.P || this.L.zzi()) {
            zzcgn.zze("Enabling hardware acceleration on an overlay.");
            synchronized (this) {
                if (this.Q) {
                    setLayerType(0, null);
                }
                this.Q = false;
            }
            return;
        }
        zzcgn.zze("Enabling hardware acceleration on an AdView.");
        synchronized (this) {
            if (this.Q) {
                setLayerType(0, null);
            }
            this.Q = false;
        }
        return;
        throw th;
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcmn
    public final synchronized void destroy() {
        zzbjl zzbjlVar = this.i0;
        if (zzbjlVar != null) {
            zzbjn zzbjnVarZza = zzbjlVar.zza();
            zzbjd zzbjdVarZzf = zzt.zzp().zzf();
            if (zzbjdVarZzf != null) {
                zzbjdVarZzf.zzf(zzbjnVarZza);
            }
        }
        this.o0.zza();
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.J;
        if (zzlVar != null) {
            zzlVar.zzb();
            this.J.zzl();
            this.J = null;
        }
        this.K = null;
        this.I.zzy();
        this.c0 = null;
        this.A = null;
        setOnClickListener(null);
        setOnTouchListener(null);
        if (this.O) {
            return;
        }
        zzt.zzz().zzd(this);
        f();
        this.O = true;
        if (!((Boolean) zzay.zzc().zzb(zzbiy.zzir)).booleanValue()) {
            zze.zza("Destroying the WebView immediately...");
            zzW();
            return;
        }
        zze.zza("Initiating WebView self destruct sequence in 3...");
        zze.zza("Loading blank page in WebView, 2...");
        synchronized (this) {
            try {
                super.loadUrl("about:blank");
            } catch (Throwable th) {
                zzt.zzp().zzt(th, "AdWebViewImpl.loadUrlUnsafe");
                zzcgn.zzk("Could not call loadUrl in destroy(). ", th);
            }
        }
    }

    public final void e(boolean z) {
        HashMap map = new HashMap();
        map.put("isVisible", true != z ? "0" : "1");
        zzd("onAdVisibilityChanged", map);
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(String str, ValueCallback valueCallback) {
        if (!zzaB()) {
            super.evaluateJavascript(str, valueCallback);
            return;
        }
        zzcgn.zzl("#004 The webview is destroyed. Ignoring action.", null);
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
        }
    }

    public final synchronized void f() {
        HashMap map = this.t0;
        if (map != null) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((zzckz) it.next()).release();
            }
        }
        this.t0 = null;
    }

    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                try {
                    if (!this.O) {
                        this.I.zzy();
                        zzt.zzz().zzd(this);
                        f();
                        synchronized (this) {
                            if (!this.n0) {
                                this.n0 = true;
                                zzt.zzp().zzp();
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            super.finalize();
        } catch (Throwable th2) {
            super.finalize();
            throw th2;
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcmn
    public final synchronized void loadData(String str, String str2, String str3) {
        if (zzaB()) {
            zzcgn.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadData(str, str2, str3);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcmn
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (zzaB()) {
            zzcgn.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcmn
    public final synchronized void loadUrl(String str) {
        if (zzaB()) {
            zzcgn.zzj("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            super.loadUrl(str);
        } catch (Throwable th) {
            zzt.zzp().zzt(th, "AdWebViewImpl.loadUrl");
            zzcgn.zzk("Could not call loadUrl. ", th);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzcmu zzcmuVar = this.I;
        if (zzcmuVar != null) {
            zzcmuVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!zzaB()) {
            this.o0.zzc();
        }
        boolean z = this.V;
        zzcmu zzcmuVar = this.I;
        if (zzcmuVar != null && zzcmuVar.zzK()) {
            if (!this.W) {
                this.I.zza();
                this.I.zzb();
                this.W = true;
            }
            c();
            z = true;
        }
        e(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        zzcmu zzcmuVar;
        synchronized (this) {
            if (!zzaB()) {
                this.o0.zzd();
            }
            super.onDetachedFromWindow();
            if (this.W && (zzcmuVar = this.I) != null && zzcmuVar.zzK() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.I.zza();
                this.I.zzb();
                this.W = false;
            }
        }
        e(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            zzt.zzq();
            zzs.zzJ(getContext(), intent);
        } catch (ActivityNotFoundException unused) {
            zzcgn.zze("Couldn't find an Activity to view url/mimetype: " + str + " / " + str4);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    @TargetApi(21)
    public final void onDraw(Canvas canvas) {
        if (zzaB()) {
            return;
        }
        if (Build.VERSION.SDK_INT == 21 && canvas.isHardwareAccelerated() && !isAttachedToWindow()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean zC = c();
        com.google.android.gms.ads.internal.overlay.zzl zzlVarZzN = zzN();
        if (zzlVarZzN == null || !zC) {
            return;
        }
        zzlVarZzN.zzm();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x0084 A[Catch: all -> 0x01de, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:9:0x000f, B:11:0x0015, B:13:0x0019, B:16:0x0023, B:18:0x002b, B:21:0x0030, B:23:0x0038, B:25:0x004a, B:28:0x004f, B:30:0x0056, B:34:0x0060, B:37:0x0065, B:40:0x0078, B:46:0x008a, B:44:0x0084, B:49:0x0097, B:51:0x009f, B:53:0x00b1, B:56:0x00b6, B:58:0x00d2, B:60:0x00db, B:59:0x00d7, B:63:0x00e0, B:65:0x00e8, B:68:0x00f3, B:77:0x0119, B:79:0x0120, B:84:0x0128, B:86:0x013a, B:88:0x0148, B:92:0x0155, B:95:0x015a, B:97:0x01a0, B:98:0x01a4, B:100:0x01ab, B:105:0x01b8, B:107:0x01be, B:108:0x01c1, B:110:0x01c5, B:111:0x01ce, B:114:0x01d9), top: B:120:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0089  */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    @SuppressLint({"DrawAllocation"})
    public final synchronized void onMeasure(int i, int i2) {
        int i3 = 0;
        if (zzaB()) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (!isInEditMode() && !this.P && !this.L.zzf()) {
            if (this.L.zzh()) {
                super.onMeasure(i, i2);
                return;
            }
            if (this.L.zzj()) {
                if (((Boolean) zzay.zzc().zzb(zzbiy.zzcU)).booleanValue()) {
                    super.onMeasure(i, i2);
                    return;
                }
                zzcnj zzcnjVarZzs = zzs();
                float fZze = zzcnjVarZzs != null ? zzcnjVarZzs.zze() : 0.0f;
                if (fZze == 0.0f) {
                    super.onMeasure(i, i2);
                    return;
                }
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                int i4 = (int) (size2 * fZze);
                int i5 = (int) (size / fZze);
                if (size2 != 0) {
                    if (size == 0) {
                        i3 = size;
                    } else if (i4 != 0) {
                        i5 = (int) (i4 / fZze);
                        i3 = i4;
                    }
                } else if (i5 != 0) {
                    i4 = (int) (i5 * fZze);
                    i3 = size;
                    size2 = i5;
                } else {
                    size2 = 0;
                    if (size == 0) {
                        i3 = size;
                    } else if (i4 != 0) {
                        i5 = (int) (i4 / fZze);
                        i3 = i4;
                    }
                }
                setMeasuredDimension(Math.min(i4, i3), Math.min(i5, size2));
                return;
            }
            if (this.L.zzg()) {
                if (((Boolean) zzay.zzc().zzb(zzbiy.zzda)).booleanValue()) {
                    super.onMeasure(i, i2);
                    return;
                }
                zzaf("/contentHeight", new sa6(this));
                b("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
                float f = this.C.density;
                int size3 = View.MeasureSpec.getSize(i);
                int i6 = this.e0;
                setMeasuredDimension(size3, i6 != -1 ? (int) (i6 * f) : View.MeasureSpec.getSize(i2));
                return;
            }
            if (this.L.zzi()) {
                DisplayMetrics displayMetrics = this.C;
                setMeasuredDimension(displayMetrics.widthPixels, displayMetrics.heightPixels);
                return;
            }
            int mode = View.MeasureSpec.getMode(i);
            int size4 = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size5 = View.MeasureSpec.getSize(i2);
            int i7 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size4 : Integer.MAX_VALUE;
            int i8 = (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) ? size5 : Integer.MAX_VALUE;
            zzcoc zzcocVar = this.L;
            boolean z = zzcocVar.zzb > i7 || zzcocVar.zza > i8;
            if (((Boolean) zzay.zzc().zzb(zzbiy.zzew)).booleanValue()) {
                zzcoc zzcocVar2 = this.L;
                int i9 = zzcocVar2.zzb;
                float f2 = this.D;
                z &= ((float) i9) / f2 <= ((float) i7) / f2 && ((float) zzcocVar2.zza) / f2 <= ((float) i8) / f2;
            }
            if (!z) {
                if (getVisibility() != 8) {
                    setVisibility(0);
                }
                if (!this.H) {
                    this.v0.zzc(10002);
                    this.H = true;
                }
                zzcoc zzcocVar3 = this.L;
                setMeasuredDimension(zzcocVar3.zzb, zzcocVar3.zza);
                return;
            }
            zzcoc zzcocVar4 = this.L;
            int i10 = zzcocVar4.zzb;
            float f3 = this.D;
            zzcgn.zzj("Not enough space to show ad. Needs " + ((int) (i10 / f3)) + "x" + ((int) (zzcocVar4.zza / f3)) + " dp, but only has " + ((int) (size4 / f3)) + "x" + ((int) (size5 / f3)) + " dp.");
            if (getVisibility() != 8) {
                setVisibility(4);
            }
            setMeasuredDimension(0, 0);
            if (this.G) {
                return;
            }
            this.v0.zzc(10001);
            this.G = true;
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcmn
    public final void onPause() {
        if (zzaB()) {
            return;
        }
        try {
            super.onPause();
        } catch (Exception e) {
            zzcgn.zzh("Could not pause webview.", e);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcmn
    public final void onResume() {
        if (zzaB()) {
            return;
        }
        try {
            super.onResume();
        } catch (Exception e) {
            zzcgn.zzh("Could not resume webview.", e);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.I.zzK() || this.I.zzI()) {
            zzapb zzapbVar = this.x;
            if (zzapbVar != null) {
                zzapbVar.zzd(motionEvent);
            }
            zzbjx zzbjxVar = this.y;
            if (zzbjxVar != null) {
                zzbjxVar.zzb(motionEvent);
            }
        } else {
            synchronized (this) {
                zzbln zzblnVar = this.a0;
                if (zzblnVar != null) {
                    zzblnVar.zzd(motionEvent);
                }
            }
        }
        if (zzaB()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcmn
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzcmu) {
            this.I = (zzcmu) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (zzaB()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e) {
            zzcgn.zzh("Could not stop loading webview.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    public final void zzA(int i) {
        this.k0 = i;
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    public final void zzB(boolean z) {
        this.I.zzB(false);
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    public final synchronized void zzC(int i) {
        this.j0 = i;
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    public final void zzD(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcmn, com.google.android.gms.internal.ads.zzciw
    public final synchronized void zzE(zzcnj zzcnjVar) {
        if (this.U != null) {
            zzcgn.zzg("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.U = zzcnjVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmn, com.google.android.gms.internal.ads.zzcme
    public final zzfcs zzF() {
        return this.E;
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final Context zzG() {
        return this.w.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcmn, com.google.android.gms.internal.ads.zzcnx
    public final View zzH() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final WebView zzI() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final WebViewClient zzJ() {
        return this.I;
    }

    @Override // com.google.android.gms.internal.ads.zzcmn, com.google.android.gms.internal.ads.zzcnv
    public final zzapb zzK() {
        return this.x;
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final synchronized zzbcz zzL() {
        return this.c0;
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final synchronized zzbln zzM() {
        return this.a0;
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final synchronized com.google.android.gms.ads.internal.overlay.zzl zzN() {
        return this.J;
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final synchronized com.google.android.gms.ads.internal.overlay.zzl zzO() {
        return this.m0;
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final /* synthetic */ zzcoa zzP() {
        return this.I;
    }

    @Override // com.google.android.gms.internal.ads.zzcmn, com.google.android.gms.internal.ads.zzcnu
    public final synchronized zzcoc zzQ() {
        return this.L;
    }

    @Override // com.google.android.gms.internal.ads.zzcmn, com.google.android.gms.internal.ads.zzcnk
    public final zzfcv zzR() {
        return this.F;
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final synchronized IObjectWrapper zzS() {
        return this.K;
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final zzfyx zzT() {
        zzbjx zzbjxVar = this.y;
        return zzbjxVar == null ? zzfyo.zzi(null) : zzbjxVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final synchronized String zzU() {
        return this.M;
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void zzV(zzfcs zzfcsVar, zzfcv zzfcvVar) {
        this.E = zzfcsVar;
        this.F = zzfcvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final synchronized void zzW() {
        zze.zza("Destroying WebView!");
        synchronized (this) {
            if (!this.n0) {
                this.n0 = true;
                zzt.zzp().zzp();
            }
        }
        zzs.zza.post(new cz5(this, 6));
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void zzX() {
        zzbjf.zza(this.i0.zza(), this.g0, "aeh2");
        HashMap map = new HashMap(1);
        map.put(MediationMetaData.KEY_VERSION, this.z.zza);
        zzd("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void zzY(int i) {
        zzbjk zzbjkVar = this.g0;
        zzbjl zzbjlVar = this.i0;
        if (i == 0) {
            zzbjf.zza(zzbjlVar.zza(), zzbjkVar, "aebb2");
        }
        zzbjf.zza(zzbjlVar.zza(), zzbjkVar, "aeh2");
        zzbjlVar.zza();
        zzbjlVar.zza().zzd("close_type", String.valueOf(i));
        HashMap map = new HashMap(2);
        map.put("closetype", String.valueOf(i));
        map.put(MediationMetaData.KEY_VERSION, this.z.zza);
        zzd("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void zzZ() {
        if (this.f0 == null) {
            zzbjl zzbjlVar = this.i0;
            zzbjf.zza(zzbjlVar.zza(), this.g0, "aes2");
            zzbjlVar.zza();
            zzbjk zzbjkVarZzf = zzbjn.zzf();
            this.f0 = zzbjkVarZzf;
            zzbjlVar.zzb("native:view_show", zzbjkVarZzf);
        }
        HashMap map = new HashMap(1);
        map.put(MediationMetaData.KEY_VERSION, this.z.zza);
        zzd("onshow", map);
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final void zza(String str) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final boolean zzaA(final boolean z, final int i) {
        destroy();
        zzbek zzbekVar = new zzbek() { // from class: com.google.android.gms.internal.ads.zzcnd
            @Override // com.google.android.gms.internal.ads.zzbek
            public final void zza(zzbga zzbgaVar) {
                boolean z2 = z;
                int i2 = i;
                int i3 = ta6.w0;
                zzbif zzbifVarZza = zzbig.zza();
                if (zzbifVarZza.zzc() != z2) {
                    zzbifVarZza.zza(z2);
                }
                zzbifVarZza.zzb(i2);
                zzbgaVar.zzj((zzbig) zzbifVarZza.zzal());
            }
        };
        zzbel zzbelVar = this.v0;
        zzbelVar.zzb(zzbekVar);
        zzbelVar.zzc(10003);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final synchronized boolean zzaB() {
        return this.O;
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final synchronized boolean zzaC() {
        return this.P;
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final boolean zzaD() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final synchronized boolean zzaE() {
        return this.S;
    }

    @Override // com.google.android.gms.internal.ads.zzcns
    public final void zzaF(zzc zzcVar, boolean z) {
        this.I.zzr(zzcVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzcns
    public final void zzaG(zzbr zzbrVar, zzefz zzefzVar, zzdxo zzdxoVar, zzfhz zzfhzVar, String str, String str2, int i) {
        this.I.zzs(zzbrVar, zzefzVar, zzdxoVar, zzfhzVar, str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.zzcns
    public final void zzaH(boolean z, int i, boolean z2) {
        this.I.zzt(z, i, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcns
    public final void zzaI(boolean z, int i, String str, boolean z2) {
        this.I.zzv(z, i, str, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcns
    public final void zzaJ(boolean z, int i, String str, String str2, boolean z2) {
        this.I.zzw(z, i, str, str2, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void zzaa() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void zzab(boolean z) {
        this.I.zzh(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void zzac() {
        this.o0.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final synchronized void zzad(String str, String str2, String str3) {
        String str4;
        if (zzaB()) {
            zzcgn.zzj("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        String[] strArr = new String[1];
        String str5 = (String) zzay.zzc().zzb(zzbiy.zzN);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(MediationMetaData.KEY_VERSION, str5);
            jSONObject.put("sdk", "Google Mobile Ads");
            jSONObject.put("sdkVersion", "12.4.51-000");
            str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
        } catch (JSONException e) {
            zzcgn.zzk("Unable to build MRAID_ENV", e);
            str4 = null;
        }
        strArr[0] = str4;
        super.loadDataWithBaseURL(str, zzcnt.zza(str2, strArr), "text/html", "UTF-8", null);
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void zzae() {
        if (this.h0 == null) {
            zzbjl zzbjlVar = this.i0;
            zzbjlVar.zza();
            zzbjk zzbjkVarZzf = zzbjn.zzf();
            this.h0 = zzbjkVarZzf;
            zzbjlVar.zzb("native:view_load", zzbjkVarZzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void zzaf(String str, zzbpq zzbpqVar) {
        zzcmu zzcmuVar = this.I;
        if (zzcmuVar != null) {
            zzcmuVar.zzx(str, zzbpqVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void zzag() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final synchronized void zzah(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.J = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final synchronized void zzai(zzcoc zzcocVar) {
        this.L = zzcocVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final synchronized void zzaj(zzbcz zzbczVar) {
        this.c0 = zzbczVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final synchronized void zzak(boolean z) {
        this.S = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void zzal() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void zzam(Context context) {
        zzcob zzcobVar = this.w;
        zzcobVar.setBaseContext(context);
        this.o0.zze(zzcobVar.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final synchronized void zzan(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.J;
        if (zzlVar != null) {
            zzlVar.zzw(this.I.zzJ(), z);
        } else {
            this.N = z;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final synchronized void zzao(zzbll zzbllVar) {
        this.b0 = zzbllVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final synchronized void zzap(boolean z) {
        boolean z2 = this.P;
        this.P = z;
        d();
        if (z != z2) {
            if (!((Boolean) zzay.zzc().zzb(zzbiy.zzO)).booleanValue() || !this.L.zzi()) {
                new zzbya(this, "").zzk(true != z ? "default" : "expanded");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final synchronized void zzaq(zzbln zzblnVar) {
        this.a0 = zzblnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final synchronized void zzar(IObjectWrapper iObjectWrapper) {
        this.K = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final synchronized void zzas(int i) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.J;
        if (zzlVar != null) {
            zzlVar.zzy(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final synchronized void zzat(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.m0 = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final synchronized void zzau(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar;
        int i = this.d0 + (true != z ? -1 : 1);
        this.d0 = i;
        if (i > 0 || (zzlVar = this.J) == null) {
            return;
        }
        zzlVar.zzC();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:8:0x000b A[Catch: all -> 0x0012, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0004, B:6:0x0007, B:8:0x000b), top: B:16:0x0004 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:11:0x0010, please report this as an issue */
    @Override // com.google.android.gms.internal.ads.zzcmn
    public final synchronized void zzav(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar;
        if (!z) {
            zzlVar = this.J;
            if (zzlVar != null) {
                zzlVar.zzz(z);
                return;
            }
            return;
        }
        setBackgroundColor(0);
        zzlVar = this.J;
        if (zzlVar != null) {
            zzlVar.zzz(z);
            return;
        }
        return;
        throw th;
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void zzaw(String str, zzbpq zzbpqVar) {
        zzcmu zzcmuVar = this.I;
        if (zzcmuVar != null) {
            zzcmuVar.zzG(str, zzbpqVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void zzax(String str, qa3 qa3Var) {
        zzcmu zzcmuVar = this.I;
        if (zzcmuVar != null) {
            zzcmuVar.zzH(str, qa3Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final synchronized boolean zzay() {
        return this.N;
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final synchronized boolean zzaz() {
        return this.d0 > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final void zzb(String str, String str2) {
        b(str + "(" + str2 + ");");
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final synchronized void zzbn() {
        zzl zzlVar = this.A;
        if (zzlVar != null) {
            zzlVar.zzbn();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final synchronized void zzbo() {
        zzl zzlVar = this.A;
        if (zzlVar != null) {
            zzlVar.zzbo();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    public final zzcil zzbp() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbbm
    public final void zzc(zzbbl zzbblVar) {
        boolean z;
        synchronized (this) {
            z = zzbblVar.zzj;
            this.V = z;
        }
        e(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbsi
    public final void zzd(String str, Map map) {
        try {
            zze(str, zzaw.zzb().zzi(map));
        } catch (JSONException unused) {
            zzcgn.zzj("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsi
    public final void zze(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String string = jSONObject.toString();
        StringBuilder sb = new StringBuilder("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(string);
        sb.append(");");
        zzcgn.zze("Dispatching AFMA event: ".concat(sb.toString()));
        b(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    public final int zzf() {
        return this.l0;
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    public final int zzg() {
        return this.k0;
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    public final synchronized int zzh() {
        return this.j0;
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    public final int zzi() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    public final int zzj() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzcmn, com.google.android.gms.internal.ads.zzcno, com.google.android.gms.internal.ads.zzciw
    public final Activity zzk() {
        return this.w.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final void zzl(String str, JSONObject jSONObject) {
        zzb(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcmn, com.google.android.gms.internal.ads.zzciw
    public final zza zzm() {
        return this.B;
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    public final zzbjk zzn() {
        return this.g0;
    }

    @Override // com.google.android.gms.internal.ads.zzcmn, com.google.android.gms.internal.ads.zzciw
    public final zzbjl zzo() {
        return this.i0;
    }

    @Override // com.google.android.gms.internal.ads.zzcmn, com.google.android.gms.internal.ads.zzcnw, com.google.android.gms.internal.ads.zzciw
    public final zzcgt zzp() {
        return this.z;
    }

    @Override // com.google.android.gms.internal.ads.zzdkl
    public final void zzq() {
        zzcmu zzcmuVar = this.I;
        if (zzcmuVar != null) {
            zzcmuVar.zzq();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    public final synchronized zzckz zzr(String str) {
        HashMap map = this.t0;
        if (map == null) {
            return null;
        }
        return (zzckz) map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcmn, com.google.android.gms.internal.ads.zzciw
    public final synchronized zzcnj zzs() {
        return this.U;
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    public final synchronized String zzt() {
        zzfcv zzfcvVar = this.F;
        if (zzfcvVar == null) {
            return null;
        }
        return zzfcvVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    public final synchronized String zzu() {
        return this.T;
    }

    @Override // com.google.android.gms.internal.ads.zzcmn, com.google.android.gms.internal.ads.zzciw
    public final synchronized void zzv(String str, zzckz zzckzVar) {
        if (this.t0 == null) {
            this.t0 = new HashMap();
        }
        this.t0.put(str, zzckzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    public final void zzw() {
        com.google.android.gms.ads.internal.overlay.zzl zzlVarZzN = zzN();
        if (zzlVarZzN != null) {
            zzlVarZzN.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    public final void zzx(boolean z, long j) {
        HashMap map = new HashMap(2);
        map.put("success", true != z ? "0" : "1");
        map.put("duration", Long.toString(j));
        zzd("onCacheAccessComplete", map);
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    public final synchronized void zzy() {
        zzbll zzbllVar = this.b0;
        if (zzbllVar != null) {
            final zzdsl zzdslVar = (zzdsl) zzbllVar;
            zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsj
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        zzdslVar.zzd();
                    } catch (RemoteException e) {
                        zzcgn.zzl("#007 Could not call remote method.", e);
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    public final void zzz(int i) {
        this.l0 = i;
    }
}
