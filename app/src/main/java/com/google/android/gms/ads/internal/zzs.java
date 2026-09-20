package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbf;
import com.google.android.gms.ads.internal.client.zzbi;
import com.google.android.gms.ads.internal.client.zzbr;
import com.google.android.gms.ads.internal.client.zzbw;
import com.google.android.gms.ads.internal.client.zzbz;
import com.google.android.gms.ads.internal.client.zzcd;
import com.google.android.gms.ads.internal.client.zzcg;
import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.client.zzdo;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzapb;
import com.google.android.gms.internal.ads.zzbdi;
import com.google.android.gms.internal.ads.zzbjt;
import com.google.android.gms.internal.ads.zzbkc;
import com.google.android.gms.internal.ads.zzbzj;
import com.google.android.gms.internal.ads.zzbzm;
import com.google.android.gms.internal.ads.zzcbw;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzcgt;
import com.google.android.gms.internal.ads.zzcha;
import com.google.android.gms.internal.ads.zzeuk;
import com.google.android.gms.internal.ads.zzfyx;
import defpackage.e47;
import defpackage.fc2;
import defpackage.ha7;
import defpackage.o57;
import defpackage.oa3;
import defpackage.r67;
import defpackage.r97;
import java.util.Iterator;
import java.util.TreeMap;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
@ParametersAreNonnullByDefault
public final class zzs extends zzbr {
    public final ha7 A;
    public WebView B;
    public zzbf C;
    public zzapb D;
    public AsyncTask E;
    public final zzcgt w;
    public final zzq x;
    public final zzfyx y = zzcha.zza.zzb(new r67(this, 0));
    public final Context z;

    public zzs(Context context, zzq zzqVar, String str, zzcgt zzcgtVar) {
        this.z = context;
        this.w = zzcgtVar;
        this.x = zzqVar;
        this.B = new WebView(context);
        this.A = new ha7(context, str);
        L0(0);
        this.B.setVerticalScrollBarEnabled(false);
        this.B.getSettings().setJavaScriptEnabled(true);
        this.B.setWebViewClient(new e47(this));
        this.B.setOnTouchListener(new o57(this));
    }

    public final void L0(int i) {
        if (this.B == null) {
            return;
        }
        this.B.setLayoutParams(new ViewGroup.LayoutParams(-1, i));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzA() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzB() {
        oa3.d("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzC(zzbc zzbcVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzD(zzbf zzbfVar) {
        this.C = zzbfVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzE(zzbw zzbwVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzF(zzq zzqVar) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzG(zzbz zzbzVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzH(zzbdi zzbdiVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzI(zzw zzwVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzJ(zzcg zzcgVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzK(zzdo zzdoVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzL(boolean z) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzM(zzbzj zzbzjVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzN(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzO(zzbjt zzbjtVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzP(zzde zzdeVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzQ(zzbzm zzbzmVar, String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzR(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzS(zzcbw zzcbwVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzT(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzU(zzff zzffVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzW(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzX() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final boolean zzY() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final boolean zzZ() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final boolean zzaa(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        TreeMap treeMap;
        oa3.i(this.B, "This Search Ad has already been torn down");
        ha7 ha7Var = this.A;
        ha7Var.getClass();
        ha7Var.d = zzlVar.zzj.zza;
        Bundle bundle = zzlVar.zzm;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 != null) {
            String str = (String) zzbkc.zzc.zze();
            Iterator<String> it = bundle2.keySet().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                treeMap = ha7Var.c;
                if (!zHasNext) {
                    break;
                }
                String next = it.next();
                if (str.equals(next)) {
                    ha7Var.e = bundle2.getString(next);
                } else if (next.startsWith("csa_")) {
                    treeMap.put(next.substring(4), bundle2.getString(next));
                }
            }
            treeMap.put("SDKVersion", this.w.zza);
            if (((Boolean) zzbkc.zza.zze()).booleanValue()) {
                try {
                    Bundle bundleZzc = zzeuk.zzc(ha7Var.a, new JSONArray((String) zzbkc.zzb.zze()));
                    for (String str2 : bundleZzc.keySet()) {
                        treeMap.put(str2, bundleZzc.get(str2).toString());
                    }
                } catch (JSONException e) {
                    zzcgn.zzh("Flag gads:afs:csa_tcf_data_to_collect not a valid JSON array", e);
                }
            }
        }
        this.E = new r97(this).execute(new Void[0]);
        return true;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzab(zzcd zzcdVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final Bundle zzd() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final zzq zzg() {
        return this.x;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final zzbf zzi() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final zzbz zzj() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final zzdh zzk() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final zzdk zzl() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final IObjectWrapper zzn() {
        oa3.d("getAdFrame must be called on the main UI thread.");
        return new ObjectWrapper(this.B);
    }

    public final String zzq() {
        String str = this.A.e;
        if (true == TextUtils.isEmpty(str)) {
            str = "www.google.com";
        }
        return fc2.a("https://", str, (String) zzbkc.zzd.zze());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final String zzr() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final String zzs() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final String zzt() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzx() {
        oa3.d("destroy must be called on the main UI thread.");
        this.E.cancel(true);
        this.y.cancel(true);
        this.B.destroy();
        this.B = null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzy(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbi zzbiVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzz() {
        oa3.d("pause must be called on the main UI thread.");
    }
}
