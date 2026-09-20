package com.google.android.gms.internal.ads;

import android.os.Bundle;
import defpackage.im6;

/* JADX INFO: loaded from: classes3.dex */
final class zzfqh extends zzfqt {
    public final zzfqn w;
    public final /* synthetic */ im6 x;

    public zzfqh(im6 im6Var, zzfqn zzfqnVar) {
        this.x = im6Var;
        this.w = zzfqnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfqu
    public final void zzb(Bundle bundle) {
        zzfrg zzfrgVar;
        int i = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        zzfql zzfqlVarZzc = zzfqm.zzc();
        zzfqlVarZzc.zzb(i);
        if (string != null) {
            zzfqlVarZzc.zza(string);
        }
        this.w.zza(zzfqlVarZzc.zzc());
        if (i != 8157 || (zzfrgVar = this.x.a) == null) {
            return;
        }
        im6.c.zzd("unbind LMD display overlay service", new Object[0]);
        zzfrgVar.zzr();
    }
}
