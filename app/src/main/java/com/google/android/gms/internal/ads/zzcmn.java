package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.qa3;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
public interface zzcmn extends com.google.android.gms.ads.internal.client.zza, zzdkl, zzcme, zzbsi, zzcnk, zzcno, zzbsv, zzbbm, zzcns, com.google.android.gms.ads.internal.zzl, zzcnv, zzcnw, zzciw, zzcnx {
    boolean canGoBack();

    void destroy();

    @Override // com.google.android.gms.internal.ads.zzcno, com.google.android.gms.internal.ads.zzciw
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void measure(int i, int i2);

    void onPause();

    void onResume();

    @Override // com.google.android.gms.internal.ads.zzciw
    void setBackgroundColor(int i);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    @Override // com.google.android.gms.internal.ads.zzciw
    void zzE(zzcnj zzcnjVar);

    @Override // com.google.android.gms.internal.ads.zzcme
    zzfcs zzF();

    Context zzG();

    @Override // com.google.android.gms.internal.ads.zzcnx
    View zzH();

    WebView zzI();

    WebViewClient zzJ();

    @Override // com.google.android.gms.internal.ads.zzcnv
    zzapb zzK();

    zzbcz zzL();

    zzbln zzM();

    com.google.android.gms.ads.internal.overlay.zzl zzN();

    com.google.android.gms.ads.internal.overlay.zzl zzO();

    zzcoa zzP();

    @Override // com.google.android.gms.internal.ads.zzcnu
    zzcoc zzQ();

    @Override // com.google.android.gms.internal.ads.zzcnk
    zzfcv zzR();

    IObjectWrapper zzS();

    zzfyx zzT();

    String zzU();

    void zzV(zzfcs zzfcsVar, zzfcv zzfcvVar);

    void zzW();

    void zzX();

    void zzY(int i);

    void zzZ();

    boolean zzaA(boolean z, int i);

    boolean zzaB();

    boolean zzaC();

    boolean zzaD();

    boolean zzaE();

    void zzaa();

    void zzab(boolean z);

    void zzac();

    void zzad(String str, String str2, String str3);

    void zzae();

    void zzaf(String str, zzbpq zzbpqVar);

    void zzag();

    void zzah(com.google.android.gms.ads.internal.overlay.zzl zzlVar);

    void zzai(zzcoc zzcocVar);

    void zzaj(zzbcz zzbczVar);

    void zzak(boolean z);

    void zzal();

    void zzam(Context context);

    void zzan(boolean z);

    void zzao(zzbll zzbllVar);

    void zzap(boolean z);

    void zzaq(zzbln zzblnVar);

    void zzar(IObjectWrapper iObjectWrapper);

    void zzas(int i);

    void zzat(com.google.android.gms.ads.internal.overlay.zzl zzlVar);

    void zzau(boolean z);

    void zzav(boolean z);

    void zzaw(String str, zzbpq zzbpqVar);

    void zzax(String str, qa3 qa3Var);

    boolean zzay();

    boolean zzaz();

    @Override // com.google.android.gms.internal.ads.zzcno, com.google.android.gms.internal.ads.zzciw
    Activity zzk();

    @Override // com.google.android.gms.internal.ads.zzciw
    com.google.android.gms.ads.internal.zza zzm();

    @Override // com.google.android.gms.internal.ads.zzciw
    zzbjl zzo();

    @Override // com.google.android.gms.internal.ads.zzcnw, com.google.android.gms.internal.ads.zzciw
    zzcgt zzp();

    @Override // com.google.android.gms.internal.ads.zzciw
    zzcnj zzs();

    @Override // com.google.android.gms.internal.ads.zzciw
    void zzv(String str, zzckz zzckzVar);
}
