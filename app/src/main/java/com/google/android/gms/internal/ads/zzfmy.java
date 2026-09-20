package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import defpackage.k15;
import defpackage.kc7;
import defpackage.nu2;
import defpackage.rl6;
import defpackage.sl6;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfmy {
    public final Context a;
    public final Executor b;
    public final zzfmf c;
    public final rl6 d;
    public final sl6 e;
    public kc7 f;
    public kc7 g;

    public zzfmy(Context context, Executor executor, zzfmf zzfmfVar, zzfmh zzfmhVar, rl6 rl6Var, sl6 sl6Var) {
        this.a = context;
        this.b = executor;
        this.c = zzfmfVar;
        this.d = rl6Var;
        this.e = sl6Var;
    }

    public static zzfmy zze(Context context, Executor executor, zzfmf zzfmfVar, zzfmh zzfmhVar) {
        final zzfmy zzfmyVar = new zzfmy(context, executor, zzfmfVar, zzfmhVar, new rl6(), new sl6());
        if (zzfmhVar.zzd()) {
            kc7 kc7VarC = k15.c(new Callable() { // from class: com.google.android.gms.internal.ads.zzfms
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzfmy zzfmyVar2 = this.zza;
                    zzfmyVar2.getClass();
                    zzamh zzamhVarZza = zzamx.zza();
                    AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(zzfmyVar2.a);
                    String id = advertisingIdInfo.getId();
                    if (id != null && id.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
                        UUID uuidFromString = UUID.fromString(id);
                        byte[] bArr = new byte[16];
                        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                        byteBufferWrap.putLong(uuidFromString.getMostSignificantBits());
                        byteBufferWrap.putLong(uuidFromString.getLeastSignificantBits());
                        id = Base64.encodeToString(bArr, 11);
                    }
                    if (id != null) {
                        zzamhVarZza.zzr(id);
                        zzamhVarZza.zzq(advertisingIdInfo.isLimitAdTrackingEnabled());
                        zzamhVarZza.zzaa(6);
                    }
                    return (zzamx) zzamhVarZza.zzal();
                }
            }, executor);
            kc7VarC.d(executor, new nu2() { // from class: com.google.android.gms.internal.ads.zzfmu
                @Override // defpackage.nu2
                public final void onFailure(Exception exc) {
                    zzfmy zzfmyVar2 = this.zza;
                    zzfmyVar2.getClass();
                    if (exc instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    zzfmyVar2.c.zzc(2025, -1L, exc);
                }
            });
            zzfmyVar.f = kc7VarC;
        } else {
            zzfmyVar.f = k15.e(rl6.a);
        }
        kc7 kc7VarC2 = k15.c(new Callable() { // from class: com.google.android.gms.internal.ads.zzfmt
            @Override // java.util.concurrent.Callable
            public final Object call() throws PackageManager.NameNotFoundException {
                Context context2 = this.zza.a;
                return zzfmn.zza(context2, context2.getPackageName(), Integer.toString(context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode));
            }
        }, executor);
        kc7VarC2.d(executor, new nu2() { // from class: com.google.android.gms.internal.ads.zzfmu
            @Override // defpackage.nu2
            public final void onFailure(Exception exc) {
                zzfmy zzfmyVar2 = this.zza;
                zzfmyVar2.getClass();
                if (exc instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                zzfmyVar2.c.zzc(2025, -1L, exc);
            }
        });
        zzfmyVar.g = kc7VarC2;
        return zzfmyVar;
    }

    public final zzamx zza() {
        kc7 kc7Var = this.f;
        this.d.getClass();
        return !kc7Var.n() ? rl6.a : (zzamx) kc7Var.k();
    }

    public final zzamx zzb() {
        kc7 kc7Var = this.g;
        this.e.getClass();
        return !kc7Var.n() ? sl6.a : (zzamx) kc7Var.k();
    }
}
