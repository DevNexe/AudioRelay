package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import defpackage.ok4;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdoo {
    public int a;
    public com.google.android.gms.ads.internal.client.zzdk b;
    public zzbls c;
    public View d;
    public List e;
    public com.google.android.gms.ads.internal.client.zzef g;
    public Bundle h;
    public zzcmn i;
    public zzcmn j;
    public zzcmn k;
    public IObjectWrapper l;
    public View m;
    public View n;
    public IObjectWrapper o;
    public double p;
    public zzbma q;
    public zzbma r;
    public String s;
    public float v;
    public String w;
    public final ok4 t = new ok4();
    public final ok4 u = new ok4();
    public List f = Collections.emptyList();

    public static zzdoo a(zzdon zzdonVar, zzbls zzblsVar, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, IObjectWrapper iObjectWrapper, String str4, String str5, double d, zzbma zzbmaVar, String str6, float f) {
        zzdoo zzdooVar = new zzdoo();
        zzdooVar.a = 6;
        zzdooVar.b = zzdonVar;
        zzdooVar.c = zzblsVar;
        zzdooVar.d = view;
        zzdooVar.zzU("headline", str);
        zzdooVar.e = list;
        zzdooVar.zzU("body", str2);
        zzdooVar.h = bundle;
        zzdooVar.zzU("call_to_action", str3);
        zzdooVar.m = view2;
        zzdooVar.o = iObjectWrapper;
        zzdooVar.zzU("store", str4);
        zzdooVar.zzU(InAppPurchaseMetaData.KEY_PRICE, str5);
        zzdooVar.p = d;
        zzdooVar.q = zzbmaVar;
        zzdooVar.zzU("advertiser", str6);
        zzdooVar.zzP(f);
        return zzdooVar;
    }

    public static Object b(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return null;
        }
        return ObjectWrapper.M0(iObjectWrapper);
    }

    public static zzdoo zzab(zzbvq zzbvqVar) {
        try {
            com.google.android.gms.ads.internal.client.zzdk zzdkVarZzg = zzbvqVar.zzg();
            zzdon zzdonVar = zzdkVarZzg == null ? null : new zzdon(zzdkVarZzg, null);
            zzbls zzblsVarZzh = zzbvqVar.zzh();
            View view = (View) b(zzbvqVar.zzj());
            String strZzo = zzbvqVar.zzo();
            List listZzr = zzbvqVar.zzr();
            String strZzm = zzbvqVar.zzm();
            Bundle bundleZzf = zzbvqVar.zzf();
            String strZzn = zzbvqVar.zzn();
            View view2 = (View) b(zzbvqVar.zzk());
            IObjectWrapper iObjectWrapperZzl = zzbvqVar.zzl();
            String strZzq = zzbvqVar.zzq();
            String strZzp = zzbvqVar.zzp();
            double dZze = zzbvqVar.zze();
            zzbma zzbmaVarZzi = zzbvqVar.zzi();
            zzdoo zzdooVar = new zzdoo();
            zzdooVar.a = 2;
            zzdooVar.b = zzdonVar;
            zzdooVar.c = zzblsVarZzh;
            zzdooVar.d = view;
            zzdooVar.zzU("headline", strZzo);
            zzdooVar.e = listZzr;
            zzdooVar.zzU("body", strZzm);
            zzdooVar.h = bundleZzf;
            zzdooVar.zzU("call_to_action", strZzn);
            zzdooVar.m = view2;
            zzdooVar.o = iObjectWrapperZzl;
            zzdooVar.zzU("store", strZzq);
            zzdooVar.zzU(InAppPurchaseMetaData.KEY_PRICE, strZzp);
            zzdooVar.p = dZze;
            zzdooVar.q = zzbmaVarZzi;
            return zzdooVar;
        } catch (RemoteException e) {
            zzcgn.zzk("Failed to get native ad from app install ad mapper", e);
            return null;
        }
    }

    public static zzdoo zzac(zzbvr zzbvrVar) {
        try {
            com.google.android.gms.ads.internal.client.zzdk zzdkVarZzf = zzbvrVar.zzf();
            zzdon zzdonVar = zzdkVarZzf == null ? null : new zzdon(zzdkVarZzf, null);
            zzbls zzblsVarZzg = zzbvrVar.zzg();
            View view = (View) b(zzbvrVar.zzi());
            String strZzo = zzbvrVar.zzo();
            List listZzp = zzbvrVar.zzp();
            String strZzm = zzbvrVar.zzm();
            Bundle bundleZze = zzbvrVar.zze();
            String strZzn = zzbvrVar.zzn();
            View view2 = (View) b(zzbvrVar.zzj());
            IObjectWrapper iObjectWrapperZzk = zzbvrVar.zzk();
            String strZzl = zzbvrVar.zzl();
            zzbma zzbmaVarZzh = zzbvrVar.zzh();
            zzdoo zzdooVar = new zzdoo();
            zzdooVar.a = 1;
            zzdooVar.b = zzdonVar;
            zzdooVar.c = zzblsVarZzg;
            zzdooVar.d = view;
            zzdooVar.zzU("headline", strZzo);
            zzdooVar.e = listZzp;
            zzdooVar.zzU("body", strZzm);
            zzdooVar.h = bundleZze;
            zzdooVar.zzU("call_to_action", strZzn);
            zzdooVar.m = view2;
            zzdooVar.o = iObjectWrapperZzk;
            zzdooVar.zzU("advertiser", strZzl);
            zzdooVar.r = zzbmaVarZzh;
            return zzdooVar;
        } catch (RemoteException e) {
            zzcgn.zzk("Failed to get native ad from content ad mapper", e);
            return null;
        }
    }

    public static zzdoo zzad(zzbvq zzbvqVar) {
        try {
            com.google.android.gms.ads.internal.client.zzdk zzdkVarZzg = zzbvqVar.zzg();
            return a(zzdkVarZzg == null ? null : new zzdon(zzdkVarZzg, null), zzbvqVar.zzh(), (View) b(zzbvqVar.zzj()), zzbvqVar.zzo(), zzbvqVar.zzr(), zzbvqVar.zzm(), zzbvqVar.zzf(), zzbvqVar.zzn(), (View) b(zzbvqVar.zzk()), zzbvqVar.zzl(), zzbvqVar.zzq(), zzbvqVar.zzp(), zzbvqVar.zze(), zzbvqVar.zzi(), null, 0.0f);
        } catch (RemoteException e) {
            zzcgn.zzk("Failed to get native ad assets from app install ad mapper", e);
            return null;
        }
    }

    public static zzdoo zzae(zzbvr zzbvrVar) {
        try {
            com.google.android.gms.ads.internal.client.zzdk zzdkVarZzf = zzbvrVar.zzf();
            return a(zzdkVarZzf == null ? null : new zzdon(zzdkVarZzf, null), zzbvrVar.zzg(), (View) b(zzbvrVar.zzi()), zzbvrVar.zzo(), zzbvrVar.zzp(), zzbvrVar.zzm(), zzbvrVar.zze(), zzbvrVar.zzn(), (View) b(zzbvrVar.zzj()), zzbvrVar.zzk(), null, null, -1.0d, zzbvrVar.zzh(), zzbvrVar.zzl(), 0.0f);
        } catch (RemoteException e) {
            zzcgn.zzk("Failed to get native ad assets from content ad mapper", e);
            return null;
        }
    }

    public static zzdoo zzs(zzbvu zzbvuVar) {
        try {
            com.google.android.gms.ads.internal.client.zzdk zzdkVarZzj = zzbvuVar.zzj();
            return a(zzdkVarZzj == null ? null : new zzdon(zzdkVarZzj, zzbvuVar), zzbvuVar.zzk(), (View) b(zzbvuVar.zzm()), zzbvuVar.zzs(), zzbvuVar.zzv(), zzbvuVar.zzq(), zzbvuVar.zzi(), zzbvuVar.zzr(), (View) b(zzbvuVar.zzn()), zzbvuVar.zzo(), zzbvuVar.zzu(), zzbvuVar.zzt(), zzbvuVar.zze(), zzbvuVar.zzl(), zzbvuVar.zzp(), zzbvuVar.zzf());
        } catch (RemoteException e) {
            zzcgn.zzk("Failed to get native ad assets from unified ad mapper", e);
            return null;
        }
    }

    public final synchronized String zzA() {
        return this.w;
    }

    public final synchronized String zzB() {
        return zzD(InAppPurchaseMetaData.KEY_PRICE);
    }

    public final synchronized String zzC() {
        return zzD("store");
    }

    public final synchronized String zzD(String str) {
        return (String) this.u.getOrDefault(str, null);
    }

    public final synchronized List zzE() {
        return this.e;
    }

    public final synchronized List zzF() {
        return this.f;
    }

    public final synchronized void zzG() {
        zzcmn zzcmnVar = this.i;
        if (zzcmnVar != null) {
            zzcmnVar.destroy();
            this.i = null;
        }
        zzcmn zzcmnVar2 = this.j;
        if (zzcmnVar2 != null) {
            zzcmnVar2.destroy();
            this.j = null;
        }
        zzcmn zzcmnVar3 = this.k;
        if (zzcmnVar3 != null) {
            zzcmnVar3.destroy();
            this.k = null;
        }
        this.l = null;
        this.t.clear();
        this.u.clear();
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.h = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.q = null;
        this.r = null;
        this.s = null;
    }

    public final synchronized void zzH(zzbls zzblsVar) {
        this.c = zzblsVar;
    }

    public final synchronized void zzI(String str) {
        this.s = str;
    }

    public final synchronized void zzJ(com.google.android.gms.ads.internal.client.zzef zzefVar) {
        this.g = zzefVar;
    }

    public final synchronized void zzK(zzbma zzbmaVar) {
        this.q = zzbmaVar;
    }

    public final synchronized void zzL(String str, zzblm zzblmVar) {
        try {
            if (zzblmVar == null) {
                this.t.remove(str);
            } else {
                this.t.put(str, zzblmVar);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzM(zzcmn zzcmnVar) {
        this.j = zzcmnVar;
    }

    public final synchronized void zzN(List list) {
        this.e = list;
    }

    public final synchronized void zzO(zzbma zzbmaVar) {
        this.r = zzbmaVar;
    }

    public final synchronized void zzP(float f) {
        this.v = f;
    }

    public final synchronized void zzQ(List list) {
        this.f = list;
    }

    public final synchronized void zzR(zzcmn zzcmnVar) {
        this.k = zzcmnVar;
    }

    public final synchronized void zzS(String str) {
        this.w = str;
    }

    public final synchronized void zzT(double d) {
        this.p = d;
    }

    public final synchronized void zzU(String str, String str2) {
        try {
            if (str2 == null) {
                this.u.remove(str);
            } else {
                this.u.put(str, str2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzV(int i) {
        this.a = i;
    }

    public final synchronized void zzW(com.google.android.gms.ads.internal.client.zzdk zzdkVar) {
        this.b = zzdkVar;
    }

    public final synchronized void zzX(View view) {
        this.m = view;
    }

    public final synchronized void zzY(zzcmn zzcmnVar) {
        this.i = zzcmnVar;
    }

    public final synchronized void zzZ(View view) {
        this.n = view;
    }

    public final synchronized double zza() {
        return this.p;
    }

    public final synchronized void zzaa(IObjectWrapper iObjectWrapper) {
        this.l = iObjectWrapper;
    }

    public final synchronized float zzb() {
        return this.v;
    }

    public final synchronized int zzc() {
        return this.a;
    }

    public final synchronized Bundle zzd() {
        if (this.h == null) {
            this.h = new Bundle();
        }
        return this.h;
    }

    public final synchronized View zze() {
        return this.d;
    }

    public final synchronized View zzf() {
        return this.m;
    }

    public final synchronized View zzg() {
        return this.n;
    }

    public final synchronized ok4 zzh() {
        return this.t;
    }

    public final synchronized ok4 zzi() {
        return this.u;
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzdk zzj() {
        return this.b;
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzef zzk() {
        return this.g;
    }

    public final synchronized zzbls zzl() {
        return this.c;
    }

    public final zzbma zzm() {
        List list = this.e;
        if (list != null && !list.isEmpty()) {
            Object obj = this.e.get(0);
            if (obj instanceof IBinder) {
                return zzblz.zzg((IBinder) obj);
            }
        }
        return null;
    }

    public final synchronized zzbma zzn() {
        return this.q;
    }

    public final synchronized zzbma zzo() {
        return this.r;
    }

    public final synchronized zzcmn zzp() {
        return this.j;
    }

    public final synchronized zzcmn zzq() {
        return this.k;
    }

    public final synchronized zzcmn zzr() {
        return this.i;
    }

    public final synchronized IObjectWrapper zzt() {
        return this.o;
    }

    public final synchronized IObjectWrapper zzu() {
        return this.l;
    }

    public final synchronized String zzv() {
        return zzD("advertiser");
    }

    public final synchronized String zzw() {
        return zzD("body");
    }

    public final synchronized String zzx() {
        return zzD("call_to_action");
    }

    public final synchronized String zzy() {
        return this.s;
    }

    public final synchronized String zzz() {
        return zzD("headline");
    }
}
