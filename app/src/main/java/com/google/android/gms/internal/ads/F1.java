package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import defpackage.im6;
import defpackage.z05;

/* JADX INFO: loaded from: classes3.dex */
public final class F1 extends zzfqw {
    public final /* synthetic */ im6 A;
    public final /* synthetic */ zzfpz x;
    public final /* synthetic */ zzfqn y;
    public final /* synthetic */ z05 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F1(im6 im6Var, z05 z05Var, zzfpz zzfpzVar, zzfqn zzfqnVar, z05 z05Var2) {
        super(z05Var);
        this.A = im6Var;
        this.x = zzfpzVar;
        this.y = zzfqnVar;
        this.z = z05Var2;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [android.os.IInterface, com.google.android.gms.internal.ads.zzfqs] */
    @Override // com.google.android.gms.internal.ads.zzfqw
    public final void a() {
        im6 im6Var = this.A;
        try {
            ?? Zze = im6Var.a.zze();
            zzfpz zzfpzVar = this.x;
            String str = im6Var.b;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", zzfpzVar.zzb());
            bundle.putString("callerPackage", str);
            bundle.putString("appId", zzfpzVar.zza());
            Zze.zze(bundle, new zzfqh(im6Var, this.y));
        } catch (RemoteException e) {
            im6.c.zzc(e, "dismiss overlay display from: %s", im6Var.b);
            this.z.b(new RuntimeException(e));
        }
    }
}
