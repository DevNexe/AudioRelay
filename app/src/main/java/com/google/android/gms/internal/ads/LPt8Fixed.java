package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import defpackage.im6;
import defpackage.z05;

/* JADX INFO: loaded from: classes3.dex */
public final class LPt8Fixed extends zzfqw {
    public final /* synthetic */ z05 A;
    public final /* synthetic */ im6 B;
    public final /* synthetic */ zzfqp x;
    public final /* synthetic */ int y;
    public final /* synthetic */ zzfqn z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LPt8Fixed(im6 im6Var, z05 z05Var, zzfqp zzfqpVar, int i, zzfqn zzfqnVar, z05 z05Var2) {
        super(z05Var);
        this.B = im6Var;
        this.x = zzfqpVar;
        this.y = i;
        this.z = zzfqnVar;
        this.A = z05Var2;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [android.os.IInterface, com.google.android.gms.internal.ads.zzfqs] */
    @Override // com.google.android.gms.internal.ads.zzfqw
    public final void a() {
        int i = this.y;
        im6 im6Var = this.B;
        try {
            ?? Zze = im6Var.a.zze();
            zzfqp zzfqpVar = this.x;
            String str = im6Var.b;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", zzfqpVar.zzb());
            bundle.putInt("displayMode", i);
            bundle.putString("callerPackage", str);
            bundle.putString("appId", zzfqpVar.zza());
            Zze.zzg(bundle, new zzfqh(im6Var, this.z));
        } catch (RemoteException e) {
            im6.c.zzc(e, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(i), im6Var.b);
            this.A.b(new RuntimeException(e));
        }
    }
}
