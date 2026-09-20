package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import defpackage.im6;
import defpackage.z05;

/* JADX INFO: loaded from: classes3.dex */
public final class CQf extends zzfqw {
    public final /* synthetic */ im6 A;
    public final /* synthetic */ zzfqk x;
    public final /* synthetic */ zzfqn y;
    public final /* synthetic */ z05 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CQf(im6 im6Var, z05 z05Var, zzfqk zzfqkVar, zzfqn zzfqnVar, z05 z05Var2) {
        super(z05Var);
        this.A = im6Var;
        this.x = zzfqkVar;
        this.y = zzfqnVar;
        this.z = z05Var2;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [android.os.IInterface, com.google.android.gms.internal.ads.zzfqs] */
    @Override // com.google.android.gms.internal.ads.zzfqw
    public final void a() {
        im6 im6Var = this.A;
        try {
            ?? Zze = im6Var.a.zze();
            String str = im6Var.b;
            zzfqk zzfqkVar = this.x;
            Bundle bundle = new Bundle();
            bundle.putBinder("windowToken", zzfqkVar.zze());
            bundle.putString("adFieldEnifd", zzfqkVar.zzf());
            bundle.putInt("layoutGravity", zzfqkVar.zzc());
            bundle.putFloat("layoutVerticalMargin", zzfqkVar.zza());
            bundle.putInt("displayMode", 0);
            bundle.putInt("windowWidthPx", zzfqkVar.zzd());
            bundle.putBoolean("stableSessionToken", false);
            bundle.putString("callerPackage", str);
            if (zzfqkVar.zzg() != null) {
                bundle.putString("appId", zzfqkVar.zzg());
            }
            Zze.zzf(str, bundle, new zzfqh(im6Var, this.y));
        } catch (RemoteException e) {
            im6.c.zzc(e, "show overlay display from: %s", im6Var.b);
            this.z.b(new RuntimeException(e));
        }
    }
}
