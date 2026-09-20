package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.Bt7j;
import defpackage.ok4;
import defpackage.pd6;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdss extends zzbmt {
    public final Context w;
    public final zzdoo x;
    public zzdpo y;
    public zzdoj z;

    public zzdss(Context context, zzdoo zzdooVar, zzdpo zzdpoVar, zzdoj zzdojVar) {
        this.w = context;
        this.x = zzdooVar;
        this.y = zzdpoVar;
        this.z = zzdojVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbmu
    public final com.google.android.gms.ads.internal.client.zzdk zze() {
        return this.x.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbmu
    public final zzbma zzf(String str) {
        return (zzbma) this.x.zzh().getOrDefault(str, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbmu
    public final IObjectWrapper zzg() {
        return new ObjectWrapper(this.w);
    }

    @Override // com.google.android.gms.internal.ads.zzbmu
    public final String zzh() {
        return this.x.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbmu
    public final String zzi(String str) {
        return (String) this.x.zzi().getOrDefault(str, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbmu
    public final List zzj() {
        zzdoo zzdooVar = this.x;
        ok4 ok4VarZzh = zzdooVar.zzh();
        ok4 ok4VarZzi = zzdooVar.zzi();
        String[] strArr = new String[ok4VarZzh.y + ok4VarZzi.y];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < ok4VarZzh.y) {
            strArr[i3] = (String) ok4VarZzh.i(i2);
            i2++;
            i3++;
        }
        while (i < ok4VarZzi.y) {
            strArr[i3] = (String) ok4VarZzi.i(i);
            i++;
            i3++;
        }
        return Arrays.asList(strArr);
    }

    @Override // com.google.android.gms.internal.ads.zzbmu
    public final void zzk() {
        zzdoj zzdojVar = this.z;
        if (zzdojVar != null) {
            zzdojVar.zzV();
        }
        this.z = null;
        this.y = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbmu
    public final void zzl() {
        String strZzA = this.x.zzA();
        if ("Google".equals(strZzA)) {
            zzcgn.zzj("Illegal argument specified for omid partner name.");
            return;
        }
        if (TextUtils.isEmpty(strZzA)) {
            zzcgn.zzj("Not starting OMID session. OM partner name has not been configured.");
            return;
        }
        zzdoj zzdojVar = this.z;
        if (zzdojVar != null) {
            zzdojVar.zzq(strZzA, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmu
    public final void zzm(String str) {
        zzdoj zzdojVar = this.z;
        if (zzdojVar != null) {
            zzdojVar.zzy(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmu
    public final void zzn() {
        zzdoj zzdojVar = this.z;
        if (zzdojVar != null) {
            zzdojVar.zzB();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmu
    public final void zzo(IObjectWrapper iObjectWrapper) {
        zzdoj zzdojVar;
        Object objM0 = ObjectWrapper.M0(iObjectWrapper);
        if (!(objM0 instanceof View) || this.x.zzu() == null || (zzdojVar = this.z) == null) {
            return;
        }
        zzdojVar.zzC((View) objM0);
    }

    @Override // com.google.android.gms.internal.ads.zzbmu
    public final boolean zzp() {
        zzdoj zzdojVar = this.z;
        if (zzdojVar != null && !zzdojVar.zzO()) {
            return false;
        }
        zzdoo zzdooVar = this.x;
        return zzdooVar.zzq() != null && zzdooVar.zzr() == null;
    }

    @Override // com.google.android.gms.internal.ads.zzbmu
    public final boolean zzq(IObjectWrapper iObjectWrapper) {
        zzdpo zzdpoVar;
        Object objM0 = ObjectWrapper.M0(iObjectWrapper);
        if (!(objM0 instanceof ViewGroup) || (zzdpoVar = this.y) == null || !zzdpoVar.zzf((ViewGroup) objM0)) {
            return false;
        }
        this.x.zzr().zzaq(new pd6(this, 6));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbmu
    public final boolean zzr() {
        zzdoo zzdooVar = this.x;
        IObjectWrapper iObjectWrapperZzu = zzdooVar.zzu();
        if (iObjectWrapperZzu == null) {
            zzcgn.zzj("Trying to start OMID session before creation.");
            return false;
        }
        com.google.android.gms.ads.internal.zzt.zzh().zzd(iObjectWrapperZzu);
        if (zzdooVar.zzq() == null) {
            return true;
        }
        zzdooVar.zzq().zzd("onSdkLoaded", new Bt7j());
        return true;
    }
}
