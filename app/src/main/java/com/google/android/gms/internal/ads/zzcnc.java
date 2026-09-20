package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.qa3;
import defpackage.ta6;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcnc extends FrameLayout implements zzcmn {
    public final zzcmn w;
    public final zzcil x;
    public final AtomicBoolean y;

    /* JADX WARN: Multi-variable type inference failed */
    public zzcnc(zzcmn zzcmnVar) {
        super(zzcmnVar.getContext());
        this.y = new AtomicBoolean();
        this.w = zzcmnVar;
        this.x = new zzcil(zzcmnVar.zzG(), this, this);
        addView((View) zzcmnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final boolean canGoBack() {
        return this.w.canGoBack();
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void destroy() {
        final IObjectWrapper iObjectWrapperZzS = zzS();
        final zzcmn zzcmnVar = this.w;
        if (iObjectWrapperZzS == null) {
            zzcmnVar.destroy();
            return;
        }
        zzfph zzfphVar = com.google.android.gms.ads.internal.util.zzs.zza;
        zzfphVar.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcna
            @Override // java.lang.Runnable
            public final void run() {
                IObjectWrapper iObjectWrapper = iObjectWrapperZzS;
                com.google.android.gms.ads.internal.zzt.zzh();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzed)).booleanValue() && zzfjx.zzb()) {
                    Object objM0 = ObjectWrapper.M0(iObjectWrapper);
                    if (objM0 instanceof zzfjz) {
                        ((zzfjz) objM0).zzc();
                    }
                }
            }
        });
        zzcmnVar.getClass();
        zzfphVar.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnb
            @Override // java.lang.Runnable
            public final void run() {
                zzcmnVar.destroy();
            }
        }, ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzee)).intValue());
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void goBack() {
        this.w.goBack();
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void loadData(String str, String str2, String str3) {
        this.w.loadData(str, "text/html", str3);
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.w.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", null);
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void loadUrl(String str) {
        this.w.loadUrl(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzcmn zzcmnVar = this.w;
        if (zzcmnVar != null) {
            zzcmnVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void onPause() {
        this.x.zze();
        this.w.onPause();
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void onResume() {
        this.w.onResume();
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcmn
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.w.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcmn
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.w.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.w.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.w.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    public final void zzA(int i) {
        this.w.zzA(i);
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    public final void zzB(boolean z) {
        this.w.zzB(false);
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    public final void zzC(int i) {
        this.w.zzC(i);
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    public final void zzD(int i) {
        this.x.zzf(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcmn, com.google.android.gms.internal.ads.zzciw
    public final void zzE(zzcnj zzcnjVar) {
        this.w.zzE(zzcnjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcmn, com.google.android.gms.internal.ads.zzcme
    public final zzfcs zzF() {
        return this.w.zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final Context zzG() {
        return this.w.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzcmn, com.google.android.gms.internal.ads.zzcnx
    public final View zzH() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final WebView zzI() {
        return (WebView) this.w;
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final WebViewClient zzJ() {
        return this.w.zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzcmn, com.google.android.gms.internal.ads.zzcnv
    public final zzapb zzK() {
        return this.w.zzK();
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final zzbcz zzL() {
        return this.w.zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final zzbln zzM() {
        return this.w.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final com.google.android.gms.ads.internal.overlay.zzl zzN() {
        return this.w.zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final com.google.android.gms.ads.internal.overlay.zzl zzO() {
        return this.w.zzO();
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final zzcoa zzP() {
        return ((ta6) this.w).I;
    }

    @Override // com.google.android.gms.internal.ads.zzcmn, com.google.android.gms.internal.ads.zzcnu
    public final zzcoc zzQ() {
        return this.w.zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzcmn, com.google.android.gms.internal.ads.zzcnk
    public final zzfcv zzR() {
        return this.w.zzR();
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final IObjectWrapper zzS() {
        return this.w.zzS();
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final zzfyx zzT() {
        return this.w.zzT();
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final String zzU() {
        return this.w.zzU();
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void zzV(zzfcs zzfcsVar, zzfcv zzfcvVar) {
        this.w.zzV(zzfcsVar, zzfcvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void zzW() {
        this.x.zzd();
        this.w.zzW();
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void zzX() {
        this.w.zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void zzY(int i) {
        this.w.zzY(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void zzZ() {
        this.w.zzZ();
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final void zza(String str) {
        ((ta6) this.w).b(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzcmn
    public final boolean zzaA(boolean z, int i) {
        if (!this.y.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzaF)).booleanValue()) {
            return false;
        }
        zzcmn zzcmnVar = this.w;
        if (zzcmnVar.getParent() instanceof ViewGroup) {
            ((ViewGroup) zzcmnVar.getParent()).removeView((View) zzcmnVar);
        }
        zzcmnVar.zzaA(z, i);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final boolean zzaB() {
        return this.w.zzaB();
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final boolean zzaC() {
        return this.w.zzaC();
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final boolean zzaD() {
        return this.y.get();
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final boolean zzaE() {
        return this.w.zzaE();
    }

    @Override // com.google.android.gms.internal.ads.zzcns
    public final void zzaF(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z) {
        this.w.zzaF(zzcVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzcns
    public final void zzaG(zzbr zzbrVar, zzefz zzefzVar, zzdxo zzdxoVar, zzfhz zzfhzVar, String str, String str2, int i) {
        this.w.zzaG(zzbrVar, zzefzVar, zzdxoVar, zzfhzVar, str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.zzcns
    public final void zzaH(boolean z, int i, boolean z2) {
        this.w.zzaH(z, i, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcns
    public final void zzaI(boolean z, int i, String str, boolean z2) {
        this.w.zzaI(z, i, str, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcns
    public final void zzaJ(boolean z, int i, String str, String str2, boolean z2) {
        this.w.zzaJ(z, i, str, str2, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void zzaa() {
        HashMap map = new HashMap(3);
        map.put("app_muted", String.valueOf(com.google.android.gms.ads.internal.zzt.zzs().zze()));
        map.put("app_volume", String.valueOf(com.google.android.gms.ads.internal.zzt.zzs().zza()));
        ta6 ta6Var = (ta6) this.w;
        map.put("device_volume", String.valueOf(com.google.android.gms.ads.internal.util.zzab.zzb(ta6Var.getContext())));
        ta6Var.zzd("volume", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void zzab(boolean z) {
        this.w.zzab(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void zzac() {
        this.w.zzac();
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void zzad(String str, String str2, String str3) {
        this.w.zzad(str, str2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void zzae() {
        this.w.zzae();
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void zzaf(String str, zzbpq zzbpqVar) {
        this.w.zzaf(str, zzbpqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void zzag() {
        TextView textView = new TextView(getContext());
        com.google.android.gms.ads.internal.zzt.zzq();
        textView.setText(com.google.android.gms.ads.internal.util.zzs.zzv());
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void zzah(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.w.zzah(zzlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void zzai(zzcoc zzcocVar) {
        this.w.zzai(zzcocVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void zzaj(zzbcz zzbczVar) {
        this.w.zzaj(zzbczVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void zzak(boolean z) {
        this.w.zzak(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void zzal() {
        setBackgroundColor(0);
        this.w.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void zzam(Context context) {
        this.w.zzam(context);
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void zzan(boolean z) {
        this.w.zzan(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void zzao(zzbll zzbllVar) {
        this.w.zzao(zzbllVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void zzap(boolean z) {
        this.w.zzap(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void zzaq(zzbln zzblnVar) {
        this.w.zzaq(zzblnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void zzar(IObjectWrapper iObjectWrapper) {
        this.w.zzar(iObjectWrapper);
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void zzas(int i) {
        this.w.zzas(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void zzat(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.w.zzat(zzlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void zzau(boolean z) {
        this.w.zzau(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void zzav(boolean z) {
        this.w.zzav(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void zzaw(String str, zzbpq zzbpqVar) {
        this.w.zzaw(str, zzbpqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void zzax(String str, qa3 qa3Var) {
        this.w.zzax(str, qa3Var);
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final boolean zzay() {
        return this.w.zzay();
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final boolean zzaz() {
        return this.w.zzaz();
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final void zzb(String str, String str2) {
        this.w.zzb("window.inspectorInfo", str2);
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final void zzbn() {
        this.w.zzbn();
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final void zzbo() {
        this.w.zzbo();
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    public final zzcil zzbp() {
        return this.x;
    }

    @Override // com.google.android.gms.internal.ads.zzbbm
    public final void zzc(zzbbl zzbblVar) {
        this.w.zzc(zzbblVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbsi
    public final void zzd(String str, Map map) {
        this.w.zzd(str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbsi
    public final void zze(String str, JSONObject jSONObject) {
        this.w.zze(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    public final int zzf() {
        return this.w.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    public final int zzg() {
        return this.w.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    public final int zzh() {
        return this.w.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    public final int zzi() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzcV)).booleanValue() ? this.w.getMeasuredHeight() : getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    public final int zzj() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzcV)).booleanValue() ? this.w.getMeasuredWidth() : getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzcmn, com.google.android.gms.internal.ads.zzcno, com.google.android.gms.internal.ads.zzciw
    public final Activity zzk() {
        return this.w.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final void zzl(String str, JSONObject jSONObject) {
        ((ta6) this.w).zzb(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcmn, com.google.android.gms.internal.ads.zzciw
    public final com.google.android.gms.ads.internal.zza zzm() {
        return this.w.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    public final zzbjk zzn() {
        return this.w.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzcmn, com.google.android.gms.internal.ads.zzciw
    public final zzbjl zzo() {
        return this.w.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzcmn, com.google.android.gms.internal.ads.zzcnw, com.google.android.gms.internal.ads.zzciw
    public final zzcgt zzp() {
        return this.w.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzdkl
    public final void zzq() {
        zzcmn zzcmnVar = this.w;
        if (zzcmnVar != null) {
            zzcmnVar.zzq();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    public final zzckz zzr(String str) {
        return this.w.zzr(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcmn, com.google.android.gms.internal.ads.zzciw
    public final zzcnj zzs() {
        return this.w.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    public final String zzt() {
        return this.w.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    public final String zzu() {
        return this.w.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzcmn, com.google.android.gms.internal.ads.zzciw
    public final void zzv(String str, zzckz zzckzVar) {
        this.w.zzv(str, zzckzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    public final void zzw() {
        this.w.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    public final void zzx(boolean z, long j) {
        this.w.zzx(z, j);
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    public final void zzy() {
        this.w.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    public final void zzz(int i) {
        this.w.zzz(i);
    }
}
